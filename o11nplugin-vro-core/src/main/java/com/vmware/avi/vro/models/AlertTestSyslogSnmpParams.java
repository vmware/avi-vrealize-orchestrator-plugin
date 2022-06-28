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
 * The AlertTestSyslogSnmpParams is a POJO class extends AviRestResource that used for creating
 * AlertTestSyslogSnmpParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AlertTestSyslogSnmpParams")
@VsoFinder(name = Constants.FINDER_VRO_ALERTTESTSYSLOGSNMPPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AlertTestSyslogSnmpParams extends AviRestResource {
    @JsonProperty("text")
    @JsonInclude(Include.NON_NULL)
    private String text = null;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * The contents of the syslog message/snmp trap contents.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return text
   */
  @VsoMethod
  public String getText() {
    return text;
  }

  /**
   * This is the setter method to the attribute.
   * The contents of the syslog message/snmp trap contents.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param text set the text.
   */
  @VsoMethod
  public void setText(String  text) {
    this.text = text;
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
  AlertTestSyslogSnmpParams objAlertTestSyslogSnmpParams = (AlertTestSyslogSnmpParams) o;
  return   Objects.equals(this.uuid, objAlertTestSyslogSnmpParams.uuid)&&
  Objects.equals(this.text, objAlertTestSyslogSnmpParams.text);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AlertTestSyslogSnmpParams {\n");
      sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

