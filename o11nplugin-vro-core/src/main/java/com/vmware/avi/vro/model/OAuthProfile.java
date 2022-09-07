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

    @JsonProperty("introspection_endpoint")
    @JsonInclude(Include.NON_NULL)
    private String introspectionEndpoint = null;

    @JsonProperty("issuer")
    @JsonInclude(Include.NON_NULL)
    private String issuer = null;

    @JsonProperty("jwks_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer jwksTimeout = null;

    @JsonProperty("jwks_uri")
    @JsonInclude(Include.NON_NULL)
    private String jwksUri = null;

    @JsonProperty("oauth_resp_buffer_sz")
    @JsonInclude(Include.NON_NULL)
    private Integer oauthRespBufferSz = 102400;

    @JsonProperty("pool_ref")
    @JsonInclude(Include.NON_NULL)
    private String poolRef = null;

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
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return jwksTimeout
   */
  @VsoMethod
  public Integer getJwksTimeout() {
    return jwksTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Lifetime of the cached jwks keys.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  Objects.equals(this.userinfoEndpoint, objOAuthProfile.userinfoEndpoint);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OAuthProfile {\n");
      sb.append("    authorizationEndpoint: ").append(toIndentedString(authorizationEndpoint)).append("\n");
        sb.append("    introspectionEndpoint: ").append(toIndentedString(introspectionEndpoint)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    jwksTimeout: ").append(toIndentedString(jwksTimeout)).append("\n");
        sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
        sb.append("    oauthRespBufferSz: ").append(toIndentedString(oauthRespBufferSz)).append("\n");
        sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
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

