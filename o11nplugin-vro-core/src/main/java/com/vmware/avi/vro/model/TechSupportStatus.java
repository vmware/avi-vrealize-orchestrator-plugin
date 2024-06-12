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
 * The TechSupportStatus is a POJO class extends AviRestResource that used for creating
 * TechSupportStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TechSupportStatus")
@VsoFinder(name = Constants.FINDER_VRO_TECHSUPPORTSTATUS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TechSupportStatus extends AviRestResource {
    @JsonProperty("case_number")
    @JsonInclude(Include.NON_NULL)
    private String caseNumber;

    @JsonProperty("duration")
    @JsonInclude(Include.NON_NULL)
    private String duration;

    @JsonProperty("errors")
    @JsonInclude(Include.NON_NULL)
    private List<String> errors;

    @JsonProperty("key")
    @JsonInclude(Include.NON_NULL)
    private String key;

    @JsonProperty("level")
    @JsonInclude(Include.NON_NULL)
    private String level;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("node")
    @JsonInclude(Include.NON_NULL)
    private String node;

    @JsonProperty("output")
    @JsonInclude(Include.NON_NULL)
    private String output;

    @JsonProperty("size")
    @JsonInclude(Include.NON_NULL)
    private String size;

    @JsonProperty("start_time")
    @JsonInclude(Include.NON_NULL)
    private String startTime;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status;

    @JsonProperty("status_code")
    @JsonInclude(Include.NON_NULL)
    private String statusCode;

    @JsonProperty("warnings")
    @JsonInclude(Include.NON_NULL)
    private List<String> warnings;



  /**
   * This is the getter method this will return the attribute value.
   * 'customer case number for which this tech-support is generated.
   * ''useful for connected portal and other use-cases.'.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return caseNumber
   */
  @VsoMethod
  public String getCaseNumber() {
    return caseNumber;
  }

  /**
   * This is the setter method to the attribute.
   * 'customer case number for which this tech-support is generated.
   * ''useful for connected portal and other use-cases.'.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param caseNumber set the caseNumber.
   */
  @VsoMethod
  public void setCaseNumber(String  caseNumber) {
    this.caseNumber = caseNumber;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total time taken for tech-support collection.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return duration
   */
  @VsoMethod
  public String getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Total time taken for tech-support collection.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(String  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error logged during tech-support collection.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errors
   */
  @VsoMethod
  public List<String> getErrors() {
    return errors;
  }

  /**
   * This is the setter method. this will set the errors
   * Error logged during tech-support collection.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errors
   */
  @VsoMethod
  public void setErrors(List<String>  errors) {
    this.errors = errors;
  }

  /**
   * This is the setter method this will set the errors
   * Error logged during tech-support collection.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errors
   */
  @VsoMethod
  public TechSupportStatus addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<String>();
    }
    this.errors.add(errorsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Tech-support collection keys.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return key
   */
  @VsoMethod
  public String getKey() {
    return key;
  }

  /**
   * This is the setter method to the attribute.
   * Tech-support collection keys.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param key set the key.
   */
  @VsoMethod
  public void setKey(String  key) {
    this.key = key;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tech-support collection level.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return level
   */
  @VsoMethod
  public String getLevel() {
    return level;
  }

  /**
   * This is the setter method to the attribute.
   * Tech-support collection level.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param level set the level.
   */
  @VsoMethod
  public void setLevel(String  level) {
    this.level = level;
  }

  /**
   * This is the getter method this will return the attribute value.
   * 'obj name if one exists.'.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * 'obj name if one exists.'.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cluster member node on which the techsupport tarball bundle is saved.
   * Field introduced in 20.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return node
   */
  @VsoMethod
  public String getNode() {
    return node;
  }

  /**
   * This is the setter method to the attribute.
   * Cluster member node on which the techsupport tarball bundle is saved.
   * Field introduced in 20.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param node set the node.
   */
  @VsoMethod
  public void setNode(String  node) {
    this.node = node;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tech-support collection output.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return output
   */
  @VsoMethod
  public String getOutput() {
    return output;
  }

  /**
   * This is the setter method to the attribute.
   * Tech-support collection output.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param output set the output.
   */
  @VsoMethod
  public void setOutput(String  output) {
    this.output = output;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Size of techsupport tarball.
   * Field introduced in 20.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return size
   */
  @VsoMethod
  public String getSize() {
    return size;
  }

  /**
   * This is the setter method to the attribute.
   * Size of techsupport tarball.
   * Field introduced in 20.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param size set the size.
   */
  @VsoMethod
  public void setSize(String  size) {
    this.size = size;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Start timestamp of tech-support collection.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return startTime
   */
  @VsoMethod
  public String getStartTime() {
    return startTime;
  }

  /**
   * This is the setter method to the attribute.
   * Start timestamp of tech-support collection.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param startTime set the startTime.
   */
  @VsoMethod
  public void setStartTime(String  startTime) {
    this.startTime = startTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status of tech-support invocation.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Status of tech-support invocation.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status code for the tech-support invocation.
   * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
   * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
   * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_BAD_REQUEST...
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return statusCode
   */
  @VsoMethod
  public String getStatusCode() {
    return statusCode;
  }

  /**
   * This is the setter method to the attribute.
   * Status code for the tech-support invocation.
   * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
   * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
   * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_BAD_REQUEST...
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param statusCode set the statusCode.
   */
  @VsoMethod
  public void setStatusCode(String  statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Warning logged during tech-support collection.
   * Field introduced in 18.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return warnings
   */
  @VsoMethod
  public List<String> getWarnings() {
    return warnings;
  }

  /**
   * This is the setter method. this will set the warnings
   * Warning logged during tech-support collection.
   * Field introduced in 18.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return warnings
   */
  @VsoMethod
  public void setWarnings(List<String>  warnings) {
    this.warnings = warnings;
  }

  /**
   * This is the setter method this will set the warnings
   * Warning logged during tech-support collection.
   * Field introduced in 18.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return warnings
   */
  @VsoMethod
  public TechSupportStatus addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<String>();
    }
    this.warnings.add(warningsItem);
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
  TechSupportStatus objTechSupportStatus = (TechSupportStatus) o;
  return   Objects.equals(this.startTime, objTechSupportStatus.startTime)&&
  Objects.equals(this.level, objTechSupportStatus.level)&&
  Objects.equals(this.key, objTechSupportStatus.key)&&
  Objects.equals(this.status, objTechSupportStatus.status)&&
  Objects.equals(this.output, objTechSupportStatus.output)&&
  Objects.equals(this.duration, objTechSupportStatus.duration)&&
  Objects.equals(this.errors, objTechSupportStatus.errors)&&
  Objects.equals(this.warnings, objTechSupportStatus.warnings)&&
  Objects.equals(this.statusCode, objTechSupportStatus.statusCode)&&
  Objects.equals(this.name, objTechSupportStatus.name)&&
  Objects.equals(this.caseNumber, objTechSupportStatus.caseNumber)&&
  Objects.equals(this.node, objTechSupportStatus.node)&&
  Objects.equals(this.size, objTechSupportStatus.size);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TechSupportStatus {\n");
      sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    node: ").append(toIndentedString(node)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

