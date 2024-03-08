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
 * The PortalFeatureOptIn is a POJO class extends AviRestResource that used for creating
 * PortalFeatureOptIn.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PortalFeatureOptIn")
@VsoFinder(name = Constants.FINDER_VRO_PORTALFEATUREOPTIN)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PortalFeatureOptIn extends AviRestResource {
    @JsonProperty("enable_appsignature_sync")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableAppsignatureSync = false;

    @JsonProperty("enable_ip_reputation")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableIpReputation = false;

    @JsonProperty("enable_pulse_case_management")
    @JsonInclude(Include.NON_NULL)
    private Boolean enablePulseCaseManagement;

    @JsonProperty("enable_pulse_inventory")
    @JsonInclude(Include.NON_NULL)
    private Boolean enablePulseInventory;

    @JsonProperty("enable_pulse_waf_management")
    @JsonInclude(Include.NON_NULL)
    private Boolean enablePulseWafManagement;

    @JsonProperty("enable_user_agent_db_sync")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableUserAgentDbSync = false;



  /**
   * This is the getter method this will return the attribute value.
   * Enable to receive application specific signature updates.
   * Field introduced in 20.1.4.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableAppsignatureSync
   */
  @VsoMethod
  public Boolean getEnableAppsignatureSync() {
    return enableAppsignatureSync;
  }

  /**
   * This is the setter method to the attribute.
   * Enable to receive application specific signature updates.
   * Field introduced in 20.1.4.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableAppsignatureSync set the enableAppsignatureSync.
   */
  @VsoMethod
  public void setEnableAppsignatureSync(Boolean  enableAppsignatureSync) {
    this.enableAppsignatureSync = enableAppsignatureSync;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable to receive ip reputation updates.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableIpReputation
   */
  @VsoMethod
  public Boolean getEnableIpReputation() {
    return enableIpReputation;
  }

  /**
   * This is the setter method to the attribute.
   * Enable to receive ip reputation updates.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableIpReputation set the enableIpReputation.
   */
  @VsoMethod
  public void setEnableIpReputation(Boolean  enableIpReputation) {
    this.enableIpReputation = enableIpReputation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable pulse cloud services case management.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Special default for essentials edition is false, basic edition is false, enterprise is true.
   * @return enablePulseCaseManagement
   */
  @VsoMethod
  public Boolean getEnablePulseCaseManagement() {
    return enablePulseCaseManagement;
  }

  /**
   * This is the setter method to the attribute.
   * Enable pulse cloud services case management.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Special default for essentials edition is false, basic edition is false, enterprise is true.
   * @param enablePulseCaseManagement set the enablePulseCaseManagement.
   */
  @VsoMethod
  public void setEnablePulseCaseManagement(Boolean  enablePulseCaseManagement) {
    this.enablePulseCaseManagement = enablePulseCaseManagement;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable pulse cloud services inventory.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Special default for essentials edition is false, basic edition is false, enterprise is false.
   * @return enablePulseInventory
   */
  @VsoMethod
  public Boolean getEnablePulseInventory() {
    return enablePulseInventory;
  }

  /**
   * This is the setter method to the attribute.
   * Enable pulse cloud services inventory.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Special default for essentials edition is false, basic edition is false, enterprise is false.
   * @param enablePulseInventory set the enablePulseInventory.
   */
  @VsoMethod
  public void setEnablePulseInventory(Boolean  enablePulseInventory) {
    this.enablePulseInventory = enablePulseInventory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable to receive waf crs updates.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Special default for essentials edition is false, basic edition is false, enterprise is true.
   * @return enablePulseWafManagement
   */
  @VsoMethod
  public Boolean getEnablePulseWafManagement() {
    return enablePulseWafManagement;
  }

  /**
   * This is the setter method to the attribute.
   * Enable to receive waf crs updates.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Special default for essentials edition is false, basic edition is false, enterprise is true.
   * @param enablePulseWafManagement set the enablePulseWafManagement.
   */
  @VsoMethod
  public void setEnablePulseWafManagement(Boolean  enablePulseWafManagement) {
    this.enablePulseWafManagement = enablePulseWafManagement;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable to receive bot management updates.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableUserAgentDbSync
   */
  @VsoMethod
  public Boolean getEnableUserAgentDbSync() {
    return enableUserAgentDbSync;
  }

  /**
   * This is the setter method to the attribute.
   * Enable to receive bot management updates.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableUserAgentDbSync set the enableUserAgentDbSync.
   */
  @VsoMethod
  public void setEnableUserAgentDbSync(Boolean  enableUserAgentDbSync) {
    this.enableUserAgentDbSync = enableUserAgentDbSync;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PortalFeatureOptIn objPortalFeatureOptIn = (PortalFeatureOptIn) o;
  return   Objects.equals(this.enableIpReputation, objPortalFeatureOptIn.enableIpReputation)&&
  Objects.equals(this.enableAppsignatureSync, objPortalFeatureOptIn.enableAppsignatureSync)&&
  Objects.equals(this.enableUserAgentDbSync, objPortalFeatureOptIn.enableUserAgentDbSync)&&
  Objects.equals(this.enablePulseWafManagement, objPortalFeatureOptIn.enablePulseWafManagement)&&
  Objects.equals(this.enablePulseCaseManagement, objPortalFeatureOptIn.enablePulseCaseManagement)&&
  Objects.equals(this.enablePulseInventory, objPortalFeatureOptIn.enablePulseInventory);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PortalFeatureOptIn {\n");
      sb.append("    enableAppsignatureSync: ").append(toIndentedString(enableAppsignatureSync)).append("\n");
        sb.append("    enableIpReputation: ").append(toIndentedString(enableIpReputation)).append("\n");
        sb.append("    enablePulseCaseManagement: ").append(toIndentedString(enablePulseCaseManagement)).append("\n");
        sb.append("    enablePulseInventory: ").append(toIndentedString(enablePulseInventory)).append("\n");
        sb.append("    enablePulseWafManagement: ").append(toIndentedString(enablePulseWafManagement)).append("\n");
        sb.append("    enableUserAgentDbSync: ").append(toIndentedString(enableUserAgentDbSync)).append("\n");
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

