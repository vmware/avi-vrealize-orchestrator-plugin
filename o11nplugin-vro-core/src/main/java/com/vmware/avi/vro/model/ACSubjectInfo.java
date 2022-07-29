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
 * The ACSubjectInfo is a POJO class extends AviRestResource that used for creating
 * ACSubjectInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ACSubjectInfo")
@VsoFinder(name = Constants.FINDER_VRO_ACSUBJECTINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ACSubjectInfo extends AviRestResource {
    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;

    @JsonProperty("value")
    @JsonInclude(Include.NON_NULL)
    private String value = null;



  /**
   * This is the getter method this will return the attribute value.
   * Subject type for the audit event (e.g.
   * Dns hostname, ip address, uri).
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Subject type for the audit event (e.g.
   * Dns hostname, ip address, uri).
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Subject value for the audit event (e.g.
   * Www.example.com, 10.10.10.10, www.foo.com/index.html).
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return value
   */
  @VsoMethod
  public String getValue() {
    return value;
  }

  /**
   * This is the setter method to the attribute.
   * Subject value for the audit event (e.g.
   * Www.example.com, 10.10.10.10, www.foo.com/index.html).
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param value set the value.
   */
  @VsoMethod
  public void setValue(String  value) {
    this.value = value;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ACSubjectInfo objACSubjectInfo = (ACSubjectInfo) o;
  return   Objects.equals(this.type, objACSubjectInfo.type)&&
  Objects.equals(this.value, objACSubjectInfo.value);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ACSubjectInfo {\n");
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

