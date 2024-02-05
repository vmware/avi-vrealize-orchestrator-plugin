package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.DebugVirtualService;
import com.vmware.avi.vro.model.GslbDnsUpdate;
import com.vmware.avi.vro.model.TimeStamp;
import com.vmware.avi.vro.model.TimeStamp;
import com.vmware.avi.vro.model.SecurityMgrRuntime;
import com.vmware.avi.vro.model.VirtualService;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VirtualServiceRuntime is a POJO class extends AviRestResource that used for creating
 * VirtualServiceRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VirtualServiceRuntime")
@VsoFinder(name = Constants.FINDER_VRO_VIRTUALSERVICERUNTIME)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VirtualServiceRuntime extends AviRestResource {
    @JsonProperty("controller_ip")
    @JsonInclude(Include.NON_NULL)
    private String controllerIp;

    @JsonProperty("datapath_debug")
    @JsonInclude(Include.NON_NULL)
    private DebugVirtualService datapathDebug;

    @JsonProperty("east_west")
    @JsonInclude(Include.NON_NULL)
    private Boolean eastWest = false;

    @JsonProperty("gslb_dns_update")
    @JsonInclude(Include.NON_NULL)
    private GslbDnsUpdate gslbDnsUpdate;

    @JsonProperty("ipam_dns_records")
    @JsonInclude(Include.NON_NULL)
    private List<DnsRecord> ipamDnsRecords;

    @JsonProperty("is_dns_vs")
    @JsonInclude(Include.NON_NULL)
    private Boolean isDnsVs = false;

    @JsonProperty("key_rotation_count")
    @JsonInclude(Include.NON_NULL)
    private Integer keyRotationCount;

    @JsonProperty("last_changed_time")
    @JsonInclude(Include.NON_NULL)
    private TimeStamp lastChangedTime;

    @JsonProperty("last_key_rotation_time")
    @JsonInclude(Include.NON_NULL)
    private TimeStamp lastKeyRotationTime;

    @JsonProperty("lif")
    @JsonInclude(Include.NON_NULL)
    private List<String> lif;

    @JsonProperty("manual_placement")
    @JsonInclude(Include.NON_NULL)
    private Boolean manualPlacement = false;

    @JsonProperty("marked_for_delete")
    @JsonInclude(Include.NON_NULL)
    private Boolean markedForDelete = false;

    @JsonProperty("metrics_mgr_port")
    @JsonInclude(Include.NON_NULL)
    private String metricsMgrPort;

    @JsonProperty("num_additional_se")
    @JsonInclude(Include.NON_NULL)
    private Integer numAdditionalSe = 0;

    @JsonProperty("one_plus_one_ha")
    @JsonInclude(Include.NON_NULL)
    private Boolean onePlusOneHa = false;

    @JsonProperty("prev_controller_ip")
    @JsonInclude(Include.NON_NULL)
    private String prevControllerIp;

    @JsonProperty("prev_metrics_mgr_port")
    @JsonInclude(Include.NON_NULL)
    private String prevMetricsMgrPort;

    @JsonProperty("redis_db")
    @JsonInclude(Include.NON_NULL)
    private Integer redisDb;

    @JsonProperty("redis_port")
    @JsonInclude(Include.NON_NULL)
    private Integer redisPort;

    @JsonProperty("sec_mgr_info")
    @JsonInclude(Include.NON_NULL)
    private SecurityMgrRuntime secMgrInfo;

    @JsonProperty("self_se_election")
    @JsonInclude(Include.NON_NULL)
    private Boolean selfSeElection = false;

    @JsonProperty("tls_ticket_key")
    @JsonInclude(Include.NON_NULL)
    private List<TLSTicket> tlsTicketKey;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = "VS_TYPE_NORMAL";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private Integer version = 0;

    @JsonProperty("vh_child_vs_ref")
    @JsonInclude(Include.NON_NULL)
    private List<String> vhChildVsRef;

    @JsonProperty("vip_runtime")
    @JsonInclude(Include.NON_NULL)
    private List<VipRuntime> vipRuntime;

    @JsonProperty("vs_update_pending")
    @JsonInclude(Include.NON_NULL)
    private VirtualService vsUpdatePending;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return controllerIp
   */
  @VsoMethod
  public String getControllerIp() {
    return controllerIp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param controllerIp set the controllerIp.
   */
  @VsoMethod
  public void setControllerIp(String  controllerIp) {
    this.controllerIp = controllerIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return datapathDebug
   */
  @VsoMethod
  public DebugVirtualService getDatapathDebug() {
    return datapathDebug;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param datapathDebug set the datapathDebug.
   */
  @VsoMethod
  public void setDatapathDebug(DebugVirtualService datapathDebug) {
    this.datapathDebug = datapathDebug;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return eastWest
   */
  @VsoMethod
  public Boolean getEastWest() {
    return eastWest;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param eastWest set the eastWest.
   */
  @VsoMethod
  public void setEastWest(Boolean  eastWest) {
    this.eastWest = eastWest;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gslbDnsUpdate
   */
  @VsoMethod
  public GslbDnsUpdate getGslbDnsUpdate() {
    return gslbDnsUpdate;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gslbDnsUpdate set the gslbDnsUpdate.
   */
  @VsoMethod
  public void setGslbDnsUpdate(GslbDnsUpdate gslbDnsUpdate) {
    this.gslbDnsUpdate = gslbDnsUpdate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipamDnsRecords
   */
  @VsoMethod
  public List<DnsRecord> getIpamDnsRecords() {
    return ipamDnsRecords;
  }

  /**
   * This is the setter method. this will set the ipamDnsRecords
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipamDnsRecords
   */
  @VsoMethod
  public void setIpamDnsRecords(List<DnsRecord>  ipamDnsRecords) {
    this.ipamDnsRecords = ipamDnsRecords;
  }

  /**
   * This is the setter method this will set the ipamDnsRecords
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipamDnsRecords
   */
  @VsoMethod
  public VirtualServiceRuntime addIpamDnsRecordsItem(DnsRecord ipamDnsRecordsItem) {
    if (this.ipamDnsRecords == null) {
      this.ipamDnsRecords = new ArrayList<DnsRecord>();
    }
    this.ipamDnsRecords.add(ipamDnsRecordsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isDnsVs
   */
  @VsoMethod
  public Boolean getIsDnsVs() {
    return isDnsVs;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isDnsVs set the isDnsVs.
   */
  @VsoMethod
  public void setIsDnsVs(Boolean  isDnsVs) {
    this.isDnsVs = isDnsVs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of times keys have been rotated.
   * Field introduced in 18.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return keyRotationCount
   */
  @VsoMethod
  public Integer getKeyRotationCount() {
    return keyRotationCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of times keys have been rotated.
   * Field introduced in 18.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param keyRotationCount set the keyRotationCount.
   */
  @VsoMethod
  public void setKeyRotationCount(Integer  keyRotationCount) {
    this.keyRotationCount = keyRotationCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastChangedTime
   */
  @VsoMethod
  public TimeStamp getLastChangedTime() {
    return lastChangedTime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastChangedTime set the lastChangedTime.
   */
  @VsoMethod
  public void setLastChangedTime(TimeStamp lastChangedTime) {
    this.lastChangedTime = lastChangedTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp of the last key rotation.
   * Field introduced in 18.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastKeyRotationTime
   */
  @VsoMethod
  public TimeStamp getLastKeyRotationTime() {
    return lastKeyRotationTime;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp of the last key rotation.
   * Field introduced in 18.2.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastKeyRotationTime set the lastKeyRotationTime.
   */
  @VsoMethod
  public void setLastKeyRotationTime(TimeStamp lastKeyRotationTime) {
    this.lastKeyRotationTime = lastKeyRotationTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lif
   */
  @VsoMethod
  public List<String> getLif() {
    return lif;
  }

  /**
   * This is the setter method. this will set the lif
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lif
   */
  @VsoMethod
  public void setLif(List<String>  lif) {
    this.lif = lif;
  }

  /**
   * This is the setter method this will set the lif
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lif
   */
  @VsoMethod
  public VirtualServiceRuntime addLifItem(String lifItem) {
    if (this.lif == null) {
      this.lif = new ArrayList<String>();
    }
    this.lif.add(lifItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return manualPlacement
   */
  @VsoMethod
  public Boolean getManualPlacement() {
    return manualPlacement;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param manualPlacement set the manualPlacement.
   */
  @VsoMethod
  public void setManualPlacement(Boolean  manualPlacement) {
    this.manualPlacement = manualPlacement;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return markedForDelete
   */
  @VsoMethod
  public Boolean getMarkedForDelete() {
    return markedForDelete;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param markedForDelete set the markedForDelete.
   */
  @VsoMethod
  public void setMarkedForDelete(Boolean  markedForDelete) {
    this.markedForDelete = markedForDelete;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metricsMgrPort
   */
  @VsoMethod
  public String getMetricsMgrPort() {
    return metricsMgrPort;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param metricsMgrPort set the metricsMgrPort.
   */
  @VsoMethod
  public void setMetricsMgrPort(String  metricsMgrPort) {
    this.metricsMgrPort = metricsMgrPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return numAdditionalSe
   */
  @VsoMethod
  public Integer getNumAdditionalSe() {
    return numAdditionalSe;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param numAdditionalSe set the numAdditionalSe.
   */
  @VsoMethod
  public void setNumAdditionalSe(Integer  numAdditionalSe) {
    this.numAdditionalSe = numAdditionalSe;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return onePlusOneHa
   */
  @VsoMethod
  public Boolean getOnePlusOneHa() {
    return onePlusOneHa;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param onePlusOneHa set the onePlusOneHa.
   */
  @VsoMethod
  public void setOnePlusOneHa(Boolean  onePlusOneHa) {
    this.onePlusOneHa = onePlusOneHa;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prevControllerIp
   */
  @VsoMethod
  public String getPrevControllerIp() {
    return prevControllerIp;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param prevControllerIp set the prevControllerIp.
   */
  @VsoMethod
  public void setPrevControllerIp(String  prevControllerIp) {
    this.prevControllerIp = prevControllerIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prevMetricsMgrPort
   */
  @VsoMethod
  public String getPrevMetricsMgrPort() {
    return prevMetricsMgrPort;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - METRICS_MGR_PORT_0, METRICS_MGR_PORT_1, METRICS_MGR_PORT_2, METRICS_MGR_PORT_3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param prevMetricsMgrPort set the prevMetricsMgrPort.
   */
  @VsoMethod
  public void setPrevMetricsMgrPort(String  prevMetricsMgrPort) {
    this.prevMetricsMgrPort = prevMetricsMgrPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return redisDb
   */
  @VsoMethod
  public Integer getRedisDb() {
    return redisDb;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param redisDb set the redisDb.
   */
  @VsoMethod
  public void setRedisDb(Integer  redisDb) {
    this.redisDb = redisDb;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return redisPort
   */
  @VsoMethod
  public Integer getRedisPort() {
    return redisPort;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param redisPort set the redisPort.
   */
  @VsoMethod
  public void setRedisPort(Integer  redisPort) {
    this.redisPort = redisPort;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Runtime info from security_manager.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return secMgrInfo
   */
  @VsoMethod
  public SecurityMgrRuntime getSecMgrInfo() {
    return secMgrInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Runtime info from security_manager.
   * Field introduced in 18.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param secMgrInfo set the secMgrInfo.
   */
  @VsoMethod
  public void setSecMgrInfo(SecurityMgrRuntime secMgrInfo) {
    this.secMgrInfo = secMgrInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable service engines to elect a primary amongst themselves in the absence of connectivity to controller.
   * Field introduced in 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return selfSeElection
   */
  @VsoMethod
  public Boolean getSelfSeElection() {
    return selfSeElection;
  }

  /**
   * This is the setter method to the attribute.
   * Enable service engines to elect a primary amongst themselves in the absence of connectivity to controller.
   * Field introduced in 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param selfSeElection set the selfSeElection.
   */
  @VsoMethod
  public void setSelfSeElection(Boolean  selfSeElection) {
    this.selfSeElection = selfSeElection;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tlsTicketKey
   */
  @VsoMethod
  public List<TLSTicket> getTlsTicketKey() {
    return tlsTicketKey;
  }

  /**
   * This is the setter method. this will set the tlsTicketKey
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tlsTicketKey
   */
  @VsoMethod
  public void setTlsTicketKey(List<TLSTicket>  tlsTicketKey) {
    this.tlsTicketKey = tlsTicketKey;
  }

  /**
   * This is the setter method this will set the tlsTicketKey
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tlsTicketKey
   */
  @VsoMethod
  public VirtualServiceRuntime addTlsTicketKeyItem(TLSTicket tlsTicketKeyItem) {
    if (this.tlsTicketKey == null) {
      this.tlsTicketKey = new ArrayList<TLSTicket>();
    }
    this.tlsTicketKey.add(tlsTicketKeyItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enum options - VS_TYPE_NORMAL, VS_TYPE_VH_PARENT, VS_TYPE_VH_CHILD.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "VS_TYPE_NORMAL".
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - VS_TYPE_NORMAL, VS_TYPE_VH_PARENT, VS_TYPE_VH_CHILD.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "VS_TYPE_NORMAL".
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
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
   * Version number of the se list update.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return version
   */
  @VsoMethod
  public Integer getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Version number of the se list update.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(Integer  version) {
    this.version = version;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type virtualservice.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vhChildVsRef
   */
  @VsoMethod
  public List<String> getVhChildVsRef() {
    return vhChildVsRef;
  }

  /**
   * This is the setter method. this will set the vhChildVsRef
   * It is a reference to an object of type virtualservice.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vhChildVsRef
   */
  @VsoMethod
  public void setVhChildVsRef(List<String>  vhChildVsRef) {
    this.vhChildVsRef = vhChildVsRef;
  }

  /**
   * This is the setter method this will set the vhChildVsRef
   * It is a reference to an object of type virtualservice.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vhChildVsRef
   */
  @VsoMethod
  public VirtualServiceRuntime addVhChildVsRefItem(String vhChildVsRefItem) {
    if (this.vhChildVsRef == null) {
      this.vhChildVsRef = new ArrayList<String>();
    }
    this.vhChildVsRef.add(vhChildVsRefItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipRuntime
   */
  @VsoMethod
  public List<VipRuntime> getVipRuntime() {
    return vipRuntime;
  }

  /**
   * This is the setter method. this will set the vipRuntime
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipRuntime
   */
  @VsoMethod
  public void setVipRuntime(List<VipRuntime>  vipRuntime) {
    this.vipRuntime = vipRuntime;
  }

  /**
   * This is the setter method this will set the vipRuntime
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vipRuntime
   */
  @VsoMethod
  public VirtualServiceRuntime addVipRuntimeItem(VipRuntime vipRuntimeItem) {
    if (this.vipRuntime == null) {
      this.vipRuntime = new ArrayList<VipRuntime>();
    }
    this.vipRuntime.add(vipRuntimeItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Vs update request received before warmstart finished.
   * Field introduced in 18.1.4, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUpdatePending
   */
  @VsoMethod
  public VirtualService getVsUpdatePending() {
    return vsUpdatePending;
  }

  /**
   * This is the setter method to the attribute.
   * Vs update request received before warmstart finished.
   * Field introduced in 18.1.4, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsUpdatePending set the vsUpdatePending.
   */
  @VsoMethod
  public void setVsUpdatePending(VirtualService vsUpdatePending) {
    this.vsUpdatePending = vsUpdatePending;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VirtualServiceRuntime objVirtualServiceRuntime = (VirtualServiceRuntime) o;
  return   Objects.equals(this.uuid, objVirtualServiceRuntime.uuid)&&
  Objects.equals(this.datapathDebug, objVirtualServiceRuntime.datapathDebug)&&
  Objects.equals(this.onePlusOneHa, objVirtualServiceRuntime.onePlusOneHa)&&
  Objects.equals(this.lastChangedTime, objVirtualServiceRuntime.lastChangedTime)&&
  Objects.equals(this.controllerIp, objVirtualServiceRuntime.controllerIp)&&
  Objects.equals(this.prevControllerIp, objVirtualServiceRuntime.prevControllerIp)&&
  Objects.equals(this.markedForDelete, objVirtualServiceRuntime.markedForDelete)&&
  Objects.equals(this.metricsMgrPort, objVirtualServiceRuntime.metricsMgrPort)&&
  Objects.equals(this.prevMetricsMgrPort, objVirtualServiceRuntime.prevMetricsMgrPort)&&
  Objects.equals(this.manualPlacement, objVirtualServiceRuntime.manualPlacement)&&
  Objects.equals(this.vhChildVsRef, objVirtualServiceRuntime.vhChildVsRef)&&
  Objects.equals(this.redisPort, objVirtualServiceRuntime.redisPort)&&
  Objects.equals(this.redisDb, objVirtualServiceRuntime.redisDb)&&
  Objects.equals(this.tlsTicketKey, objVirtualServiceRuntime.tlsTicketKey)&&
  Objects.equals(this.lif, objVirtualServiceRuntime.lif)&&
  Objects.equals(this.type, objVirtualServiceRuntime.type)&&
  Objects.equals(this.eastWest, objVirtualServiceRuntime.eastWest)&&
  Objects.equals(this.numAdditionalSe, objVirtualServiceRuntime.numAdditionalSe)&&
  Objects.equals(this.gslbDnsUpdate, objVirtualServiceRuntime.gslbDnsUpdate)&&
  Objects.equals(this.isDnsVs, objVirtualServiceRuntime.isDnsVs)&&
  Objects.equals(this.ipamDnsRecords, objVirtualServiceRuntime.ipamDnsRecords)&&
  Objects.equals(this.version, objVirtualServiceRuntime.version)&&
  Objects.equals(this.vipRuntime, objVirtualServiceRuntime.vipRuntime)&&
  Objects.equals(this.selfSeElection, objVirtualServiceRuntime.selfSeElection)&&
  Objects.equals(this.vsUpdatePending, objVirtualServiceRuntime.vsUpdatePending)&&
  Objects.equals(this.keyRotationCount, objVirtualServiceRuntime.keyRotationCount)&&
  Objects.equals(this.lastKeyRotationTime, objVirtualServiceRuntime.lastKeyRotationTime)&&
  Objects.equals(this.secMgrInfo, objVirtualServiceRuntime.secMgrInfo);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VirtualServiceRuntime {\n");
      sb.append("    controllerIp: ").append(toIndentedString(controllerIp)).append("\n");
        sb.append("    datapathDebug: ").append(toIndentedString(datapathDebug)).append("\n");
        sb.append("    eastWest: ").append(toIndentedString(eastWest)).append("\n");
        sb.append("    gslbDnsUpdate: ").append(toIndentedString(gslbDnsUpdate)).append("\n");
        sb.append("    ipamDnsRecords: ").append(toIndentedString(ipamDnsRecords)).append("\n");
        sb.append("    isDnsVs: ").append(toIndentedString(isDnsVs)).append("\n");
        sb.append("    keyRotationCount: ").append(toIndentedString(keyRotationCount)).append("\n");
        sb.append("    lastChangedTime: ").append(toIndentedString(lastChangedTime)).append("\n");
        sb.append("    lastKeyRotationTime: ").append(toIndentedString(lastKeyRotationTime)).append("\n");
        sb.append("    lif: ").append(toIndentedString(lif)).append("\n");
        sb.append("    manualPlacement: ").append(toIndentedString(manualPlacement)).append("\n");
        sb.append("    markedForDelete: ").append(toIndentedString(markedForDelete)).append("\n");
        sb.append("    metricsMgrPort: ").append(toIndentedString(metricsMgrPort)).append("\n");
        sb.append("    numAdditionalSe: ").append(toIndentedString(numAdditionalSe)).append("\n");
        sb.append("    onePlusOneHa: ").append(toIndentedString(onePlusOneHa)).append("\n");
        sb.append("    prevControllerIp: ").append(toIndentedString(prevControllerIp)).append("\n");
        sb.append("    prevMetricsMgrPort: ").append(toIndentedString(prevMetricsMgrPort)).append("\n");
        sb.append("    redisDb: ").append(toIndentedString(redisDb)).append("\n");
        sb.append("    redisPort: ").append(toIndentedString(redisPort)).append("\n");
        sb.append("    secMgrInfo: ").append(toIndentedString(secMgrInfo)).append("\n");
        sb.append("    selfSeElection: ").append(toIndentedString(selfSeElection)).append("\n");
        sb.append("    tlsTicketKey: ").append(toIndentedString(tlsTicketKey)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    vhChildVsRef: ").append(toIndentedString(vhChildVsRef)).append("\n");
        sb.append("    vipRuntime: ").append(toIndentedString(vipRuntime)).append("\n");
        sb.append("    vsUpdatePending: ").append(toIndentedString(vsUpdatePending)).append("\n");
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

