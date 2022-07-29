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
 * The ObjSyncConfig is a POJO class extends AviRestResource that used for creating
 * ObjSyncConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ObjSyncConfig")
@VsoFinder(name = Constants.FINDER_VRO_OBJSYNCCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ObjSyncConfig extends AviRestResource {
    @JsonProperty("objsync_cpu_limit")
    @JsonInclude(Include.NON_NULL)
    private Integer objsyncCpuLimit = 30;

    @JsonProperty("objsync_hub_elect_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer objsyncHubElectInterval = 60;

    @JsonProperty("objsync_reconcile_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer objsyncReconcileInterval = 10;



  /**
   * This is the getter method this will return the attribute value.
   * Se cpu limit for interse object distribution.
   * Allowed values are 15-80.
   * Field introduced in 20.1.3.
   * Unit is percent.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return objsyncCpuLimit
   */
  @VsoMethod
  public Integer getObjsyncCpuLimit() {
    return objsyncCpuLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Se cpu limit for interse object distribution.
   * Allowed values are 15-80.
   * Field introduced in 20.1.3.
   * Unit is percent.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param objsyncCpuLimit set the objsyncCpuLimit.
   */
  @VsoMethod
  public void setObjsyncCpuLimit(Integer  objsyncCpuLimit) {
    this.objsyncCpuLimit = objsyncCpuLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Hub election interval for interse object distribution.
   * Allowed values are 30-300.
   * Field introduced in 20.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return objsyncHubElectInterval
   */
  @VsoMethod
  public Integer getObjsyncHubElectInterval() {
    return objsyncHubElectInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Hub election interval for interse object distribution.
   * Allowed values are 30-300.
   * Field introduced in 20.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param objsyncHubElectInterval set the objsyncHubElectInterval.
   */
  @VsoMethod
  public void setObjsyncHubElectInterval(Integer  objsyncHubElectInterval) {
    this.objsyncHubElectInterval = objsyncHubElectInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reconcile interval for interse object distribution.
   * Allowed values are 1-120.
   * Field introduced in 20.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return objsyncReconcileInterval
   */
  @VsoMethod
  public Integer getObjsyncReconcileInterval() {
    return objsyncReconcileInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Reconcile interval for interse object distribution.
   * Allowed values are 1-120.
   * Field introduced in 20.1.3.
   * Unit is sec.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param objsyncReconcileInterval set the objsyncReconcileInterval.
   */
  @VsoMethod
  public void setObjsyncReconcileInterval(Integer  objsyncReconcileInterval) {
    this.objsyncReconcileInterval = objsyncReconcileInterval;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ObjSyncConfig objObjSyncConfig = (ObjSyncConfig) o;
  return   Objects.equals(this.objsyncCpuLimit, objObjSyncConfig.objsyncCpuLimit)&&
  Objects.equals(this.objsyncReconcileInterval, objObjSyncConfig.objsyncReconcileInterval)&&
  Objects.equals(this.objsyncHubElectInterval, objObjSyncConfig.objsyncHubElectInterval);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ObjSyncConfig {\n");
      sb.append("    objsyncCpuLimit: ").append(toIndentedString(objsyncCpuLimit)).append("\n");
        sb.append("    objsyncHubElectInterval: ").append(toIndentedString(objsyncHubElectInterval)).append("\n");
        sb.append("    objsyncReconcileInterval: ").append(toIndentedString(objsyncReconcileInterval)).append("\n");
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

