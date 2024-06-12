package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.TechSupportStatus;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The TechSupportEvent is a POJO class extends AviRestResource that used for creating
 * TechSupportEvent.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TechSupportEvent")
@VsoFinder(name = Constants.FINDER_VRO_TECHSUPPORTEVENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TechSupportEvent extends AviRestResource {
    @JsonProperty("tech_support_status")
    @JsonInclude(Include.NON_NULL)
    private TechSupportStatus techSupportStatus;

    @JsonProperty("tenant")
    @JsonInclude(Include.NON_NULL)
    private String tenant;



  /**
   * This is the getter method this will return the attribute value.
   * Techsupport status object.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return techSupportStatus
   */
  @VsoMethod
  public TechSupportStatus getTechSupportStatus() {
    return techSupportStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Techsupport status object.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param techSupportStatus set the techSupportStatus.
   */
  @VsoMethod
  public void setTechSupportStatus(TechSupportStatus techSupportStatus) {
    this.techSupportStatus = techSupportStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant under techsupport invoked.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenant
   */
  @VsoMethod
  public String getTenant() {
    return tenant;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant under techsupport invoked.
   * Field introduced in 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenant set the tenant.
   */
  @VsoMethod
  public void setTenant(String  tenant) {
    this.tenant = tenant;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TechSupportEvent objTechSupportEvent = (TechSupportEvent) o;
  return   Objects.equals(this.techSupportStatus, objTechSupportEvent.techSupportStatus)&&
  Objects.equals(this.tenant, objTechSupportEvent.tenant);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TechSupportEvent {\n");
      sb.append("    techSupportStatus: ").append(toIndentedString(techSupportStatus)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
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

