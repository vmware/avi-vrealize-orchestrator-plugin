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
 * The DnsTransportProtocolMatch is a POJO class extends AviRestResource that used for creating
 * DnsTransportProtocolMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsTransportProtocolMatch")
@VsoFinder(name = Constants.FINDER_VRO_DNSTRANSPORTPROTOCOLMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsTransportProtocolMatch extends AviRestResource {
    @JsonProperty("match_criteria")
    @JsonInclude(Include.NON_NULL)
    private String matchCriteria;

    @JsonProperty("protocol")
    @JsonInclude(Include.NON_NULL)
    private String protocol;



  /**
   * This is the getter method this will return the attribute value.
   * Criterion to use for matching the dns transport protocol.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchCriteria
   */
  @VsoMethod
  public String getMatchCriteria() {
    return matchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Criterion to use for matching the dns transport protocol.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchCriteria set the matchCriteria.
   */
  @VsoMethod
  public void setMatchCriteria(String  matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Protocol to match against transport protocol used by dns query.
   * Enum options - DNS_OVER_UDP, DNS_OVER_TCP.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return protocol
   */
  @VsoMethod
  public String getProtocol() {
    return protocol;
  }

  /**
   * This is the setter method to the attribute.
   * Protocol to match against transport protocol used by dns query.
   * Enum options - DNS_OVER_UDP, DNS_OVER_TCP.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param protocol set the protocol.
   */
  @VsoMethod
  public void setProtocol(String  protocol) {
    this.protocol = protocol;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsTransportProtocolMatch objDnsTransportProtocolMatch = (DnsTransportProtocolMatch) o;
  return   Objects.equals(this.matchCriteria, objDnsTransportProtocolMatch.matchCriteria)&&
  Objects.equals(this.protocol, objDnsTransportProtocolMatch.protocol);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsTransportProtocolMatch {\n");
      sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

