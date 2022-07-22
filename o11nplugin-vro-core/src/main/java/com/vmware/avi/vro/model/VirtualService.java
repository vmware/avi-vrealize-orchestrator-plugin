package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AnalyticsPolicy;
import com.vmware.avi.vro.model.RateProfile;
import com.vmware.avi.vro.model.ContentRewriteProfile;
import com.vmware.avi.vro.model.JWTValidationVsConfig;
import com.vmware.avi.vro.model.LDAPVSConfig;
import com.vmware.avi.vro.model.OAuthVSConfig;
import com.vmware.avi.vro.model.PerformanceLimits;
import com.vmware.avi.vro.model.RateProfile;
import com.vmware.avi.vro.model.SAMLSPConfig;
import com.vmware.avi.vro.model.SidebandProfile;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VirtualService is a POJO class extends AviRestResource that used for creating
 * VirtualService.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VirtualService")
@VsoFinder(name = Constants.FINDER_VRO_VIRTUALSERVICE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VirtualService extends AviRestResource {
    @JsonProperty("active_standby_se_tag")
    @JsonInclude(Include.NON_NULL)
    private String activeStandbySeTag = "ACTIVE_STANDBY_SE_1";

    @JsonProperty("advertise_down_vs")
    @JsonInclude(Include.NON_NULL)
    private Boolean advertiseDownVs = false;

    @JsonProperty("allow_invalid_client_cert")
    @JsonInclude(Include.NON_NULL)
    private Boolean allowInvalidClientCert = false;

    @JsonProperty("analytics_policy")
    @JsonInclude(Include.NON_NULL)
    private AnalyticsPolicy analyticsPolicy = null;

    @JsonProperty("analytics_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String analyticsProfileRef = null;

    @JsonProperty("application_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String applicationProfileRef = null;

    @JsonProperty("azure_availability_set")
    @JsonInclude(Include.NON_NULL)
    private String azureAvailabilitySet;

    @JsonProperty("bgp_peer_labels")
    @JsonInclude(Include.NON_NULL)
    private List<String> bgpPeerLabels = null;

    @JsonProperty("bot_policy_ref")
    @JsonInclude(Include.NON_NULL)
    private String botPolicyRef = null;

    @JsonProperty("bulk_sync_kvcache")
    @JsonInclude(Include.NON_NULL)
    private Boolean bulkSyncKvcache = false;

    @JsonProperty("close_client_conn_on_config_update")
    @JsonInclude(Include.NON_NULL)
    private Boolean closeClientConnOnConfigUpdate = false;

    @JsonProperty("cloud_config_cksum")
    @JsonInclude(Include.NON_NULL)
    private String cloudConfigCksum = null;

    @JsonProperty("cloud_ref")
    @JsonInclude(Include.NON_NULL)
    private String cloudRef = null;

    @JsonProperty("cloud_type")
    @JsonInclude(Include.NON_NULL)
    private String cloudType = "CLOUD_NONE";

    @JsonProperty("connections_rate_limit")
    @JsonInclude(Include.NON_NULL)
    private RateProfile connectionsRateLimit = null;

    @JsonProperty("content_rewrite")
    @JsonInclude(Include.NON_NULL)
    private ContentRewriteProfile contentRewrite = null;

    @JsonProperty("created_by")
    @JsonInclude(Include.NON_NULL)
    private String createdBy = null;

    @JsonProperty("delay_fairness")
    @JsonInclude(Include.NON_NULL)
    private Boolean delayFairness = false;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description = null;

    @JsonProperty("dns_info")
    @JsonInclude(Include.NON_NULL)
    private List<DnsInfo> dnsInfo = null;

    @JsonProperty("dns_policies")
    @JsonInclude(Include.NON_NULL)
    private List<DnsPolicies> dnsPolicies = null;

    @JsonProperty("east_west_placement")
    @JsonInclude(Include.NON_NULL)
    private Boolean eastWestPlacement = false;

    @JsonProperty("enable_autogw")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableAutogw;

    @JsonProperty("enable_rhi")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableRhi = null;

    @JsonProperty("enable_rhi_snat")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableRhiSnat = null;

    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled = true;

    @JsonProperty("error_page_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String errorPageProfileRef = null;

    @JsonProperty("flow_dist")
    @JsonInclude(Include.NON_NULL)
    private String flowDist = "LOAD_AWARE";

    @JsonProperty("flow_label_type")
    @JsonInclude(Include.NON_NULL)
    private String flowLabelType = "NO_LABEL";

    @JsonProperty("fqdn")
    @JsonInclude(Include.NON_NULL)
    private String fqdn = null;

    @JsonProperty("host_name_xlate")
    @JsonInclude(Include.NON_NULL)
    private String hostNameXlate = null;

    @JsonProperty("http_policies")
    @JsonInclude(Include.NON_NULL)
    private List<HTTPPolicies> httpPolicies = null;

    @JsonProperty("icap_request_profile_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> icapRequestProfileRefs = null;

    @JsonProperty("ign_pool_net_reach")
    @JsonInclude(Include.NON_NULL)
    private Boolean ignPoolNetReach = false;

    @JsonProperty("jwt_config")
    @JsonInclude(Include.NON_NULL)
    private JWTValidationVsConfig jwtConfig = null;

    @JsonProperty("l4_policies")
    @JsonInclude(Include.NON_NULL)
    private List<L4Policies> l4Policies = null;

    @JsonProperty("ldap_vs_config")
    @JsonInclude(Include.NON_NULL)
    private LDAPVSConfig ldapVsConfig = null;

    @JsonProperty("limit_doser")
    @JsonInclude(Include.NON_NULL)
    private Boolean limitDoser = false;

    @JsonProperty("markers")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markers = null;

    @JsonProperty("max_cps_per_client")
    @JsonInclude(Include.NON_NULL)
    private Integer maxCpsPerClient = 0;

    @JsonProperty("microservice_ref")
    @JsonInclude(Include.NON_NULL)
    private String microserviceRef = null;

    @JsonProperty("min_pools_up")
    @JsonInclude(Include.NON_NULL)
    private Integer minPoolsUp = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("network_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String networkProfileRef = null;

    @JsonProperty("network_security_policy_ref")
    @JsonInclude(Include.NON_NULL)
    private String networkSecurityPolicyRef = null;

    @JsonProperty("nsx_securitygroup")
    @JsonInclude(Include.NON_NULL)
    private List<String> nsxSecuritygroup = null;

    @JsonProperty("oauth_vs_config")
    @JsonInclude(Include.NON_NULL)
    private OAuthVSConfig oauthVsConfig = null;

    @JsonProperty("performance_limits")
    @JsonInclude(Include.NON_NULL)
    private PerformanceLimits performanceLimits = null;

    @JsonProperty("pool_group_ref")
    @JsonInclude(Include.NON_NULL)
    private String poolGroupRef = null;

    @JsonProperty("pool_ref")
    @JsonInclude(Include.NON_NULL)
    private String poolRef = null;

    @JsonProperty("remove_listening_port_on_vs_down")
    @JsonInclude(Include.NON_NULL)
    private Boolean removeListeningPortOnVsDown = false;

    @JsonProperty("requests_rate_limit")
    @JsonInclude(Include.NON_NULL)
    private RateProfile requestsRateLimit = null;

    @JsonProperty("saml_sp_config")
    @JsonInclude(Include.NON_NULL)
    private SAMLSPConfig samlSpConfig = null;

    @JsonProperty("scaleout_ecmp")
    @JsonInclude(Include.NON_NULL)
    private Boolean scaleoutEcmp = false;

    @JsonProperty("se_group_ref")
    @JsonInclude(Include.NON_NULL)
    private String seGroupRef = null;

    @JsonProperty("security_policy_ref")
    @JsonInclude(Include.NON_NULL)
    private String securityPolicyRef = null;

    @JsonProperty("server_network_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String serverNetworkProfileRef = null;

    @JsonProperty("service_metadata")
    @JsonInclude(Include.NON_NULL)
    private String serviceMetadata = null;

    @JsonProperty("service_pool_select")
    @JsonInclude(Include.NON_NULL)
    private List<ServicePoolSelector> servicePoolSelect = null;

    @JsonProperty("services")
    @JsonInclude(Include.NON_NULL)
    private List<com.vmware.avi.vro.model.Service> services = null;

    @JsonProperty("sideband_profile")
    @JsonInclude(Include.NON_NULL)
    private SidebandProfile sidebandProfile = null;

    @JsonProperty("snat_ip")
    @JsonInclude(Include.NON_NULL)
    private List<IpAddr> snatIp = null;

    @JsonProperty("sp_pool_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> spPoolRefs;

    @JsonProperty("ssl_key_and_certificate_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> sslKeyAndCertificateRefs = null;

    @JsonProperty("ssl_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String sslProfileRef = null;

    @JsonProperty("ssl_profile_selectors")
    @JsonInclude(Include.NON_NULL)
    private List<SSLProfileSelector> sslProfileSelectors = null;

    @JsonProperty("ssl_sess_cache_avg_size")
    @JsonInclude(Include.NON_NULL)
    private Integer sslSessCacheAvgSize = 1024;

    @JsonProperty("sso_policy_ref")
    @JsonInclude(Include.NON_NULL)
    private String ssoPolicyRef = null;

    @JsonProperty("static_dns_records")
    @JsonInclude(Include.NON_NULL)
    private List<DnsRecord> staticDnsRecords = null;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("test_se_datastore_level_1_ref")
    @JsonInclude(Include.NON_NULL)
    private String testSeDatastoreLevel1Ref = null;

    @JsonProperty("topology_policies")
    @JsonInclude(Include.NON_NULL)
    private List<DnsPolicies> topologyPolicies = null;

    @JsonProperty("traffic_clone_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String trafficCloneProfileRef = null;

    @JsonProperty("traffic_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean trafficEnabled = true;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = "VS_TYPE_NORMAL";

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("use_bridge_ip_as_vip")
    @JsonInclude(Include.NON_NULL)
    private Boolean useBridgeIpAsVip = false;

    @JsonProperty("use_vip_as_snat")
    @JsonInclude(Include.NON_NULL)
    private Boolean useVipAsSnat = false;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;

    @JsonProperty("vh_domain_name")
    @JsonInclude(Include.NON_NULL)
    private List<String> vhDomainName = null;

    @JsonProperty("vh_matches")
    @JsonInclude(Include.NON_NULL)
    private List<VHMatch> vhMatches = null;

    @JsonProperty("vh_parent_vs_ref")
    @JsonInclude(Include.NON_NULL)
    private String vhParentVsRef = null;

    @JsonProperty("vh_type")
    @JsonInclude(Include.NON_NULL)
    private String vhType;

    @JsonProperty("vip")
    @JsonInclude(Include.NON_NULL)
    private List<Vip> vip = null;

    @JsonProperty("vrf_context_ref")
    @JsonInclude(Include.NON_NULL)
    private String vrfContextRef = null;

    @JsonProperty("vs_datascripts")
    @JsonInclude(Include.NON_NULL)
    private List<VSDataScripts> vsDatascripts = null;

    @JsonProperty("vsvip_ref")
    @JsonInclude(Include.NON_NULL)
    private String vsvipRef = null;

    @JsonProperty("waf_policy_ref")
    @JsonInclude(Include.NON_NULL)
    private String wafPolicyRef = null;

    @JsonProperty("weight")
    @JsonInclude(Include.NON_NULL)
    private Integer weight = 1;



  /**
   * This is the getter method this will return the attribute value.
   * This configuration only applies if the virtualservice is in legacy active standby ha mode and load distribution among active standby is enabled.
   * This field is used to tag the virtualservice so that virtualservices with the same tag will share the same active serviceengine.
   * Virtualservices with different tags will have different active serviceengines.
   * If one of the serviceengine's in the serviceenginegroup fails, all virtualservices will end up using the same active serviceengine.
   * Redistribution of the virtualservices can be either manual or automated when the failed serviceengine recovers.
   * Redistribution is based on the auto redistribute property of the serviceenginegroup.
   * Enum options - ACTIVE_STANDBY_SE_1, ACTIVE_STANDBY_SE_2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ACTIVE_STANDBY_SE_1".
   * @return activeStandbySeTag
   */
  @VsoMethod
  public String getActiveStandbySeTag() {
    return activeStandbySeTag;
  }

  /**
   * This is the setter method to the attribute.
   * This configuration only applies if the virtualservice is in legacy active standby ha mode and load distribution among active standby is enabled.
   * This field is used to tag the virtualservice so that virtualservices with the same tag will share the same active serviceengine.
   * Virtualservices with different tags will have different active serviceengines.
   * If one of the serviceengine's in the serviceenginegroup fails, all virtualservices will end up using the same active serviceengine.
   * Redistribution of the virtualservices can be either manual or automated when the failed serviceengine recovers.
   * Redistribution is based on the auto redistribute property of the serviceenginegroup.
   * Enum options - ACTIVE_STANDBY_SE_1, ACTIVE_STANDBY_SE_2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ACTIVE_STANDBY_SE_1".
   * @param activeStandbySeTag set the activeStandbySeTag.
   */
  @VsoMethod
  public void setActiveStandbySeTag(String  activeStandbySeTag) {
    this.activeStandbySeTag = activeStandbySeTag;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Keep advertising virtual service via bgp even if it is marked down by health monitor.
   * This setting takes effect for future virtual service flaps.
   * To advertise current vses that are down, please disable and re-enable the virtual service.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return advertiseDownVs
   */
  @VsoMethod
  public Boolean getAdvertiseDownVs() {
    return advertiseDownVs;
  }

  /**
   * This is the setter method to the attribute.
   * Keep advertising virtual service via bgp even if it is marked down by health monitor.
   * This setting takes effect for future virtual service flaps.
   * To advertise current vses that are down, please disable and re-enable the virtual service.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param advertiseDownVs set the advertiseDownVs.
   */
  @VsoMethod
  public void setAdvertiseDownVs(Boolean  advertiseDownVs) {
    this.advertiseDownVs = advertiseDownVs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Process request even if invalid client certificate is presented.
   * Datascript apis need to be used for processing of such requests.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return allowInvalidClientCert
   */
  @VsoMethod
  public Boolean getAllowInvalidClientCert() {
    return allowInvalidClientCert;
  }

  /**
   * This is the setter method to the attribute.
   * Process request even if invalid client certificate is presented.
   * Datascript apis need to be used for processing of such requests.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param allowInvalidClientCert set the allowInvalidClientCert.
   */
  @VsoMethod
  public void setAllowInvalidClientCert(Boolean  allowInvalidClientCert) {
    this.allowInvalidClientCert = allowInvalidClientCert;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Determines analytics settings for the application.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return analyticsPolicy
   */
  @VsoMethod
  public AnalyticsPolicy getAnalyticsPolicy() {
    return analyticsPolicy;
  }

  /**
   * This is the setter method to the attribute.
   * Determines analytics settings for the application.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param analyticsPolicy set the analyticsPolicy.
   */
  @VsoMethod
  public void setAnalyticsPolicy(AnalyticsPolicy analyticsPolicy) {
    this.analyticsPolicy = analyticsPolicy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies settings related to analytics.
   * It is a reference to an object of type analyticsprofile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return analyticsProfileRef
   */
  @VsoMethod
  public String getAnalyticsProfileRef() {
    return analyticsProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies settings related to analytics.
   * It is a reference to an object of type analyticsprofile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param analyticsProfileRef set the analyticsProfileRef.
   */
  @VsoMethod
  public void setAnalyticsProfileRef(String  analyticsProfileRef) {
    this.analyticsProfileRef = analyticsProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable application layer specific features for the virtual service.
   * It is a reference to an object of type applicationprofile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Special default for essentials edition is system-l4-application.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return applicationProfileRef
   */
  @VsoMethod
  public String getApplicationProfileRef() {
    return applicationProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Enable application layer specific features for the virtual service.
   * It is a reference to an object of type applicationprofile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Special default for essentials edition is system-l4-application.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param applicationProfileRef set the applicationProfileRef.
   */
  @VsoMethod
  public void setApplicationProfileRef(String  applicationProfileRef) {
    this.applicationProfileRef = applicationProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * (internal-use)applicable for azure only.
   * Azure availability set to which this vs is associated.
   * Internally set by the cloud connector.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return azureAvailabilitySet
   */
  @VsoMethod
  public String getAzureAvailabilitySet() {
    return azureAvailabilitySet;
  }

  /**
   * This is the setter method to the attribute.
   * (internal-use)applicable for azure only.
   * Azure availability set to which this vs is associated.
   * Internally set by the cloud connector.
   * Field introduced in 17.2.12, 18.1.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @param azureAvailabilitySet set the azureAvailabilitySet.
   */
  @VsoMethod
  public void setAzureAvailabilitySet(String  azureAvailabilitySet) {
    this.azureAvailabilitySet = azureAvailabilitySet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Select bgp peers, using peer label, for vsvip advertisement.
   * Field introduced in 20.1.5.
   * Maximum of 128 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return bgpPeerLabels
   */
  @VsoMethod
  public List<String> getBgpPeerLabels() {
    return bgpPeerLabels;
  }

  /**
   * This is the setter method. this will set the bgpPeerLabels
   * Select bgp peers, using peer label, for vsvip advertisement.
   * Field introduced in 20.1.5.
   * Maximum of 128 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return bgpPeerLabels
   */
  @VsoMethod
  public void setBgpPeerLabels(List<String>  bgpPeerLabels) {
    this.bgpPeerLabels = bgpPeerLabels;
  }

  /**
   * This is the setter method this will set the bgpPeerLabels
   * Select bgp peers, using peer label, for vsvip advertisement.
   * Field introduced in 20.1.5.
   * Maximum of 128 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return bgpPeerLabels
   */
  @VsoMethod
  public VirtualService addBgpPeerLabelsItem(String bgpPeerLabelsItem) {
    if (this.bgpPeerLabels == null) {
      this.bgpPeerLabels = new ArrayList<String>();
    }
    this.bgpPeerLabels.add(bgpPeerLabelsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Bot detection policy for the virtual service.
   * It is a reference to an object of type botdetectionpolicy.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return botPolicyRef
   */
  @VsoMethod
  public String getBotPolicyRef() {
    return botPolicyRef;
  }

  /**
   * This is the setter method to the attribute.
   * Bot detection policy for the virtual service.
   * It is a reference to an object of type botdetectionpolicy.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param botPolicyRef set the botPolicyRef.
   */
  @VsoMethod
  public void setBotPolicyRef(String  botPolicyRef) {
    this.botPolicyRef = botPolicyRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * (this is a beta feature).
   * Sync key-value cache to the new ses when vs is scaled out.
   * For ex  ssl sessions are stored using vs's key-value cache.
   * When the vs is scaled out, the ssl session information is synced to the new se, allowing existing ssl sessions to be reused on the new se.
   * Field introduced in 17.2.7, 18.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return bulkSyncKvcache
   */
  @VsoMethod
  public Boolean getBulkSyncKvcache() {
    return bulkSyncKvcache;
  }

  /**
   * This is the setter method to the attribute.
   * (this is a beta feature).
   * Sync key-value cache to the new ses when vs is scaled out.
   * For ex  ssl sessions are stored using vs's key-value cache.
   * When the vs is scaled out, the ssl session information is synced to the new se, allowing existing ssl sessions to be reused on the new se.
   * Field introduced in 17.2.7, 18.1.1.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param bulkSyncKvcache set the bulkSyncKvcache.
   */
  @VsoMethod
  public void setBulkSyncKvcache(Boolean  bulkSyncKvcache) {
    this.bulkSyncKvcache = bulkSyncKvcache;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Close client connection on vs config update.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return closeClientConnOnConfigUpdate
   */
  @VsoMethod
  public Boolean getCloseClientConnOnConfigUpdate() {
    return closeClientConnOnConfigUpdate;
  }

  /**
   * This is the setter method to the attribute.
   * Close client connection on vs config update.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param closeClientConnOnConfigUpdate set the closeClientConnOnConfigUpdate.
   */
  @VsoMethod
  public void setCloseClientConnOnConfigUpdate(Boolean  closeClientConnOnConfigUpdate) {
    this.closeClientConnOnConfigUpdate = closeClientConnOnConfigUpdate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Checksum of cloud configuration for vs.
   * Internally set by cloud connector.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudConfigCksum
   */
  @VsoMethod
  public String getCloudConfigCksum() {
    return cloudConfigCksum;
  }

  /**
   * This is the setter method to the attribute.
   * Checksum of cloud configuration for vs.
   * Internally set by cloud connector.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudConfigCksum set the cloudConfigCksum.
   */
  @VsoMethod
  public void setCloudConfigCksum(String  cloudConfigCksum) {
    this.cloudConfigCksum = cloudConfigCksum;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type cloud.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudRef
   */
  @VsoMethod
  public String getCloudRef() {
    return cloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type cloud.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudRef set the cloudRef.
   */
  @VsoMethod
  public void setCloudRef(String  cloudRef) {
    this.cloudRef = cloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- cloud_none,cloud_vcenter), basic edition(allowed values-
   * cloud_none,cloud_nsxt), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "CLOUD_NONE".
   * @return cloudType
   */
  @VsoMethod
  public String getCloudType() {
    return cloudType;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- cloud_none,cloud_vcenter), basic edition(allowed values-
   * cloud_none,cloud_nsxt), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "CLOUD_NONE".
   * @param cloudType set the cloudType.
   */
  @VsoMethod
  public void setCloudType(String  cloudType) {
    this.cloudType = cloudType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limit the incoming connections to this virtual service.
   * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return connectionsRateLimit
   */
  @VsoMethod
  public RateProfile getConnectionsRateLimit() {
    return connectionsRateLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limit the incoming connections to this virtual service.
   * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param connectionsRateLimit set the connectionsRateLimit.
   */
  @VsoMethod
  public void setConnectionsRateLimit(RateProfile connectionsRateLimit) {
    this.connectionsRateLimit = connectionsRateLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Profile used to match and rewrite strings in request and/or response body.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return contentRewrite
   */
  @VsoMethod
  public ContentRewriteProfile getContentRewrite() {
    return contentRewrite;
  }

  /**
   * This is the setter method to the attribute.
   * Profile used to match and rewrite strings in request and/or response body.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param contentRewrite set the contentRewrite.
   */
  @VsoMethod
  public void setContentRewrite(ContentRewriteProfile contentRewrite) {
    this.contentRewrite = contentRewrite;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Creator name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return createdBy
   */
  @VsoMethod
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * This is the setter method to the attribute.
   * Creator name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param createdBy set the createdBy.
   */
  @VsoMethod
  public void setCreatedBy(String  createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Select the algorithm for qos fairness.
   * This determines how multiple virtual services sharing the same service engines will prioritize traffic over a congested network.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return delayFairness
   */
  @VsoMethod
  public Boolean getDelayFairness() {
    return delayFairness;
  }

  /**
   * This is the setter method to the attribute.
   * Select the algorithm for qos fairness.
   * This determines how multiple virtual services sharing the same service engines will prioritize traffic over a congested network.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param delayFairness set the delayFairness.
   */
  @VsoMethod
  public void setDelayFairness(Boolean  delayFairness) {
    this.delayFairness = delayFairness;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service discovery specific data including fully qualified domain name, type and time-to-live of the dns record.
   * Note that only one of fqdn and dns_info setting is allowed.
   * Maximum of 1000 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsInfo
   */
  @VsoMethod
  public List<DnsInfo> getDnsInfo() {
    return dnsInfo;
  }

  /**
   * This is the setter method. this will set the dnsInfo
   * Service discovery specific data including fully qualified domain name, type and time-to-live of the dns record.
   * Note that only one of fqdn and dns_info setting is allowed.
   * Maximum of 1000 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsInfo
   */
  @VsoMethod
  public void setDnsInfo(List<DnsInfo>  dnsInfo) {
    this.dnsInfo = dnsInfo;
  }

  /**
   * This is the setter method this will set the dnsInfo
   * Service discovery specific data including fully qualified domain name, type and time-to-live of the dns record.
   * Note that only one of fqdn and dns_info setting is allowed.
   * Maximum of 1000 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsInfo
   */
  @VsoMethod
  public VirtualService addDnsInfoItem(DnsInfo dnsInfoItem) {
    if (this.dnsInfo == null) {
      this.dnsInfo = new ArrayList<DnsInfo>();
    }
    this.dnsInfo.add(dnsInfoItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Dns policies applied on the dns traffic of the virtual service.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsPolicies
   */
  @VsoMethod
  public List<DnsPolicies> getDnsPolicies() {
    return dnsPolicies;
  }

  /**
   * This is the setter method. this will set the dnsPolicies
   * Dns policies applied on the dns traffic of the virtual service.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsPolicies
   */
  @VsoMethod
  public void setDnsPolicies(List<DnsPolicies>  dnsPolicies) {
    this.dnsPolicies = dnsPolicies;
  }

  /**
   * This is the setter method this will set the dnsPolicies
   * Dns policies applied on the dns traffic of the virtual service.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsPolicies
   */
  @VsoMethod
  public VirtualService addDnsPoliciesItem(DnsPolicies dnsPoliciesItem) {
    if (this.dnsPolicies == null) {
      this.dnsPolicies = new ArrayList<DnsPolicies>();
    }
    this.dnsPolicies.add(dnsPoliciesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Force placement on all se's in service group (mesos mode only).
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return eastWestPlacement
   */
  @VsoMethod
  public Boolean getEastWestPlacement() {
    return eastWestPlacement;
  }

  /**
   * This is the setter method to the attribute.
   * Force placement on all se's in service group (mesos mode only).
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param eastWestPlacement set the eastWestPlacement.
   */
  @VsoMethod
  public void setEastWestPlacement(Boolean  eastWestPlacement) {
    this.eastWestPlacement = eastWestPlacement;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Response traffic to clients will be sent back to the source mac address of the connection, rather than statically sent to a default gateway.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Special default for essentials edition is false, basic edition is false, enterprise is true.
   * @return enableAutogw
   */
  @VsoMethod
  public Boolean getEnableAutogw() {
    return enableAutogw;
  }

  /**
   * This is the setter method to the attribute.
   * Response traffic to clients will be sent back to the source mac address of the connection, rather than statically sent to a default gateway.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Special default for essentials edition is false, basic edition is false, enterprise is true.
   * @param enableAutogw set the enableAutogw.
   */
  @VsoMethod
  public void setEnableAutogw(Boolean  enableAutogw) {
    this.enableAutogw = enableAutogw;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable route health injection using the bgp config in the vrf context.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enableRhi
   */
  @VsoMethod
  public Boolean getEnableRhi() {
    return enableRhi;
  }

  /**
   * This is the setter method to the attribute.
   * Enable route health injection using the bgp config in the vrf context.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param enableRhi set the enableRhi.
   */
  @VsoMethod
  public void setEnableRhi(Boolean  enableRhi) {
    this.enableRhi = enableRhi;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable route health injection for source nat'ted floating ip address using the bgp config in the vrf context.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enableRhiSnat
   */
  @VsoMethod
  public Boolean getEnableRhiSnat() {
    return enableRhiSnat;
  }

  /**
   * This is the setter method to the attribute.
   * Enable route health injection for source nat'ted floating ip address using the bgp config in the vrf context.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param enableRhiSnat set the enableRhiSnat.
   */
  @VsoMethod
  public void setEnableRhiSnat(Boolean  enableRhiSnat) {
    this.enableRhiSnat = enableRhiSnat;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable or disable the virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable or disable the virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error page profile to be used for this virtualservice.this profile is used to send the custom error page to the client generated by the proxy.
   * It is a reference to an object of type errorpageprofile.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorPageProfileRef
   */
  @VsoMethod
  public String getErrorPageProfileRef() {
    return errorPageProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Error page profile to be used for this virtualservice.this profile is used to send the custom error page to the client generated by the proxy.
   * It is a reference to an object of type errorpageprofile.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorPageProfileRef set the errorPageProfileRef.
   */
  @VsoMethod
  public void setErrorPageProfileRef(String  errorPageProfileRef) {
    this.errorPageProfileRef = errorPageProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Criteria for flow distribution among ses.
   * Enum options - LOAD_AWARE, CONSISTENT_HASH_SOURCE_IP_ADDRESS, CONSISTENT_HASH_SOURCE_IP_ADDRESS_AND_PORT.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- load_aware), basic edition(allowed values- load_aware),
   * enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LOAD_AWARE".
   * @return flowDist
   */
  @VsoMethod
  public String getFlowDist() {
    return flowDist;
  }

  /**
   * This is the setter method to the attribute.
   * Criteria for flow distribution among ses.
   * Enum options - LOAD_AWARE, CONSISTENT_HASH_SOURCE_IP_ADDRESS, CONSISTENT_HASH_SOURCE_IP_ADDRESS_AND_PORT.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- load_aware), basic edition(allowed values- load_aware),
   * enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "LOAD_AWARE".
   * @param flowDist set the flowDist.
   */
  @VsoMethod
  public void setFlowDist(String  flowDist) {
    this.flowDist = flowDist;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Criteria for flow labelling.
   * Enum options - NO_LABEL, APPLICATION_LABEL, SERVICE_LABEL.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "NO_LABEL".
   * @return flowLabelType
   */
  @VsoMethod
  public String getFlowLabelType() {
    return flowLabelType;
  }

  /**
   * This is the setter method to the attribute.
   * Criteria for flow labelling.
   * Enum options - NO_LABEL, APPLICATION_LABEL, SERVICE_LABEL.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "NO_LABEL".
   * @param flowLabelType set the flowLabelType.
   */
  @VsoMethod
  public void setFlowLabelType(String  flowLabelType) {
    this.flowLabelType = flowLabelType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dns resolvable, fully qualified domain name of the virtualservice.
   * Only one of 'fqdn' and 'dns_info' configuration is allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fqdn
   */
  @VsoMethod
  public String getFqdn() {
    return fqdn;
  }

  /**
   * This is the setter method to the attribute.
   * Dns resolvable, fully qualified domain name of the virtualservice.
   * Only one of 'fqdn' and 'dns_info' configuration is allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fqdn set the fqdn.
   */
  @VsoMethod
  public void setFqdn(String  fqdn) {
    this.fqdn = fqdn;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Translate the host name sent to the servers to this value.
   * Translate the host name sent from servers back to the value used by the client.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostNameXlate
   */
  @VsoMethod
  public String getHostNameXlate() {
    return hostNameXlate;
  }

  /**
   * This is the setter method to the attribute.
   * Translate the host name sent to the servers to this value.
   * Translate the host name sent from servers back to the value used by the client.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostNameXlate set the hostNameXlate.
   */
  @VsoMethod
  public void setHostNameXlate(String  hostNameXlate) {
    this.hostNameXlate = hostNameXlate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http policies applied on the data traffic of the virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpPolicies
   */
  @VsoMethod
  public List<HTTPPolicies> getHttpPolicies() {
    return httpPolicies;
  }

  /**
   * This is the setter method. this will set the httpPolicies
   * Http policies applied on the data traffic of the virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpPolicies
   */
  @VsoMethod
  public void setHttpPolicies(List<HTTPPolicies>  httpPolicies) {
    this.httpPolicies = httpPolicies;
  }

  /**
   * This is the setter method this will set the httpPolicies
   * Http policies applied on the data traffic of the virtual service.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpPolicies
   */
  @VsoMethod
  public VirtualService addHttpPoliciesItem(HTTPPolicies httpPoliciesItem) {
    if (this.httpPolicies == null) {
      this.httpPolicies = new ArrayList<HTTPPolicies>();
    }
    this.httpPolicies.add(httpPoliciesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The config settings for the icap server when checking the http request.
   * It is a reference to an object of type icapprofile.
   * Field introduced in 20.1.1.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return icapRequestProfileRefs
   */
  @VsoMethod
  public List<String> getIcapRequestProfileRefs() {
    return icapRequestProfileRefs;
  }

  /**
   * This is the setter method. this will set the icapRequestProfileRefs
   * The config settings for the icap server when checking the http request.
   * It is a reference to an object of type icapprofile.
   * Field introduced in 20.1.1.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return icapRequestProfileRefs
   */
  @VsoMethod
  public void setIcapRequestProfileRefs(List<String>  icapRequestProfileRefs) {
    this.icapRequestProfileRefs = icapRequestProfileRefs;
  }

  /**
   * This is the setter method this will set the icapRequestProfileRefs
   * The config settings for the icap server when checking the http request.
   * It is a reference to an object of type icapprofile.
   * Field introduced in 20.1.1.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return icapRequestProfileRefs
   */
  @VsoMethod
  public VirtualService addIcapRequestProfileRefsItem(String icapRequestProfileRefsItem) {
    if (this.icapRequestProfileRefs == null) {
      this.icapRequestProfileRefs = new ArrayList<String>();
    }
    this.icapRequestProfileRefs.add(icapRequestProfileRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Ignore pool servers network reachability constraints for virtual service placement.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return ignPoolNetReach
   */
  @VsoMethod
  public Boolean getIgnPoolNetReach() {
    return ignPoolNetReach;
  }

  /**
   * This is the setter method to the attribute.
   * Ignore pool servers network reachability constraints for virtual service placement.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param ignPoolNetReach set the ignPoolNetReach.
   */
  @VsoMethod
  public void setIgnPoolNetReach(Boolean  ignPoolNetReach) {
    this.ignPoolNetReach = ignPoolNetReach;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Application-specific config for jwt validation.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return jwtConfig
   */
  @VsoMethod
  public JWTValidationVsConfig getJwtConfig() {
    return jwtConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Application-specific config for jwt validation.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param jwtConfig set the jwtConfig.
   */
  @VsoMethod
  public void setJwtConfig(JWTValidationVsConfig jwtConfig) {
    this.jwtConfig = jwtConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * L4 policies applied to the data traffic of the virtual service.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return l4Policies
   */
  @VsoMethod
  public List<L4Policies> getL4Policies() {
    return l4Policies;
  }

  /**
   * This is the setter method. this will set the l4Policies
   * L4 policies applied to the data traffic of the virtual service.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return l4Policies
   */
  @VsoMethod
  public void setL4Policies(List<L4Policies>  l4Policies) {
    this.l4Policies = l4Policies;
  }

  /**
   * This is the setter method this will set the l4Policies
   * L4 policies applied to the data traffic of the virtual service.
   * Field introduced in 17.2.7.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return l4Policies
   */
  @VsoMethod
  public VirtualService addL4PoliciesItem(L4Policies l4PoliciesItem) {
    if (this.l4Policies == null) {
      this.l4Policies = new ArrayList<L4Policies>();
    }
    this.l4Policies.add(l4PoliciesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Application-specific ldap config.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ldapVsConfig
   */
  @VsoMethod
  public LDAPVSConfig getLdapVsConfig() {
    return ldapVsConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Application-specific ldap config.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ldapVsConfig set the ldapVsConfig.
   */
  @VsoMethod
  public void setLdapVsConfig(LDAPVSConfig ldapVsConfig) {
    this.ldapVsConfig = ldapVsConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Limit potential dos attackers who exceed max_cps_per_client significantly to a fraction of max_cps_per_client for a while.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return limitDoser
   */
  @VsoMethod
  public Boolean getLimitDoser() {
    return limitDoser;
  }

  /**
   * This is the setter method to the attribute.
   * Limit potential dos attackers who exceed max_cps_per_client significantly to a fraction of max_cps_per_client for a while.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param limitDoser set the limitDoser.
   */
  @VsoMethod
  public void setLimitDoser(Boolean  limitDoser) {
    this.limitDoser = limitDoser;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.5.
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
   * Field introduced in 20.1.5.
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
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public VirtualService addMarkersItem(RoleFilterMatchLabel markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<RoleFilterMatchLabel>();
    }
    this.markers.add(markersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Maximum connections per second per client ip.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return maxCpsPerClient
   */
  @VsoMethod
  public Integer getMaxCpsPerClient() {
    return maxCpsPerClient;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum connections per second per client ip.
   * Allowed values are 10-1000.
   * Special values are 0- unlimited.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param maxCpsPerClient set the maxCpsPerClient.
   */
  @VsoMethod
  public void setMaxCpsPerClient(Integer  maxCpsPerClient) {
    this.maxCpsPerClient = maxCpsPerClient;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Microservice representing the virtual service.
   * It is a reference to an object of type microservice.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return microserviceRef
   */
  @VsoMethod
  public String getMicroserviceRef() {
    return microserviceRef;
  }

  /**
   * This is the setter method to the attribute.
   * Microservice representing the virtual service.
   * It is a reference to an object of type microservice.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param microserviceRef set the microserviceRef.
   */
  @VsoMethod
  public void setMicroserviceRef(String  microserviceRef) {
    this.microserviceRef = microserviceRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum number of up pools to mark vs up.
   * Field introduced in 18.2.1, 17.2.12.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return minPoolsUp
   */
  @VsoMethod
  public Integer getMinPoolsUp() {
    return minPoolsUp;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum number of up pools to mark vs up.
   * Field introduced in 18.2.1, 17.2.12.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param minPoolsUp set the minPoolsUp.
   */
  @VsoMethod
  public void setMinPoolsUp(Integer  minPoolsUp) {
    this.minPoolsUp = minPoolsUp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name for the virtual service.
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
   * Name for the virtual service.
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
   * Determines network settings such as protocol, tcp or udp, and related options for the protocol.
   * It is a reference to an object of type networkprofile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Special default for essentials edition is system-tcp-fast-path.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkProfileRef
   */
  @VsoMethod
  public String getNetworkProfileRef() {
    return networkProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Determines network settings such as protocol, tcp or udp, and related options for the protocol.
   * It is a reference to an object of type networkprofile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Special default for essentials edition is system-tcp-fast-path.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param networkProfileRef set the networkProfileRef.
   */
  @VsoMethod
  public void setNetworkProfileRef(String  networkProfileRef) {
    this.networkProfileRef = networkProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Network security policies for the virtual service.
   * It is a reference to an object of type networksecuritypolicy.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkSecurityPolicyRef
   */
  @VsoMethod
  public String getNetworkSecurityPolicyRef() {
    return networkSecurityPolicyRef;
  }

  /**
   * This is the setter method to the attribute.
   * Network security policies for the virtual service.
   * It is a reference to an object of type networksecuritypolicy.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param networkSecurityPolicyRef set the networkSecurityPolicyRef.
   */
  @VsoMethod
  public void setNetworkSecurityPolicyRef(String  networkSecurityPolicyRef) {
    this.networkSecurityPolicyRef = networkSecurityPolicyRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A list of nsx groups representing the clients which can access the virtual ip of the virtual service.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nsxSecuritygroup
   */
  @VsoMethod
  public List<String> getNsxSecuritygroup() {
    return nsxSecuritygroup;
  }

  /**
   * This is the setter method. this will set the nsxSecuritygroup
   * A list of nsx groups representing the clients which can access the virtual ip of the virtual service.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nsxSecuritygroup
   */
  @VsoMethod
  public void setNsxSecuritygroup(List<String>  nsxSecuritygroup) {
    this.nsxSecuritygroup = nsxSecuritygroup;
  }

  /**
   * This is the setter method this will set the nsxSecuritygroup
   * A list of nsx groups representing the clients which can access the virtual ip of the virtual service.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nsxSecuritygroup
   */
  @VsoMethod
  public VirtualService addNsxSecuritygroupItem(String nsxSecuritygroupItem) {
    if (this.nsxSecuritygroup == null) {
      this.nsxSecuritygroup = new ArrayList<String>();
    }
    this.nsxSecuritygroup.add(nsxSecuritygroupItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Virtualservice specific oauth config.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return oauthVsConfig
   */
  @VsoMethod
  public OAuthVSConfig getOauthVsConfig() {
    return oauthVsConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Virtualservice specific oauth config.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param oauthVsConfig set the oauthVsConfig.
   */
  @VsoMethod
  public void setOauthVsConfig(OAuthVSConfig oauthVsConfig) {
    this.oauthVsConfig = oauthVsConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Optional settings that determine performance limits like max connections or bandwdith etc.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return performanceLimits
   */
  @VsoMethod
  public PerformanceLimits getPerformanceLimits() {
    return performanceLimits;
  }

  /**
   * This is the setter method to the attribute.
   * Optional settings that determine performance limits like max connections or bandwdith etc.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param performanceLimits set the performanceLimits.
   */
  @VsoMethod
  public void setPerformanceLimits(PerformanceLimits performanceLimits) {
    this.performanceLimits = performanceLimits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The pool group is an object that contains pools.
   * It is a reference to an object of type poolgroup.
   * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolGroupRef
   */
  @VsoMethod
  public String getPoolGroupRef() {
    return poolGroupRef;
  }

  /**
   * This is the setter method to the attribute.
   * The pool group is an object that contains pools.
   * It is a reference to an object of type poolgroup.
   * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolGroupRef set the poolGroupRef.
   */
  @VsoMethod
  public void setPoolGroupRef(String  poolGroupRef) {
    this.poolGroupRef = poolGroupRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The pool is an object that contains destination servers and related attributes such as load-balancing and persistence.
   * It is a reference to an object of type pool.
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
   * The pool is an object that contains destination servers and related attributes such as load-balancing and persistence.
   * It is a reference to an object of type pool.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolRef set the poolRef.
   */
  @VsoMethod
  public void setPoolRef(String  poolRef) {
    this.poolRef = poolRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Remove listening port if virtualservice is down.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return removeListeningPortOnVsDown
   */
  @VsoMethod
  public Boolean getRemoveListeningPortOnVsDown() {
    return removeListeningPortOnVsDown;
  }

  /**
   * This is the setter method to the attribute.
   * Remove listening port if virtualservice is down.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param removeListeningPortOnVsDown set the removeListeningPortOnVsDown.
   */
  @VsoMethod
  public void setRemoveListeningPortOnVsDown(Boolean  removeListeningPortOnVsDown) {
    this.removeListeningPortOnVsDown = removeListeningPortOnVsDown;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rate limit the incoming requests to this virtual service.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requestsRateLimit
   */
  @VsoMethod
  public RateProfile getRequestsRateLimit() {
    return requestsRateLimit;
  }

  /**
   * This is the setter method to the attribute.
   * Rate limit the incoming requests to this virtual service.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param requestsRateLimit set the requestsRateLimit.
   */
  @VsoMethod
  public void setRequestsRateLimit(RateProfile requestsRateLimit) {
    this.requestsRateLimit = requestsRateLimit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Application-specific saml config.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return samlSpConfig
   */
  @VsoMethod
  public SAMLSPConfig getSamlSpConfig() {
    return samlSpConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Application-specific saml config.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param samlSpConfig set the samlSpConfig.
   */
  @VsoMethod
  public void setSamlSpConfig(SAMLSPConfig samlSpConfig) {
    this.samlSpConfig = samlSpConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Disable re-distribution of flows across service engines for a virtual service.
   * Enable if the network itself performs flow hashing with ecmp in environments such as gcp.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return scaleoutEcmp
   */
  @VsoMethod
  public Boolean getScaleoutEcmp() {
    return scaleoutEcmp;
  }

  /**
   * This is the setter method to the attribute.
   * Disable re-distribution of flows across service engines for a virtual service.
   * Enable if the network itself performs flow hashing with ecmp in environments such as gcp.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param scaleoutEcmp set the scaleoutEcmp.
   */
  @VsoMethod
  public void setScaleoutEcmp(Boolean  scaleoutEcmp) {
    this.scaleoutEcmp = scaleoutEcmp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The service engine group to use for this virtual service.
   * Moving to a new se group is disruptive to existing connections for this vs.
   * It is a reference to an object of type serviceenginegroup.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGroupRef
   */
  @VsoMethod
  public String getSeGroupRef() {
    return seGroupRef;
  }

  /**
   * This is the setter method to the attribute.
   * The service engine group to use for this virtual service.
   * Moving to a new se group is disruptive to existing connections for this vs.
   * It is a reference to an object of type serviceenginegroup.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGroupRef set the seGroupRef.
   */
  @VsoMethod
  public void setSeGroupRef(String  seGroupRef) {
    this.seGroupRef = seGroupRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Security policy applied on the traffic of the virtual service.
   * This policy is used to perform security actions such as distributed denial of service (ddos) attack mitigation, etc.
   * It is a reference to an object of type securitypolicy.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return securityPolicyRef
   */
  @VsoMethod
  public String getSecurityPolicyRef() {
    return securityPolicyRef;
  }

  /**
   * This is the setter method to the attribute.
   * Security policy applied on the traffic of the virtual service.
   * This policy is used to perform security actions such as distributed denial of service (ddos) attack mitigation, etc.
   * It is a reference to an object of type securitypolicy.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param securityPolicyRef set the securityPolicyRef.
   */
  @VsoMethod
  public void setSecurityPolicyRef(String  securityPolicyRef) {
    this.securityPolicyRef = securityPolicyRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Determines the network settings profile for the server side of tcp proxied connections.
   * Leave blank to use the same settings as the client to vs side of the connection.
   * It is a reference to an object of type networkprofile.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverNetworkProfileRef
   */
  @VsoMethod
  public String getServerNetworkProfileRef() {
    return serverNetworkProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Determines the network settings profile for the server side of tcp proxied connections.
   * Leave blank to use the same settings as the client to vs side of the connection.
   * It is a reference to an object of type networkprofile.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverNetworkProfileRef set the serverNetworkProfileRef.
   */
  @VsoMethod
  public void setServerNetworkProfileRef(String  serverNetworkProfileRef) {
    this.serverNetworkProfileRef = serverNetworkProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Metadata pertaining to the service provided by this virtual service.
   * In openshift/kubernetes environments, egress pod info is stored.
   * Any user input to this field will be overwritten by avi vantage.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceMetadata
   */
  @VsoMethod
  public String getServiceMetadata() {
    return serviceMetadata;
  }

  /**
   * This is the setter method to the attribute.
   * Metadata pertaining to the service provided by this virtual service.
   * In openshift/kubernetes environments, egress pod info is stored.
   * Any user input to this field will be overwritten by avi vantage.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceMetadata set the serviceMetadata.
   */
  @VsoMethod
  public void setServiceMetadata(String  serviceMetadata) {
    this.serviceMetadata = serviceMetadata;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Select pool based on destination port.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return servicePoolSelect
   */
  @VsoMethod
  public List<ServicePoolSelector> getServicePoolSelect() {
    return servicePoolSelect;
  }

  /**
   * This is the setter method. this will set the servicePoolSelect
   * Select pool based on destination port.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return servicePoolSelect
   */
  @VsoMethod
  public void setServicePoolSelect(List<ServicePoolSelector>  servicePoolSelect) {
    this.servicePoolSelect = servicePoolSelect;
  }

  /**
   * This is the setter method this will set the servicePoolSelect
   * Select pool based on destination port.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return servicePoolSelect
   */
  @VsoMethod
  public VirtualService addServicePoolSelectItem(ServicePoolSelector servicePoolSelectItem) {
    if (this.servicePoolSelect == null) {
      this.servicePoolSelect = new ArrayList<ServicePoolSelector>();
    }
    this.servicePoolSelect.add(servicePoolSelectItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * List of services defined for this virtual service.
   * Maximum of 2048 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return services
   */
  @VsoMethod
  public List<com.vmware.avi.vro.model.Service> getServices() {
    return services;
  }

  /**
   * This is the setter method. this will set the services
   * List of services defined for this virtual service.
   * Maximum of 2048 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return services
   */
  @VsoMethod
  public void setServices(List<com.vmware.avi.vro.model.Service>  services) {
    this.services = services;
  }

  /**
   * This is the setter method this will set the services
   * List of services defined for this virtual service.
   * Maximum of 2048 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return services
   */
  @VsoMethod
  public VirtualService addServicesItem(com.vmware.avi.vro.model.Service servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<com.vmware.avi.vro.model.Service>();
    }
    this.services.add(servicesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Sideband configuration to be used for this virtualservice.it can be used for sending traffic to sideband vips for external inspection etc.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sidebandProfile
   */
  @VsoMethod
  public SidebandProfile getSidebandProfile() {
    return sidebandProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Sideband configuration to be used for this virtualservice.it can be used for sending traffic to sideband vips for external inspection etc.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sidebandProfile set the sidebandProfile.
   */
  @VsoMethod
  public void setSidebandProfile(SidebandProfile sidebandProfile) {
    this.sidebandProfile = sidebandProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Nat'ted floating source ip address(es) for upstream connection to servers.
   * Maximum of 32 items allowed.
   * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return snatIp
   */
  @VsoMethod
  public List<IpAddr> getSnatIp() {
    return snatIp;
  }

  /**
   * This is the setter method. this will set the snatIp
   * Nat'ted floating source ip address(es) for upstream connection to servers.
   * Maximum of 32 items allowed.
   * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return snatIp
   */
  @VsoMethod
  public void setSnatIp(List<IpAddr>  snatIp) {
    this.snatIp = snatIp;
  }

  /**
   * This is the setter method this will set the snatIp
   * Nat'ted floating source ip address(es) for upstream connection to servers.
   * Maximum of 32 items allowed.
   * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return snatIp
   */
  @VsoMethod
  public VirtualService addSnatIpItem(IpAddr snatIpItem) {
    if (this.snatIp == null) {
      this.snatIp = new ArrayList<IpAddr>();
    }
    this.snatIp.add(snatIpItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Gslb pools used to manage site-persistence functionality.
   * Each site-persistence pool contains the virtualservices in all the other sites, that is auto-generated by the gslb manager.
   * This is a read-only field for the user.
   * It is a reference to an object of type pool.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return spPoolRefs
   */
  @VsoMethod
  public List<String> getSpPoolRefs() {
    return spPoolRefs;
  }

  /**
   * This is the setter method. this will set the spPoolRefs
   * Gslb pools used to manage site-persistence functionality.
   * Each site-persistence pool contains the virtualservices in all the other sites, that is auto-generated by the gslb manager.
   * This is a read-only field for the user.
   * It is a reference to an object of type pool.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return spPoolRefs
   */
  @VsoMethod
  public void setSpPoolRefs(List<String>  spPoolRefs) {
    this.spPoolRefs = spPoolRefs;
  }

  /**
   * This is the setter method this will set the spPoolRefs
   * Gslb pools used to manage site-persistence functionality.
   * Each site-persistence pool contains the virtualservices in all the other sites, that is auto-generated by the gslb manager.
   * This is a read-only field for the user.
   * It is a reference to an object of type pool.
   * Field introduced in 17.2.2.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * @return spPoolRefs
   */
  @VsoMethod
  public VirtualService addSpPoolRefsItem(String spPoolRefsItem) {
    if (this.spPoolRefs == null) {
      this.spPoolRefs = new ArrayList<String>();
    }
    this.spPoolRefs.add(spPoolRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Select or create one or two certificates, ec and/or rsa, that will be presented to ssl/tls terminated connections.
   * It is a reference to an object of type sslkeyandcertificate.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslKeyAndCertificateRefs
   */
  @VsoMethod
  public List<String> getSslKeyAndCertificateRefs() {
    return sslKeyAndCertificateRefs;
  }

  /**
   * This is the setter method. this will set the sslKeyAndCertificateRefs
   * Select or create one or two certificates, ec and/or rsa, that will be presented to ssl/tls terminated connections.
   * It is a reference to an object of type sslkeyandcertificate.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslKeyAndCertificateRefs
   */
  @VsoMethod
  public void setSslKeyAndCertificateRefs(List<String>  sslKeyAndCertificateRefs) {
    this.sslKeyAndCertificateRefs = sslKeyAndCertificateRefs;
  }

  /**
   * This is the setter method this will set the sslKeyAndCertificateRefs
   * Select or create one or two certificates, ec and/or rsa, that will be presented to ssl/tls terminated connections.
   * It is a reference to an object of type sslkeyandcertificate.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslKeyAndCertificateRefs
   */
  @VsoMethod
  public VirtualService addSslKeyAndCertificateRefsItem(String sslKeyAndCertificateRefsItem) {
    if (this.sslKeyAndCertificateRefs == null) {
      this.sslKeyAndCertificateRefs = new ArrayList<String>();
    }
    this.sslKeyAndCertificateRefs.add(sslKeyAndCertificateRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Determines the set of ssl versions and ciphers to accept for ssl/tls terminated connections.
   * It is a reference to an object of type sslprofile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslProfileRef
   */
  @VsoMethod
  public String getSslProfileRef() {
    return sslProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Determines the set of ssl versions and ciphers to accept for ssl/tls terminated connections.
   * It is a reference to an object of type sslprofile.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sslProfileRef set the sslProfileRef.
   */
  @VsoMethod
  public void setSslProfileRef(String  sslProfileRef) {
    this.sslProfileRef = sslProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Select ssl profile based on client ip address match.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslProfileSelectors
   */
  @VsoMethod
  public List<SSLProfileSelector> getSslProfileSelectors() {
    return sslProfileSelectors;
  }

  /**
   * This is the setter method. this will set the sslProfileSelectors
   * Select ssl profile based on client ip address match.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslProfileSelectors
   */
  @VsoMethod
  public void setSslProfileSelectors(List<SSLProfileSelector>  sslProfileSelectors) {
    this.sslProfileSelectors = sslProfileSelectors;
  }

  /**
   * This is the setter method this will set the sslProfileSelectors
   * Select ssl profile based on client ip address match.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslProfileSelectors
   */
  @VsoMethod
  public VirtualService addSslProfileSelectorsItem(SSLProfileSelector sslProfileSelectorsItem) {
    if (this.sslProfileSelectors == null) {
      this.sslProfileSelectors = new ArrayList<SSLProfileSelector>();
    }
    this.sslProfileSelectors.add(sslProfileSelectorsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Expected number of ssl session cache entries (may be exceeded).
   * Allowed values are 1024-16383.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
   * @return sslSessCacheAvgSize
   */
  @VsoMethod
  public Integer getSslSessCacheAvgSize() {
    return sslSessCacheAvgSize;
  }

  /**
   * This is the setter method to the attribute.
   * Expected number of ssl session cache entries (may be exceeded).
   * Allowed values are 1024-16383.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
   * @param sslSessCacheAvgSize set the sslSessCacheAvgSize.
   */
  @VsoMethod
  public void setSslSessCacheAvgSize(Integer  sslSessCacheAvgSize) {
    this.sslSessCacheAvgSize = sslSessCacheAvgSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The sso policy attached to the virtualservice.
   * It is a reference to an object of type ssopolicy.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ssoPolicyRef
   */
  @VsoMethod
  public String getSsoPolicyRef() {
    return ssoPolicyRef;
  }

  /**
   * This is the setter method to the attribute.
   * The sso policy attached to the virtualservice.
   * It is a reference to an object of type ssopolicy.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ssoPolicyRef set the ssoPolicyRef.
   */
  @VsoMethod
  public void setSsoPolicyRef(String  ssoPolicyRef) {
    this.ssoPolicyRef = ssoPolicyRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of static dns records applied to this virtual service.
   * These are static entries and no health monitoring is performed against the ip addresses.
   * Maximum of 1000 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return staticDnsRecords
   */
  @VsoMethod
  public List<DnsRecord> getStaticDnsRecords() {
    return staticDnsRecords;
  }

  /**
   * This is the setter method. this will set the staticDnsRecords
   * List of static dns records applied to this virtual service.
   * These are static entries and no health monitoring is performed against the ip addresses.
   * Maximum of 1000 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return staticDnsRecords
   */
  @VsoMethod
  public void setStaticDnsRecords(List<DnsRecord>  staticDnsRecords) {
    this.staticDnsRecords = staticDnsRecords;
  }

  /**
   * This is the setter method this will set the staticDnsRecords
   * List of static dns records applied to this virtual service.
   * These are static entries and no health monitoring is performed against the ip addresses.
   * Maximum of 1000 items allowed.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return staticDnsRecords
   */
  @VsoMethod
  public VirtualService addStaticDnsRecordsItem(DnsRecord staticDnsRecordsItem) {
    if (this.staticDnsRecords == null) {
      this.staticDnsRecords = new ArrayList<DnsRecord>();
    }
    this.staticDnsRecords.add(staticDnsRecordsItem);
    return this;
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
   * Used for testing se datastore upgrade 2.0 functionality.
   * It is a reference to an object of type testsedatastorelevel1.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return testSeDatastoreLevel1Ref
   */
  @VsoMethod
  public String getTestSeDatastoreLevel1Ref() {
    return testSeDatastoreLevel1Ref;
  }

  /**
   * This is the setter method to the attribute.
   * Used for testing se datastore upgrade 2.0 functionality.
   * It is a reference to an object of type testsedatastorelevel1.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param testSeDatastoreLevel1Ref set the testSeDatastoreLevel1Ref.
   */
  @VsoMethod
  public void setTestSeDatastoreLevel1Ref(String  testSeDatastoreLevel1Ref) {
    this.testSeDatastoreLevel1Ref = testSeDatastoreLevel1Ref;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Topology policies applied on the dns traffic of the virtual service based ongslb topology algorithm.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return topologyPolicies
   */
  @VsoMethod
  public List<DnsPolicies> getTopologyPolicies() {
    return topologyPolicies;
  }

  /**
   * This is the setter method. this will set the topologyPolicies
   * Topology policies applied on the dns traffic of the virtual service based ongslb topology algorithm.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return topologyPolicies
   */
  @VsoMethod
  public void setTopologyPolicies(List<DnsPolicies>  topologyPolicies) {
    this.topologyPolicies = topologyPolicies;
  }

  /**
   * This is the setter method this will set the topologyPolicies
   * Topology policies applied on the dns traffic of the virtual service based ongslb topology algorithm.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return topologyPolicies
   */
  @VsoMethod
  public VirtualService addTopologyPoliciesItem(DnsPolicies topologyPoliciesItem) {
    if (this.topologyPolicies == null) {
      this.topologyPolicies = new ArrayList<DnsPolicies>();
    }
    this.topologyPolicies.add(topologyPoliciesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Server network or list of servers for cloning traffic.
   * It is a reference to an object of type trafficcloneprofile.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return trafficCloneProfileRef
   */
  @VsoMethod
  public String getTrafficCloneProfileRef() {
    return trafficCloneProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Server network or list of servers for cloning traffic.
   * It is a reference to an object of type trafficcloneprofile.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param trafficCloneProfileRef set the trafficCloneProfileRef.
   */
  @VsoMethod
  public void setTrafficCloneProfileRef(String  trafficCloneProfileRef) {
    this.trafficCloneProfileRef = trafficCloneProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Knob to enable the virtual service traffic on its assigned service engines.
   * This setting is effective only when the enabled flag is set to true.
   * Field introduced in 17.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return trafficEnabled
   */
  @VsoMethod
  public Boolean getTrafficEnabled() {
    return trafficEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Knob to enable the virtual service traffic on its assigned service engines.
   * This setting is effective only when the enabled flag is set to true.
   * Field introduced in 17.2.8.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param trafficEnabled set the trafficEnabled.
   */
  @VsoMethod
  public void setTrafficEnabled(Boolean  trafficEnabled) {
    this.trafficEnabled = trafficEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specify if this is a normal virtual service, or if it is the parent or child of an sni-enabled virtual hosted virtual service.
   * Enum options - VS_TYPE_NORMAL, VS_TYPE_VH_PARENT, VS_TYPE_VH_CHILD.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- vs_type_normal), basic edition(allowed values-
   * vs_type_normal,vs_type_vh_parent), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "VS_TYPE_NORMAL".
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Specify if this is a normal virtual service, or if it is the parent or child of an sni-enabled virtual hosted virtual service.
   * Enum options - VS_TYPE_NORMAL, VS_TYPE_VH_PARENT, VS_TYPE_VH_CHILD.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- vs_type_normal), basic edition(allowed values-
   * vs_type_normal,vs_type_vh_parent), enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "VS_TYPE_NORMAL".
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
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
   * Use bridge ip as vip on each host in mesos deployments.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useBridgeIpAsVip
   */
  @VsoMethod
  public Boolean getUseBridgeIpAsVip() {
    return useBridgeIpAsVip;
  }

  /**
   * This is the setter method to the attribute.
   * Use bridge ip as vip on each host in mesos deployments.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
   * cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useBridgeIpAsVip set the useBridgeIpAsVip.
   */
  @VsoMethod
  public void setUseBridgeIpAsVip(Boolean  useBridgeIpAsVip) {
    this.useBridgeIpAsVip = useBridgeIpAsVip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use the virtual ip as the snat ip for health monitoring and sending traffic to the backend servers instead of the service engine interface ip.
   * The caveat of enabling this option is that the virtualservice cannot be configued in an active-active ha mode.
   * Dns based multi vip solution has to be used for ha & non-disruptive upgrade purposes.
   * Field introduced in 17.1.9,17.2.3.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useVipAsSnat
   */
  @VsoMethod
  public Boolean getUseVipAsSnat() {
    return useVipAsSnat;
  }

  /**
   * This is the setter method to the attribute.
   * Use the virtual ip as the snat ip for health monitoring and sending traffic to the backend servers instead of the service engine interface ip.
   * The caveat of enabling this option is that the virtualservice cannot be configued in an active-active ha mode.
   * Dns based multi vip solution has to be used for ha & non-disruptive upgrade purposes.
   * Field introduced in 17.1.9,17.2.3.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useVipAsSnat set the useVipAsSnat.
   */
  @VsoMethod
  public void setUseVipAsSnat(Boolean  useVipAsSnat) {
    this.useVipAsSnat = useVipAsSnat;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the virtualservice.
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
   * Uuid of the virtualservice.
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
   * The exact name requested from the client's sni-enabled tls hello domain name field.
   * If this is a match, the parent vs will forward the connection to this child vs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vhDomainName
   */
  @VsoMethod
  public List<String> getVhDomainName() {
    return vhDomainName;
  }

  /**
   * This is the setter method. this will set the vhDomainName
   * The exact name requested from the client's sni-enabled tls hello domain name field.
   * If this is a match, the parent vs will forward the connection to this child vs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vhDomainName
   */
  @VsoMethod
  public void setVhDomainName(List<String>  vhDomainName) {
    this.vhDomainName = vhDomainName;
  }

  /**
   * This is the setter method this will set the vhDomainName
   * The exact name requested from the client's sni-enabled tls hello domain name field.
   * If this is a match, the parent vs will forward the connection to this child vs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vhDomainName
   */
  @VsoMethod
  public VirtualService addVhDomainNameItem(String vhDomainNameItem) {
    if (this.vhDomainName == null) {
      this.vhDomainName = new ArrayList<String>();
    }
    this.vhDomainName.add(vhDomainNameItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Host and path match criteria to select this child vs.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vhMatches
   */
  @VsoMethod
  public List<VHMatch> getVhMatches() {
    return vhMatches;
  }

  /**
   * This is the setter method. this will set the vhMatches
   * Host and path match criteria to select this child vs.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vhMatches
   */
  @VsoMethod
  public void setVhMatches(List<VHMatch>  vhMatches) {
    this.vhMatches = vhMatches;
  }

  /**
   * This is the setter method this will set the vhMatches
   * Host and path match criteria to select this child vs.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vhMatches
   */
  @VsoMethod
  public VirtualService addVhMatchesItem(VHMatch vhMatchesItem) {
    if (this.vhMatches == null) {
      this.vhMatches = new ArrayList<VHMatch>();
    }
    this.vhMatches.add(vhMatchesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Specifies the virtual service acting as virtual hosting (sni) parent.
   * It is a reference to an object of type virtualservice.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vhParentVsRef
   */
  @VsoMethod
  public String getVhParentVsRef() {
    return vhParentVsRef;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the virtual service acting as virtual hosting (sni) parent.
   * It is a reference to an object of type virtualservice.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vhParentVsRef set the vhParentVsRef.
   */
  @VsoMethod
  public void setVhParentVsRef(String  vhParentVsRef) {
    this.vhParentVsRef = vhParentVsRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specify if the virtual hosting vs is of type sni or enhanced.
   * Enum options - VS_TYPE_VH_SNI, VS_TYPE_VH_ENHANCED.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, basic edition(allowed values- vs_type_vh_enhanced), enterprise with cloud services edition.
   * Special default for basic edition is vs_type_vh_enhanced, enterprise is vs_type_vh_sni.
   * @return vhType
   */
  @VsoMethod
  public String getVhType() {
    return vhType;
  }

  /**
   * This is the setter method to the attribute.
   * Specify if the virtual hosting vs is of type sni or enhanced.
   * Enum options - VS_TYPE_VH_SNI, VS_TYPE_VH_ENHANCED.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, basic edition(allowed values- vs_type_vh_enhanced), enterprise with cloud services edition.
   * Special default for basic edition is vs_type_vh_enhanced, enterprise is vs_type_vh_sni.
   * @param vhType set the vhType.
   */
  @VsoMethod
  public void setVhType(String  vhType) {
    this.vhType = vhType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of virtual service ips.
   * While creating a 'shared vs',please use vsvip_ref to point to the shared entities.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vip
   */
  @VsoMethod
  public List<Vip> getVip() {
    return vip;
  }

  /**
   * This is the setter method. this will set the vip
   * List of virtual service ips.
   * While creating a 'shared vs',please use vsvip_ref to point to the shared entities.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vip
   */
  @VsoMethod
  public void setVip(List<Vip>  vip) {
    this.vip = vip;
  }

  /**
   * This is the setter method this will set the vip
   * List of virtual service ips.
   * While creating a 'shared vs',please use vsvip_ref to point to the shared entities.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vip
   */
  @VsoMethod
  public VirtualService addVipItem(Vip vipItem) {
    if (this.vip == null) {
      this.vip = new ArrayList<Vip>();
    }
    this.vip.add(vipItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Virtual routing context that the virtual service is bound to.
   * This is used to provide the isolation of the set of networks the application is attached to.
   * It is a reference to an object of type vrfcontext.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vrfContextRef
   */
  @VsoMethod
  public String getVrfContextRef() {
    return vrfContextRef;
  }

  /**
   * This is the setter method to the attribute.
   * Virtual routing context that the virtual service is bound to.
   * This is used to provide the isolation of the set of networks the application is attached to.
   * It is a reference to an object of type vrfcontext.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vrfContextRef set the vrfContextRef.
   */
  @VsoMethod
  public void setVrfContextRef(String  vrfContextRef) {
    this.vrfContextRef = vrfContextRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Datascripts applied on the data traffic of the virtual service.
   * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsDatascripts
   */
  @VsoMethod
  public List<VSDataScripts> getVsDatascripts() {
    return vsDatascripts;
  }

  /**
   * This is the setter method. this will set the vsDatascripts
   * Datascripts applied on the data traffic of the virtual service.
   * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsDatascripts
   */
  @VsoMethod
  public void setVsDatascripts(List<VSDataScripts>  vsDatascripts) {
    this.vsDatascripts = vsDatascripts;
  }

  /**
   * This is the setter method this will set the vsDatascripts
   * Datascripts applied on the data traffic of the virtual service.
   * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsDatascripts
   */
  @VsoMethod
  public VirtualService addVsDatascriptsItem(VSDataScripts vsDatascriptsItem) {
    if (this.vsDatascripts == null) {
      this.vsDatascripts = new ArrayList<VSDataScripts>();
    }
    this.vsDatascripts.add(vsDatascriptsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Mostly used during the creation of shared vs, this field refers to entities that can be shared across virtual services.
   * It is a reference to an object of type vsvip.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsvipRef
   */
  @VsoMethod
  public String getVsvipRef() {
    return vsvipRef;
  }

  /**
   * This is the setter method to the attribute.
   * Mostly used during the creation of shared vs, this field refers to entities that can be shared across virtual services.
   * It is a reference to an object of type vsvip.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsvipRef set the vsvipRef.
   */
  @VsoMethod
  public void setVsvipRef(String  vsvipRef) {
    this.vsvipRef = vsvipRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf policy for the virtual service.
   * It is a reference to an object of type wafpolicy.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return wafPolicyRef
   */
  @VsoMethod
  public String getWafPolicyRef() {
    return wafPolicyRef;
  }

  /**
   * This is the setter method to the attribute.
   * Waf policy for the virtual service.
   * It is a reference to an object of type wafpolicy.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param wafPolicyRef set the wafPolicyRef.
   */
  @VsoMethod
  public void setWafPolicyRef(String  wafPolicyRef) {
    this.wafPolicyRef = wafPolicyRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The quality of service weight to assign to traffic transmitted from this virtual service.
   * A higher weight will prioritize traffic versus other virtual services sharing the same service engines.
   * Allowed values are 1-128.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 1), basic edition(allowed values- 1), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return weight
   */
  @VsoMethod
  public Integer getWeight() {
    return weight;
  }

  /**
   * This is the setter method to the attribute.
   * The quality of service weight to assign to traffic transmitted from this virtual service.
   * A higher weight will prioritize traffic versus other virtual services sharing the same service engines.
   * Allowed values are 1-128.
   * Allowed in enterprise edition with any value, essentials edition(allowed values- 1), basic edition(allowed values- 1), enterprise with cloud
   * services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param weight set the weight.
   */
  @VsoMethod
  public void setWeight(Integer  weight) {
    this.weight = weight;
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
  VirtualService objVirtualService = (VirtualService) o;
  return   Objects.equals(this.uuid, objVirtualService.uuid)&&
  Objects.equals(this.name, objVirtualService.name)&&
  Objects.equals(this.fqdn, objVirtualService.fqdn)&&
  Objects.equals(this.enabled, objVirtualService.enabled)&&
  Objects.equals(this.services, objVirtualService.services)&&
  Objects.equals(this.applicationProfileRef, objVirtualService.applicationProfileRef)&&
  Objects.equals(this.networkProfileRef, objVirtualService.networkProfileRef)&&
  Objects.equals(this.serverNetworkProfileRef, objVirtualService.serverNetworkProfileRef)&&
  Objects.equals(this.poolRef, objVirtualService.poolRef)&&
  Objects.equals(this.seGroupRef, objVirtualService.seGroupRef)&&
  Objects.equals(this.networkSecurityPolicyRef, objVirtualService.networkSecurityPolicyRef)&&
  Objects.equals(this.httpPolicies, objVirtualService.httpPolicies)&&
  Objects.equals(this.dnsPolicies, objVirtualService.dnsPolicies)&&
  Objects.equals(this.securityPolicyRef, objVirtualService.securityPolicyRef)&&
  Objects.equals(this.sslKeyAndCertificateRefs, objVirtualService.sslKeyAndCertificateRefs)&&
  Objects.equals(this.sslProfileRef, objVirtualService.sslProfileRef)&&
  Objects.equals(this.performanceLimits, objVirtualService.performanceLimits)&&
  Objects.equals(this.analyticsPolicy, objVirtualService.analyticsPolicy)&&
  Objects.equals(this.vrfContextRef, objVirtualService.vrfContextRef)&&
  Objects.equals(this.enableAutogw, objVirtualService.enableAutogw)&&
  Objects.equals(this.analyticsProfileRef, objVirtualService.analyticsProfileRef)&&
  Objects.equals(this.hostNameXlate, objVirtualService.hostNameXlate)&&
  Objects.equals(this.vsDatascripts, objVirtualService.vsDatascripts)&&
  Objects.equals(this.weight, objVirtualService.weight)&&
  Objects.equals(this.delayFairness, objVirtualService.delayFairness)&&
  Objects.equals(this.maxCpsPerClient, objVirtualService.maxCpsPerClient)&&
  Objects.equals(this.limitDoser, objVirtualService.limitDoser)&&
  Objects.equals(this.type, objVirtualService.type)&&
  Objects.equals(this.vhParentVsRef, objVirtualService.vhParentVsRef)&&
  Objects.equals(this.vhDomainName, objVirtualService.vhDomainName)&&
  Objects.equals(this.cloudType, objVirtualService.cloudType)&&
  Objects.equals(this.connectionsRateLimit, objVirtualService.connectionsRateLimit)&&
  Objects.equals(this.requestsRateLimit, objVirtualService.requestsRateLimit)&&
  Objects.equals(this.useBridgeIpAsVip, objVirtualService.useBridgeIpAsVip)&&
  Objects.equals(this.flowDist, objVirtualService.flowDist)&&
  Objects.equals(this.ignPoolNetReach, objVirtualService.ignPoolNetReach)&&
  Objects.equals(this.sslSessCacheAvgSize, objVirtualService.sslSessCacheAvgSize)&&
  Objects.equals(this.poolGroupRef, objVirtualService.poolGroupRef)&&
  Objects.equals(this.removeListeningPortOnVsDown, objVirtualService.removeListeningPortOnVsDown)&&
  Objects.equals(this.closeClientConnOnConfigUpdate, objVirtualService.closeClientConnOnConfigUpdate)&&
  Objects.equals(this.bulkSyncKvcache, objVirtualService.bulkSyncKvcache)&&
  Objects.equals(this.topologyPolicies, objVirtualService.topologyPolicies)&&
  Objects.equals(this.advertiseDownVs, objVirtualService.advertiseDownVs)&&
  Objects.equals(this.description, objVirtualService.description)&&
  Objects.equals(this.tenantRef, objVirtualService.tenantRef)&&
  Objects.equals(this.cloudRef, objVirtualService.cloudRef)&&
  Objects.equals(this.eastWestPlacement, objVirtualService.eastWestPlacement)&&
  Objects.equals(this.scaleoutEcmp, objVirtualService.scaleoutEcmp)&&
  Objects.equals(this.microserviceRef, objVirtualService.microserviceRef)&&
  Objects.equals(this.servicePoolSelect, objVirtualService.servicePoolSelect)&&
  Objects.equals(this.createdBy, objVirtualService.createdBy)&&
  Objects.equals(this.cloudConfigCksum, objVirtualService.cloudConfigCksum)&&
  Objects.equals(this.enableRhi, objVirtualService.enableRhi)&&
  Objects.equals(this.snatIp, objVirtualService.snatIp)&&
  Objects.equals(this.activeStandbySeTag, objVirtualService.activeStandbySeTag)&&
  Objects.equals(this.flowLabelType, objVirtualService.flowLabelType)&&
  Objects.equals(this.enableRhiSnat, objVirtualService.enableRhiSnat)&&
  Objects.equals(this.staticDnsRecords, objVirtualService.staticDnsRecords)&&
  Objects.equals(this.dnsInfo, objVirtualService.dnsInfo)&&
  Objects.equals(this.serviceMetadata, objVirtualService.serviceMetadata)&&
  Objects.equals(this.trafficCloneProfileRef, objVirtualService.trafficCloneProfileRef)&&
  Objects.equals(this.contentRewrite, objVirtualService.contentRewrite)&&
  Objects.equals(this.sidebandProfile, objVirtualService.sidebandProfile)&&
  Objects.equals(this.vip, objVirtualService.vip)&&
  Objects.equals(this.nsxSecuritygroup, objVirtualService.nsxSecuritygroup)&&
  Objects.equals(this.vsvipRef, objVirtualService.vsvipRef)&&
  Objects.equals(this.wafPolicyRef, objVirtualService.wafPolicyRef)&&
  Objects.equals(this.spPoolRefs, objVirtualService.spPoolRefs)&&
  Objects.equals(this.useVipAsSnat, objVirtualService.useVipAsSnat)&&
  Objects.equals(this.errorPageProfileRef, objVirtualService.errorPageProfileRef)&&
  Objects.equals(this.l4Policies, objVirtualService.l4Policies)&&
  Objects.equals(this.trafficEnabled, objVirtualService.trafficEnabled)&&
  Objects.equals(this.bgpPeerLabels, objVirtualService.bgpPeerLabels)&&
  Objects.equals(this.markers, objVirtualService.markers)&&
  Objects.equals(this.azureAvailabilitySet, objVirtualService.azureAvailabilitySet)&&
  Objects.equals(this.minPoolsUp, objVirtualService.minPoolsUp)&&
  Objects.equals(this.allowInvalidClientCert, objVirtualService.allowInvalidClientCert)&&
  Objects.equals(this.sslProfileSelectors, objVirtualService.sslProfileSelectors)&&
  Objects.equals(this.ssoPolicyRef, objVirtualService.ssoPolicyRef)&&
  Objects.equals(this.samlSpConfig, objVirtualService.samlSpConfig)&&
  Objects.equals(this.testSeDatastoreLevel1Ref, objVirtualService.testSeDatastoreLevel1Ref)&&
  Objects.equals(this.icapRequestProfileRefs, objVirtualService.icapRequestProfileRefs)&&
  Objects.equals(this.jwtConfig, objVirtualService.jwtConfig)&&
  Objects.equals(this.vhMatches, objVirtualService.vhMatches)&&
  Objects.equals(this.vhType, objVirtualService.vhType)&&
  Objects.equals(this.botPolicyRef, objVirtualService.botPolicyRef)&&
  Objects.equals(this.ldapVsConfig, objVirtualService.ldapVsConfig)&&
  Objects.equals(this.oauthVsConfig, objVirtualService.oauthVsConfig);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VirtualService {\n");
      sb.append("    activeStandbySeTag: ").append(toIndentedString(activeStandbySeTag)).append("\n");
        sb.append("    advertiseDownVs: ").append(toIndentedString(advertiseDownVs)).append("\n");
        sb.append("    allowInvalidClientCert: ").append(toIndentedString(allowInvalidClientCert)).append("\n");
        sb.append("    analyticsPolicy: ").append(toIndentedString(analyticsPolicy)).append("\n");
        sb.append("    analyticsProfileRef: ").append(toIndentedString(analyticsProfileRef)).append("\n");
        sb.append("    applicationProfileRef: ").append(toIndentedString(applicationProfileRef)).append("\n");
        sb.append("    azureAvailabilitySet: ").append(toIndentedString(azureAvailabilitySet)).append("\n");
        sb.append("    bgpPeerLabels: ").append(toIndentedString(bgpPeerLabels)).append("\n");
        sb.append("    botPolicyRef: ").append(toIndentedString(botPolicyRef)).append("\n");
        sb.append("    bulkSyncKvcache: ").append(toIndentedString(bulkSyncKvcache)).append("\n");
        sb.append("    closeClientConnOnConfigUpdate: ").append(toIndentedString(closeClientConnOnConfigUpdate)).append("\n");
        sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
        sb.append("    connectionsRateLimit: ").append(toIndentedString(connectionsRateLimit)).append("\n");
        sb.append("    contentRewrite: ").append(toIndentedString(contentRewrite)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    delayFairness: ").append(toIndentedString(delayFairness)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dnsInfo: ").append(toIndentedString(dnsInfo)).append("\n");
        sb.append("    dnsPolicies: ").append(toIndentedString(dnsPolicies)).append("\n");
        sb.append("    eastWestPlacement: ").append(toIndentedString(eastWestPlacement)).append("\n");
        sb.append("    enableAutogw: ").append(toIndentedString(enableAutogw)).append("\n");
        sb.append("    enableRhi: ").append(toIndentedString(enableRhi)).append("\n");
        sb.append("    enableRhiSnat: ").append(toIndentedString(enableRhiSnat)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    errorPageProfileRef: ").append(toIndentedString(errorPageProfileRef)).append("\n");
        sb.append("    flowDist: ").append(toIndentedString(flowDist)).append("\n");
        sb.append("    flowLabelType: ").append(toIndentedString(flowLabelType)).append("\n");
        sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
        sb.append("    hostNameXlate: ").append(toIndentedString(hostNameXlate)).append("\n");
        sb.append("    httpPolicies: ").append(toIndentedString(httpPolicies)).append("\n");
        sb.append("    icapRequestProfileRefs: ").append(toIndentedString(icapRequestProfileRefs)).append("\n");
        sb.append("    ignPoolNetReach: ").append(toIndentedString(ignPoolNetReach)).append("\n");
        sb.append("    jwtConfig: ").append(toIndentedString(jwtConfig)).append("\n");
        sb.append("    l4Policies: ").append(toIndentedString(l4Policies)).append("\n");
        sb.append("    ldapVsConfig: ").append(toIndentedString(ldapVsConfig)).append("\n");
        sb.append("    limitDoser: ").append(toIndentedString(limitDoser)).append("\n");
        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
        sb.append("    maxCpsPerClient: ").append(toIndentedString(maxCpsPerClient)).append("\n");
        sb.append("    microserviceRef: ").append(toIndentedString(microserviceRef)).append("\n");
        sb.append("    minPoolsUp: ").append(toIndentedString(minPoolsUp)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    networkProfileRef: ").append(toIndentedString(networkProfileRef)).append("\n");
        sb.append("    networkSecurityPolicyRef: ").append(toIndentedString(networkSecurityPolicyRef)).append("\n");
        sb.append("    nsxSecuritygroup: ").append(toIndentedString(nsxSecuritygroup)).append("\n");
        sb.append("    oauthVsConfig: ").append(toIndentedString(oauthVsConfig)).append("\n");
        sb.append("    performanceLimits: ").append(toIndentedString(performanceLimits)).append("\n");
        sb.append("    poolGroupRef: ").append(toIndentedString(poolGroupRef)).append("\n");
        sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
        sb.append("    removeListeningPortOnVsDown: ").append(toIndentedString(removeListeningPortOnVsDown)).append("\n");
        sb.append("    requestsRateLimit: ").append(toIndentedString(requestsRateLimit)).append("\n");
        sb.append("    samlSpConfig: ").append(toIndentedString(samlSpConfig)).append("\n");
        sb.append("    scaleoutEcmp: ").append(toIndentedString(scaleoutEcmp)).append("\n");
        sb.append("    seGroupRef: ").append(toIndentedString(seGroupRef)).append("\n");
        sb.append("    securityPolicyRef: ").append(toIndentedString(securityPolicyRef)).append("\n");
        sb.append("    serverNetworkProfileRef: ").append(toIndentedString(serverNetworkProfileRef)).append("\n");
        sb.append("    serviceMetadata: ").append(toIndentedString(serviceMetadata)).append("\n");
        sb.append("    servicePoolSelect: ").append(toIndentedString(servicePoolSelect)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
        sb.append("    sidebandProfile: ").append(toIndentedString(sidebandProfile)).append("\n");
        sb.append("    snatIp: ").append(toIndentedString(snatIp)).append("\n");
        sb.append("    spPoolRefs: ").append(toIndentedString(spPoolRefs)).append("\n");
        sb.append("    sslKeyAndCertificateRefs: ").append(toIndentedString(sslKeyAndCertificateRefs)).append("\n");
        sb.append("    sslProfileRef: ").append(toIndentedString(sslProfileRef)).append("\n");
        sb.append("    sslProfileSelectors: ").append(toIndentedString(sslProfileSelectors)).append("\n");
        sb.append("    sslSessCacheAvgSize: ").append(toIndentedString(sslSessCacheAvgSize)).append("\n");
        sb.append("    ssoPolicyRef: ").append(toIndentedString(ssoPolicyRef)).append("\n");
        sb.append("    staticDnsRecords: ").append(toIndentedString(staticDnsRecords)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    testSeDatastoreLevel1Ref: ").append(toIndentedString(testSeDatastoreLevel1Ref)).append("\n");
        sb.append("    topologyPolicies: ").append(toIndentedString(topologyPolicies)).append("\n");
        sb.append("    trafficCloneProfileRef: ").append(toIndentedString(trafficCloneProfileRef)).append("\n");
        sb.append("    trafficEnabled: ").append(toIndentedString(trafficEnabled)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    useBridgeIpAsVip: ").append(toIndentedString(useBridgeIpAsVip)).append("\n");
        sb.append("    useVipAsSnat: ").append(toIndentedString(useVipAsSnat)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vhDomainName: ").append(toIndentedString(vhDomainName)).append("\n");
        sb.append("    vhMatches: ").append(toIndentedString(vhMatches)).append("\n");
        sb.append("    vhParentVsRef: ").append(toIndentedString(vhParentVsRef)).append("\n");
        sb.append("    vhType: ").append(toIndentedString(vhType)).append("\n");
        sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
        sb.append("    vrfContextRef: ").append(toIndentedString(vrfContextRef)).append("\n");
        sb.append("    vsDatascripts: ").append(toIndentedString(vsDatascripts)).append("\n");
        sb.append("    vsvipRef: ").append(toIndentedString(vsvipRef)).append("\n");
        sb.append("    wafPolicyRef: ").append(toIndentedString(wafPolicyRef)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

