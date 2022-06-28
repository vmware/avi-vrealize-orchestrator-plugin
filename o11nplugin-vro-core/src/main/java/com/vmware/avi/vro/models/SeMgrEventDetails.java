package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GcpInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SeMgrEventDetails is a POJO class extends AviRestResource that used for creating
 * SeMgrEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeMgrEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEMGREVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeMgrEventDetails extends AviRestResource {
    @JsonProperty("cloud_name")
    @JsonInclude(Include.NON_NULL)
    private String cloudName = null;

    @JsonProperty("cloud_uuid")
    @JsonInclude(Include.NON_NULL)
    private String cloudUuid = null;

    @JsonProperty("enable_state")
    @JsonInclude(Include.NON_NULL)
    private String enableState = null;

    @JsonProperty("gcp_info")
    @JsonInclude(Include.NON_NULL)
    private GcpInfo gcpInfo = null;

    @JsonProperty("host_name")
    @JsonInclude(Include.NON_NULL)
    private String hostName = null;

    @JsonProperty("host_uuid")
    @JsonInclude(Include.NON_NULL)
    private String hostUuid = null;

    @JsonProperty("memory")
    @JsonInclude(Include.NON_NULL)
    private Integer memory = null;

    @JsonProperty("migrate_state")
    @JsonInclude(Include.NON_NULL)
    private String migrateState = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("new_mgmt_ip")
    @JsonInclude(Include.NON_NULL)
    private String newMgmtIp = null;

    @JsonProperty("new_mgmt_ip6")
    @JsonInclude(Include.NON_NULL)
    private String newMgmtIp6 = null;

    @JsonProperty("old_mgmt_ip")
    @JsonInclude(Include.NON_NULL)
    private String oldMgmtIp = null;

    @JsonProperty("old_mgmt_ip6")
    @JsonInclude(Include.NON_NULL)
    private String oldMgmtIp6 = null;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason = null;

    @JsonProperty("se_grp_name")
    @JsonInclude(Include.NON_NULL)
    private String seGrpName = null;

    @JsonProperty("se_grp_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seGrpUuid = null;

    @JsonProperty("vcpus")
    @JsonInclude(Include.NON_NULL)
    private Integer vcpus = null;

    @JsonProperty("vs_name")
    @JsonInclude(Include.NON_NULL)
    private List<String> vsName = null;

    @JsonProperty("vs_uuid")
    @JsonInclude(Include.NON_NULL)
    private List<String> vsUuid = null;

    @JsonProperty("vsphere_ha_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean vsphereHaEnabled = null;

    @JsonProperty("vsphere_ha_inprogress")
    @JsonInclude(Include.NON_NULL)
    private Boolean vsphereHaInprogress = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudName
   */
  @VsoMethod
  public String getCloudName() {
    return cloudName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudName set the cloudName.
   */
  @VsoMethod
  public void setCloudName(String  cloudName) {
    this.cloudName = cloudName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudUuid
   */
  @VsoMethod
  public String getCloudUuid() {
    return cloudUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudUuid set the cloudUuid.
   */
  @VsoMethod
  public void setCloudUuid(String  cloudUuid) {
    this.cloudUuid = cloudUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enableState
   */
  @VsoMethod
  public String getEnableState() {
    return enableState;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param enableState set the enableState.
   */
  @VsoMethod
  public void setEnableState(String  enableState) {
    this.enableState = enableState;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gcpInfo
   */
  @VsoMethod
  public GcpInfo getGcpInfo() {
    return gcpInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gcpInfo set the gcpInfo.
   */
  @VsoMethod
  public void setGcpInfo(GcpInfo gcpInfo) {
    this.gcpInfo = gcpInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostName
   */
  @VsoMethod
  public String getHostName() {
    return hostName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostName set the hostName.
   */
  @VsoMethod
  public void setHostName(String  hostName) {
    this.hostName = hostName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostUuid
   */
  @VsoMethod
  public String getHostUuid() {
    return hostUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostUuid set the hostUuid.
   */
  @VsoMethod
  public void setHostUuid(String  hostUuid) {
    this.hostUuid = hostUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return memory
   */
  @VsoMethod
  public Integer getMemory() {
    return memory;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param memory set the memory.
   */
  @VsoMethod
  public void setMemory(Integer  memory) {
    this.memory = memory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return migrateState
   */
  @VsoMethod
  public String getMigrateState() {
    return migrateState;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param migrateState set the migrateState.
   */
  @VsoMethod
  public void setMigrateState(String  migrateState) {
    this.migrateState = migrateState;
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
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return newMgmtIp
   */
  @VsoMethod
  public String getNewMgmtIp() {
    return newMgmtIp;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param newMgmtIp set the newMgmtIp.
   */
  @VsoMethod
  public void setNewMgmtIp(String  newMgmtIp) {
    this.newMgmtIp = newMgmtIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return newMgmtIp6
   */
  @VsoMethod
  public String getNewMgmtIp6() {
    return newMgmtIp6;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param newMgmtIp6 set the newMgmtIp6.
   */
  @VsoMethod
  public void setNewMgmtIp6(String  newMgmtIp6) {
    this.newMgmtIp6 = newMgmtIp6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oldMgmtIp
   */
  @VsoMethod
  public String getOldMgmtIp() {
    return oldMgmtIp;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param oldMgmtIp set the oldMgmtIp.
   */
  @VsoMethod
  public void setOldMgmtIp(String  oldMgmtIp) {
    this.oldMgmtIp = oldMgmtIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oldMgmtIp6
   */
  @VsoMethod
  public String getOldMgmtIp6() {
    return oldMgmtIp6;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param oldMgmtIp6 set the oldMgmtIp6.
   */
  @VsoMethod
  public void setOldMgmtIp6(String  oldMgmtIp6) {
    this.oldMgmtIp6 = oldMgmtIp6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGrpName
   */
  @VsoMethod
  public String getSeGrpName() {
    return seGrpName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGrpName set the seGrpName.
   */
  @VsoMethod
  public void setSeGrpName(String  seGrpName) {
    this.seGrpName = seGrpName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGrpUuid
   */
  @VsoMethod
  public String getSeGrpUuid() {
    return seGrpUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGrpUuid set the seGrpUuid.
   */
  @VsoMethod
  public void setSeGrpUuid(String  seGrpUuid) {
    this.seGrpUuid = seGrpUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcpus
   */
  @VsoMethod
  public Integer getVcpus() {
    return vcpus;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcpus set the vcpus.
   */
  @VsoMethod
  public void setVcpus(Integer  vcpus) {
    this.vcpus = vcpus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsName
   */
  @VsoMethod
  public List<String> getVsName() {
    return vsName;
  }

  /**
   * This is the setter method. this will set the vsName
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsName
   */
  @VsoMethod
  public void setVsName(List<String>  vsName) {
    this.vsName = vsName;
  }

  /**
   * This is the setter method this will set the vsName
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsName
   */
  @VsoMethod
  public SeMgrEventDetails addVsNameItem(String vsNameItem) {
    if (this.vsName == null) {
      this.vsName = new ArrayList<String>();
    }
    this.vsName.add(vsNameItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuid
   */
  @VsoMethod
  public List<String> getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method. this will set the vsUuid
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuid
   */
  @VsoMethod
  public void setVsUuid(List<String>  vsUuid) {
    this.vsUuid = vsUuid;
  }

  /**
   * This is the setter method this will set the vsUuid
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuid
   */
  @VsoMethod
  public SeMgrEventDetails addVsUuidItem(String vsUuidItem) {
    if (this.vsUuid == null) {
      this.vsUuid = new ArrayList<String>();
    }
    this.vsUuid.add(vsUuidItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Vsphere ha on cluster enabled.
   * Field introduced in 20.1.7, 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsphereHaEnabled
   */
  @VsoMethod
  public Boolean getVsphereHaEnabled() {
    return vsphereHaEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Vsphere ha on cluster enabled.
   * Field introduced in 20.1.7, 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsphereHaEnabled set the vsphereHaEnabled.
   */
  @VsoMethod
  public void setVsphereHaEnabled(Boolean  vsphereHaEnabled) {
    this.vsphereHaEnabled = vsphereHaEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This flag is set to true when cloud connector has detected an esx host failure.
   * This flag is set to false when the se connects back to the controller, or when vsphere ha recovery timeout has occurred.
   * Field introduced in 20.1.7, 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsphereHaInprogress
   */
  @VsoMethod
  public Boolean getVsphereHaInprogress() {
    return vsphereHaInprogress;
  }

  /**
   * This is the setter method to the attribute.
   * This flag is set to true when cloud connector has detected an esx host failure.
   * This flag is set to false when the se connects back to the controller, or when vsphere ha recovery timeout has occurred.
   * Field introduced in 20.1.7, 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsphereHaInprogress set the vsphereHaInprogress.
   */
  @VsoMethod
  public void setVsphereHaInprogress(Boolean  vsphereHaInprogress) {
    this.vsphereHaInprogress = vsphereHaInprogress;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeMgrEventDetails objSeMgrEventDetails = (SeMgrEventDetails) o;
  return   Objects.equals(this.name, objSeMgrEventDetails.name)&&
  Objects.equals(this.reason, objSeMgrEventDetails.reason)&&
  Objects.equals(this.hostUuid, objSeMgrEventDetails.hostUuid)&&
  Objects.equals(this.hostName, objSeMgrEventDetails.hostName)&&
  Objects.equals(this.vsUuid, objSeMgrEventDetails.vsUuid)&&
  Objects.equals(this.vsName, objSeMgrEventDetails.vsName)&&
  Objects.equals(this.vcpus, objSeMgrEventDetails.vcpus)&&
  Objects.equals(this.memory, objSeMgrEventDetails.memory)&&
  Objects.equals(this.seGrpUuid, objSeMgrEventDetails.seGrpUuid)&&
  Objects.equals(this.seGrpName, objSeMgrEventDetails.seGrpName)&&
  Objects.equals(this.cloudUuid, objSeMgrEventDetails.cloudUuid)&&
  Objects.equals(this.cloudName, objSeMgrEventDetails.cloudName)&&
  Objects.equals(this.enableState, objSeMgrEventDetails.enableState)&&
  Objects.equals(this.migrateState, objSeMgrEventDetails.migrateState)&&
  Objects.equals(this.gcpInfo, objSeMgrEventDetails.gcpInfo)&&
  Objects.equals(this.oldMgmtIp, objSeMgrEventDetails.oldMgmtIp)&&
  Objects.equals(this.newMgmtIp, objSeMgrEventDetails.newMgmtIp)&&
  Objects.equals(this.oldMgmtIp6, objSeMgrEventDetails.oldMgmtIp6)&&
  Objects.equals(this.newMgmtIp6, objSeMgrEventDetails.newMgmtIp6)&&
  Objects.equals(this.vsphereHaEnabled, objSeMgrEventDetails.vsphereHaEnabled)&&
  Objects.equals(this.vsphereHaInprogress, objSeMgrEventDetails.vsphereHaInprogress);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeMgrEventDetails {\n");
      sb.append("    cloudName: ").append(toIndentedString(cloudName)).append("\n");
        sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
        sb.append("    enableState: ").append(toIndentedString(enableState)).append("\n");
        sb.append("    gcpInfo: ").append(toIndentedString(gcpInfo)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostUuid: ").append(toIndentedString(hostUuid)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    migrateState: ").append(toIndentedString(migrateState)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    newMgmtIp: ").append(toIndentedString(newMgmtIp)).append("\n");
        sb.append("    newMgmtIp6: ").append(toIndentedString(newMgmtIp6)).append("\n");
        sb.append("    oldMgmtIp: ").append(toIndentedString(oldMgmtIp)).append("\n");
        sb.append("    oldMgmtIp6: ").append(toIndentedString(oldMgmtIp6)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    seGrpName: ").append(toIndentedString(seGrpName)).append("\n");
        sb.append("    seGrpUuid: ").append(toIndentedString(seGrpUuid)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
        sb.append("    vsphereHaEnabled: ").append(toIndentedString(vsphereHaEnabled)).append("\n");
        sb.append("    vsphereHaInprogress: ").append(toIndentedString(vsphereHaInprogress)).append("\n");
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

