package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.BOTLimits;
import com.vmware.avi.vro.model.IPAddrLimits;
import com.vmware.avi.vro.model.L7limits;
import com.vmware.avi.vro.model.WAFLimits;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ControllerLimits is a POJO class extends AviRestResource that used for creating
 * ControllerLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerLimits")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERLIMITS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerLimits extends AviRestResource {
    @JsonProperty("bot_limits")
    @JsonInclude(Include.NON_NULL)
    private BOTLimits botLimits;

    @JsonProperty("certificates_per_virtualservice")
    @JsonInclude(Include.NON_NULL)
    private Integer certificatesPerVirtualservice;

    @JsonProperty("controller_cloud_limits")
    @JsonInclude(Include.NON_NULL)
    private List<ControllerCloudLimits> controllerCloudLimits;

    @JsonProperty("controller_sizing_limits")
    @JsonInclude(Include.NON_NULL)
    private List<ControllerSizingLimits> controllerSizingLimits;

    @JsonProperty("default_routes_per_vrfcontext")
    @JsonInclude(Include.NON_NULL)
    private Integer defaultRoutesPerVrfcontext;

    @JsonProperty("gateway_mon_per_vrf")
    @JsonInclude(Include.NON_NULL)
    private Integer gatewayMonPerVrf;

    @JsonProperty("ipaddress_limits")
    @JsonInclude(Include.NON_NULL)
    private IPAddrLimits ipaddressLimits;

    @JsonProperty("ips_per_ipgroup")
    @JsonInclude(Include.NON_NULL)
    private Integer ipsPerIpgroup;

    @JsonProperty("l7_limits")
    @JsonInclude(Include.NON_NULL)
    private L7limits l7Limits;

    @JsonProperty("poolgroups_per_virtualservice")
    @JsonInclude(Include.NON_NULL)
    private Integer poolgroupsPerVirtualservice;

    @JsonProperty("pools_per_poolgroup")
    @JsonInclude(Include.NON_NULL)
    private Integer poolsPerPoolgroup;

    @JsonProperty("pools_per_virtualservice")
    @JsonInclude(Include.NON_NULL)
    private Integer poolsPerVirtualservice;

    @JsonProperty("routes_per_vrfcontext")
    @JsonInclude(Include.NON_NULL)
    private Integer routesPerVrfcontext;

    @JsonProperty("rules_per_nat_policy")
    @JsonInclude(Include.NON_NULL)
    private Integer rulesPerNatPolicy;

    @JsonProperty("rules_per_networksecuritypolicy")
    @JsonInclude(Include.NON_NULL)
    private Integer rulesPerNetworksecuritypolicy;

    @JsonProperty("servers_per_pool")
    @JsonInclude(Include.NON_NULL)
    private Integer serversPerPool;

    @JsonProperty("sni_children_per_parent")
    @JsonInclude(Include.NON_NULL)
    private Integer sniChildrenPerParent;

    @JsonProperty("strings_per_stringgroup")
    @JsonInclude(Include.NON_NULL)
    private Integer stringsPerStringgroup;

    @JsonProperty("vs_bgp_scaleout")
    @JsonInclude(Include.NON_NULL)
    private Integer vsBgpScaleout;

    @JsonProperty("vs_l2_scaleout")
    @JsonInclude(Include.NON_NULL)
    private Integer vsL2Scaleout;

    @JsonProperty("waf_limits")
    @JsonInclude(Include.NON_NULL)
    private WAFLimits wafLimits;



  /**
   * This is the getter method this will return the attribute value.
   * Bot system limits.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return botLimits
   */
  @VsoMethod
  public BOTLimits getBotLimits() {
    return botLimits;
  }

  /**
   * This is the setter method to the attribute.
   * Bot system limits.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param botLimits set the botLimits.
   */
  @VsoMethod
  public void setBotLimits(BOTLimits botLimits) {
    this.botLimits = botLimits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of certificates per virtualservice.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return certificatesPerVirtualservice
   */
  @VsoMethod
  public Integer getCertificatesPerVirtualservice() {
    return certificatesPerVirtualservice;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of certificates per virtualservice.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param certificatesPerVirtualservice set the certificatesPerVirtualservice.
   */
  @VsoMethod
  public void setCertificatesPerVirtualservice(Integer  certificatesPerVirtualservice) {
    this.certificatesPerVirtualservice = certificatesPerVirtualservice;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Controller system limits specific to cloud type for all controller sizes.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerCloudLimits
   */
  @VsoMethod
  public List<ControllerCloudLimits> getControllerCloudLimits() {
    return controllerCloudLimits;
  }

  /**
   * This is the setter method. this will set the controllerCloudLimits
   * Controller system limits specific to cloud type for all controller sizes.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerCloudLimits
   */
  @VsoMethod
  public void setControllerCloudLimits(List<ControllerCloudLimits>  controllerCloudLimits) {
    this.controllerCloudLimits = controllerCloudLimits;
  }

  /**
   * This is the setter method this will set the controllerCloudLimits
   * Controller system limits specific to cloud type for all controller sizes.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerCloudLimits
   */
  @VsoMethod
  public ControllerLimits addControllerCloudLimitsItem(ControllerCloudLimits controllerCloudLimitsItem) {
    if (this.controllerCloudLimits == null) {
      this.controllerCloudLimits = new ArrayList<ControllerCloudLimits>();
    }
    this.controllerCloudLimits.add(controllerCloudLimitsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Controller system limits specific to controller sizing.
   * Field introduced in 20.1.1.
   * Maximum of 4 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerSizingLimits
   */
  @VsoMethod
  public List<ControllerSizingLimits> getControllerSizingLimits() {
    return controllerSizingLimits;
  }

  /**
   * This is the setter method. this will set the controllerSizingLimits
   * Controller system limits specific to controller sizing.
   * Field introduced in 20.1.1.
   * Maximum of 4 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerSizingLimits
   */
  @VsoMethod
  public void setControllerSizingLimits(List<ControllerSizingLimits>  controllerSizingLimits) {
    this.controllerSizingLimits = controllerSizingLimits;
  }

  /**
   * This is the setter method this will set the controllerSizingLimits
   * Controller system limits specific to controller sizing.
   * Field introduced in 20.1.1.
   * Maximum of 4 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerSizingLimits
   */
  @VsoMethod
  public ControllerLimits addControllerSizingLimitsItem(ControllerSizingLimits controllerSizingLimitsItem) {
    if (this.controllerSizingLimits == null) {
      this.controllerSizingLimits = new ArrayList<ControllerSizingLimits>();
    }
    this.controllerSizingLimits.add(controllerSizingLimitsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of default routes per vrfcontext.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return defaultRoutesPerVrfcontext
   */
  @VsoMethod
  public Integer getDefaultRoutesPerVrfcontext() {
    return defaultRoutesPerVrfcontext;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of default routes per vrfcontext.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param defaultRoutesPerVrfcontext set the defaultRoutesPerVrfcontext.
   */
  @VsoMethod
  public void setDefaultRoutesPerVrfcontext(Integer  defaultRoutesPerVrfcontext) {
    this.defaultRoutesPerVrfcontext = defaultRoutesPerVrfcontext;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of gateway monitors per vrfcontext.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gatewayMonPerVrf
   */
  @VsoMethod
  public Integer getGatewayMonPerVrf() {
    return gatewayMonPerVrf;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of gateway monitors per vrfcontext.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gatewayMonPerVrf set the gatewayMonPerVrf.
   */
  @VsoMethod
  public void setGatewayMonPerVrf(Integer  gatewayMonPerVrf) {
    this.gatewayMonPerVrf = gatewayMonPerVrf;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip address limits.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipaddressLimits
   */
  @VsoMethod
  public IPAddrLimits getIpaddressLimits() {
    return ipaddressLimits;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address limits.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipaddressLimits set the ipaddressLimits.
   */
  @VsoMethod
  public void setIpaddressLimits(IPAddrLimits ipaddressLimits) {
    this.ipaddressLimits = ipaddressLimits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of ip's per ipaddrgroup.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipsPerIpgroup
   */
  @VsoMethod
  public Integer getIpsPerIpgroup() {
    return ipsPerIpgroup;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of ip's per ipaddrgroup.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipsPerIpgroup set the ipsPerIpgroup.
   */
  @VsoMethod
  public void setIpsPerIpgroup(Integer  ipsPerIpgroup) {
    this.ipsPerIpgroup = ipsPerIpgroup;
  }

  /**
   * This is the getter method this will return the attribute value.
   * System limits that apply to layer 7 configuration objects.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return l7Limits
   */
  @VsoMethod
  public L7limits getL7Limits() {
    return l7Limits;
  }

  /**
   * This is the setter method to the attribute.
   * System limits that apply to layer 7 configuration objects.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param l7Limits set the l7Limits.
   */
  @VsoMethod
  public void setL7Limits(L7limits l7Limits) {
    this.l7Limits = l7Limits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of poolgroups per virtualservice.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolgroupsPerVirtualservice
   */
  @VsoMethod
  public Integer getPoolgroupsPerVirtualservice() {
    return poolgroupsPerVirtualservice;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of poolgroups per virtualservice.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolgroupsPerVirtualservice set the poolgroupsPerVirtualservice.
   */
  @VsoMethod
  public void setPoolgroupsPerVirtualservice(Integer  poolgroupsPerVirtualservice) {
    this.poolgroupsPerVirtualservice = poolgroupsPerVirtualservice;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of pools per poolgroup.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolsPerPoolgroup
   */
  @VsoMethod
  public Integer getPoolsPerPoolgroup() {
    return poolsPerPoolgroup;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of pools per poolgroup.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolsPerPoolgroup set the poolsPerPoolgroup.
   */
  @VsoMethod
  public void setPoolsPerPoolgroup(Integer  poolsPerPoolgroup) {
    this.poolsPerPoolgroup = poolsPerPoolgroup;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of pools per virtualservice.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolsPerVirtualservice
   */
  @VsoMethod
  public Integer getPoolsPerVirtualservice() {
    return poolsPerVirtualservice;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of pools per virtualservice.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolsPerVirtualservice set the poolsPerVirtualservice.
   */
  @VsoMethod
  public void setPoolsPerVirtualservice(Integer  poolsPerVirtualservice) {
    this.poolsPerVirtualservice = poolsPerVirtualservice;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of routes per vrfcontext.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return routesPerVrfcontext
   */
  @VsoMethod
  public Integer getRoutesPerVrfcontext() {
    return routesPerVrfcontext;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of routes per vrfcontext.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param routesPerVrfcontext set the routesPerVrfcontext.
   */
  @VsoMethod
  public void setRoutesPerVrfcontext(Integer  routesPerVrfcontext) {
    this.routesPerVrfcontext = routesPerVrfcontext;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of nat rules in nat policy.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rulesPerNatPolicy
   */
  @VsoMethod
  public Integer getRulesPerNatPolicy() {
    return rulesPerNatPolicy;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of nat rules in nat policy.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rulesPerNatPolicy set the rulesPerNatPolicy.
   */
  @VsoMethod
  public void setRulesPerNatPolicy(Integer  rulesPerNatPolicy) {
    this.rulesPerNatPolicy = rulesPerNatPolicy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of rules per networksecuritypolicy.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rulesPerNetworksecuritypolicy
   */
  @VsoMethod
  public Integer getRulesPerNetworksecuritypolicy() {
    return rulesPerNetworksecuritypolicy;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of rules per networksecuritypolicy.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rulesPerNetworksecuritypolicy set the rulesPerNetworksecuritypolicy.
   */
  @VsoMethod
  public void setRulesPerNetworksecuritypolicy(Integer  rulesPerNetworksecuritypolicy) {
    this.rulesPerNetworksecuritypolicy = rulesPerNetworksecuritypolicy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of servers per pool.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serversPerPool
   */
  @VsoMethod
  public Integer getServersPerPool() {
    return serversPerPool;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of servers per pool.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serversPerPool set the serversPerPool.
   */
  @VsoMethod
  public void setServersPerPool(Integer  serversPerPool) {
    this.serversPerPool = serversPerPool;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of sni children virtualservices per sni parent virtualservice.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sniChildrenPerParent
   */
  @VsoMethod
  public Integer getSniChildrenPerParent() {
    return sniChildrenPerParent;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of sni children virtualservices per sni parent virtualservice.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sniChildrenPerParent set the sniChildrenPerParent.
   */
  @VsoMethod
  public void setSniChildrenPerParent(Integer  sniChildrenPerParent) {
    this.sniChildrenPerParent = sniChildrenPerParent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of strings per stringgroup.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringsPerStringgroup
   */
  @VsoMethod
  public Integer getStringsPerStringgroup() {
    return stringsPerStringgroup;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of strings per stringgroup.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param stringsPerStringgroup set the stringsPerStringgroup.
   */
  @VsoMethod
  public void setStringsPerStringgroup(Integer  stringsPerStringgroup) {
    this.stringsPerStringgroup = stringsPerStringgroup;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of serviceengine per virtualservice in bgp scaleout mode.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsBgpScaleout
   */
  @VsoMethod
  public Integer getVsBgpScaleout() {
    return vsBgpScaleout;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of serviceengine per virtualservice in bgp scaleout mode.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsBgpScaleout set the vsBgpScaleout.
   */
  @VsoMethod
  public void setVsBgpScaleout(Integer  vsBgpScaleout) {
    this.vsBgpScaleout = vsBgpScaleout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of serviceengine per virtualservice in layer 2 scaleout mode.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsL2Scaleout
   */
  @VsoMethod
  public Integer getVsL2Scaleout() {
    return vsL2Scaleout;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of serviceengine per virtualservice in layer 2 scaleout mode.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsL2Scaleout set the vsL2Scaleout.
   */
  @VsoMethod
  public void setVsL2Scaleout(Integer  vsL2Scaleout) {
    this.vsL2Scaleout = vsL2Scaleout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf system limits.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return wafLimits
   */
  @VsoMethod
  public WAFLimits getWafLimits() {
    return wafLimits;
  }

  /**
   * This is the setter method to the attribute.
   * Waf system limits.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param wafLimits set the wafLimits.
   */
  @VsoMethod
  public void setWafLimits(WAFLimits wafLimits) {
    this.wafLimits = wafLimits;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerLimits objControllerLimits = (ControllerLimits) o;
  return   Objects.equals(this.poolsPerVirtualservice, objControllerLimits.poolsPerVirtualservice)&&
  Objects.equals(this.poolgroupsPerVirtualservice, objControllerLimits.poolgroupsPerVirtualservice)&&
  Objects.equals(this.certificatesPerVirtualservice, objControllerLimits.certificatesPerVirtualservice)&&
  Objects.equals(this.poolsPerPoolgroup, objControllerLimits.poolsPerPoolgroup)&&
  Objects.equals(this.rulesPerNetworksecuritypolicy, objControllerLimits.rulesPerNetworksecuritypolicy)&&
  Objects.equals(this.serversPerPool, objControllerLimits.serversPerPool)&&
  Objects.equals(this.routesPerVrfcontext, objControllerLimits.routesPerVrfcontext)&&
  Objects.equals(this.defaultRoutesPerVrfcontext, objControllerLimits.defaultRoutesPerVrfcontext)&&
  Objects.equals(this.sniChildrenPerParent, objControllerLimits.sniChildrenPerParent)&&
  Objects.equals(this.ipsPerIpgroup, objControllerLimits.ipsPerIpgroup)&&
  Objects.equals(this.stringsPerStringgroup, objControllerLimits.stringsPerStringgroup)&&
  Objects.equals(this.vsL2Scaleout, objControllerLimits.vsL2Scaleout)&&
  Objects.equals(this.vsBgpScaleout, objControllerLimits.vsBgpScaleout)&&
  Objects.equals(this.gatewayMonPerVrf, objControllerLimits.gatewayMonPerVrf)&&
  Objects.equals(this.wafLimits, objControllerLimits.wafLimits)&&
  Objects.equals(this.rulesPerNatPolicy, objControllerLimits.rulesPerNatPolicy)&&
  Objects.equals(this.ipaddressLimits, objControllerLimits.ipaddressLimits)&&
  Objects.equals(this.botLimits, objControllerLimits.botLimits)&&
  Objects.equals(this.l7Limits, objControllerLimits.l7Limits)&&
  Objects.equals(this.controllerSizingLimits, objControllerLimits.controllerSizingLimits)&&
  Objects.equals(this.controllerCloudLimits, objControllerLimits.controllerCloudLimits);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerLimits {\n");
      sb.append("    botLimits: ").append(toIndentedString(botLimits)).append("\n");
        sb.append("    certificatesPerVirtualservice: ").append(toIndentedString(certificatesPerVirtualservice)).append("\n");
        sb.append("    controllerCloudLimits: ").append(toIndentedString(controllerCloudLimits)).append("\n");
        sb.append("    controllerSizingLimits: ").append(toIndentedString(controllerSizingLimits)).append("\n");
        sb.append("    defaultRoutesPerVrfcontext: ").append(toIndentedString(defaultRoutesPerVrfcontext)).append("\n");
        sb.append("    gatewayMonPerVrf: ").append(toIndentedString(gatewayMonPerVrf)).append("\n");
        sb.append("    ipaddressLimits: ").append(toIndentedString(ipaddressLimits)).append("\n");
        sb.append("    ipsPerIpgroup: ").append(toIndentedString(ipsPerIpgroup)).append("\n");
        sb.append("    l7Limits: ").append(toIndentedString(l7Limits)).append("\n");
        sb.append("    poolgroupsPerVirtualservice: ").append(toIndentedString(poolgroupsPerVirtualservice)).append("\n");
        sb.append("    poolsPerPoolgroup: ").append(toIndentedString(poolsPerPoolgroup)).append("\n");
        sb.append("    poolsPerVirtualservice: ").append(toIndentedString(poolsPerVirtualservice)).append("\n");
        sb.append("    routesPerVrfcontext: ").append(toIndentedString(routesPerVrfcontext)).append("\n");
        sb.append("    rulesPerNatPolicy: ").append(toIndentedString(rulesPerNatPolicy)).append("\n");
        sb.append("    rulesPerNetworksecuritypolicy: ").append(toIndentedString(rulesPerNetworksecuritypolicy)).append("\n");
        sb.append("    serversPerPool: ").append(toIndentedString(serversPerPool)).append("\n");
        sb.append("    sniChildrenPerParent: ").append(toIndentedString(sniChildrenPerParent)).append("\n");
        sb.append("    stringsPerStringgroup: ").append(toIndentedString(stringsPerStringgroup)).append("\n");
        sb.append("    vsBgpScaleout: ").append(toIndentedString(vsBgpScaleout)).append("\n");
        sb.append("    vsL2Scaleout: ").append(toIndentedString(vsL2Scaleout)).append("\n");
        sb.append("    wafLimits: ").append(toIndentedString(wafLimits)).append("\n");
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

