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
 * The VcenterImageDetails is a POJO class extends AviRestResource that used for creating
 * VcenterImageDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VcenterImageDetails")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERIMAGEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VcenterImageDetails extends AviRestResource {
    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId;

    @JsonProperty("error_string")
    @JsonInclude(Include.NON_NULL)
    private String errorString;

    @JsonProperty("image_version")
    @JsonInclude(Include.NON_NULL)
    private String imageVersion;

    @JsonProperty("vc_url")
    @JsonInclude(Include.NON_NULL)
    private String vcUrl;



  /**
   * This is the getter method this will return the attribute value.
   * Cloud id.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud id.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error message.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Error message.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Image version.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return imageVersion
   */
  @VsoMethod
  public String getImageVersion() {
    return imageVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Image version.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param imageVersion set the imageVersion.
   */
  @VsoMethod
  public void setImageVersion(String  imageVersion) {
    this.imageVersion = imageVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vcenter url.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcUrl
   */
  @VsoMethod
  public String getVcUrl() {
    return vcUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Vcenter url.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcUrl set the vcUrl.
   */
  @VsoMethod
  public void setVcUrl(String  vcUrl) {
    this.vcUrl = vcUrl;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VcenterImageDetails objVcenterImageDetails = (VcenterImageDetails) o;
  return   Objects.equals(this.vcUrl, objVcenterImageDetails.vcUrl)&&
  Objects.equals(this.imageVersion, objVcenterImageDetails.imageVersion)&&
  Objects.equals(this.ccId, objVcenterImageDetails.ccId)&&
  Objects.equals(this.errorString, objVcenterImageDetails.errorString);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VcenterImageDetails {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    vcUrl: ").append(toIndentedString(vcUrl)).append("\n");
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

