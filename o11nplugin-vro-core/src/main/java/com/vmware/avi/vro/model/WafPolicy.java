package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.WafPolicyAllowlist;
import com.vmware.avi.vro.model.WafApplicationSignatures;
import com.vmware.avi.vro.model.AppLearningConfidenceOverride;
import com.vmware.avi.vro.model.AppLearningParams;
import com.vmware.avi.vro.model.WafPositiveSecurityModel;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The WafPolicy is a POJO class extends AviRestResource that used for creating
 * WafPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafPolicy")
@VsoFinder(name = Constants.FINDER_VRO_WAFPOLICY, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafPolicy extends AviRestResource {
    @JsonProperty("allow_mode_delegation")
    @JsonInclude(Include.NON_NULL)
    private Boolean allowModeDelegation = true;

    @JsonProperty("allowlist")
    @JsonInclude(Include.NON_NULL)
    private WafPolicyAllowlist allowlist;

    @JsonProperty("application_signatures")
    @JsonInclude(Include.NON_NULL)
    private WafApplicationSignatures applicationSignatures;

    @JsonProperty("auto_update_crs")
    @JsonInclude(Include.NON_NULL)
    private Boolean autoUpdateCrs = false;

    @JsonProperty("bypass_static_extensions")
    @JsonInclude(Include.NON_NULL)
    private Boolean bypassStaticExtensions = true;

    @JsonProperty("confidence_override")
    @JsonInclude(Include.NON_NULL)
    private AppLearningConfidenceOverride confidenceOverride;

    @JsonProperty("created_by")
    @JsonInclude(Include.NON_NULL)
    private String createdBy;

    @JsonProperty("crs_overrides")
    @JsonInclude(Include.NON_NULL)
    private List<WafRuleGroupOverrides> crsOverrides;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("enable_app_learning")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableAppLearning = false;

    @JsonProperty("enable_auto_rule_updates")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableAutoRuleUpdates = true;

    @JsonIgnore
    private Boolean enableRegexLearning = false;

    @JsonProperty("failure_mode")
    @JsonInclude(Include.NON_NULL)
    private String failureMode = "WAF_FAILURE_MODE_OPEN";

    @JsonProperty("geo_db_ref")
    @JsonInclude(Include.NON_NULL)
    private String geoDbRef;

    @JsonProperty("learning_params")
    @JsonInclude(Include.NON_NULL)
    private AppLearningParams learningParams;

    @JsonProperty("markers")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("min_confidence")
    @JsonInclude(Include.NON_NULL)
    private String minConfidence = "CONFIDENCE_VERY_HIGH";

    @JsonProperty("mode")
    @JsonInclude(Include.NON_NULL)
    private String mode = "WAF_MODE_DETECTION_ONLY";

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("paranoia_level")
    @JsonInclude(Include.NON_NULL)
    private String paranoiaLevel = "WAF_PARANOIA_LEVEL_LOW";

    @JsonProperty("positive_security_model")
    @JsonInclude(Include.NON_NULL)
    private WafPositiveSecurityModel positiveSecurityModel;

    @JsonProperty("post_crs_groups")
    @JsonInclude(Include.NON_NULL)
    private List<WafRuleGroup> postCrsGroups;

    @JsonProperty("pre_crs_groups")
    @JsonInclude(Include.NON_NULL)
    private List<WafRuleGroup> preCrsGroups;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("updated_crs_rules_in_detection_mode")
    @JsonInclude(Include.NON_NULL)
    private Boolean updatedCrsRulesInDetectionMode = true;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("waf_crs_ref")
    @JsonInclude(Include.NON_NULL)
    private String wafCrsRef;

    @JsonProperty("waf_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String wafProfileRef;



  /**
   * This is the getter method this will return the attribute value.
   * Allow rules to overwrite the policy mode.
   * This must be set if the policy mode is set to enforcement.
   * Field introduced in 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return allowModeDelegation
   */
  @VsoMethod
  public Boolean getAllowModeDelegation() {
    return allowModeDelegation;
  }

  /**
   * This is the setter method to the attribute.
   * Allow rules to overwrite the policy mode.
   * This must be set if the policy mode is set to enforcement.
   * Field introduced in 18.1.5, 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param allowModeDelegation set the allowModeDelegation.
   */
  @VsoMethod
  public void setAllowModeDelegation(Boolean  allowModeDelegation) {
    this.allowModeDelegation = allowModeDelegation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A set of rules which describe conditions under which the request will bypass the waf.
   * This will be processed in the request header phase before any other waf related code.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowlist
   */
  @VsoMethod
  public WafPolicyAllowlist getAllowlist() {
    return allowlist;
  }

  /**
   * This is the setter method to the attribute.
   * A set of rules which describe conditions under which the request will bypass the waf.
   * This will be processed in the request header phase before any other waf related code.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param allowlist set the allowlist.
   */
  @VsoMethod
  public void setAllowlist(WafPolicyAllowlist allowlist) {
    this.allowlist = allowlist;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Application specific signatures.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return applicationSignatures
   */
  @VsoMethod
  public WafApplicationSignatures getApplicationSignatures() {
    return applicationSignatures;
  }

  /**
   * This is the setter method to the attribute.
   * Application specific signatures.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param applicationSignatures set the applicationSignatures.
   */
  @VsoMethod
  public void setApplicationSignatures(WafApplicationSignatures applicationSignatures) {
    this.applicationSignatures = applicationSignatures;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If this flag is set, the system will try to keep the crs version used in this policy up-to-date.
   * If a newer crs object is available on this controller, the system will issue the crs upgrade process for this waf policy.
   * It will not update polices if the current crs version is crs-version-not-applicable.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return autoUpdateCrs
   */
  @VsoMethod
  public Boolean getAutoUpdateCrs() {
    return autoUpdateCrs;
  }

  /**
   * This is the setter method to the attribute.
   * If this flag is set, the system will try to keep the crs version used in this policy up-to-date.
   * If a newer crs object is available on this controller, the system will issue the crs upgrade process for this waf policy.
   * It will not update polices if the current crs version is crs-version-not-applicable.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param autoUpdateCrs set the autoUpdateCrs.
   */
  @VsoMethod
  public void setAutoUpdateCrs(Boolean  autoUpdateCrs) {
    this.autoUpdateCrs = autoUpdateCrs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable the functionality to bypass waf for static file extensions.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return bypassStaticExtensions
   */
  @VsoMethod
  public Boolean getBypassStaticExtensions() {
    return bypassStaticExtensions;
  }

  /**
   * This is the setter method to the attribute.
   * Enable the functionality to bypass waf for static file extensions.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param bypassStaticExtensions set the bypassStaticExtensions.
   */
  @VsoMethod
  public void setBypassStaticExtensions(Boolean  bypassStaticExtensions) {
    this.bypassStaticExtensions = bypassStaticExtensions;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure thresholds for confidence labels.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return confidenceOverride
   */
  @VsoMethod
  public AppLearningConfidenceOverride getConfidenceOverride() {
    return confidenceOverride;
  }

  /**
   * This is the setter method to the attribute.
   * Configure thresholds for confidence labels.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param confidenceOverride set the confidenceOverride.
   */
  @VsoMethod
  public void setConfidenceOverride(AppLearningConfidenceOverride confidenceOverride) {
    this.confidenceOverride = confidenceOverride;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Creator name.
   * Field introduced in 17.2.4.
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
   * Field introduced in 17.2.4.
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
   * Override attributes for crs rules.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return crsOverrides
   */
  @VsoMethod
  public List<WafRuleGroupOverrides> getCrsOverrides() {
    return crsOverrides;
  }

  /**
   * This is the setter method. this will set the crsOverrides
   * Override attributes for crs rules.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return crsOverrides
   */
  @VsoMethod
  public void setCrsOverrides(List<WafRuleGroupOverrides>  crsOverrides) {
    this.crsOverrides = crsOverrides;
  }

  /**
   * This is the setter method this will set the crsOverrides
   * Override attributes for crs rules.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return crsOverrides
   */
  @VsoMethod
  public WafPolicy addCrsOverridesItem(WafRuleGroupOverrides crsOverridesItem) {
    if (this.crsOverrides == null) {
      this.crsOverrides = new ArrayList<WafRuleGroupOverrides>();
    }
    this.crsOverrides.add(crsOverridesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.1.
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
   * Field introduced in 17.2.1.
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
   * Enable application learning for this waf policy.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableAppLearning
   */
  @VsoMethod
  public Boolean getEnableAppLearning() {
    return enableAppLearning;
  }

  /**
   * This is the setter method to the attribute.
   * Enable application learning for this waf policy.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableAppLearning set the enableAppLearning.
   */
  @VsoMethod
  public void setEnableAppLearning(Boolean  enableAppLearning) {
    this.enableAppLearning = enableAppLearning;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable application learning based rule updates on the waf profile.
   * Rules will be programmed in dedicated waf learning group.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enableAutoRuleUpdates
   */
  @VsoMethod
  public Boolean getEnableAutoRuleUpdates() {
    return enableAutoRuleUpdates;
  }

  /**
   * This is the setter method to the attribute.
   * Enable application learning based rule updates on the waf profile.
   * Rules will be programmed in dedicated waf learning group.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enableAutoRuleUpdates set the enableAutoRuleUpdates.
   */
  @VsoMethod
  public void setEnableAutoRuleUpdates(Boolean  enableAutoRuleUpdates) {
    this.enableAutoRuleUpdates = enableAutoRuleUpdates;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable dynamic regex generation for positive security model rules.
   * This is an experimental feature and shouldn't be used in production.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableRegexLearning
   */
  @VsoMethod
  public Boolean getEnableRegexLearning() {
    return enableRegexLearning;
  }

  /**
   * This is the setter method to the attribute.
   * Enable dynamic regex generation for positive security model rules.
   * This is an experimental feature and shouldn't be used in production.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableRegexLearning set the enableRegexLearning.
   */
  @VsoMethod
  public void setEnableRegexLearning(Boolean  enableRegexLearning) {
    this.enableRegexLearning = enableRegexLearning;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf policy failure mode.
   * This can be 'open' or 'closed'.
   * Enum options - WAF_FAILURE_MODE_OPEN, WAF_FAILURE_MODE_CLOSED.
   * Field introduced in 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_FAILURE_MODE_OPEN".
   * @return failureMode
   */
  @VsoMethod
  public String getFailureMode() {
    return failureMode;
  }

  /**
   * This is the setter method to the attribute.
   * Waf policy failure mode.
   * This can be 'open' or 'closed'.
   * Enum options - WAF_FAILURE_MODE_OPEN, WAF_FAILURE_MODE_CLOSED.
   * Field introduced in 18.1.2.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_FAILURE_MODE_OPEN".
   * @param failureMode set the failureMode.
   */
  @VsoMethod
  public void setFailureMode(String  failureMode) {
    this.failureMode = failureMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Geo location mapping database used by this wafpolicy.
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
   * Geo location mapping database used by this wafpolicy.
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
   * Parameters for tuning application learning.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return learningParams
   */
  @VsoMethod
  public AppLearningParams getLearningParams() {
    return learningParams;
  }

  /**
   * This is the setter method to the attribute.
   * Parameters for tuning application learning.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param learningParams set the learningParams.
   */
  @VsoMethod
  public void setLearningParams(AppLearningParams learningParams) {
    this.learningParams = learningParams;
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
  public WafPolicy addMarkersItem(RoleFilterMatchLabel markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<RoleFilterMatchLabel>();
    }
    this.markers.add(markersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Minimum confidence label required for auto rule updates.
   * Enum options - CONFIDENCE_VERY_HIGH, CONFIDENCE_HIGH, CONFIDENCE_PROBABLE, CONFIDENCE_LOW, CONFIDENCE_NONE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "CONFIDENCE_VERY_HIGH".
   * @return minConfidence
   */
  @VsoMethod
  public String getMinConfidence() {
    return minConfidence;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum confidence label required for auto rule updates.
   * Enum options - CONFIDENCE_VERY_HIGH, CONFIDENCE_HIGH, CONFIDENCE_PROBABLE, CONFIDENCE_LOW, CONFIDENCE_NONE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "CONFIDENCE_VERY_HIGH".
   * @param minConfidence set the minConfidence.
   */
  @VsoMethod
  public void setMinConfidence(String  minConfidence) {
    this.minConfidence = minConfidence;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf policy mode.
   * This can be detection or enforcement.
   * It can be overwritten by rules if allow_mode_delegation is set.
   * Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_MODE_DETECTION_ONLY".
   * @return mode
   */
  @VsoMethod
  public String getMode() {
    return mode;
  }

  /**
   * This is the setter method to the attribute.
   * Waf policy mode.
   * This can be detection or enforcement.
   * It can be overwritten by rules if allow_mode_delegation is set.
   * Enum options - WAF_MODE_DETECTION_ONLY, WAF_MODE_ENFORCEMENT.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_MODE_DETECTION_ONLY".
   * @param mode set the mode.
   */
  @VsoMethod
  public void setMode(String  mode) {
    this.mode = mode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.1.
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
   * Field introduced in 17.2.1.
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
   * Waf ruleset paranoia  mode.
   * This is used to select rules based on the paranoia-level tag.
   * Enum options - WAF_PARANOIA_LEVEL_LOW, WAF_PARANOIA_LEVEL_MEDIUM, WAF_PARANOIA_LEVEL_HIGH, WAF_PARANOIA_LEVEL_EXTREME.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_PARANOIA_LEVEL_LOW".
   * @return paranoiaLevel
   */
  @VsoMethod
  public String getParanoiaLevel() {
    return paranoiaLevel;
  }

  /**
   * This is the setter method to the attribute.
   * Waf ruleset paranoia  mode.
   * This is used to select rules based on the paranoia-level tag.
   * Enum options - WAF_PARANOIA_LEVEL_LOW, WAF_PARANOIA_LEVEL_MEDIUM, WAF_PARANOIA_LEVEL_HIGH, WAF_PARANOIA_LEVEL_EXTREME.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_PARANOIA_LEVEL_LOW".
   * @param paranoiaLevel set the paranoiaLevel.
   */
  @VsoMethod
  public void setParanoiaLevel(String  paranoiaLevel) {
    this.paranoiaLevel = paranoiaLevel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The positive security model.
   * This is used to describe how the request or parts of the request should look like.
   * It is executed in the request body phase of avi waf.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return positiveSecurityModel
   */
  @VsoMethod
  public WafPositiveSecurityModel getPositiveSecurityModel() {
    return positiveSecurityModel;
  }

  /**
   * This is the setter method to the attribute.
   * The positive security model.
   * This is used to describe how the request or parts of the request should look like.
   * It is executed in the request body phase of avi waf.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param positiveSecurityModel set the positiveSecurityModel.
   */
  @VsoMethod
  public void setPositiveSecurityModel(WafPositiveSecurityModel positiveSecurityModel) {
    this.positiveSecurityModel = positiveSecurityModel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf rules are categorized in to groups based on their characterization.
   * These groups are created by the user and will be enforced after the crs groups.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return postCrsGroups
   */
  @VsoMethod
  public List<WafRuleGroup> getPostCrsGroups() {
    return postCrsGroups;
  }

  /**
   * This is the setter method. this will set the postCrsGroups
   * Waf rules are categorized in to groups based on their characterization.
   * These groups are created by the user and will be enforced after the crs groups.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return postCrsGroups
   */
  @VsoMethod
  public void setPostCrsGroups(List<WafRuleGroup>  postCrsGroups) {
    this.postCrsGroups = postCrsGroups;
  }

  /**
   * This is the setter method this will set the postCrsGroups
   * Waf rules are categorized in to groups based on their characterization.
   * These groups are created by the user and will be enforced after the crs groups.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return postCrsGroups
   */
  @VsoMethod
  public WafPolicy addPostCrsGroupsItem(WafRuleGroup postCrsGroupsItem) {
    if (this.postCrsGroups == null) {
      this.postCrsGroups = new ArrayList<WafRuleGroup>();
    }
    this.postCrsGroups.add(postCrsGroupsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Waf rules are categorized in to groups based on their characterization.
   * These groups are created by the user and will be  enforced before the crs groups.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return preCrsGroups
   */
  @VsoMethod
  public List<WafRuleGroup> getPreCrsGroups() {
    return preCrsGroups;
  }

  /**
   * This is the setter method. this will set the preCrsGroups
   * Waf rules are categorized in to groups based on their characterization.
   * These groups are created by the user and will be  enforced before the crs groups.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return preCrsGroups
   */
  @VsoMethod
  public void setPreCrsGroups(List<WafRuleGroup>  preCrsGroups) {
    this.preCrsGroups = preCrsGroups;
  }

  /**
   * This is the setter method this will set the preCrsGroups
   * Waf rules are categorized in to groups based on their characterization.
   * These groups are created by the user and will be  enforced before the crs groups.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return preCrsGroups
   */
  @VsoMethod
  public WafPolicy addPreCrsGroupsItem(WafRuleGroup preCrsGroupsItem) {
    if (this.preCrsGroups == null) {
      this.preCrsGroups = new ArrayList<WafRuleGroup>();
    }
    this.preCrsGroups.add(preCrsGroupsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Field introduced in 17.2.1.
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
   * Field introduced in 17.2.1.
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
   * While updating crs, the system will make sure that new rules are added in detection mode.
   * It only has an effect if the policy is in enforcement mode.
   * In this case, the update will set new rules into detection mode by adding crs_overrides for the new rules.
   * If this flag is not set or if the policy mode is detection, rules will be added without new crs_overrides.
   * This option is used for the auto_update_crs workflow as well as for the ui based crs update workflow.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return updatedCrsRulesInDetectionMode
   */
  @VsoMethod
  public Boolean getUpdatedCrsRulesInDetectionMode() {
    return updatedCrsRulesInDetectionMode;
  }

  /**
   * This is the setter method to the attribute.
   * While updating crs, the system will make sure that new rules are added in detection mode.
   * It only has an effect if the policy is in enforcement mode.
   * In this case, the update will set new rules into detection mode by adding crs_overrides for the new rules.
   * If this flag is not set or if the policy mode is detection, rules will be added without new crs_overrides.
   * This option is used for the auto_update_crs workflow as well as for the ui based crs update workflow.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param updatedCrsRulesInDetectionMode set the updatedCrsRulesInDetectionMode.
   */
  @VsoMethod
  public void setUpdatedCrsRulesInDetectionMode(Boolean  updatedCrsRulesInDetectionMode) {
    this.updatedCrsRulesInDetectionMode = updatedCrsRulesInDetectionMode;
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
   * Field introduced in 17.2.1.
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
   * Field introduced in 17.2.1.
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
   * Waf core ruleset used for the crs part of this policy.
   * It is a reference to an object of type wafcrs.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return wafCrsRef
   */
  @VsoMethod
  public String getWafCrsRef() {
    return wafCrsRef;
  }

  /**
   * This is the setter method to the attribute.
   * Waf core ruleset used for the crs part of this policy.
   * It is a reference to an object of type wafcrs.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param wafCrsRef set the wafCrsRef.
   */
  @VsoMethod
  public void setWafCrsRef(String  wafCrsRef) {
    this.wafCrsRef = wafCrsRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf profile for waf policy.
   * It is a reference to an object of type wafprofile.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return wafProfileRef
   */
  @VsoMethod
  public String getWafProfileRef() {
    return wafProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Waf profile for waf policy.
   * It is a reference to an object of type wafprofile.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param wafProfileRef set the wafProfileRef.
   */
  @VsoMethod
  public void setWafProfileRef(String  wafProfileRef) {
    this.wafProfileRef = wafProfileRef;
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
  WafPolicy objWafPolicy = (WafPolicy) o;
  return   Objects.equals(this.uuid, objWafPolicy.uuid)&&
  Objects.equals(this.name, objWafPolicy.name)&&
  Objects.equals(this.description, objWafPolicy.description)&&
  Objects.equals(this.tenantRef, objWafPolicy.tenantRef)&&
  Objects.equals(this.mode, objWafPolicy.mode)&&
  Objects.equals(this.wafProfileRef, objWafPolicy.wafProfileRef)&&
  Objects.equals(this.preCrsGroups, objWafPolicy.preCrsGroups)&&
  Objects.equals(this.postCrsGroups, objWafPolicy.postCrsGroups)&&
  Objects.equals(this.paranoiaLevel, objWafPolicy.paranoiaLevel)&&
  Objects.equals(this.createdBy, objWafPolicy.createdBy)&&
  Objects.equals(this.wafCrsRef, objWafPolicy.wafCrsRef)&&
  Objects.equals(this.failureMode, objWafPolicy.failureMode)&&
  Objects.equals(this.allowModeDelegation, objWafPolicy.allowModeDelegation)&&
  Objects.equals(this.positiveSecurityModel, objWafPolicy.positiveSecurityModel)&&
  Objects.equals(this.enableAppLearning, objWafPolicy.enableAppLearning)&&
  Objects.equals(this.applicationSignatures, objWafPolicy.applicationSignatures)&&
  Objects.equals(this.learningParams, objWafPolicy.learningParams)&&
  Objects.equals(this.minConfidence, objWafPolicy.minConfidence)&&
  Objects.equals(this.confidenceOverride, objWafPolicy.confidenceOverride)&&
  Objects.equals(this.enableAutoRuleUpdates, objWafPolicy.enableAutoRuleUpdates)&&
  Objects.equals(this.enableRegexLearning, objWafPolicy.enableRegexLearning)&&
  Objects.equals(this.allowlist, objWafPolicy.allowlist)&&
  Objects.equals(this.geoDbRef, objWafPolicy.geoDbRef)&&
  Objects.equals(this.markers, objWafPolicy.markers)&&
  Objects.equals(this.crsOverrides, objWafPolicy.crsOverrides)&&
  Objects.equals(this.bypassStaticExtensions, objWafPolicy.bypassStaticExtensions)&&
  Objects.equals(this.autoUpdateCrs, objWafPolicy.autoUpdateCrs)&&
  Objects.equals(this.updatedCrsRulesInDetectionMode, objWafPolicy.updatedCrsRulesInDetectionMode);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafPolicy {\n");
      sb.append("    allowModeDelegation: ").append(toIndentedString(allowModeDelegation)).append("\n");
        sb.append("    allowlist: ").append(toIndentedString(allowlist)).append("\n");
        sb.append("    applicationSignatures: ").append(toIndentedString(applicationSignatures)).append("\n");
        sb.append("    autoUpdateCrs: ").append(toIndentedString(autoUpdateCrs)).append("\n");
        sb.append("    bypassStaticExtensions: ").append(toIndentedString(bypassStaticExtensions)).append("\n");
        sb.append("    confidenceOverride: ").append(toIndentedString(confidenceOverride)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    crsOverrides: ").append(toIndentedString(crsOverrides)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enableAppLearning: ").append(toIndentedString(enableAppLearning)).append("\n");
        sb.append("    enableAutoRuleUpdates: ").append(toIndentedString(enableAutoRuleUpdates)).append("\n");
        sb.append("    enableRegexLearning: ").append(toIndentedString(enableRegexLearning)).append("\n");
        sb.append("    failureMode: ").append(toIndentedString(failureMode)).append("\n");
        sb.append("    geoDbRef: ").append(toIndentedString(geoDbRef)).append("\n");
        sb.append("    learningParams: ").append(toIndentedString(learningParams)).append("\n");
        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
        sb.append("    minConfidence: ").append(toIndentedString(minConfidence)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    paranoiaLevel: ").append(toIndentedString(paranoiaLevel)).append("\n");
        sb.append("    positiveSecurityModel: ").append(toIndentedString(positiveSecurityModel)).append("\n");
        sb.append("    postCrsGroups: ").append(toIndentedString(postCrsGroups)).append("\n");
        sb.append("    preCrsGroups: ").append(toIndentedString(preCrsGroups)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    updatedCrsRulesInDetectionMode: ").append(toIndentedString(updatedCrsRulesInDetectionMode)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    wafCrsRef: ").append(toIndentedString(wafCrsRef)).append("\n");
        sb.append("    wafProfileRef: ").append(toIndentedString(wafProfileRef)).append("\n");
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

