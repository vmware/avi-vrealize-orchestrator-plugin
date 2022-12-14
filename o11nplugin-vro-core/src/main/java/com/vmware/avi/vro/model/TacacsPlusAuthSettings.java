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
 * The TacacsPlusAuthSettings is a POJO class extends AviRestResource that used for creating
 * TacacsPlusAuthSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TacacsPlusAuthSettings")
@VsoFinder(name = Constants.FINDER_VRO_TACACSPLUSAUTHSETTINGS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TacacsPlusAuthSettings extends AviRestResource {
    @JsonProperty("authorization_attrs")
    @JsonInclude(Include.NON_NULL)
    private List<AuthTacacsPlusAttributeValuePair> authorizationAttrs = null;

    @JsonProperty("password")
    @JsonInclude(Include.NON_NULL)
    private String password = null;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private Integer port = 49;

    @JsonProperty("server")
    @JsonInclude(Include.NON_NULL)
    private List<String> server = null;

    @JsonProperty("service")
    @JsonInclude(Include.NON_NULL)
    private String service = "AUTH_TACACS_PLUS_SERVICE_LOGIN";



  /**
   * This is the getter method this will return the attribute value.
   * Tacacs+ authorization attribute value pairs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authorizationAttrs
   */
  @VsoMethod
  public List<AuthTacacsPlusAttributeValuePair> getAuthorizationAttrs() {
    return authorizationAttrs;
  }

  /**
   * This is the setter method. this will set the authorizationAttrs
   * Tacacs+ authorization attribute value pairs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authorizationAttrs
   */
  @VsoMethod
  public void setAuthorizationAttrs(List<AuthTacacsPlusAttributeValuePair>  authorizationAttrs) {
    this.authorizationAttrs = authorizationAttrs;
  }

  /**
   * This is the setter method this will set the authorizationAttrs
   * Tacacs+ authorization attribute value pairs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authorizationAttrs
   */
  @VsoMethod
  public TacacsPlusAuthSettings addAuthorizationAttrsItem(AuthTacacsPlusAttributeValuePair authorizationAttrsItem) {
    if (this.authorizationAttrs == null) {
      this.authorizationAttrs = new ArrayList<AuthTacacsPlusAttributeValuePair>();
    }
    this.authorizationAttrs.add(authorizationAttrsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Tacacs+ server shared secret.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return password
   */
  @VsoMethod
  public String getPassword() {
    return password;
  }

  /**
   * This is the setter method to the attribute.
   * Tacacs+ server shared secret.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param password set the password.
   */
  @VsoMethod
  public void setPassword(String  password) {
    this.password = password;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tacacs+ server listening port.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 49.
   * @return port
   */
  @VsoMethod
  public Integer getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Tacacs+ server listening port.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 49.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tacacs+ server ip address or fqdn.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return server
   */
  @VsoMethod
  public List<String> getServer() {
    return server;
  }

  /**
   * This is the setter method. this will set the server
   * Tacacs+ server ip address or fqdn.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return server
   */
  @VsoMethod
  public void setServer(List<String>  server) {
    this.server = server;
  }

  /**
   * This is the setter method this will set the server
   * Tacacs+ server ip address or fqdn.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return server
   */
  @VsoMethod
  public TacacsPlusAuthSettings addServerItem(String serverItem) {
    if (this.server == null) {
      this.server = new ArrayList<String>();
    }
    this.server.add(serverItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Tacacs+ service.
   * Enum options - AUTH_TACACS_PLUS_SERVICE_NONE, AUTH_TACACS_PLUS_SERVICE_LOGIN, AUTH_TACACS_PLUS_SERVICE_ENABLE, AUTH_TACACS_PLUS_SERVICE_PPP,
   * AUTH_TACACS_PLUS_SERVICE_ARAP, AUTH_TACACS_PLUS_SERVICE_PT, AUTH_TACACS_PLUS_SERVICE_RCMD, AUTH_TACACS_PLUS_SERVICE_X25,
   * AUTH_TACACS_PLUS_SERVICE_NASI, AUTH_TACACS_PLUS_SERVICE_FWPROXY.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "AUTH_TACACS_PLUS_SERVICE_LOGIN".
   * @return service
   */
  @VsoMethod
  public String getService() {
    return service;
  }

  /**
   * This is the setter method to the attribute.
   * Tacacs+ service.
   * Enum options - AUTH_TACACS_PLUS_SERVICE_NONE, AUTH_TACACS_PLUS_SERVICE_LOGIN, AUTH_TACACS_PLUS_SERVICE_ENABLE, AUTH_TACACS_PLUS_SERVICE_PPP,
   * AUTH_TACACS_PLUS_SERVICE_ARAP, AUTH_TACACS_PLUS_SERVICE_PT, AUTH_TACACS_PLUS_SERVICE_RCMD, AUTH_TACACS_PLUS_SERVICE_X25,
   * AUTH_TACACS_PLUS_SERVICE_NASI, AUTH_TACACS_PLUS_SERVICE_FWPROXY.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "AUTH_TACACS_PLUS_SERVICE_LOGIN".
   * @param service set the service.
   */
  @VsoMethod
  public void setService(String  service) {
    this.service = service;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TacacsPlusAuthSettings objTacacsPlusAuthSettings = (TacacsPlusAuthSettings) o;
  return   Objects.equals(this.server, objTacacsPlusAuthSettings.server)&&
  Objects.equals(this.port, objTacacsPlusAuthSettings.port)&&
  Objects.equals(this.password, objTacacsPlusAuthSettings.password)&&
  Objects.equals(this.service, objTacacsPlusAuthSettings.service)&&
  Objects.equals(this.authorizationAttrs, objTacacsPlusAuthSettings.authorizationAttrs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TacacsPlusAuthSettings {\n");
      sb.append("    authorizationAttrs: ").append(toIndentedString(authorizationAttrs)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

