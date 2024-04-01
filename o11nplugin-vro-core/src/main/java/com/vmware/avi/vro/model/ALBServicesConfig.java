package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AppSignatureConfig;
import com.vmware.avi.vro.model.ALBServicesUser;
import com.vmware.avi.vro.model.CaseConfig;
import com.vmware.avi.vro.model.PortalFeatureOptIn;
import com.vmware.avi.vro.model.InventoryConfiguration;
import com.vmware.avi.vro.model.IpReputationConfig;
import com.vmware.avi.vro.model.OperationsConfig;
import com.vmware.avi.vro.model.SaasLicensingInfo;
import com.vmware.avi.vro.model.PulseServicesSessionConfig;
import com.vmware.avi.vro.model.ProxyConfiguration;
import com.vmware.avi.vro.model.PulseServicesTenantConfig;
import com.vmware.avi.vro.model.UserAgentDBConfig;
import com.vmware.avi.vro.model.WafCrsConfig;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ALBServicesConfig is a POJO class extends AviRestResource that used for creating
 * ALBServicesConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ALBServicesConfig")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESCONFIG, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ALBServicesConfig extends AviRestResource {
    @JsonProperty("app_signature_config")
    @JsonInclude(Include.NON_NULL)
    private AppSignatureConfig appSignatureConfig;

    @JsonProperty("asset_contact")
    @JsonInclude(Include.NON_NULL)
    private ALBServicesUser assetContact;

    @JsonProperty("case_config")
    @JsonInclude(Include.NON_NULL)
    private CaseConfig caseConfig;

    @JsonProperty("feature_opt_in_status")
    @JsonInclude(Include.NON_NULL)
    private PortalFeatureOptIn featureOptInStatus;

    @JsonProperty("inventory_config")
    @JsonInclude(Include.NON_NULL)
    private InventoryConfiguration inventoryConfig;

    @JsonProperty("ip_reputation_config")
    @JsonInclude(Include.NON_NULL)
    private IpReputationConfig ipReputationConfig;

    @JsonProperty("mode")
    @JsonInclude(Include.NON_NULL)
    private String mode = "MYVMWARE";

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("operations_config")
    @JsonInclude(Include.NON_NULL)
    private OperationsConfig operationsConfig;

    @JsonProperty("polling_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer pollingInterval = 10;

    @JsonProperty("portal_url")
    @JsonInclude(Include.NON_NULL)
    private String portalUrl;

    @JsonProperty("saas_licensing_config")
    @JsonInclude(Include.NON_NULL)
    private SaasLicensingInfo saasLicensingConfig;

    @JsonProperty("session_config")
    @JsonInclude(Include.NON_NULL)
    private PulseServicesSessionConfig sessionConfig;

    @JsonProperty("split_proxy_configuration")
    @JsonInclude(Include.NON_NULL)
    private ProxyConfiguration splitProxyConfiguration;

    @JsonProperty("tenant_config")
    @JsonInclude(Include.NON_NULL)
    private PulseServicesTenantConfig tenantConfig;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("use_split_proxy")
    @JsonInclude(Include.NON_NULL)
    private Boolean useSplitProxy = false;

    @JsonProperty("use_tls")
    @JsonInclude(Include.NON_NULL)
    private Boolean useTls = true;

    @JsonProperty("user_agent_db_config")
    @JsonInclude(Include.NON_NULL)
    private UserAgentDBConfig userAgentDbConfig;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("waf_config")
    @JsonInclude(Include.NON_NULL)
    private WafCrsConfig wafConfig;



  /**
   * This is the getter method this will return the attribute value.
   * Default values for application signature sync.
   * Field introduced in 20.1.4.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return appSignatureConfig
   */
  @VsoMethod
  public AppSignatureConfig getAppSignatureConfig() {
    return appSignatureConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Default values for application signature sync.
   * Field introduced in 20.1.4.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param appSignatureConfig set the appSignatureConfig.
   */
  @VsoMethod
  public void setAppSignatureConfig(AppSignatureConfig appSignatureConfig) {
    this.appSignatureConfig = appSignatureConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default contact for this controller cluster.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return assetContact
   */
  @VsoMethod
  public ALBServicesUser getAssetContact() {
    return assetContact;
  }

  /**
   * This is the setter method to the attribute.
   * Default contact for this controller cluster.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param assetContact set the assetContact.
   */
  @VsoMethod
  public void setAssetContact(ALBServicesUser assetContact) {
    this.assetContact = assetContact;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default values for case management.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return caseConfig
   */
  @VsoMethod
  public CaseConfig getCaseConfig() {
    return caseConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Default values for case management.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param caseConfig set the caseConfig.
   */
  @VsoMethod
  public void setCaseConfig(CaseConfig caseConfig) {
    this.caseConfig = caseConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Features opt-in for pulse cloud services.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return featureOptInStatus
   */
  @VsoMethod
  public PortalFeatureOptIn getFeatureOptInStatus() {
    return featureOptInStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Features opt-in for pulse cloud services.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param featureOptInStatus set the featureOptInStatus.
   */
  @VsoMethod
  public void setFeatureOptInStatus(PortalFeatureOptIn featureOptInStatus) {
    this.featureOptInStatus = featureOptInStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Inventory configurations for pulse cloud services.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return inventoryConfig
   */
  @VsoMethod
  public InventoryConfiguration getInventoryConfig() {
    return inventoryConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Inventory configurations for pulse cloud services.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param inventoryConfig set the inventoryConfig.
   */
  @VsoMethod
  public void setInventoryConfig(InventoryConfiguration inventoryConfig) {
    this.inventoryConfig = inventoryConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default values to be used for ip reputation sync.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipReputationConfig
   */
  @VsoMethod
  public IpReputationConfig getIpReputationConfig() {
    return ipReputationConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Default values to be used for ip reputation sync.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipReputationConfig set the ipReputationConfig.
   */
  @VsoMethod
  public void setIpReputationConfig(IpReputationConfig ipReputationConfig) {
    this.ipReputationConfig = ipReputationConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mode helps log collection and upload.
   * Enum options - MODE_UNKNOWN, SALESFORCE, SYSTEST, MYVMWARE, BROADCOM.
   * Field introduced in 20.1.2.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- salesforce,myvmware,systest), basic edition(allowed values-
   * salesforce,myvmware,systest), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "MYVMWARE".
   * @return mode
   */
  @VsoMethod
  public String getMode() {
    return mode;
  }

  /**
   * This is the setter method to the attribute.
   * Mode helps log collection and upload.
   * Enum options - MODE_UNKNOWN, SALESFORCE, SYSTEST, MYVMWARE, BROADCOM.
   * Field introduced in 20.1.2.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- salesforce,myvmware,systest), basic edition(allowed values-
   * salesforce,myvmware,systest), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "MYVMWARE".
   * @param mode set the mode.
   */
  @VsoMethod
  public void setMode(String  mode) {
    this.mode = mode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the albservicesconfig object.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the albservicesconfig object.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Operations configuration.
   * Field deprecated in 30.1.1.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return operationsConfig
   */
  @VsoMethod
  public OperationsConfig getOperationsConfig() {
    return operationsConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Operations configuration.
   * Field deprecated in 30.1.1.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param operationsConfig set the operationsConfig.
   */
  @VsoMethod
  public void setOperationsConfig(OperationsConfig operationsConfig) {
    this.operationsConfig = operationsConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time interval in minutes.
   * Allowed values are 5-60.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @return pollingInterval
   */
  @VsoMethod
  public Integer getPollingInterval() {
    return pollingInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Time interval in minutes.
   * Allowed values are 5-60.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10.
   * @param pollingInterval set the pollingInterval.
   */
  @VsoMethod
  public void setPollingInterval(Integer  pollingInterval) {
    this.pollingInterval = pollingInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The fqdn or ip address of the pulse cloud services.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return portalUrl
   */
  @VsoMethod
  public String getPortalUrl() {
    return portalUrl;
  }

  /**
   * This is the setter method to the attribute.
   * The fqdn or ip address of the pulse cloud services.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param portalUrl set the portalUrl.
   */
  @VsoMethod
  public void setPortalUrl(String  portalUrl) {
    this.portalUrl = portalUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Saas licensing configuration.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return saasLicensingConfig
   */
  @VsoMethod
  public SaasLicensingInfo getSaasLicensingConfig() {
    return saasLicensingConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Saas licensing configuration.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param saasLicensingConfig set the saasLicensingConfig.
   */
  @VsoMethod
  public void setSaasLicensingConfig(SaasLicensingInfo saasLicensingConfig) {
    this.saasLicensingConfig = saasLicensingConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Session configuration data.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sessionConfig
   */
  @VsoMethod
  public PulseServicesSessionConfig getSessionConfig() {
    return sessionConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Session configuration data.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sessionConfig set the sessionConfig.
   */
  @VsoMethod
  public void setSessionConfig(PulseServicesSessionConfig sessionConfig) {
    this.sessionConfig = sessionConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Split proxy configuration to connect external pulse cloud services.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return splitProxyConfiguration
   */
  @VsoMethod
  public ProxyConfiguration getSplitProxyConfiguration() {
    return splitProxyConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Split proxy configuration to connect external pulse cloud services.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param splitProxyConfiguration set the splitProxyConfiguration.
   */
  @VsoMethod
  public void setSplitProxyConfiguration(ProxyConfiguration splitProxyConfiguration) {
    this.splitProxyConfiguration = splitProxyConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant based configuration data.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantConfig
   */
  @VsoMethod
  public PulseServicesTenantConfig getTenantConfig() {
    return tenantConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant based configuration data.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantConfig set the tenantConfig.
   */
  @VsoMethod
  public void setTenantConfig(PulseServicesTenantConfig tenantConfig) {
    this.tenantConfig = tenantConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant uuid associated with the object.
   * It is a reference to an object of type tenant.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant uuid associated with the object.
   * It is a reference to an object of type tenant.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
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
   * By default, pulse cloud services uses proxy added in system configuration.
   * If it should use a separate proxy, set this flag to true and configure split proxy configuration.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useSplitProxy
   */
  @VsoMethod
  public Boolean getUseSplitProxy() {
    return useSplitProxy;
  }

  /**
   * This is the setter method to the attribute.
   * By default, pulse cloud services uses proxy added in system configuration.
   * If it should use a separate proxy, set this flag to true and configure split proxy configuration.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useSplitProxy set the useSplitProxy.
   */
  @VsoMethod
  public void setUseSplitProxy(Boolean  useSplitProxy) {
    this.useSplitProxy = useSplitProxy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Secure the controller to pulse cloud services communication over tls.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return useTls
   */
  @VsoMethod
  public Boolean getUseTls() {
    return useTls;
  }

  /**
   * This is the setter method to the attribute.
   * Secure the controller to pulse cloud services communication over tls.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param useTls set the useTls.
   */
  @VsoMethod
  public void setUseTls(Boolean  useTls) {
    this.useTls = useTls;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default values for user agent db service.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return userAgentDbConfig
   */
  @VsoMethod
  public UserAgentDBConfig getUserAgentDbConfig() {
    return userAgentDbConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Default values for user agent db service.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param userAgentDbConfig set the userAgentDbConfig.
   */
  @VsoMethod
  public void setUserAgentDbConfig(UserAgentDBConfig userAgentDbConfig) {
    this.userAgentDbConfig = userAgentDbConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
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
   * Field introduced in 18.2.6.
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
   * Default values for waf management.
   * Field introduced in 21.1.1.
   * Allowed in essentials edition with any value, basic edition with any value, enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return wafConfig
   */
  @VsoMethod
  public WafCrsConfig getWafConfig() {
    return wafConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Default values for waf management.
   * Field introduced in 21.1.1.
   * Allowed in essentials edition with any value, basic edition with any value, enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param wafConfig set the wafConfig.
   */
  @VsoMethod
  public void setWafConfig(WafCrsConfig wafConfig) {
    this.wafConfig = wafConfig;
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
  ALBServicesConfig objALBServicesConfig = (ALBServicesConfig) o;
  return   Objects.equals(this.uuid, objALBServicesConfig.uuid)&&
  Objects.equals(this.portalUrl, objALBServicesConfig.portalUrl)&&
  Objects.equals(this.pollingInterval, objALBServicesConfig.pollingInterval)&&
  Objects.equals(this.assetContact, objALBServicesConfig.assetContact)&&
  Objects.equals(this.featureOptInStatus, objALBServicesConfig.featureOptInStatus)&&
  Objects.equals(this.useSplitProxy, objALBServicesConfig.useSplitProxy)&&
  Objects.equals(this.splitProxyConfiguration, objALBServicesConfig.splitProxyConfiguration)&&
  Objects.equals(this.ipReputationConfig, objALBServicesConfig.ipReputationConfig)&&
  Objects.equals(this.useTls, objALBServicesConfig.useTls)&&
  Objects.equals(this.mode, objALBServicesConfig.mode)&&
  Objects.equals(this.appSignatureConfig, objALBServicesConfig.appSignatureConfig)&&
  Objects.equals(this.userAgentDbConfig, objALBServicesConfig.userAgentDbConfig)&&
  Objects.equals(this.wafConfig, objALBServicesConfig.wafConfig)&&
  Objects.equals(this.caseConfig, objALBServicesConfig.caseConfig)&&
  Objects.equals(this.saasLicensingConfig, objALBServicesConfig.saasLicensingConfig)&&
  Objects.equals(this.operationsConfig, objALBServicesConfig.operationsConfig)&&
  Objects.equals(this.tenantRef, objALBServicesConfig.tenantRef)&&
  Objects.equals(this.name, objALBServicesConfig.name)&&
  Objects.equals(this.tenantConfig, objALBServicesConfig.tenantConfig)&&
  Objects.equals(this.sessionConfig, objALBServicesConfig.sessionConfig)&&
  Objects.equals(this.inventoryConfig, objALBServicesConfig.inventoryConfig);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ALBServicesConfig {\n");
      sb.append("    appSignatureConfig: ").append(toIndentedString(appSignatureConfig)).append("\n");
        sb.append("    assetContact: ").append(toIndentedString(assetContact)).append("\n");
        sb.append("    caseConfig: ").append(toIndentedString(caseConfig)).append("\n");
        sb.append("    featureOptInStatus: ").append(toIndentedString(featureOptInStatus)).append("\n");
        sb.append("    inventoryConfig: ").append(toIndentedString(inventoryConfig)).append("\n");
        sb.append("    ipReputationConfig: ").append(toIndentedString(ipReputationConfig)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operationsConfig: ").append(toIndentedString(operationsConfig)).append("\n");
        sb.append("    pollingInterval: ").append(toIndentedString(pollingInterval)).append("\n");
        sb.append("    portalUrl: ").append(toIndentedString(portalUrl)).append("\n");
        sb.append("    saasLicensingConfig: ").append(toIndentedString(saasLicensingConfig)).append("\n");
        sb.append("    sessionConfig: ").append(toIndentedString(sessionConfig)).append("\n");
        sb.append("    splitProxyConfiguration: ").append(toIndentedString(splitProxyConfiguration)).append("\n");
        sb.append("    tenantConfig: ").append(toIndentedString(tenantConfig)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    useSplitProxy: ").append(toIndentedString(useSplitProxy)).append("\n");
        sb.append("    useTls: ").append(toIndentedString(useTls)).append("\n");
        sb.append("    userAgentDbConfig: ").append(toIndentedString(userAgentDbConfig)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    wafConfig: ").append(toIndentedString(wafConfig)).append("\n");
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

