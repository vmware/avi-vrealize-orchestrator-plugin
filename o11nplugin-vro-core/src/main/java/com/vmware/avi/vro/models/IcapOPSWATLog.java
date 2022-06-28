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
 * The IcapOPSWATLog is a POJO class extends AviRestResource that used for creating
 * IcapOPSWATLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IcapOPSWATLog")
@VsoFinder(name = Constants.FINDER_VRO_ICAPOPSWATLOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IcapOPSWATLog extends AviRestResource {
    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason = null;

    @JsonProperty("threat_id")
    @JsonInclude(Include.NON_NULL)
    private String threatId = null;

    @JsonProperty("violations")
    @JsonInclude(Include.NON_NULL)
    private List<IcapViolation> violations = null;



  /**
   * This is the getter method this will return the attribute value.
   * Blocking reason for the content.
   * It is available only if content was scanned by icap server and some violations were found.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Blocking reason for the content.
   * It is available only if content was scanned by icap server and some violations were found.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Short description of the threat found in the content.
   * Available only if content was scanned by icap server and some violations were found.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return threatId
   */
  @VsoMethod
  public String getThreatId() {
    return threatId;
  }

  /**
   * This is the setter method to the attribute.
   * Short description of the threat found in the content.
   * Available only if content was scanned by icap server and some violations were found.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param threatId set the threatId.
   */
  @VsoMethod
  public void setThreatId(String  threatId) {
    this.threatId = threatId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Threat found in the content.
   * Available only if content was scanned by icap server and some violations were found.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return violations
   */
  @VsoMethod
  public List<IcapViolation> getViolations() {
    return violations;
  }

  /**
   * This is the setter method. this will set the violations
   * Threat found in the content.
   * Available only if content was scanned by icap server and some violations were found.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return violations
   */
  @VsoMethod
  public void setViolations(List<IcapViolation>  violations) {
    this.violations = violations;
  }

  /**
   * This is the setter method this will set the violations
   * Threat found in the content.
   * Available only if content was scanned by icap server and some violations were found.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return violations
   */
  @VsoMethod
  public IcapOPSWATLog addViolationsItem(IcapViolation violationsItem) {
    if (this.violations == null) {
      this.violations = new ArrayList<IcapViolation>();
    }
    this.violations.add(violationsItem);
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
  IcapOPSWATLog objIcapOPSWATLog = (IcapOPSWATLog) o;
  return   Objects.equals(this.reason, objIcapOPSWATLog.reason)&&
  Objects.equals(this.threatId, objIcapOPSWATLog.threatId)&&
  Objects.equals(this.violations, objIcapOPSWATLog.violations);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IcapOPSWATLog {\n");
      sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    threatId: ").append(toIndentedString(threatId)).append("\n");
        sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
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

