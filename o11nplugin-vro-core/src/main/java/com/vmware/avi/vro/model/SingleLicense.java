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
 * The SingleLicense is a POJO class extends AviRestResource that used for creating
 * SingleLicense.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SingleLicense")
@VsoFinder(name = Constants.FINDER_VRO_SINGLELICENSE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SingleLicense extends AviRestResource {
    @JsonProperty("addons")
    @JsonInclude(Include.NON_NULL)
    private List<String> addons = null;

    @JsonProperty("burst_cores")
    @JsonInclude(Include.NON_NULL)
    private Integer burstCores = null;

    @JsonProperty("capacity")
    @JsonInclude(Include.NON_NULL)
    private Float capacity = 0.0f;

    @JsonProperty("ccu")
    @JsonInclude(Include.NON_NULL)
    private Integer ccu = 0;

    @JsonProperty("cores")
    @JsonInclude(Include.NON_NULL)
    private Float cores = null;

    @JsonProperty("cpu_cores")
    @JsonInclude(Include.NON_NULL)
    private Float cpuCores = 0.0f;

    @JsonProperty("created_on")
    @JsonInclude(Include.NON_NULL)
    private String createdOn = null;

    @JsonProperty("customer_name")
    @JsonInclude(Include.NON_NULL)
    private String customerName = null;

    @JsonProperty("enforced_params")
    @JsonInclude(Include.NON_NULL)
    private List<String> enforcedParams = null;

    @JsonProperty("expired")
    @JsonInclude(Include.NON_NULL)
    private Boolean expired = false;

    @JsonProperty("last_update")
    @JsonInclude(Include.NON_NULL)
    private String lastUpdate = null;

    @JsonProperty("license_id")
    @JsonInclude(Include.NON_NULL)
    private String licenseId = null;

    @JsonProperty("license_name")
    @JsonInclude(Include.NON_NULL)
    private String licenseName = null;

    @JsonProperty("license_string")
    @JsonInclude(Include.NON_NULL)
    private String licenseString = null;

    @JsonProperty("license_tier")
    @JsonInclude(Include.NON_NULL)
    private List<String> licenseTier = null;

    @JsonProperty("license_type")
    @JsonInclude(Include.NON_NULL)
    private String licenseType = null;

    @JsonProperty("max_ses")
    @JsonInclude(Include.NON_NULL)
    private Integer maxSes = null;

    @JsonProperty("se_bandwidth_limits")
    @JsonInclude(Include.NON_NULL)
    private List<SEBandwidthLimit> seBandwidthLimits = null;

    @JsonProperty("serial_key")
    @JsonInclude(Include.NON_NULL)
    private String serialKey = null;

    @JsonProperty("service_cores")
    @JsonInclude(Include.NON_NULL)
    private Float serviceCores = 0.0f;

    @JsonProperty("sockets")
    @JsonInclude(Include.NON_NULL)
    private Integer sockets = null;

    @JsonProperty("start_on")
    @JsonInclude(Include.NON_NULL)
    private String startOn = null;

    @JsonProperty("tier_type")
    @JsonInclude(Include.NON_NULL)
    private String tierType = null;

    @JsonProperty("unit")
    @JsonInclude(Include.NON_NULL)
    private String unit = "SERVICE_UNIT";

    @JsonProperty("valid_until")
    @JsonInclude(Include.NON_NULL)
    private String validUntil = null;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private String version = null;



  /**
   * This is the getter method this will return the attribute value.
   * Features supported by the add-on license.
   * Enum options - LICENSE_UNKNOWN_ADDON, LICENSE_LEGACY_ADDON.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return addons
   */
  @VsoMethod
  public List<String> getAddons() {
    return addons;
  }

  /**
   * This is the setter method. this will set the addons
   * Features supported by the add-on license.
   * Enum options - LICENSE_UNKNOWN_ADDON, LICENSE_LEGACY_ADDON.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return addons
   */
  @VsoMethod
  public void setAddons(List<String>  addons) {
    this.addons = addons;
  }

  /**
   * This is the setter method this will set the addons
   * Features supported by the add-on license.
   * Enum options - LICENSE_UNKNOWN_ADDON, LICENSE_LEGACY_ADDON.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return addons
   */
  @VsoMethod
  public SingleLicense addAddonsItem(String addonsItem) {
    if (this.addons == null) {
      this.addons = new ArrayList<String>();
    }
    this.addons.add(addonsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Total number of service engine burst cores for core based licenses.
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
   * Total number of service engine burst cores for core based licenses.
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
   * Total licensing capacity available for all the resoures available in a single license.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @return capacity
   */
  @VsoMethod
  public Float getCapacity() {
    return capacity;
  }

  /**
   * This is the setter method to the attribute.
   * Total licensing capacity available for all the resoures available in a single license.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @param capacity set the capacity.
   */
  @VsoMethod
  public void setCapacity(Float  capacity) {
    this.capacity = capacity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of concurrent vmware horizon users.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return ccu
   */
  @VsoMethod
  public Integer getCcu() {
    return ccu;
  }

  /**
   * This is the setter method to the attribute.
   * Number of concurrent vmware horizon users.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param ccu set the ccu.
   */
  @VsoMethod
  public void setCcu(Integer  ccu) {
    this.ccu = ccu;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of service engine cores in non-container clouds.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cores
   */
  @VsoMethod
  public Float getCores() {
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
  public void setCores(Float  cores) {
    this.cores = cores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of cpu cores.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @return cpuCores
   */
  @VsoMethod
  public Float getCpuCores() {
    return cpuCores;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of cpu cores.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @param cpuCores set the cpuCores.
   */
  @VsoMethod
  public void setCpuCores(Float  cpuCores) {
    this.cpuCores = cpuCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return createdOn
   */
  @VsoMethod
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param createdOn set the createdOn.
   */
  @VsoMethod
  public void setCreatedOn(String  createdOn) {
    this.createdOn = createdOn;
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enforcedParams
   */
  @VsoMethod
  public List<String> getEnforcedParams() {
    return enforcedParams;
  }

  /**
   * This is the setter method. this will set the enforcedParams
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enforcedParams
   */
  @VsoMethod
  public void setEnforcedParams(List<String>  enforcedParams) {
    this.enforcedParams = enforcedParams;
  }

  /**
   * This is the setter method this will set the enforcedParams
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enforcedParams
   */
  @VsoMethod
  public SingleLicense addEnforcedParamsItem(String enforcedParamsItem) {
    if (this.enforcedParams == null) {
      this.enforcedParams = new ArrayList<String>();
    }
    this.enforcedParams.add(enforcedParamsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Flag to track license expiry.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return expired
   */
  @VsoMethod
  public Boolean getExpired() {
    return expired;
  }

  /**
   * This is the setter method to the attribute.
   * Flag to track license expiry.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param expired set the expired.
   */
  @VsoMethod
  public void setExpired(Boolean  expired) {
    this.expired = expired;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastUpdate
   */
  @VsoMethod
  public String getLastUpdate() {
    return lastUpdate;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastUpdate set the lastUpdate.
   */
  @VsoMethod
  public void setLastUpdate(String  lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  /**
   * This is the getter method this will return the attribute value.
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
   * @return licenseName
   */
  @VsoMethod
  public String getLicenseName() {
    return licenseName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param licenseName set the licenseName.
   */
  @VsoMethod
  public void setLicenseName(String  licenseName) {
    this.licenseName = licenseName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseString
   */
  @VsoMethod
  public String getLicenseString() {
    return licenseString;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param licenseString set the licenseString.
   */
  @VsoMethod
  public void setLicenseString(String  licenseString) {
    this.licenseString = licenseString;
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
  public SingleLicense addLicenseTierItem(String licenseTierItem) {
    if (this.licenseTier == null) {
      this.licenseTier = new ArrayList<String>();
    }
    this.licenseTier.add(licenseTierItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseType
   */
  @VsoMethod
  public String getLicenseType() {
    return licenseType;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param licenseType set the licenseType.
   */
  @VsoMethod
  public void setLicenseType(String  licenseType) {
    this.licenseType = licenseType;
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
  public SingleLicense addSeBandwidthLimitsItem(SEBandwidthLimit seBandwidthLimitsItem) {
    if (this.seBandwidthLimits == null) {
      this.seBandwidthLimits = new ArrayList<SEBandwidthLimit>();
    }
    this.seBandwidthLimits.add(seBandwidthLimitsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Serial key (hyphen separated 25 char wide alphanumeric key ex  aa123-23bas-383as-383ud-fhsfg).
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serialKey
   */
  @VsoMethod
  public String getSerialKey() {
    return serialKey;
  }

  /**
   * This is the setter method to the attribute.
   * Serial key (hyphen separated 25 char wide alphanumeric key ex  aa123-23bas-383as-383ud-fhsfg).
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serialKey set the serialKey.
   */
  @VsoMethod
  public void setSerialKey(String  serialKey) {
    this.serialKey = serialKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of service cores equivalent to all the resoures available in the single license.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
   * @return serviceCores
   */
  @VsoMethod
  public Float getServiceCores() {
    return serviceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of service cores equivalent to all the resoures available in the single license.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
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
   * Specifies the licensed tier.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tierType
   */
  @VsoMethod
  public String getTierType() {
    return tierType;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the licensed tier.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tierType set the tierType.
   */
  @VsoMethod
  public void setTierType(String  tierType) {
    this.tierType = tierType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Units in which resources will be licensed.
   * Enum options - UNNOWN_UNIT, SERVICE_UNIT, LEGACY_ADDON_UNIT.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SERVICE_UNIT".
   * @return unit
   */
  @VsoMethod
  public String getUnit() {
    return unit;
  }

  /**
   * This is the setter method to the attribute.
   * Units in which resources will be licensed.
   * Enum options - UNNOWN_UNIT, SERVICE_UNIT, LEGACY_ADDON_UNIT.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SERVICE_UNIT".
   * @param unit set the unit.
   */
  @VsoMethod
  public void setUnit(String  unit) {
    this.unit = unit;
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

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return version
   */
  @VsoMethod
  public String getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(String  version) {
    this.version = version;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SingleLicense objSingleLicense = (SingleLicense) o;
  return   Objects.equals(this.licenseName, objSingleLicense.licenseName)&&
  Objects.equals(this.startOn, objSingleLicense.startOn)&&
  Objects.equals(this.validUntil, objSingleLicense.validUntil)&&
  Objects.equals(this.customerName, objSingleLicense.customerName)&&
  Objects.equals(this.cores, objSingleLicense.cores)&&
  Objects.equals(this.maxSes, objSingleLicense.maxSes)&&
  Objects.equals(this.licenseTier, objSingleLicense.licenseTier)&&
  Objects.equals(this.licenseString, objSingleLicense.licenseString)&&
  Objects.equals(this.licenseId, objSingleLicense.licenseId)&&
  Objects.equals(this.version, objSingleLicense.version)&&
  Objects.equals(this.createdOn, objSingleLicense.createdOn)&&
  Objects.equals(this.lastUpdate, objSingleLicense.lastUpdate)&&
  Objects.equals(this.licenseType, objSingleLicense.licenseType)&&
  Objects.equals(this.enforcedParams, objSingleLicense.enforcedParams)&&
  Objects.equals(this.sockets, objSingleLicense.sockets)&&
  Objects.equals(this.seBandwidthLimits, objSingleLicense.seBandwidthLimits)&&
  Objects.equals(this.tierType, objSingleLicense.tierType)&&
  Objects.equals(this.burstCores, objSingleLicense.burstCores)&&
  Objects.equals(this.serialKey, objSingleLicense.serialKey)&&
  Objects.equals(this.serviceCores, objSingleLicense.serviceCores)&&
  Objects.equals(this.cpuCores, objSingleLicense.cpuCores)&&
  Objects.equals(this.expired, objSingleLicense.expired)&&
  Objects.equals(this.ccu, objSingleLicense.ccu)&&
  Objects.equals(this.addons, objSingleLicense.addons)&&
  Objects.equals(this.capacity, objSingleLicense.capacity)&&
  Objects.equals(this.unit, objSingleLicense.unit);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SingleLicense {\n");
      sb.append("    addons: ").append(toIndentedString(addons)).append("\n");
        sb.append("    burstCores: ").append(toIndentedString(burstCores)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    ccu: ").append(toIndentedString(ccu)).append("\n");
        sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
        sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
        sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
        sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
        sb.append("    enforcedParams: ").append(toIndentedString(enforcedParams)).append("\n");
        sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
        sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
        sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
        sb.append("    licenseName: ").append(toIndentedString(licenseName)).append("\n");
        sb.append("    licenseString: ").append(toIndentedString(licenseString)).append("\n");
        sb.append("    licenseTier: ").append(toIndentedString(licenseTier)).append("\n");
        sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
        sb.append("    maxSes: ").append(toIndentedString(maxSes)).append("\n");
        sb.append("    seBandwidthLimits: ").append(toIndentedString(seBandwidthLimits)).append("\n");
        sb.append("    serialKey: ").append(toIndentedString(serialKey)).append("\n");
        sb.append("    serviceCores: ").append(toIndentedString(serviceCores)).append("\n");
        sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
        sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
        sb.append("    tierType: ").append(toIndentedString(tierType)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

