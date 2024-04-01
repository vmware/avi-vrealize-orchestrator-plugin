package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AuthProfileHTTPClientParams;
import com.vmware.avi.vro.model.LdapAuthSettings;
import com.vmware.avi.vro.model.OAuthProfile;
import com.vmware.avi.vro.model.SamlSettings;
import com.vmware.avi.vro.model.TacacsPlusAuthSettings;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The AuthProfile is a POJO class extends AviRestResource that used for creating
 * AuthProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AuthProfile")
@VsoFinder(name = Constants.FINDER_VRO_AUTHPROFILE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AuthProfile extends AviRestResource {
    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("http")
    @JsonInclude(Include.NON_NULL)
    private AuthProfileHTTPClientParams http;

    @JsonProperty("jwt_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String jwtProfileRef;

    @JsonProperty("ldap")
    @JsonInclude(Include.NON_NULL)
    private LdapAuthSettings ldap;

    @JsonProperty("markers")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("oauth_profile")
    @JsonInclude(Include.NON_NULL)
    private OAuthProfile oauthProfile;

    @JsonProperty("pa_agent_ref")
    @JsonInclude(Include.NON_NULL)
    private String paAgentRef;

    @JsonProperty("saml")
    @JsonInclude(Include.NON_NULL)
    private SamlSettings saml;

    @JsonProperty("tacacs_plus")
    @JsonInclude(Include.NON_NULL)
    private TacacsPlusAuthSettings tacacsPlus;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



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
   * Http user authentication params.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return http
   */
  @VsoMethod
  public AuthProfileHTTPClientParams getHttp() {
    return http;
  }

  /**
   * This is the setter method to the attribute.
   * Http user authentication params.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param http set the http.
   */
  @VsoMethod
  public void setHttp(AuthProfileHTTPClientParams http) {
    this.http = http;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Jwtserverprofile to be used for authentication.
   * It is a reference to an object of type jwtserverprofile.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return jwtProfileRef
   */
  @VsoMethod
  public String getJwtProfileRef() {
    return jwtProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Jwtserverprofile to be used for authentication.
   * It is a reference to an object of type jwtserverprofile.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param jwtProfileRef set the jwtProfileRef.
   */
  @VsoMethod
  public void setJwtProfileRef(String  jwtProfileRef) {
    this.jwtProfileRef = jwtProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ldap server and directory settings.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ldap
   */
  @VsoMethod
  public LdapAuthSettings getLdap() {
    return ldap;
  }

  /**
   * This is the setter method to the attribute.
   * Ldap server and directory settings.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ldap set the ldap.
   */
  @VsoMethod
  public void setLdap(LdapAuthSettings ldap) {
    this.ldap = ldap;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.6.
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
   * Field introduced in 20.1.6.
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
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public AuthProfile addMarkersItem(RoleFilterMatchLabel markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<RoleFilterMatchLabel>();
    }
    this.markers.add(markersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name of the auth profile.
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
   * Name of the auth profile.
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
   * Oauth profile - common endpoint information.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oauthProfile
   */
  @VsoMethod
  public OAuthProfile getOauthProfile() {
    return oauthProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Oauth profile - common endpoint information.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param oauthProfile set the oauthProfile.
   */
  @VsoMethod
  public void setOauthProfile(OAuthProfile oauthProfile) {
    this.oauthProfile = oauthProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pingaccessagent uuid.
   * It is a reference to an object of type pingaccessagent.
   * Field deprecated in 30.2.1.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * @return paAgentRef
   */
  @VsoMethod
  public String getPaAgentRef() {
    return paAgentRef;
  }

  /**
   * This is the setter method to the attribute.
   * Pingaccessagent uuid.
   * It is a reference to an object of type pingaccessagent.
   * Field deprecated in 30.2.1.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * @param paAgentRef set the paAgentRef.
   */
  @VsoMethod
  public void setPaAgentRef(String  paAgentRef) {
    this.paAgentRef = paAgentRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Saml settings.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return saml
   */
  @VsoMethod
  public SamlSettings getSaml() {
    return saml;
  }

  /**
   * This is the setter method to the attribute.
   * Saml settings.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param saml set the saml.
   */
  @VsoMethod
  public void setSaml(SamlSettings saml) {
    this.saml = saml;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tacacs+ settings.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tacacsPlus
   */
  @VsoMethod
  public TacacsPlusAuthSettings getTacacsPlus() {
    return tacacsPlus;
  }

  /**
   * This is the setter method to the attribute.
   * Tacacs+ settings.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tacacsPlus set the tacacsPlus.
   */
  @VsoMethod
  public void setTacacsPlus(TacacsPlusAuthSettings tacacsPlus) {
    this.tacacsPlus = tacacsPlus;
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
   * Type of the auth profile.
   * Enum options - AUTH_PROFILE_LDAP, AUTH_PROFILE_TACACS_PLUS, AUTH_PROFILE_SAML, AUTH_PROFILE_PINGACCESS, AUTH_PROFILE_JWT, AUTH_PROFILE_OAUTH.
   * Allowed in enterprise edition with any value, essentials edition(allowed values-
   * auth_profile_ldap,auth_profile_tacacs_plus,auth_profile_saml,auth_profile_jwt,auth_profile_oauth), basic edition(allowed values-
   * auth_profile_ldap,auth_profile_tacacs_plus,auth_profile_saml,auth_profile_jwt,auth_profile_oauth), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the auth profile.
   * Enum options - AUTH_PROFILE_LDAP, AUTH_PROFILE_TACACS_PLUS, AUTH_PROFILE_SAML, AUTH_PROFILE_PINGACCESS, AUTH_PROFILE_JWT, AUTH_PROFILE_OAUTH.
   * Allowed in enterprise edition with any value, essentials edition(allowed values-
   * auth_profile_ldap,auth_profile_tacacs_plus,auth_profile_saml,auth_profile_jwt,auth_profile_oauth), basic edition(allowed values-
   * auth_profile_ldap,auth_profile_tacacs_plus,auth_profile_saml,auth_profile_jwt,auth_profile_oauth), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Uuid of the auth profile.
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
   * Uuid of the auth profile.
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
  AuthProfile objAuthProfile = (AuthProfile) o;
  return   Objects.equals(this.uuid, objAuthProfile.uuid)&&
  Objects.equals(this.name, objAuthProfile.name)&&
  Objects.equals(this.type, objAuthProfile.type)&&
  Objects.equals(this.ldap, objAuthProfile.ldap)&&
  Objects.equals(this.http, objAuthProfile.http)&&
  Objects.equals(this.tacacsPlus, objAuthProfile.tacacsPlus)&&
  Objects.equals(this.saml, objAuthProfile.saml)&&
  Objects.equals(this.paAgentRef, objAuthProfile.paAgentRef)&&
  Objects.equals(this.jwtProfileRef, objAuthProfile.jwtProfileRef)&&
  Objects.equals(this.oauthProfile, objAuthProfile.oauthProfile)&&
  Objects.equals(this.markers, objAuthProfile.markers)&&
  Objects.equals(this.description, objAuthProfile.description)&&
  Objects.equals(this.tenantRef, objAuthProfile.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AuthProfile {\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    http: ").append(toIndentedString(http)).append("\n");
        sb.append("    jwtProfileRef: ").append(toIndentedString(jwtProfileRef)).append("\n");
        sb.append("    ldap: ").append(toIndentedString(ldap)).append("\n");
        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    oauthProfile: ").append(toIndentedString(oauthProfile)).append("\n");
        sb.append("    paAgentRef: ").append(toIndentedString(paAgentRef)).append("\n");
        sb.append("    saml: ").append(toIndentedString(saml)).append("\n");
        sb.append("    tacacsPlus: ").append(toIndentedString(tacacsPlus)).append("\n");
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

