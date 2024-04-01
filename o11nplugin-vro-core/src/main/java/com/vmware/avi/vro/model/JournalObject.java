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
 * The JournalObject is a POJO class extends AviRestResource that used for creating
 * JournalObject.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "JournalObject")
@VsoFinder(name = Constants.FINDER_VRO_JOURNALOBJECT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class JournalObject extends AviRestResource {
    @JsonProperty("failed")
    @JsonInclude(Include.NON_NULL)
    private Integer failed;

    @JsonProperty("model")
    @JsonInclude(Include.NON_NULL)
    private String model;

    @JsonProperty("skipped")
    @JsonInclude(Include.NON_NULL)
    private Integer skipped;

    @JsonProperty("success")
    @JsonInclude(Include.NON_NULL)
    private Integer success;



  /**
   * This is the getter method this will return the attribute value.
   * Number of object caused a failure.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return failed
   */
  @VsoMethod
  public Integer getFailed() {
    return failed;
  }

  /**
   * This is the setter method to the attribute.
   * Number of object caused a failure.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param failed set the failed.
   */
  @VsoMethod
  public void setFailed(Integer  failed) {
    this.failed = failed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the model.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return model
   */
  @VsoMethod
  public String getModel() {
    return model;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the model.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param model set the model.
   */
  @VsoMethod
  public void setModel(String  model) {
    this.model = model;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of object skipped.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return skipped
   */
  @VsoMethod
  public Integer getSkipped() {
    return skipped;
  }

  /**
   * This is the setter method to the attribute.
   * Number of object skipped.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param skipped set the skipped.
   */
  @VsoMethod
  public void setSkipped(Integer  skipped) {
    this.skipped = skipped;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of object for which processing is successful.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return success
   */
  @VsoMethod
  public Integer getSuccess() {
    return success;
  }

  /**
   * This is the setter method to the attribute.
   * Number of object for which processing is successful.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param success set the success.
   */
  @VsoMethod
  public void setSuccess(Integer  success) {
    this.success = success;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  JournalObject objJournalObject = (JournalObject) o;
  return   Objects.equals(this.model, objJournalObject.model)&&
  Objects.equals(this.success, objJournalObject.success)&&
  Objects.equals(this.failed, objJournalObject.failed)&&
  Objects.equals(this.skipped, objJournalObject.skipped);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class JournalObject {\n");
      sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

