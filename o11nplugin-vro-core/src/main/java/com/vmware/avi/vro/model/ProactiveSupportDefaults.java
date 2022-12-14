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
 * The ProactiveSupportDefaults is a POJO class extends AviRestResource that used for creating
 * ProactiveSupportDefaults.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ProactiveSupportDefaults")
@VsoFinder(name = Constants.FINDER_VRO_PROACTIVESUPPORTDEFAULTS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ProactiveSupportDefaults extends AviRestResource {
    @JsonProperty("attach_core_dump")
    @JsonInclude(Include.NON_NULL)
    private Boolean attachCoreDump = false;

    @JsonProperty("attach_tech_support")
    @JsonInclude(Include.NON_NULL)
    private Boolean attachTechSupport;

    @JsonProperty("case_severity")
    @JsonInclude(Include.NON_NULL)
    private String caseSeverity = "Severity 5";



  /**
   * This is the getter method this will return the attribute value.
   * Opt-in to attach core dump with support case.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return attachCoreDump
   */
  @VsoMethod
  public Boolean getAttachCoreDump() {
    return attachCoreDump;
  }

  /**
   * This is the setter method to the attribute.
   * Opt-in to attach core dump with support case.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param attachCoreDump set the attachCoreDump.
   */
  @VsoMethod
  public void setAttachCoreDump(Boolean  attachCoreDump) {
    this.attachCoreDump = attachCoreDump;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Opt-in to attach tech support with support case.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Special default for essentials edition is false, basic edition is false, enterprise is true.
   * @return attachTechSupport
   */
  @VsoMethod
  public Boolean getAttachTechSupport() {
    return attachTechSupport;
  }

  /**
   * This is the setter method to the attribute.
   * Opt-in to attach tech support with support case.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Special default for essentials edition is false, basic edition is false, enterprise is true.
   * @param attachTechSupport set the attachTechSupport.
   */
  @VsoMethod
  public void setAttachTechSupport(Boolean  attachTechSupport) {
    this.attachTechSupport = attachTechSupport;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Case severity to be used for proactive support case creation.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "Severity 5".
   * @return caseSeverity
   */
  @VsoMethod
  public String getCaseSeverity() {
    return caseSeverity;
  }

  /**
   * This is the setter method to the attribute.
   * Case severity to be used for proactive support case creation.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "Severity 5".
   * @param caseSeverity set the caseSeverity.
   */
  @VsoMethod
  public void setCaseSeverity(String  caseSeverity) {
    this.caseSeverity = caseSeverity;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ProactiveSupportDefaults objProactiveSupportDefaults = (ProactiveSupportDefaults) o;
  return   Objects.equals(this.attachTechSupport, objProactiveSupportDefaults.attachTechSupport)&&
  Objects.equals(this.caseSeverity, objProactiveSupportDefaults.caseSeverity)&&
  Objects.equals(this.attachCoreDump, objProactiveSupportDefaults.attachCoreDump);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ProactiveSupportDefaults {\n");
      sb.append("    attachCoreDump: ").append(toIndentedString(attachCoreDump)).append("\n");
        sb.append("    attachTechSupport: ").append(toIndentedString(attachTechSupport)).append("\n");
        sb.append("    caseSeverity: ").append(toIndentedString(caseSeverity)).append("\n");
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

