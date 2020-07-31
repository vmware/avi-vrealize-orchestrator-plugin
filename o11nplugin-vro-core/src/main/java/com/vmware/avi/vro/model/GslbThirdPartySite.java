package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GslbGeoLocation;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbThirdPartySite is a POJO class extends AviRestResource that used for creating
 * GslbThirdPartySite.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbThirdPartySite")
@VsoFinder(name = Constants.FINDER_VRO_GSLBTHIRDPARTYSITE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbThirdPartySite extends AviRestResource {
  @JsonProperty("cluster_uuid")
  @JsonInclude(Include.NON_NULL)
  private String clusterUuid = null;

  @JsonProperty("enabled")
  @JsonInclude(Include.NON_NULL)
  private Boolean enabled = true;

  @JsonProperty("hm_proxies")
  @JsonInclude(Include.NON_NULL)
  private List<GslbHealthMonitorProxy> hmProxies = null;

  @JsonProperty("location")
  @JsonInclude(Include.NON_NULL)
  private GslbGeoLocation location = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("ratio")
  @JsonInclude(Include.NON_NULL)
  private Integer ratio = null;

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Third-party-site identifier generated by avi.
   * Field introduced in 17.1.1.
   * @return clusterUuid
   */
  @VsoMethod
  public String getClusterUuid() {
    return clusterUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Third-party-site identifier generated by avi.
   * Field introduced in 17.1.1.
   * @param clusterUuid set the clusterUuid.
   */
  @VsoMethod
  public void setClusterUuid(String  clusterUuid) {
    this.clusterUuid = clusterUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable or disable the third-party site.
   * This is useful in maintenance scenarios such as upgrade and routine maintenance.
   * A disabled site's configuration shall be retained  but it will not get any new configuration updates.
   * Vips associated with the disabled site shall not be sent in dns response.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable or disable the third-party site.
   * This is useful in maintenance scenarios such as upgrade and routine maintenance.
   * A disabled site's configuration shall be retained  but it will not get any new configuration updates.
   * Vips associated with the disabled site shall not be sent in dns response.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User can designate certain avi sites to run health monitor probes for vips/vs(es) for this site.
   * This is useful in network deployments where the vips/vs(es) are reachable only from certain sites.
   * A typical scenario is a firewall between two gslb sites.
   * User may want to run health monitor probes from sites on either side of the firewall so that each designated site can derive a datapath view of
   * the reachable members.
   * If the health monitor proxies are not configured, then the default behavior is to run health monitor probes from all the active sites.
   * Field introduced in 17.1.1.
   * @return hmProxies
   */
  @VsoMethod
  public List<GslbHealthMonitorProxy> getHmProxies() {
    return hmProxies;
  }

  /**
   * This is the setter method. this will set the hmProxies
   * User can designate certain avi sites to run health monitor probes for vips/vs(es) for this site.
   * This is useful in network deployments where the vips/vs(es) are reachable only from certain sites.
   * A typical scenario is a firewall between two gslb sites.
   * User may want to run health monitor probes from sites on either side of the firewall so that each designated site can derive a datapath view of
   * the reachable members.
   * If the health monitor proxies are not configured, then the default behavior is to run health monitor probes from all the active sites.
   * Field introduced in 17.1.1.
   * @return hmProxies
   */
  @VsoMethod
  public void setHmProxies(List<GslbHealthMonitorProxy>  hmProxies) {
    this.hmProxies = hmProxies;
  }

  /**
   * This is the setter method this will set the hmProxies
   * User can designate certain avi sites to run health monitor probes for vips/vs(es) for this site.
   * This is useful in network deployments where the vips/vs(es) are reachable only from certain sites.
   * A typical scenario is a firewall between two gslb sites.
   * User may want to run health monitor probes from sites on either side of the firewall so that each designated site can derive a datapath view of
   * the reachable members.
   * If the health monitor proxies are not configured, then the default behavior is to run health monitor probes from all the active sites.
   * Field introduced in 17.1.1.
   * @return hmProxies
   */
  @VsoMethod
  public GslbThirdPartySite addHmProxiesItem(GslbHealthMonitorProxy hmProxiesItem) {
    if (this.hmProxies == null) {
      this.hmProxies = new ArrayList<GslbHealthMonitorProxy>();
    }
    this.hmProxies.add(hmProxiesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Geographic location of the site.
   * Field introduced in 17.1.1.
   * @return location
   */
  @VsoMethod
  public GslbGeoLocation getLocation() {
    return location;
  }

  /**
   * This is the setter method to the attribute.
   * Geographic location of the site.
   * Field introduced in 17.1.1.
   * @param location set the location.
   */
  @VsoMethod
  public void setLocation(GslbGeoLocation location) {
    this.location = location;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the third-party site.
   * Field introduced in 17.1.1.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the third-party site.
   * Field introduced in 17.1.1.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User can overide the individual gslbpoolmember ratio for all the vips of this site.
   * If this field is not configured, then the gslbpoolmember ratio gets applied.
   * Allowed values are 1-20.
   * Field introduced in 17.1.1.
   * @return ratio
   */
  @VsoMethod
  public Integer getRatio() {
    return ratio;
  }

  /**
   * This is the setter method to the attribute.
   * User can overide the individual gslbpoolmember ratio for all the vips of this site.
   * If this field is not configured, then the gslbpoolmember ratio gets applied.
   * Allowed values are 1-20.
   * Field introduced in 17.1.1.
   * @param ratio set the ratio.
   */
  @VsoMethod
  public void setRatio(Integer  ratio) {
    this.ratio = ratio;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field is used as a key in the datastore for the gslbthirdpartysite table to encapsulate site-related info.
   * Field introduced in 17.2.5.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * This field is used as a key in the datastore for the gslbthirdpartysite table to encapsulate site-related info.
   * Field introduced in 17.2.5.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbThirdPartySite objGslbThirdPartySite = (GslbThirdPartySite) o;
  return   Objects.equals(this.clusterUuid, objGslbThirdPartySite.clusterUuid)&&
  Objects.equals(this.name, objGslbThirdPartySite.name)&&
  Objects.equals(this.enabled, objGslbThirdPartySite.enabled)&&
  Objects.equals(this.location, objGslbThirdPartySite.location)&&
  Objects.equals(this.hmProxies, objGslbThirdPartySite.hmProxies)&&
  Objects.equals(this.ratio, objGslbThirdPartySite.ratio)&&
  Objects.equals(this.uuid, objGslbThirdPartySite.uuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbThirdPartySite {\n");
      sb.append("    clusterUuid: ").append(toIndentedString(clusterUuid)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    hmProxies: ").append(toIndentedString(hmProxies)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

