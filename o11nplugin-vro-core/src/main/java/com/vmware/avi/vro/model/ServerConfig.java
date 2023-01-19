package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.GeoLocation;
import com.vmware.avi.vro.model.OperationalStatus;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ServerConfig is a POJO class extends AviRestResource that used for creating
 * ServerConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ServerConfig")
@VsoFinder(name = Constants.FINDER_VRO_SERVERCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ServerConfig extends AviRestResource {
    @JsonProperty("def_port")
    @JsonInclude(Include.NON_NULL)
    private Boolean defPort = null;

    @JsonProperty("hostname")
    @JsonInclude(Include.NON_NULL)
    private String hostname = null;

    @JsonProperty("ip_addr")
    @JsonInclude(Include.NON_NULL)
    private IpAddr ipAddr = null;

    @JsonProperty("is_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean isEnabled = null;

    @JsonProperty("last_state")
    @JsonInclude(Include.NON_NULL)
    private String lastState = "OPER_UNAVAIL";

    @JsonProperty("location")
    @JsonInclude(Include.NON_NULL)
    private GeoLocation location = null;

    @JsonProperty("oper_status")
    @JsonInclude(Include.NON_NULL)
    private OperationalStatus operStatus = null;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private Integer port = null;

    @JsonProperty("propogate_state")
    @JsonInclude(Include.NON_NULL)
    private Boolean propogateState = null;

    @JsonProperty("timer_exists")
    @JsonInclude(Include.NON_NULL)
    private Boolean timerExists = false;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return defPort
   */
  @VsoMethod
  public Boolean getDefPort() {
    return defPort;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param defPort set the defPort.
   */
  @VsoMethod
  public void setDefPort(Boolean  defPort) {
    this.defPort = defPort;
  }

  /**
   * This is the getter method this will return the attribute value.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipAddr
   */
  @VsoMethod
  public IpAddr getIpAddr() {
    return ipAddr;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipAddr set the ipAddr.
   */
  @VsoMethod
  public void setIpAddr(IpAddr ipAddr) {
    this.ipAddr = ipAddr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return isEnabled
   */
  @VsoMethod
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param isEnabled set the isEnabled.
   */
  @VsoMethod
  public void setIsEnabled(Boolean  isEnabled) {
    this.isEnabled = isEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - OPER_UP, OPER_DOWN, OPER_CREATING, OPER_RESOURCES, OPER_INACTIVE, OPER_DISABLED, OPER_UNUSED, OPER_UNKNOWN, OPER_PROCESSING,
   * OPER_INITIALIZING, OPER_ERROR_DISABLED, OPER_AWAIT_MANUAL_PLACEMENT, OPER_UPGRADING, OPER_SE_PROCESSING, OPER_PARTITIONED, OPER_DISABLING,
   * OPER_FAILED, OPER_UNAVAIL, OPER_AGGREGATE_DOWN.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "OPER_UNAVAIL".
   * @return lastState
   */
  @VsoMethod
  public String getLastState() {
    return lastState;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - OPER_UP, OPER_DOWN, OPER_CREATING, OPER_RESOURCES, OPER_INACTIVE, OPER_DISABLED, OPER_UNUSED, OPER_UNKNOWN, OPER_PROCESSING,
   * OPER_INITIALIZING, OPER_ERROR_DISABLED, OPER_AWAIT_MANUAL_PLACEMENT, OPER_UPGRADING, OPER_SE_PROCESSING, OPER_PARTITIONED, OPER_DISABLING,
   * OPER_FAILED, OPER_UNAVAIL, OPER_AGGREGATE_DOWN.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "OPER_UNAVAIL".
   * @param lastState set the lastState.
   */
  @VsoMethod
  public void setLastState(String  lastState) {
    this.lastState = lastState;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtualservice member in case this server is a member of gs group, and geo location available.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return location
   */
  @VsoMethod
  public GeoLocation getLocation() {
    return location;
  }

  /**
   * This is the setter method to the attribute.
   * Virtualservice member in case this server is a member of gs group, and geo location available.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param location set the location.
   */
  @VsoMethod
  public void setLocation(GeoLocation location) {
    this.location = location;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return operStatus
   */
  @VsoMethod
  public OperationalStatus getOperStatus() {
    return operStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param operStatus set the operStatus.
   */
  @VsoMethod
  public void setOperStatus(OperationalStatus operStatus) {
    this.operStatus = operStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
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
   * If this is set, propogate this server state to other ses for this vs.
   * Applicable to eastwest vs and gs hm-sharding.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return propogateState
   */
  @VsoMethod
  public Boolean getPropogateState() {
    return propogateState;
  }

  /**
   * This is the setter method to the attribute.
   * If this is set, propogate this server state to other ses for this vs.
   * Applicable to eastwest vs and gs hm-sharding.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param propogateState set the propogateState.
   */
  @VsoMethod
  public void setPropogateState(Boolean  propogateState) {
    this.propogateState = propogateState;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return timerExists
   */
  @VsoMethod
  public Boolean getTimerExists() {
    return timerExists;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param timerExists set the timerExists.
   */
  @VsoMethod
  public void setTimerExists(Boolean  timerExists) {
    this.timerExists = timerExists;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ServerConfig objServerConfig = (ServerConfig) o;
  return   Objects.equals(this.ipAddr, objServerConfig.ipAddr)&&
  Objects.equals(this.port, objServerConfig.port)&&
  Objects.equals(this.isEnabled, objServerConfig.isEnabled)&&
  Objects.equals(this.defPort, objServerConfig.defPort)&&
  Objects.equals(this.operStatus, objServerConfig.operStatus)&&
  Objects.equals(this.lastState, objServerConfig.lastState)&&
  Objects.equals(this.timerExists, objServerConfig.timerExists)&&
  Objects.equals(this.location, objServerConfig.location)&&
  Objects.equals(this.hostname, objServerConfig.hostname)&&
  Objects.equals(this.propogateState, objServerConfig.propogateState);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ServerConfig {\n");
      sb.append("    defPort: ").append(toIndentedString(defPort)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
        sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
        sb.append("    lastState: ").append(toIndentedString(lastState)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    propogateState: ").append(toIndentedString(propogateState)).append("\n");
        sb.append("    timerExists: ").append(toIndentedString(timerExists)).append("\n");
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

