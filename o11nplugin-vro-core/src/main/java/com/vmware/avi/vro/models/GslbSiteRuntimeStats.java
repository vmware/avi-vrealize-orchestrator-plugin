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
 * The GslbSiteRuntimeStats is a POJO class extends AviRestResource that used for creating
 * GslbSiteRuntimeStats.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbSiteRuntimeStats")
@VsoFinder(name = Constants.FINDER_VRO_GSLBSITERUNTIMESTATS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbSiteRuntimeStats extends AviRestResource {
    @JsonProperty("num_file_cr_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numFileCrTxed = null;

    @JsonProperty("num_file_del_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numFileDelTxed = null;

    @JsonProperty("num_gap_cr_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGapCrRxed = null;

    @JsonProperty("num_gap_cr_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGapCrTxed = null;

    @JsonProperty("num_gap_del_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGapDelRxed = null;

    @JsonProperty("num_gap_del_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGapDelTxed = null;

    @JsonProperty("num_gap_upd_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGapUpdRxed = null;

    @JsonProperty("num_gap_upd_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGapUpdTxed = null;

    @JsonProperty("num_geo_cr_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGeoCrRxed = null;

    @JsonProperty("num_geo_cr_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGeoCrTxed = null;

    @JsonProperty("num_geo_del_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGeoDelRxed = null;

    @JsonProperty("num_geo_del_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGeoDelTxed = null;

    @JsonProperty("num_geo_upd_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGeoUpdRxed = null;

    @JsonProperty("num_geo_upd_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGeoUpdTxed = null;

    @JsonProperty("num_ghm_cr_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGhmCrRxed = null;

    @JsonProperty("num_ghm_cr_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGhmCrTxed = null;

    @JsonProperty("num_ghm_del_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGhmDelRxed = null;

    @JsonProperty("num_ghm_del_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGhmDelTxed = null;

    @JsonProperty("num_ghm_upd_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGhmUpdRxed = null;

    @JsonProperty("num_ghm_upd_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGhmUpdTxed = null;

    @JsonProperty("num_gjwt_cr_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGjwtCrRxed = null;

    @JsonProperty("num_gjwt_cr_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGjwtCrTxed = null;

    @JsonProperty("num_gjwt_del_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGjwtDelRxed = null;

    @JsonProperty("num_gjwt_del_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGjwtDelTxed = null;

    @JsonProperty("num_gjwt_upd_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGjwtUpdRxed = null;

    @JsonProperty("num_gjwt_upd_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGjwtUpdTxed = null;

    @JsonProperty("num_glb_cr_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGlbCrRxed = null;

    @JsonProperty("num_glb_cr_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGlbCrTxed = null;

    @JsonProperty("num_glb_del_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGlbDelRxed = null;

    @JsonProperty("num_glb_del_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGlbDelTxed = null;

    @JsonProperty("num_glb_upd_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGlbUpdRxed = null;

    @JsonProperty("num_glb_upd_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGlbUpdTxed = null;

    @JsonProperty("num_gpki_cr_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGpkiCrRxed = null;

    @JsonProperty("num_gpki_cr_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGpkiCrTxed = null;

    @JsonProperty("num_gpki_del_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGpkiDelRxed = null;

    @JsonProperty("num_gpki_del_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGpkiDelTxed = null;

    @JsonProperty("num_gpki_upd_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGpkiUpdRxed = null;

    @JsonProperty("num_gpki_upd_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGpkiUpdTxed = null;

    @JsonProperty("num_gs_cr_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGsCrRxed = null;

    @JsonProperty("num_gs_cr_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGsCrTxed = null;

    @JsonProperty("num_gs_del_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGsDelRxed = null;

    @JsonProperty("num_gs_del_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGsDelTxed = null;

    @JsonProperty("num_gs_upd_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGsUpdRxed = null;

    @JsonProperty("num_gs_upd_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numGsUpdTxed = null;

    @JsonProperty("num_health_msgs_rxed")
    @JsonInclude(Include.NON_NULL)
    private Integer numHealthMsgsRxed = null;

    @JsonProperty("num_health_msgs_txed")
    @JsonInclude(Include.NON_NULL)
    private Integer numHealthMsgsTxed = null;

    @JsonProperty("num_of_bad_responses")
    @JsonInclude(Include.NON_NULL)
    private Integer numOfBadResponses = null;

    @JsonProperty("num_of_events_generated")
    @JsonInclude(Include.NON_NULL)
    private Integer numOfEventsGenerated = null;

    @JsonProperty("num_of_skip_outstanding_requests")
    @JsonInclude(Include.NON_NULL)
    private Integer numOfSkipOutstandingRequests = null;

    @JsonProperty("num_of_timeouts")
    @JsonInclude(Include.NON_NULL)
    private Integer numOfTimeouts = null;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numFileCrTxed
   */
  @VsoMethod
  public Integer getNumFileCrTxed() {
    return numFileCrTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numFileCrTxed set the numFileCrTxed.
   */
  @VsoMethod
  public void setNumFileCrTxed(Integer  numFileCrTxed) {
    this.numFileCrTxed = numFileCrTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numFileDelTxed
   */
  @VsoMethod
  public Integer getNumFileDelTxed() {
    return numFileDelTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numFileDelTxed set the numFileDelTxed.
   */
  @VsoMethod
  public void setNumFileDelTxed(Integer  numFileDelTxed) {
    this.numFileDelTxed = numFileDelTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGapCrRxed
   */
  @VsoMethod
  public Integer getNumGapCrRxed() {
    return numGapCrRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGapCrRxed set the numGapCrRxed.
   */
  @VsoMethod
  public void setNumGapCrRxed(Integer  numGapCrRxed) {
    this.numGapCrRxed = numGapCrRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGapCrTxed
   */
  @VsoMethod
  public Integer getNumGapCrTxed() {
    return numGapCrTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGapCrTxed set the numGapCrTxed.
   */
  @VsoMethod
  public void setNumGapCrTxed(Integer  numGapCrTxed) {
    this.numGapCrTxed = numGapCrTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGapDelRxed
   */
  @VsoMethod
  public Integer getNumGapDelRxed() {
    return numGapDelRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGapDelRxed set the numGapDelRxed.
   */
  @VsoMethod
  public void setNumGapDelRxed(Integer  numGapDelRxed) {
    this.numGapDelRxed = numGapDelRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGapDelTxed
   */
  @VsoMethod
  public Integer getNumGapDelTxed() {
    return numGapDelTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGapDelTxed set the numGapDelTxed.
   */
  @VsoMethod
  public void setNumGapDelTxed(Integer  numGapDelTxed) {
    this.numGapDelTxed = numGapDelTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGapUpdRxed
   */
  @VsoMethod
  public Integer getNumGapUpdRxed() {
    return numGapUpdRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGapUpdRxed set the numGapUpdRxed.
   */
  @VsoMethod
  public void setNumGapUpdRxed(Integer  numGapUpdRxed) {
    this.numGapUpdRxed = numGapUpdRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGapUpdTxed
   */
  @VsoMethod
  public Integer getNumGapUpdTxed() {
    return numGapUpdTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGapUpdTxed set the numGapUpdTxed.
   */
  @VsoMethod
  public void setNumGapUpdTxed(Integer  numGapUpdTxed) {
    this.numGapUpdTxed = numGapUpdTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGeoCrRxed
   */
  @VsoMethod
  public Integer getNumGeoCrRxed() {
    return numGeoCrRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGeoCrRxed set the numGeoCrRxed.
   */
  @VsoMethod
  public void setNumGeoCrRxed(Integer  numGeoCrRxed) {
    this.numGeoCrRxed = numGeoCrRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGeoCrTxed
   */
  @VsoMethod
  public Integer getNumGeoCrTxed() {
    return numGeoCrTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGeoCrTxed set the numGeoCrTxed.
   */
  @VsoMethod
  public void setNumGeoCrTxed(Integer  numGeoCrTxed) {
    this.numGeoCrTxed = numGeoCrTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGeoDelRxed
   */
  @VsoMethod
  public Integer getNumGeoDelRxed() {
    return numGeoDelRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGeoDelRxed set the numGeoDelRxed.
   */
  @VsoMethod
  public void setNumGeoDelRxed(Integer  numGeoDelRxed) {
    this.numGeoDelRxed = numGeoDelRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGeoDelTxed
   */
  @VsoMethod
  public Integer getNumGeoDelTxed() {
    return numGeoDelTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGeoDelTxed set the numGeoDelTxed.
   */
  @VsoMethod
  public void setNumGeoDelTxed(Integer  numGeoDelTxed) {
    this.numGeoDelTxed = numGeoDelTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGeoUpdRxed
   */
  @VsoMethod
  public Integer getNumGeoUpdRxed() {
    return numGeoUpdRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGeoUpdRxed set the numGeoUpdRxed.
   */
  @VsoMethod
  public void setNumGeoUpdRxed(Integer  numGeoUpdRxed) {
    this.numGeoUpdRxed = numGeoUpdRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGeoUpdTxed
   */
  @VsoMethod
  public Integer getNumGeoUpdTxed() {
    return numGeoUpdTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGeoUpdTxed set the numGeoUpdTxed.
   */
  @VsoMethod
  public void setNumGeoUpdTxed(Integer  numGeoUpdTxed) {
    this.numGeoUpdTxed = numGeoUpdTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGhmCrRxed
   */
  @VsoMethod
  public Integer getNumGhmCrRxed() {
    return numGhmCrRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGhmCrRxed set the numGhmCrRxed.
   */
  @VsoMethod
  public void setNumGhmCrRxed(Integer  numGhmCrRxed) {
    this.numGhmCrRxed = numGhmCrRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGhmCrTxed
   */
  @VsoMethod
  public Integer getNumGhmCrTxed() {
    return numGhmCrTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGhmCrTxed set the numGhmCrTxed.
   */
  @VsoMethod
  public void setNumGhmCrTxed(Integer  numGhmCrTxed) {
    this.numGhmCrTxed = numGhmCrTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGhmDelRxed
   */
  @VsoMethod
  public Integer getNumGhmDelRxed() {
    return numGhmDelRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGhmDelRxed set the numGhmDelRxed.
   */
  @VsoMethod
  public void setNumGhmDelRxed(Integer  numGhmDelRxed) {
    this.numGhmDelRxed = numGhmDelRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGhmDelTxed
   */
  @VsoMethod
  public Integer getNumGhmDelTxed() {
    return numGhmDelTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGhmDelTxed set the numGhmDelTxed.
   */
  @VsoMethod
  public void setNumGhmDelTxed(Integer  numGhmDelTxed) {
    this.numGhmDelTxed = numGhmDelTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGhmUpdRxed
   */
  @VsoMethod
  public Integer getNumGhmUpdRxed() {
    return numGhmUpdRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGhmUpdRxed set the numGhmUpdRxed.
   */
  @VsoMethod
  public void setNumGhmUpdRxed(Integer  numGhmUpdRxed) {
    this.numGhmUpdRxed = numGhmUpdRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGhmUpdTxed
   */
  @VsoMethod
  public Integer getNumGhmUpdTxed() {
    return numGhmUpdTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGhmUpdTxed set the numGhmUpdTxed.
   */
  @VsoMethod
  public void setNumGhmUpdTxed(Integer  numGhmUpdTxed) {
    this.numGhmUpdTxed = numGhmUpdTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGjwtCrRxed
   */
  @VsoMethod
  public Integer getNumGjwtCrRxed() {
    return numGjwtCrRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGjwtCrRxed set the numGjwtCrRxed.
   */
  @VsoMethod
  public void setNumGjwtCrRxed(Integer  numGjwtCrRxed) {
    this.numGjwtCrRxed = numGjwtCrRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGjwtCrTxed
   */
  @VsoMethod
  public Integer getNumGjwtCrTxed() {
    return numGjwtCrTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGjwtCrTxed set the numGjwtCrTxed.
   */
  @VsoMethod
  public void setNumGjwtCrTxed(Integer  numGjwtCrTxed) {
    this.numGjwtCrTxed = numGjwtCrTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGjwtDelRxed
   */
  @VsoMethod
  public Integer getNumGjwtDelRxed() {
    return numGjwtDelRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGjwtDelRxed set the numGjwtDelRxed.
   */
  @VsoMethod
  public void setNumGjwtDelRxed(Integer  numGjwtDelRxed) {
    this.numGjwtDelRxed = numGjwtDelRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGjwtDelTxed
   */
  @VsoMethod
  public Integer getNumGjwtDelTxed() {
    return numGjwtDelTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGjwtDelTxed set the numGjwtDelTxed.
   */
  @VsoMethod
  public void setNumGjwtDelTxed(Integer  numGjwtDelTxed) {
    this.numGjwtDelTxed = numGjwtDelTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGjwtUpdRxed
   */
  @VsoMethod
  public Integer getNumGjwtUpdRxed() {
    return numGjwtUpdRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGjwtUpdRxed set the numGjwtUpdRxed.
   */
  @VsoMethod
  public void setNumGjwtUpdRxed(Integer  numGjwtUpdRxed) {
    this.numGjwtUpdRxed = numGjwtUpdRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGjwtUpdTxed
   */
  @VsoMethod
  public Integer getNumGjwtUpdTxed() {
    return numGjwtUpdTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGjwtUpdTxed set the numGjwtUpdTxed.
   */
  @VsoMethod
  public void setNumGjwtUpdTxed(Integer  numGjwtUpdTxed) {
    this.numGjwtUpdTxed = numGjwtUpdTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGlbCrRxed
   */
  @VsoMethod
  public Integer getNumGlbCrRxed() {
    return numGlbCrRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGlbCrRxed set the numGlbCrRxed.
   */
  @VsoMethod
  public void setNumGlbCrRxed(Integer  numGlbCrRxed) {
    this.numGlbCrRxed = numGlbCrRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGlbCrTxed
   */
  @VsoMethod
  public Integer getNumGlbCrTxed() {
    return numGlbCrTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGlbCrTxed set the numGlbCrTxed.
   */
  @VsoMethod
  public void setNumGlbCrTxed(Integer  numGlbCrTxed) {
    this.numGlbCrTxed = numGlbCrTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGlbDelRxed
   */
  @VsoMethod
  public Integer getNumGlbDelRxed() {
    return numGlbDelRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGlbDelRxed set the numGlbDelRxed.
   */
  @VsoMethod
  public void setNumGlbDelRxed(Integer  numGlbDelRxed) {
    this.numGlbDelRxed = numGlbDelRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGlbDelTxed
   */
  @VsoMethod
  public Integer getNumGlbDelTxed() {
    return numGlbDelTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGlbDelTxed set the numGlbDelTxed.
   */
  @VsoMethod
  public void setNumGlbDelTxed(Integer  numGlbDelTxed) {
    this.numGlbDelTxed = numGlbDelTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGlbUpdRxed
   */
  @VsoMethod
  public Integer getNumGlbUpdRxed() {
    return numGlbUpdRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGlbUpdRxed set the numGlbUpdRxed.
   */
  @VsoMethod
  public void setNumGlbUpdRxed(Integer  numGlbUpdRxed) {
    this.numGlbUpdRxed = numGlbUpdRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGlbUpdTxed
   */
  @VsoMethod
  public Integer getNumGlbUpdTxed() {
    return numGlbUpdTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGlbUpdTxed set the numGlbUpdTxed.
   */
  @VsoMethod
  public void setNumGlbUpdTxed(Integer  numGlbUpdTxed) {
    this.numGlbUpdTxed = numGlbUpdTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGpkiCrRxed
   */
  @VsoMethod
  public Integer getNumGpkiCrRxed() {
    return numGpkiCrRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGpkiCrRxed set the numGpkiCrRxed.
   */
  @VsoMethod
  public void setNumGpkiCrRxed(Integer  numGpkiCrRxed) {
    this.numGpkiCrRxed = numGpkiCrRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGpkiCrTxed
   */
  @VsoMethod
  public Integer getNumGpkiCrTxed() {
    return numGpkiCrTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGpkiCrTxed set the numGpkiCrTxed.
   */
  @VsoMethod
  public void setNumGpkiCrTxed(Integer  numGpkiCrTxed) {
    this.numGpkiCrTxed = numGpkiCrTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGpkiDelRxed
   */
  @VsoMethod
  public Integer getNumGpkiDelRxed() {
    return numGpkiDelRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGpkiDelRxed set the numGpkiDelRxed.
   */
  @VsoMethod
  public void setNumGpkiDelRxed(Integer  numGpkiDelRxed) {
    this.numGpkiDelRxed = numGpkiDelRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGpkiDelTxed
   */
  @VsoMethod
  public Integer getNumGpkiDelTxed() {
    return numGpkiDelTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGpkiDelTxed set the numGpkiDelTxed.
   */
  @VsoMethod
  public void setNumGpkiDelTxed(Integer  numGpkiDelTxed) {
    this.numGpkiDelTxed = numGpkiDelTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGpkiUpdRxed
   */
  @VsoMethod
  public Integer getNumGpkiUpdRxed() {
    return numGpkiUpdRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGpkiUpdRxed set the numGpkiUpdRxed.
   */
  @VsoMethod
  public void setNumGpkiUpdRxed(Integer  numGpkiUpdRxed) {
    this.numGpkiUpdRxed = numGpkiUpdRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGpkiUpdTxed
   */
  @VsoMethod
  public Integer getNumGpkiUpdTxed() {
    return numGpkiUpdTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGpkiUpdTxed set the numGpkiUpdTxed.
   */
  @VsoMethod
  public void setNumGpkiUpdTxed(Integer  numGpkiUpdTxed) {
    this.numGpkiUpdTxed = numGpkiUpdTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGsCrRxed
   */
  @VsoMethod
  public Integer getNumGsCrRxed() {
    return numGsCrRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGsCrRxed set the numGsCrRxed.
   */
  @VsoMethod
  public void setNumGsCrRxed(Integer  numGsCrRxed) {
    this.numGsCrRxed = numGsCrRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGsCrTxed
   */
  @VsoMethod
  public Integer getNumGsCrTxed() {
    return numGsCrTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGsCrTxed set the numGsCrTxed.
   */
  @VsoMethod
  public void setNumGsCrTxed(Integer  numGsCrTxed) {
    this.numGsCrTxed = numGsCrTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGsDelRxed
   */
  @VsoMethod
  public Integer getNumGsDelRxed() {
    return numGsDelRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGsDelRxed set the numGsDelRxed.
   */
  @VsoMethod
  public void setNumGsDelRxed(Integer  numGsDelRxed) {
    this.numGsDelRxed = numGsDelRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGsDelTxed
   */
  @VsoMethod
  public Integer getNumGsDelTxed() {
    return numGsDelTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGsDelTxed set the numGsDelTxed.
   */
  @VsoMethod
  public void setNumGsDelTxed(Integer  numGsDelTxed) {
    this.numGsDelTxed = numGsDelTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGsUpdRxed
   */
  @VsoMethod
  public Integer getNumGsUpdRxed() {
    return numGsUpdRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGsUpdRxed set the numGsUpdRxed.
   */
  @VsoMethod
  public void setNumGsUpdRxed(Integer  numGsUpdRxed) {
    this.numGsUpdRxed = numGsUpdRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numGsUpdTxed
   */
  @VsoMethod
  public Integer getNumGsUpdTxed() {
    return numGsUpdTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numGsUpdTxed set the numGsUpdTxed.
   */
  @VsoMethod
  public void setNumGsUpdTxed(Integer  numGsUpdTxed) {
    this.numGsUpdTxed = numGsUpdTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numHealthMsgsRxed
   */
  @VsoMethod
  public Integer getNumHealthMsgsRxed() {
    return numHealthMsgsRxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numHealthMsgsRxed set the numHealthMsgsRxed.
   */
  @VsoMethod
  public void setNumHealthMsgsRxed(Integer  numHealthMsgsRxed) {
    this.numHealthMsgsRxed = numHealthMsgsRxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numHealthMsgsTxed
   */
  @VsoMethod
  public Integer getNumHealthMsgsTxed() {
    return numHealthMsgsTxed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numHealthMsgsTxed set the numHealthMsgsTxed.
   */
  @VsoMethod
  public void setNumHealthMsgsTxed(Integer  numHealthMsgsTxed) {
    this.numHealthMsgsTxed = numHealthMsgsTxed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numOfBadResponses
   */
  @VsoMethod
  public Integer getNumOfBadResponses() {
    return numOfBadResponses;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numOfBadResponses set the numOfBadResponses.
   */
  @VsoMethod
  public void setNumOfBadResponses(Integer  numOfBadResponses) {
    this.numOfBadResponses = numOfBadResponses;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numOfEventsGenerated
   */
  @VsoMethod
  public Integer getNumOfEventsGenerated() {
    return numOfEventsGenerated;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numOfEventsGenerated set the numOfEventsGenerated.
   */
  @VsoMethod
  public void setNumOfEventsGenerated(Integer  numOfEventsGenerated) {
    this.numOfEventsGenerated = numOfEventsGenerated;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numOfSkipOutstandingRequests
   */
  @VsoMethod
  public Integer getNumOfSkipOutstandingRequests() {
    return numOfSkipOutstandingRequests;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numOfSkipOutstandingRequests set the numOfSkipOutstandingRequests.
   */
  @VsoMethod
  public void setNumOfSkipOutstandingRequests(Integer  numOfSkipOutstandingRequests) {
    this.numOfSkipOutstandingRequests = numOfSkipOutstandingRequests;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numOfTimeouts
   */
  @VsoMethod
  public Integer getNumOfTimeouts() {
    return numOfTimeouts;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numOfTimeouts set the numOfTimeouts.
   */
  @VsoMethod
  public void setNumOfTimeouts(Integer  numOfTimeouts) {
    this.numOfTimeouts = numOfTimeouts;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbSiteRuntimeStats objGslbSiteRuntimeStats = (GslbSiteRuntimeStats) o;
  return   Objects.equals(this.numGlbCrTxed, objGslbSiteRuntimeStats.numGlbCrTxed)&&
  Objects.equals(this.numGlbCrRxed, objGslbSiteRuntimeStats.numGlbCrRxed)&&
  Objects.equals(this.numGlbDelTxed, objGslbSiteRuntimeStats.numGlbDelTxed)&&
  Objects.equals(this.numGlbDelRxed, objGslbSiteRuntimeStats.numGlbDelRxed)&&
  Objects.equals(this.numGlbUpdTxed, objGslbSiteRuntimeStats.numGlbUpdTxed)&&
  Objects.equals(this.numGlbUpdRxed, objGslbSiteRuntimeStats.numGlbUpdRxed)&&
  Objects.equals(this.numGsCrTxed, objGslbSiteRuntimeStats.numGsCrTxed)&&
  Objects.equals(this.numGsCrRxed, objGslbSiteRuntimeStats.numGsCrRxed)&&
  Objects.equals(this.numGsDelTxed, objGslbSiteRuntimeStats.numGsDelTxed)&&
  Objects.equals(this.numGsDelRxed, objGslbSiteRuntimeStats.numGsDelRxed)&&
  Objects.equals(this.numGsUpdTxed, objGslbSiteRuntimeStats.numGsUpdTxed)&&
  Objects.equals(this.numGsUpdRxed, objGslbSiteRuntimeStats.numGsUpdRxed)&&
  Objects.equals(this.numGhmCrTxed, objGslbSiteRuntimeStats.numGhmCrTxed)&&
  Objects.equals(this.numGhmCrRxed, objGslbSiteRuntimeStats.numGhmCrRxed)&&
  Objects.equals(this.numGhmDelTxed, objGslbSiteRuntimeStats.numGhmDelTxed)&&
  Objects.equals(this.numGhmDelRxed, objGslbSiteRuntimeStats.numGhmDelRxed)&&
  Objects.equals(this.numGhmUpdTxed, objGslbSiteRuntimeStats.numGhmUpdTxed)&&
  Objects.equals(this.numGhmUpdRxed, objGslbSiteRuntimeStats.numGhmUpdRxed)&&
  Objects.equals(this.numHealthMsgsTxed, objGslbSiteRuntimeStats.numHealthMsgsTxed)&&
  Objects.equals(this.numHealthMsgsRxed, objGslbSiteRuntimeStats.numHealthMsgsRxed)&&
  Objects.equals(this.numOfTimeouts, objGslbSiteRuntimeStats.numOfTimeouts)&&
  Objects.equals(this.numOfEventsGenerated, objGslbSiteRuntimeStats.numOfEventsGenerated)&&
  Objects.equals(this.numOfBadResponses, objGslbSiteRuntimeStats.numOfBadResponses)&&
  Objects.equals(this.numOfSkipOutstandingRequests, objGslbSiteRuntimeStats.numOfSkipOutstandingRequests)&&
  Objects.equals(this.numGeoCrTxed, objGslbSiteRuntimeStats.numGeoCrTxed)&&
  Objects.equals(this.numGeoCrRxed, objGslbSiteRuntimeStats.numGeoCrRxed)&&
  Objects.equals(this.numGeoDelTxed, objGslbSiteRuntimeStats.numGeoDelTxed)&&
  Objects.equals(this.numGeoDelRxed, objGslbSiteRuntimeStats.numGeoDelRxed)&&
  Objects.equals(this.numGeoUpdTxed, objGslbSiteRuntimeStats.numGeoUpdTxed)&&
  Objects.equals(this.numGeoUpdRxed, objGslbSiteRuntimeStats.numGeoUpdRxed)&&
  Objects.equals(this.numGapCrTxed, objGslbSiteRuntimeStats.numGapCrTxed)&&
  Objects.equals(this.numGapCrRxed, objGslbSiteRuntimeStats.numGapCrRxed)&&
  Objects.equals(this.numGapDelTxed, objGslbSiteRuntimeStats.numGapDelTxed)&&
  Objects.equals(this.numGapDelRxed, objGslbSiteRuntimeStats.numGapDelRxed)&&
  Objects.equals(this.numGapUpdTxed, objGslbSiteRuntimeStats.numGapUpdTxed)&&
  Objects.equals(this.numGapUpdRxed, objGslbSiteRuntimeStats.numGapUpdRxed)&&
  Objects.equals(this.numFileCrTxed, objGslbSiteRuntimeStats.numFileCrTxed)&&
  Objects.equals(this.numFileDelTxed, objGslbSiteRuntimeStats.numFileDelTxed)&&
  Objects.equals(this.numGpkiCrTxed, objGslbSiteRuntimeStats.numGpkiCrTxed)&&
  Objects.equals(this.numGpkiCrRxed, objGslbSiteRuntimeStats.numGpkiCrRxed)&&
  Objects.equals(this.numGpkiDelTxed, objGslbSiteRuntimeStats.numGpkiDelTxed)&&
  Objects.equals(this.numGpkiDelRxed, objGslbSiteRuntimeStats.numGpkiDelRxed)&&
  Objects.equals(this.numGpkiUpdTxed, objGslbSiteRuntimeStats.numGpkiUpdTxed)&&
  Objects.equals(this.numGpkiUpdRxed, objGslbSiteRuntimeStats.numGpkiUpdRxed)&&
  Objects.equals(this.numGjwtCrTxed, objGslbSiteRuntimeStats.numGjwtCrTxed)&&
  Objects.equals(this.numGjwtCrRxed, objGslbSiteRuntimeStats.numGjwtCrRxed)&&
  Objects.equals(this.numGjwtDelTxed, objGslbSiteRuntimeStats.numGjwtDelTxed)&&
  Objects.equals(this.numGjwtDelRxed, objGslbSiteRuntimeStats.numGjwtDelRxed)&&
  Objects.equals(this.numGjwtUpdTxed, objGslbSiteRuntimeStats.numGjwtUpdTxed)&&
  Objects.equals(this.numGjwtUpdRxed, objGslbSiteRuntimeStats.numGjwtUpdRxed);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbSiteRuntimeStats {\n");
      sb.append("    numFileCrTxed: ").append(toIndentedString(numFileCrTxed)).append("\n");
        sb.append("    numFileDelTxed: ").append(toIndentedString(numFileDelTxed)).append("\n");
        sb.append("    numGapCrRxed: ").append(toIndentedString(numGapCrRxed)).append("\n");
        sb.append("    numGapCrTxed: ").append(toIndentedString(numGapCrTxed)).append("\n");
        sb.append("    numGapDelRxed: ").append(toIndentedString(numGapDelRxed)).append("\n");
        sb.append("    numGapDelTxed: ").append(toIndentedString(numGapDelTxed)).append("\n");
        sb.append("    numGapUpdRxed: ").append(toIndentedString(numGapUpdRxed)).append("\n");
        sb.append("    numGapUpdTxed: ").append(toIndentedString(numGapUpdTxed)).append("\n");
        sb.append("    numGeoCrRxed: ").append(toIndentedString(numGeoCrRxed)).append("\n");
        sb.append("    numGeoCrTxed: ").append(toIndentedString(numGeoCrTxed)).append("\n");
        sb.append("    numGeoDelRxed: ").append(toIndentedString(numGeoDelRxed)).append("\n");
        sb.append("    numGeoDelTxed: ").append(toIndentedString(numGeoDelTxed)).append("\n");
        sb.append("    numGeoUpdRxed: ").append(toIndentedString(numGeoUpdRxed)).append("\n");
        sb.append("    numGeoUpdTxed: ").append(toIndentedString(numGeoUpdTxed)).append("\n");
        sb.append("    numGhmCrRxed: ").append(toIndentedString(numGhmCrRxed)).append("\n");
        sb.append("    numGhmCrTxed: ").append(toIndentedString(numGhmCrTxed)).append("\n");
        sb.append("    numGhmDelRxed: ").append(toIndentedString(numGhmDelRxed)).append("\n");
        sb.append("    numGhmDelTxed: ").append(toIndentedString(numGhmDelTxed)).append("\n");
        sb.append("    numGhmUpdRxed: ").append(toIndentedString(numGhmUpdRxed)).append("\n");
        sb.append("    numGhmUpdTxed: ").append(toIndentedString(numGhmUpdTxed)).append("\n");
        sb.append("    numGjwtCrRxed: ").append(toIndentedString(numGjwtCrRxed)).append("\n");
        sb.append("    numGjwtCrTxed: ").append(toIndentedString(numGjwtCrTxed)).append("\n");
        sb.append("    numGjwtDelRxed: ").append(toIndentedString(numGjwtDelRxed)).append("\n");
        sb.append("    numGjwtDelTxed: ").append(toIndentedString(numGjwtDelTxed)).append("\n");
        sb.append("    numGjwtUpdRxed: ").append(toIndentedString(numGjwtUpdRxed)).append("\n");
        sb.append("    numGjwtUpdTxed: ").append(toIndentedString(numGjwtUpdTxed)).append("\n");
        sb.append("    numGlbCrRxed: ").append(toIndentedString(numGlbCrRxed)).append("\n");
        sb.append("    numGlbCrTxed: ").append(toIndentedString(numGlbCrTxed)).append("\n");
        sb.append("    numGlbDelRxed: ").append(toIndentedString(numGlbDelRxed)).append("\n");
        sb.append("    numGlbDelTxed: ").append(toIndentedString(numGlbDelTxed)).append("\n");
        sb.append("    numGlbUpdRxed: ").append(toIndentedString(numGlbUpdRxed)).append("\n");
        sb.append("    numGlbUpdTxed: ").append(toIndentedString(numGlbUpdTxed)).append("\n");
        sb.append("    numGpkiCrRxed: ").append(toIndentedString(numGpkiCrRxed)).append("\n");
        sb.append("    numGpkiCrTxed: ").append(toIndentedString(numGpkiCrTxed)).append("\n");
        sb.append("    numGpkiDelRxed: ").append(toIndentedString(numGpkiDelRxed)).append("\n");
        sb.append("    numGpkiDelTxed: ").append(toIndentedString(numGpkiDelTxed)).append("\n");
        sb.append("    numGpkiUpdRxed: ").append(toIndentedString(numGpkiUpdRxed)).append("\n");
        sb.append("    numGpkiUpdTxed: ").append(toIndentedString(numGpkiUpdTxed)).append("\n");
        sb.append("    numGsCrRxed: ").append(toIndentedString(numGsCrRxed)).append("\n");
        sb.append("    numGsCrTxed: ").append(toIndentedString(numGsCrTxed)).append("\n");
        sb.append("    numGsDelRxed: ").append(toIndentedString(numGsDelRxed)).append("\n");
        sb.append("    numGsDelTxed: ").append(toIndentedString(numGsDelTxed)).append("\n");
        sb.append("    numGsUpdRxed: ").append(toIndentedString(numGsUpdRxed)).append("\n");
        sb.append("    numGsUpdTxed: ").append(toIndentedString(numGsUpdTxed)).append("\n");
        sb.append("    numHealthMsgsRxed: ").append(toIndentedString(numHealthMsgsRxed)).append("\n");
        sb.append("    numHealthMsgsTxed: ").append(toIndentedString(numHealthMsgsTxed)).append("\n");
        sb.append("    numOfBadResponses: ").append(toIndentedString(numOfBadResponses)).append("\n");
        sb.append("    numOfEventsGenerated: ").append(toIndentedString(numOfEventsGenerated)).append("\n");
        sb.append("    numOfSkipOutstandingRequests: ").append(toIndentedString(numOfSkipOutstandingRequests)).append("\n");
        sb.append("    numOfTimeouts: ").append(toIndentedString(numOfTimeouts)).append("\n");
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

