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
 * The SeRateLimiters is a POJO class extends AviRestResource that used for creating
 * SeRateLimiters.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeRateLimiters")
@VsoFinder(name = Constants.FINDER_VRO_SERATELIMITERS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeRateLimiters extends AviRestResource {
    @JsonProperty("arp_rl")
    @JsonInclude(Include.NON_NULL)
    private Integer arpRl = 2000;

    @JsonProperty("default_rl")
    @JsonInclude(Include.NON_NULL)
    private Integer defaultRl = 100;

    @JsonProperty("flow_probe_rl")
    @JsonInclude(Include.NON_NULL)
    private Integer flowProbeRl = 250;

    @JsonProperty("icmp_rl")
    @JsonInclude(Include.NON_NULL)
    private Integer icmpRl = 2000;

    @JsonProperty("icmp_rsp_rl")
    @JsonInclude(Include.NON_NULL)
    private Integer icmpRspRl = 2000;

    @JsonProperty("nd_rl")
    @JsonInclude(Include.NON_NULL)
    private Integer ndRl = 2000;

    @JsonProperty("rst_rl")
    @JsonInclude(Include.NON_NULL)
    private Integer rstRl = 100;



  /**
   * This is the getter method this will return the attribute value.
   * Rate limiter for arp packets in pps.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @return arpRl
   */
  @VsoMethod
  public Integer getArpRl() {
    return arpRl;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limiter for arp packets in pps.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @param arpRl set the arpRl.
   */
  @VsoMethod
  public void setArpRl(Integer  arpRl) {
    this.arpRl = arpRl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default rate limiter in pps.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return defaultRl
   */
  @VsoMethod
  public Integer getDefaultRl() {
    return defaultRl;
  }

  /**
   * This is the setter method to the attribute.
   * Default rate limiter in pps.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param defaultRl set the defaultRl.
   */
  @VsoMethod
  public void setDefaultRl(Integer  defaultRl) {
    this.defaultRl = defaultRl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limiter for number of flow probes in pps.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 250.
   * @return flowProbeRl
   */
  @VsoMethod
  public Integer getFlowProbeRl() {
    return flowProbeRl;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limiter for number of flow probes in pps.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 250.
   * @param flowProbeRl set the flowProbeRl.
   */
  @VsoMethod
  public void setFlowProbeRl(Integer  flowProbeRl) {
    this.flowProbeRl = flowProbeRl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limiter for icmp requests in pps.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @return icmpRl
   */
  @VsoMethod
  public Integer getIcmpRl() {
    return icmpRl;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limiter for icmp requests in pps.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @param icmpRl set the icmpRl.
   */
  @VsoMethod
  public void setIcmpRl(Integer  icmpRl) {
    this.icmpRl = icmpRl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limiter for icmp response in pps.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @return icmpRspRl
   */
  @VsoMethod
  public Integer getIcmpRspRl() {
    return icmpRspRl;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limiter for icmp response in pps.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @param icmpRspRl set the icmpRspRl.
   */
  @VsoMethod
  public void setIcmpRspRl(Integer  icmpRspRl) {
    this.icmpRspRl = icmpRspRl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limiter for nd packets in pps.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @return ndRl
   */
  @VsoMethod
  public Integer getNdRl() {
    return ndRl;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limiter for nd packets in pps.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
   * @param ndRl set the ndRl.
   */
  @VsoMethod
  public void setNdRl(Integer  ndRl) {
    this.ndRl = ndRl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limiter for number rst pkts sent in pps.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return rstRl
   */
  @VsoMethod
  public Integer getRstRl() {
    return rstRl;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limiter for number rst pkts sent in pps.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param rstRl set the rstRl.
   */
  @VsoMethod
  public void setRstRl(Integer  rstRl) {
    this.rstRl = rstRl;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeRateLimiters objSeRateLimiters = (SeRateLimiters) o;
  return   Objects.equals(this.icmpRl, objSeRateLimiters.icmpRl)&&
  Objects.equals(this.icmpRspRl, objSeRateLimiters.icmpRspRl)&&
  Objects.equals(this.arpRl, objSeRateLimiters.arpRl)&&
  Objects.equals(this.rstRl, objSeRateLimiters.rstRl)&&
  Objects.equals(this.flowProbeRl, objSeRateLimiters.flowProbeRl)&&
  Objects.equals(this.defaultRl, objSeRateLimiters.defaultRl)&&
  Objects.equals(this.ndRl, objSeRateLimiters.ndRl);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeRateLimiters {\n");
      sb.append("    arpRl: ").append(toIndentedString(arpRl)).append("\n");
        sb.append("    defaultRl: ").append(toIndentedString(defaultRl)).append("\n");
        sb.append("    flowProbeRl: ").append(toIndentedString(flowProbeRl)).append("\n");
        sb.append("    icmpRl: ").append(toIndentedString(icmpRl)).append("\n");
        sb.append("    icmpRspRl: ").append(toIndentedString(icmpRspRl)).append("\n");
        sb.append("    ndRl: ").append(toIndentedString(ndRl)).append("\n");
        sb.append("    rstRl: ").append(toIndentedString(rstRl)).append("\n");
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

