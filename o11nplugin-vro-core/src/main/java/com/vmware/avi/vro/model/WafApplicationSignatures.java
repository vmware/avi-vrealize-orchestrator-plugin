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
 * The WafApplicationSignatures is a POJO class extends AviRestResource that used for creating
 * WafApplicationSignatures.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafApplicationSignatures")
@VsoFinder(name = Constants.FINDER_VRO_WAFAPPLICATIONSIGNATURES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafApplicationSignatures extends AviRestResource {
    @JsonProperty("provider_ref")
    @JsonInclude(Include.NON_NULL)
    private String providerRef;

    @JsonProperty("rule_overrides")
    @JsonInclude(Include.NON_NULL)
    private List<WafRuleOverrides> ruleOverrides;

    @JsonProperty("ruleset_version")
    @JsonInclude(Include.NON_NULL)
    private String rulesetVersion;

    @JsonProperty("selected_applications")
    @JsonInclude(Include.NON_NULL)
    private List<String> selectedApplications;



  /**
   * This is the getter method this will return the attribute value.
   * The external provide for the rules.
   * It is a reference to an object of type wafapplicationsignatureprovider.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return providerRef
   */
  @VsoMethod
  public String getProviderRef() {
    return providerRef;
  }

  /**
   * This is the setter method to the attribute.
   * The external provide for the rules.
   * It is a reference to an object of type wafapplicationsignatureprovider.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param providerRef set the providerRef.
   */
  @VsoMethod
  public void setProviderRef(String  providerRef) {
    this.providerRef = providerRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Override attributes of application signature rules.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleOverrides
   */
  @VsoMethod
  public List<WafRuleOverrides> getRuleOverrides() {
    return ruleOverrides;
  }

  /**
   * This is the setter method. this will set the ruleOverrides
   * Override attributes of application signature rules.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleOverrides
   */
  @VsoMethod
  public void setRuleOverrides(List<WafRuleOverrides>  ruleOverrides) {
    this.ruleOverrides = ruleOverrides;
  }

  /**
   * This is the setter method this will set the ruleOverrides
   * Override attributes of application signature rules.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ruleOverrides
   */
  @VsoMethod
  public WafApplicationSignatures addRuleOverridesItem(WafRuleOverrides ruleOverridesItem) {
    if (this.ruleOverrides == null) {
      this.ruleOverrides = new ArrayList<WafRuleOverrides>();
    }
    this.ruleOverrides.add(ruleOverridesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The version in use of the provided ruleset.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return rulesetVersion
   */
  @VsoMethod
  public String getRulesetVersion() {
    return rulesetVersion;
  }

  /**
   * This is the setter method to the attribute.
   * The version in use of the provided ruleset.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param rulesetVersion set the rulesetVersion.
   */
  @VsoMethod
  public void setRulesetVersion(String  rulesetVersion) {
    this.rulesetVersion = rulesetVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of applications for which we use the rules from the wafapplicationsignatureprovider.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return selectedApplications
   */
  @VsoMethod
  public List<String> getSelectedApplications() {
    return selectedApplications;
  }

  /**
   * This is the setter method. this will set the selectedApplications
   * List of applications for which we use the rules from the wafapplicationsignatureprovider.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return selectedApplications
   */
  @VsoMethod
  public void setSelectedApplications(List<String>  selectedApplications) {
    this.selectedApplications = selectedApplications;
  }

  /**
   * This is the setter method this will set the selectedApplications
   * List of applications for which we use the rules from the wafapplicationsignatureprovider.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return selectedApplications
   */
  @VsoMethod
  public WafApplicationSignatures addSelectedApplicationsItem(String selectedApplicationsItem) {
    if (this.selectedApplications == null) {
      this.selectedApplications = new ArrayList<String>();
    }
    this.selectedApplications.add(selectedApplicationsItem);
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
  WafApplicationSignatures objWafApplicationSignatures = (WafApplicationSignatures) o;
  return   Objects.equals(this.providerRef, objWafApplicationSignatures.providerRef)&&
  Objects.equals(this.rulesetVersion, objWafApplicationSignatures.rulesetVersion)&&
  Objects.equals(this.selectedApplications, objWafApplicationSignatures.selectedApplications)&&
  Objects.equals(this.ruleOverrides, objWafApplicationSignatures.ruleOverrides);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafApplicationSignatures {\n");
      sb.append("    providerRef: ").append(toIndentedString(providerRef)).append("\n");
        sb.append("    ruleOverrides: ").append(toIndentedString(ruleOverrides)).append("\n");
        sb.append("    rulesetVersion: ").append(toIndentedString(rulesetVersion)).append("\n");
        sb.append("    selectedApplications: ").append(toIndentedString(selectedApplications)).append("\n");
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

