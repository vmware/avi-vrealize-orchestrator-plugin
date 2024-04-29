package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SeList is a POJO class extends AviRestResource that used for creating
 * SeList.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeList")
@VsoFinder(name = Constants.FINDER_VRO_SELIST)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeList extends AviRestResource {
    @JsonProperty("active_on_cloud")
    @JsonInclude(Include.NON_NULL)
    private Boolean activeOnCloud;

    @JsonProperty("active_on_se")
    @JsonInclude(Include.NON_NULL)
    private Boolean activeOnSe;

    @JsonProperty("admin_down_requested")
    @JsonInclude(Include.NON_NULL)
    private Boolean adminDownRequested = false;

    @JsonProperty("attach_ip_in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean attachIpInProgress;

    @JsonProperty("cloud_programming_done")
    @JsonInclude(Include.NON_NULL)
    private Boolean cloudProgrammingDone;

    @JsonProperty("cloud_programming_status")
    @JsonInclude(Include.NON_NULL)
    private String cloudProgrammingStatus;

    @JsonProperty("delete_in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean deleteInProgress = false;

    @JsonProperty("detach_ip_in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean detachIpInProgress;

    @JsonProperty("floating_intf_ip")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddr> floatingIntfIp;

    @JsonProperty("floating_intf_ip6_addresses")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddr> floatingIntfIp6Addresses;

    @JsonProperty("incarnation")
    @JsonInclude(Include.NON_NULL)
    private String incarnation;

    @JsonProperty("is_portchannel")
    @JsonInclude(Include.NON_NULL)
    private Boolean isPortchannel = false;

    @JsonProperty("is_primary")
    @JsonInclude(Include.NON_NULL)
    private Boolean isPrimary = true;

    @JsonProperty("is_standby")
    @JsonInclude(Include.NON_NULL)
    private Boolean isStandby = false;

    @JsonProperty("memory")
    @JsonInclude(Include.NON_NULL)
    private Integer memory = 2001;

    @JsonProperty("mgmt_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr mgmtIp;

    @JsonProperty("mgmt_ip6")
    @JsonInclude(Include.NON_NULL)
    private IpAddr mgmtIp6;

    @JsonProperty("route_revoked_pool_down")
    @JsonInclude(Include.NON_NULL)
    private Boolean routeRevokedPoolDown;

    @JsonProperty("scaleout_in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean scaleoutInProgress = false;

    @JsonProperty("se_programming_done")
    @JsonInclude(Include.NON_NULL)
    private Boolean seProgrammingDone;

    @JsonProperty("se_ready_in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean seReadyInProgress;

    @JsonProperty("se_ref")
    @JsonInclude(Include.NON_NULL)
    private String seRef;

    @JsonProperty("sec_idx")
    @JsonInclude(Include.NON_NULL)
    private Integer secIdx = 1;

    @JsonProperty("snat_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr snatIp;

    @JsonProperty("snat_ip6_address")
    @JsonInclude(Include.NON_NULL)
    private IpAddr snatIp6Address;

    @JsonProperty("vcpus")
    @JsonInclude(Include.NON_NULL)
    private Integer vcpus = 2;

    @JsonProperty("vip6_subnet_mask")
    @JsonInclude(Include.NON_NULL)
    private Integer vip6SubnetMask = 128;

    @JsonProperty("vip_intf_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr vipIntfIp;

    @JsonProperty("vip_intf_list")
    @JsonInclude(Include.NON_NULL)
    private List<SeVipInterfaceList> vipIntfList;

    @JsonProperty("vip_intf_mac")
    @JsonInclude(Include.NON_NULL)
    private String vipIntfMac;

    @JsonProperty("vip_subnet_mask")
    @JsonInclude(Include.NON_NULL)
    private Integer vipSubnetMask = 32;

    @JsonProperty("vlan_id")
    @JsonInclude(Include.NON_NULL)
    private Integer vlanId = 0;

    @JsonProperty("vnic")
    @JsonInclude(Include.NON_NULL)
    private List<VsSeVnic> vnic;



  /**
   * This is the getter method this will return the attribute value.
   * Vip is active on cloud.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return activeOnCloud
   */
  @VsoMethod
  public Boolean getActiveOnCloud() {
    return activeOnCloud;
  }

  /**
   * This is the setter method to the attribute.
   * Vip is active on cloud.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param activeOnCloud set the activeOnCloud.
   */
  @VsoMethod
  public void setActiveOnCloud(Boolean  activeOnCloud) {
    this.activeOnCloud = activeOnCloud;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vip is active on this serviceengine.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return activeOnSe
   */
  @VsoMethod
  public Boolean getActiveOnSe() {
    return activeOnSe;
  }

  /**
   * This is the setter method to the attribute.
   * Vip is active on this serviceengine.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param activeOnSe set the activeOnSe.
   */
  @VsoMethod
  public void setActiveOnSe(Boolean  activeOnSe) {
    this.activeOnSe = activeOnSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This flag is set when scaling in an se in admin down mode.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return adminDownRequested
   */
  @VsoMethod
  public Boolean getAdminDownRequested() {
    return adminDownRequested;
  }

  /**
   * This is the setter method to the attribute.
   * This flag is set when scaling in an se in admin down mode.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param adminDownRequested set the adminDownRequested.
   */
  @VsoMethod
  public void setAdminDownRequested(Boolean  adminDownRequested) {
    this.adminDownRequested = adminDownRequested;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Attach ip is in progress.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attachIpInProgress
   */
  @VsoMethod
  public Boolean getAttachIpInProgress() {
    return attachIpInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Attach ip is in progress.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param attachIpInProgress set the attachIpInProgress.
   */
  @VsoMethod
  public void setAttachIpInProgress(Boolean  attachIpInProgress) {
    this.attachIpInProgress = attachIpInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * All attempts to program the vip on cloud have been made.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudProgrammingDone
   */
  @VsoMethod
  public Boolean getCloudProgrammingDone() {
    return cloudProgrammingDone;
  }

  /**
   * This is the setter method to the attribute.
   * All attempts to program the vip on cloud have been made.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudProgrammingDone set the cloudProgrammingDone.
   */
  @VsoMethod
  public void setCloudProgrammingDone(Boolean  cloudProgrammingDone) {
    this.cloudProgrammingDone = cloudProgrammingDone;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status of vip on the cloud.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudProgrammingStatus
   */
  @VsoMethod
  public String getCloudProgrammingStatus() {
    return cloudProgrammingStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Status of vip on the cloud.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudProgrammingStatus set the cloudProgrammingStatus.
   */
  @VsoMethod
  public void setCloudProgrammingStatus(String  cloudProgrammingStatus) {
    this.cloudProgrammingStatus = cloudProgrammingStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This flag is set when an se is admin down or scaling in.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return deleteInProgress
   */
  @VsoMethod
  public Boolean getDeleteInProgress() {
    return deleteInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * This flag is set when an se is admin down or scaling in.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param deleteInProgress set the deleteInProgress.
   */
  @VsoMethod
  public void setDeleteInProgress(Boolean  deleteInProgress) {
    this.deleteInProgress = deleteInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Detach ip is in progress.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return detachIpInProgress
   */
  @VsoMethod
  public Boolean getDetachIpInProgress() {
    return detachIpInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Detach ip is in progress.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param detachIpInProgress set the detachIpInProgress.
   */
  @VsoMethod
  public void setDetachIpInProgress(Boolean  detachIpInProgress) {
    this.detachIpInProgress = detachIpInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIp
   */
  @VsoMethod
  public List<IpAddr> getFloatingIntfIp() {
    return floatingIntfIp;
  }

  /**
   * This is the setter method. this will set the floatingIntfIp
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIp
   */
  @VsoMethod
  public void setFloatingIntfIp(List<IpAddr>  floatingIntfIp) {
    this.floatingIntfIp = floatingIntfIp;
  }

  /**
   * This is the setter method this will set the floatingIntfIp
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIp
   */
  @VsoMethod
  public SeList addFloatingIntfIpItem(IpAddr floatingIntfIpItem) {
    if (this.floatingIntfIp == null) {
      this.floatingIntfIp = new ArrayList<IpAddr>();
    }
    this.floatingIntfIp.add(floatingIntfIpItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Ipv6 floating interface ips for the routingservice.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIp6Addresses
   */
  @VsoMethod
  public List<IpAddr> getFloatingIntfIp6Addresses() {
    return floatingIntfIp6Addresses;
  }

  /**
   * This is the setter method. this will set the floatingIntfIp6Addresses
   * Ipv6 floating interface ips for the routingservice.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIp6Addresses
   */
  @VsoMethod
  public void setFloatingIntfIp6Addresses(List<IpAddr>  floatingIntfIp6Addresses) {
    this.floatingIntfIp6Addresses = floatingIntfIp6Addresses;
  }

  /**
   * This is the setter method this will set the floatingIntfIp6Addresses
   * Ipv6 floating interface ips for the routingservice.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingIntfIp6Addresses
   */
  @VsoMethod
  public SeList addFloatingIntfIp6AddressesItem(IpAddr floatingIntfIp6AddressesItem) {
    if (this.floatingIntfIp6Addresses == null) {
      this.floatingIntfIp6Addresses = new ArrayList<IpAddr>();
    }
    this.floatingIntfIp6Addresses.add(floatingIntfIp6AddressesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Updated whenever this entry is created.
   * When the sees this has changed, it means that the se should disrupt, since there was a delete then create, not an update.
   * Field introduced in 18.1.5,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return incarnation
   */
  @VsoMethod
  public String getIncarnation() {
    return incarnation;
  }

  /**
   * This is the setter method to the attribute.
   * Updated whenever this entry is created.
   * When the sees this has changed, it means that the se should disrupt, since there was a delete then create, not an update.
   * Field introduced in 18.1.5,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param incarnation set the incarnation.
   */
  @VsoMethod
  public void setIncarnation(String  incarnation) {
    this.incarnation = incarnation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isPortchannel
   */
  @VsoMethod
  public Boolean getIsPortchannel() {
    return isPortchannel;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isPortchannel set the isPortchannel.
   */
  @VsoMethod
  public void setIsPortchannel(Boolean  isPortchannel) {
    this.isPortchannel = isPortchannel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return isPrimary
   */
  @VsoMethod
  public Boolean getIsPrimary() {
    return isPrimary;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param isPrimary set the isPrimary.
   */
  @VsoMethod
  public void setIsPrimary(Boolean  isPrimary) {
    this.isPrimary = isPrimary;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isStandby
   */
  @VsoMethod
  public Boolean getIsStandby() {
    return isStandby;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isStandby set the isStandby.
   */
  @VsoMethod
  public void setIsStandby(Boolean  isStandby) {
    this.isStandby = isStandby;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2001.
   * @return memory
   */
  @VsoMethod
  public Integer getMemory() {
    return memory;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2001.
   * @param memory set the memory.
   */
  @VsoMethod
  public void setMemory(Integer  memory) {
    this.memory = memory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Management ipv4 address of se.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mgmtIp
   */
  @VsoMethod
  public IpAddr getMgmtIp() {
    return mgmtIp;
  }

  /**
   * This is the setter method to the attribute.
   * Management ipv4 address of se.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mgmtIp set the mgmtIp.
   */
  @VsoMethod
  public void setMgmtIp(IpAddr mgmtIp) {
    this.mgmtIp = mgmtIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Management ipv6 address of se.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mgmtIp6
   */
  @VsoMethod
  public IpAddr getMgmtIp6() {
    return mgmtIp6;
  }

  /**
   * This is the setter method to the attribute.
   * Management ipv6 address of se.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mgmtIp6 set the mgmtIp6.
   */
  @VsoMethod
  public void setMgmtIp6(IpAddr mgmtIp6) {
    this.mgmtIp6 = mgmtIp6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vip route is revoked as pool went down.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return routeRevokedPoolDown
   */
  @VsoMethod
  public Boolean getRouteRevokedPoolDown() {
    return routeRevokedPoolDown;
  }

  /**
   * This is the setter method to the attribute.
   * Vip route is revoked as pool went down.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param routeRevokedPoolDown set the routeRevokedPoolDown.
   */
  @VsoMethod
  public void setRouteRevokedPoolDown(Boolean  routeRevokedPoolDown) {
    this.routeRevokedPoolDown = routeRevokedPoolDown;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This flag is set when a vs is actively scaling out to this se.
   * Field introduced in 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return scaleoutInProgress
   */
  @VsoMethod
  public Boolean getScaleoutInProgress() {
    return scaleoutInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * This flag is set when a vs is actively scaling out to this se.
   * Field introduced in 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param scaleoutInProgress set the scaleoutInProgress.
   */
  @VsoMethod
  public void setScaleoutInProgress(Boolean  scaleoutInProgress) {
    this.scaleoutInProgress = scaleoutInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * All attempts to program the vip on this serviceengine have been made.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seProgrammingDone
   */
  @VsoMethod
  public Boolean getSeProgrammingDone() {
    return seProgrammingDone;
  }

  /**
   * This is the setter method to the attribute.
   * All attempts to program the vip on this serviceengine have been made.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seProgrammingDone set the seProgrammingDone.
   */
  @VsoMethod
  public void setSeProgrammingDone(Boolean  seProgrammingDone) {
    this.seProgrammingDone = seProgrammingDone;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vip is awaiting response from this serviceengine.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seReadyInProgress
   */
  @VsoMethod
  public Boolean getSeReadyInProgress() {
    return seReadyInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Vip is awaiting response from this serviceengine.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seReadyInProgress set the seReadyInProgress.
   */
  @VsoMethod
  public void setSeReadyInProgress(Boolean  seReadyInProgress) {
    this.seReadyInProgress = seReadyInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seRef
   */
  @VsoMethod
  public String getSeRef() {
    return seRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seRef set the seRef.
   */
  @VsoMethod
  public void setSeRef(String  seRef) {
    this.seRef = seRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return secIdx
   */
  @VsoMethod
  public Integer getSecIdx() {
    return secIdx;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param secIdx set the secIdx.
   */
  @VsoMethod
  public void setSecIdx(Integer  secIdx) {
    this.secIdx = secIdx;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return snatIp
   */
  @VsoMethod
  public IpAddr getSnatIp() {
    return snatIp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param snatIp set the snatIp.
   */
  @VsoMethod
  public void setSnatIp(IpAddr snatIp) {
    this.snatIp = snatIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipv6 address for se snat.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return snatIp6Address
   */
  @VsoMethod
  public IpAddr getSnatIp6Address() {
    return snatIp6Address;
  }

  /**
   * This is the setter method to the attribute.
   * Ipv6 address for se snat.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param snatIp6Address set the snatIp6Address.
   */
  @VsoMethod
  public void setSnatIp6Address(IpAddr snatIp6Address) {
    this.snatIp6Address = snatIp6Address;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return vcpus
   */
  @VsoMethod
  public Integer getVcpus() {
    return vcpus;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param vcpus set the vcpus.
   */
  @VsoMethod
  public void setVcpus(Integer  vcpus) {
    this.vcpus = vcpus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @return vip6SubnetMask
   */
  @VsoMethod
  public Integer getVip6SubnetMask() {
    return vip6SubnetMask;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 128.
   * @param vip6SubnetMask set the vip6SubnetMask.
   */
  @VsoMethod
  public void setVip6SubnetMask(Integer  vip6SubnetMask) {
    this.vip6SubnetMask = vip6SubnetMask;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipIntfIp
   */
  @VsoMethod
  public IpAddr getVipIntfIp() {
    return vipIntfIp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipIntfIp set the vipIntfIp.
   */
  @VsoMethod
  public void setVipIntfIp(IpAddr vipIntfIp) {
    this.vipIntfIp = vipIntfIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipIntfList
   */
  @VsoMethod
  public List<SeVipInterfaceList> getVipIntfList() {
    return vipIntfList;
  }

  /**
   * This is the setter method. this will set the vipIntfList
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipIntfList
   */
  @VsoMethod
  public void setVipIntfList(List<SeVipInterfaceList>  vipIntfList) {
    this.vipIntfList = vipIntfList;
  }

  /**
   * This is the setter method this will set the vipIntfList
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipIntfList
   */
  @VsoMethod
  public SeList addVipIntfListItem(SeVipInterfaceList vipIntfListItem) {
    if (this.vipIntfList == null) {
      this.vipIntfList = new ArrayList<SeVipInterfaceList>();
    }
    this.vipIntfList.add(vipIntfListItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipIntfMac
   */
  @VsoMethod
  public String getVipIntfMac() {
    return vipIntfMac;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vipIntfMac set the vipIntfMac.
   */
  @VsoMethod
  public void setVipIntfMac(String  vipIntfMac) {
    this.vipIntfMac = vipIntfMac;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 32.
   * @return vipSubnetMask
   */
  @VsoMethod
  public Integer getVipSubnetMask() {
    return vipSubnetMask;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 32.
   * @param vipSubnetMask set the vipSubnetMask.
   */
  @VsoMethod
  public void setVipSubnetMask(Integer  vipSubnetMask) {
    this.vipSubnetMask = vipSubnetMask;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return vlanId
   */
  @VsoMethod
  public Integer getVlanId() {
    return vlanId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param vlanId set the vlanId.
   */
  @VsoMethod
  public void setVlanId(Integer  vlanId) {
    this.vlanId = vlanId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vnic
   */
  @VsoMethod
  public List<VsSeVnic> getVnic() {
    return vnic;
  }

  /**
   * This is the setter method. this will set the vnic
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vnic
   */
  @VsoMethod
  public void setVnic(List<VsSeVnic>  vnic) {
    this.vnic = vnic;
  }

  /**
   * This is the setter method this will set the vnic
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vnic
   */
  @VsoMethod
  public SeList addVnicItem(VsSeVnic vnicItem) {
    if (this.vnic == null) {
      this.vnic = new ArrayList<VsSeVnic>();
    }
    this.vnic.add(vnicItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeList objSeList = (SeList) o;
  return   Objects.equals(this.seRef, objSeList.seRef)&&
  Objects.equals(this.isPrimary, objSeList.isPrimary)&&
  Objects.equals(this.isStandby, objSeList.isStandby)&&
  Objects.equals(this.deleteInProgress, objSeList.deleteInProgress)&&
  Objects.equals(this.vcpus, objSeList.vcpus)&&
  Objects.equals(this.memory, objSeList.memory)&&
  Objects.equals(this.vipIntfMac, objSeList.vipIntfMac)&&
  Objects.equals(this.vipSubnetMask, objSeList.vipSubnetMask)&&
  Objects.equals(this.vnic, objSeList.vnic)&&
  Objects.equals(this.secIdx, objSeList.secIdx)&&
  Objects.equals(this.vlanId, objSeList.vlanId)&&
  Objects.equals(this.snatIp, objSeList.snatIp)&&
  Objects.equals(this.vipIntfIp, objSeList.vipIntfIp)&&
  Objects.equals(this.vipIntfList, objSeList.vipIntfList)&&
  Objects.equals(this.floatingIntfIp, objSeList.floatingIntfIp)&&
  Objects.equals(this.isPortchannel, objSeList.isPortchannel)&&
  Objects.equals(this.adminDownRequested, objSeList.adminDownRequested)&&
  Objects.equals(this.vip6SubnetMask, objSeList.vip6SubnetMask)&&
  Objects.equals(this.incarnation, objSeList.incarnation)&&
  Objects.equals(this.scaleoutInProgress, objSeList.scaleoutInProgress)&&
  Objects.equals(this.mgmtIp, objSeList.mgmtIp)&&
  Objects.equals(this.mgmtIp6, objSeList.mgmtIp6)&&
  Objects.equals(this.seReadyInProgress, objSeList.seReadyInProgress)&&
  Objects.equals(this.activeOnSe, objSeList.activeOnSe)&&
  Objects.equals(this.seProgrammingDone, objSeList.seProgrammingDone)&&
  Objects.equals(this.attachIpInProgress, objSeList.attachIpInProgress)&&
  Objects.equals(this.detachIpInProgress, objSeList.detachIpInProgress)&&
  Objects.equals(this.activeOnCloud, objSeList.activeOnCloud)&&
  Objects.equals(this.cloudProgrammingDone, objSeList.cloudProgrammingDone)&&
  Objects.equals(this.cloudProgrammingStatus, objSeList.cloudProgrammingStatus)&&
  Objects.equals(this.snatIp6Address, objSeList.snatIp6Address)&&
  Objects.equals(this.floatingIntfIp6Addresses, objSeList.floatingIntfIp6Addresses)&&
  Objects.equals(this.routeRevokedPoolDown, objSeList.routeRevokedPoolDown);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeList {\n");
      sb.append("    activeOnCloud: ").append(toIndentedString(activeOnCloud)).append("\n");
        sb.append("    activeOnSe: ").append(toIndentedString(activeOnSe)).append("\n");
        sb.append("    adminDownRequested: ").append(toIndentedString(adminDownRequested)).append("\n");
        sb.append("    attachIpInProgress: ").append(toIndentedString(attachIpInProgress)).append("\n");
        sb.append("    cloudProgrammingDone: ").append(toIndentedString(cloudProgrammingDone)).append("\n");
        sb.append("    cloudProgrammingStatus: ").append(toIndentedString(cloudProgrammingStatus)).append("\n");
        sb.append("    deleteInProgress: ").append(toIndentedString(deleteInProgress)).append("\n");
        sb.append("    detachIpInProgress: ").append(toIndentedString(detachIpInProgress)).append("\n");
        sb.append("    floatingIntfIp: ").append(toIndentedString(floatingIntfIp)).append("\n");
        sb.append("    floatingIntfIp6Addresses: ").append(toIndentedString(floatingIntfIp6Addresses)).append("\n");
        sb.append("    incarnation: ").append(toIndentedString(incarnation)).append("\n");
        sb.append("    isPortchannel: ").append(toIndentedString(isPortchannel)).append("\n");
        sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
        sb.append("    isStandby: ").append(toIndentedString(isStandby)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    mgmtIp: ").append(toIndentedString(mgmtIp)).append("\n");
        sb.append("    mgmtIp6: ").append(toIndentedString(mgmtIp6)).append("\n");
        sb.append("    routeRevokedPoolDown: ").append(toIndentedString(routeRevokedPoolDown)).append("\n");
        sb.append("    scaleoutInProgress: ").append(toIndentedString(scaleoutInProgress)).append("\n");
        sb.append("    seProgrammingDone: ").append(toIndentedString(seProgrammingDone)).append("\n");
        sb.append("    seReadyInProgress: ").append(toIndentedString(seReadyInProgress)).append("\n");
        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
        sb.append("    secIdx: ").append(toIndentedString(secIdx)).append("\n");
        sb.append("    snatIp: ").append(toIndentedString(snatIp)).append("\n");
        sb.append("    snatIp6Address: ").append(toIndentedString(snatIp6Address)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    vip6SubnetMask: ").append(toIndentedString(vip6SubnetMask)).append("\n");
        sb.append("    vipIntfIp: ").append(toIndentedString(vipIntfIp)).append("\n");
        sb.append("    vipIntfList: ").append(toIndentedString(vipIntfList)).append("\n");
        sb.append("    vipIntfMac: ").append(toIndentedString(vipIntfMac)).append("\n");
        sb.append("    vipSubnetMask: ").append(toIndentedString(vipSubnetMask)).append("\n");
        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
        sb.append("    vnic: ").append(toIndentedString(vnic)).append("\n");
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

