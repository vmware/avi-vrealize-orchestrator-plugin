package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GslbServiceRuntime;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbServiceStatus is a POJO class extends AviRestResource that used for creating
 * GslbServiceStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbServiceStatus")
@VsoFinder(name = Constants.FINDER_VRO_GSLBSERVICESTATUS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbServiceStatus extends AviRestResource {
    @JsonProperty("details")
    @JsonInclude(Include.NON_NULL)
    private List<String> details = null;

    @JsonProperty("gs_runtime")
    @JsonInclude(Include.NON_NULL)
    private GslbServiceRuntime gsRuntime = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return details
   */
  @VsoMethod
  public List<String> getDetails() {
    return details;
  }

  /**
   * This is the setter method. this will set the details
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return details
   */
  @VsoMethod
  public void setDetails(List<String>  details) {
    this.details = details;
  }

  /**
   * This is the setter method this will set the details
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return details
   */
  @VsoMethod
  public GslbServiceStatus addDetailsItem(String detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<String>();
    }
    this.details.add(detailsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gsRuntime
   */
  @VsoMethod
  public GslbServiceRuntime getGsRuntime() {
    return gsRuntime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gsRuntime set the gsRuntime.
   */
  @VsoMethod
  public void setGsRuntime(GslbServiceRuntime gsRuntime) {
    this.gsRuntime = gsRuntime;
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbServiceStatus objGslbServiceStatus = (GslbServiceStatus) o;
  return   Objects.equals(this.uuid, objGslbServiceStatus.uuid)&&
  Objects.equals(this.name, objGslbServiceStatus.name)&&
  Objects.equals(this.details, objGslbServiceStatus.details)&&
  Objects.equals(this.gsRuntime, objGslbServiceStatus.gsRuntime);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbServiceStatus {\n");
      sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    gsRuntime: ").append(toIndentedString(gsRuntime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

