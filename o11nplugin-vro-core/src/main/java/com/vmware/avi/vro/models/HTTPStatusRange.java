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
 * The HTTPStatusRange is a POJO class extends AviRestResource that used for creating
 * HTTPStatusRange.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPStatusRange")
@VsoFinder(name = Constants.FINDER_VRO_HTTPSTATUSRANGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPStatusRange extends AviRestResource {
    @JsonProperty("begin")
    @JsonInclude(Include.NON_NULL)
    private Integer begin = null;

    @JsonProperty("end")
    @JsonInclude(Include.NON_NULL)
    private Integer end = null;



  /**
   * This is the getter method this will return the attribute value.
   * Starting http response status code.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return begin
   */
  @VsoMethod
  public Integer getBegin() {
    return begin;
  }

  /**
   * This is the setter method to the attribute.
   * Starting http response status code.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param begin set the begin.
   */
  @VsoMethod
  public void setBegin(Integer  begin) {
    this.begin = begin;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ending http response status code.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return end
   */
  @VsoMethod
  public Integer getEnd() {
    return end;
  }

  /**
   * This is the setter method to the attribute.
   * Ending http response status code.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param end set the end.
   */
  @VsoMethod
  public void setEnd(Integer  end) {
    this.end = end;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPStatusRange objHTTPStatusRange = (HTTPStatusRange) o;
  return   Objects.equals(this.begin, objHTTPStatusRange.begin)&&
  Objects.equals(this.end, objHTTPStatusRange.end);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HTTPStatusRange {\n");
      sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

