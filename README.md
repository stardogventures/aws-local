# aws-local

Local S3 implementation and fileserver for Java 9+

This module provides a highly incomplete implementation of `AmazonS3`
which loads and stores files in a folder in the local filesystem.

Also includes a JAX-RS resource for serving files from the S3
implementation, suitable for Dropwizard etc.

Do not use this in production! This is purely for local development
purposes where you don't want to have to rely on a real S3 bucket.

### Installation

Add the following to your POM:

```
  <dependency>
    <groupId>io.stardog.aws.local</groupId>
    <artifactId>aws-local</artifactId>
    <version>0.1.0</version>
  </dependency>
```

### Usage

Swap in the implementation of `AmazonS3Local` whereever you would
normally use an `AmazonS3Client`:

```java
if (config.getS3LocalPath() != null) {
    bind(AmazonS3.class).toInstance(new AmazonS3Local(new File("/tmp/s3-local));
} else {
    bind(AmazonS3.class).toInstance(AmazonS3Client.builder()
            .withRegion("us-east-1")
            .build());
}
```

### Local fileserver

If you want to serve files from your local S3, add the `S3ServeResource`.
Be sure not to use this in production.

Dropwizard example:

```java
if ("local".equals(config.getEnv())) {
    env.jersey().register(new S3ServeResource(s3, "media-bucket-name"));
}
```