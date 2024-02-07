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
 * The CloudFlavor is a POJO class extends AviRestResource that used for creating
 * CloudFlavor.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CloudFlavor")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDFLAVOR)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CloudFlavor extends AviRestResource {
    @JsonProperty("cost")
    @JsonInclude(Include.NON_NULL)
    private String cost;

    @JsonProperty("disk_gb")
    @JsonInclude(Include.NON_NULL)
    private Integer diskGb;

    @JsonProperty("enhanced_nw")
    @JsonInclude(Include.NON_NULL)
    private Boolean enhancedNw;

    @JsonProperty("id")
    @JsonInclude(Include.NON_NULL)
    private String id;

    @JsonProperty("is_recommended")
    @JsonInclude(Include.NON_NULL)
    private Boolean isRecommended;

    @JsonProperty("max_ip6s_per_nic")
    @JsonInclude(Include.NON_NULL)
    private Integer maxIp6SPerNic;

    @JsonProperty("max_ips_per_nic")
    @JsonInclude(Include.NON_NULL)
    private Integer maxIpsPerNic;

    @JsonProperty("max_nics")
    @JsonInclude(Include.NON_NULL)
    private Integer maxNics;

    @JsonProperty("meta")
    @JsonInclude(Include.NON_NULL)
    private List<CloudMeta> meta;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("publics")
    @JsonInclude(Include.NON_NULL)
    private Boolean publics = true;

    @JsonProperty("ram_mb")
    @JsonInclude(Include.NON_NULL)
    private Integer ramMb;

    @JsonProperty("vcpus")
    @JsonInclude(Include.NON_NULL)
    private Integer vcpus;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cost
   */
  @VsoMethod
  public String getCost() {
    return cost;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cost set the cost.
   */
  @VsoMethod
  public void setCost(String  cost) {
    this.cost = cost;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return diskGb
   */
  @VsoMethod
  public Integer getDiskGb() {
    return diskGb;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param diskGb set the diskGb.
   */
  @VsoMethod
  public void setDiskGb(Integer  diskGb) {
    this.diskGb = diskGb;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enhancedNw
   */
  @VsoMethod
  public Boolean getEnhancedNw() {
    return enhancedNw;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param enhancedNw set the enhancedNw.
   */
  @VsoMethod
  public void setEnhancedNw(Boolean  enhancedNw) {
    this.enhancedNw = enhancedNw;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return id
   */
  @VsoMethod
  public String getId() {
    return id;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param id set the id.
   */
  @VsoMethod
  public void setId(String  id) {
    this.id = id;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If a vm flavor is recommended for requested se_usage_type.set to true if the chosen vm flavor is recommended for requested se_usage_type.else set
   * to false.
   * Field introduced in 18.1.4, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return isRecommended
   */
  @VsoMethod
  public Boolean getIsRecommended() {
    return isRecommended;
  }

  /**
   * This is the setter method to the attribute.
   * If a vm flavor is recommended for requested se_usage_type.set to true if the chosen vm flavor is recommended for requested se_usage_type.else set
   * to false.
   * Field introduced in 18.1.4, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param isRecommended set the isRecommended.
   */
  @VsoMethod
  public void setIsRecommended(Boolean  isRecommended) {
    this.isRecommended = isRecommended;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of ipv6 addresses that can be configured per nic.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxIp6SPerNic
   */
  @VsoMethod
  public Integer getMaxIp6SPerNic() {
    return maxIp6SPerNic;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of ipv6 addresses that can be configured per nic.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxIp6SPerNic set the maxIp6SPerNic.
   */
  @VsoMethod
  public void setMaxIp6SPerNic(Integer  maxIp6SPerNic) {
    this.maxIp6SPerNic = maxIp6SPerNic;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxIpsPerNic
   */
  @VsoMethod
  public Integer getMaxIpsPerNic() {
    return maxIpsPerNic;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxIpsPerNic set the maxIpsPerNic.
   */
  @VsoMethod
  public void setMaxIpsPerNic(Integer  maxIpsPerNic) {
    this.maxIpsPerNic = maxIpsPerNic;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxNics
   */
  @VsoMethod
  public Integer getMaxNics() {
    return maxNics;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxNics set the maxNics.
   */
  @VsoMethod
  public void setMaxNics(Integer  maxNics) {
    this.maxNics = maxNics;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return meta
   */
  @VsoMethod
  public List<CloudMeta> getMeta() {
    return meta;
  }

  /**
   * This is the setter method. this will set the meta
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return meta
   */
  @VsoMethod
  public void setMeta(List<CloudMeta>  meta) {
    this.meta = meta;
  }

  /**
   * This is the setter method this will set the meta
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return meta
   */
  @VsoMethod
  public CloudFlavor addMetaItem(CloudMeta metaItem) {
    if (this.meta == null) {
      this.meta = new ArrayList<CloudMeta>();
    }
    this.meta.add(metaItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return publics
   */
  @VsoMethod
  public Boolean getPublics() {
    return publics;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param publics set the publics.
   */
  @VsoMethod
  public void setPublics(Boolean  publics) {
    this.publics = publics;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ramMb
   */
  @VsoMethod
  public Integer getRamMb() {
    return ramMb;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ramMb set the ramMb.
   */
  @VsoMethod
  public void setRamMb(Integer  ramMb) {
    this.ramMb = ramMb;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcpus
   */
  @VsoMethod
  public Integer getVcpus() {
    return vcpus;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcpus set the vcpus.
   */
  @VsoMethod
  public void setVcpus(Integer  vcpus) {
    this.vcpus = vcpus;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CloudFlavor objCloudFlavor = (CloudFlavor) o;
  return   Objects.equals(this.id, objCloudFlavor.id)&&
  Objects.equals(this.name, objCloudFlavor.name)&&
  Objects.equals(this.ramMb, objCloudFlavor.ramMb)&&
  Objects.equals(this.diskGb, objCloudFlavor.diskGb)&&
  Objects.equals(this.vcpus, objCloudFlavor.vcpus)&&
  Objects.equals(this.publics, objCloudFlavor.publics)&&
  Objects.equals(this.maxNics, objCloudFlavor.maxNics)&&
  Objects.equals(this.maxIpsPerNic, objCloudFlavor.maxIpsPerNic)&&
  Objects.equals(this.enhancedNw, objCloudFlavor.enhancedNw)&&
  Objects.equals(this.meta, objCloudFlavor.meta)&&
  Objects.equals(this.cost, objCloudFlavor.cost)&&
  Objects.equals(this.maxIp6SPerNic, objCloudFlavor.maxIp6SPerNic)&&
  Objects.equals(this.isRecommended, objCloudFlavor.isRecommended);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CloudFlavor {\n");
      sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
        sb.append("    diskGb: ").append(toIndentedString(diskGb)).append("\n");
        sb.append("    enhancedNw: ").append(toIndentedString(enhancedNw)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isRecommended: ").append(toIndentedString(isRecommended)).append("\n");
        sb.append("    maxIp6SPerNic: ").append(toIndentedString(maxIp6SPerNic)).append("\n");
        sb.append("    maxIpsPerNic: ").append(toIndentedString(maxIpsPerNic)).append("\n");
        sb.append("    maxNics: ").append(toIndentedString(maxNics)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    publics: ").append(toIndentedString(publics)).append("\n");
        sb.append("    ramMb: ").append(toIndentedString(ramMb)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
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

