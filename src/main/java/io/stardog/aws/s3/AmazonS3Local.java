package io.stardog.aws.s3;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.HttpMethod;
import com.amazonaws.SdkClientException;
import com.amazonaws.regions.Region;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.S3ResponseMetadata;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import com.amazonaws.services.s3.waiters.AmazonS3Waiters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class AmazonS3Local implements AmazonS3 {
    private final File basePath;
    private final static Logger LOGGER = LoggerFactory.getLogger(AmazonS3Local.class);

    public AmazonS3Local(@Named("s3LocalPath") File basePath) {
        this.basePath = basePath;
    }

    protected File getBucketPath(String bucketName) {
        return new File(basePath, bucketName);
    }

    protected File getObjectPath(String bucketName, String objectPath) {
        return new File(new File(basePath, bucketName), objectPath);
    }

    @Override
    public void setEndpoint(String s) {

    }

    @Override
    public void setRegion(Region region) throws IllegalArgumentException {

    }

    @Override
    public void setS3ClientOptions(S3ClientOptions s3ClientOptions) {

    }

    @Override
    @Deprecated
    public void changeObjectStorageClass(String s, String s1, StorageClass storageClass) throws SdkClientException, AmazonServiceException {

    }

    @Override
    @Deprecated
    public void setObjectRedirectLocation(String s, String s1, String s2) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public ObjectListing listObjects(String s) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ObjectListing listObjects(String s, String s1) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ObjectListing listObjects(ListObjectsRequest listObjectsRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ListObjectsV2Result listObjectsV2(String s) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ListObjectsV2Result listObjectsV2(String s, String s1) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ListObjectsV2Result listObjectsV2(ListObjectsV2Request listObjectsV2Request) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ObjectListing listNextBatchOfObjects(ObjectListing objectListing) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ObjectListing listNextBatchOfObjects(ListNextBatchOfObjectsRequest listNextBatchOfObjectsRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public VersionListing listVersions(String s, String s1) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public VersionListing listNextBatchOfVersions(VersionListing versionListing) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public VersionListing listNextBatchOfVersions(ListNextBatchOfVersionsRequest listNextBatchOfVersionsRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public VersionListing listVersions(String s, String s1, String s2, String s3, String s4, Integer integer) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public VersionListing listVersions(ListVersionsRequest listVersionsRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public Owner getS3AccountOwner() throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public Owner getS3AccountOwner(GetS3AccountOwnerRequest getS3AccountOwnerRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Deprecated
    @Override
    public boolean doesBucketExist(String bucketName) throws SdkClientException {
        return doesBucketExistV2(bucketName);
    }

    @Override
    public HeadBucketResult headBucket(HeadBucketRequest headBucketRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public List<Bucket> listBuckets() throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public List<Bucket> listBuckets(ListBucketsRequest listBucketsRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public String getBucketLocation(String s) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public String getBucketLocation(GetBucketLocationRequest getBucketLocationRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public Bucket createBucket(CreateBucketRequest createBucketRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public Bucket createBucket(String s) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    @Deprecated
    public Bucket createBucket(String s, com.amazonaws.services.s3.model.Region region) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    @Deprecated
    public Bucket createBucket(String s, String s1) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AccessControlList getObjectAcl(String s, String s1) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AccessControlList getObjectAcl(String s, String s1, String s2) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AccessControlList getObjectAcl(GetObjectAclRequest getObjectAclRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void setObjectAcl(String s, String s1, AccessControlList accessControlList) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public void setObjectAcl(String s, String s1, CannedAccessControlList cannedAccessControlList) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public void setObjectAcl(String s, String s1, String s2, AccessControlList accessControlList) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public void setObjectAcl(String s, String s1, String s2, CannedAccessControlList cannedAccessControlList) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public void setObjectAcl(SetObjectAclRequest setObjectAclRequest) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public AccessControlList getBucketAcl(String s) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void setBucketAcl(SetBucketAclRequest setBucketAclRequest) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public AccessControlList getBucketAcl(GetBucketAclRequest getBucketAclRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void setBucketAcl(String s, AccessControlList accessControlList) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public void setBucketAcl(String s, CannedAccessControlList cannedAccessControlList) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public ObjectMetadata getObjectMetadata(String s, String s1) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ObjectMetadata getObjectMetadata(GetObjectMetadataRequest getObjectMetadataRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public S3Object getObject(String bucketName, String objectPath) throws SdkClientException, AmazonServiceException {
        GetObjectRequest request = new GetObjectRequest(bucketName, objectPath);
        return getObject(request);
    }

    @Override
    public S3Object getObject(GetObjectRequest getObjectRequest) throws SdkClientException, AmazonServiceException {
        String bucketName = getObjectRequest.getBucketName();
        String objectPath = getObjectRequest.getKey();
        try {
            ObjectMetadata metadata = new ObjectMetadata();
            String contentType = null;
            try {
                contentType = Files.probeContentType(new File(objectPath).toPath());
            } catch (IOException e) {
                LOGGER.debug("Exception probing content type of " + objectPath, e);
            }
            if (contentType == null) {
                contentType = "application/octet-stream";
            }
            metadata.setContentType(contentType);

            S3Object obj = new S3Object();
            obj.setBucketName(bucketName);
            obj.setKey(objectPath);
            obj.setObjectContent(new FileInputStream(getObjectPath(bucketName, objectPath)));
            obj.setObjectMetadata(metadata);
            return obj;
        } catch (FileNotFoundException e) {
            throw new SdkClientException("Object not found: " + bucketName + "/" + objectPath);
        }
    }

    @Override
    public ObjectMetadata getObject(GetObjectRequest getObjectRequest, File file) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public String getObjectAsString(String s, String s1) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public GetObjectTaggingResult getObjectTagging(GetObjectTaggingRequest getObjectTaggingRequest) {
        return null;
    }

    @Override
    public SetObjectTaggingResult setObjectTagging(SetObjectTaggingRequest setObjectTaggingRequest) {
        return null;
    }

    @Override
    public DeleteObjectTaggingResult deleteObjectTagging(DeleteObjectTaggingRequest deleteObjectTaggingRequest) {
        return null;
    }

    @Override
    public void deleteBucket(DeleteBucketRequest request) throws SdkClientException {
        try {
            String bucketName = request.getBucketName();
            File bucket = getBucketPath(bucketName);
            Files.walk(bucket.toPath())
                    .sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .forEach(File::delete);
        } catch (IOException e) {
            throw new SdkClientException("Unable to delete bucket: " + request.getBucketName());
        }
    }

    @Override
    public void deleteBucket(String bucketName) throws SdkClientException {
        DeleteBucketRequest request = new DeleteBucketRequest(bucketName);
        deleteBucket(request);
    }

    @Override
    public PutObjectResult putObject(PutObjectRequest request) throws SdkClientException {
        try {
            File destPath = getObjectPath(request.getBucketName(), request.getKey());
            if (!destPath.exists()) {
                new File(destPath.getParent()).mkdirs();
            } else {
                destPath.delete();
            }
            InputStream inputStream = request.getInputStream();
            if (inputStream == null) {
                inputStream = new FileInputStream(request.getFile());
            }
            Files.copy(inputStream, destPath.toPath());
            return new PutObjectResult();

        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public PutObjectResult putObject(String bucketName, String key, File file) throws SdkClientException, AmazonServiceException {
        PutObjectRequest request = new PutObjectRequest(bucketName, key, file);
        return putObject(request);
    }

    @Override
    public PutObjectResult putObject(String s, String s1, InputStream inputStream, ObjectMetadata objectMetadata) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public PutObjectResult putObject(String bucketName, String key, String contents) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public CopyObjectResult copyObject(String s, String s1, String s2, String s3) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public CopyObjectResult copyObject(CopyObjectRequest copyObjectRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public CopyPartResult copyPart(CopyPartRequest copyPartRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void deleteObject(String s, String s1) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public void deleteObject(DeleteObjectRequest deleteObjectRequest) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public DeleteObjectsResult deleteObjects(DeleteObjectsRequest deleteObjectsRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void deleteVersion(String s, String s1, String s2) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public void deleteVersion(DeleteVersionRequest deleteVersionRequest) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public BucketLoggingConfiguration getBucketLoggingConfiguration(String s) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public BucketLoggingConfiguration getBucketLoggingConfiguration(GetBucketLoggingConfigurationRequest getBucketLoggingConfigurationRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void setBucketLoggingConfiguration(SetBucketLoggingConfigurationRequest setBucketLoggingConfigurationRequest) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public BucketVersioningConfiguration getBucketVersioningConfiguration(String s) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public BucketVersioningConfiguration getBucketVersioningConfiguration(GetBucketVersioningConfigurationRequest getBucketVersioningConfigurationRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest setBucketVersioningConfigurationRequest) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public BucketLifecycleConfiguration getBucketLifecycleConfiguration(String s) {
        return null;
    }

    @Override
    public BucketLifecycleConfiguration getBucketLifecycleConfiguration(GetBucketLifecycleConfigurationRequest getBucketLifecycleConfigurationRequest) {
        return null;
    }

    @Override
    public void setBucketLifecycleConfiguration(String s, BucketLifecycleConfiguration bucketLifecycleConfiguration) {

    }

    @Override
    public void setBucketLifecycleConfiguration(SetBucketLifecycleConfigurationRequest setBucketLifecycleConfigurationRequest) {

    }

    @Override
    public void deleteBucketLifecycleConfiguration(String s) {

    }

    @Override
    public void deleteBucketLifecycleConfiguration(DeleteBucketLifecycleConfigurationRequest deleteBucketLifecycleConfigurationRequest) {

    }

    @Override
    public BucketCrossOriginConfiguration getBucketCrossOriginConfiguration(String s) {
        return null;
    }

    @Override
    public BucketCrossOriginConfiguration getBucketCrossOriginConfiguration(GetBucketCrossOriginConfigurationRequest getBucketCrossOriginConfigurationRequest) {
        return null;
    }

    @Override
    public void setBucketCrossOriginConfiguration(String s, BucketCrossOriginConfiguration bucketCrossOriginConfiguration) {

    }

    @Override
    public void setBucketCrossOriginConfiguration(SetBucketCrossOriginConfigurationRequest setBucketCrossOriginConfigurationRequest) {

    }

    @Override
    public void deleteBucketCrossOriginConfiguration(String s) {

    }

    @Override
    public void deleteBucketCrossOriginConfiguration(DeleteBucketCrossOriginConfigurationRequest deleteBucketCrossOriginConfigurationRequest) {

    }

    @Override
    public BucketTaggingConfiguration getBucketTaggingConfiguration(String s) {
        return null;
    }

    @Override
    public BucketTaggingConfiguration getBucketTaggingConfiguration(GetBucketTaggingConfigurationRequest getBucketTaggingConfigurationRequest) {
        return null;
    }

    @Override
    public void setBucketTaggingConfiguration(String s, BucketTaggingConfiguration bucketTaggingConfiguration) {

    }

    @Override
    public void setBucketTaggingConfiguration(SetBucketTaggingConfigurationRequest setBucketTaggingConfigurationRequest) {

    }

    @Override
    public void deleteBucketTaggingConfiguration(String s) {

    }

    @Override
    public void deleteBucketTaggingConfiguration(DeleteBucketTaggingConfigurationRequest deleteBucketTaggingConfigurationRequest) {

    }

    @Override
    public BucketNotificationConfiguration getBucketNotificationConfiguration(String s) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public BucketNotificationConfiguration getBucketNotificationConfiguration(GetBucketNotificationConfigurationRequest getBucketNotificationConfigurationRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void setBucketNotificationConfiguration(SetBucketNotificationConfigurationRequest setBucketNotificationConfigurationRequest) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public void setBucketNotificationConfiguration(String s, BucketNotificationConfiguration bucketNotificationConfiguration) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public BucketWebsiteConfiguration getBucketWebsiteConfiguration(String s) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public BucketWebsiteConfiguration getBucketWebsiteConfiguration(GetBucketWebsiteConfigurationRequest getBucketWebsiteConfigurationRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void setBucketWebsiteConfiguration(String s, BucketWebsiteConfiguration bucketWebsiteConfiguration) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public void setBucketWebsiteConfiguration(SetBucketWebsiteConfigurationRequest setBucketWebsiteConfigurationRequest) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public void deleteBucketWebsiteConfiguration(String s) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public void deleteBucketWebsiteConfiguration(DeleteBucketWebsiteConfigurationRequest deleteBucketWebsiteConfigurationRequest) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public BucketPolicy getBucketPolicy(String s) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public BucketPolicy getBucketPolicy(GetBucketPolicyRequest getBucketPolicyRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void setBucketPolicy(String s, String s1) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public void setBucketPolicy(SetBucketPolicyRequest setBucketPolicyRequest) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public void deleteBucketPolicy(String s) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public void deleteBucketPolicy(DeleteBucketPolicyRequest deleteBucketPolicyRequest) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public URL generatePresignedUrl(String s, String s1, Date date) throws SdkClientException {
        return null;
    }

    @Override
    public URL generatePresignedUrl(String s, String s1, Date date, HttpMethod httpMethod) throws SdkClientException {
        return null;
    }

    @Override
    public URL generatePresignedUrl(GeneratePresignedUrlRequest generatePresignedUrlRequest) throws SdkClientException {
        return null;
    }

    @Override
    public InitiateMultipartUploadResult initiateMultipartUpload(InitiateMultipartUploadRequest initiateMultipartUploadRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public UploadPartResult uploadPart(UploadPartRequest uploadPartRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public PartListing listParts(ListPartsRequest listPartsRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void abortMultipartUpload(AbortMultipartUploadRequest abortMultipartUploadRequest) throws SdkClientException, AmazonServiceException {

    }

    @Override
    public CompleteMultipartUploadResult completeMultipartUpload(CompleteMultipartUploadRequest completeMultipartUploadRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public MultipartUploadListing listMultipartUploads(ListMultipartUploadsRequest listMultipartUploadsRequest) throws SdkClientException, AmazonServiceException {
        return null;
    }

    @Override
    public S3ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest amazonWebServiceRequest) {
        return null;
    }

    @Deprecated
    @Override
    public void restoreObject(RestoreObjectRequest restoreObjectRequest) throws AmazonServiceException {

    }

    @Deprecated
    @Override
    public void restoreObject(String s, String s1, int i) throws AmazonServiceException {

    }

    @Override
    public void enableRequesterPays(String s) throws AmazonServiceException, SdkClientException {

    }

    @Override
    public void disableRequesterPays(String s) throws AmazonServiceException, SdkClientException {

    }

    @Override
    public boolean isRequesterPaysEnabled(String s) throws AmazonServiceException, SdkClientException {
        return false;
    }

    @Override
    public void setBucketReplicationConfiguration(String s, BucketReplicationConfiguration bucketReplicationConfiguration) throws AmazonServiceException, SdkClientException {

    }

    @Override
    public void setBucketReplicationConfiguration(SetBucketReplicationConfigurationRequest setBucketReplicationConfigurationRequest) throws AmazonServiceException, SdkClientException {

    }

    @Override
    public BucketReplicationConfiguration getBucketReplicationConfiguration(String s) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public BucketReplicationConfiguration getBucketReplicationConfiguration(GetBucketReplicationConfigurationRequest getBucketReplicationConfigurationRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public void deleteBucketReplicationConfiguration(String s) throws AmazonServiceException, SdkClientException {

    }

    @Override
    public void deleteBucketReplicationConfiguration(DeleteBucketReplicationConfigurationRequest deleteBucketReplicationConfigurationRequest) throws AmazonServiceException, SdkClientException {

    }

    @Override
    public boolean doesObjectExist(String s, String s1) throws AmazonServiceException, SdkClientException {
        return getObjectPath(s, s1).exists();
    }

    @Override
    public BucketAccelerateConfiguration getBucketAccelerateConfiguration(String s) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public BucketAccelerateConfiguration getBucketAccelerateConfiguration(GetBucketAccelerateConfigurationRequest getBucketAccelerateConfigurationRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public void setBucketAccelerateConfiguration(String s, BucketAccelerateConfiguration bucketAccelerateConfiguration) throws AmazonServiceException, SdkClientException {

    }

    @Override
    public void setBucketAccelerateConfiguration(SetBucketAccelerateConfigurationRequest setBucketAccelerateConfigurationRequest) throws AmazonServiceException, SdkClientException {

    }

    @Override
    public DeleteBucketMetricsConfigurationResult deleteBucketMetricsConfiguration(String s, String s1) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public DeleteBucketMetricsConfigurationResult deleteBucketMetricsConfiguration(DeleteBucketMetricsConfigurationRequest deleteBucketMetricsConfigurationRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public GetBucketMetricsConfigurationResult getBucketMetricsConfiguration(String s, String s1) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public GetBucketMetricsConfigurationResult getBucketMetricsConfiguration(GetBucketMetricsConfigurationRequest getBucketMetricsConfigurationRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public SetBucketMetricsConfigurationResult setBucketMetricsConfiguration(String s, MetricsConfiguration metricsConfiguration) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public SetBucketMetricsConfigurationResult setBucketMetricsConfiguration(SetBucketMetricsConfigurationRequest setBucketMetricsConfigurationRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public ListBucketMetricsConfigurationsResult listBucketMetricsConfigurations(ListBucketMetricsConfigurationsRequest listBucketMetricsConfigurationsRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public DeleteBucketAnalyticsConfigurationResult deleteBucketAnalyticsConfiguration(String s, String s1) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public DeleteBucketAnalyticsConfigurationResult deleteBucketAnalyticsConfiguration(DeleteBucketAnalyticsConfigurationRequest deleteBucketAnalyticsConfigurationRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public GetBucketAnalyticsConfigurationResult getBucketAnalyticsConfiguration(String s, String s1) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public GetBucketAnalyticsConfigurationResult getBucketAnalyticsConfiguration(GetBucketAnalyticsConfigurationRequest getBucketAnalyticsConfigurationRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public SetBucketAnalyticsConfigurationResult setBucketAnalyticsConfiguration(String s, AnalyticsConfiguration analyticsConfiguration) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public SetBucketAnalyticsConfigurationResult setBucketAnalyticsConfiguration(SetBucketAnalyticsConfigurationRequest setBucketAnalyticsConfigurationRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public ListBucketAnalyticsConfigurationsResult listBucketAnalyticsConfigurations(ListBucketAnalyticsConfigurationsRequest listBucketAnalyticsConfigurationsRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public DeleteBucketInventoryConfigurationResult deleteBucketInventoryConfiguration(String s, String s1) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public DeleteBucketInventoryConfigurationResult deleteBucketInventoryConfiguration(DeleteBucketInventoryConfigurationRequest deleteBucketInventoryConfigurationRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public GetBucketInventoryConfigurationResult getBucketInventoryConfiguration(String s, String s1) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public GetBucketInventoryConfigurationResult getBucketInventoryConfiguration(GetBucketInventoryConfigurationRequest getBucketInventoryConfigurationRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public SetBucketInventoryConfigurationResult setBucketInventoryConfiguration(String s, InventoryConfiguration inventoryConfiguration) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public SetBucketInventoryConfigurationResult setBucketInventoryConfiguration(SetBucketInventoryConfigurationRequest setBucketInventoryConfigurationRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public ListBucketInventoryConfigurationsResult listBucketInventoryConfigurations(ListBucketInventoryConfigurationsRequest listBucketInventoryConfigurationsRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public com.amazonaws.services.s3.model.Region getRegion() {
        return null;
    }

    @Override
    public String getRegionName() {
        return null;
    }

    @Override
    public URL getUrl(String s, String s1) {
        return null;
    }

    @Override
    public AmazonS3Waiters waiters() {
        return null;
    }

    @Override
    public boolean doesBucketExistV2(String bucketName) throws SdkClientException {
        return getBucketPath(bucketName).exists();
    }

    @Override
    public RestoreObjectResult restoreObjectV2(RestoreObjectRequest restoreObjectRequest) throws AmazonServiceException {
        return null;
    }

    @Override
    public DeleteBucketEncryptionResult deleteBucketEncryption(String s) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public DeleteBucketEncryptionResult deleteBucketEncryption(DeleteBucketEncryptionRequest deleteBucketEncryptionRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public GetBucketEncryptionResult getBucketEncryption(String s) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public GetBucketEncryptionResult getBucketEncryption(GetBucketEncryptionRequest getBucketEncryptionRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public SetBucketEncryptionResult setBucketEncryption(SetBucketEncryptionRequest setBucketEncryptionRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public SelectObjectContentResult selectObjectContent(SelectObjectContentRequest selectObjectContentRequest) throws AmazonServiceException, SdkClientException {
        return null;
    }

    @Override
    public void shutdown() {

    }
}
