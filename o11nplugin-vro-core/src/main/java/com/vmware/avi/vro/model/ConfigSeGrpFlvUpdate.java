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
 * The ConfigSeGrpFlvUpdate is a POJO class extends AviRestResource that used for creating
 * ConfigSeGrpFlvUpdate.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ConfigSeGrpFlvUpdate")
@VsoFinder(name = Constants.FINDER_VRO_CONFIGSEGRPFLVUPDATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ConfigSeGrpFlvUpdate extends AviRestResource {
    @JsonProperty("new_flv")
    @JsonInclude(Include.NON_NULL)
    private String newFlv;

    @JsonProperty("old_flv")
    @JsonInclude(Include.NON_NULL)
    private String oldFlv;

    @JsonProperty("se_group_name")
    @JsonInclude(Include.NON_NULL)
    private String seGroupName;

    @JsonProperty("se_group_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seGroupUuid;

    @JsonProperty("tenant_name")
    @JsonInclude(Include.NON_NULL)
    private String tenantName;

    @JsonProperty("tenant_uuid")
    @JsonInclude(Include.NON_NULL)
    private String tenantUuid;



  /**
   * This is the getter method this will return the attribute value.
   * New flavor name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return newFlv
   */
  @VsoMethod
  public String getNewFlv() {
    return newFlv;
  }

  /**
   * This is the setter method to the attribute.
   * New flavor name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param newFlv set the newFlv.
   */
  @VsoMethod
  public void setNewFlv(String  newFlv) {
    this.newFlv = newFlv;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Old flavor name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oldFlv
   */
  @VsoMethod
  public String getOldFlv() {
    return oldFlv;
  }

  /**
   * This is the setter method to the attribute.
   * Old flavor name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param oldFlv set the oldFlv.
   */
  @VsoMethod
  public void setOldFlv(String  oldFlv) {
    this.oldFlv = oldFlv;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Se group name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupName
   */
  @VsoMethod
  public String getSeGroupName() {
    return seGroupName;
  }

  /**
   * This is the setter method to the attribute.
   * Se group name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGroupName set the seGroupName.
   */
  @VsoMethod
  public void setSeGroupName(String  seGroupName) {
    this.seGroupName = seGroupName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Se group uuid.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupUuid
   */
  @VsoMethod
  public String getSeGroupUuid() {
    return seGroupUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Se group uuid.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGroupUuid set the seGroupUuid.
   */
  @VsoMethod
  public void setSeGroupUuid(String  seGroupUuid) {
    this.seGroupUuid = seGroupUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantName
   */
  @VsoMethod
  public String getTenantName() {
    return tenantName;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantName set the tenantName.
   */
  @VsoMethod
  public void setTenantName(String  tenantName) {
    this.tenantName = tenantName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant uuid.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantUuid
   */
  @VsoMethod
  public String getTenantUuid() {
    return tenantUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant uuid.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantUuid set the tenantUuid.
   */
  @VsoMethod
  public void setTenantUuid(String  tenantUuid) {
    this.tenantUuid = tenantUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ConfigSeGrpFlvUpdate objConfigSeGrpFlvUpdate = (ConfigSeGrpFlvUpdate) o;
  return   Objects.equals(this.seGroupUuid, objConfigSeGrpFlvUpdate.seGroupUuid)&&
  Objects.equals(this.seGroupName, objConfigSeGrpFlvUpdate.seGroupName)&&
  Objects.equals(this.oldFlv, objConfigSeGrpFlvUpdate.oldFlv)&&
  Objects.equals(this.newFlv, objConfigSeGrpFlvUpdate.newFlv)&&
  Objects.equals(this.tenantUuid, objConfigSeGrpFlvUpdate.tenantUuid)&&
  Objects.equals(this.tenantName, objConfigSeGrpFlvUpdate.tenantName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ConfigSeGrpFlvUpdate {\n");
      sb.append("    newFlv: ").append(toIndentedString(newFlv)).append("\n");
        sb.append("    oldFlv: ").append(toIndentedString(oldFlv)).append("\n");
        sb.append("    seGroupName: ").append(toIndentedString(seGroupName)).append("\n");
        sb.append("    seGroupUuid: ").append(toIndentedString(seGroupUuid)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    tenantUuid: ").append(toIndentedString(tenantUuid)).append("\n");
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

