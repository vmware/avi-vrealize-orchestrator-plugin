package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.BfdProfile;
import com.vmware.avi.vro.model.BgpProfile;
import com.vmware.avi.vro.model.DebugVrfContext;
import com.vmware.avi.vro.model.InternalGatewayMonitor;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VrfContext is a POJO class extends AviRestResource that used for creating
 * VrfContext.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VrfContext")
@VsoFinder(name = Constants.FINDER_VRO_VRFCONTEXT, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VrfContext extends AviRestResource {
    @JsonProperty("attrs")
    @JsonInclude(Include.NON_NULL)
    private List<KeyValue> attrs;

    @JsonProperty("bfd_profile")
    @JsonInclude(Include.NON_NULL)
    private BfdProfile bfdProfile;

    @JsonProperty("bgp_profile")
    @JsonInclude(Include.NON_NULL)
    private BgpProfile bgpProfile;

    @JsonProperty("cloud_ref")
    @JsonInclude(Include.NON_NULL)
    private String cloudRef;

    @JsonProperty("debugvrfcontext")
    @JsonInclude(Include.NON_NULL)
    private DebugVrfContext debugvrfcontext;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("gateway_mon")
    @JsonInclude(Include.NON_NULL)
    private List<GatewayMonitor> gatewayMon;

    @JsonProperty("internal_gateway_monitor")
    @JsonInclude(Include.NON_NULL)
    private InternalGatewayMonitor internalGatewayMonitor;

    @JsonProperty("lldp_enable")
    @JsonInclude(Include.NON_NULL)
    private Boolean lldpEnable = true;

    @JsonProperty("markers")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("static_routes")
    @JsonInclude(Include.NON_NULL)
    private List<StaticRoute> staticRoutes;

    @JsonProperty("system_default")
    @JsonInclude(Include.NON_NULL)
    private Boolean systemDefault = false;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Key/value vrfcontext attributes.
   * Field introduced in 20.1.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attrs
   */
  @VsoMethod
  public List<KeyValue> getAttrs() {
    return attrs;
  }

  /**
   * This is the setter method. this will set the attrs
   * Key/value vrfcontext attributes.
   * Field introduced in 20.1.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attrs
   */
  @VsoMethod
  public void setAttrs(List<KeyValue>  attrs) {
    this.attrs = attrs;
  }

  /**
   * This is the setter method this will set the attrs
   * Key/value vrfcontext attributes.
   * Field introduced in 20.1.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attrs
   */
  @VsoMethod
  public VrfContext addAttrsItem(KeyValue attrsItem) {
    if (this.attrs == null) {
      this.attrs = new ArrayList<KeyValue>();
    }
    this.attrs.add(attrsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Bfd configuration profile.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return bfdProfile
   */
  @VsoMethod
  public BfdProfile getBfdProfile() {
    return bfdProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Bfd configuration profile.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param bfdProfile set the bfdProfile.
   */
  @VsoMethod
  public void setBfdProfile(BfdProfile bfdProfile) {
    this.bfdProfile = bfdProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Bgp local and peer info.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return bgpProfile
   */
  @VsoMethod
  public BgpProfile getBgpProfile() {
    return bgpProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Bgp local and peer info.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param bgpProfile set the bgpProfile.
   */
  @VsoMethod
  public void setBgpProfile(BgpProfile bgpProfile) {
    this.bgpProfile = bgpProfile;
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
   * Configure debug flags for vrf.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return debugvrfcontext
   */
  @VsoMethod
  public DebugVrfContext getDebugvrfcontext() {
    return debugvrfcontext;
  }

  /**
   * This is the setter method to the attribute.
   * Configure debug flags for vrf.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param debugvrfcontext set the debugvrfcontext.
   */
  @VsoMethod
  public void setDebugvrfcontext(DebugVrfContext debugvrfcontext) {
    this.debugvrfcontext = debugvrfcontext;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure ping based heartbeat check for gateway in service engines of vrf.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gatewayMon
   */
  @VsoMethod
  public List<GatewayMonitor> getGatewayMon() {
    return gatewayMon;
  }

  /**
   * This is the setter method. this will set the gatewayMon
   * Configure ping based heartbeat check for gateway in service engines of vrf.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gatewayMon
   */
  @VsoMethod
  public void setGatewayMon(List<GatewayMonitor>  gatewayMon) {
    this.gatewayMon = gatewayMon;
  }

  /**
   * This is the setter method this will set the gatewayMon
   * Configure ping based heartbeat check for gateway in service engines of vrf.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gatewayMon
   */
  @VsoMethod
  public VrfContext addGatewayMonItem(GatewayMonitor gatewayMonItem) {
    if (this.gatewayMon == null) {
      this.gatewayMon = new ArrayList<GatewayMonitor>();
    }
    this.gatewayMon.add(gatewayMonItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Configure ping based heartbeat check for all default gateways in service engines of vrf.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return internalGatewayMonitor
   */
  @VsoMethod
  public InternalGatewayMonitor getInternalGatewayMonitor() {
    return internalGatewayMonitor;
  }

  /**
   * This is the setter method to the attribute.
   * Configure ping based heartbeat check for all default gateways in service engines of vrf.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param internalGatewayMonitor set the internalGatewayMonitor.
   */
  @VsoMethod
  public void setInternalGatewayMonitor(InternalGatewayMonitor internalGatewayMonitor) {
    this.internalGatewayMonitor = internalGatewayMonitor;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable lldp.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return lldpEnable
   */
  @VsoMethod
  public Boolean getLldpEnable() {
    return lldpEnable;
  }

  /**
   * This is the setter method to the attribute.
   * Enable lldp.
   * Field introduced in 18.2.10, 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param lldpEnable set the lldpEnable.
   */
  @VsoMethod
  public void setLldpEnable(Boolean  lldpEnable) {
    this.lldpEnable = lldpEnable;
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
  public VrfContext addMarkersItem(RoleFilterMatchLabel markersItem) {
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
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return staticRoutes
   */
  @VsoMethod
  public List<StaticRoute> getStaticRoutes() {
    return staticRoutes;
  }

  /**
   * This is the setter method. this will set the staticRoutes
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return staticRoutes
   */
  @VsoMethod
  public void setStaticRoutes(List<StaticRoute>  staticRoutes) {
    this.staticRoutes = staticRoutes;
  }

  /**
   * This is the setter method this will set the staticRoutes
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return staticRoutes
   */
  @VsoMethod
  public VrfContext addStaticRoutesItem(StaticRoute staticRoutesItem) {
    if (this.staticRoutes == null) {
      this.staticRoutes = new ArrayList<StaticRoute>();
    }
    this.staticRoutes.add(staticRoutesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return systemDefault
   */
  @VsoMethod
  public Boolean getSystemDefault() {
    return systemDefault;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param systemDefault set the systemDefault.
   */
  @VsoMethod
  public void setSystemDefault(Boolean  systemDefault) {
    this.systemDefault = systemDefault;
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
  VrfContext objVrfContext = (VrfContext) o;
  return   Objects.equals(this.uuid, objVrfContext.uuid)&&
  Objects.equals(this.name, objVrfContext.name)&&
  Objects.equals(this.staticRoutes, objVrfContext.staticRoutes)&&
  Objects.equals(this.bgpProfile, objVrfContext.bgpProfile)&&
  Objects.equals(this.systemDefault, objVrfContext.systemDefault)&&
  Objects.equals(this.gatewayMon, objVrfContext.gatewayMon)&&
  Objects.equals(this.internalGatewayMonitor, objVrfContext.internalGatewayMonitor)&&
  Objects.equals(this.debugvrfcontext, objVrfContext.debugvrfcontext)&&
  Objects.equals(this.bfdProfile, objVrfContext.bfdProfile)&&
  Objects.equals(this.lldpEnable, objVrfContext.lldpEnable)&&
  Objects.equals(this.attrs, objVrfContext.attrs)&&
  Objects.equals(this.markers, objVrfContext.markers)&&
  Objects.equals(this.description, objVrfContext.description)&&
  Objects.equals(this.tenantRef, objVrfContext.tenantRef)&&
  Objects.equals(this.cloudRef, objVrfContext.cloudRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VrfContext {\n");
      sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
        sb.append("    bfdProfile: ").append(toIndentedString(bfdProfile)).append("\n");
        sb.append("    bgpProfile: ").append(toIndentedString(bgpProfile)).append("\n");
        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
        sb.append("    debugvrfcontext: ").append(toIndentedString(debugvrfcontext)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    gatewayMon: ").append(toIndentedString(gatewayMon)).append("\n");
        sb.append("    internalGatewayMonitor: ").append(toIndentedString(internalGatewayMonitor)).append("\n");
        sb.append("    lldpEnable: ").append(toIndentedString(lldpEnable)).append("\n");
        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    staticRoutes: ").append(toIndentedString(staticRoutes)).append("\n");
        sb.append("    systemDefault: ").append(toIndentedString(systemDefault)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

