package io.stardog.aws.resources;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Singleton
@Path("/s3")
public class S3ServeResource {
    private final AmazonS3 s3;
    private final String s3Bucket;
    private final AmazonS3 s3Fallback;
    private final String s3BucketFallback;

    @Inject
    public S3ServeResource(AmazonS3 s3,
                           @Named("s3BucketServe") String s3Bucket,
                           @Named("s3Fallback") AmazonS3 s3Fallback,
                           @Named("s3BucketFallback") String s3BucketFallback) {
        this.s3 = s3;
        this.s3Bucket = s3Bucket;
        this.s3Fallback = s3Fallback;
        this.s3BucketFallback = s3BucketFallback;
    }

    public S3ServeResource(AmazonS3 s3, @Named("s3BucketServe") String s3Bucket) {
        this(s3, s3Bucket, null, null);
    }

    @GET
    @Path("/{path:.*}")
    public Response getObject(@PathParam("path") String path) {
        S3Object media = null;

        if (s3.doesObjectExist(s3Bucket, path)) {
            media = s3.getObject(s3Bucket, path);
        } else if (s3Fallback != null && s3Fallback.doesObjectExist(s3BucketFallback, path)) {
            media = s3Fallback.getObject(s3BucketFallback, path);
            s3.putObject(new PutObjectRequest(s3Bucket, path, media.getObjectContent(), media.getObjectMetadata()));
            media = s3.getObject(s3Bucket, path);
        }

        if (media == null) {
            throw new NotFoundException("Not found: " + path);
        }

        return Response.ok(media.getObjectContent()).type(media.getObjectMetadata().getContentType()).build();
    }
}
