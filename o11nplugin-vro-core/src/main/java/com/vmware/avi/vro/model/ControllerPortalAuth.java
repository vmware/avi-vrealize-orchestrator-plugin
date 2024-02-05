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
 * The ControllerPortalAuth is a POJO class extends AviRestResource that used for creating
 * ControllerPortalAuth.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerPortalAuth")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERPORTALAUTH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerPortalAuth extends AviRestResource {
    @JsonProperty("access_token")
    @JsonInclude(Include.NON_NULL)
    private String accessToken;

    @JsonProperty("grant_type")
    @JsonInclude(Include.NON_NULL)
    private String grantType = "REFRESH_TOKEN";

    @JsonProperty("instance_url")
    @JsonInclude(Include.NON_NULL)
    private String instanceUrl;

    @JsonProperty("jwt_token")
    @JsonInclude(Include.NON_NULL)
    private String jwtToken;

    @JsonProperty("tenant")
    @JsonInclude(Include.NON_NULL)
    private String tenant;



  /**
   * This is the getter method this will return the attribute value.
   * Access token to authenticate customer portal rest calls.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return accessToken
   */
  @VsoMethod
  public String getAccessToken() {
    return accessToken;
  }

  /**
   * This is the setter method to the attribute.
   * Access token to authenticate customer portal rest calls.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param accessToken set the accessToken.
   */
  @VsoMethod
  public void setAccessToken(String  accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Grant type of the jwt token.
   * Enum options - REFRESH_TOKEN, CLIENT_CREDENTIALS.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "REFRESH_TOKEN".
   * @return grantType
   */
  @VsoMethod
  public String getGrantType() {
    return grantType;
  }

  /**
   * This is the setter method to the attribute.
   * Grant type of the jwt token.
   * Enum options - REFRESH_TOKEN, CLIENT_CREDENTIALS.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "REFRESH_TOKEN".
   * @param grantType set the grantType.
   */
  @VsoMethod
  public void setGrantType(String  grantType) {
    this.grantType = grantType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloud services instance url.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return instanceUrl
   */
  @VsoMethod
  public String getInstanceUrl() {
    return instanceUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud services instance url.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param instanceUrl set the instanceUrl.
   */
  @VsoMethod
  public void setInstanceUrl(String  instanceUrl) {
    this.instanceUrl = instanceUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Signed jwt to refresh the access token.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return jwtToken
   */
  @VsoMethod
  public String getJwtToken() {
    return jwtToken;
  }

  /**
   * This is the setter method to the attribute.
   * Signed jwt to refresh the access token.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param jwtToken set the jwtToken.
   */
  @VsoMethod
  public void setJwtToken(String  jwtToken) {
    this.jwtToken = jwtToken;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant information for which cloud services authentication information is persisted.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenant
   */
  @VsoMethod
  public String getTenant() {
    return tenant;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant information for which cloud services authentication information is persisted.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenant set the tenant.
   */
  @VsoMethod
  public void setTenant(String  tenant) {
    this.tenant = tenant;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerPortalAuth objControllerPortalAuth = (ControllerPortalAuth) o;
  return   Objects.equals(this.accessToken, objControllerPortalAuth.accessToken)&&
  Objects.equals(this.jwtToken, objControllerPortalAuth.jwtToken)&&
  Objects.equals(this.instanceUrl, objControllerPortalAuth.instanceUrl)&&
  Objects.equals(this.tenant, objControllerPortalAuth.tenant)&&
  Objects.equals(this.grantType, objControllerPortalAuth.grantType);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerPortalAuth {\n");
      sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
        sb.append("    instanceUrl: ").append(toIndentedString(instanceUrl)).append("\n");
        sb.append("    jwtToken: ").append(toIndentedString(jwtToken)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
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

