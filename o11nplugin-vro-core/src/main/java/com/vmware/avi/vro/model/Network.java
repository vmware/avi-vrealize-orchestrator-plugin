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
 * The Network is a POJO class extends AviRestResource that used for creating
 * Network.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Network")
@VsoFinder(name = Constants.FINDER_VRO_NETWORK, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Network extends AviRestResource {
    @JsonProperty("attrs")
    @JsonInclude(Include.NON_NULL)
    private List<KeyValue> attrs;

    @JsonProperty("cloud_ref")
    @JsonInclude(Include.NON_NULL)
    private String cloudRef;

    @JsonProperty("configured_subnets")
    @JsonInclude(Include.NON_NULL)
    private List<Subnet> configuredSubnets;

    @JsonProperty("dhcp_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean dhcpEnabled = true;

    @JsonProperty("exclude_discovered_subnets")
    @JsonInclude(Include.NON_NULL)
    private Boolean excludeDiscoveredSubnets = false;

    @JsonProperty("ip6_autocfg_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean ip6AutocfgEnabled = true;

    @JsonProperty("markers")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("synced_from_se")
    @JsonInclude(Include.NON_NULL)
    private Boolean syncedFromSe = false;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("vcenter_dvs")
    @JsonInclude(Include.NON_NULL)
    private Boolean vcenterDvs = true;

    @JsonProperty("vimgrnw_ref")
    @JsonInclude(Include.NON_NULL)
    private String vimgrnwRef;

    @JsonProperty("vrf_context_ref")
    @JsonInclude(Include.NON_NULL)
    private String vrfContextRef;



  /**
   * This is the getter method this will return the attribute value.
   * Key/value network attributes.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attrs
   */
  @VsoMethod
  public List<KeyValue> getAttrs() {
    return attrs;
  }

  /**
   * This is the setter method. this will set the attrs
   * Key/value network attributes.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attrs
   */
  @VsoMethod
  public void setAttrs(List<KeyValue>  attrs) {
    this.attrs = attrs;
  }

  /**
   * This is the setter method this will set the attrs
   * Key/value network attributes.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attrs
   */
  @VsoMethod
  public Network addAttrsItem(KeyValue attrsItem) {
    if (this.attrs == null) {
      this.attrs = new ArrayList<KeyValue>();
    }
    this.attrs.add(attrsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type cloud.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudRef
   */
  @VsoMethod
  public String getCloudRef() {
    return cloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type cloud.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudRef set the cloudRef.
   */
  @VsoMethod
  public void setCloudRef(String  cloudRef) {
    this.cloudRef = cloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return configuredSubnets
   */
  @VsoMethod
  public List<Subnet> getConfiguredSubnets() {
    return configuredSubnets;
  }

  /**
   * This is the setter method. this will set the configuredSubnets
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return configuredSubnets
   */
  @VsoMethod
  public void setConfiguredSubnets(List<Subnet>  configuredSubnets) {
    this.configuredSubnets = configuredSubnets;
  }

  /**
   * This is the setter method this will set the configuredSubnets
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return configuredSubnets
   */
  @VsoMethod
  public Network addConfiguredSubnetsItem(Subnet configuredSubnetsItem) {
    if (this.configuredSubnets == null) {
      this.configuredSubnets = new ArrayList<Subnet>();
    }
    this.configuredSubnets.add(configuredSubnetsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Select the ip address management scheme for this network.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return dhcpEnabled
   */
  @VsoMethod
  public Boolean getDhcpEnabled() {
    return dhcpEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Select the ip address management scheme for this network.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param dhcpEnabled set the dhcpEnabled.
   */
  @VsoMethod
  public void setDhcpEnabled(Boolean  dhcpEnabled) {
    this.dhcpEnabled = dhcpEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * When selected, excludes all discovered subnets in this network from consideration for virtual service placement.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return excludeDiscoveredSubnets
   */
  @VsoMethod
  public Boolean getExcludeDiscoveredSubnets() {
    return excludeDiscoveredSubnets;
  }

  /**
   * This is the setter method to the attribute.
   * When selected, excludes all discovered subnets in this network from consideration for virtual service placement.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param excludeDiscoveredSubnets set the excludeDiscoveredSubnets.
   */
  @VsoMethod
  public void setExcludeDiscoveredSubnets(Boolean  excludeDiscoveredSubnets) {
    this.excludeDiscoveredSubnets = excludeDiscoveredSubnets;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable ipv6 auto configuration.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return ip6AutocfgEnabled
   */
  @VsoMethod
  public Boolean getIp6AutocfgEnabled() {
    return ip6AutocfgEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable ipv6 auto configuration.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param ip6AutocfgEnabled set the ip6AutocfgEnabled.
   */
  @VsoMethod
  public void setIp6AutocfgEnabled(Boolean  ip6AutocfgEnabled) {
    this.ip6AutocfgEnabled = ip6AutocfgEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public List<RoleFilterMatchLabel> getMarkers() {
    return markers;
  }

  /**
   * This is the setter method. this will set the markers
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public void setMarkers(List<RoleFilterMatchLabel>  markers) {
    this.markers = markers;
  }

  /**
   * This is the setter method this will set the markers
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public Network addMarkersItem(RoleFilterMatchLabel markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<RoleFilterMatchLabel>();
    }
    this.markers.add(markersItem);
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
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return syncedFromSe
   */
  @VsoMethod
  public Boolean getSyncedFromSe() {
    return syncedFromSe;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param syncedFromSe set the syncedFromSe.
   */
  @VsoMethod
  public void setSyncedFromSe(Boolean  syncedFromSe) {
    this.syncedFromSe = syncedFromSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return vcenterDvs
   */
  @VsoMethod
  public Boolean getVcenterDvs() {
    return vcenterDvs;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param vcenterDvs set the vcenterDvs.
   */
  @VsoMethod
  public void setVcenterDvs(Boolean  vcenterDvs) {
    this.vcenterDvs = vcenterDvs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type vimgrnwruntime.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return vimgrnwRef
   */
  @VsoMethod
  public String getVimgrnwRef() {
    return vimgrnwRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type vimgrnwruntime.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param vimgrnwRef set the vimgrnwRef.
   */
  @VsoMethod
  public void setVimgrnwRef(String  vimgrnwRef) {
    this.vimgrnwRef = vimgrnwRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type vrfcontext.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vrfContextRef
   */
  @VsoMethod
  public String getVrfContextRef() {
    return vrfContextRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type vrfcontext.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vrfContextRef set the vrfContextRef.
   */
  @VsoMethod
  public void setVrfContextRef(String  vrfContextRef) {
    this.vrfContextRef = vrfContextRef;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  Network objNetwork = (Network) o;
  return   Objects.equals(this.uuid, objNetwork.uuid)&&
  Objects.equals(this.name, objNetwork.name)&&
  Objects.equals(this.vcenterDvs, objNetwork.vcenterDvs)&&
  Objects.equals(this.vimgrnwRef, objNetwork.vimgrnwRef)&&
  Objects.equals(this.dhcpEnabled, objNetwork.dhcpEnabled)&&
  Objects.equals(this.excludeDiscoveredSubnets, objNetwork.excludeDiscoveredSubnets)&&
  Objects.equals(this.configuredSubnets, objNetwork.configuredSubnets)&&
  Objects.equals(this.vrfContextRef, objNetwork.vrfContextRef)&&
  Objects.equals(this.syncedFromSe, objNetwork.syncedFromSe)&&
  Objects.equals(this.tenantRef, objNetwork.tenantRef)&&
  Objects.equals(this.cloudRef, objNetwork.cloudRef)&&
  Objects.equals(this.ip6AutocfgEnabled, objNetwork.ip6AutocfgEnabled)&&
  Objects.equals(this.attrs, objNetwork.attrs)&&
  Objects.equals(this.markers, objNetwork.markers);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Network {\n");
      sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
        sb.append("    configuredSubnets: ").append(toIndentedString(configuredSubnets)).append("\n");
        sb.append("    dhcpEnabled: ").append(toIndentedString(dhcpEnabled)).append("\n");
        sb.append("    excludeDiscoveredSubnets: ").append(toIndentedString(excludeDiscoveredSubnets)).append("\n");
        sb.append("    ip6AutocfgEnabled: ").append(toIndentedString(ip6AutocfgEnabled)).append("\n");
        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    syncedFromSe: ").append(toIndentedString(syncedFromSe)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vcenterDvs: ").append(toIndentedString(vcenterDvs)).append("\n");
        sb.append("    vimgrnwRef: ").append(toIndentedString(vimgrnwRef)).append("\n");
        sb.append("    vrfContextRef: ").append(toIndentedString(vrfContextRef)).append("\n");
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

