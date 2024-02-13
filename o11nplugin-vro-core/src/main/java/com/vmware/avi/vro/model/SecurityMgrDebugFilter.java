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
 * The SecurityMgrDebugFilter is a POJO class extends AviRestResource that used for creating
 * SecurityMgrDebugFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SecurityMgrDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_SECURITYMGRDEBUGFILTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SecurityMgrDebugFilter extends AviRestResource {
    @JsonProperty("enable_adaptive_config")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableAdaptiveConfig = true;

    @JsonProperty("entity_ref")
    @JsonInclude(Include.NON_NULL)
    private String entityRef;

    @JsonProperty("psm_rule_id_multiplier")
    @JsonInclude(Include.NON_NULL)
    private Integer psmRuleIdMultiplier;



  /**
   * This is the getter method this will return the attribute value.
   * Dynamically adapt configuration parameters for application learning feature.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enableAdaptiveConfig
   */
  @VsoMethod
  public Boolean getEnableAdaptiveConfig() {
    return enableAdaptiveConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Dynamically adapt configuration parameters for application learning feature.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enableAdaptiveConfig set the enableAdaptiveConfig.
   */
  @VsoMethod
  public void setEnableAdaptiveConfig(Boolean  enableAdaptiveConfig) {
    this.enableAdaptiveConfig = enableAdaptiveConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the entity.
   * It is a reference to an object of type virtualservice.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return entityRef
   */
  @VsoMethod
  public String getEntityRef() {
    return entityRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the entity.
   * It is a reference to an object of type virtualservice.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param entityRef set the entityRef.
   */
  @VsoMethod
  public void setEntityRef(String  entityRef) {
    this.entityRef = entityRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dynamically update the multiplier for rule id generation in psm programming for learning feature.
   * Allowed values are 10-100000.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return psmRuleIdMultiplier
   */
  @VsoMethod
  public Integer getPsmRuleIdMultiplier() {
    return psmRuleIdMultiplier;
  }

  /**
   * This is the setter method to the attribute.
   * Dynamically update the multiplier for rule id generation in psm programming for learning feature.
   * Allowed values are 10-100000.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param psmRuleIdMultiplier set the psmRuleIdMultiplier.
   */
  @VsoMethod
  public void setPsmRuleIdMultiplier(Integer  psmRuleIdMultiplier) {
    this.psmRuleIdMultiplier = psmRuleIdMultiplier;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SecurityMgrDebugFilter objSecurityMgrDebugFilter = (SecurityMgrDebugFilter) o;
  return   Objects.equals(this.entityRef, objSecurityMgrDebugFilter.entityRef)&&
  Objects.equals(this.enableAdaptiveConfig, objSecurityMgrDebugFilter.enableAdaptiveConfig)&&
  Objects.equals(this.psmRuleIdMultiplier, objSecurityMgrDebugFilter.psmRuleIdMultiplier);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SecurityMgrDebugFilter {\n");
      sb.append("    enableAdaptiveConfig: ").append(toIndentedString(enableAdaptiveConfig)).append("\n");
        sb.append("    entityRef: ").append(toIndentedString(entityRef)).append("\n");
        sb.append("    psmRuleIdMultiplier: ").append(toIndentedString(psmRuleIdMultiplier)).append("\n");
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

