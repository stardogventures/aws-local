package io.stardog.aws.resources;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.util.StringInputStream;
import io.stardog.aws.s3.AmazonS3Local;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.core.Response;
import java.io.File;
import java.nio.file.Files;
import java.util.Random;

import static org.junit.Assert.*;

public class S3ServeResourceTest {
    private S3ServeResource resource;
    private AmazonS3 s3;
    private File basePath;

    @Before
    public void setUp() throws Exception {
        Random random = new Random();
        basePath = new File(System.getProperty("java.io.tmpdir") + "/s3-local/" + random.nextInt());
        basePath.mkdirs();
        s3 = new AmazonS3Local(basePath);
        resource = new S3ServeResource(s3, "media-bucket");
    }

    @After
    public void tearDown() throws Exception {
        s3.deleteBucket("media-bucket");
        Files.delete(basePath.toPath());
    }

    @Test
    public void getObject() throws Exception {
        PutObjectRequest putRequest = new PutObjectRequest(
                "media-bucket", "path/test.txt",
                new StringInputStream("test-string-file"), new ObjectMetadata());
        s3.putObject(putRequest);

        Response response = resource.getObject("path/test.txt");
        assertEquals(200, response.getStatus());
        assertEquals("text/plain", response.getMediaType().toString());
    }
}