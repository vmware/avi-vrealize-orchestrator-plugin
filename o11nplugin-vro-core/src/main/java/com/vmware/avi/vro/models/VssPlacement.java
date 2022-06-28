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
 * The VssPlacement is a POJO class extends AviRestResource that used for creating
 * VssPlacement.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VssPlacement")
@VsoFinder(name = Constants.FINDER_VRO_VSSPLACEMENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VssPlacement extends AviRestResource {
    @JsonProperty("core_nonaffinity")
    @JsonInclude(Include.NON_NULL)
    private Integer coreNonaffinity = 2;

    @JsonProperty("num_subcores")
    @JsonInclude(Include.NON_NULL)
    private Integer numSubcores = 4;



  /**
   * This is the getter method this will return the attribute value.
   * Degree of core non-affinity for vs placement.
   * Allowed values are 1-256.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return coreNonaffinity
   */
  @VsoMethod
  public Integer getCoreNonaffinity() {
    return coreNonaffinity;
  }

  /**
   * This is the setter method to the attribute.
   * Degree of core non-affinity for vs placement.
   * Allowed values are 1-256.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param coreNonaffinity set the coreNonaffinity.
   */
  @VsoMethod
  public void setCoreNonaffinity(Integer  coreNonaffinity) {
    this.coreNonaffinity = coreNonaffinity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of sub-cores that comprise a cpu core.
   * Allowed values are 1-128.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @return numSubcores
   */
  @VsoMethod
  public Integer getNumSubcores() {
    return numSubcores;
  }

  /**
   * This is the setter method to the attribute.
   * Number of sub-cores that comprise a cpu core.
   * Allowed values are 1-128.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 4.
   * @param numSubcores set the numSubcores.
   */
  @VsoMethod
  public void setNumSubcores(Integer  numSubcores) {
    this.numSubcores = numSubcores;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VssPlacement objVssPlacement = (VssPlacement) o;
  return   Objects.equals(this.numSubcores, objVssPlacement.numSubcores)&&
  Objects.equals(this.coreNonaffinity, objVssPlacement.coreNonaffinity);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VssPlacement {\n");
      sb.append("    coreNonaffinity: ").append(toIndentedString(coreNonaffinity)).append("\n");
        sb.append("    numSubcores: ").append(toIndentedString(numSubcores)).append("\n");
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

