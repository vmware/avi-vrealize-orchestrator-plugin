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
 * The CloudASGNotifDetails is a POJO class extends AviRestResource that used for creating
 * CloudASGNotifDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CloudASGNotifDetails")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDASGNOTIFDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CloudASGNotifDetails extends AviRestResource {
    @JsonProperty("asg_name")
    @JsonInclude(Include.NON_NULL)
    private String asgName = null;

    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId = null;

    @JsonProperty("error_string")
    @JsonInclude(Include.NON_NULL)
    private String errorString = null;

    @JsonProperty("pool_ref")
    @JsonInclude(Include.NON_NULL)
    private String poolRef = null;



  /**
   * This is the getter method this will return the attribute value.
   * Autoscale group name.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return asgName
   */
  @VsoMethod
  public String getAsgName() {
    return asgName;
  }

  /**
   * This is the setter method to the attribute.
   * Autoscale group name.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param asgName set the asgName.
   */
  @VsoMethod
  public void setAsgName(String  asgName) {
    this.asgName = asgName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloud uuid.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud uuid.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Failure reason if autoscale group creation or deletion fails.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Failure reason if autoscale group creation or deletion fails.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pool uuid.
   * It is a reference to an object of type pool.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolRef
   */
  @VsoMethod
  public String getPoolRef() {
    return poolRef;
  }

  /**
   * This is the setter method to the attribute.
   * Pool uuid.
   * It is a reference to an object of type pool.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolRef set the poolRef.
   */
  @VsoMethod
  public void setPoolRef(String  poolRef) {
    this.poolRef = poolRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CloudASGNotifDetails objCloudASGNotifDetails = (CloudASGNotifDetails) o;
  return   Objects.equals(this.ccId, objCloudASGNotifDetails.ccId)&&
  Objects.equals(this.asgName, objCloudASGNotifDetails.asgName)&&
  Objects.equals(this.errorString, objCloudASGNotifDetails.errorString)&&
  Objects.equals(this.poolRef, objCloudASGNotifDetails.poolRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CloudASGNotifDetails {\n");
      sb.append("    asgName: ").append(toIndentedString(asgName)).append("\n");
        sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
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

