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
 * The CustomTag is a POJO class extends AviRestResource that used for creating
 * CustomTag.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CustomTag")
@VsoFinder(name = Constants.FINDER_VRO_CUSTOMTAG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CustomTag extends AviRestResource {
  @JsonProperty("tag_key")
  @JsonInclude(Include.NON_NULL)
  private String tagKey = null;

  @JsonProperty("tag_val")
  @JsonInclude(Include.NON_NULL)
  private String tagVal = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property tag_key of obj type customtag field type str  type string.
   * @return tagKey
   */
  @VsoMethod
  public String getTagKey() {
    return tagKey;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property tag_key of obj type customtag field type str  type string.
   * @param tagKey set the tagKey.
   */
  @VsoMethod
  public void setTagKey(String  tagKey) {
    this.tagKey = tagKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property tag_val of obj type customtag field type str  type string.
   * @return tagVal
   */
  @VsoMethod
  public String getTagVal() {
    return tagVal;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property tag_val of obj type customtag field type str  type string.
   * @param tagVal set the tagVal.
   */
  @VsoMethod
  public void setTagVal(String  tagVal) {
    this.tagVal = tagVal;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CustomTag objCustomTag = (CustomTag) o;
  return   Objects.equals(this.tagKey, objCustomTag.tagKey)&&
  Objects.equals(this.tagVal, objCustomTag.tagVal);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CustomTag {\n");
      sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
        sb.append("    tagVal: ").append(toIndentedString(tagVal)).append("\n");
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
