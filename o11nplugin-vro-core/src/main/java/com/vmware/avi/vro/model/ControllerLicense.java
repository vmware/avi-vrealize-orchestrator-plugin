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
 * The ControllerLicense is a POJO class extends AviRestResource that used for creating
 * ControllerLicense.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerLicense")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERLICENSE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerLicense extends AviRestResource {
    @JsonProperty("active_burst_resources")
    @JsonInclude(Include.NON_NULL)
    private List<BurstResource> activeBurstResources = null;

    @JsonProperty("burst_cores")
    @JsonInclude(Include.NON_NULL)
    private Integer burstCores = null;

    @JsonProperty("cores")
    @JsonInclude(Include.NON_NULL)
    private Integer cores = null;

    @JsonProperty("customer_name")
    @JsonInclude(Include.NON_NULL)
    private String customerName = null;

    @JsonProperty("disable_enforcement")
    @JsonInclude(Include.NON_NULL)
    private Boolean disableEnforcement = null;

    @JsonProperty("expired_burst_resources")
    @JsonInclude(Include.NON_NULL)
    private List<BurstResource> expiredBurstResources = null;

    @JsonProperty("initialized")
    @JsonInclude(Include.NON_NULL)
    private Boolean initialized = null;

    @JsonProperty("license_id")
    @JsonInclude(Include.NON_NULL)
    private String licenseId = null;

    @JsonProperty("license_tier")
    @JsonInclude(Include.NON_NULL)
    private List<String> licenseTier = null;

    @JsonProperty("license_tiers")
    @JsonInclude(Include.NON_NULL)
    private List<CumulativeLicense> licenseTiers = null;

    @JsonProperty("licenses")
    @JsonInclude(Include.NON_NULL)
    private List<SingleLicense> licenses = null;

    @JsonProperty("max_ses")
    @JsonInclude(Include.NON_NULL)
    private Integer maxSes = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("se_bandwidth_limits")
    @JsonInclude(Include.NON_NULL)
    private List<SEBandwidthLimit> seBandwidthLimits = null;

    @JsonProperty("service_cores")
    @JsonInclude(Include.NON_NULL)
    private Float serviceCores = null;

    @JsonProperty("sockets")
    @JsonInclude(Include.NON_NULL)
    private Integer sockets = null;

    @JsonProperty("start_on")
    @JsonInclude(Include.NON_NULL)
    private String startOn = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;

    @JsonProperty("valid_until")
    @JsonInclude(Include.NON_NULL)
    private String validUntil = null;



  /**
   * This is the getter method this will return the attribute value.
   * List of active burst core license in use.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return activeBurstResources
   */
  @VsoMethod
  public List<BurstResource> getActiveBurstResources() {
    return activeBurstResources;
  }

  /**
   * This is the setter method. this will set the activeBurstResources
   * List of active burst core license in use.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return activeBurstResources
   */
  @VsoMethod
  public void setActiveBurstResources(List<BurstResource>  activeBurstResources) {
    this.activeBurstResources = activeBurstResources;
  }

  /**
   * This is the setter method this will set the activeBurstResources
   * List of active burst core license in use.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return activeBurstResources
   */
  @VsoMethod
  public ControllerLicense addActiveBurstResourcesItem(BurstResource activeBurstResourcesItem) {
    if (this.activeBurstResources == null) {
      this.activeBurstResources = new ArrayList<BurstResource>();
    }
    this.activeBurstResources.add(activeBurstResourcesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Total number of service engine cores for burst core based licenses.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return burstCores
   */
  @VsoMethod
  public Integer getBurstCores() {
    return burstCores;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of service engine cores for burst core based licenses.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param burstCores set the burstCores.
   */
  @VsoMethod
  public void setBurstCores(Integer  burstCores) {
    this.burstCores = burstCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of service engine cores in non-container clouds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cores
   */
  @VsoMethod
  public Integer getCores() {
    return cores;
  }

  /**
   * This is the setter method to the attribute.
   * Number of service engine cores in non-container clouds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cores set the cores.
   */
  @VsoMethod
  public void setCores(Integer  cores) {
    this.cores = cores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return customerName
   */
  @VsoMethod
  public String getCustomerName() {
    return customerName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param customerName set the customerName.
   */
  @VsoMethod
  public void setCustomerName(String  customerName) {
    this.customerName = customerName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return disableEnforcement
   */
  @VsoMethod
  public Boolean getDisableEnforcement() {
    return disableEnforcement;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param disableEnforcement set the disableEnforcement.
   */
  @VsoMethod
  public void setDisableEnforcement(Boolean  disableEnforcement) {
    this.disableEnforcement = disableEnforcement;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of used or expired burst core licenses.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return expiredBurstResources
   */
  @VsoMethod
  public List<BurstResource> getExpiredBurstResources() {
    return expiredBurstResources;
  }

  /**
   * This is the setter method. this will set the expiredBurstResources
   * List of used or expired burst core licenses.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return expiredBurstResources
   */
  @VsoMethod
  public void setExpiredBurstResources(List<BurstResource>  expiredBurstResources) {
    this.expiredBurstResources = expiredBurstResources;
  }

  /**
   * This is the setter method this will set the expiredBurstResources
   * List of used or expired burst core licenses.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return expiredBurstResources
   */
  @VsoMethod
  public ControllerLicense addExpiredBurstResourcesItem(BurstResource expiredBurstResourcesItem) {
    if (this.expiredBurstResources == null) {
      this.expiredBurstResources = new ArrayList<BurstResource>();
    }
    this.expiredBurstResources.add(expiredBurstResourcesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Flag used to track initialization.
   * Field introduced in 20.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return initialized
   */
  @VsoMethod
  public Boolean getInitialized() {
    return initialized;
  }

  /**
   * This is the setter method to the attribute.
   * Flag used to track initialization.
   * Field introduced in 20.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param initialized set the initialized.
   */
  @VsoMethod
  public void setInitialized(Boolean  initialized) {
    this.initialized = initialized;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseId
   */
  @VsoMethod
  public String getLicenseId() {
    return licenseId;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param licenseId set the licenseId.
   */
  @VsoMethod
  public void setLicenseId(String  licenseId) {
    this.licenseId = licenseId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseTier
   */
  @VsoMethod
  public List<String> getLicenseTier() {
    return licenseTier;
  }

  /**
   * This is the setter method. this will set the licenseTier
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseTier
   */
  @VsoMethod
  public void setLicenseTier(List<String>  licenseTier) {
    this.licenseTier = licenseTier;
  }

  /**
   * This is the setter method this will set the licenseTier
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseTier
   */
  @VsoMethod
  public ControllerLicense addLicenseTierItem(String licenseTierItem) {
    if (this.licenseTier == null) {
      this.licenseTier = new ArrayList<String>();
    }
    this.licenseTier.add(licenseTierItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseTiers
   */
  @VsoMethod
  public List<CumulativeLicense> getLicenseTiers() {
    return licenseTiers;
  }

  /**
   * This is the setter method. this will set the licenseTiers
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseTiers
   */
  @VsoMethod
  public void setLicenseTiers(List<CumulativeLicense>  licenseTiers) {
    this.licenseTiers = licenseTiers;
  }

  /**
   * This is the setter method this will set the licenseTiers
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseTiers
   */
  @VsoMethod
  public ControllerLicense addLicenseTiersItem(CumulativeLicense licenseTiersItem) {
    if (this.licenseTiers == null) {
      this.licenseTiers = new ArrayList<CumulativeLicense>();
    }
    this.licenseTiers.add(licenseTiersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenses
   */
  @VsoMethod
  public List<SingleLicense> getLicenses() {
    return licenses;
  }

  /**
   * This is the setter method. this will set the licenses
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenses
   */
  @VsoMethod
  public void setLicenses(List<SingleLicense>  licenses) {
    this.licenses = licenses;
  }

  /**
   * This is the setter method this will set the licenses
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenses
   */
  @VsoMethod
  public ControllerLicense addLicensesItem(SingleLicense licensesItem) {
    if (this.licenses == null) {
      this.licenses = new ArrayList<SingleLicense>();
    }
    this.licenses.add(licensesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Number of service engines hosts in container clouds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxSes
   */
  @VsoMethod
  public Integer getMaxSes() {
    return maxSes;
  }

  /**
   * This is the setter method to the attribute.
   * Number of service engines hosts in container clouds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxSes set the maxSes.
   */
  @VsoMethod
  public void setMaxSes(Integer  maxSes) {
    this.maxSes = maxSes;
  }

  /**
   * This is the getter method this will return the attribute value.
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
   * Service engine bandwidth limits for bandwidth based licenses.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seBandwidthLimits
   */
  @VsoMethod
  public List<SEBandwidthLimit> getSeBandwidthLimits() {
    return seBandwidthLimits;
  }

  /**
   * This is the setter method. this will set the seBandwidthLimits
   * Service engine bandwidth limits for bandwidth based licenses.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seBandwidthLimits
   */
  @VsoMethod
  public void setSeBandwidthLimits(List<SEBandwidthLimit>  seBandwidthLimits) {
    this.seBandwidthLimits = seBandwidthLimits;
  }

  /**
   * This is the setter method this will set the seBandwidthLimits
   * Service engine bandwidth limits for bandwidth based licenses.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seBandwidthLimits
   */
  @VsoMethod
  public ControllerLicense addSeBandwidthLimitsItem(SEBandwidthLimit seBandwidthLimitsItem) {
    if (this.seBandwidthLimits == null) {
      this.seBandwidthLimits = new ArrayList<SEBandwidthLimit>();
    }
    this.seBandwidthLimits.add(seBandwidthLimitsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Number of vmware service cores after aggregating all other license types.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceCores
   */
  @VsoMethod
  public Float getServiceCores() {
    return serviceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Number of vmware service cores after aggregating all other license types.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceCores set the serviceCores.
   */
  @VsoMethod
  public void setServiceCores(Float  serviceCores) {
    this.serviceCores = serviceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of physical cpu sockets across service engines in no access and linux server clouds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sockets
   */
  @VsoMethod
  public Integer getSockets() {
    return sockets;
  }

  /**
   * This is the setter method to the attribute.
   * Number of physical cpu sockets across service engines in no access and linux server clouds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sockets set the sockets.
   */
  @VsoMethod
  public void setSockets(Integer  sockets) {
    this.sockets = sockets;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return startOn
   */
  @VsoMethod
  public String getStartOn() {
    return startOn;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param startOn set the startOn.
   */
  @VsoMethod
  public void setStartOn(String  startOn) {
    this.startOn = startOn;
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return validUntil
   */
  @VsoMethod
  public String getValidUntil() {
    return validUntil;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param validUntil set the validUntil.
   */
  @VsoMethod
  public void setValidUntil(String  validUntil) {
    this.validUntil = validUntil;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerLicense objControllerLicense = (ControllerLicense) o;
  return   Objects.equals(this.uuid, objControllerLicense.uuid)&&
  Objects.equals(this.name, objControllerLicense.name)&&
  Objects.equals(this.startOn, objControllerLicense.startOn)&&
  Objects.equals(this.validUntil, objControllerLicense.validUntil)&&
  Objects.equals(this.customerName, objControllerLicense.customerName)&&
  Objects.equals(this.cores, objControllerLicense.cores)&&
  Objects.equals(this.licenseTier, objControllerLicense.licenseTier)&&
  Objects.equals(this.maxSes, objControllerLicense.maxSes)&&
  Objects.equals(this.sockets, objControllerLicense.sockets)&&
  Objects.equals(this.licenses, objControllerLicense.licenses)&&
  Objects.equals(this.seBandwidthLimits, objControllerLicense.seBandwidthLimits)&&
  Objects.equals(this.licenseTiers, objControllerLicense.licenseTiers)&&
  Objects.equals(this.burstCores, objControllerLicense.burstCores)&&
  Objects.equals(this.activeBurstResources, objControllerLicense.activeBurstResources)&&
  Objects.equals(this.expiredBurstResources, objControllerLicense.expiredBurstResources)&&
  Objects.equals(this.licenseId, objControllerLicense.licenseId)&&
  Objects.equals(this.disableEnforcement, objControllerLicense.disableEnforcement)&&
  Objects.equals(this.serviceCores, objControllerLicense.serviceCores)&&
  Objects.equals(this.initialized, objControllerLicense.initialized);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerLicense {\n");
      sb.append("    activeBurstResources: ").append(toIndentedString(activeBurstResources)).append("\n");
        sb.append("    burstCores: ").append(toIndentedString(burstCores)).append("\n");
        sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
        sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
        sb.append("    disableEnforcement: ").append(toIndentedString(disableEnforcement)).append("\n");
        sb.append("    expiredBurstResources: ").append(toIndentedString(expiredBurstResources)).append("\n");
        sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
        sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
        sb.append("    licenseTier: ").append(toIndentedString(licenseTier)).append("\n");
        sb.append("    licenseTiers: ").append(toIndentedString(licenseTiers)).append("\n");
        sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
        sb.append("    maxSes: ").append(toIndentedString(maxSes)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    seBandwidthLimits: ").append(toIndentedString(seBandwidthLimits)).append("\n");
        sb.append("    serviceCores: ").append(toIndentedString(serviceCores)).append("\n");
        sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
        sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
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

