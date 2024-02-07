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
 * The ConfigUserLogin is a POJO class extends AviRestResource that used for creating
 * ConfigUserLogin.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ConfigUserLogin")
@VsoFinder(name = Constants.FINDER_VRO_CONFIGUSERLOGIN)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ConfigUserLogin extends AviRestResource {
    @JsonProperty("client_ip")
    @JsonInclude(Include.NON_NULL)
    private String clientIp;

    @JsonProperty("client_type")
    @JsonInclude(Include.NON_NULL)
    private String clientType;

    @JsonProperty("error_message")
    @JsonInclude(Include.NON_NULL)
    private String errorMessage;

    @JsonProperty("local")
    @JsonInclude(Include.NON_NULL)
    private Boolean local;

    @JsonProperty("remote_attributes")
    @JsonInclude(Include.NON_NULL)
    private String remoteAttributes;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status;

    @JsonProperty("user")
    @JsonInclude(Include.NON_NULL)
    private String user;



  /**
   * This is the getter method this will return the attribute value.
   * Client ip.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIp
   */
  @VsoMethod
  public String getClientIp() {
    return clientIp;
  }

  /**
   * This is the setter method to the attribute.
   * Client ip.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIp set the clientIp.
   */
  @VsoMethod
  public void setClientIp(String  clientIp) {
    this.clientIp = clientIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of client used to login ui, cli, others(api).
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientType
   */
  @VsoMethod
  public String getClientType() {
    return clientType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of client used to login ui, cli, others(api).
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientType set the clientType.
   */
  @VsoMethod
  public void setClientType(String  clientType) {
    this.clientType = clientType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error message if authentication failed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorMessage
   */
  @VsoMethod
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * This is the setter method to the attribute.
   * Error message if authentication failed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorMessage set the errorMessage.
   */
  @VsoMethod
  public void setErrorMessage(String  errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Local user.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return local
   */
  @VsoMethod
  public Boolean getLocal() {
    return local;
  }

  /**
   * This is the setter method to the attribute.
   * Local user.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param local set the local.
   */
  @VsoMethod
  public void setLocal(Boolean  local) {
    this.local = local;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Additional attributes from login handler.
   * Field introduced in 18.1.4,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return remoteAttributes
   */
  @VsoMethod
  public String getRemoteAttributes() {
    return remoteAttributes;
  }

  /**
   * This is the setter method to the attribute.
   * Additional attributes from login handler.
   * Field introduced in 18.1.4,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param remoteAttributes set the remoteAttributes.
   */
  @VsoMethod
  public void setRemoteAttributes(String  remoteAttributes) {
    this.remoteAttributes = remoteAttributes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Status.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Request user.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return user
   */
  @VsoMethod
  public String getUser() {
    return user;
  }

  /**
   * This is the setter method to the attribute.
   * Request user.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param user set the user.
   */
  @VsoMethod
  public void setUser(String  user) {
    this.user = user;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ConfigUserLogin objConfigUserLogin = (ConfigUserLogin) o;
  return   Objects.equals(this.user, objConfigUserLogin.user)&&
  Objects.equals(this.status, objConfigUserLogin.status)&&
  Objects.equals(this.clientIp, objConfigUserLogin.clientIp)&&
  Objects.equals(this.errorMessage, objConfigUserLogin.errorMessage)&&
  Objects.equals(this.local, objConfigUserLogin.local)&&
  Objects.equals(this.remoteAttributes, objConfigUserLogin.remoteAttributes)&&
  Objects.equals(this.clientType, objConfigUserLogin.clientType);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ConfigUserLogin {\n");
      sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    local: ").append(toIndentedString(local)).append("\n");
        sb.append("    remoteAttributes: ").append(toIndentedString(remoteAttributes)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

