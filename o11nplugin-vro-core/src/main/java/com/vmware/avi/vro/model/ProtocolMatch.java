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
 * The ProtocolMatch is a POJO class extends AviRestResource that used for creating
 * ProtocolMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ProtocolMatch")
@VsoFinder(name = Constants.FINDER_VRO_PROTOCOLMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ProtocolMatch extends AviRestResource {
    @JsonProperty("match_criteria")
    @JsonInclude(Include.NON_NULL)
    private String matchCriteria;

    @JsonProperty("protocols")
    @JsonInclude(Include.NON_NULL)
    private String protocols;



  /**
   * This is the getter method this will return the attribute value.
   * Criterion to use for protocol matching the http request.
   * Enum options - IS_IN, IS_NOT_IN.
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
   * Criterion to use for protocol matching the http request.
   * Enum options - IS_IN, IS_NOT_IN.
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
   * Http or https protocol.
   * Enum options - HTTP, HTTPS.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return protocols
   */
  @VsoMethod
  public String getProtocols() {
    return protocols;
  }

  /**
   * This is the setter method to the attribute.
   * Http or https protocol.
   * Enum options - HTTP, HTTPS.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param protocols set the protocols.
   */
  @VsoMethod
  public void setProtocols(String  protocols) {
    this.protocols = protocols;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ProtocolMatch objProtocolMatch = (ProtocolMatch) o;
  return   Objects.equals(this.matchCriteria, objProtocolMatch.matchCriteria)&&
  Objects.equals(this.protocols, objProtocolMatch.protocols);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ProtocolMatch {\n");
      sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
        sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
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

