package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AuthenticationPolicy;
import com.vmware.avi.vro.model.AuthorizationPolicy;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SSOPolicy is a POJO class extends AviRestResource that used for creating
 * SSOPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SSOPolicy")
@VsoFinder(name = Constants.FINDER_VRO_SSOPOLICY, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SSOPolicy extends AviRestResource {
    @JsonProperty("authentication_policy")
    @JsonInclude(Include.NON_NULL)
    private AuthenticationPolicy authenticationPolicy;

    @JsonProperty("authorization_policy")
    @JsonInclude(Include.NON_NULL)
    private AuthorizationPolicy authorizationPolicy;

    @JsonProperty("markers")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = "SSO_TYPE_SAML";

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Authentication policy settings.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authenticationPolicy
   */
  @VsoMethod
  public AuthenticationPolicy getAuthenticationPolicy() {
    return authenticationPolicy;
  }

  /**
   * This is the setter method to the attribute.
   * Authentication policy settings.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param authenticationPolicy set the authenticationPolicy.
   */
  @VsoMethod
  public void setAuthenticationPolicy(AuthenticationPolicy authenticationPolicy) {
    this.authenticationPolicy = authenticationPolicy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Authorization policy settings.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authorizationPolicy
   */
  @VsoMethod
  public AuthorizationPolicy getAuthorizationPolicy() {
    return authorizationPolicy;
  }

  /**
   * This is the setter method to the attribute.
   * Authorization policy settings.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param authorizationPolicy set the authorizationPolicy.
   */
  @VsoMethod
  public void setAuthorizationPolicy(AuthorizationPolicy authorizationPolicy) {
    this.authorizationPolicy = authorizationPolicy;
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
  public SSOPolicy addMarkersItem(RoleFilterMatchLabel markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<RoleFilterMatchLabel>();
    }
    this.markers.add(markersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name of the sso policy.
   * Field introduced in 18.2.3.
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
   * Name of the sso policy.
   * Field introduced in 18.2.3.
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
   * Uuid of the tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.3.
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
   * Uuid of the tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.3.
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
   * Sso policy type.
   * Enum options - SSO_TYPE_SAML, SSO_TYPE_PINGACCESS, SSO_TYPE_JWT, SSO_TYPE_LDAP, SSO_TYPE_OAUTH.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition(allowed values- sso_type_saml, sso_type_jwt,
   * sso_type_ldap, sso_type_oauth), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SSO_TYPE_SAML".
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Sso policy type.
   * Enum options - SSO_TYPE_SAML, SSO_TYPE_PINGACCESS, SSO_TYPE_JWT, SSO_TYPE_LDAP, SSO_TYPE_OAUTH.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition(allowed values- sso_type_saml, sso_type_jwt,
   * sso_type_ldap, sso_type_oauth), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SSO_TYPE_SAML".
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
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
   * Uuid of the sso policy.
   * Field introduced in 18.2.3.
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
   * Uuid of the sso policy.
   * Field introduced in 18.2.3.
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
  SSOPolicy objSSOPolicy = (SSOPolicy) o;
  return   Objects.equals(this.uuid, objSSOPolicy.uuid)&&
  Objects.equals(this.name, objSSOPolicy.name)&&
  Objects.equals(this.authenticationPolicy, objSSOPolicy.authenticationPolicy)&&
  Objects.equals(this.authorizationPolicy, objSSOPolicy.authorizationPolicy)&&
  Objects.equals(this.type, objSSOPolicy.type)&&
  Objects.equals(this.markers, objSSOPolicy.markers)&&
  Objects.equals(this.tenantRef, objSSOPolicy.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SSOPolicy {\n");
      sb.append("    authenticationPolicy: ").append(toIndentedString(authenticationPolicy)).append("\n");
        sb.append("    authorizationPolicy: ").append(toIndentedString(authorizationPolicy)).append("\n");
        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

