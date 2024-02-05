package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GslbServiceDownResponse;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbService is a POJO class extends AviRestResource that used for creating
 * GslbService.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbService")
@VsoFinder(name = Constants.FINDER_VRO_GSLBSERVICE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbService extends AviRestResource {
    @JsonProperty("application_persistence_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String applicationPersistenceProfileRef;

    @JsonProperty("controller_health_status_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean controllerHealthStatusEnabled = true;

    @JsonProperty("created_by")
    @JsonInclude(Include.NON_NULL)
    private String createdBy;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("domain_names")
    @JsonInclude(Include.NON_NULL)
    private List<String> domainNames;

    @JsonProperty("down_response")
    @JsonInclude(Include.NON_NULL)
    private GslbServiceDownResponse downResponse;

    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled = true;

    @JsonProperty("groups")
    @JsonInclude(Include.NON_NULL)
    private List<GslbPool> groups;

    @JsonProperty("health_monitor_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> healthMonitorRefs;

    @JsonProperty("health_monitor_scope")
    @JsonInclude(Include.NON_NULL)
    private String healthMonitorScope = "GSLB_SERVICE_HEALTH_MONITOR_ALL_MEMBERS";

    @JsonProperty("is_federated")
    @JsonInclude(Include.NON_NULL)
    private Boolean isFederated = true;

    @JsonProperty("markers")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("min_members")
    @JsonInclude(Include.NON_NULL)
    private Integer minMembers = 0;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("num_dns_ip")
    @JsonInclude(Include.NON_NULL)
    private Integer numDnsIp;

    @JsonProperty("pki_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String pkiProfileRef;

    @JsonProperty("pool_algorithm")
    @JsonInclude(Include.NON_NULL)
    private String poolAlgorithm = "GSLB_SERVICE_ALGORITHM_PRIORITY";

    @JsonProperty("resolve_cname")
    @JsonInclude(Include.NON_NULL)
    private Boolean resolveCname = false;

    @JsonProperty("site_persistence_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean sitePersistenceEnabled = false;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("topology_policy_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean topologyPolicyEnabled = false;

    @JsonProperty("ttl")
    @JsonInclude(Include.NON_NULL)
    private Integer ttl;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("use_edns_client_subnet")
    @JsonInclude(Include.NON_NULL)
    private Boolean useEdnsClientSubnet = true;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("wildcard_match")
    @JsonInclude(Include.NON_NULL)
    private Boolean wildcardMatch = false;



  /**
   * This is the getter method this will return the attribute value.
   * The federated application persistence associated with gslbservice site persistence functionality.
   * It is a reference to an object of type applicationpersistenceprofile.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return applicationPersistenceProfileRef
   */
  @VsoMethod
  public String getApplicationPersistenceProfileRef() {
    return applicationPersistenceProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * The federated application persistence associated with gslbservice site persistence functionality.
   * It is a reference to an object of type applicationpersistenceprofile.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param applicationPersistenceProfileRef set the applicationPersistenceProfileRef.
   */
  @VsoMethod
  public void setApplicationPersistenceProfileRef(String  applicationPersistenceProfileRef) {
    this.applicationPersistenceProfileRef = applicationPersistenceProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Gs member's overall health status is derived based on a combination of controller and datapath health-status inputs.
   * Note that the datapath status is determined by the association of health monitor profiles.
   * Only the controller provided status is determined through this configuration.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return controllerHealthStatusEnabled
   */
  @VsoMethod
  public Boolean getControllerHealthStatusEnabled() {
    return controllerHealthStatusEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Gs member's overall health status is derived based on a combination of controller and datapath health-status inputs.
   * Note that the datapath status is determined by the association of health monitor profiles.
   * Only the controller provided status is determined through this configuration.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param controllerHealthStatusEnabled set the controllerHealthStatusEnabled.
   */
  @VsoMethod
  public void setControllerHealthStatusEnabled(Boolean  controllerHealthStatusEnabled) {
    this.controllerHealthStatusEnabled = controllerHealthStatusEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Creator name.
   * Field introduced in 17.1.2.
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
   * Field introduced in 17.1.2.
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
   * Fully qualified domain name of the gslb service.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return domainNames
   */
  @VsoMethod
  public List<String> getDomainNames() {
    return domainNames;
  }

  /**
   * This is the setter method. this will set the domainNames
   * Fully qualified domain name of the gslb service.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return domainNames
   */
  @VsoMethod
  public void setDomainNames(List<String>  domainNames) {
    this.domainNames = domainNames;
  }

  /**
   * This is the setter method this will set the domainNames
   * Fully qualified domain name of the gslb service.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return domainNames
   */
  @VsoMethod
  public GslbService addDomainNamesItem(String domainNamesItem) {
    if (this.domainNames == null) {
      this.domainNames = new ArrayList<String>();
    }
    this.domainNames.add(domainNamesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Response to the client query when the gslb service is down.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return downResponse
   */
  @VsoMethod
  public GslbServiceDownResponse getDownResponse() {
    return downResponse;
  }

  /**
   * This is the setter method to the attribute.
   * Response to the client query when the gslb service is down.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param downResponse set the downResponse.
   */
  @VsoMethod
  public void setDownResponse(GslbServiceDownResponse downResponse) {
    this.downResponse = downResponse;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable or disable the gslb service.
   * If the gslb service is enabled, then the vips are sent in the dns responses based on reachability and configured algorithm.
   * If the gslb service is disabled, then the vips are no longer available in the dns response.
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
   * Enable or disable the gslb service.
   * If the gslb service is enabled, then the vips are sent in the dns responses based on reachability and configured algorithm.
   * If the gslb service is disabled, then the vips are no longer available in the dns response.
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
   * Select list of pools belonging to this gslb service.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return groups
   */
  @VsoMethod
  public List<GslbPool> getGroups() {
    return groups;
  }

  /**
   * This is the setter method. this will set the groups
   * Select list of pools belonging to this gslb service.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return groups
   */
  @VsoMethod
  public void setGroups(List<GslbPool>  groups) {
    this.groups = groups;
  }

  /**
   * This is the setter method this will set the groups
   * Select list of pools belonging to this gslb service.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return groups
   */
  @VsoMethod
  public GslbService addGroupsItem(GslbPool groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<GslbPool>();
    }
    this.groups.add(groupsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Verify vs health by applying one or more health monitors.
   * Active monitors generate synthetic traffic from dns service engine and to mark a vs up or down based on the response.
   * It is a reference to an object of type healthmonitor.
   * Maximum of 6 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return healthMonitorRefs
   */
  @VsoMethod
  public List<String> getHealthMonitorRefs() {
    return healthMonitorRefs;
  }

  /**
   * This is the setter method. this will set the healthMonitorRefs
   * Verify vs health by applying one or more health monitors.
   * Active monitors generate synthetic traffic from dns service engine and to mark a vs up or down based on the response.
   * It is a reference to an object of type healthmonitor.
   * Maximum of 6 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return healthMonitorRefs
   */
  @VsoMethod
  public void setHealthMonitorRefs(List<String>  healthMonitorRefs) {
    this.healthMonitorRefs = healthMonitorRefs;
  }

  /**
   * This is the setter method this will set the healthMonitorRefs
   * Verify vs health by applying one or more health monitors.
   * Active monitors generate synthetic traffic from dns service engine and to mark a vs up or down based on the response.
   * It is a reference to an object of type healthmonitor.
   * Maximum of 6 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return healthMonitorRefs
   */
  @VsoMethod
  public GslbService addHealthMonitorRefsItem(String healthMonitorRefsItem) {
    if (this.healthMonitorRefs == null) {
      this.healthMonitorRefs = new ArrayList<String>();
    }
    this.healthMonitorRefs.add(healthMonitorRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Health monitor probe can be executed for all the members or it can be executed only for third-party members.
   * This operational mode is useful to reduce the number of health monitor probes in case of a hybrid scenario.
   * In such a case, avi members can have controller derived status while non-avi members can be probed by via health monitor probes in dataplane.
   * Enum options - GSLB_SERVICE_HEALTH_MONITOR_ALL_MEMBERS, GSLB_SERVICE_HEALTH_MONITOR_ONLY_NON_AVI_MEMBERS.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_SERVICE_HEALTH_MONITOR_ALL_MEMBERS".
   * @return healthMonitorScope
   */
  @VsoMethod
  public String getHealthMonitorScope() {
    return healthMonitorScope;
  }

  /**
   * This is the setter method to the attribute.
   * Health monitor probe can be executed for all the members or it can be executed only for third-party members.
   * This operational mode is useful to reduce the number of health monitor probes in case of a hybrid scenario.
   * In such a case, avi members can have controller derived status while non-avi members can be probed by via health monitor probes in dataplane.
   * Enum options - GSLB_SERVICE_HEALTH_MONITOR_ALL_MEMBERS, GSLB_SERVICE_HEALTH_MONITOR_ONLY_NON_AVI_MEMBERS.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_SERVICE_HEALTH_MONITOR_ALL_MEMBERS".
   * @param healthMonitorScope set the healthMonitorScope.
   */
  @VsoMethod
  public void setHealthMonitorScope(String  healthMonitorScope) {
    this.healthMonitorScope = healthMonitorScope;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field indicates that this object is replicated across gslb federation.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return isFederated
   */
  @VsoMethod
  public Boolean getIsFederated() {
    return isFederated;
  }

  /**
   * This is the setter method to the attribute.
   * This field indicates that this object is replicated across gslb federation.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param isFederated set the isFederated.
   */
  @VsoMethod
  public void setIsFederated(Boolean  isFederated) {
    this.isFederated = isFederated;
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
  public GslbService addMarkersItem(RoleFilterMatchLabel markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<RoleFilterMatchLabel>();
    }
    this.markers.add(markersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The minimum number of members to distribute traffic to.
   * Allowed values are 1-65535.
   * Special values are 0 - disable.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return minMembers
   */
  @VsoMethod
  public Integer getMinMembers() {
    return minMembers;
  }

  /**
   * This is the setter method to the attribute.
   * The minimum number of members to distribute traffic to.
   * Allowed values are 1-65535.
   * Special values are 0 - disable.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param minMembers set the minMembers.
   */
  @VsoMethod
  public void setMinMembers(Integer  minMembers) {
    this.minMembers = minMembers;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name for the gslb service.
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
   * Name for the gslb service.
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
   * Number of ip addresses of this gslb service to be returned by the dns service.
   * Enter 0 to return all ip addresses.
   * Allowed values are 1-20.
   * Special values are 0- return all ip addresses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numDnsIp
   */
  @VsoMethod
  public Integer getNumDnsIp() {
    return numDnsIp;
  }

  /**
   * This is the setter method to the attribute.
   * Number of ip addresses of this gslb service to be returned by the dns service.
   * Enter 0 to return all ip addresses.
   * Allowed values are 1-20.
   * Special values are 0- return all ip addresses.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numDnsIp set the numDnsIp.
   */
  @VsoMethod
  public void setNumDnsIp(Integer  numDnsIp) {
    this.numDnsIp = numDnsIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pki profile associated with the gslb service.
   * It is a reference to an object of type pkiprofile.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pkiProfileRef
   */
  @VsoMethod
  public String getPkiProfileRef() {
    return pkiProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Pki profile associated with the gslb service.
   * It is a reference to an object of type pkiprofile.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pkiProfileRef set the pkiProfileRef.
   */
  @VsoMethod
  public void setPkiProfileRef(String  pkiProfileRef) {
    this.pkiProfileRef = pkiProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The load balancing algorithm will pick a gslb pool within the gslb service list of available pools.
   * Enum options - GSLB_SERVICE_ALGORITHM_PRIORITY, GSLB_SERVICE_ALGORITHM_GEO.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_SERVICE_ALGORITHM_PRIORITY".
   * @return poolAlgorithm
   */
  @VsoMethod
  public String getPoolAlgorithm() {
    return poolAlgorithm;
  }

  /**
   * This is the setter method to the attribute.
   * The load balancing algorithm will pick a gslb pool within the gslb service list of available pools.
   * Enum options - GSLB_SERVICE_ALGORITHM_PRIORITY, GSLB_SERVICE_ALGORITHM_GEO.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_SERVICE_ALGORITHM_PRIORITY".
   * @param poolAlgorithm set the poolAlgorithm.
   */
  @VsoMethod
  public void setPoolAlgorithm(String  poolAlgorithm) {
    this.poolAlgorithm = poolAlgorithm;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field indicates that for a cname query, respond with resolved cnames in the additional section with a records.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return resolveCname
   */
  @VsoMethod
  public Boolean getResolveCname() {
    return resolveCname;
  }

  /**
   * This is the setter method to the attribute.
   * This field indicates that for a cname query, respond with resolved cnames in the additional section with a records.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param resolveCname set the resolveCname.
   */
  @VsoMethod
  public void setResolveCname(Boolean  resolveCname) {
    this.resolveCname = resolveCname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable site-persistence for the gslbservice.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return sitePersistenceEnabled
   */
  @VsoMethod
  public Boolean getSitePersistenceEnabled() {
    return sitePersistenceEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enable site-persistence for the gslbservice.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param sitePersistenceEnabled set the sitePersistenceEnabled.
   */
  @VsoMethod
  public void setSitePersistenceEnabled(Boolean  sitePersistenceEnabled) {
    this.sitePersistenceEnabled = sitePersistenceEnabled;
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
   * When enabled, topology policy rules are used for member selection first.
   * If no valid member is found using the topology policy rules, configured gslb algorithms for pool selection and member selection are used.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return topologyPolicyEnabled
   */
  @VsoMethod
  public Boolean getTopologyPolicyEnabled() {
    return topologyPolicyEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * When enabled, topology policy rules are used for member selection first.
   * If no valid member is found using the topology policy rules, configured gslb algorithms for pool selection and member selection are used.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param topologyPolicyEnabled set the topologyPolicyEnabled.
   */
  @VsoMethod
  public void setTopologyPolicyEnabled(Boolean  topologyPolicyEnabled) {
    this.topologyPolicyEnabled = topologyPolicyEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ttl value (in seconds) for records served for this gslb service by the dns service.
   * Allowed values are 0-86400.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ttl
   */
  @VsoMethod
  public Integer getTtl() {
    return ttl;
  }

  /**
   * This is the setter method to the attribute.
   * Ttl value (in seconds) for records served for this gslb service by the dns service.
   * Allowed values are 0-86400.
   * Unit is sec.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ttl set the ttl.
   */
  @VsoMethod
  public void setTtl(Integer  ttl) {
    this.ttl = ttl;
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
   * Use the client ip subnet from the edns option as source ipaddress for client geo-location and consistent hash algorithm.
   * Default is true.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return useEdnsClientSubnet
   */
  @VsoMethod
  public Boolean getUseEdnsClientSubnet() {
    return useEdnsClientSubnet;
  }

  /**
   * This is the setter method to the attribute.
   * Use the client ip subnet from the edns option as source ipaddress for client geo-location and consistent hash algorithm.
   * Default is true.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param useEdnsClientSubnet set the useEdnsClientSubnet.
   */
  @VsoMethod
  public void setUseEdnsClientSubnet(Boolean  useEdnsClientSubnet) {
    this.useEdnsClientSubnet = useEdnsClientSubnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the gslb service.
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
   * Uuid of the gslb service.
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
   * Enable wild-card match of fqdn  if an exact match is not found in the dns table, the longest match is chosen by wild-carding the fqdn in the dns
   * request.
   * Default is false.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return wildcardMatch
   */
  @VsoMethod
  public Boolean getWildcardMatch() {
    return wildcardMatch;
  }

  /**
   * This is the setter method to the attribute.
   * Enable wild-card match of fqdn  if an exact match is not found in the dns table, the longest match is chosen by wild-carding the fqdn in the dns
   * request.
   * Default is false.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param wildcardMatch set the wildcardMatch.
   */
  @VsoMethod
  public void setWildcardMatch(Boolean  wildcardMatch) {
    this.wildcardMatch = wildcardMatch;
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
  GslbService objGslbService = (GslbService) o;
  return   Objects.equals(this.uuid, objGslbService.uuid)&&
  Objects.equals(this.name, objGslbService.name)&&
  Objects.equals(this.domainNames, objGslbService.domainNames)&&
  Objects.equals(this.groups, objGslbService.groups)&&
  Objects.equals(this.numDnsIp, objGslbService.numDnsIp)&&
  Objects.equals(this.ttl, objGslbService.ttl)&&
  Objects.equals(this.downResponse, objGslbService.downResponse)&&
  Objects.equals(this.healthMonitorRefs, objGslbService.healthMonitorRefs)&&
  Objects.equals(this.controllerHealthStatusEnabled, objGslbService.controllerHealthStatusEnabled)&&
  Objects.equals(this.healthMonitorScope, objGslbService.healthMonitorScope)&&
  Objects.equals(this.enabled, objGslbService.enabled)&&
  Objects.equals(this.useEdnsClientSubnet, objGslbService.useEdnsClientSubnet)&&
  Objects.equals(this.wildcardMatch, objGslbService.wildcardMatch)&&
  Objects.equals(this.sitePersistenceEnabled, objGslbService.sitePersistenceEnabled)&&
  Objects.equals(this.applicationPersistenceProfileRef, objGslbService.applicationPersistenceProfileRef)&&
  Objects.equals(this.poolAlgorithm, objGslbService.poolAlgorithm)&&
  Objects.equals(this.minMembers, objGslbService.minMembers)&&
  Objects.equals(this.resolveCname, objGslbService.resolveCname)&&
  Objects.equals(this.pkiProfileRef, objGslbService.pkiProfileRef)&&
  Objects.equals(this.markers, objGslbService.markers)&&
  Objects.equals(this.isFederated, objGslbService.isFederated)&&
  Objects.equals(this.createdBy, objGslbService.createdBy)&&
  Objects.equals(this.description, objGslbService.description)&&
  Objects.equals(this.tenantRef, objGslbService.tenantRef)&&
  Objects.equals(this.topologyPolicyEnabled, objGslbService.topologyPolicyEnabled);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbService {\n");
      sb.append("    applicationPersistenceProfileRef: ").append(toIndentedString(applicationPersistenceProfileRef)).append("\n");
        sb.append("    controllerHealthStatusEnabled: ").append(toIndentedString(controllerHealthStatusEnabled)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
        sb.append("    downResponse: ").append(toIndentedString(downResponse)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    healthMonitorRefs: ").append(toIndentedString(healthMonitorRefs)).append("\n");
        sb.append("    healthMonitorScope: ").append(toIndentedString(healthMonitorScope)).append("\n");
        sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
        sb.append("    minMembers: ").append(toIndentedString(minMembers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    numDnsIp: ").append(toIndentedString(numDnsIp)).append("\n");
        sb.append("    pkiProfileRef: ").append(toIndentedString(pkiProfileRef)).append("\n");
        sb.append("    poolAlgorithm: ").append(toIndentedString(poolAlgorithm)).append("\n");
        sb.append("    resolveCname: ").append(toIndentedString(resolveCname)).append("\n");
        sb.append("    sitePersistenceEnabled: ").append(toIndentedString(sitePersistenceEnabled)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    topologyPolicyEnabled: ").append(toIndentedString(topologyPolicyEnabled)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
            sb.append("    useEdnsClientSubnet: ").append(toIndentedString(useEdnsClientSubnet)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    wildcardMatch: ").append(toIndentedString(wildcardMatch)).append("\n");
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

