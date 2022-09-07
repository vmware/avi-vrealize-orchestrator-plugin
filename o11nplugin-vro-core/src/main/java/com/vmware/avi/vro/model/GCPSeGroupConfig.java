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
 * The GCPSeGroupConfig is a POJO class extends AviRestResource that used for creating
 * GCPSeGroupConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GCPSeGroupConfig")
@VsoFinder(name = Constants.FINDER_VRO_GCPSEGROUPCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GCPSeGroupConfig extends AviRestResource {
    @JsonProperty("backend_data_vpc_network_name")
    @JsonInclude(Include.NON_NULL)
    private String backendDataVpcNetworkName = null;

    @JsonProperty("backend_data_vpc_project_id")
    @JsonInclude(Include.NON_NULL)
    private String backendDataVpcProjectId = null;

    @JsonProperty("backend_data_vpc_subnet_name")
    @JsonInclude(Include.NON_NULL)
    private String backendDataVpcSubnetName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Service engine backend data network name, used only for gcp cloud.overrides the cloud level setting for backend data network in gcp two arm mode.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return backendDataVpcNetworkName
   */
  @VsoMethod
  public String getBackendDataVpcNetworkName() {
    return backendDataVpcNetworkName;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine backend data network name, used only for gcp cloud.overrides the cloud level setting for backend data network in gcp two arm mode.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param backendDataVpcNetworkName set the backendDataVpcNetworkName.
   */
  @VsoMethod
  public void setBackendDataVpcNetworkName(String  backendDataVpcNetworkName) {
    this.backendDataVpcNetworkName = backendDataVpcNetworkName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Project id of the service engine backend data network.
   * By default, service engine project id will be used.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return backendDataVpcProjectId
   */
  @VsoMethod
  public String getBackendDataVpcProjectId() {
    return backendDataVpcProjectId;
  }

  /**
   * This is the setter method to the attribute.
   * Project id of the service engine backend data network.
   * By default, service engine project id will be used.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param backendDataVpcProjectId set the backendDataVpcProjectId.
   */
  @VsoMethod
  public void setBackendDataVpcProjectId(String  backendDataVpcProjectId) {
    this.backendDataVpcProjectId = backendDataVpcProjectId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine backend data subnet name, used only for gcp cloud.overrides the cloud level setting for backend data subnet in gcp two arm mode.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return backendDataVpcSubnetName
   */
  @VsoMethod
  public String getBackendDataVpcSubnetName() {
    return backendDataVpcSubnetName;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine backend data subnet name, used only for gcp cloud.overrides the cloud level setting for backend data subnet in gcp two arm mode.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param backendDataVpcSubnetName set the backendDataVpcSubnetName.
   */
  @VsoMethod
  public void setBackendDataVpcSubnetName(String  backendDataVpcSubnetName) {
    this.backendDataVpcSubnetName = backendDataVpcSubnetName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GCPSeGroupConfig objGCPSeGroupConfig = (GCPSeGroupConfig) o;
  return   Objects.equals(this.backendDataVpcNetworkName, objGCPSeGroupConfig.backendDataVpcNetworkName)&&
  Objects.equals(this.backendDataVpcSubnetName, objGCPSeGroupConfig.backendDataVpcSubnetName)&&
  Objects.equals(this.backendDataVpcProjectId, objGCPSeGroupConfig.backendDataVpcProjectId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GCPSeGroupConfig {\n");
      sb.append("    backendDataVpcNetworkName: ").append(toIndentedString(backendDataVpcNetworkName)).append("\n");
        sb.append("    backendDataVpcProjectId: ").append(toIndentedString(backendDataVpcProjectId)).append("\n");
        sb.append("    backendDataVpcSubnetName: ").append(toIndentedString(backendDataVpcSubnetName)).append("\n");
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

