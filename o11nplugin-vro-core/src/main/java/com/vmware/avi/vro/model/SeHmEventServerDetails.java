package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SeHmEventServerDetails is a POJO class extends AviRestResource that used for creating
 * SeHmEventServerDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeHmEventServerDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEHMEVENTSERVERDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeHmEventServerDetails extends AviRestResource {
    @JsonProperty("app_info")
    @JsonInclude(Include.NON_NULL)
    private List<AppInfo> appInfo = null;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description = null;

    @JsonProperty("failure_code")
    @JsonInclude(Include.NON_NULL)
    private String failureCode = null;

    @JsonProperty("hostname")
    @JsonInclude(Include.NON_NULL)
    private String hostname = null;

    @JsonProperty("ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr ip = null;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private Integer port = null;

    @JsonProperty("shm")
    @JsonInclude(Include.NON_NULL)
    private List<SeHmEventShmDetails> shm = null;

    @JsonProperty("ssl_error_code")
    @JsonInclude(Include.NON_NULL)
    private String sslErrorCode = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return appInfo
   */
  @VsoMethod
  public List<AppInfo> getAppInfo() {
    return appInfo;
  }

  /**
   * This is the setter method. this will set the appInfo
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return appInfo
   */
  @VsoMethod
  public void setAppInfo(List<AppInfo>  appInfo) {
    this.appInfo = appInfo;
  }

  /**
   * This is the setter method this will set the appInfo
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return appInfo
   */
  @VsoMethod
  public SeHmEventServerDetails addAppInfoItem(AppInfo appInfoItem) {
    if (this.appInfo == null) {
      this.appInfo = new ArrayList<AppInfo>();
    }
    this.appInfo.add(appInfoItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Server description.
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
   * Server description.
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
   * Healthmonitor failure code.
   * Enum options - ARP_UNRESOLVED, CONNECTION_REFUSED, CONNECTION_TIMEOUT, RESPONSE_CODE_MISMATCH, PAYLOAD_CONTENT_MISMATCH, SERVER_UNREACHABLE,
   * CONNECTION_RESET, CONNECTION_ERROR, HOST_ERROR, ADDRESS_ERROR, NO_PORT, PAYLOAD_TIMEOUT, NO_RESPONSE, NO_RESOURCES, SSL_ERROR, SSL_CERT_ERROR,
   * PORT_UNREACHABLE, SCRIPT_ERROR, OTHER_ERROR, SERVER_DISABLED...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return failureCode
   */
  @VsoMethod
  public String getFailureCode() {
    return failureCode;
  }

  /**
   * This is the setter method to the attribute.
   * Healthmonitor failure code.
   * Enum options - ARP_UNRESOLVED, CONNECTION_REFUSED, CONNECTION_TIMEOUT, RESPONSE_CODE_MISMATCH, PAYLOAD_CONTENT_MISMATCH, SERVER_UNREACHABLE,
   * CONNECTION_RESET, CONNECTION_ERROR, HOST_ERROR, ADDRESS_ERROR, NO_PORT, PAYLOAD_TIMEOUT, NO_RESPONSE, NO_RESOURCES, SSL_ERROR, SSL_CERT_ERROR,
   * PORT_UNREACHABLE, SCRIPT_ERROR, OTHER_ERROR, SERVER_DISABLED...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param failureCode set the failureCode.
   */
  @VsoMethod
  public void setFailureCode(String  failureCode) {
    this.failureCode = failureCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Host name or vm name or dns name for the server.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostname
   */
  @VsoMethod
  public String getHostname() {
    return hostname;
  }

  /**
   * This is the setter method to the attribute.
   * Host name or vm name or dns name for the server.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostname set the hostname.
   */
  @VsoMethod
  public void setHostname(String  hostname) {
    this.hostname = hostname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip address of server.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ip
   */
  @VsoMethod
  public IpAddr getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address of server.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Port override form the pool port.
   * If server port is not specified, the pool port is used.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return port
   */
  @VsoMethod
  public Integer getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Port override form the pool port.
   * If server port is not specified, the pool port is used.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return shm
   */
  @VsoMethod
  public List<SeHmEventShmDetails> getShm() {
    return shm;
  }

  /**
   * This is the setter method. this will set the shm
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return shm
   */
  @VsoMethod
  public void setShm(List<SeHmEventShmDetails>  shm) {
    this.shm = shm;
  }

  /**
   * This is the setter method this will set the shm
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return shm
   */
  @VsoMethod
  public SeHmEventServerDetails addShmItem(SeHmEventShmDetails shmItem) {
    if (this.shm == null) {
      this.shm = new ArrayList<SeHmEventShmDetails>();
    }
    this.shm.add(shmItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enum options - ADF_CLIENT_CONN_SETUP_REFUSED, ADF_SERVER_CONN_SETUP_REFUSED, ADF_CLIENT_CONN_SETUP_TIMEDOUT, ADF_SERVER_CONN_SETUP_TIMEDOUT,
   * ADF_CLIENT_CONN_SETUP_FAILED_INTERNAL, ADF_SERVER_CONN_SETUP_FAILED_INTERNAL, ADF_CLIENT_CONN_SETUP_FAILED_BAD_PACKET,
   * ADF_UDP_CONN_SETUP_FAILED_INTERNAL, ADF_UDP_SERVER_CONN_SETUP_FAILED_INTERNAL, ADF_SCTP_SERVER_CONN_SETUP_REFUSED,
   * ADF_SCTP_SERVER_CONN_SETUP_TIMEDOUT, ADF_SCTP_SERVER_CONN_SETUP_FAILED_INTERNAL, ADF_CLIENT_SENT_RESET, ADF_SERVER_SENT_RESET,
   * ADF_CLIENT_CONN_TIMEDOUT, ADF_SERVER_CONN_TIMEDOUT, ADF_USER_DELETE_OPERATION, ADF_CLIENT_REQUEST_TIMEOUT, ADF_CLIENT_CONN_ABORTED,
   * ADF_CLIENT_SSL_HANDSHAKE_FAILURE...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslErrorCode
   */
  @VsoMethod
  public String getSslErrorCode() {
    return sslErrorCode;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - ADF_CLIENT_CONN_SETUP_REFUSED, ADF_SERVER_CONN_SETUP_REFUSED, ADF_CLIENT_CONN_SETUP_TIMEDOUT, ADF_SERVER_CONN_SETUP_TIMEDOUT,
   * ADF_CLIENT_CONN_SETUP_FAILED_INTERNAL, ADF_SERVER_CONN_SETUP_FAILED_INTERNAL, ADF_CLIENT_CONN_SETUP_FAILED_BAD_PACKET,
   * ADF_UDP_CONN_SETUP_FAILED_INTERNAL, ADF_UDP_SERVER_CONN_SETUP_FAILED_INTERNAL, ADF_SCTP_SERVER_CONN_SETUP_REFUSED,
   * ADF_SCTP_SERVER_CONN_SETUP_TIMEDOUT, ADF_SCTP_SERVER_CONN_SETUP_FAILED_INTERNAL, ADF_CLIENT_SENT_RESET, ADF_SERVER_SENT_RESET,
   * ADF_CLIENT_CONN_TIMEDOUT, ADF_SERVER_CONN_TIMEDOUT, ADF_USER_DELETE_OPERATION, ADF_CLIENT_REQUEST_TIMEOUT, ADF_CLIENT_CONN_ABORTED,
   * ADF_CLIENT_SSL_HANDSHAKE_FAILURE...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sslErrorCode set the sslErrorCode.
   */
  @VsoMethod
  public void setSslErrorCode(String  sslErrorCode) {
    this.sslErrorCode = sslErrorCode;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeHmEventServerDetails objSeHmEventServerDetails = (SeHmEventServerDetails) o;
  return   Objects.equals(this.ip, objSeHmEventServerDetails.ip)&&
  Objects.equals(this.port, objSeHmEventServerDetails.port)&&
  Objects.equals(this.hostname, objSeHmEventServerDetails.hostname)&&
  Objects.equals(this.failureCode, objSeHmEventServerDetails.failureCode)&&
  Objects.equals(this.appInfo, objSeHmEventServerDetails.appInfo)&&
  Objects.equals(this.shm, objSeHmEventServerDetails.shm)&&
  Objects.equals(this.sslErrorCode, objSeHmEventServerDetails.sslErrorCode)&&
  Objects.equals(this.description, objSeHmEventServerDetails.description);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeHmEventServerDetails {\n");
      sb.append("    appInfo: ").append(toIndentedString(appInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    shm: ").append(toIndentedString(shm)).append("\n");
        sb.append("    sslErrorCode: ").append(toIndentedString(sslErrorCode)).append("\n");
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

