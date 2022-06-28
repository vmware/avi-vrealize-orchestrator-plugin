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
 * The SEFaultInjectSeParam is a POJO class extends AviRestResource that used for creating
 * SEFaultInjectSeParam.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SEFaultInjectSeParam")
@VsoFinder(name = Constants.FINDER_VRO_SEFAULTINJECTSEPARAM)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SEFaultInjectSeParam extends AviRestResource {
    @JsonProperty("core")
    @JsonInclude(Include.NON_NULL)
    private Integer core = 1000;

    @JsonProperty("obj_names")
    @JsonInclude(Include.NON_NULL)
    private List<String> objNames = null;

    @JsonProperty("random_core")
    @JsonInclude(Include.NON_NULL)
    private Boolean randomCore = false;

    @JsonProperty("se_agent_fault")
    @JsonInclude(Include.NON_NULL)
    private String seAgentFault = "SE_AGENT_FAULT_DISABLED";

    @JsonProperty("se_dp_fault")
    @JsonInclude(Include.NON_NULL)
    private String seDpFault = "SE_DP_FAULT_DISABLED";



  /**
   * This is the getter method this will return the attribute value.
   * Inject fault in specific core.
   * Field introduced in 18.1.5,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @return core
   */
  @VsoMethod
  public Integer getCore() {
    return core;
  }

  /**
   * This is the setter method to the attribute.
   * Inject fault in specific core.
   * Field introduced in 18.1.5,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
   * @param core set the core.
   */
  @VsoMethod
  public void setCore(Integer  core) {
    this.core = core;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Inject fault on objects.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objNames
   */
  @VsoMethod
  public List<String> getObjNames() {
    return objNames;
  }

  /**
   * This is the setter method. this will set the objNames
   * Inject fault on objects.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objNames
   */
  @VsoMethod
  public void setObjNames(List<String>  objNames) {
    this.objNames = objNames;
  }

  /**
   * This is the setter method this will set the objNames
   * Inject fault on objects.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objNames
   */
  @VsoMethod
  public SEFaultInjectSeParam addObjNamesItem(String objNamesItem) {
    if (this.objNames == null) {
      this.objNames = new ArrayList<String>();
    }
    this.objNames.add(objNamesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Inject fault in random no of cores.
   * Field introduced in 18.1.5,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return randomCore
   */
  @VsoMethod
  public Boolean getRandomCore() {
    return randomCore;
  }

  /**
   * This is the setter method to the attribute.
   * Inject fault in random no of cores.
   * Field introduced in 18.1.5,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param randomCore set the randomCore.
   */
  @VsoMethod
  public void setRandomCore(Boolean  randomCore) {
    this.randomCore = randomCore;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Set se-agent fault type.
   * Enum options - SE_AGENT_FAULT_DISABLED, SE_AGENT_PRE_PROCESS_FAULT, SE_AGENT_POST_PROCESS_FAULT, SE_AGENT_DP_RESPONSE_FAULT,
   * SE_AGENT_RANDOM_PROCESS_FAULT.
   * Field introduced in 18.1.5,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SE_AGENT_FAULT_DISABLED".
   * @return seAgentFault
   */
  @VsoMethod
  public String getSeAgentFault() {
    return seAgentFault;
  }

  /**
   * This is the setter method to the attribute.
   * Set se-agent fault type.
   * Enum options - SE_AGENT_FAULT_DISABLED, SE_AGENT_PRE_PROCESS_FAULT, SE_AGENT_POST_PROCESS_FAULT, SE_AGENT_DP_RESPONSE_FAULT,
   * SE_AGENT_RANDOM_PROCESS_FAULT.
   * Field introduced in 18.1.5,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SE_AGENT_FAULT_DISABLED".
   * @param seAgentFault set the seAgentFault.
   */
  @VsoMethod
  public void setSeAgentFault(String  seAgentFault) {
    this.seAgentFault = seAgentFault;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Set se-dp fault type.
   * Enum options - SE_DP_FAULT_DISABLED.
   * Field introduced in 18.1.5,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SE_DP_FAULT_DISABLED".
   * @return seDpFault
   */
  @VsoMethod
  public String getSeDpFault() {
    return seDpFault;
  }

  /**
   * This is the setter method to the attribute.
   * Set se-dp fault type.
   * Enum options - SE_DP_FAULT_DISABLED.
   * Field introduced in 18.1.5,18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SE_DP_FAULT_DISABLED".
   * @param seDpFault set the seDpFault.
   */
  @VsoMethod
  public void setSeDpFault(String  seDpFault) {
    this.seDpFault = seDpFault;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SEFaultInjectSeParam objSEFaultInjectSeParam = (SEFaultInjectSeParam) o;
  return   Objects.equals(this.seAgentFault, objSEFaultInjectSeParam.seAgentFault)&&
  Objects.equals(this.seDpFault, objSEFaultInjectSeParam.seDpFault)&&
  Objects.equals(this.randomCore, objSEFaultInjectSeParam.randomCore)&&
  Objects.equals(this.core, objSEFaultInjectSeParam.core)&&
  Objects.equals(this.objNames, objSEFaultInjectSeParam.objNames);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SEFaultInjectSeParam {\n");
      sb.append("    core: ").append(toIndentedString(core)).append("\n");
        sb.append("    objNames: ").append(toIndentedString(objNames)).append("\n");
        sb.append("    randomCore: ").append(toIndentedString(randomCore)).append("\n");
        sb.append("    seAgentFault: ").append(toIndentedString(seAgentFault)).append("\n");
        sb.append("    seDpFault: ").append(toIndentedString(seDpFault)).append("\n");
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

