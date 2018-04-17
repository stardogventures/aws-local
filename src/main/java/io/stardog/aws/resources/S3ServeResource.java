package io.stardog.aws.resources;

import com.amazonaws.services.kms.model.NotFoundException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.S3Object;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Singleton
@Path("/s3")
public class S3ServeResource {
    private final AmazonS3 s3;
    private final String s3Bucket;

    @Inject
    public S3ServeResource(AmazonS3 s3, @Named("s3BucketServe") String s3Bucket) {
        this.s3 = s3;
        this.s3Bucket = s3Bucket;
    }

    @GET
    @Path("/{path:.*}")
    public Response getObject(@PathParam("path") String path) {
        if (!s3.doesObjectExist(s3Bucket, path)) {
            throw new NotFoundException("Not found: " + path);
        }

        S3Object media = s3.getObject(s3Bucket, path);
        return Response.ok(media.getObjectContent()).type(media.getObjectMetadata().getContentType()).build();
    }
}
