package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AdminAuthConfiguration;
import com.vmware.avi.vro.model.ControllerAnalyticsPolicy;
import com.vmware.avi.vro.model.DNSConfiguration;
import com.vmware.avi.vro.model.EmailConfiguration;
import com.vmware.avi.vro.model.TenantConfiguration;
import com.vmware.avi.vro.model.LinuxConfiguration;
import com.vmware.avi.vro.model.MgmtIpAccessControl;
import com.vmware.avi.vro.model.NTPConfiguration;
import com.vmware.avi.vro.model.PortalConfiguration;
import com.vmware.avi.vro.model.ProxyConfiguration;
import com.vmware.avi.vro.model.SecureChannelConfiguration;
import com.vmware.avi.vro.model.SnmpConfiguration;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SystemConfiguration is a POJO class extends AviRestResource that used for creating
 * SystemConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SystemConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_SYSTEMCONFIGURATION, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SystemConfiguration extends AviRestResource {
    @JsonProperty("admin_auth_configuration")
    @JsonInclude(Include.NON_NULL)
    private AdminAuthConfiguration adminAuthConfiguration;

    @JsonProperty("common_criteria_mode")
    @JsonInclude(Include.NON_NULL)
    private Boolean commonCriteriaMode = false;

    @JsonProperty("controller_analytics_policy")
    @JsonInclude(Include.NON_NULL)
    private ControllerAnalyticsPolicy controllerAnalyticsPolicy;

    @JsonProperty("default_license_tier")
    @JsonInclude(Include.NON_NULL)
    private String defaultLicenseTier;

    @JsonProperty("dns_configuration")
    @JsonInclude(Include.NON_NULL)
    private DNSConfiguration dnsConfiguration;

    @JsonProperty("dns_virtualservice_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> dnsVirtualserviceRefs;

    @JsonProperty("docker_mode")
    @JsonInclude(Include.NON_NULL)
    private Boolean dockerMode = false;

    @JsonProperty("email_configuration")
    @JsonInclude(Include.NON_NULL)
    private EmailConfiguration emailConfiguration;

    @JsonProperty("enable_cors")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableCors = false;

    @JsonProperty("enable_host_header_check")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableHostHeaderCheck = false;

    @JsonProperty("fips_mode")
    @JsonInclude(Include.NON_NULL)
    private Boolean fipsMode = false;

    @JsonProperty("global_tenant_config")
    @JsonInclude(Include.NON_NULL)
    private TenantConfiguration globalTenantConfig;

    @JsonProperty("host_key_algorithm_exclude")
    @JsonInclude(Include.NON_NULL)
    private String hostKeyAlgorithmExclude;

    @JsonProperty("kex_algorithm_exclude")
    @JsonInclude(Include.NON_NULL)
    private String kexAlgorithmExclude;

    @JsonProperty("linux_configuration")
    @JsonInclude(Include.NON_NULL)
    private LinuxConfiguration linuxConfiguration;

    @JsonProperty("mgmt_ip_access_control")
    @JsonInclude(Include.NON_NULL)
    private MgmtIpAccessControl mgmtIpAccessControl;

    @JsonProperty("ntp_configuration")
    @JsonInclude(Include.NON_NULL)
    private NTPConfiguration ntpConfiguration;

    @JsonProperty("portal_configuration")
    @JsonInclude(Include.NON_NULL)
    private PortalConfiguration portalConfiguration;

    @JsonProperty("proxy_configuration")
    @JsonInclude(Include.NON_NULL)
    private ProxyConfiguration proxyConfiguration;

    @JsonProperty("rekey_time_limit")
    @JsonInclude(Include.NON_NULL)
    private String rekeyTimeLimit = "none";

    @JsonProperty("rekey_volume_limit")
    @JsonInclude(Include.NON_NULL)
    private String rekeyVolumeLimit = "default";

    @JsonProperty("secure_channel_configuration")
    @JsonInclude(Include.NON_NULL)
    private SecureChannelConfiguration secureChannelConfiguration;

    @JsonProperty("snmp_configuration")
    @JsonInclude(Include.NON_NULL)
    private SnmpConfiguration snmpConfiguration;

    @JsonProperty("ssh_ciphers")
    @JsonInclude(Include.NON_NULL)
    private List<String> sshCiphers;

    @JsonProperty("ssh_hmacs")
    @JsonInclude(Include.NON_NULL)
    private List<String> sshHmacs;

    @JsonProperty("trusted_host_profiles_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> trustedHostProfilesRefs;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("welcome_workflow_complete")
    @JsonInclude(Include.NON_NULL)
    private Boolean welcomeWorkflowComplete = false;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return adminAuthConfiguration
   */
  @VsoMethod
  public AdminAuthConfiguration getAdminAuthConfiguration() {
    return adminAuthConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param adminAuthConfiguration set the adminAuthConfiguration.
   */
  @VsoMethod
  public void setAdminAuthConfiguration(AdminAuthConfiguration adminAuthConfiguration) {
    this.adminAuthConfiguration = adminAuthConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Common criteria mode's current state.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return commonCriteriaMode
   */
  @VsoMethod
  public Boolean getCommonCriteriaMode() {
    return commonCriteriaMode;
  }

  /**
   * This is the setter method to the attribute.
   * Common criteria mode's current state.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param commonCriteriaMode set the commonCriteriaMode.
   */
  @VsoMethod
  public void setCommonCriteriaMode(Boolean  commonCriteriaMode) {
    this.commonCriteriaMode = commonCriteriaMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Controller metrics event dynamic thresholds can be set here.
   * Controller_cpu_high and controller_mem_high evets can take configured dynamic thresholds.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerAnalyticsPolicy
   */
  @VsoMethod
  public ControllerAnalyticsPolicy getControllerAnalyticsPolicy() {
    return controllerAnalyticsPolicy;
  }

  /**
   * This is the setter method to the attribute.
   * Controller metrics event dynamic thresholds can be set here.
   * Controller_cpu_high and controller_mem_high evets can take configured dynamic thresholds.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerAnalyticsPolicy set the controllerAnalyticsPolicy.
   */
  @VsoMethod
  public void setControllerAnalyticsPolicy(ControllerAnalyticsPolicy controllerAnalyticsPolicy) {
    this.controllerAnalyticsPolicy = controllerAnalyticsPolicy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies the default license tier which would be used by new clouds.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Special default for essentials edition is essentials, basic edition is basic, enterprise is enterprise_with_cloud_services.
   * @return defaultLicenseTier
   */
  @VsoMethod
  public String getDefaultLicenseTier() {
    return defaultLicenseTier;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the default license tier which would be used by new clouds.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Special default for essentials edition is essentials, basic edition is basic, enterprise is enterprise_with_cloud_services.
   * @param defaultLicenseTier set the defaultLicenseTier.
   */
  @VsoMethod
  public void setDefaultLicenseTier(String  defaultLicenseTier) {
    this.defaultLicenseTier = defaultLicenseTier;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsConfiguration
   */
  @VsoMethod
  public DNSConfiguration getDnsConfiguration() {
    return dnsConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dnsConfiguration set the dnsConfiguration.
   */
  @VsoMethod
  public void setDnsConfiguration(DNSConfiguration dnsConfiguration) {
    this.dnsConfiguration = dnsConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dns virtualservices hosting fqdn records for applications across avi vantage.
   * If no virtualservices are provided, avi vantage will provide dns services for configured applications.
   * Switching back to avi vantage from dns virtualservices is not allowed.
   * It is a reference to an object of type virtualservice.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsVirtualserviceRefs
   */
  @VsoMethod
  public List<String> getDnsVirtualserviceRefs() {
    return dnsVirtualserviceRefs;
  }

  /**
   * This is the setter method. this will set the dnsVirtualserviceRefs
   * Dns virtualservices hosting fqdn records for applications across avi vantage.
   * If no virtualservices are provided, avi vantage will provide dns services for configured applications.
   * Switching back to avi vantage from dns virtualservices is not allowed.
   * It is a reference to an object of type virtualservice.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsVirtualserviceRefs
   */
  @VsoMethod
  public void setDnsVirtualserviceRefs(List<String>  dnsVirtualserviceRefs) {
    this.dnsVirtualserviceRefs = dnsVirtualserviceRefs;
  }

  /**
   * This is the setter method this will set the dnsVirtualserviceRefs
   * Dns virtualservices hosting fqdn records for applications across avi vantage.
   * If no virtualservices are provided, avi vantage will provide dns services for configured applications.
   * Switching back to avi vantage from dns virtualservices is not allowed.
   * It is a reference to an object of type virtualservice.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsVirtualserviceRefs
   */
  @VsoMethod
  public SystemConfiguration addDnsVirtualserviceRefsItem(String dnsVirtualserviceRefsItem) {
    if (this.dnsVirtualserviceRefs == null) {
      this.dnsVirtualserviceRefs = new ArrayList<String>();
    }
    this.dnsVirtualserviceRefs.add(dnsVirtualserviceRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return dockerMode
   */
  @VsoMethod
  public Boolean getDockerMode() {
    return dockerMode;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param dockerMode set the dockerMode.
   */
  @VsoMethod
  public void setDockerMode(Boolean  dockerMode) {
    this.dockerMode = dockerMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return emailConfiguration
   */
  @VsoMethod
  public EmailConfiguration getEmailConfiguration() {
    return emailConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param emailConfiguration set the emailConfiguration.
   */
  @VsoMethod
  public void setEmailConfiguration(EmailConfiguration emailConfiguration) {
    this.emailConfiguration = emailConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable cors header.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableCors
   */
  @VsoMethod
  public Boolean getEnableCors() {
    return enableCors;
  }

  /**
   * This is the setter method to the attribute.
   * Enable cors header.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableCors set the enableCors.
   */
  @VsoMethod
  public void setEnableCors(Boolean  enableCors) {
    this.enableCors = enableCors;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Host header check.
   * Field introduced in 22.1.7, 30.2.2, 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableHostHeaderCheck
   */
  @VsoMethod
  public Boolean getEnableHostHeaderCheck() {
    return enableHostHeaderCheck;
  }

  /**
   * This is the setter method to the attribute.
   * Host header check.
   * Field introduced in 22.1.7, 30.2.2, 31.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableHostHeaderCheck set the enableHostHeaderCheck.
   */
  @VsoMethod
  public void setEnableHostHeaderCheck(Boolean  enableHostHeaderCheck) {
    this.enableHostHeaderCheck = enableHostHeaderCheck;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Fips mode current state.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return fipsMode
   */
  @VsoMethod
  public Boolean getFipsMode() {
    return fipsMode;
  }

  /**
   * This is the setter method to the attribute.
   * Fips mode current state.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param fipsMode set the fipsMode.
   */
  @VsoMethod
  public void setFipsMode(Boolean  fipsMode) {
    this.fipsMode = fipsMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return globalTenantConfig
   */
  @VsoMethod
  public TenantConfiguration getGlobalTenantConfig() {
    return globalTenantConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param globalTenantConfig set the globalTenantConfig.
   */
  @VsoMethod
  public void setGlobalTenantConfig(TenantConfiguration globalTenantConfig) {
    this.globalTenantConfig = globalTenantConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Users can specify comma separated list of deprecated host key algorithm.if nothing is specified, all known algorithms provided by openssh will be
   * supported.this change could only apply on the controller node.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostKeyAlgorithmExclude
   */
  @VsoMethod
  public String getHostKeyAlgorithmExclude() {
    return hostKeyAlgorithmExclude;
  }

  /**
   * This is the setter method to the attribute.
   * Users can specify comma separated list of deprecated host key algorithm.if nothing is specified, all known algorithms provided by openssh will be
   * supported.this change could only apply on the controller node.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostKeyAlgorithmExclude set the hostKeyAlgorithmExclude.
   */
  @VsoMethod
  public void setHostKeyAlgorithmExclude(String  hostKeyAlgorithmExclude) {
    this.hostKeyAlgorithmExclude = hostKeyAlgorithmExclude;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Users can specify comma separated list of deprecated key exchange algorithm.if nothing is specified, all known algorithms provided by openssh
   * will be supported.this change could only apply on the controller node.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return kexAlgorithmExclude
   */
  @VsoMethod
  public String getKexAlgorithmExclude() {
    return kexAlgorithmExclude;
  }

  /**
   * This is the setter method to the attribute.
   * Users can specify comma separated list of deprecated key exchange algorithm.if nothing is specified, all known algorithms provided by openssh
   * will be supported.this change could only apply on the controller node.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param kexAlgorithmExclude set the kexAlgorithmExclude.
   */
  @VsoMethod
  public void setKexAlgorithmExclude(String  kexAlgorithmExclude) {
    this.kexAlgorithmExclude = kexAlgorithmExclude;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return linuxConfiguration
   */
  @VsoMethod
  public LinuxConfiguration getLinuxConfiguration() {
    return linuxConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param linuxConfiguration set the linuxConfiguration.
   */
  @VsoMethod
  public void setLinuxConfiguration(LinuxConfiguration linuxConfiguration) {
    this.linuxConfiguration = linuxConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure ip access control for controller to restrict open access.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mgmtIpAccessControl
   */
  @VsoMethod
  public MgmtIpAccessControl getMgmtIpAccessControl() {
    return mgmtIpAccessControl;
  }

  /**
   * This is the setter method to the attribute.
   * Configure ip access control for controller to restrict open access.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mgmtIpAccessControl set the mgmtIpAccessControl.
   */
  @VsoMethod
  public void setMgmtIpAccessControl(MgmtIpAccessControl mgmtIpAccessControl) {
    this.mgmtIpAccessControl = mgmtIpAccessControl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ntpConfiguration
   */
  @VsoMethod
  public NTPConfiguration getNtpConfiguration() {
    return ntpConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ntpConfiguration set the ntpConfiguration.
   */
  @VsoMethod
  public void setNtpConfiguration(NTPConfiguration ntpConfiguration) {
    this.ntpConfiguration = ntpConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return portalConfiguration
   */
  @VsoMethod
  public PortalConfiguration getPortalConfiguration() {
    return portalConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param portalConfiguration set the portalConfiguration.
   */
  @VsoMethod
  public void setPortalConfiguration(PortalConfiguration portalConfiguration) {
    this.portalConfiguration = portalConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return proxyConfiguration
   */
  @VsoMethod
  public ProxyConfiguration getProxyConfiguration() {
    return proxyConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param proxyConfiguration set the proxyConfiguration.
   */
  @VsoMethod
  public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
    this.proxyConfiguration = proxyConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Users can specify and update the time limit of rekeylimit in sshd_config.if nothing is specified, the default setting will be none.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "none".
   * @return rekeyTimeLimit
   */
  @VsoMethod
  public String getRekeyTimeLimit() {
    return rekeyTimeLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Users can specify and update the time limit of rekeylimit in sshd_config.if nothing is specified, the default setting will be none.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "none".
   * @param rekeyTimeLimit set the rekeyTimeLimit.
   */
  @VsoMethod
  public void setRekeyTimeLimit(String  rekeyTimeLimit) {
    this.rekeyTimeLimit = rekeyTimeLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Users can specify and update the size/volume limit of rekeylimit in sshd_config.if nothing is specified, the default setting will be default.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default".
   * @return rekeyVolumeLimit
   */
  @VsoMethod
  public String getRekeyVolumeLimit() {
    return rekeyVolumeLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Users can specify and update the size/volume limit of rekeylimit in sshd_config.if nothing is specified, the default setting will be default.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default".
   * @param rekeyVolumeLimit set the rekeyVolumeLimit.
   */
  @VsoMethod
  public void setRekeyVolumeLimit(String  rekeyVolumeLimit) {
    this.rekeyVolumeLimit = rekeyVolumeLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure secure channel properties.
   * Field introduced in 18.1.4, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return secureChannelConfiguration
   */
  @VsoMethod
  public SecureChannelConfiguration getSecureChannelConfiguration() {
    return secureChannelConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Configure secure channel properties.
   * Field introduced in 18.1.4, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param secureChannelConfiguration set the secureChannelConfiguration.
   */
  @VsoMethod
  public void setSecureChannelConfiguration(SecureChannelConfiguration secureChannelConfiguration) {
    this.secureChannelConfiguration = secureChannelConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return snmpConfiguration
   */
  @VsoMethod
  public SnmpConfiguration getSnmpConfiguration() {
    return snmpConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param snmpConfiguration set the snmpConfiguration.
   */
  @VsoMethod
  public void setSnmpConfiguration(SnmpConfiguration snmpConfiguration) {
    this.snmpConfiguration = snmpConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed ciphers list for ssh to the management interface on the controller and service engines.
   * If this is not specified, all the default ciphers are allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sshCiphers
   */
  @VsoMethod
  public List<String> getSshCiphers() {
    return sshCiphers;
  }

  /**
   * This is the setter method. this will set the sshCiphers
   * Allowed ciphers list for ssh to the management interface on the controller and service engines.
   * If this is not specified, all the default ciphers are allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sshCiphers
   */
  @VsoMethod
  public void setSshCiphers(List<String>  sshCiphers) {
    this.sshCiphers = sshCiphers;
  }

  /**
   * This is the setter method this will set the sshCiphers
   * Allowed ciphers list for ssh to the management interface on the controller and service engines.
   * If this is not specified, all the default ciphers are allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sshCiphers
   */
  @VsoMethod
  public SystemConfiguration addSshCiphersItem(String sshCiphersItem) {
    if (this.sshCiphers == null) {
      this.sshCiphers = new ArrayList<String>();
    }
    this.sshCiphers.add(sshCiphersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed hmac list for ssh to the management interface on the controller and service engines.
   * If this is not specified, all the default hmacs are allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sshHmacs
   */
  @VsoMethod
  public List<String> getSshHmacs() {
    return sshHmacs;
  }

  /**
   * This is the setter method. this will set the sshHmacs
   * Allowed hmac list for ssh to the management interface on the controller and service engines.
   * If this is not specified, all the default hmacs are allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sshHmacs
   */
  @VsoMethod
  public void setSshHmacs(List<String>  sshHmacs) {
    this.sshHmacs = sshHmacs;
  }

  /**
   * This is the setter method this will set the sshHmacs
   * Allowed hmac list for ssh to the management interface on the controller and service engines.
   * If this is not specified, all the default hmacs are allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sshHmacs
   */
  @VsoMethod
  public SystemConfiguration addSshHmacsItem(String sshHmacsItem) {
    if (this.sshHmacs == null) {
      this.sshHmacs = new ArrayList<String>();
    }
    this.sshHmacs.add(sshHmacsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Trusted host profiles for host header validation.
   * Only function when enable_host_header_check is set to true.
   * It is a reference to an object of type trustedhostprofile.
   * Field introduced in 22.1.7, 30.2.2, 31.1.1.
   * Maximum of 20 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return trustedHostProfilesRefs
   */
  @VsoMethod
  public List<String> getTrustedHostProfilesRefs() {
    return trustedHostProfilesRefs;
  }

  /**
   * This is the setter method. this will set the trustedHostProfilesRefs
   * Trusted host profiles for host header validation.
   * Only function when enable_host_header_check is set to true.
   * It is a reference to an object of type trustedhostprofile.
   * Field introduced in 22.1.7, 30.2.2, 31.1.1.
   * Maximum of 20 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return trustedHostProfilesRefs
   */
  @VsoMethod
  public void setTrustedHostProfilesRefs(List<String>  trustedHostProfilesRefs) {
    this.trustedHostProfilesRefs = trustedHostProfilesRefs;
  }

  /**
   * This is the setter method this will set the trustedHostProfilesRefs
   * Trusted host profiles for host header validation.
   * Only function when enable_host_header_check is set to true.
   * It is a reference to an object of type trustedhostprofile.
   * Field introduced in 22.1.7, 30.2.2, 31.1.1.
   * Maximum of 20 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return trustedHostProfilesRefs
   */
  @VsoMethod
  public SystemConfiguration addTrustedHostProfilesRefsItem(String trustedHostProfilesRefsItem) {
    if (this.trustedHostProfilesRefs == null) {
      this.trustedHostProfilesRefs = new ArrayList<String>();
    }
    this.trustedHostProfilesRefs.add(trustedHostProfilesRefsItem);
    return this;
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
   * This flag is set once the initial controller setup workflow is complete.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return welcomeWorkflowComplete
   */
  @VsoMethod
  public Boolean getWelcomeWorkflowComplete() {
    return welcomeWorkflowComplete;
  }

  /**
   * This is the setter method to the attribute.
   * This flag is set once the initial controller setup workflow is complete.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param welcomeWorkflowComplete set the welcomeWorkflowComplete.
   */
  @VsoMethod
  public void setWelcomeWorkflowComplete(Boolean  welcomeWorkflowComplete) {
    this.welcomeWorkflowComplete = welcomeWorkflowComplete;
  }


  public String getObjectID() {
    return "SystemConfiguration" + "(" + uuid + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SystemConfiguration objSystemConfiguration = (SystemConfiguration) o;
  return   Objects.equals(this.uuid, objSystemConfiguration.uuid)&&
  Objects.equals(this.dnsConfiguration, objSystemConfiguration.dnsConfiguration)&&
  Objects.equals(this.ntpConfiguration, objSystemConfiguration.ntpConfiguration)&&
  Objects.equals(this.portalConfiguration, objSystemConfiguration.portalConfiguration)&&
  Objects.equals(this.globalTenantConfig, objSystemConfiguration.globalTenantConfig)&&
  Objects.equals(this.emailConfiguration, objSystemConfiguration.emailConfiguration)&&
  Objects.equals(this.adminAuthConfiguration, objSystemConfiguration.adminAuthConfiguration)&&
  Objects.equals(this.dockerMode, objSystemConfiguration.dockerMode)&&
  Objects.equals(this.snmpConfiguration, objSystemConfiguration.snmpConfiguration)&&
  Objects.equals(this.linuxConfiguration, objSystemConfiguration.linuxConfiguration)&&
  Objects.equals(this.proxyConfiguration, objSystemConfiguration.proxyConfiguration)&&
  Objects.equals(this.mgmtIpAccessControl, objSystemConfiguration.mgmtIpAccessControl)&&
  Objects.equals(this.sshCiphers, objSystemConfiguration.sshCiphers)&&
  Objects.equals(this.sshHmacs, objSystemConfiguration.sshHmacs)&&
  Objects.equals(this.dnsVirtualserviceRefs, objSystemConfiguration.dnsVirtualserviceRefs)&&
  Objects.equals(this.defaultLicenseTier, objSystemConfiguration.defaultLicenseTier)&&
  Objects.equals(this.secureChannelConfiguration, objSystemConfiguration.secureChannelConfiguration)&&
  Objects.equals(this.welcomeWorkflowComplete, objSystemConfiguration.welcomeWorkflowComplete)&&
  Objects.equals(this.fipsMode, objSystemConfiguration.fipsMode)&&
  Objects.equals(this.enableCors, objSystemConfiguration.enableCors)&&
  Objects.equals(this.commonCriteriaMode, objSystemConfiguration.commonCriteriaMode)&&
  Objects.equals(this.controllerAnalyticsPolicy, objSystemConfiguration.controllerAnalyticsPolicy)&&
  Objects.equals(this.hostKeyAlgorithmExclude, objSystemConfiguration.hostKeyAlgorithmExclude)&&
  Objects.equals(this.kexAlgorithmExclude, objSystemConfiguration.kexAlgorithmExclude)&&
  Objects.equals(this.rekeyVolumeLimit, objSystemConfiguration.rekeyVolumeLimit)&&
  Objects.equals(this.rekeyTimeLimit, objSystemConfiguration.rekeyTimeLimit)&&
  Objects.equals(this.enableHostHeaderCheck, objSystemConfiguration.enableHostHeaderCheck)&&
  Objects.equals(this.trustedHostProfilesRefs, objSystemConfiguration.trustedHostProfilesRefs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SystemConfiguration {\n");
      sb.append("    adminAuthConfiguration: ").append(toIndentedString(adminAuthConfiguration)).append("\n");
        sb.append("    commonCriteriaMode: ").append(toIndentedString(commonCriteriaMode)).append("\n");
        sb.append("    controllerAnalyticsPolicy: ").append(toIndentedString(controllerAnalyticsPolicy)).append("\n");
        sb.append("    defaultLicenseTier: ").append(toIndentedString(defaultLicenseTier)).append("\n");
        sb.append("    dnsConfiguration: ").append(toIndentedString(dnsConfiguration)).append("\n");
        sb.append("    dnsVirtualserviceRefs: ").append(toIndentedString(dnsVirtualserviceRefs)).append("\n");
        sb.append("    dockerMode: ").append(toIndentedString(dockerMode)).append("\n");
        sb.append("    emailConfiguration: ").append(toIndentedString(emailConfiguration)).append("\n");
        sb.append("    enableCors: ").append(toIndentedString(enableCors)).append("\n");
        sb.append("    enableHostHeaderCheck: ").append(toIndentedString(enableHostHeaderCheck)).append("\n");
        sb.append("    fipsMode: ").append(toIndentedString(fipsMode)).append("\n");
        sb.append("    globalTenantConfig: ").append(toIndentedString(globalTenantConfig)).append("\n");
        sb.append("    hostKeyAlgorithmExclude: ").append(toIndentedString(hostKeyAlgorithmExclude)).append("\n");
        sb.append("    kexAlgorithmExclude: ").append(toIndentedString(kexAlgorithmExclude)).append("\n");
        sb.append("    linuxConfiguration: ").append(toIndentedString(linuxConfiguration)).append("\n");
        sb.append("    mgmtIpAccessControl: ").append(toIndentedString(mgmtIpAccessControl)).append("\n");
        sb.append("    ntpConfiguration: ").append(toIndentedString(ntpConfiguration)).append("\n");
        sb.append("    portalConfiguration: ").append(toIndentedString(portalConfiguration)).append("\n");
        sb.append("    proxyConfiguration: ").append(toIndentedString(proxyConfiguration)).append("\n");
        sb.append("    rekeyTimeLimit: ").append(toIndentedString(rekeyTimeLimit)).append("\n");
        sb.append("    rekeyVolumeLimit: ").append(toIndentedString(rekeyVolumeLimit)).append("\n");
        sb.append("    secureChannelConfiguration: ").append(toIndentedString(secureChannelConfiguration)).append("\n");
        sb.append("    snmpConfiguration: ").append(toIndentedString(snmpConfiguration)).append("\n");
        sb.append("    sshCiphers: ").append(toIndentedString(sshCiphers)).append("\n");
        sb.append("    sshHmacs: ").append(toIndentedString(sshHmacs)).append("\n");
        sb.append("    trustedHostProfilesRefs: ").append(toIndentedString(trustedHostProfilesRefs)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    welcomeWorkflowComplete: ").append(toIndentedString(welcomeWorkflowComplete)).append("\n");
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

