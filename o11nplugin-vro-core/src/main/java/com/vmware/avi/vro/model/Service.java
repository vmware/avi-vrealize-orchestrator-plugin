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

/**
 * The Service is a POJO class extends AviRestResource that used for creating
 * Service.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Service")
@VsoFinder(name = Constants.FINDER_VRO_SERVICE)
@JsonIgnoreProperties(ignoreUnknown = true)
@org.springframework.stereotype.Service
public class Service extends AviRestResource {
    @JsonProperty("enable_http2")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableHttp2 = false;

    @JsonProperty("enable_ssl")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableSsl = false;

    @JsonProperty("horizon_internal_ports")
    @JsonInclude(Include.NON_NULL)
    private Boolean horizonInternalPorts = false;

    @JsonProperty("is_active_ftp_data_port")
    @JsonInclude(Include.NON_NULL)
    private Boolean isActiveFtpDataPort = false;

    @JsonProperty("override_application_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String overrideApplicationProfileRef;

    @JsonProperty("override_network_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String overrideNetworkProfileRef;

    @JsonProperty("port")
    @JsonInclude(Include.NON_NULL)
    private Integer port;

    @JsonProperty("port_range_end")
    @JsonInclude(Include.NON_NULL)
    private Integer portRangeEnd = 0;



  /**
   * This is the getter method this will return the attribute value.
   * Enable http2 on this port.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableHttp2
   */
  @VsoMethod
  public Boolean getEnableHttp2() {
    return enableHttp2;
  }

  /**
   * This is the setter method to the attribute.
   * Enable http2 on this port.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableHttp2 set the enableHttp2.
   */
  @VsoMethod
  public void setEnableHttp2(Boolean  enableHttp2) {
    this.enableHttp2 = enableHttp2;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable ssl termination and offload for traffic from clients.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableSsl
   */
  @VsoMethod
  public Boolean getEnableSsl() {
    return enableSsl;
  }

  /**
   * This is the setter method to the attribute.
   * Enable ssl termination and offload for traffic from clients.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableSsl set the enableSsl.
   */
  @VsoMethod
  public void setEnableSsl(Boolean  enableSsl) {
    this.enableSsl = enableSsl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Used for horizon deployment.
   * If set used for l7 redirect.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return horizonInternalPorts
   */
  @VsoMethod
  public Boolean getHorizonInternalPorts() {
    return horizonInternalPorts;
  }

  /**
   * This is the setter method to the attribute.
   * Used for horizon deployment.
   * If set used for l7 redirect.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param horizonInternalPorts set the horizonInternalPorts.
   */
  @VsoMethod
  public void setHorizonInternalPorts(Boolean  horizonInternalPorts) {
    this.horizonInternalPorts = horizonInternalPorts;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Source port used by vs for active ftp data connections.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isActiveFtpDataPort
   */
  @VsoMethod
  public Boolean getIsActiveFtpDataPort() {
    return isActiveFtpDataPort;
  }

  /**
   * This is the setter method to the attribute.
   * Source port used by vs for active ftp data connections.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isActiveFtpDataPort set the isActiveFtpDataPort.
   */
  @VsoMethod
  public void setIsActiveFtpDataPort(Boolean  isActiveFtpDataPort) {
    this.isActiveFtpDataPort = isActiveFtpDataPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable application layer specific features for the this specific service.
   * It is a reference to an object of type applicationprofile.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return overrideApplicationProfileRef
   */
  @VsoMethod
  public String getOverrideApplicationProfileRef() {
    return overrideApplicationProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Enable application layer specific features for the this specific service.
   * It is a reference to an object of type applicationprofile.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param overrideApplicationProfileRef set the overrideApplicationProfileRef.
   */
  @VsoMethod
  public void setOverrideApplicationProfileRef(String  overrideApplicationProfileRef) {
    this.overrideApplicationProfileRef = overrideApplicationProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Override the network profile for this specific service port.
   * It is a reference to an object of type networkprofile.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return overrideNetworkProfileRef
   */
  @VsoMethod
  public String getOverrideNetworkProfileRef() {
    return overrideNetworkProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Override the network profile for this specific service port.
   * It is a reference to an object of type networkprofile.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param overrideNetworkProfileRef set the overrideNetworkProfileRef.
   */
  @VsoMethod
  public void setOverrideNetworkProfileRef(String  overrideNetworkProfileRef) {
    this.overrideNetworkProfileRef = overrideNetworkProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The virtual service's port number.
   * Allowed values are 0-65535.
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
   * The virtual service's port number.
   * Allowed values are 0-65535.
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
   * The end of the virtual service's port number range.
   * Allowed values are 1-65535.
   * Special values are 0- single port.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return portRangeEnd
   */
  @VsoMethod
  public Integer getPortRangeEnd() {
    return portRangeEnd;
  }

  /**
   * This is the setter method to the attribute.
   * The end of the virtual service's port number range.
   * Allowed values are 1-65535.
   * Special values are 0- single port.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param portRangeEnd set the portRangeEnd.
   */
  @VsoMethod
  public void setPortRangeEnd(Integer  portRangeEnd) {
    this.portRangeEnd = portRangeEnd;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  Service objService = (Service) o;
  return   Objects.equals(this.port, objService.port)&&
  Objects.equals(this.enableSsl, objService.enableSsl)&&
  Objects.equals(this.overrideNetworkProfileRef, objService.overrideNetworkProfileRef)&&
  Objects.equals(this.portRangeEnd, objService.portRangeEnd)&&
  Objects.equals(this.overrideApplicationProfileRef, objService.overrideApplicationProfileRef)&&
  Objects.equals(this.enableHttp2, objService.enableHttp2)&&
  Objects.equals(this.horizonInternalPorts, objService.horizonInternalPorts)&&
  Objects.equals(this.isActiveFtpDataPort, objService.isActiveFtpDataPort);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Service {\n");
      sb.append("    enableHttp2: ").append(toIndentedString(enableHttp2)).append("\n");
        sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
        sb.append("    horizonInternalPorts: ").append(toIndentedString(horizonInternalPorts)).append("\n");
        sb.append("    isActiveFtpDataPort: ").append(toIndentedString(isActiveFtpDataPort)).append("\n");
        sb.append("    overrideApplicationProfileRef: ").append(toIndentedString(overrideApplicationProfileRef)).append("\n");
        sb.append("    overrideNetworkProfileRef: ").append(toIndentedString(overrideNetworkProfileRef)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    portRangeEnd: ").append(toIndentedString(portRangeEnd)).append("\n");
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

