package io.stardog.aws.s3;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.util.StringInputStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.StringReader;
import java.util.Random;
import java.util.Scanner;

import static org.junit.Assert.*;

public class AmazonS3LocalTest {
    private AmazonS3Local s3;
    private File basePath;

    @Before
    public void setUp() throws Exception {
        Random random = new Random();
        basePath = new File(System.getProperty("java.io.tmpdir") + "/s3-local/" + random.nextInt());
        basePath.mkdirs();
        s3 = new AmazonS3Local(basePath);
    }

    @Test
    public void putObject() throws Exception {
        PutObjectRequest putRequest = new PutObjectRequest(
                "test-bucket", "path/test.txt",
                new StringInputStream("test-string-file"), new ObjectMetadata());
        s3.putObject(putRequest);

        S3Object object = s3.getObject("test-bucket", "path/test.txt");
        assertEquals("text/plain", object.getObjectMetadata().getContentType());
        Scanner scanner = new Scanner(object.getObjectContent()).useDelimiter("\\A");
        assertEquals("test-string-file", scanner.next());

        assertTrue(s3.doesObjectExist("test-bucket", "path/test.txt"));
        assertFalse(s3.doesObjectExist("test-bucket", "path/missing.txt"));
    }

    @Test
    public void getObject() {
        try {
            s3.getObject("test-bucket", "path/nonexistent");
            fail("Expected SdkClientException for path not found");
        } catch (SdkClientException e) {
            // expected
        }
    }

    @After
    public void tearDown() throws Exception {
        basePath.delete();
    }
}