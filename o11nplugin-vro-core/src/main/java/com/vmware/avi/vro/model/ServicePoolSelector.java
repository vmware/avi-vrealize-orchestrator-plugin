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
 * The ServicePoolSelector is a POJO class extends AviRestResource that used for creating
 * ServicePoolSelector.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ServicePoolSelector")
@VsoFinder(name = Constants.FINDER_VRO_SERVICEPOOLSELECTOR)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ServicePoolSelector extends AviRestResource {
    @JsonProperty("service_pool_group_ref")
    @JsonInclude(Include.NON_NULL)
    private String servicePoolGroupRef = null;

    @JsonProperty("service_pool_ref")
    @JsonInclude(Include.NON_NULL)
    private String servicePoolRef = null;

    @JsonProperty("service_port")
    @JsonInclude(Include.NON_NULL)
    private Integer servicePort = null;

    @JsonProperty("service_port_range_end")
    @JsonInclude(Include.NON_NULL)
    private Integer servicePortRangeEnd = 0;

    @JsonProperty("service_protocol")
    @JsonInclude(Include.NON_NULL)
    private String serviceProtocol = null;



  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type poolgroup.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return servicePoolGroupRef
   */
  @VsoMethod
  public String getServicePoolGroupRef() {
    return servicePoolGroupRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type poolgroup.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param servicePoolGroupRef set the servicePoolGroupRef.
   */
  @VsoMethod
  public void setServicePoolGroupRef(String  servicePoolGroupRef) {
    this.servicePoolGroupRef = servicePoolGroupRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type pool.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return servicePoolRef
   */
  @VsoMethod
  public String getServicePoolRef() {
    return servicePoolRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type pool.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param servicePoolRef set the servicePoolRef.
   */
  @VsoMethod
  public void setServicePoolRef(String  servicePoolRef) {
    this.servicePoolRef = servicePoolRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pool based destination port.
   * Allowed values are 1-65535.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return servicePort
   */
  @VsoMethod
  public Integer getServicePort() {
    return servicePort;
  }

  /**
   * This is the setter method to the attribute.
   * Pool based destination port.
   * Allowed values are 1-65535.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param servicePort set the servicePort.
   */
  @VsoMethod
  public void setServicePort(Integer  servicePort) {
    this.servicePort = servicePort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The end of the service port number range.
   * Allowed values are 1-65535.
   * Special values are 0- single port.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return servicePortRangeEnd
   */
  @VsoMethod
  public Integer getServicePortRangeEnd() {
    return servicePortRangeEnd;
  }

  /**
   * This is the setter method to the attribute.
   * The end of the service port number range.
   * Allowed values are 1-65535.
   * Special values are 0- single port.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param servicePortRangeEnd set the servicePortRangeEnd.
   */
  @VsoMethod
  public void setServicePortRangeEnd(Integer  servicePortRangeEnd) {
    this.servicePortRangeEnd = servicePortRangeEnd;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Destination protocol to match for the pool selection.
   * If not specified, it will match any protocol.
   * Enum options - PROTOCOL_TYPE_TCP_PROXY, PROTOCOL_TYPE_TCP_FAST_PATH, PROTOCOL_TYPE_UDP_FAST_PATH, PROTOCOL_TYPE_UDP_PROXY,
   * PROTOCOL_TYPE_SCTP_PROXY, PROTOCOL_TYPE_SCTP_FAST_PATH.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceProtocol
   */
  @VsoMethod
  public String getServiceProtocol() {
    return serviceProtocol;
  }

  /**
   * This is the setter method to the attribute.
   * Destination protocol to match for the pool selection.
   * If not specified, it will match any protocol.
   * Enum options - PROTOCOL_TYPE_TCP_PROXY, PROTOCOL_TYPE_TCP_FAST_PATH, PROTOCOL_TYPE_UDP_FAST_PATH, PROTOCOL_TYPE_UDP_PROXY,
   * PROTOCOL_TYPE_SCTP_PROXY, PROTOCOL_TYPE_SCTP_FAST_PATH.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceProtocol set the serviceProtocol.
   */
  @VsoMethod
  public void setServiceProtocol(String  serviceProtocol) {
    this.serviceProtocol = serviceProtocol;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ServicePoolSelector objServicePoolSelector = (ServicePoolSelector) o;
  return   Objects.equals(this.servicePort, objServicePoolSelector.servicePort)&&
  Objects.equals(this.servicePoolRef, objServicePoolSelector.servicePoolRef)&&
  Objects.equals(this.serviceProtocol, objServicePoolSelector.serviceProtocol)&&
  Objects.equals(this.servicePoolGroupRef, objServicePoolSelector.servicePoolGroupRef)&&
  Objects.equals(this.servicePortRangeEnd, objServicePoolSelector.servicePortRangeEnd);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ServicePoolSelector {\n");
      sb.append("    servicePoolGroupRef: ").append(toIndentedString(servicePoolGroupRef)).append("\n");
        sb.append("    servicePoolRef: ").append(toIndentedString(servicePoolRef)).append("\n");
        sb.append("    servicePort: ").append(toIndentedString(servicePort)).append("\n");
        sb.append("    servicePortRangeEnd: ").append(toIndentedString(servicePortRangeEnd)).append("\n");
        sb.append("    serviceProtocol: ").append(toIndentedString(serviceProtocol)).append("\n");
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

