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
 * The DebugSeDataplane is a POJO class extends AviRestResource that used for creating
 * DebugSeDataplane.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DebugSeDataplane")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGSEDATAPLANE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DebugSeDataplane extends AviRestResource {
    @JsonProperty("flag")
    @JsonInclude(Include.NON_NULL)
    private String flag;



  /**
   * This is the getter method this will return the attribute value.
   * Enum options - DEBUG_DISPATCHER_FLOW, DEBUG_DISPATCHER_FLOW_DETAIL, DEBUG_DISPATCHER_FLOW_ALL, DEBUG_CONFIG, DEBUG_IP, DEBUG_IP_PKT_IN,
   * DEBUG_IP_PKT_OUT, DEBUG_ARP, DEBUG_ARP_PKT_IN, DEBUG_ARP_PKT_OUT, DEBUG_ETHERNET, DEBUG_ETHERNET_PKT_IN, DEBUG_ETHERNET_PKT_OUT, DEBUG_ICMP,
   * DEBUG_PCAP_RX, DEBUG_PCAP_TX, DEBUG_PCAP_DROP, DEBUG_PCAP_ALL, DEBUG_MISC, DEBUG_CRUD...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return flag
   */
  @VsoMethod
  public String getFlag() {
    return flag;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - DEBUG_DISPATCHER_FLOW, DEBUG_DISPATCHER_FLOW_DETAIL, DEBUG_DISPATCHER_FLOW_ALL, DEBUG_CONFIG, DEBUG_IP, DEBUG_IP_PKT_IN,
   * DEBUG_IP_PKT_OUT, DEBUG_ARP, DEBUG_ARP_PKT_IN, DEBUG_ARP_PKT_OUT, DEBUG_ETHERNET, DEBUG_ETHERNET_PKT_IN, DEBUG_ETHERNET_PKT_OUT, DEBUG_ICMP,
   * DEBUG_PCAP_RX, DEBUG_PCAP_TX, DEBUG_PCAP_DROP, DEBUG_PCAP_ALL, DEBUG_MISC, DEBUG_CRUD...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param flag set the flag.
   */
  @VsoMethod
  public void setFlag(String  flag) {
    this.flag = flag;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DebugSeDataplane objDebugSeDataplane = (DebugSeDataplane) o;
  return   Objects.equals(this.flag, objDebugSeDataplane.flag);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DebugSeDataplane {\n");
      sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
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

