package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The IpamDnsAwsProfile is a POJO class extends AviRestResource that used for creating
 * IpamDnsAwsProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IpamDnsAwsProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPAMDNSAWSPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IpamDnsAwsProfile extends AviRestResource {
    @JsonProperty("access_key_id")
    @JsonInclude(Include.NON_NULL)
    private String accessKeyId;

    @JsonProperty("egress_service_subnets")
    @JsonInclude(Include.NON_NULL)
    private List<String> egressServiceSubnets;

    @JsonProperty("iam_assume_role")
    @JsonInclude(Include.NON_NULL)
    private String iamAssumeRole;

    @JsonProperty("publish_vip_to_public_zone")
    @JsonInclude(Include.NON_NULL)
    private Boolean publishVipToPublicZone = false;

    @JsonProperty("region")
    @JsonInclude(Include.NON_NULL)
    private String region;

    @JsonProperty("secret_access_key")
    @JsonInclude(Include.NON_NULL)
    private String secretAccessKey;

    @JsonProperty("ttl")
    @JsonInclude(Include.NON_NULL)
    private Integer ttl = 60;

    @JsonProperty("usable_domains")
    @JsonInclude(Include.NON_NULL)
    private List<String> usableDomains;

    @JsonProperty("usable_network_uuids")
    @JsonInclude(Include.NON_NULL)
    private List<String> usableNetworkUuids;

    @JsonProperty("use_iam_roles")
    @JsonInclude(Include.NON_NULL)
    private Boolean useIamRoles = false;

    @JsonProperty("vpc")
    @JsonInclude(Include.NON_NULL)
    private String vpc;

    @JsonProperty("vpc_id")
    @JsonInclude(Include.NON_NULL)
    private String vpcId;

    @JsonProperty("zones")
    @JsonInclude(Include.NON_NULL)
    private List<AwsZoneNetwork> zones;



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
   * A list of subnets used for source ip allocation for egress services in openshift/k8s on aws.
   * Field introduced in 18.2.3.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return egressServiceSubnets
   */
  @VsoMethod
  public List<String> getEgressServiceSubnets() {
    return egressServiceSubnets;
  }

  /**
   * This is the setter method. this will set the egressServiceSubnets
   * A list of subnets used for source ip allocation for egress services in openshift/k8s on aws.
   * Field introduced in 18.2.3.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return egressServiceSubnets
   */
  @VsoMethod
  public void setEgressServiceSubnets(List<String>  egressServiceSubnets) {
    this.egressServiceSubnets = egressServiceSubnets;
  }

  /**
   * This is the setter method this will set the egressServiceSubnets
   * A list of subnets used for source ip allocation for egress services in openshift/k8s on aws.
   * Field introduced in 18.2.3.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return egressServiceSubnets
   */
  @VsoMethod
  public IpamDnsAwsProfile addEgressServiceSubnetsItem(String egressServiceSubnetsItem) {
    if (this.egressServiceSubnets == null) {
      this.egressServiceSubnets = new ArrayList<String>();
    }
    this.egressServiceSubnets.add(egressServiceSubnetsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Iam assume role for cross-account access.
   * Field introduced in 17.1.1.
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
   * Field introduced in 17.1.1.
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
   * This flag is applicable only for aws dns profile.
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
   * This flag is applicable only for aws dns profile.
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
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param region set the region.
   */
  @VsoMethod
  public void setRegion(String  region) {
    this.region = region;
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
   * Usable domains to pick from amazon route 53.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return usableDomains
   */
  @VsoMethod
  public List<String> getUsableDomains() {
    return usableDomains;
  }

  /**
   * This is the setter method. this will set the usableDomains
   * Usable domains to pick from amazon route 53.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return usableDomains
   */
  @VsoMethod
  public void setUsableDomains(List<String>  usableDomains) {
    this.usableDomains = usableDomains;
  }

  /**
   * This is the setter method this will set the usableDomains
   * Usable domains to pick from amazon route 53.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return usableDomains
   */
  @VsoMethod
  public IpamDnsAwsProfile addUsableDomainsItem(String usableDomainsItem) {
    if (this.usableDomains == null) {
      this.usableDomains = new ArrayList<String>();
    }
    this.usableDomains.add(usableDomainsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Usable networks for virtual ip.
   * If virtualservice does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for ip
   * allocation.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return usableNetworkUuids
   */
  @VsoMethod
  public List<String> getUsableNetworkUuids() {
    return usableNetworkUuids;
  }

  /**
   * This is the setter method. this will set the usableNetworkUuids
   * Usable networks for virtual ip.
   * If virtualservice does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for ip
   * allocation.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return usableNetworkUuids
   */
  @VsoMethod
  public void setUsableNetworkUuids(List<String>  usableNetworkUuids) {
    this.usableNetworkUuids = usableNetworkUuids;
  }

  /**
   * This is the setter method this will set the usableNetworkUuids
   * Usable networks for virtual ip.
   * If virtualservice does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for ip
   * allocation.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return usableNetworkUuids
   */
  @VsoMethod
  public IpamDnsAwsProfile addUsableNetworkUuidsItem(String usableNetworkUuidsItem) {
    if (this.usableNetworkUuids == null) {
      this.usableNetworkUuids = new ArrayList<String>();
    }
    this.usableNetworkUuids.add(usableNetworkUuidsItem);
    return this;
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
   * Network configuration for virtual ip per az.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return zones
   */
  @VsoMethod
  public List<AwsZoneNetwork> getZones() {
    return zones;
  }

  /**
   * This is the setter method. this will set the zones
   * Network configuration for virtual ip per az.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return zones
   */
  @VsoMethod
  public void setZones(List<AwsZoneNetwork>  zones) {
    this.zones = zones;
  }

  /**
   * This is the setter method this will set the zones
   * Network configuration for virtual ip per az.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return zones
   */
  @VsoMethod
  public IpamDnsAwsProfile addZonesItem(AwsZoneNetwork zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<AwsZoneNetwork>();
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
  IpamDnsAwsProfile objIpamDnsAwsProfile = (IpamDnsAwsProfile) o;
  return   Objects.equals(this.region, objIpamDnsAwsProfile.region)&&
  Objects.equals(this.vpc, objIpamDnsAwsProfile.vpc)&&
  Objects.equals(this.vpcId, objIpamDnsAwsProfile.vpcId)&&
  Objects.equals(this.useIamRoles, objIpamDnsAwsProfile.useIamRoles)&&
  Objects.equals(this.accessKeyId, objIpamDnsAwsProfile.accessKeyId)&&
  Objects.equals(this.secretAccessKey, objIpamDnsAwsProfile.secretAccessKey)&&
  Objects.equals(this.usableNetworkUuids, objIpamDnsAwsProfile.usableNetworkUuids)&&
  Objects.equals(this.usableDomains, objIpamDnsAwsProfile.usableDomains)&&
  Objects.equals(this.iamAssumeRole, objIpamDnsAwsProfile.iamAssumeRole)&&
  Objects.equals(this.zones, objIpamDnsAwsProfile.zones)&&
  Objects.equals(this.ttl, objIpamDnsAwsProfile.ttl)&&
  Objects.equals(this.publishVipToPublicZone, objIpamDnsAwsProfile.publishVipToPublicZone)&&
  Objects.equals(this.egressServiceSubnets, objIpamDnsAwsProfile.egressServiceSubnets);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IpamDnsAwsProfile {\n");
      sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
        sb.append("    egressServiceSubnets: ").append(toIndentedString(egressServiceSubnets)).append("\n");
        sb.append("    iamAssumeRole: ").append(toIndentedString(iamAssumeRole)).append("\n");
        sb.append("    publishVipToPublicZone: ").append(toIndentedString(publishVipToPublicZone)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    usableDomains: ").append(toIndentedString(usableDomains)).append("\n");
        sb.append("    usableNetworkUuids: ").append(toIndentedString(usableNetworkUuids)).append("\n");
        sb.append("    useIamRoles: ").append(toIndentedString(useIamRoles)).append("\n");
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

