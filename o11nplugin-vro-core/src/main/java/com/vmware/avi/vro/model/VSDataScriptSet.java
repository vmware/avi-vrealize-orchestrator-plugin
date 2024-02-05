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
 * The VSDataScriptSet is a POJO class extends AviRestResource that used for creating
 * VSDataScriptSet.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VSDataScriptSet")
@VsoFinder(name = Constants.FINDER_VRO_VSDATASCRIPTSET, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VSDataScriptSet extends AviRestResource {
    @JsonProperty("created_by")
    @JsonInclude(Include.NON_NULL)
    private String createdBy;

    @JsonProperty("datascript")
    @JsonInclude(Include.NON_NULL)
    private List<VSDataScript> datascript;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("geo_db_ref")
    @JsonInclude(Include.NON_NULL)
    private String geoDbRef;

    @JsonProperty("ip_reputation_db_ref")
    @JsonInclude(Include.NON_NULL)
    private String ipReputationDbRef;

    @JsonProperty("ipgroup_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> ipgroupRefs;

    @JsonProperty("markers")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("pki_profile_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> pkiProfileRefs;

    @JsonProperty("pool_group_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> poolGroupRefs;

    @JsonProperty("pool_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> poolRefs;

    @JsonProperty("protocol_parser_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> protocolParserRefs;

    @JsonProperty("rate_limiters")
    @JsonInclude(Include.NON_NULL)
    private List<RateLimiter> rateLimiters;

    @JsonProperty("ssl_key_certificate_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> sslKeyCertificateRefs;

    @JsonProperty("ssl_profile_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> sslProfileRefs;

    @JsonProperty("string_group_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> stringGroupRefs;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Creator name.
   * Field introduced in 17.1.11,17.2.4.
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
   * Field introduced in 17.1.11,17.2.4.
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
   * Datascripts to execute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return datascript
   */
  @VsoMethod
  public List<VSDataScript> getDatascript() {
    return datascript;
  }

  /**
   * This is the setter method. this will set the datascript
   * Datascripts to execute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return datascript
   */
  @VsoMethod
  public void setDatascript(List<VSDataScript>  datascript) {
    this.datascript = datascript;
  }

  /**
   * This is the setter method this will set the datascript
   * Datascripts to execute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return datascript
   */
  @VsoMethod
  public VSDataScriptSet addDatascriptItem(VSDataScript datascriptItem) {
    if (this.datascript == null) {
      this.datascript = new ArrayList<VSDataScript>();
    }
    this.datascript.add(datascriptItem);
    return this;
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
   * Geo location mapping database used by this datascriptset.
   * It is a reference to an object of type geodb.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return geoDbRef
   */
  @VsoMethod
  public String getGeoDbRef() {
    return geoDbRef;
  }

  /**
   * This is the setter method to the attribute.
   * Geo location mapping database used by this datascriptset.
   * It is a reference to an object of type geodb.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param geoDbRef set the geoDbRef.
   */
  @VsoMethod
  public void setGeoDbRef(String  geoDbRef) {
    this.geoDbRef = geoDbRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip reputation database that can be used by datascript functions.
   * It is a reference to an object of type ipreputationdb.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipReputationDbRef
   */
  @VsoMethod
  public String getIpReputationDbRef() {
    return ipReputationDbRef;
  }

  /**
   * This is the setter method to the attribute.
   * Ip reputation database that can be used by datascript functions.
   * It is a reference to an object of type ipreputationdb.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipReputationDbRef set the ipReputationDbRef.
   */
  @VsoMethod
  public void setIpReputationDbRef(String  ipReputationDbRef) {
    this.ipReputationDbRef = ipReputationDbRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of ip groups that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type ipaddrgroup.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipgroupRefs
   */
  @VsoMethod
  public List<String> getIpgroupRefs() {
    return ipgroupRefs;
  }

  /**
   * This is the setter method. this will set the ipgroupRefs
   * Uuid of ip groups that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type ipaddrgroup.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipgroupRefs
   */
  @VsoMethod
  public void setIpgroupRefs(List<String>  ipgroupRefs) {
    this.ipgroupRefs = ipgroupRefs;
  }

  /**
   * This is the setter method this will set the ipgroupRefs
   * Uuid of ip groups that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type ipaddrgroup.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipgroupRefs
   */
  @VsoMethod
  public VSDataScriptSet addIpgroupRefsItem(String ipgroupRefsItem) {
    if (this.ipgroupRefs == null) {
      this.ipgroupRefs = new ArrayList<String>();
    }
    this.ipgroupRefs.add(ipgroupRefsItem);
    return this;
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
  public VSDataScriptSet addMarkersItem(RoleFilterMatchLabel markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<RoleFilterMatchLabel>();
    }
    this.markers.add(markersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name for the virtual service datascript collection.
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
   * Name for the virtual service datascript collection.
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
   * Uuids of pkiprofile objects that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type pkiprofile.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pkiProfileRefs
   */
  @VsoMethod
  public List<String> getPkiProfileRefs() {
    return pkiProfileRefs;
  }

  /**
   * This is the setter method. this will set the pkiProfileRefs
   * Uuids of pkiprofile objects that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type pkiprofile.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pkiProfileRefs
   */
  @VsoMethod
  public void setPkiProfileRefs(List<String>  pkiProfileRefs) {
    this.pkiProfileRefs = pkiProfileRefs;
  }

  /**
   * This is the setter method this will set the pkiProfileRefs
   * Uuids of pkiprofile objects that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type pkiprofile.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pkiProfileRefs
   */
  @VsoMethod
  public VSDataScriptSet addPkiProfileRefsItem(String pkiProfileRefsItem) {
    if (this.pkiProfileRefs == null) {
      this.pkiProfileRefs = new ArrayList<String>();
    }
    this.pkiProfileRefs.add(pkiProfileRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Uuid of pool groups that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type poolgroup.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolGroupRefs
   */
  @VsoMethod
  public List<String> getPoolGroupRefs() {
    return poolGroupRefs;
  }

  /**
   * This is the setter method. this will set the poolGroupRefs
   * Uuid of pool groups that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type poolgroup.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolGroupRefs
   */
  @VsoMethod
  public void setPoolGroupRefs(List<String>  poolGroupRefs) {
    this.poolGroupRefs = poolGroupRefs;
  }

  /**
   * This is the setter method this will set the poolGroupRefs
   * Uuid of pool groups that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type poolgroup.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolGroupRefs
   */
  @VsoMethod
  public VSDataScriptSet addPoolGroupRefsItem(String poolGroupRefsItem) {
    if (this.poolGroupRefs == null) {
      this.poolGroupRefs = new ArrayList<String>();
    }
    this.poolGroupRefs.add(poolGroupRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Uuid of pools that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type pool.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolRefs
   */
  @VsoMethod
  public List<String> getPoolRefs() {
    return poolRefs;
  }

  /**
   * This is the setter method. this will set the poolRefs
   * Uuid of pools that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type pool.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolRefs
   */
  @VsoMethod
  public void setPoolRefs(List<String>  poolRefs) {
    this.poolRefs = poolRefs;
  }

  /**
   * This is the setter method this will set the poolRefs
   * Uuid of pools that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type pool.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolRefs
   */
  @VsoMethod
  public VSDataScriptSet addPoolRefsItem(String poolRefsItem) {
    if (this.poolRefs == null) {
      this.poolRefs = new ArrayList<String>();
    }
    this.poolRefs.add(poolRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * List of protocol parsers that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type protocolparser.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return protocolParserRefs
   */
  @VsoMethod
  public List<String> getProtocolParserRefs() {
    return protocolParserRefs;
  }

  /**
   * This is the setter method. this will set the protocolParserRefs
   * List of protocol parsers that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type protocolparser.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return protocolParserRefs
   */
  @VsoMethod
  public void setProtocolParserRefs(List<String>  protocolParserRefs) {
    this.protocolParserRefs = protocolParserRefs;
  }

  /**
   * This is the setter method this will set the protocolParserRefs
   * List of protocol parsers that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type protocolparser.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return protocolParserRefs
   */
  @VsoMethod
  public VSDataScriptSet addProtocolParserRefsItem(String protocolParserRefsItem) {
    if (this.protocolParserRefs == null) {
      this.protocolParserRefs = new ArrayList<String>();
    }
    this.protocolParserRefs.add(protocolParserRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The rate limit definitions needed for this datascript.
   * The name is composed of the virtual service name and the datascript name.
   * Field introduced in 18.2.9.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rateLimiters
   */
  @VsoMethod
  public List<RateLimiter> getRateLimiters() {
    return rateLimiters;
  }

  /**
   * This is the setter method. this will set the rateLimiters
   * The rate limit definitions needed for this datascript.
   * The name is composed of the virtual service name and the datascript name.
   * Field introduced in 18.2.9.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rateLimiters
   */
  @VsoMethod
  public void setRateLimiters(List<RateLimiter>  rateLimiters) {
    this.rateLimiters = rateLimiters;
  }

  /**
   * This is the setter method this will set the rateLimiters
   * The rate limit definitions needed for this datascript.
   * The name is composed of the virtual service name and the datascript name.
   * Field introduced in 18.2.9.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rateLimiters
   */
  @VsoMethod
  public VSDataScriptSet addRateLimitersItem(RateLimiter rateLimitersItem) {
    if (this.rateLimiters == null) {
      this.rateLimiters = new ArrayList<RateLimiter>();
    }
    this.rateLimiters.add(rateLimitersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Uuids of sslkeyandcertificate objects that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslKeyCertificateRefs
   */
  @VsoMethod
  public List<String> getSslKeyCertificateRefs() {
    return sslKeyCertificateRefs;
  }

  /**
   * This is the setter method. this will set the sslKeyCertificateRefs
   * Uuids of sslkeyandcertificate objects that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslKeyCertificateRefs
   */
  @VsoMethod
  public void setSslKeyCertificateRefs(List<String>  sslKeyCertificateRefs) {
    this.sslKeyCertificateRefs = sslKeyCertificateRefs;
  }

  /**
   * This is the setter method this will set the sslKeyCertificateRefs
   * Uuids of sslkeyandcertificate objects that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslKeyCertificateRefs
   */
  @VsoMethod
  public VSDataScriptSet addSslKeyCertificateRefsItem(String sslKeyCertificateRefsItem) {
    if (this.sslKeyCertificateRefs == null) {
      this.sslKeyCertificateRefs = new ArrayList<String>();
    }
    this.sslKeyCertificateRefs.add(sslKeyCertificateRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Uuids of sslprofile objects that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type sslprofile.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslProfileRefs
   */
  @VsoMethod
  public List<String> getSslProfileRefs() {
    return sslProfileRefs;
  }

  /**
   * This is the setter method. this will set the sslProfileRefs
   * Uuids of sslprofile objects that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type sslprofile.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslProfileRefs
   */
  @VsoMethod
  public void setSslProfileRefs(List<String>  sslProfileRefs) {
    this.sslProfileRefs = sslProfileRefs;
  }

  /**
   * This is the setter method this will set the sslProfileRefs
   * Uuids of sslprofile objects that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type sslprofile.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslProfileRefs
   */
  @VsoMethod
  public VSDataScriptSet addSslProfileRefsItem(String sslProfileRefsItem) {
    if (this.sslProfileRefs == null) {
      this.sslProfileRefs = new ArrayList<String>();
    }
    this.sslProfileRefs.add(sslProfileRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Uuid of string groups that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type stringgroup.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringGroupRefs
   */
  @VsoMethod
  public List<String> getStringGroupRefs() {
    return stringGroupRefs;
  }

  /**
   * This is the setter method. this will set the stringGroupRefs
   * Uuid of string groups that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type stringgroup.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringGroupRefs
   */
  @VsoMethod
  public void setStringGroupRefs(List<String>  stringGroupRefs) {
    this.stringGroupRefs = stringGroupRefs;
  }

  /**
   * This is the setter method this will set the stringGroupRefs
   * Uuid of string groups that could be referred by vsdatascriptset objects.
   * It is a reference to an object of type stringgroup.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringGroupRefs
   */
  @VsoMethod
  public VSDataScriptSet addStringGroupRefsItem(String stringGroupRefsItem) {
    if (this.stringGroupRefs == null) {
      this.stringGroupRefs = new ArrayList<String>();
    }
    this.stringGroupRefs.add(stringGroupRefsItem);
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
   * Uuid of the virtual service datascript collection.
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
   * Uuid of the virtual service datascript collection.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
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
  VSDataScriptSet objVSDataScriptSet = (VSDataScriptSet) o;
  return   Objects.equals(this.uuid, objVSDataScriptSet.uuid)&&
  Objects.equals(this.name, objVSDataScriptSet.name)&&
  Objects.equals(this.datascript, objVSDataScriptSet.datascript)&&
  Objects.equals(this.poolRefs, objVSDataScriptSet.poolRefs)&&
  Objects.equals(this.poolGroupRefs, objVSDataScriptSet.poolGroupRefs)&&
  Objects.equals(this.ipgroupRefs, objVSDataScriptSet.ipgroupRefs)&&
  Objects.equals(this.stringGroupRefs, objVSDataScriptSet.stringGroupRefs)&&
  Objects.equals(this.createdBy, objVSDataScriptSet.createdBy)&&
  Objects.equals(this.protocolParserRefs, objVSDataScriptSet.protocolParserRefs)&&
  Objects.equals(this.ipReputationDbRef, objVSDataScriptSet.ipReputationDbRef)&&
  Objects.equals(this.markers, objVSDataScriptSet.markers)&&
  Objects.equals(this.description, objVSDataScriptSet.description)&&
  Objects.equals(this.tenantRef, objVSDataScriptSet.tenantRef)&&
  Objects.equals(this.rateLimiters, objVSDataScriptSet.rateLimiters)&&
  Objects.equals(this.geoDbRef, objVSDataScriptSet.geoDbRef)&&
  Objects.equals(this.sslProfileRefs, objVSDataScriptSet.sslProfileRefs)&&
  Objects.equals(this.sslKeyCertificateRefs, objVSDataScriptSet.sslKeyCertificateRefs)&&
  Objects.equals(this.pkiProfileRefs, objVSDataScriptSet.pkiProfileRefs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VSDataScriptSet {\n");
      sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    datascript: ").append(toIndentedString(datascript)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    geoDbRef: ").append(toIndentedString(geoDbRef)).append("\n");
        sb.append("    ipReputationDbRef: ").append(toIndentedString(ipReputationDbRef)).append("\n");
        sb.append("    ipgroupRefs: ").append(toIndentedString(ipgroupRefs)).append("\n");
        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pkiProfileRefs: ").append(toIndentedString(pkiProfileRefs)).append("\n");
        sb.append("    poolGroupRefs: ").append(toIndentedString(poolGroupRefs)).append("\n");
        sb.append("    poolRefs: ").append(toIndentedString(poolRefs)).append("\n");
        sb.append("    protocolParserRefs: ").append(toIndentedString(protocolParserRefs)).append("\n");
        sb.append("    rateLimiters: ").append(toIndentedString(rateLimiters)).append("\n");
        sb.append("    sslKeyCertificateRefs: ").append(toIndentedString(sslKeyCertificateRefs)).append("\n");
        sb.append("    sslProfileRefs: ").append(toIndentedString(sslProfileRefs)).append("\n");
        sb.append("    stringGroupRefs: ").append(toIndentedString(stringGroupRefs)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

