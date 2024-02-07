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
 * The VSDataScripts is a POJO class extends AviRestResource that used for creating
 * VSDataScripts.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VSDataScripts")
@VsoFinder(name = Constants.FINDER_VRO_VSDATASCRIPTS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VSDataScripts extends AviRestResource {
    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index;

    @JsonProperty("vs_datascript_set_ref")
    @JsonInclude(Include.NON_NULL)
    private String vsDatascriptSetRef;



  /**
   * This is the getter method this will return the attribute value.
   * Index of the virtual service datascript collection.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Index of the virtual service datascript collection.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the virtual service datascript collection.
   * It is a reference to an object of type vsdatascriptset.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsDatascriptSetRef
   */
  @VsoMethod
  public String getVsDatascriptSetRef() {
    return vsDatascriptSetRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the virtual service datascript collection.
   * It is a reference to an object of type vsdatascriptset.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsDatascriptSetRef set the vsDatascriptSetRef.
   */
  @VsoMethod
  public void setVsDatascriptSetRef(String  vsDatascriptSetRef) {
    this.vsDatascriptSetRef = vsDatascriptSetRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VSDataScripts objVSDataScripts = (VSDataScripts) o;
  return   Objects.equals(this.index, objVSDataScripts.index)&&
  Objects.equals(this.vsDatascriptSetRef, objVSDataScripts.vsDatascriptSetRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VSDataScripts {\n");
      sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    vsDatascriptSetRef: ").append(toIndentedString(vsDatascriptSetRef)).append("\n");
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

