package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.OAuthAppSettings;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The OAuthProfile is a POJO class extends AviRestResource that used for creating
 * OAuthProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OAuthProfile")
@VsoFinder(name = Constants.FINDER_VRO_OAUTHPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OAuthProfile extends AviRestResource {
    @JsonProperty("authorization_endpoint")
    @JsonInclude(Include.NON_NULL)
    private String authorizationEndpoint = null;

    @JsonProperty("end_session_endpoint")
    @JsonInclude(Include.NON_NULL)
    private String endSessionEndpoint = null;

    @JsonProperty("instance_id")
    @JsonInclude(Include.NON_NULL)
    private String instanceId = null;

    @JsonProperty("introspection_endpoint")
    @JsonInclude(Include.NON_NULL)
    private String introspectionEndpoint = null;

    @JsonProperty("issuer")
    @JsonInclude(Include.NON_NULL)
    private String issuer = null;

    @JsonProperty("jwks_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer jwksTimeout = 0;

    @JsonProperty("jwks_uri")
    @JsonInclude(Include.NON_NULL)
    private String jwksUri = null;

    @JsonProperty("oauth_controller_settings")
    @JsonInclude(Include.NON_NULL)
    private OAuthAppSettings oauthControllerSettings = null;

    @JsonProperty("oauth_profile_type")
    @JsonInclude(Include.NON_NULL)
    private String oauthProfileType = "CLIENT_OAUTH";

    @JsonProperty("oauth_provider")
    @JsonInclude(Include.NON_NULL)
    private String oauthProvider = null;

    @JsonProperty("oauth_resp_buffer_sz")
    @JsonInclude(Include.NON_NULL)
    private Integer oauthRespBufferSz = 102400;

    @JsonProperty("org_id")
    @JsonInclude(Include.NON_NULL)
    private String orgId = null;

    @JsonProperty("pool_ref")
    @JsonInclude(Include.NON_NULL)
    private String poolRef = null;

    @JsonProperty("redirect_uri")
    @JsonInclude(Include.NON_NULL)
    private String redirectUri = null;

    @JsonProperty("service_id")
    @JsonInclude(Include.NON_NULL)
    private String serviceId = null;

    @JsonProperty("service_name")
    @JsonInclude(Include.NON_NULL)
    private String serviceName = null;

    @JsonProperty("token_endpoint")
    @JsonInclude(Include.NON_NULL)
    private String tokenEndpoint = null;

    @JsonProperty("userinfo_endpoint")
    @JsonInclude(Include.NON_NULL)
    private String userinfoEndpoint = null;



  /**
   * This is the getter method this will return the attribute value.
   * Url of authorization server.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authorizationEndpoint
   */
  @VsoMethod
  public String getAuthorizationEndpoint() {
    return authorizationEndpoint;
  }

  /**
   * This is the setter method to the attribute.
   * Url of authorization server.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param authorizationEndpoint set the authorizationEndpoint.
   */
  @VsoMethod
  public void setAuthorizationEndpoint(String  authorizationEndpoint) {
    this.authorizationEndpoint = authorizationEndpoint;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Logout uri of idp server.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return endSessionEndpoint
   */
  @VsoMethod
  public String getEndSessionEndpoint() {
    return endSessionEndpoint;
  }

  /**
   * This is the setter method to the attribute.
   * Logout uri of idp server.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param endSessionEndpoint set the endSessionEndpoint.
   */
  @VsoMethod
  public void setEndSessionEndpoint(String  endSessionEndpoint) {
    this.endSessionEndpoint = endSessionEndpoint;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Instance uuid of the csp service.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return instanceId
   */
  @VsoMethod
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * This is the setter method to the attribute.
   * Instance uuid of the csp service.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param instanceId set the instanceId.
   */
  @VsoMethod
  public void setInstanceId(String  instanceId) {
    this.instanceId = instanceId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Url of token introspection server.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return introspectionEndpoint
   */
  @VsoMethod
  public String getIntrospectionEndpoint() {
    return introspectionEndpoint;
  }

  /**
   * This is the setter method to the attribute.
   * Url of token introspection server.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param introspectionEndpoint set the introspectionEndpoint.
   */
  @VsoMethod
  public void setIntrospectionEndpoint(String  introspectionEndpoint) {
    this.introspectionEndpoint = introspectionEndpoint;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uniquely identifiable name of the token issuer.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return issuer
   */
  @VsoMethod
  public String getIssuer() {
    return issuer;
  }

  /**
   * This is the setter method to the attribute.
   * Uniquely identifiable name of the token issuer.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param issuer set the issuer.
   */
  @VsoMethod
  public void setIssuer(String  issuer) {
    this.issuer = issuer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Lifetime of the cached jwks keys.
   * Allowed values are 0-1440.
   * Field introduced in 21.1.3.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return jwksTimeout
   */
  @VsoMethod
  public Integer getJwksTimeout() {
    return jwksTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Lifetime of the cached jwks keys.
   * Allowed values are 0-1440.
   * Field introduced in 21.1.3.
   * Unit is min.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param jwksTimeout set the jwksTimeout.
   */
  @VsoMethod
  public void setJwksTimeout(Integer  jwksTimeout) {
    this.jwksTimeout = jwksTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Jwks url of the endpoint that hosts the public keys that can be used to verify any jwt issued by the authorization server.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return jwksUri
   */
  @VsoMethod
  public String getJwksUri() {
    return jwksUri;
  }

  /**
   * This is the setter method to the attribute.
   * Jwks url of the endpoint that hosts the public keys that can be used to verify any jwt issued by the authorization server.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param jwksUri set the jwksUri.
   */
  @VsoMethod
  public void setJwksUri(String  jwksUri) {
    this.jwksUri = jwksUri;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Oauth app settings for controller authentication.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oauthControllerSettings
   */
  @VsoMethod
  public OAuthAppSettings getOauthControllerSettings() {
    return oauthControllerSettings;
  }

  /**
   * This is the setter method to the attribute.
   * Oauth app settings for controller authentication.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param oauthControllerSettings set the oauthControllerSettings.
   */
  @VsoMethod
  public void setOauthControllerSettings(OAuthAppSettings oauthControllerSettings) {
    this.oauthControllerSettings = oauthControllerSettings;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of oauth profile which defines the usage type.
   * Enum options - CLIENT_OAUTH, CONTROLLER_OAUTH.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "CLIENT_OAUTH".
   * @return oauthProfileType
   */
  @VsoMethod
  public String getOauthProfileType() {
    return oauthProfileType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of oauth profile which defines the usage type.
   * Enum options - CLIENT_OAUTH, CONTROLLER_OAUTH.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "CLIENT_OAUTH".
   * @param oauthProfileType set the oauthProfileType.
   */
  @VsoMethod
  public void setOauthProfileType(String  oauthProfileType) {
    this.oauthProfileType = oauthProfileType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of oauth provider when using controller oauth as oauth profile type.
   * Enum options - OAUTH_CSP.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oauthProvider
   */
  @VsoMethod
  public String getOauthProvider() {
    return oauthProvider;
  }

  /**
   * This is the setter method to the attribute.
   * Type of oauth provider when using controller oauth as oauth profile type.
   * Enum options - OAUTH_CSP.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param oauthProvider set the oauthProvider.
   */
  @VsoMethod
  public void setOauthProvider(String  oauthProvider) {
    this.oauthProvider = oauthProvider;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Buffering size for the responses from the oauth enpoints.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 102400.
   * @return oauthRespBufferSz
   */
  @VsoMethod
  public Integer getOauthRespBufferSz() {
    return oauthRespBufferSz;
  }

  /**
   * This is the setter method to the attribute.
   * Buffering size for the responses from the oauth enpoints.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 102400.
   * @param oauthRespBufferSz set the oauthRespBufferSz.
   */
  @VsoMethod
  public void setOauthRespBufferSz(Integer  oauthRespBufferSz) {
    this.oauthRespBufferSz = oauthRespBufferSz;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Organization id for oauth.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return orgId
   */
  @VsoMethod
  public String getOrgId() {
    return orgId;
  }

  /**
   * This is the setter method to the attribute.
   * Organization id for oauth.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param orgId set the orgId.
   */
  @VsoMethod
  public void setOrgId(String  orgId) {
    this.orgId = orgId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pool object to interface with authorization server endpoints.
   * It is a reference to an object of type pool.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolRef
   */
  @VsoMethod
  public String getPoolRef() {
    return poolRef;
  }

  /**
   * This is the setter method to the attribute.
   * Pool object to interface with authorization server endpoints.
   * It is a reference to an object of type pool.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolRef set the poolRef.
   */
  @VsoMethod
  public void setPoolRef(String  poolRef) {
    this.poolRef = poolRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Redirect uri specified in the request to authorization server.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return redirectUri
   */
  @VsoMethod
  public String getRedirectUri() {
    return redirectUri;
  }

  /**
   * This is the setter method to the attribute.
   * Redirect uri specified in the request to authorization server.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param redirectUri set the redirectUri.
   */
  @VsoMethod
  public void setRedirectUri(String  redirectUri) {
    this.redirectUri = redirectUri;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid value of csp service.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceId
   */
  @VsoMethod
  public String getServiceId() {
    return serviceId;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid value of csp service.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceId set the serviceId.
   */
  @VsoMethod
  public void setServiceId(String  serviceId) {
    this.serviceId = serviceId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the csp service.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceName
   */
  @VsoMethod
  public String getServiceName() {
    return serviceName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the csp service.
   * Field introduced in 23.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceName set the serviceName.
   */
  @VsoMethod
  public void setServiceName(String  serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Url of token exchange server.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tokenEndpoint
   */
  @VsoMethod
  public String getTokenEndpoint() {
    return tokenEndpoint;
  }

  /**
   * This is the setter method to the attribute.
   * Url of token exchange server.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tokenEndpoint set the tokenEndpoint.
   */
  @VsoMethod
  public void setTokenEndpoint(String  tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Url of the userinfo endpoint.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return userinfoEndpoint
   */
  @VsoMethod
  public String getUserinfoEndpoint() {
    return userinfoEndpoint;
  }

  /**
   * This is the setter method to the attribute.
   * Url of the userinfo endpoint.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param userinfoEndpoint set the userinfoEndpoint.
   */
  @VsoMethod
  public void setUserinfoEndpoint(String  userinfoEndpoint) {
    this.userinfoEndpoint = userinfoEndpoint;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OAuthProfile objOAuthProfile = (OAuthProfile) o;
  return   Objects.equals(this.authorizationEndpoint, objOAuthProfile.authorizationEndpoint)&&
  Objects.equals(this.tokenEndpoint, objOAuthProfile.tokenEndpoint)&&
  Objects.equals(this.introspectionEndpoint, objOAuthProfile.introspectionEndpoint)&&
  Objects.equals(this.jwksUri, objOAuthProfile.jwksUri)&&
  Objects.equals(this.jwksTimeout, objOAuthProfile.jwksTimeout)&&
  Objects.equals(this.issuer, objOAuthProfile.issuer)&&
  Objects.equals(this.poolRef, objOAuthProfile.poolRef)&&
  Objects.equals(this.oauthRespBufferSz, objOAuthProfile.oauthRespBufferSz)&&
  Objects.equals(this.userinfoEndpoint, objOAuthProfile.userinfoEndpoint)&&
  Objects.equals(this.endSessionEndpoint, objOAuthProfile.endSessionEndpoint)&&
  Objects.equals(this.redirectUri, objOAuthProfile.redirectUri)&&
  Objects.equals(this.orgId, objOAuthProfile.orgId)&&
  Objects.equals(this.oauthProfileType, objOAuthProfile.oauthProfileType)&&
  Objects.equals(this.oauthControllerSettings, objOAuthProfile.oauthControllerSettings)&&
  Objects.equals(this.oauthProvider, objOAuthProfile.oauthProvider)&&
  Objects.equals(this.serviceId, objOAuthProfile.serviceId)&&
  Objects.equals(this.instanceId, objOAuthProfile.instanceId)&&
  Objects.equals(this.serviceName, objOAuthProfile.serviceName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OAuthProfile {\n");
      sb.append("    authorizationEndpoint: ").append(toIndentedString(authorizationEndpoint)).append("\n");
        sb.append("    endSessionEndpoint: ").append(toIndentedString(endSessionEndpoint)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    introspectionEndpoint: ").append(toIndentedString(introspectionEndpoint)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    jwksTimeout: ").append(toIndentedString(jwksTimeout)).append("\n");
        sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
        sb.append("    oauthControllerSettings: ").append(toIndentedString(oauthControllerSettings)).append("\n");
        sb.append("    oauthProfileType: ").append(toIndentedString(oauthProfileType)).append("\n");
        sb.append("    oauthProvider: ").append(toIndentedString(oauthProvider)).append("\n");
        sb.append("    oauthRespBufferSz: ").append(toIndentedString(oauthRespBufferSz)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
        sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    tokenEndpoint: ").append(toIndentedString(tokenEndpoint)).append("\n");
        sb.append("    userinfoEndpoint: ").append(toIndentedString(userinfoEndpoint)).append("\n");
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

