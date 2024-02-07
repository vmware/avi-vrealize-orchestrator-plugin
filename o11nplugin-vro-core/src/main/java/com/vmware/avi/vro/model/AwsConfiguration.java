package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AwsEncryption;
import com.vmware.avi.vro.model.AwsEncryption;
import com.vmware.avi.vro.model.AwsEncryption;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The AwsConfiguration is a POJO class extends AviRestResource that used for creating
 * AwsConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AwsConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_AWSCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AwsConfiguration extends AviRestResource {
    @JsonProperty("access_key_id")
    @JsonInclude(Include.NON_NULL)
    private String accessKeyId;

    @JsonProperty("asg_poll_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer asgPollInterval = 600;

    @JsonProperty("ebs_encryption")
    @JsonInclude(Include.NON_NULL)
    private AwsEncryption ebsEncryption;

    @JsonProperty("free_elasticips")
    @JsonInclude(Include.NON_NULL)
    private Boolean freeElasticips = true;

    @JsonProperty("iam_assume_role")
    @JsonInclude(Include.NON_NULL)
    private String iamAssumeRole;

    @JsonProperty("publish_vip_to_public_zone")
    @JsonInclude(Include.NON_NULL)
    private Boolean publishVipToPublicZone = false;

    @JsonProperty("region")
    @JsonInclude(Include.NON_NULL)
    private String region = "us-west-1";

    @JsonProperty("route53_integration")
    @JsonInclude(Include.NON_NULL)
    private Boolean route53Integration = false;

    @JsonProperty("s3_encryption")
    @JsonInclude(Include.NON_NULL)
    private AwsEncryption s3Encryption;

    @JsonProperty("secret_access_key")
    @JsonInclude(Include.NON_NULL)
    private String secretAccessKey;

    @JsonProperty("sqs_encryption")
    @JsonInclude(Include.NON_NULL)
    private AwsEncryption sqsEncryption;

    @JsonProperty("ttl")
    @JsonInclude(Include.NON_NULL)
    private Integer ttl = 60;

    @JsonProperty("use_iam_roles")
    @JsonInclude(Include.NON_NULL)
    private Boolean useIamRoles = false;

    @JsonProperty("use_sns_sqs")
    @JsonInclude(Include.NON_NULL)
    private Boolean useSnsSqs = false;

    @JsonProperty("vpc")
    @JsonInclude(Include.NON_NULL)
    private String vpc;

    @JsonProperty("vpc_id")
    @JsonInclude(Include.NON_NULL)
    private String vpcId;

    @JsonProperty("zones")
    @JsonInclude(Include.NON_NULL)
    private List<AwsZoneConfig> zones;



  /**
   * This is the getter method this will return the attribute value.
   * Aws access key id.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return accessKeyId
   */
  @VsoMethod
  public String getAccessKeyId() {
    return accessKeyId;
  }

  /**
   * This is the setter method to the attribute.
   * Aws access key id.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param accessKeyId set the accessKeyId.
   */
  @VsoMethod
  public void setAccessKeyId(String  accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time interval between periodic polling of all auto scaling groups.
   * Allowed values are 60-1800.
   * Field introduced in 17.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 600.
   * @return asgPollInterval
   */
  @VsoMethod
  public Integer getAsgPollInterval() {
    return asgPollInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Time interval between periodic polling of all auto scaling groups.
   * Allowed values are 60-1800.
   * Field introduced in 17.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 600.
   * @param asgPollInterval set the asgPollInterval.
   */
  @VsoMethod
  public void setAsgPollInterval(Integer  asgPollInterval) {
    this.asgPollInterval = asgPollInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ebs encryption mode and the master key to be used for encrypting se ami, volumes, and snapshots.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ebsEncryption
   */
  @VsoMethod
  public AwsEncryption getEbsEncryption() {
    return ebsEncryption;
  }

  /**
   * This is the setter method to the attribute.
   * Ebs encryption mode and the master key to be used for encrypting se ami, volumes, and snapshots.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ebsEncryption set the ebsEncryption.
   */
  @VsoMethod
  public void setEbsEncryption(AwsEncryption ebsEncryption) {
    this.ebsEncryption = ebsEncryption;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Free unused elastic ip addresses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return freeElasticips
   */
  @VsoMethod
  public Boolean getFreeElasticips() {
    return freeElasticips;
  }

  /**
   * This is the setter method to the attribute.
   * Free unused elastic ip addresses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param freeElasticips set the freeElasticips.
   */
  @VsoMethod
  public void setFreeElasticips(Boolean  freeElasticips) {
    this.freeElasticips = freeElasticips;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Iam assume role for cross-account access.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return iamAssumeRole
   */
  @VsoMethod
  public String getIamAssumeRole() {
    return iamAssumeRole;
  }

  /**
   * This is the setter method to the attribute.
   * Iam assume role for cross-account access.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param iamAssumeRole set the iamAssumeRole.
   */
  @VsoMethod
  public void setIamAssumeRole(String  iamAssumeRole) {
    this.iamAssumeRole = iamAssumeRole;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If enabled and the virtual service is not floating ip capable, vip will be published to both private and public zones.
   * Field introduced in 17.2.10.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return publishVipToPublicZone
   */
  @VsoMethod
  public Boolean getPublishVipToPublicZone() {
    return publishVipToPublicZone;
  }

  /**
   * This is the setter method to the attribute.
   * If enabled and the virtual service is not floating ip capable, vip will be published to both private and public zones.
   * Field introduced in 17.2.10.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param publishVipToPublicZone set the publishVipToPublicZone.
   */
  @VsoMethod
  public void setPublishVipToPublicZone(Boolean  publishVipToPublicZone) {
    this.publishVipToPublicZone = publishVipToPublicZone;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Aws region.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "us-west-1".
   * @return region
   */
  @VsoMethod
  public String getRegion() {
    return region;
  }

  /**
   * This is the setter method to the attribute.
   * Aws region.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "us-west-1".
   * @param region set the region.
   */
  @VsoMethod
  public void setRegion(String  region) {
    this.region = region;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If enabled, create/update dns entries in amazon route 53 zones.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return route53Integration
   */
  @VsoMethod
  public Boolean getRoute53Integration() {
    return route53Integration;
  }

  /**
   * This is the setter method to the attribute.
   * If enabled, create/update dns entries in amazon route 53 zones.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param route53Integration set the route53Integration.
   */
  @VsoMethod
  public void setRoute53Integration(Boolean  route53Integration) {
    this.route53Integration = route53Integration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * S3 encryption mode and the master key to be used for encrypting s3 buckets during se ami upload.
   * Only sse-kms mode is supported.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return s3Encryption
   */
  @VsoMethod
  public AwsEncryption getS3Encryption() {
    return s3Encryption;
  }

  /**
   * This is the setter method to the attribute.
   * S3 encryption mode and the master key to be used for encrypting s3 buckets during se ami upload.
   * Only sse-kms mode is supported.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param s3Encryption set the s3Encryption.
   */
  @VsoMethod
  public void setS3Encryption(AwsEncryption s3Encryption) {
    this.s3Encryption = s3Encryption;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Aws secret access key.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return secretAccessKey
   */
  @VsoMethod
  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  /**
   * This is the setter method to the attribute.
   * Aws secret access key.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param secretAccessKey set the secretAccessKey.
   */
  @VsoMethod
  public void setSecretAccessKey(String  secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Server side encryption to be used for encrypting sqs queues.
   * Field introduced in 17.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sqsEncryption
   */
  @VsoMethod
  public AwsEncryption getSqsEncryption() {
    return sqsEncryption;
  }

  /**
   * This is the setter method to the attribute.
   * Server side encryption to be used for encrypting sqs queues.
   * Field introduced in 17.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sqsEncryption set the sqsEncryption.
   */
  @VsoMethod
  public void setSqsEncryption(AwsEncryption sqsEncryption) {
    this.sqsEncryption = sqsEncryption;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default ttl for all records.
   * Allowed values are 1-172800.
   * Field introduced in 17.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return ttl
   */
  @VsoMethod
  public Integer getTtl() {
    return ttl;
  }

  /**
   * This is the setter method to the attribute.
   * Default ttl for all records.
   * Allowed values are 1-172800.
   * Field introduced in 17.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param ttl set the ttl.
   */
  @VsoMethod
  public void setTtl(Integer  ttl) {
    this.ttl = ttl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use iam roles instead of access and secret key.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useIamRoles
   */
  @VsoMethod
  public Boolean getUseIamRoles() {
    return useIamRoles;
  }

  /**
   * This is the setter method to the attribute.
   * Use iam roles instead of access and secret key.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useIamRoles set the useIamRoles.
   */
  @VsoMethod
  public void setUseIamRoles(Boolean  useIamRoles) {
    this.useIamRoles = useIamRoles;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use sns/sqs based notifications for monitoring auto scaling groups.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useSnsSqs
   */
  @VsoMethod
  public Boolean getUseSnsSqs() {
    return useSnsSqs;
  }

  /**
   * This is the setter method to the attribute.
   * Use sns/sqs based notifications for monitoring auto scaling groups.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useSnsSqs set the useSnsSqs.
   */
  @VsoMethod
  public void setUseSnsSqs(Boolean  useSnsSqs) {
    this.useSnsSqs = useSnsSqs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vpc name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vpc
   */
  @VsoMethod
  public String getVpc() {
    return vpc;
  }

  /**
   * This is the setter method to the attribute.
   * Vpc name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vpc set the vpc.
   */
  @VsoMethod
  public void setVpc(String  vpc) {
    this.vpc = vpc;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vpc id.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vpcId
   */
  @VsoMethod
  public String getVpcId() {
    return vpcId;
  }

  /**
   * This is the setter method to the attribute.
   * Vpc id.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vpcId set the vpcId.
   */
  @VsoMethod
  public void setVpcId(String  vpcId) {
    this.vpcId = vpcId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return zones
   */
  @VsoMethod
  public List<AwsZoneConfig> getZones() {
    return zones;
  }

  /**
   * This is the setter method. this will set the zones
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return zones
   */
  @VsoMethod
  public void setZones(List<AwsZoneConfig>  zones) {
    this.zones = zones;
  }

  /**
   * This is the setter method this will set the zones
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return zones
   */
  @VsoMethod
  public AwsConfiguration addZonesItem(AwsZoneConfig zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<AwsZoneConfig>();
    }
    this.zones.add(zonesItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AwsConfiguration objAwsConfiguration = (AwsConfiguration) o;
  return   Objects.equals(this.accessKeyId, objAwsConfiguration.accessKeyId)&&
  Objects.equals(this.secretAccessKey, objAwsConfiguration.secretAccessKey)&&
  Objects.equals(this.region, objAwsConfiguration.region)&&
  Objects.equals(this.vpc, objAwsConfiguration.vpc)&&
  Objects.equals(this.vpcId, objAwsConfiguration.vpcId)&&
  Objects.equals(this.zones, objAwsConfiguration.zones)&&
  Objects.equals(this.route53Integration, objAwsConfiguration.route53Integration)&&
  Objects.equals(this.freeElasticips, objAwsConfiguration.freeElasticips)&&
  Objects.equals(this.useIamRoles, objAwsConfiguration.useIamRoles)&&
  Objects.equals(this.iamAssumeRole, objAwsConfiguration.iamAssumeRole)&&
  Objects.equals(this.ttl, objAwsConfiguration.ttl)&&
  Objects.equals(this.useSnsSqs, objAwsConfiguration.useSnsSqs)&&
  Objects.equals(this.asgPollInterval, objAwsConfiguration.asgPollInterval)&&
  Objects.equals(this.ebsEncryption, objAwsConfiguration.ebsEncryption)&&
  Objects.equals(this.s3Encryption, objAwsConfiguration.s3Encryption)&&
  Objects.equals(this.sqsEncryption, objAwsConfiguration.sqsEncryption)&&
  Objects.equals(this.publishVipToPublicZone, objAwsConfiguration.publishVipToPublicZone);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AwsConfiguration {\n");
      sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
        sb.append("    asgPollInterval: ").append(toIndentedString(asgPollInterval)).append("\n");
        sb.append("    ebsEncryption: ").append(toIndentedString(ebsEncryption)).append("\n");
        sb.append("    freeElasticips: ").append(toIndentedString(freeElasticips)).append("\n");
        sb.append("    iamAssumeRole: ").append(toIndentedString(iamAssumeRole)).append("\n");
        sb.append("    publishVipToPublicZone: ").append(toIndentedString(publishVipToPublicZone)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    route53Integration: ").append(toIndentedString(route53Integration)).append("\n");
        sb.append("    s3Encryption: ").append(toIndentedString(s3Encryption)).append("\n");
        sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
        sb.append("    sqsEncryption: ").append(toIndentedString(sqsEncryption)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    useIamRoles: ").append(toIndentedString(useIamRoles)).append("\n");
        sb.append("    useSnsSqs: ").append(toIndentedString(useSnsSqs)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
      sb.append("}");
  return sb.toString();
}

/**
* Convert the given object to string with each line indented by 4 spaces
* (except the first line).
*/
private String toIndentedString(java.lang.Object o) {
  if (o == null) {
    return "null";
  }
  return o.toString().replace("\n", "\n    ");
}
}

