package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AwsConfiguration;
import com.vmware.avi.vro.model.AzureConfiguration;
import com.vmware.avi.vro.model.CloudStackConfiguration;
import com.vmware.avi.vro.model.DockerConfiguration;
import com.vmware.avi.vro.model.GCPConfiguration;
import com.vmware.avi.vro.model.LinuxServerConfiguration;
import com.vmware.avi.vro.model.NsxtConfiguration;
import com.vmware.avi.vro.model.NTPConfiguration;
import com.vmware.avi.vro.model.OpenStackConfiguration;
import com.vmware.avi.vro.model.ProxyConfiguration;
import com.vmware.avi.vro.model.RancherConfiguration;
import com.vmware.avi.vro.model.vCloudAirConfiguration;
import com.vmware.avi.vro.model.vCenterConfiguration;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The Cloud is a POJO class extends AviRestResource that used for creating
 * Cloud.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Cloud")
@VsoFinder(name = Constants.FINDER_VRO_CLOUD, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Cloud extends AviRestResource {
    @JsonProperty("autoscale_polling_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer autoscalePollingInterval = 60;

    @JsonProperty("aws_configuration")
    @JsonInclude(Include.NON_NULL)
    private AwsConfiguration awsConfiguration = null;

    @JsonProperty("azure_configuration")
    @JsonInclude(Include.NON_NULL)
    private AzureConfiguration azureConfiguration = null;

    @JsonProperty("cloudstack_configuration")
    @JsonInclude(Include.NON_NULL)
    private CloudStackConfiguration cloudstackConfiguration = null;

    @JsonProperty("custom_tags")
    @JsonInclude(Include.NON_NULL)
    private List<CustomTag> customTags = null;

    @JsonProperty("dhcp_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean dhcpEnabled = false;

    @JsonProperty("dns_provider_ref")
    @JsonInclude(Include.NON_NULL)
    private String dnsProviderRef = null;

    @JsonProperty("dns_resolution_on_se")
    @JsonInclude(Include.NON_NULL)
    private Boolean dnsResolutionOnSe = false;

    @JsonProperty("dns_resolvers")
    @JsonInclude(Include.NON_NULL)
    private List<DnsResolver> dnsResolvers = null;

    @JsonProperty("docker_configuration")
    @JsonInclude(Include.NON_NULL)
    private DockerConfiguration dockerConfiguration = null;

    @JsonProperty("east_west_dns_provider_ref")
    @JsonInclude(Include.NON_NULL)
    private String eastWestDnsProviderRef = null;

    @JsonProperty("east_west_ipam_provider_ref")
    @JsonInclude(Include.NON_NULL)
    private String eastWestIpamProviderRef = null;

    @JsonProperty("enable_vip_on_all_interfaces")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableVipOnAllInterfaces = false;

    @JsonProperty("enable_vip_static_routes")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableVipStaticRoutes = false;

    @JsonProperty("gcp_configuration")
    @JsonInclude(Include.NON_NULL)
    private GCPConfiguration gcpConfiguration = null;

    @JsonProperty("ip6_autocfg_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean ip6AutocfgEnabled = false;

    @JsonProperty("ipam_provider_ref")
    @JsonInclude(Include.NON_NULL)
    private String ipamProviderRef = null;

    @JsonProperty("license_tier")
    @JsonInclude(Include.NON_NULL)
    private String licenseTier = null;

    @JsonProperty("license_type")
    @JsonInclude(Include.NON_NULL)
    private String licenseType = null;

    @JsonProperty("linuxserver_configuration")
    @JsonInclude(Include.NON_NULL)
    private LinuxServerConfiguration linuxserverConfiguration = null;

    @JsonProperty("maintenance_mode")
    @JsonInclude(Include.NON_NULL)
    private Boolean maintenanceMode = false;

    @JsonProperty("markers")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markers = null;

    @JsonProperty("metrics_polling_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer metricsPollingInterval = 300;

    @JsonProperty("mtu")
    @JsonInclude(Include.NON_NULL)
    private Integer mtu = 1500;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("nsxt_configuration")
    @JsonInclude(Include.NON_NULL)
    private NsxtConfiguration nsxtConfiguration = null;

    @JsonProperty("ntp_configuration")
    @JsonInclude(Include.NON_NULL)
    private NTPConfiguration ntpConfiguration = null;

    @JsonProperty("obj_name_prefix")
    @JsonInclude(Include.NON_NULL)
    private String objNamePrefix = null;

    @JsonProperty("openstack_configuration")
    @JsonInclude(Include.NON_NULL)
    private OpenStackConfiguration openstackConfiguration = null;

    @JsonProperty("prefer_static_routes")
    @JsonInclude(Include.NON_NULL)
    private Boolean preferStaticRoutes = false;

    @JsonProperty("proxy_configuration")
    @JsonInclude(Include.NON_NULL)
    private ProxyConfiguration proxyConfiguration = null;

    @JsonProperty("rancher_configuration")
    @JsonInclude(Include.NON_NULL)
    private RancherConfiguration rancherConfiguration = null;

    @JsonProperty("se_group_template_ref")
    @JsonInclude(Include.NON_NULL)
    private String seGroupTemplateRef = null;

    @JsonProperty("state_based_dns_registration")
    @JsonInclude(Include.NON_NULL)
    private Boolean stateBasedDnsRegistration = true;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;

    @JsonProperty("vca_configuration")
    @JsonInclude(Include.NON_NULL)
    private vCloudAirConfiguration vcaConfiguration = null;

    @JsonProperty("vcenter_configuration")
    @JsonInclude(Include.NON_NULL)
    private vCenterConfiguration vcenterConfiguration = null;

    @JsonProperty("vmc_deployment")
    @JsonInclude(Include.NON_NULL)
    private Boolean vmcDeployment = false;

    @JsonProperty("vtype")
    @JsonInclude(Include.NON_NULL)
    private String vtype = "CLOUD_NONE";



  /**
   * This is the getter method this will return the attribute value.
   * Cloudconnector polling interval in seconds for external autoscale groups, minimum 60 seconds.
   * Allowed values are 60-3600.
   * Field introduced in 18.2.2.
   * Unit is seconds.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 60), basic edition(allowed values- 60), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return autoscalePollingInterval
   */
  @VsoMethod
  public Integer getAutoscalePollingInterval() {
    return autoscalePollingInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Cloudconnector polling interval in seconds for external autoscale groups, minimum 60 seconds.
   * Allowed values are 60-3600.
   * Field introduced in 18.2.2.
   * Unit is seconds.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 60), basic edition(allowed values- 60), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param autoscalePollingInterval set the autoscalePollingInterval.
   */
  @VsoMethod
  public void setAutoscalePollingInterval(Integer  autoscalePollingInterval) {
    this.autoscalePollingInterval = autoscalePollingInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return awsConfiguration
   */
  @VsoMethod
  public AwsConfiguration getAwsConfiguration() {
    return awsConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param awsConfiguration set the awsConfiguration.
   */
  @VsoMethod
  public void setAwsConfiguration(AwsConfiguration awsConfiguration) {
    this.awsConfiguration = awsConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return azureConfiguration
   */
  @VsoMethod
  public AzureConfiguration getAzureConfiguration() {
    return azureConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param azureConfiguration set the azureConfiguration.
   */
  @VsoMethod
  public void setAzureConfiguration(AzureConfiguration azureConfiguration) {
    this.azureConfiguration = azureConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudstackConfiguration
   */
  @VsoMethod
  public CloudStackConfiguration getCloudstackConfiguration() {
    return cloudstackConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudstackConfiguration set the cloudstackConfiguration.
   */
  @VsoMethod
  public void setCloudstackConfiguration(CloudStackConfiguration cloudstackConfiguration) {
    this.cloudstackConfiguration = cloudstackConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Custom tags for all avi created resources in the cloud infrastructure.
   * Field introduced in 17.1.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return customTags
   */
  @VsoMethod
  public List<CustomTag> getCustomTags() {
    return customTags;
  }

  /**
   * This is the setter method. this will set the customTags
   * Custom tags for all avi created resources in the cloud infrastructure.
   * Field introduced in 17.1.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return customTags
   */
  @VsoMethod
  public void setCustomTags(List<CustomTag>  customTags) {
    this.customTags = customTags;
  }

  /**
   * This is the setter method this will set the customTags
   * Custom tags for all avi created resources in the cloud infrastructure.
   * Field introduced in 17.1.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return customTags
   */
  @VsoMethod
  public Cloud addCustomTagsItem(CustomTag customTagsItem) {
    if (this.customTags == null) {
      this.customTags = new ArrayList<CustomTag>();
    }
    this.customTags.add(customTagsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Select the ip address management scheme.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return dhcpEnabled
   */
  @VsoMethod
  public Boolean getDhcpEnabled() {
    return dhcpEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Select the ip address management scheme.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param dhcpEnabled set the dhcpEnabled.
   */
  @VsoMethod
  public void setDhcpEnabled(Boolean  dhcpEnabled) {
    this.dhcpEnabled = dhcpEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dns profile for the cloud.
   * It is a reference to an object of type ipamdnsproviderprofile.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsProviderRef
   */
  @VsoMethod
  public String getDnsProviderRef() {
    return dnsProviderRef;
  }

  /**
   * This is the setter method to the attribute.
   * Dns profile for the cloud.
   * It is a reference to an object of type ipamdnsproviderprofile.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dnsProviderRef set the dnsProviderRef.
   */
  @VsoMethod
  public void setDnsProviderRef(String  dnsProviderRef) {
    this.dnsProviderRef = dnsProviderRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * By default, pool member fqdns are resolved on the controller.
   * When this is set, pool member fqdns are instead resolved on service engines in this cloud.
   * This is useful in scenarios where pool member fqdns can only be resolved from service engines and not from the controller.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return dnsResolutionOnSe
   */
  @VsoMethod
  public Boolean getDnsResolutionOnSe() {
    return dnsResolutionOnSe;
  }

  /**
   * This is the setter method to the attribute.
   * By default, pool member fqdns are resolved on the controller.
   * When this is set, pool member fqdns are instead resolved on service engines in this cloud.
   * This is useful in scenarios where pool member fqdns can only be resolved from service engines and not from the controller.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param dnsResolutionOnSe set the dnsResolutionOnSe.
   */
  @VsoMethod
  public void setDnsResolutionOnSe(Boolean  dnsResolutionOnSe) {
    this.dnsResolutionOnSe = dnsResolutionOnSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dns resolver for the cloud.
   * Field introduced in 20.1.5.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsResolvers
   */
  @VsoMethod
  public List<DnsResolver> getDnsResolvers() {
    return dnsResolvers;
  }

  /**
   * This is the setter method. this will set the dnsResolvers
   * Dns resolver for the cloud.
   * Field introduced in 20.1.5.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsResolvers
   */
  @VsoMethod
  public void setDnsResolvers(List<DnsResolver>  dnsResolvers) {
    this.dnsResolvers = dnsResolvers;
  }

  /**
   * This is the setter method this will set the dnsResolvers
   * Dns resolver for the cloud.
   * Field introduced in 20.1.5.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsResolvers
   */
  @VsoMethod
  public Cloud addDnsResolversItem(DnsResolver dnsResolversItem) {
    if (this.dnsResolvers == null) {
      this.dnsResolvers = new ArrayList<DnsResolver>();
    }
    this.dnsResolvers.add(dnsResolversItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dockerConfiguration
   */
  @VsoMethod
  public DockerConfiguration getDockerConfiguration() {
    return dockerConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dockerConfiguration set the dockerConfiguration.
   */
  @VsoMethod
  public void setDockerConfiguration(DockerConfiguration dockerConfiguration) {
    this.dockerConfiguration = dockerConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dns profile for east-west services.
   * It is a reference to an object of type ipamdnsproviderprofile.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eastWestDnsProviderRef
   */
  @VsoMethod
  public String getEastWestDnsProviderRef() {
    return eastWestDnsProviderRef;
  }

  /**
   * This is the setter method to the attribute.
   * Dns profile for east-west services.
   * It is a reference to an object of type ipamdnsproviderprofile.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param eastWestDnsProviderRef set the eastWestDnsProviderRef.
   */
  @VsoMethod
  public void setEastWestDnsProviderRef(String  eastWestDnsProviderRef) {
    this.eastWestDnsProviderRef = eastWestDnsProviderRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipam profile for east-west services.
   * Warning - please use virtual subnets in this ipam profile that do not conflict with the underlay networks or any overlay networks in the cluster.
   * For example in aws and gcp, 169.254.0.0/16 is used for storing instance metadata.
   * Hence, it should not be used in this profile.
   * It is a reference to an object of type ipamdnsproviderprofile.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eastWestIpamProviderRef
   */
  @VsoMethod
  public String getEastWestIpamProviderRef() {
    return eastWestIpamProviderRef;
  }

  /**
   * This is the setter method to the attribute.
   * Ipam profile for east-west services.
   * Warning - please use virtual subnets in this ipam profile that do not conflict with the underlay networks or any overlay networks in the cluster.
   * For example in aws and gcp, 169.254.0.0/16 is used for storing instance metadata.
   * Hence, it should not be used in this profile.
   * It is a reference to an object of type ipamdnsproviderprofile.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param eastWestIpamProviderRef set the eastWestIpamProviderRef.
   */
  @VsoMethod
  public void setEastWestIpamProviderRef(String  eastWestIpamProviderRef) {
    this.eastWestIpamProviderRef = eastWestIpamProviderRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable vip on all data interfaces for the cloud.
   * Field introduced in 18.2.9, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableVipOnAllInterfaces
   */
  @VsoMethod
  public Boolean getEnableVipOnAllInterfaces() {
    return enableVipOnAllInterfaces;
  }

  /**
   * This is the setter method to the attribute.
   * Enable vip on all data interfaces for the cloud.
   * Field introduced in 18.2.9, 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableVipOnAllInterfaces set the enableVipOnAllInterfaces.
   */
  @VsoMethod
  public void setEnableVipOnAllInterfaces(Boolean  enableVipOnAllInterfaces) {
    this.enableVipOnAllInterfaces = enableVipOnAllInterfaces;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use static routes for vip side network resolution during virtualservice placement.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableVipStaticRoutes
   */
  @VsoMethod
  public Boolean getEnableVipStaticRoutes() {
    return enableVipStaticRoutes;
  }

  /**
   * This is the setter method to the attribute.
   * Use static routes for vip side network resolution during virtualservice placement.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableVipStaticRoutes set the enableVipStaticRoutes.
   */
  @VsoMethod
  public void setEnableVipStaticRoutes(Boolean  enableVipStaticRoutes) {
    this.enableVipStaticRoutes = enableVipStaticRoutes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Google cloud platform configuration.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gcpConfiguration
   */
  @VsoMethod
  public GCPConfiguration getGcpConfiguration() {
    return gcpConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Google cloud platform configuration.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gcpConfiguration set the gcpConfiguration.
   */
  @VsoMethod
  public void setGcpConfiguration(GCPConfiguration gcpConfiguration) {
    this.gcpConfiguration = gcpConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable ipv6 auto configuration.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return ip6AutocfgEnabled
   */
  @VsoMethod
  public Boolean getIp6AutocfgEnabled() {
    return ip6AutocfgEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable ipv6 auto configuration.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param ip6AutocfgEnabled set the ip6AutocfgEnabled.
   */
  @VsoMethod
  public void setIp6AutocfgEnabled(Boolean  ip6AutocfgEnabled) {
    this.ip6AutocfgEnabled = ip6AutocfgEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ipam profile for the cloud.
   * It is a reference to an object of type ipamdnsproviderprofile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipamProviderRef
   */
  @VsoMethod
  public String getIpamProviderRef() {
    return ipamProviderRef;
  }

  /**
   * This is the setter method to the attribute.
   * Ipam profile for the cloud.
   * It is a reference to an object of type ipamdnsproviderprofile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipamProviderRef set the ipamProviderRef.
   */
  @VsoMethod
  public void setIpamProviderRef(String  ipamProviderRef) {
    this.ipamProviderRef = ipamProviderRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies the default license tier which would be used by new se groups.
   * This field by default inherits the value from system configuration.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return licenseTier
   */
  @VsoMethod
  public String getLicenseTier() {
    return licenseTier;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the default license tier which would be used by new se groups.
   * This field by default inherits the value from system configuration.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param licenseTier set the licenseTier.
   */
  @VsoMethod
  public void setLicenseTier(String  licenseTier) {
    this.licenseTier = licenseTier;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If no license type is specified then default license enforcement for the cloud type is chosen.
   * The default mappings are container cloud is max ses, openstack and vmware is cores and linux it is sockets.
   * Enum options - LIC_BACKEND_SERVERS, LIC_SOCKETS, LIC_CORES, LIC_HOSTS, LIC_SE_BANDWIDTH, LIC_METERED_SE_BANDWIDTH.
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
   * If no license type is specified then default license enforcement for the cloud type is chosen.
   * The default mappings are container cloud is max ses, openstack and vmware is cores and linux it is sockets.
   * Enum options - LIC_BACKEND_SERVERS, LIC_SOCKETS, LIC_CORES, LIC_HOSTS, LIC_SE_BANDWIDTH, LIC_METERED_SE_BANDWIDTH.
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
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return linuxserverConfiguration
   */
  @VsoMethod
  public LinuxServerConfiguration getLinuxserverConfiguration() {
    return linuxserverConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param linuxserverConfiguration set the linuxserverConfiguration.
   */
  @VsoMethod
  public void setLinuxserverConfiguration(LinuxServerConfiguration linuxserverConfiguration) {
    this.linuxserverConfiguration = linuxserverConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloud is in maintenance mode.
   * Field introduced in 20.1.7,21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return maintenanceMode
   */
  @VsoMethod
  public Boolean getMaintenanceMode() {
    return maintenanceMode;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud is in maintenance mode.
   * Field introduced in 20.1.7,21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param maintenanceMode set the maintenanceMode.
   */
  @VsoMethod
  public void setMaintenanceMode(Boolean  maintenanceMode) {
    this.maintenanceMode = maintenanceMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of labels to be used for granular rbac.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public List<RoleFilterMatchLabel> getMarkers() {
    return markers;
  }

  /**
   * This is the setter method. this will set the markers
   * List of labels to be used for granular rbac.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public void setMarkers(List<RoleFilterMatchLabel>  markers) {
    this.markers = markers;
  }

  /**
   * This is the setter method this will set the markers
   * List of labels to be used for granular rbac.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public Cloud addMarkersItem(RoleFilterMatchLabel markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<RoleFilterMatchLabel>();
    }
    this.markers.add(markersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Cloud metrics collector polling interval in seconds.
   * Field introduced in 22.1.1.
   * Unit is seconds.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return metricsPollingInterval
   */
  @VsoMethod
  public Integer getMetricsPollingInterval() {
    return metricsPollingInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud metrics collector polling interval in seconds.
   * Field introduced in 22.1.1.
   * Unit is seconds.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param metricsPollingInterval set the metricsPollingInterval.
   */
  @VsoMethod
  public void setMetricsPollingInterval(Integer  metricsPollingInterval) {
    this.metricsPollingInterval = metricsPollingInterval;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mtu setting for the cloud.
   * Unit is bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1500.
   * @return mtu
   */
  @VsoMethod
  public Integer getMtu() {
    return mtu;
  }

  /**
   * This is the setter method to the attribute.
   * Mtu setting for the cloud.
   * Unit is bytes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1500.
   * @param mtu set the mtu.
   */
  @VsoMethod
  public void setMtu(Integer  mtu) {
    this.mtu = mtu;
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
   * Nsx-t cloud platform configuration.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nsxtConfiguration
   */
  @VsoMethod
  public NsxtConfiguration getNsxtConfiguration() {
    return nsxtConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Nsx-t cloud platform configuration.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nsxtConfiguration set the nsxtConfiguration.
   */
  @VsoMethod
  public void setNsxtConfiguration(NsxtConfiguration nsxtConfiguration) {
    this.nsxtConfiguration = nsxtConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ntp configuration for the cloud.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ntpConfiguration
   */
  @VsoMethod
  public NTPConfiguration getNtpConfiguration() {
    return ntpConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Ntp configuration for the cloud.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ntpConfiguration set the ntpConfiguration.
   */
  @VsoMethod
  public void setNtpConfiguration(NTPConfiguration ntpConfiguration) {
    this.ntpConfiguration = ntpConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default prefix for all automatically created objects in this cloud.
   * This prefix can be overridden by the se-group template.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objNamePrefix
   */
  @VsoMethod
  public String getObjNamePrefix() {
    return objNamePrefix;
  }

  /**
   * This is the setter method to the attribute.
   * Default prefix for all automatically created objects in this cloud.
   * This prefix can be overridden by the se-group template.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objNamePrefix set the objNamePrefix.
   */
  @VsoMethod
  public void setObjNamePrefix(String  objNamePrefix) {
    this.objNamePrefix = objNamePrefix;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return openstackConfiguration
   */
  @VsoMethod
  public OpenStackConfiguration getOpenstackConfiguration() {
    return openstackConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param openstackConfiguration set the openstackConfiguration.
   */
  @VsoMethod
  public void setOpenstackConfiguration(OpenStackConfiguration openstackConfiguration) {
    this.openstackConfiguration = openstackConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Prefer static routes over interface routes during virtualservice placement.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return preferStaticRoutes
   */
  @VsoMethod
  public Boolean getPreferStaticRoutes() {
    return preferStaticRoutes;
  }

  /**
   * This is the setter method to the attribute.
   * Prefer static routes over interface routes during virtualservice placement.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param preferStaticRoutes set the preferStaticRoutes.
   */
  @VsoMethod
  public void setPreferStaticRoutes(Boolean  preferStaticRoutes) {
    this.preferStaticRoutes = preferStaticRoutes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return proxyConfiguration
   */
  @VsoMethod
  public ProxyConfiguration getProxyConfiguration() {
    return proxyConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param proxyConfiguration set the proxyConfiguration.
   */
  @VsoMethod
  public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
    this.proxyConfiguration = proxyConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rancherConfiguration
   */
  @VsoMethod
  public RancherConfiguration getRancherConfiguration() {
    return rancherConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rancherConfiguration set the rancherConfiguration.
   */
  @VsoMethod
  public void setRancherConfiguration(RancherConfiguration rancherConfiguration) {
    this.rancherConfiguration = rancherConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The service engine group to use as template.
   * It is a reference to an object of type serviceenginegroup.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupTemplateRef
   */
  @VsoMethod
  public String getSeGroupTemplateRef() {
    return seGroupTemplateRef;
  }

  /**
   * This is the setter method to the attribute.
   * The service engine group to use as template.
   * It is a reference to an object of type serviceenginegroup.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGroupTemplateRef set the seGroupTemplateRef.
   */
  @VsoMethod
  public void setSeGroupTemplateRef(String  seGroupTemplateRef) {
    this.seGroupTemplateRef = seGroupTemplateRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dns records for vips are added/deleted based on the operational state of the vips.
   * Field introduced in 17.1.12.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return stateBasedDnsRegistration
   */
  @VsoMethod
  public Boolean getStateBasedDnsRegistration() {
    return stateBasedDnsRegistration;
  }

  /**
   * This is the setter method to the attribute.
   * Dns records for vips are added/deleted based on the operational state of the vips.
   * Field introduced in 17.1.12.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param stateBasedDnsRegistration set the stateBasedDnsRegistration.
   */
  @VsoMethod
  public void setStateBasedDnsRegistration(Boolean  stateBasedDnsRegistration) {
    this.stateBasedDnsRegistration = stateBasedDnsRegistration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcaConfiguration
   */
  @VsoMethod
  public vCloudAirConfiguration getVcaConfiguration() {
    return vcaConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcaConfiguration set the vcaConfiguration.
   */
  @VsoMethod
  public void setVcaConfiguration(vCloudAirConfiguration vcaConfiguration) {
    this.vcaConfiguration = vcaConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcenterConfiguration
   */
  @VsoMethod
  public vCenterConfiguration getVcenterConfiguration() {
    return vcenterConfiguration;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcenterConfiguration set the vcenterConfiguration.
   */
  @VsoMethod
  public void setVcenterConfiguration(vCenterConfiguration vcenterConfiguration) {
    this.vcenterConfiguration = vcenterConfiguration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This deployment is vmware on aws cloud.
   * Field introduced in 20.1.5, 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return vmcDeployment
   */
  @VsoMethod
  public Boolean getVmcDeployment() {
    return vmcDeployment;
  }

  /**
   * This is the setter method to the attribute.
   * This deployment is vmware on aws cloud.
   * Field introduced in 20.1.5, 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param vmcDeployment set the vmcDeployment.
   */
  @VsoMethod
  public void setVmcDeployment(Boolean  vmcDeployment) {
    this.vmcDeployment = vmcDeployment;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloud type.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- cloud_none,cloud_vcenter), basic edition(allowed values-
   * cloud_none,cloud_nsxt), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "CLOUD_NONE".
   * @return vtype
   */
  @VsoMethod
  public String getVtype() {
    return vtype;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud type.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- cloud_none,cloud_vcenter), basic edition(allowed values-
   * cloud_none,cloud_nsxt), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "CLOUD_NONE".
   * @param vtype set the vtype.
   */
  @VsoMethod
  public void setVtype(String  vtype) {
    this.vtype = vtype;
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
  Cloud objCloud = (Cloud) o;
  return   Objects.equals(this.uuid, objCloud.uuid)&&
  Objects.equals(this.name, objCloud.name)&&
  Objects.equals(this.vtype, objCloud.vtype)&&
  Objects.equals(this.vcenterConfiguration, objCloud.vcenterConfiguration)&&
  Objects.equals(this.openstackConfiguration, objCloud.openstackConfiguration)&&
  Objects.equals(this.awsConfiguration, objCloud.awsConfiguration)&&
  Objects.equals(this.cloudstackConfiguration, objCloud.cloudstackConfiguration)&&
  Objects.equals(this.vcaConfiguration, objCloud.vcaConfiguration)&&
  Objects.equals(this.proxyConfiguration, objCloud.proxyConfiguration)&&
  Objects.equals(this.linuxserverConfiguration, objCloud.linuxserverConfiguration)&&
  Objects.equals(this.dockerConfiguration, objCloud.dockerConfiguration)&&
  Objects.equals(this.rancherConfiguration, objCloud.rancherConfiguration)&&
  Objects.equals(this.azureConfiguration, objCloud.azureConfiguration)&&
  Objects.equals(this.gcpConfiguration, objCloud.gcpConfiguration)&&
  Objects.equals(this.nsxtConfiguration, objCloud.nsxtConfiguration)&&
  Objects.equals(this.dhcpEnabled, objCloud.dhcpEnabled)&&
  Objects.equals(this.mtu, objCloud.mtu)&&
  Objects.equals(this.preferStaticRoutes, objCloud.preferStaticRoutes)&&
  Objects.equals(this.enableVipStaticRoutes, objCloud.enableVipStaticRoutes)&&
  Objects.equals(this.objNamePrefix, objCloud.objNamePrefix)&&
  Objects.equals(this.licenseType, objCloud.licenseType)&&
  Objects.equals(this.ipamProviderRef, objCloud.ipamProviderRef)&&
  Objects.equals(this.dnsProviderRef, objCloud.dnsProviderRef)&&
  Objects.equals(this.eastWestIpamProviderRef, objCloud.eastWestIpamProviderRef)&&
  Objects.equals(this.eastWestDnsProviderRef, objCloud.eastWestDnsProviderRef)&&
  Objects.equals(this.customTags, objCloud.customTags)&&
  Objects.equals(this.stateBasedDnsRegistration, objCloud.stateBasedDnsRegistration)&&
  Objects.equals(this.ip6AutocfgEnabled, objCloud.ip6AutocfgEnabled)&&
  Objects.equals(this.dnsResolutionOnSe, objCloud.dnsResolutionOnSe)&&
  Objects.equals(this.enableVipOnAllInterfaces, objCloud.enableVipOnAllInterfaces)&&
  Objects.equals(this.maintenanceMode, objCloud.maintenanceMode)&&
  Objects.equals(this.tenantRef, objCloud.tenantRef)&&
  Objects.equals(this.licenseTier, objCloud.licenseTier)&&
  Objects.equals(this.autoscalePollingInterval, objCloud.autoscalePollingInterval)&&
  Objects.equals(this.seGroupTemplateRef, objCloud.seGroupTemplateRef)&&
  Objects.equals(this.vmcDeployment, objCloud.vmcDeployment)&&
  Objects.equals(this.dnsResolvers, objCloud.dnsResolvers)&&
  Objects.equals(this.markers, objCloud.markers)&&
  Objects.equals(this.metricsPollingInterval, objCloud.metricsPollingInterval)&&
  Objects.equals(this.ntpConfiguration, objCloud.ntpConfiguration);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Cloud {\n");
      sb.append("    autoscalePollingInterval: ").append(toIndentedString(autoscalePollingInterval)).append("\n");
        sb.append("    awsConfiguration: ").append(toIndentedString(awsConfiguration)).append("\n");
        sb.append("    azureConfiguration: ").append(toIndentedString(azureConfiguration)).append("\n");
        sb.append("    cloudstackConfiguration: ").append(toIndentedString(cloudstackConfiguration)).append("\n");
        sb.append("    customTags: ").append(toIndentedString(customTags)).append("\n");
        sb.append("    dhcpEnabled: ").append(toIndentedString(dhcpEnabled)).append("\n");
        sb.append("    dnsProviderRef: ").append(toIndentedString(dnsProviderRef)).append("\n");
        sb.append("    dnsResolutionOnSe: ").append(toIndentedString(dnsResolutionOnSe)).append("\n");
        sb.append("    dnsResolvers: ").append(toIndentedString(dnsResolvers)).append("\n");
        sb.append("    dockerConfiguration: ").append(toIndentedString(dockerConfiguration)).append("\n");
        sb.append("    eastWestDnsProviderRef: ").append(toIndentedString(eastWestDnsProviderRef)).append("\n");
        sb.append("    eastWestIpamProviderRef: ").append(toIndentedString(eastWestIpamProviderRef)).append("\n");
        sb.append("    enableVipOnAllInterfaces: ").append(toIndentedString(enableVipOnAllInterfaces)).append("\n");
        sb.append("    enableVipStaticRoutes: ").append(toIndentedString(enableVipStaticRoutes)).append("\n");
        sb.append("    gcpConfiguration: ").append(toIndentedString(gcpConfiguration)).append("\n");
        sb.append("    ip6AutocfgEnabled: ").append(toIndentedString(ip6AutocfgEnabled)).append("\n");
        sb.append("    ipamProviderRef: ").append(toIndentedString(ipamProviderRef)).append("\n");
        sb.append("    licenseTier: ").append(toIndentedString(licenseTier)).append("\n");
        sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
        sb.append("    linuxserverConfiguration: ").append(toIndentedString(linuxserverConfiguration)).append("\n");
        sb.append("    maintenanceMode: ").append(toIndentedString(maintenanceMode)).append("\n");
        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
        sb.append("    metricsPollingInterval: ").append(toIndentedString(metricsPollingInterval)).append("\n");
        sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nsxtConfiguration: ").append(toIndentedString(nsxtConfiguration)).append("\n");
        sb.append("    ntpConfiguration: ").append(toIndentedString(ntpConfiguration)).append("\n");
        sb.append("    objNamePrefix: ").append(toIndentedString(objNamePrefix)).append("\n");
        sb.append("    openstackConfiguration: ").append(toIndentedString(openstackConfiguration)).append("\n");
        sb.append("    preferStaticRoutes: ").append(toIndentedString(preferStaticRoutes)).append("\n");
        sb.append("    proxyConfiguration: ").append(toIndentedString(proxyConfiguration)).append("\n");
        sb.append("    rancherConfiguration: ").append(toIndentedString(rancherConfiguration)).append("\n");
        sb.append("    seGroupTemplateRef: ").append(toIndentedString(seGroupTemplateRef)).append("\n");
        sb.append("    stateBasedDnsRegistration: ").append(toIndentedString(stateBasedDnsRegistration)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vcaConfiguration: ").append(toIndentedString(vcaConfiguration)).append("\n");
        sb.append("    vcenterConfiguration: ").append(toIndentedString(vcenterConfiguration)).append("\n");
        sb.append("    vmcDeployment: ").append(toIndentedString(vmcDeployment)).append("\n");
        sb.append("    vtype: ").append(toIndentedString(vtype)).append("\n");
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

