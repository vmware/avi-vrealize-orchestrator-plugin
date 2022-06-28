package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AppCookiePersistenceProfile;
import com.vmware.avi.vro.model.HdrPersistenceProfile;
import com.vmware.avi.vro.model.HttpCookiePersistenceProfile;
import com.vmware.avi.vro.model.IPPersistenceProfile;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ApplicationPersistenceProfile is a POJO class extends AviRestResource that used for creating
 * ApplicationPersistenceProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApplicationPersistenceProfile")
@VsoFinder(name = Constants.FINDER_VRO_APPLICATIONPERSISTENCEPROFILE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApplicationPersistenceProfile extends AviRestResource {
    @JsonProperty("app_cookie_persistence_profile")
    @JsonInclude(Include.NON_NULL)
    private AppCookiePersistenceProfile appCookiePersistenceProfile = null;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description = null;

    @JsonProperty("hdr_persistence_profile")
    @JsonInclude(Include.NON_NULL)
    private HdrPersistenceProfile hdrPersistenceProfile = null;

    @JsonProperty("http_cookie_persistence_profile")
    @JsonInclude(Include.NON_NULL)
    private HttpCookiePersistenceProfile httpCookiePersistenceProfile = null;

    @JsonProperty("ip_persistence_profile")
    @JsonInclude(Include.NON_NULL)
    private IPPersistenceProfile ipPersistenceProfile = null;

    @JsonProperty("is_federated")
    @JsonInclude(Include.NON_NULL)
    private Boolean isFederated = false;

    @JsonProperty("markers")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markers = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("persistence_type")
    @JsonInclude(Include.NON_NULL)
    private String persistenceType = "PERSISTENCE_TYPE_CLIENT_IP_ADDRESS";

    @JsonProperty("server_hm_down_recovery")
    @JsonInclude(Include.NON_NULL)
    private String serverHmDownRecovery = "HM_DOWN_PICK_NEW_SERVER";

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Specifies the application cookie persistence profile parameters.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return appCookiePersistenceProfile
   */
  @VsoMethod
  public AppCookiePersistenceProfile getAppCookiePersistenceProfile() {
    return appCookiePersistenceProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the application cookie persistence profile parameters.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param appCookiePersistenceProfile set the appCookiePersistenceProfile.
   */
  @VsoMethod
  public void setAppCookiePersistenceProfile(AppCookiePersistenceProfile appCookiePersistenceProfile) {
    this.appCookiePersistenceProfile = appCookiePersistenceProfile;
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
   * Specifies the custom http header persistence profile parameters.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hdrPersistenceProfile
   */
  @VsoMethod
  public HdrPersistenceProfile getHdrPersistenceProfile() {
    return hdrPersistenceProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the custom http header persistence profile parameters.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hdrPersistenceProfile set the hdrPersistenceProfile.
   */
  @VsoMethod
  public void setHdrPersistenceProfile(HdrPersistenceProfile hdrPersistenceProfile) {
    this.hdrPersistenceProfile = hdrPersistenceProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies the http cookie persistence profile parameters.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpCookiePersistenceProfile
   */
  @VsoMethod
  public HttpCookiePersistenceProfile getHttpCookiePersistenceProfile() {
    return httpCookiePersistenceProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the http cookie persistence profile parameters.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param httpCookiePersistenceProfile set the httpCookiePersistenceProfile.
   */
  @VsoMethod
  public void setHttpCookiePersistenceProfile(HttpCookiePersistenceProfile httpCookiePersistenceProfile) {
    this.httpCookiePersistenceProfile = httpCookiePersistenceProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies the client ip persistence profile parameters.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipPersistenceProfile
   */
  @VsoMethod
  public IPPersistenceProfile getIpPersistenceProfile() {
    return ipPersistenceProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the client ip persistence profile parameters.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipPersistenceProfile set the ipPersistenceProfile.
   */
  @VsoMethod
  public void setIpPersistenceProfile(IPPersistenceProfile ipPersistenceProfile) {
    this.ipPersistenceProfile = ipPersistenceProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field describes the object's replication scope.
   * If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.
   * If the field is set to true, then the object is replicated across the federation.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isFederated
   */
  @VsoMethod
  public Boolean getIsFederated() {
    return isFederated;
  }

  /**
   * This is the setter method to the attribute.
   * This field describes the object's replication scope.
   * If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.
   * If the field is set to true, then the object is replicated across the federation.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isFederated set the isFederated.
   */
  @VsoMethod
  public void setIsFederated(Boolean  isFederated) {
    this.isFederated = isFederated;
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
  public ApplicationPersistenceProfile addMarkersItem(RoleFilterMatchLabel markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<RoleFilterMatchLabel>();
    }
    this.markers.add(markersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * A user-friendly name for the persistence profile.
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
   * A user-friendly name for the persistence profile.
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
   * Method used to persist clients to the same server for a duration of time or a session.
   * Enum options - PERSISTENCE_TYPE_CLIENT_IP_ADDRESS, PERSISTENCE_TYPE_HTTP_COOKIE, PERSISTENCE_TYPE_TLS, PERSISTENCE_TYPE_CLIENT_IPV6_ADDRESS,
   * PERSISTENCE_TYPE_CUSTOM_HTTP_HEADER, PERSISTENCE_TYPE_APP_COOKIE, PERSISTENCE_TYPE_GSLB_SITE.
   * Allowed in enterprise edition with any value, essentials edition(allowed values-
   * persistence_type_client_ip_address,persistence_type_http_cookie), basic edition(allowed values-
   * persistence_type_client_ip_address,persistence_type_http_cookie), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "PERSISTENCE_TYPE_CLIENT_IP_ADDRESS".
   * @return persistenceType
   */
  @VsoMethod
  public String getPersistenceType() {
    return persistenceType;
  }

  /**
   * This is the setter method to the attribute.
   * Method used to persist clients to the same server for a duration of time or a session.
   * Enum options - PERSISTENCE_TYPE_CLIENT_IP_ADDRESS, PERSISTENCE_TYPE_HTTP_COOKIE, PERSISTENCE_TYPE_TLS, PERSISTENCE_TYPE_CLIENT_IPV6_ADDRESS,
   * PERSISTENCE_TYPE_CUSTOM_HTTP_HEADER, PERSISTENCE_TYPE_APP_COOKIE, PERSISTENCE_TYPE_GSLB_SITE.
   * Allowed in enterprise edition with any value, essentials edition(allowed values-
   * persistence_type_client_ip_address,persistence_type_http_cookie), basic edition(allowed values-
   * persistence_type_client_ip_address,persistence_type_http_cookie), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "PERSISTENCE_TYPE_CLIENT_IP_ADDRESS".
   * @param persistenceType set the persistenceType.
   */
  @VsoMethod
  public void setPersistenceType(String  persistenceType) {
    this.persistenceType = persistenceType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies behavior when a persistent server has been marked down by a health monitor.
   * Enum options - HM_DOWN_PICK_NEW_SERVER, HM_DOWN_ABORT_CONNECTION, HM_DOWN_CONTINUE_PERSISTENT_SERVER.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- hm_down_pick_new_server), basic edition(allowed values-
   * hm_down_pick_new_server), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "HM_DOWN_PICK_NEW_SERVER".
   * @return serverHmDownRecovery
   */
  @VsoMethod
  public String getServerHmDownRecovery() {
    return serverHmDownRecovery;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies behavior when a persistent server has been marked down by a health monitor.
   * Enum options - HM_DOWN_PICK_NEW_SERVER, HM_DOWN_ABORT_CONNECTION, HM_DOWN_CONTINUE_PERSISTENT_SERVER.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- hm_down_pick_new_server), basic edition(allowed values-
   * hm_down_pick_new_server), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "HM_DOWN_PICK_NEW_SERVER".
   * @param serverHmDownRecovery set the serverHmDownRecovery.
   */
  @VsoMethod
  public void setServerHmDownRecovery(String  serverHmDownRecovery) {
    this.serverHmDownRecovery = serverHmDownRecovery;
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
   * Uuid of the persistence profile.
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
   * Uuid of the persistence profile.
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
  ApplicationPersistenceProfile objApplicationPersistenceProfile = (ApplicationPersistenceProfile) o;
  return   Objects.equals(this.uuid, objApplicationPersistenceProfile.uuid)&&
  Objects.equals(this.name, objApplicationPersistenceProfile.name)&&
  Objects.equals(this.serverHmDownRecovery, objApplicationPersistenceProfile.serverHmDownRecovery)&&
  Objects.equals(this.persistenceType, objApplicationPersistenceProfile.persistenceType)&&
  Objects.equals(this.ipPersistenceProfile, objApplicationPersistenceProfile.ipPersistenceProfile)&&
  Objects.equals(this.hdrPersistenceProfile, objApplicationPersistenceProfile.hdrPersistenceProfile)&&
  Objects.equals(this.appCookiePersistenceProfile, objApplicationPersistenceProfile.appCookiePersistenceProfile)&&
  Objects.equals(this.httpCookiePersistenceProfile, objApplicationPersistenceProfile.httpCookiePersistenceProfile)&&
  Objects.equals(this.markers, objApplicationPersistenceProfile.markers)&&
  Objects.equals(this.isFederated, objApplicationPersistenceProfile.isFederated)&&
  Objects.equals(this.description, objApplicationPersistenceProfile.description)&&
  Objects.equals(this.tenantRef, objApplicationPersistenceProfile.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApplicationPersistenceProfile {\n");
      sb.append("    appCookiePersistenceProfile: ").append(toIndentedString(appCookiePersistenceProfile)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    hdrPersistenceProfile: ").append(toIndentedString(hdrPersistenceProfile)).append("\n");
        sb.append("    httpCookiePersistenceProfile: ").append(toIndentedString(httpCookiePersistenceProfile)).append("\n");
        sb.append("    ipPersistenceProfile: ").append(toIndentedString(ipPersistenceProfile)).append("\n");
        sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    persistenceType: ").append(toIndentedString(persistenceType)).append("\n");
        sb.append("    serverHmDownRecovery: ").append(toIndentedString(serverHmDownRecovery)).append("\n");
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

