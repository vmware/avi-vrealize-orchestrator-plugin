package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.DockerRegistry;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.FeProxyRoutePublishConfig;
import com.vmware.avi.vro.model.MarathonSeDeployment;
import com.vmware.avi.vro.model.NuageSDNController;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The MesosConfiguration is a POJO class extends AviRestResource that used for creating
 * MesosConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MesosConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_MESOSCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MesosConfiguration extends AviRestResource {
    @JsonProperty("all_vses_are_feproxy")
    @JsonInclude(Include.NON_NULL)
    private Boolean allVsesAreFeproxy = false;

    @JsonProperty("app_sync_frequency")
    @JsonInclude(Include.NON_NULL)
    private Integer appSyncFrequency = 60;

    @JsonProperty("container_port_match_http_service")
    @JsonInclude(Include.NON_NULL)
    private Boolean containerPortMatchHttpService = true;

    @JsonProperty("coredump_directory")
    @JsonInclude(Include.NON_NULL)
    private String coredumpDirectory = "/var/lib/systemd/coredump";

    @JsonProperty("disable_auto_backend_service_sync")
    @JsonInclude(Include.NON_NULL)
    private Boolean disableAutoBackendServiceSync = false;

    @JsonProperty("disable_auto_frontend_service_sync")
    @JsonInclude(Include.NON_NULL)
    private Boolean disableAutoFrontendServiceSync = false;

    @JsonProperty("disable_auto_gs_sync")
    @JsonInclude(Include.NON_NULL)
    private Boolean disableAutoGsSync = false;

    @JsonProperty("disable_auto_se_creation")
    @JsonInclude(Include.NON_NULL)
    private Boolean disableAutoSeCreation = false;

    @JsonProperty("docker_registry_se")
    @JsonInclude(Include.NON_NULL)
    private DockerRegistry dockerRegistrySe;

    @JsonProperty("east_west_placement_subnet")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix eastWestPlacementSubnet;

    @JsonProperty("enable_event_subscription")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableEventSubscription = true;

    @JsonProperty("feproxy_bridge_name")
    @JsonInclude(Include.NON_NULL)
    private String feproxyBridgeName = "cbr1";

    @JsonProperty("feproxy_container_port_as_service")
    @JsonInclude(Include.NON_NULL)
    private Boolean feproxyContainerPortAsService = true;

    @JsonProperty("feproxy_route_publish")
    @JsonInclude(Include.NON_NULL)
    private FeProxyRoutePublishConfig feproxyRoutePublish;

    @JsonProperty("feproxy_vips_enable_proxy_arp")
    @JsonInclude(Include.NON_NULL)
    private Boolean feproxyVipsEnableProxyArp = true;

    @JsonProperty("fleet_endpoint")
    @JsonInclude(Include.NON_NULL)
    private String fleetEndpoint;

    @JsonProperty("http_container_ports")
    @JsonInclude(Include.NON_NULL)
    private List<Integer> httpContainerPorts;

    @JsonProperty("marathon_configurations")
    @JsonInclude(Include.NON_NULL)
    private List<MarathonConfiguration> marathonConfigurations;

    @JsonProperty("marathon_se_deployment")
    @JsonInclude(Include.NON_NULL)
    private MarathonSeDeployment marathonSeDeployment;

    @JsonProperty("mesos_url")
    @JsonInclude(Include.NON_NULL)
    private String mesosUrl = "http://leader.mesos:5050";

    @JsonProperty("node_availability_zone_label")
    @JsonInclude(Include.NON_NULL)
    private String nodeAvailabilityZoneLabel;

    @JsonProperty("nuage_controller")
    @JsonInclude(Include.NON_NULL)
    private NuageSDNController nuageController;

    @JsonProperty("se_deployment_method")
    @JsonInclude(Include.NON_NULL)
    private String seDeploymentMethod = "MESOS_SE_CREATE_FLEET";

    @JsonProperty("se_exclude_attributes")
    @JsonInclude(Include.NON_NULL)
    private List<MesosAttribute> seExcludeAttributes;

    @JsonProperty("se_include_attributes")
    @JsonInclude(Include.NON_NULL)
    private List<MesosAttribute> seIncludeAttributes;

    @JsonProperty("se_resources")
    @JsonInclude(Include.NON_NULL)
    private List<MesosSeResources> seResources;

    @JsonProperty("se_spawn_rate")
    @JsonInclude(Include.NON_NULL)
    private Integer seSpawnRate = 25;

    @JsonProperty("se_volume")
    @JsonInclude(Include.NON_NULL)
    private String seVolume = "/opt/avi/se";

    @JsonProperty("services_accessible_all_interfaces")
    @JsonInclude(Include.NON_NULL)
    private Boolean servicesAccessibleAllInterfaces = false;

    @JsonProperty("ssh_user_ref")
    @JsonInclude(Include.NON_NULL)
    private String sshUserRef;

    @JsonProperty("use_bridge_ip_as_vip")
    @JsonInclude(Include.NON_NULL)
    private Boolean useBridgeIpAsVip = false;

    @JsonProperty("use_container_ip_port")
    @JsonInclude(Include.NON_NULL)
    private Boolean useContainerIpPort = false;

    @JsonProperty("use_controller_image")
    @JsonInclude(Include.NON_NULL)
    private Boolean useControllerImage = false;

    @JsonProperty("use_vips_for_east_west_services")
    @JsonInclude(Include.NON_NULL)
    private Boolean useVipsForEastWestServices = true;

    @JsonProperty("vip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr vip;



  /**
   * This is the getter method this will return the attribute value.
   * Consider all virtualservices as front end proxies.
   * Front end proxies are placed on specific ses as opposed to back end proxies placed on all ses.
   * Applicable where each service has its own vip and vip is reachable from anywhere.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return allVsesAreFeproxy
   */
  @VsoMethod
  public Boolean getAllVsesAreFeproxy() {
    return allVsesAreFeproxy;
  }

  /**
   * This is the setter method to the attribute.
   * Consider all virtualservices as front end proxies.
   * Front end proxies are placed on specific ses as opposed to back end proxies placed on all ses.
   * Applicable where each service has its own vip and vip is reachable from anywhere.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param allVsesAreFeproxy set the allVsesAreFeproxy.
   */
  @VsoMethod
  public void setAllVsesAreFeproxy(Boolean  allVsesAreFeproxy) {
    this.allVsesAreFeproxy = allVsesAreFeproxy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Sync frequency in seconds with frameworks.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return appSyncFrequency
   */
  @VsoMethod
  public Integer getAppSyncFrequency() {
    return appSyncFrequency;
  }

  /**
   * This is the setter method to the attribute.
   * Sync frequency in seconds with frameworks.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param appSyncFrequency set the appSyncFrequency.
   */
  @VsoMethod
  public void setAppSyncFrequency(Integer  appSyncFrequency) {
    this.appSyncFrequency = appSyncFrequency;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Perform container port matching to create a http virtualservice instead of a tcp/udp virtualservice.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return containerPortMatchHttpService
   */
  @VsoMethod
  public Boolean getContainerPortMatchHttpService() {
    return containerPortMatchHttpService;
  }

  /**
   * This is the setter method to the attribute.
   * Perform container port matching to create a http virtualservice instead of a tcp/udp virtualservice.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param containerPortMatchHttpService set the containerPortMatchHttpService.
   */
  @VsoMethod
  public void setContainerPortMatchHttpService(Boolean  containerPortMatchHttpService) {
    this.containerPortMatchHttpService = containerPortMatchHttpService;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Directory to mount to check for core dumps on service engines.
   * This will be mapped read only to /var/crash on any new service engines.
   * This is a disruptive change.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "/var/lib/systemd/coredump".
   * @return coredumpDirectory
   */
  @VsoMethod
  public String getCoredumpDirectory() {
    return coredumpDirectory;
  }

  /**
   * This is the setter method to the attribute.
   * Directory to mount to check for core dumps on service engines.
   * This will be mapped read only to /var/crash on any new service engines.
   * This is a disruptive change.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "/var/lib/systemd/coredump".
   * @param coredumpDirectory set the coredumpDirectory.
   */
  @VsoMethod
  public void setCoredumpDirectory(String  coredumpDirectory) {
    this.coredumpDirectory = coredumpDirectory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Disable auto service sync for back end services.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return disableAutoBackendServiceSync
   */
  @VsoMethod
  public Boolean getDisableAutoBackendServiceSync() {
    return disableAutoBackendServiceSync;
  }

  /**
   * This is the setter method to the attribute.
   * Disable auto service sync for back end services.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param disableAutoBackendServiceSync set the disableAutoBackendServiceSync.
   */
  @VsoMethod
  public void setDisableAutoBackendServiceSync(Boolean  disableAutoBackendServiceSync) {
    this.disableAutoBackendServiceSync = disableAutoBackendServiceSync;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Disable auto service sync for front end services.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return disableAutoFrontendServiceSync
   */
  @VsoMethod
  public Boolean getDisableAutoFrontendServiceSync() {
    return disableAutoFrontendServiceSync;
  }

  /**
   * This is the setter method to the attribute.
   * Disable auto service sync for front end services.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param disableAutoFrontendServiceSync set the disableAutoFrontendServiceSync.
   */
  @VsoMethod
  public void setDisableAutoFrontendServiceSync(Boolean  disableAutoFrontendServiceSync) {
    this.disableAutoFrontendServiceSync = disableAutoFrontendServiceSync;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Disable auto sync for gslb services.
   * Field introduced in 17.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return disableAutoGsSync
   */
  @VsoMethod
  public Boolean getDisableAutoGsSync() {
    return disableAutoGsSync;
  }

  /**
   * This is the setter method to the attribute.
   * Disable auto sync for gslb services.
   * Field introduced in 17.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param disableAutoGsSync set the disableAutoGsSync.
   */
  @VsoMethod
  public void setDisableAutoGsSync(Boolean  disableAutoGsSync) {
    this.disableAutoGsSync = disableAutoGsSync;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Disable se creation.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return disableAutoSeCreation
   */
  @VsoMethod
  public Boolean getDisableAutoSeCreation() {
    return disableAutoSeCreation;
  }

  /**
   * This is the setter method to the attribute.
   * Disable se creation.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param disableAutoSeCreation set the disableAutoSeCreation.
   */
  @VsoMethod
  public void setDisableAutoSeCreation(Boolean  disableAutoSeCreation) {
    this.disableAutoSeCreation = disableAutoSeCreation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Docker registry for serviceengine image.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dockerRegistrySe
   */
  @VsoMethod
  public DockerRegistry getDockerRegistrySe() {
    return dockerRegistrySe;
  }

  /**
   * This is the setter method to the attribute.
   * Docker registry for serviceengine image.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dockerRegistrySe set the dockerRegistrySe.
   */
  @VsoMethod
  public void setDockerRegistrySe(DockerRegistry dockerRegistrySe) {
    this.dockerRegistrySe = dockerRegistrySe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Match against this prefix when placing east-west vss on ses (mesos mode only).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eastWestPlacementSubnet
   */
  @VsoMethod
  public IpAddrPrefix getEastWestPlacementSubnet() {
    return eastWestPlacementSubnet;
  }

  /**
   * This is the setter method to the attribute.
   * Match against this prefix when placing east-west vss on ses (mesos mode only).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param eastWestPlacementSubnet set the eastWestPlacementSubnet.
   */
  @VsoMethod
  public void setEastWestPlacementSubnet(IpAddrPrefix eastWestPlacementSubnet) {
    this.eastWestPlacementSubnet = eastWestPlacementSubnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable marathon event subscriptions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enableEventSubscription
   */
  @VsoMethod
  public Boolean getEnableEventSubscription() {
    return enableEventSubscription;
  }

  /**
   * This is the setter method to the attribute.
   * Enable marathon event subscriptions.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enableEventSubscription set the enableEventSubscription.
   */
  @VsoMethod
  public void setEnableEventSubscription(Boolean  enableEventSubscription) {
    this.enableEventSubscription = enableEventSubscription;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of second linux bridge on host providing connectivity for front end proxies.
   * This is a disruptive change.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "cbr1".
   * @return feproxyBridgeName
   */
  @VsoMethod
  public String getFeproxyBridgeName() {
    return feproxyBridgeName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of second linux bridge on host providing connectivity for front end proxies.
   * This is a disruptive change.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "cbr1".
   * @param feproxyBridgeName set the feproxyBridgeName.
   */
  @VsoMethod
  public void setFeproxyBridgeName(String  feproxyBridgeName) {
    this.feproxyBridgeName = feproxyBridgeName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * For front end proxies, use container port as service port.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return feproxyContainerPortAsService
   */
  @VsoMethod
  public Boolean getFeproxyContainerPortAsService() {
    return feproxyContainerPortAsService;
  }

  /**
   * This is the setter method to the attribute.
   * For front end proxies, use container port as service port.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param feproxyContainerPortAsService set the feproxyContainerPortAsService.
   */
  @VsoMethod
  public void setFeproxyContainerPortAsService(Boolean  feproxyContainerPortAsService) {
    this.feproxyContainerPortAsService = feproxyContainerPortAsService;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Publish ecmp route to upstream router for vip.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return feproxyRoutePublish
   */
  @VsoMethod
  public FeProxyRoutePublishConfig getFeproxyRoutePublish() {
    return feproxyRoutePublish;
  }

  /**
   * This is the setter method to the attribute.
   * Publish ecmp route to upstream router for vip.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param feproxyRoutePublish set the feproxyRoutePublish.
   */
  @VsoMethod
  public void setFeproxyRoutePublish(FeProxyRoutePublishConfig feproxyRoutePublish) {
    this.feproxyRoutePublish = feproxyRoutePublish;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable proxy arp from host interface for front end  proxies.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return feproxyVipsEnableProxyArp
   */
  @VsoMethod
  public Boolean getFeproxyVipsEnableProxyArp() {
    return feproxyVipsEnableProxyArp;
  }

  /**
   * This is the setter method to the attribute.
   * Enable proxy arp from host interface for front end  proxies.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param feproxyVipsEnableProxyArp set the feproxyVipsEnableProxyArp.
   */
  @VsoMethod
  public void setFeproxyVipsEnableProxyArp(Boolean  feproxyVipsEnableProxyArp) {
    this.feproxyVipsEnableProxyArp = feproxyVipsEnableProxyArp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Optional fleet remote endpoint if fleet is used for se deployment.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fleetEndpoint
   */
  @VsoMethod
  public String getFleetEndpoint() {
    return fleetEndpoint;
  }

  /**
   * This is the setter method to the attribute.
   * Optional fleet remote endpoint if fleet is used for se deployment.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fleetEndpoint set the fleetEndpoint.
   */
  @VsoMethod
  public void setFleetEndpoint(String  fleetEndpoint) {
    this.fleetEndpoint = fleetEndpoint;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of container ports that create a http virtualservice instead of a tcp/udp virtualservice.
   * Defaults to 80.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpContainerPorts
   */
  @VsoMethod
  public List<Integer> getHttpContainerPorts() {
    return httpContainerPorts;
  }

  /**
   * This is the setter method. this will set the httpContainerPorts
   * List of container ports that create a http virtualservice instead of a tcp/udp virtualservice.
   * Defaults to 80.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpContainerPorts
   */
  @VsoMethod
  public void setHttpContainerPorts(List<Integer>  httpContainerPorts) {
    this.httpContainerPorts = httpContainerPorts;
  }

  /**
   * This is the setter method this will set the httpContainerPorts
   * List of container ports that create a http virtualservice instead of a tcp/udp virtualservice.
   * Defaults to 80.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpContainerPorts
   */
  @VsoMethod
  public MesosConfiguration addHttpContainerPortsItem(Integer httpContainerPortsItem) {
    if (this.httpContainerPorts == null) {
      this.httpContainerPorts = new ArrayList<Integer>();
    }
    this.httpContainerPorts.add(httpContainerPortsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * List of marathon frameworks.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return marathonConfigurations
   */
  @VsoMethod
  public List<MarathonConfiguration> getMarathonConfigurations() {
    return marathonConfigurations;
  }

  /**
   * This is the setter method. this will set the marathonConfigurations
   * List of marathon frameworks.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return marathonConfigurations
   */
  @VsoMethod
  public void setMarathonConfigurations(List<MarathonConfiguration>  marathonConfigurations) {
    this.marathonConfigurations = marathonConfigurations;
  }

  /**
   * This is the setter method this will set the marathonConfigurations
   * List of marathon frameworks.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return marathonConfigurations
   */
  @VsoMethod
  public MesosConfiguration addMarathonConfigurationsItem(MarathonConfiguration marathonConfigurationsItem) {
    if (this.marathonConfigurations == null) {
      this.marathonConfigurations = new ArrayList<MarathonConfiguration>();
    }
    this.marathonConfigurations.add(marathonConfigurationsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Options for marathon se deployment.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return marathonSeDeployment
   */
  @VsoMethod
  public MarathonSeDeployment getMarathonSeDeployment() {
    return marathonSeDeployment;
  }

  /**
   * This is the setter method to the attribute.
   * Options for marathon se deployment.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param marathonSeDeployment set the marathonSeDeployment.
   */
  @VsoMethod
  public void setMarathonSeDeployment(MarathonSeDeployment marathonSeDeployment) {
    this.marathonSeDeployment = marathonSeDeployment;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mesos url of the form http //host port.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "http://leader.mesos:5050".
   * @return mesosUrl
   */
  @VsoMethod
  public String getMesosUrl() {
    return mesosUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Mesos url of the form http //host port.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "http://leader.mesos:5050".
   * @param mesosUrl set the mesosUrl.
   */
  @VsoMethod
  public void setMesosUrl(String  mesosUrl) {
    this.mesosUrl = mesosUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mesos node label to be used as mesos node's availability zone in a dual availability zone deployment.
   * Serviceengines belonging to the availability zone will be rebooted during a manual dr failover.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodeAvailabilityZoneLabel
   */
  @VsoMethod
  public String getNodeAvailabilityZoneLabel() {
    return nodeAvailabilityZoneLabel;
  }

  /**
   * This is the setter method to the attribute.
   * Mesos node label to be used as mesos node's availability zone in a dual availability zone deployment.
   * Serviceengines belonging to the availability zone will be rebooted during a manual dr failover.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nodeAvailabilityZoneLabel set the nodeAvailabilityZoneLabel.
   */
  @VsoMethod
  public void setNodeAvailabilityZoneLabel(String  nodeAvailabilityZoneLabel) {
    this.nodeAvailabilityZoneLabel = nodeAvailabilityZoneLabel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Nuage overlay sdn controller information.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nuageController
   */
  @VsoMethod
  public NuageSDNController getNuageController() {
    return nuageController;
  }

  /**
   * This is the setter method to the attribute.
   * Nuage overlay sdn controller information.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nuageController set the nuageController.
   */
  @VsoMethod
  public void setNuageController(NuageSDNController nuageController) {
    this.nuageController = nuageController;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use fleet/ssh for deploying service engines.
   * Enum options - MESOS_SE_CREATE_FLEET, MESOS_SE_CREATE_SSH, MESOS_SE_CREATE_MARATHON.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "MESOS_SE_CREATE_FLEET".
   * @return seDeploymentMethod
   */
  @VsoMethod
  public String getSeDeploymentMethod() {
    return seDeploymentMethod;
  }

  /**
   * This is the setter method to the attribute.
   * Use fleet/ssh for deploying service engines.
   * Enum options - MESOS_SE_CREATE_FLEET, MESOS_SE_CREATE_SSH, MESOS_SE_CREATE_MARATHON.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "MESOS_SE_CREATE_FLEET".
   * @param seDeploymentMethod set the seDeploymentMethod.
   */
  @VsoMethod
  public void setSeDeploymentMethod(String  seDeploymentMethod) {
    this.seDeploymentMethod = seDeploymentMethod;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Exclude hosts with attributes for se creation.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seExcludeAttributes
   */
  @VsoMethod
  public List<MesosAttribute> getSeExcludeAttributes() {
    return seExcludeAttributes;
  }

  /**
   * This is the setter method. this will set the seExcludeAttributes
   * Exclude hosts with attributes for se creation.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seExcludeAttributes
   */
  @VsoMethod
  public void setSeExcludeAttributes(List<MesosAttribute>  seExcludeAttributes) {
    this.seExcludeAttributes = seExcludeAttributes;
  }

  /**
   * This is the setter method this will set the seExcludeAttributes
   * Exclude hosts with attributes for se creation.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seExcludeAttributes
   */
  @VsoMethod
  public MesosConfiguration addSeExcludeAttributesItem(MesosAttribute seExcludeAttributesItem) {
    if (this.seExcludeAttributes == null) {
      this.seExcludeAttributes = new ArrayList<MesosAttribute>();
    }
    this.seExcludeAttributes.add(seExcludeAttributesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Create ses just on hosts with include attributes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seIncludeAttributes
   */
  @VsoMethod
  public List<MesosAttribute> getSeIncludeAttributes() {
    return seIncludeAttributes;
  }

  /**
   * This is the setter method. this will set the seIncludeAttributes
   * Create ses just on hosts with include attributes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seIncludeAttributes
   */
  @VsoMethod
  public void setSeIncludeAttributes(List<MesosAttribute>  seIncludeAttributes) {
    this.seIncludeAttributes = seIncludeAttributes;
  }

  /**
   * This is the setter method this will set the seIncludeAttributes
   * Create ses just on hosts with include attributes.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seIncludeAttributes
   */
  @VsoMethod
  public MesosConfiguration addSeIncludeAttributesItem(MesosAttribute seIncludeAttributesItem) {
    if (this.seIncludeAttributes == null) {
      this.seIncludeAttributes = new ArrayList<MesosAttribute>();
    }
    this.seIncludeAttributes.add(seIncludeAttributesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Obsolete - ignored.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seResources
   */
  @VsoMethod
  public List<MesosSeResources> getSeResources() {
    return seResources;
  }

  /**
   * This is the setter method. this will set the seResources
   * Obsolete - ignored.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seResources
   */
  @VsoMethod
  public void setSeResources(List<MesosSeResources>  seResources) {
    this.seResources = seResources;
  }

  /**
   * This is the setter method this will set the seResources
   * Obsolete - ignored.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seResources
   */
  @VsoMethod
  public MesosConfiguration addSeResourcesItem(MesosSeResources seResourcesItem) {
    if (this.seResources == null) {
      this.seResources = new ArrayList<MesosSeResources>();
    }
    this.seResources.add(seResourcesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * New se spawn rate per minute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 25.
   * @return seSpawnRate
   */
  @VsoMethod
  public Integer getSeSpawnRate() {
    return seSpawnRate;
  }

  /**
   * This is the setter method to the attribute.
   * New se spawn rate per minute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 25.
   * @param seSpawnRate set the seSpawnRate.
   */
  @VsoMethod
  public void setSeSpawnRate(Integer  seSpawnRate) {
    this.seSpawnRate = seSpawnRate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Host volume to be used as a disk for avi se, this is a disruptive change.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "/opt/avi/se".
   * @return seVolume
   */
  @VsoMethod
  public String getSeVolume() {
    return seVolume;
  }

  /**
   * This is the setter method to the attribute.
   * Host volume to be used as a disk for avi se, this is a disruptive change.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "/opt/avi/se".
   * @param seVolume set the seVolume.
   */
  @VsoMethod
  public void setSeVolume(String  seVolume) {
    this.seVolume = seVolume;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Make service ports accessible on all host interfaces in addition to east-west vip and/or bridge ip.
   * Usually enabled aws mesos clusters to export east-west services on host interface.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return servicesAccessibleAllInterfaces
   */
  @VsoMethod
  public Boolean getServicesAccessibleAllInterfaces() {
    return servicesAccessibleAllInterfaces;
  }

  /**
   * This is the setter method to the attribute.
   * Make service ports accessible on all host interfaces in addition to east-west vip and/or bridge ip.
   * Usually enabled aws mesos clusters to export east-west services on host interface.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param servicesAccessibleAllInterfaces set the servicesAccessibleAllInterfaces.
   */
  @VsoMethod
  public void setServicesAccessibleAllInterfaces(Boolean  servicesAccessibleAllInterfaces) {
    this.servicesAccessibleAllInterfaces = servicesAccessibleAllInterfaces;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloud connector user uuid for ssh to hosts.
   * It is a reference to an object of type cloudconnectoruser.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sshUserRef
   */
  @VsoMethod
  public String getSshUserRef() {
    return sshUserRef;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud connector user uuid for ssh to hosts.
   * It is a reference to an object of type cloudconnectoruser.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sshUserRef set the sshUserRef.
   */
  @VsoMethod
  public void setSshUserRef(String  sshUserRef) {
    this.sshUserRef = sshUserRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use bridge ip on each host as vip.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useBridgeIpAsVip
   */
  @VsoMethod
  public Boolean getUseBridgeIpAsVip() {
    return useBridgeIpAsVip;
  }

  /**
   * This is the setter method to the attribute.
   * Use bridge ip on each host as vip.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useBridgeIpAsVip set the useBridgeIpAsVip.
   */
  @VsoMethod
  public void setUseBridgeIpAsVip(Boolean  useBridgeIpAsVip) {
    this.useBridgeIpAsVip = useBridgeIpAsVip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use container ip address port for pool instead of host ip address hostport.
   * This mode is applicable if the container ip is reachable (not a private nated ip) from other hosts in a routed environment for containers.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useContainerIpPort
   */
  @VsoMethod
  public Boolean getUseContainerIpPort() {
    return useContainerIpPort;
  }

  /**
   * This is the setter method to the attribute.
   * Use container ip address port for pool instead of host ip address hostport.
   * This mode is applicable if the container ip is reachable (not a private nated ip) from other hosts in a routed environment for containers.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useContainerIpPort set the useContainerIpPort.
   */
  @VsoMethod
  public void setUseContainerIpPort(Boolean  useContainerIpPort) {
    this.useContainerIpPort = useContainerIpPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If true, use controller generated se docker image via fileservice, else use docker repository image as defined by docker_registry_se.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return useControllerImage
   */
  @VsoMethod
  public Boolean getUseControllerImage() {
    return useControllerImage;
  }

  /**
   * This is the setter method to the attribute.
   * If true, use controller generated se docker image via fileservice, else use docker repository image as defined by docker_registry_se.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param useControllerImage set the useControllerImage.
   */
  @VsoMethod
  public void setUseControllerImage(Boolean  useControllerImage) {
    this.useControllerImage = useControllerImage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use unique virtual ip address for every east west service in mesos/marathon.
   * 'use_bridge_ip_as_vip' and 'vip' fields , if set, will not be used if this field is set.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return useVipsForEastWestServices
   */
  @VsoMethod
  public Boolean getUseVipsForEastWestServices() {
    return useVipsForEastWestServices;
  }

  /**
   * This is the setter method to the attribute.
   * Use unique virtual ip address for every east west service in mesos/marathon.
   * 'use_bridge_ip_as_vip' and 'vip' fields , if set, will not be used if this field is set.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param useVipsForEastWestServices set the useVipsForEastWestServices.
   */
  @VsoMethod
  public void setUseVipsForEastWestServices(Boolean  useVipsForEastWestServices) {
    this.useVipsForEastWestServices = useVipsForEastWestServices;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vip to be used by all east-west apps on all hosts.
   * Preferrably use an address from outside the subnet.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vip
   */
  @VsoMethod
  public IpAddr getVip() {
    return vip;
  }

  /**
   * This is the setter method to the attribute.
   * Vip to be used by all east-west apps on all hosts.
   * Preferrably use an address from outside the subnet.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vip set the vip.
   */
  @VsoMethod
  public void setVip(IpAddr vip) {
    this.vip = vip;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MesosConfiguration objMesosConfiguration = (MesosConfiguration) o;
  return   Objects.equals(this.marathonConfigurations, objMesosConfiguration.marathonConfigurations)&&
  Objects.equals(this.mesosUrl, objMesosConfiguration.mesosUrl)&&
  Objects.equals(this.vip, objMesosConfiguration.vip)&&
  Objects.equals(this.useBridgeIpAsVip, objMesosConfiguration.useBridgeIpAsVip)&&
  Objects.equals(this.containerPortMatchHttpService, objMesosConfiguration.containerPortMatchHttpService)&&
  Objects.equals(this.httpContainerPorts, objMesosConfiguration.httpContainerPorts)&&
  Objects.equals(this.eastWestPlacementSubnet, objMesosConfiguration.eastWestPlacementSubnet)&&
  Objects.equals(this.seDeploymentMethod, objMesosConfiguration.seDeploymentMethod)&&
  Objects.equals(this.useControllerImage, objMesosConfiguration.useControllerImage)&&
  Objects.equals(this.marathonSeDeployment, objMesosConfiguration.marathonSeDeployment)&&
  Objects.equals(this.fleetEndpoint, objMesosConfiguration.fleetEndpoint)&&
  Objects.equals(this.dockerRegistrySe, objMesosConfiguration.dockerRegistrySe)&&
  Objects.equals(this.seSpawnRate, objMesosConfiguration.seSpawnRate)&&
  Objects.equals(this.appSyncFrequency, objMesosConfiguration.appSyncFrequency)&&
  Objects.equals(this.disableAutoSeCreation, objMesosConfiguration.disableAutoSeCreation)&&
  Objects.equals(this.disableAutoFrontendServiceSync, objMesosConfiguration.disableAutoFrontendServiceSync)&&
  Objects.equals(this.disableAutoBackendServiceSync, objMesosConfiguration.disableAutoBackendServiceSync)&&
  Objects.equals(this.useContainerIpPort, objMesosConfiguration.useContainerIpPort)&&
  Objects.equals(this.feproxyRoutePublish, objMesosConfiguration.feproxyRoutePublish)&&
  Objects.equals(this.feproxyBridgeName, objMesosConfiguration.feproxyBridgeName)&&
  Objects.equals(this.seResources, objMesosConfiguration.seResources)&&
  Objects.equals(this.seVolume, objMesosConfiguration.seVolume)&&
  Objects.equals(this.coredumpDirectory, objMesosConfiguration.coredumpDirectory)&&
  Objects.equals(this.enableEventSubscription, objMesosConfiguration.enableEventSubscription)&&
  Objects.equals(this.nuageController, objMesosConfiguration.nuageController)&&
  Objects.equals(this.allVsesAreFeproxy, objMesosConfiguration.allVsesAreFeproxy)&&
  Objects.equals(this.feproxyContainerPortAsService, objMesosConfiguration.feproxyContainerPortAsService)&&
  Objects.equals(this.servicesAccessibleAllInterfaces, objMesosConfiguration.servicesAccessibleAllInterfaces)&&
  Objects.equals(this.feproxyVipsEnableProxyArp, objMesosConfiguration.feproxyVipsEnableProxyArp)&&
  Objects.equals(this.seExcludeAttributes, objMesosConfiguration.seExcludeAttributes)&&
  Objects.equals(this.seIncludeAttributes, objMesosConfiguration.seIncludeAttributes)&&
  Objects.equals(this.sshUserRef, objMesosConfiguration.sshUserRef)&&
  Objects.equals(this.nodeAvailabilityZoneLabel, objMesosConfiguration.nodeAvailabilityZoneLabel)&&
  Objects.equals(this.disableAutoGsSync, objMesosConfiguration.disableAutoGsSync)&&
  Objects.equals(this.useVipsForEastWestServices, objMesosConfiguration.useVipsForEastWestServices);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MesosConfiguration {\n");
      sb.append("    allVsesAreFeproxy: ").append(toIndentedString(allVsesAreFeproxy)).append("\n");
        sb.append("    appSyncFrequency: ").append(toIndentedString(appSyncFrequency)).append("\n");
        sb.append("    containerPortMatchHttpService: ").append(toIndentedString(containerPortMatchHttpService)).append("\n");
        sb.append("    coredumpDirectory: ").append(toIndentedString(coredumpDirectory)).append("\n");
        sb.append("    disableAutoBackendServiceSync: ").append(toIndentedString(disableAutoBackendServiceSync)).append("\n");
        sb.append("    disableAutoFrontendServiceSync: ").append(toIndentedString(disableAutoFrontendServiceSync)).append("\n");
        sb.append("    disableAutoGsSync: ").append(toIndentedString(disableAutoGsSync)).append("\n");
        sb.append("    disableAutoSeCreation: ").append(toIndentedString(disableAutoSeCreation)).append("\n");
        sb.append("    dockerRegistrySe: ").append(toIndentedString(dockerRegistrySe)).append("\n");
        sb.append("    eastWestPlacementSubnet: ").append(toIndentedString(eastWestPlacementSubnet)).append("\n");
        sb.append("    enableEventSubscription: ").append(toIndentedString(enableEventSubscription)).append("\n");
        sb.append("    feproxyBridgeName: ").append(toIndentedString(feproxyBridgeName)).append("\n");
        sb.append("    feproxyContainerPortAsService: ").append(toIndentedString(feproxyContainerPortAsService)).append("\n");
        sb.append("    feproxyRoutePublish: ").append(toIndentedString(feproxyRoutePublish)).append("\n");
        sb.append("    feproxyVipsEnableProxyArp: ").append(toIndentedString(feproxyVipsEnableProxyArp)).append("\n");
        sb.append("    fleetEndpoint: ").append(toIndentedString(fleetEndpoint)).append("\n");
        sb.append("    httpContainerPorts: ").append(toIndentedString(httpContainerPorts)).append("\n");
        sb.append("    marathonConfigurations: ").append(toIndentedString(marathonConfigurations)).append("\n");
        sb.append("    marathonSeDeployment: ").append(toIndentedString(marathonSeDeployment)).append("\n");
        sb.append("    mesosUrl: ").append(toIndentedString(mesosUrl)).append("\n");
        sb.append("    nodeAvailabilityZoneLabel: ").append(toIndentedString(nodeAvailabilityZoneLabel)).append("\n");
        sb.append("    nuageController: ").append(toIndentedString(nuageController)).append("\n");
        sb.append("    seDeploymentMethod: ").append(toIndentedString(seDeploymentMethod)).append("\n");
        sb.append("    seExcludeAttributes: ").append(toIndentedString(seExcludeAttributes)).append("\n");
        sb.append("    seIncludeAttributes: ").append(toIndentedString(seIncludeAttributes)).append("\n");
        sb.append("    seResources: ").append(toIndentedString(seResources)).append("\n");
        sb.append("    seSpawnRate: ").append(toIndentedString(seSpawnRate)).append("\n");
        sb.append("    seVolume: ").append(toIndentedString(seVolume)).append("\n");
        sb.append("    servicesAccessibleAllInterfaces: ").append(toIndentedString(servicesAccessibleAllInterfaces)).append("\n");
        sb.append("    sshUserRef: ").append(toIndentedString(sshUserRef)).append("\n");
        sb.append("    useBridgeIpAsVip: ").append(toIndentedString(useBridgeIpAsVip)).append("\n");
        sb.append("    useContainerIpPort: ").append(toIndentedString(useContainerIpPort)).append("\n");
        sb.append("    useControllerImage: ").append(toIndentedString(useControllerImage)).append("\n");
        sb.append("    useVipsForEastWestServices: ").append(toIndentedString(useVipsForEastWestServices)).append("\n");
        sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
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

