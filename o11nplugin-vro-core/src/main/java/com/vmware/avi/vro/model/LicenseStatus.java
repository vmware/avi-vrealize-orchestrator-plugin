package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SaasLicensingStatus;
import com.vmware.avi.vro.model.LicenseServiceUpdate;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The LicenseStatus is a POJO class extends AviRestResource that used for creating
 * LicenseStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LicenseStatus")
@VsoFinder(name = Constants.FINDER_VRO_LICENSESTATUS, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LicenseStatus extends AviRestResource {
    @JsonProperty("essentials_enforced_at")
    @JsonInclude(Include.NON_NULL)
    private String essentialsEnforcedAt;

    @JsonProperty("saas_status")
    @JsonInclude(Include.NON_NULL)
    private SaasLicensingStatus saasStatus;

    @JsonProperty("service_update")
    @JsonInclude(Include.NON_NULL)
    private LicenseServiceUpdate serviceUpdate;

    @JsonProperty("tenant_uuid")
    @JsonInclude(Include.NON_NULL)
    private String tenantUuid;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * License enforcement date when we upgrade controller to higher version and license tier is essential before upgrade.
   * Field introduced in 22.1.7, 30.2.2, 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return essentialsEnforcedAt
   */
  @VsoMethod
  public String getEssentialsEnforcedAt() {
    return essentialsEnforcedAt;
  }

  /**
   * This is the setter method to the attribute.
   * License enforcement date when we upgrade controller to higher version and license tier is essential before upgrade.
   * Field introduced in 22.1.7, 30.2.2, 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param essentialsEnforcedAt set the essentialsEnforcedAt.
   */
  @VsoMethod
  public void setEssentialsEnforcedAt(String  essentialsEnforcedAt) {
    this.essentialsEnforcedAt = essentialsEnforcedAt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Saas licensing status.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return saasStatus
   */
  @VsoMethod
  public SaasLicensingStatus getSaasStatus() {
    return saasStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Saas licensing status.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param saasStatus set the saasStatus.
   */
  @VsoMethod
  public void setSaasStatus(SaasLicensingStatus saasStatus) {
    this.saasStatus = saasStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pulse license service update.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceUpdate
   */
  @VsoMethod
  public LicenseServiceUpdate getServiceUpdate() {
    return serviceUpdate;
  }

  /**
   * This is the setter method to the attribute.
   * Pulse license service update.
   * Field introduced in 21.1.4.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceUpdate set the serviceUpdate.
   */
  @VsoMethod
  public void setServiceUpdate(LicenseServiceUpdate serviceUpdate) {
    this.serviceUpdate = serviceUpdate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant uuid.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantUuid
   */
  @VsoMethod
  public String getTenantUuid() {
    return tenantUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant uuid.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantUuid set the tenantUuid.
   */
  @VsoMethod
  public void setTenantUuid(String  tenantUuid) {
    this.tenantUuid = tenantUuid;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return "LicenseStatus" + "(" + uuid + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LicenseStatus objLicenseStatus = (LicenseStatus) o;
  return   Objects.equals(this.uuid, objLicenseStatus.uuid)&&
  Objects.equals(this.saasStatus, objLicenseStatus.saasStatus)&&
  Objects.equals(this.serviceUpdate, objLicenseStatus.serviceUpdate)&&
  Objects.equals(this.tenantUuid, objLicenseStatus.tenantUuid)&&
  Objects.equals(this.essentialsEnforcedAt, objLicenseStatus.essentialsEnforcedAt);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LicenseStatus {\n");
      sb.append("    essentialsEnforcedAt: ").append(toIndentedString(essentialsEnforcedAt)).append("\n");
        sb.append("    saasStatus: ").append(toIndentedString(saasStatus)).append("\n");
        sb.append("    serviceUpdate: ").append(toIndentedString(serviceUpdate)).append("\n");
        sb.append("    tenantUuid: ").append(toIndentedString(tenantUuid)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

