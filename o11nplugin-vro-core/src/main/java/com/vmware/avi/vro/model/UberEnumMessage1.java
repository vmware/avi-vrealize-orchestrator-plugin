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
 * The UberEnumMessage1 is a POJO class extends AviRestResource that used for creating
 * UberEnumMessage1.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "UberEnumMessage1")
@VsoFinder(name = Constants.FINDER_VRO_UBERENUMMESSAGE1)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class UberEnumMessage1 extends AviRestResource {
    @JsonProperty("rm")
    @JsonInclude(Include.NON_NULL)
    private List<UberEnumMessage2> rm;

    @JsonProperty("rv")
    @JsonInclude(Include.NON_NULL)
    private List<Integer> rv;

    @JsonProperty("v")
    @JsonInclude(Include.NON_NULL)
    private Integer v;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rm
   */
  @VsoMethod
  public List<UberEnumMessage2> getRm() {
    return rm;
  }

  /**
   * This is the setter method. this will set the rm
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rm
   */
  @VsoMethod
  public void setRm(List<UberEnumMessage2>  rm) {
    this.rm = rm;
  }

  /**
   * This is the setter method this will set the rm
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rm
   */
  @VsoMethod
  public UberEnumMessage1 addRmItem(UberEnumMessage2 rmItem) {
    if (this.rm == null) {
      this.rm = new ArrayList<UberEnumMessage2>();
    }
    this.rm.add(rmItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rv
   */
  @VsoMethod
  public List<Integer> getRv() {
    return rv;
  }

  /**
   * This is the setter method. this will set the rv
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rv
   */
  @VsoMethod
  public void setRv(List<Integer>  rv) {
    this.rv = rv;
  }

  /**
   * This is the setter method this will set the rv
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rv
   */
  @VsoMethod
  public UberEnumMessage1 addRvItem(Integer rvItem) {
    if (this.rv == null) {
      this.rv = new ArrayList<Integer>();
    }
    this.rv.add(rvItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return v
   */
  @VsoMethod
  public Integer getV() {
    return v;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param v set the v.
   */
  @VsoMethod
  public void setV(Integer  v) {
    this.v = v;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  UberEnumMessage1 objUberEnumMessage1 = (UberEnumMessage1) o;
  return   Objects.equals(this.v, objUberEnumMessage1.v)&&
  Objects.equals(this.rv, objUberEnumMessage1.rv)&&
  Objects.equals(this.rm, objUberEnumMessage1.rm);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class UberEnumMessage1 {\n");
      sb.append("    rm: ").append(toIndentedString(rm)).append("\n");
        sb.append("    rv: ").append(toIndentedString(rv)).append("\n");
        sb.append("    v: ").append(toIndentedString(v)).append("\n");
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

