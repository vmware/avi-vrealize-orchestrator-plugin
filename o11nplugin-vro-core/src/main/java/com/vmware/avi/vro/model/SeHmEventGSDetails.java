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
 * The SeHmEventGSDetails is a POJO class extends AviRestResource that used for creating
 * SeHmEventGSDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeHmEventGSDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEHMEVENTGSDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeHmEventGSDetails extends AviRestResource {
    @JsonProperty("gslb_service")
    @JsonInclude(Include.NON_NULL)
    private String gslbService;

    @JsonProperty("ha_reason")
    @JsonInclude(Include.NON_NULL)
    private String haReason;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason;

    @JsonProperty("se_name")
    @JsonInclude(Include.NON_NULL)
    private String seName;

    @JsonProperty("src_uuid")
    @JsonInclude(Include.NON_NULL)
    private String srcUuid;



  /**
   * This is the getter method this will return the attribute value.
   * Gslbservice name.
   * It is a reference to an object of type gslbservice.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gslbService
   */
  @VsoMethod
  public String getGslbService() {
    return gslbService;
  }

  /**
   * This is the setter method to the attribute.
   * Gslbservice name.
   * It is a reference to an object of type gslbservice.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gslbService set the gslbService.
   */
  @VsoMethod
  public void setGslbService(String  gslbService) {
    this.gslbService = gslbService;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ha compromised reason.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return haReason
   */
  @VsoMethod
  public String getHaReason() {
    return haReason;
  }

  /**
   * This is the setter method to the attribute.
   * Ha compromised reason.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param haReason set the haReason.
   */
  @VsoMethod
  public void setHaReason(String  haReason) {
    this.haReason = haReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason gslb service is down.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason gslb service is down.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seName
   */
  @VsoMethod
  public String getSeName() {
    return seName;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seName set the seName.
   */
  @VsoMethod
  public void setSeName(String  seName) {
    this.seName = seName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the event generator.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return srcUuid
   */
  @VsoMethod
  public String getSrcUuid() {
    return srcUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the event generator.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param srcUuid set the srcUuid.
   */
  @VsoMethod
  public void setSrcUuid(String  srcUuid) {
    this.srcUuid = srcUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeHmEventGSDetails objSeHmEventGSDetails = (SeHmEventGSDetails) o;
  return   Objects.equals(this.gslbService, objSeHmEventGSDetails.gslbService)&&
  Objects.equals(this.reason, objSeHmEventGSDetails.reason)&&
  Objects.equals(this.seName, objSeHmEventGSDetails.seName)&&
  Objects.equals(this.haReason, objSeHmEventGSDetails.haReason)&&
  Objects.equals(this.srcUuid, objSeHmEventGSDetails.srcUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeHmEventGSDetails {\n");
      sb.append("    gslbService: ").append(toIndentedString(gslbService)).append("\n");
        sb.append("    haReason: ").append(toIndentedString(haReason)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
        sb.append("    srcUuid: ").append(toIndentedString(srcUuid)).append("\n");
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

