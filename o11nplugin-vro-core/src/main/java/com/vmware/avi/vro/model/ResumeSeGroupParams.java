package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SeGroupResumeOptions;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ResumeSeGroupParams is a POJO class extends AviRestResource that used for creating
 * ResumeSeGroupParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ResumeSeGroupParams")
@VsoFinder(name = Constants.FINDER_VRO_RESUMESEGROUPPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ResumeSeGroupParams extends AviRestResource {
    @JsonProperty("prechecks_only")
    @JsonInclude(Include.NON_NULL)
    private Boolean prechecksOnly = false;

    @JsonProperty("se_group_options")
    @JsonInclude(Include.NON_NULL)
    private SeGroupResumeOptions seGroupOptions;

    @JsonProperty("se_group_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> seGroupRefs;

    @JsonProperty("skip_warnings")
    @JsonInclude(Include.NON_NULL)
    private Boolean skipWarnings = false;



  /**
   * This is the getter method this will return the attribute value.
   * This flag is set to run the pre-checks without the subsequent upgrade operations.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return prechecksOnly
   */
  @VsoMethod
  public Boolean getPrechecksOnly() {
    return prechecksOnly;
  }

  /**
   * This is the setter method to the attribute.
   * This flag is set to run the pre-checks without the subsequent upgrade operations.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param prechecksOnly set the prechecksOnly.
   */
  @VsoMethod
  public void setPrechecksOnly(Boolean  prechecksOnly) {
    this.prechecksOnly = prechecksOnly;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Se group options for resume operations.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupOptions
   */
  @VsoMethod
  public SeGroupResumeOptions getSeGroupOptions() {
    return seGroupOptions;
  }

  /**
   * This is the setter method to the attribute.
   * Se group options for resume operations.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGroupOptions set the seGroupOptions.
   */
  @VsoMethod
  public void setSeGroupOptions(SeGroupResumeOptions seGroupOptions) {
    this.seGroupOptions = seGroupOptions;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Se group uuids for resuming upgrade.
   * It is a reference to an object of type serviceenginegroup.
   * Field introduced in 18.2.6.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupRefs
   */
  @VsoMethod
  public List<String> getSeGroupRefs() {
    return seGroupRefs;
  }

  /**
   * This is the setter method. this will set the seGroupRefs
   * Se group uuids for resuming upgrade.
   * It is a reference to an object of type serviceenginegroup.
   * Field introduced in 18.2.6.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupRefs
   */
  @VsoMethod
  public void setSeGroupRefs(List<String>  seGroupRefs) {
    this.seGroupRefs = seGroupRefs;
  }

  /**
   * This is the setter method this will set the seGroupRefs
   * Se group uuids for resuming upgrade.
   * It is a reference to an object of type serviceenginegroup.
   * Field introduced in 18.2.6.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupRefs
   */
  @VsoMethod
  public ResumeSeGroupParams addSeGroupRefsItem(String seGroupRefsItem) {
    if (this.seGroupRefs == null) {
      this.seGroupRefs = new ArrayList<String>();
    }
    this.seGroupRefs.add(seGroupRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * This is flag when set as true skips few optional must checks.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return skipWarnings
   */
  @VsoMethod
  public Boolean getSkipWarnings() {
    return skipWarnings;
  }

  /**
   * This is the setter method to the attribute.
   * This is flag when set as true skips few optional must checks.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param skipWarnings set the skipWarnings.
   */
  @VsoMethod
  public void setSkipWarnings(Boolean  skipWarnings) {
    this.skipWarnings = skipWarnings;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ResumeSeGroupParams objResumeSeGroupParams = (ResumeSeGroupParams) o;
  return   Objects.equals(this.seGroupOptions, objResumeSeGroupParams.seGroupOptions)&&
  Objects.equals(this.seGroupRefs, objResumeSeGroupParams.seGroupRefs)&&
  Objects.equals(this.skipWarnings, objResumeSeGroupParams.skipWarnings)&&
  Objects.equals(this.prechecksOnly, objResumeSeGroupParams.prechecksOnly);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ResumeSeGroupParams {\n");
      sb.append("    prechecksOnly: ").append(toIndentedString(prechecksOnly)).append("\n");
        sb.append("    seGroupOptions: ").append(toIndentedString(seGroupOptions)).append("\n");
        sb.append("    seGroupRefs: ").append(toIndentedString(seGroupRefs)).append("\n");
        sb.append("    skipWarnings: ").append(toIndentedString(skipWarnings)).append("\n");
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

