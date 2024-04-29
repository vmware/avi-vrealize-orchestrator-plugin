package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.OperationalStatus;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VipSeAssigned is a POJO class extends AviRestResource that used for creating
 * VipSeAssigned.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VipSeAssigned")
@VsoFinder(name = Constants.FINDER_VRO_VIPSEASSIGNED)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VipSeAssigned extends AviRestResource {
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

    @JsonProperty("connected")
    @JsonInclude(Include.NON_NULL)
    private Boolean connected;

    @JsonProperty("detach_ip_in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean detachIpInProgress;

    @JsonProperty("mgmt_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr mgmtIp;

    @JsonProperty("mgmt_ip6")
    @JsonInclude(Include.NON_NULL)
    private IpAddr mgmtIp6;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("oper_status")
    @JsonInclude(Include.NON_NULL)
    private OperationalStatus operStatus;

    @JsonProperty("primary")
    @JsonInclude(Include.NON_NULL)
    private Boolean primary;

    @JsonProperty("ref")
    @JsonInclude(Include.NON_NULL)
    private String ref;

    @JsonProperty("route_revoked_pool_down")
    @JsonInclude(Include.NON_NULL)
    private Boolean routeRevokedPoolDown;

    @JsonProperty("scalein_in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean scaleinInProgress = false;

    @JsonProperty("scaleout_in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean scaleoutInProgress;

    @JsonProperty("se_ready_in_progress")
    @JsonInclude(Include.NON_NULL)
    private Boolean seReadyInProgress;

    @JsonProperty("snat_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr snatIp;

    @JsonProperty("snat_ip6_address")
    @JsonInclude(Include.NON_NULL)
    private IpAddr snatIp6Address;

    @JsonProperty("standby")
    @JsonInclude(Include.NON_NULL)
    private Boolean standby;



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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return connected
   */
  @VsoMethod
  public Boolean getConnected() {
    return connected;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param connected set the connected.
   */
  @VsoMethod
  public void setConnected(Boolean  connected) {
    this.connected = connected;
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
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
   * @return primary
   */
  @VsoMethod
  public Boolean getPrimary() {
    return primary;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param primary set the primary.
   */
  @VsoMethod
  public void setPrimary(Boolean  primary) {
    this.primary = primary;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ref
   */
  @VsoMethod
  public String getRef() {
    return ref;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ref set the ref.
   */
  @VsoMethod
  public void setRef(String  ref) {
    this.ref = ref;
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return scaleinInProgress
   */
  @VsoMethod
  public Boolean getScaleinInProgress() {
    return scaleinInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param scaleinInProgress set the scaleinInProgress.
   */
  @VsoMethod
  public void setScaleinInProgress(Boolean  scaleinInProgress) {
    this.scaleinInProgress = scaleinInProgress;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vip is awaiting scaleout response from this serviceengine.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scaleoutInProgress
   */
  @VsoMethod
  public Boolean getScaleoutInProgress() {
    return scaleoutInProgress;
  }

  /**
   * This is the setter method to the attribute.
   * Vip is awaiting scaleout response from this serviceengine.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param scaleoutInProgress set the scaleoutInProgress.
   */
  @VsoMethod
  public void setScaleoutInProgress(Boolean  scaleoutInProgress) {
    this.scaleoutInProgress = scaleoutInProgress;
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
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return standby
   */
  @VsoMethod
  public Boolean getStandby() {
    return standby;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param standby set the standby.
   */
  @VsoMethod
  public void setStandby(Boolean  standby) {
    this.standby = standby;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VipSeAssigned objVipSeAssigned = (VipSeAssigned) o;
  return   Objects.equals(this.name, objVipSeAssigned.name)&&
  Objects.equals(this.primary, objVipSeAssigned.primary)&&
  Objects.equals(this.standby, objVipSeAssigned.standby)&&
  Objects.equals(this.connected, objVipSeAssigned.connected)&&
  Objects.equals(this.scaleinInProgress, objVipSeAssigned.scaleinInProgress)&&
  Objects.equals(this.operStatus, objVipSeAssigned.operStatus)&&
  Objects.equals(this.snatIp, objVipSeAssigned.snatIp)&&
  Objects.equals(this.adminDownRequested, objVipSeAssigned.adminDownRequested)&&
  Objects.equals(this.mgmtIp, objVipSeAssigned.mgmtIp)&&
  Objects.equals(this.mgmtIp6, objVipSeAssigned.mgmtIp6)&&
  Objects.equals(this.activeOnCloud, objVipSeAssigned.activeOnCloud)&&
  Objects.equals(this.attachIpInProgress, objVipSeAssigned.attachIpInProgress)&&
  Objects.equals(this.detachIpInProgress, objVipSeAssigned.detachIpInProgress)&&
  Objects.equals(this.activeOnSe, objVipSeAssigned.activeOnSe)&&
  Objects.equals(this.scaleoutInProgress, objVipSeAssigned.scaleoutInProgress)&&
  Objects.equals(this.seReadyInProgress, objVipSeAssigned.seReadyInProgress)&&
  Objects.equals(this.snatIp6Address, objVipSeAssigned.snatIp6Address)&&
  Objects.equals(this.routeRevokedPoolDown, objVipSeAssigned.routeRevokedPoolDown)&&
  Objects.equals(this.ref, objVipSeAssigned.ref);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VipSeAssigned {\n");
      sb.append("    activeOnCloud: ").append(toIndentedString(activeOnCloud)).append("\n");
        sb.append("    activeOnSe: ").append(toIndentedString(activeOnSe)).append("\n");
        sb.append("    adminDownRequested: ").append(toIndentedString(adminDownRequested)).append("\n");
        sb.append("    attachIpInProgress: ").append(toIndentedString(attachIpInProgress)).append("\n");
        sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
        sb.append("    detachIpInProgress: ").append(toIndentedString(detachIpInProgress)).append("\n");
        sb.append("    mgmtIp: ").append(toIndentedString(mgmtIp)).append("\n");
        sb.append("    mgmtIp6: ").append(toIndentedString(mgmtIp6)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    routeRevokedPoolDown: ").append(toIndentedString(routeRevokedPoolDown)).append("\n");
        sb.append("    scaleinInProgress: ").append(toIndentedString(scaleinInProgress)).append("\n");
        sb.append("    scaleoutInProgress: ").append(toIndentedString(scaleoutInProgress)).append("\n");
        sb.append("    seReadyInProgress: ").append(toIndentedString(seReadyInProgress)).append("\n");
        sb.append("    snatIp: ").append(toIndentedString(snatIp)).append("\n");
        sb.append("    snatIp6Address: ").append(toIndentedString(snatIp6Address)).append("\n");
        sb.append("    standby: ").append(toIndentedString(standby)).append("\n");
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

