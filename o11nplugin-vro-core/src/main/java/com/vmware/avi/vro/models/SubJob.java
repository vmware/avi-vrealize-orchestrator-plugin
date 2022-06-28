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
 * The SubJob is a POJO class extends AviRestResource that used for creating
 * SubJob.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SubJob")
@VsoFinder(name = Constants.FINDER_VRO_SUBJOB)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SubJob extends AviRestResource {
    @JsonProperty("expires_at")
    @JsonInclude(Include.NON_NULL)
    private String expiresAt = null;

    @JsonProperty("metadata")
    @JsonInclude(Include.NON_NULL)
    private String metadata = null;

    @JsonProperty("num_retries")
    @JsonInclude(Include.NON_NULL)
    private Integer numRetries = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return expiresAt
   */
  @VsoMethod
  public String getExpiresAt() {
    return expiresAt;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param expiresAt set the expiresAt.
   */
  @VsoMethod
  public void setExpiresAt(String  expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metadata
   */
  @VsoMethod
  public String getMetadata() {
    return metadata;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metadata set the metadata.
   */
  @VsoMethod
  public void setMetadata(String  metadata) {
    this.metadata = metadata;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of times the sub job got scheduled.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numRetries
   */
  @VsoMethod
  public Integer getNumRetries() {
    return numRetries;
  }

  /**
   * This is the setter method to the attribute.
   * Number of times the sub job got scheduled.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numRetries set the numRetries.
   */
  @VsoMethod
  public void setNumRetries(Integer  numRetries) {
    this.numRetries = numRetries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - JOB_TYPE_VS_FULL_LOGS, JOB_TYPE_VS_UDF, JOB_TYPE_VS_METRICS_RT, JOB_TYPE_SSL_CERT, JOB_TYPE_DEBUGVS_PKT_CAPTURE,
   * JOB_TYPE_CONSISTENCY_CHECK, JOB_TYPE_TECHSUPPORT, JOB_TYPE_PKI_PROFILE, JOB_TYPE_NSP_RULE, JOB_TYPE_SEGROUP_METRICS_RT, JOB_TYPE_POSTGRES_STATUS,
   * JOB_TYPE_VS_ROTATE_KEYS, JOB_TYPE_POOL_DNS, JOB_TYPE_GSLB_SERVICE, JOB_TYPE_APP_PERSISTENCE, JOB_TYPE_PROCESS_LOCKED_USER_ACCOUNTS,
   * JOB_TYPE_SESSION, JOB_TYPE_AUTHTOKEN, JOB_TYPE_CLUSTER, JOB_TYPE_SE_SECURE_CHANNEL_CLEANUP...
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - JOB_TYPE_VS_FULL_LOGS, JOB_TYPE_VS_UDF, JOB_TYPE_VS_METRICS_RT, JOB_TYPE_SSL_CERT, JOB_TYPE_DEBUGVS_PKT_CAPTURE,
   * JOB_TYPE_CONSISTENCY_CHECK, JOB_TYPE_TECHSUPPORT, JOB_TYPE_PKI_PROFILE, JOB_TYPE_NSP_RULE, JOB_TYPE_SEGROUP_METRICS_RT, JOB_TYPE_POSTGRES_STATUS,
   * JOB_TYPE_VS_ROTATE_KEYS, JOB_TYPE_POOL_DNS, JOB_TYPE_GSLB_SERVICE, JOB_TYPE_APP_PERSISTENCE, JOB_TYPE_PROCESS_LOCKED_USER_ACCOUNTS,
   * JOB_TYPE_SESSION, JOB_TYPE_AUTHTOKEN, JOB_TYPE_CLUSTER, JOB_TYPE_SE_SECURE_CHANNEL_CLEANUP...
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SubJob objSubJob = (SubJob) o;
  return   Objects.equals(this.type, objSubJob.type)&&
  Objects.equals(this.expiresAt, objSubJob.expiresAt)&&
  Objects.equals(this.metadata, objSubJob.metadata)&&
  Objects.equals(this.numRetries, objSubJob.numRetries);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SubJob {\n");
      sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    numRetries: ").append(toIndentedString(numRetries)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

