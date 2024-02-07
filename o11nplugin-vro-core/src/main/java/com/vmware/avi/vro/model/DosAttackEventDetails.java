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
 * The DosAttackEventDetails is a POJO class extends AviRestResource that used for creating
 * DosAttackEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DosAttackEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_DOSATTACKEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DosAttackEventDetails extends AviRestResource {
    @JsonProperty("attack")
    @JsonInclude(Include.NON_NULL)
    private String attack;

    @JsonProperty("attack_count")
    @JsonInclude(Include.NON_NULL)
    private Float attackCount;

    @JsonProperty("ipgroup_uuids")
    @JsonInclude(Include.NON_NULL)
    private List<String> ipgroupUuids;

    @JsonProperty("meta_data")
    @JsonInclude(Include.NON_NULL)
    private List<AttackMetaData> metaData;

    @JsonProperty("src_ips")
    @JsonInclude(Include.NON_NULL)
    private List<String> srcIps;

    @JsonProperty("urls")
    @JsonInclude(Include.NON_NULL)
    private List<String> urls;



  /**
   * This is the getter method this will return the attribute value.
   * Enum options - LAND, SMURF, ICMP_PING_FLOOD, UNKOWN_PROTOCOL, TEARDROP, IP_FRAG_OVERRUN, IP_FRAG_TOOSMALL, IP_FRAG_FULL, IP_FRAG_INCOMPLETE,
   * PORT_SCAN, TCP_NON_SYN_FLOOD_OLD, SYN_FLOOD, BAD_RST_FLOOD, MALFORMED_FLOOD, FAKE_SESSION, ZERO_WINDOW_STRESS, SMALL_WINDOW_STRESS,
   * DOS_HTTP_TIMEOUT, DOS_HTTP_ERROR, DOS_HTTP_ABORT...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attack
   */
  @VsoMethod
  public String getAttack() {
    return attack;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - LAND, SMURF, ICMP_PING_FLOOD, UNKOWN_PROTOCOL, TEARDROP, IP_FRAG_OVERRUN, IP_FRAG_TOOSMALL, IP_FRAG_FULL, IP_FRAG_INCOMPLETE,
   * PORT_SCAN, TCP_NON_SYN_FLOOD_OLD, SYN_FLOOD, BAD_RST_FLOOD, MALFORMED_FLOOD, FAKE_SESSION, ZERO_WINDOW_STRESS, SMALL_WINDOW_STRESS,
   * DOS_HTTP_TIMEOUT, DOS_HTTP_ERROR, DOS_HTTP_ABORT...
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param attack set the attack.
   */
  @VsoMethod
  public void setAttack(String  attack) {
    this.attack = attack;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attackCount
   */
  @VsoMethod
  public Float getAttackCount() {
    return attackCount;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param attackCount set the attackCount.
   */
  @VsoMethod
  public void setAttackCount(Float  attackCount) {
    this.attackCount = attackCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipgroupUuids
   */
  @VsoMethod
  public List<String> getIpgroupUuids() {
    return ipgroupUuids;
  }

  /**
   * This is the setter method. this will set the ipgroupUuids
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipgroupUuids
   */
  @VsoMethod
  public void setIpgroupUuids(List<String>  ipgroupUuids) {
    this.ipgroupUuids = ipgroupUuids;
  }

  /**
   * This is the setter method this will set the ipgroupUuids
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipgroupUuids
   */
  @VsoMethod
  public DosAttackEventDetails addIpgroupUuidsItem(String ipgroupUuidsItem) {
    if (this.ipgroupUuids == null) {
      this.ipgroupUuids = new ArrayList<String>();
    }
    this.ipgroupUuids.add(ipgroupUuidsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metaData
   */
  @VsoMethod
  public List<AttackMetaData> getMetaData() {
    return metaData;
  }

  /**
   * This is the setter method. this will set the metaData
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metaData
   */
  @VsoMethod
  public void setMetaData(List<AttackMetaData>  metaData) {
    this.metaData = metaData;
  }

  /**
   * This is the setter method this will set the metaData
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metaData
   */
  @VsoMethod
  public DosAttackEventDetails addMetaDataItem(AttackMetaData metaDataItem) {
    if (this.metaData == null) {
      this.metaData = new ArrayList<AttackMetaData>();
    }
    this.metaData.add(metaDataItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return srcIps
   */
  @VsoMethod
  public List<String> getSrcIps() {
    return srcIps;
  }

  /**
   * This is the setter method. this will set the srcIps
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return srcIps
   */
  @VsoMethod
  public void setSrcIps(List<String>  srcIps) {
    this.srcIps = srcIps;
  }

  /**
   * This is the setter method this will set the srcIps
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return srcIps
   */
  @VsoMethod
  public DosAttackEventDetails addSrcIpsItem(String srcIpsItem) {
    if (this.srcIps == null) {
      this.srcIps = new ArrayList<String>();
    }
    this.srcIps.add(srcIpsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return urls
   */
  @VsoMethod
  public List<String> getUrls() {
    return urls;
  }

  /**
   * This is the setter method. this will set the urls
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return urls
   */
  @VsoMethod
  public void setUrls(List<String>  urls) {
    this.urls = urls;
  }

  /**
   * This is the setter method this will set the urls
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return urls
   */
  @VsoMethod
  public DosAttackEventDetails addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<String>();
    }
    this.urls.add(urlsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DosAttackEventDetails objDosAttackEventDetails = (DosAttackEventDetails) o;
  return   Objects.equals(this.attackCount, objDosAttackEventDetails.attackCount)&&
  Objects.equals(this.attack, objDosAttackEventDetails.attack)&&
  Objects.equals(this.srcIps, objDosAttackEventDetails.srcIps)&&
  Objects.equals(this.urls, objDosAttackEventDetails.urls)&&
  Objects.equals(this.ipgroupUuids, objDosAttackEventDetails.ipgroupUuids)&&
  Objects.equals(this.metaData, objDosAttackEventDetails.metaData);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DosAttackEventDetails {\n");
      sb.append("    attack: ").append(toIndentedString(attack)).append("\n");
        sb.append("    attackCount: ").append(toIndentedString(attackCount)).append("\n");
        sb.append("    ipgroupUuids: ").append(toIndentedString(ipgroupUuids)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
        sb.append("    srcIps: ").append(toIndentedString(srcIps)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

