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
 * The SEFaultInjectExhaustParam is a POJO class extends AviRestResource that used for creating
 * SEFaultInjectExhaustParam.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SEFaultInjectExhaustParam")
@VsoFinder(name = Constants.FINDER_VRO_SEFAULTINJECTEXHAUSTPARAM)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SEFaultInjectExhaustParam extends AviRestResource {
    @JsonProperty("leak")
    @JsonInclude(Include.NON_NULL)
    private Boolean leak;

    @JsonProperty("num")
    @JsonInclude(Include.NON_NULL)
    private Integer num;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return leak
   */
  @VsoMethod
  public Boolean getLeak() {
    return leak;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param leak set the leak.
   */
  @VsoMethod
  public void setLeak(Boolean  leak) {
    this.leak = leak;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return num
   */
  @VsoMethod
  public Integer getNum() {
    return num;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param num set the num.
   */
  @VsoMethod
  public void setNum(Integer  num) {
    this.num = num;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SEFaultInjectExhaustParam objSEFaultInjectExhaustParam = (SEFaultInjectExhaustParam) o;
  return   Objects.equals(this.num, objSEFaultInjectExhaustParam.num)&&
  Objects.equals(this.leak, objSEFaultInjectExhaustParam.leak);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SEFaultInjectExhaustParam {\n");
      sb.append("    leak: ").append(toIndentedString(leak)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
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

