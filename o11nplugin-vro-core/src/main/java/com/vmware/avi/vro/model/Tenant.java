package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.TenantConfiguration;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The Tenant is a POJO class extends AviRestResource that used for creating
 * Tenant.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Tenant")
@VsoFinder(name = Constants.FINDER_VRO_TENANT, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Tenant extends AviRestResource {
    @JsonProperty("attrs")
    @JsonInclude(Include.NON_NULL)
    private List<KeyValue> attrs;

    @JsonProperty("config_settings")
    @JsonInclude(Include.NON_NULL)
    private TenantConfiguration configSettings;

    @JsonProperty("created_by")
    @JsonInclude(Include.NON_NULL)
    private String createdBy;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("enforce_label_group")
    @JsonInclude(Include.NON_NULL)
    private Boolean enforceLabelGroup = false;

    @JsonProperty("label_group_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> labelGroupRefs;

    @JsonProperty("local")
    @JsonInclude(Include.NON_NULL)
    private Boolean local = true;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Key/value tenant attributes.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attrs
   */
  @VsoMethod
  public List<KeyValue> getAttrs() {
    return attrs;
  }

  /**
   * This is the setter method. this will set the attrs
   * Key/value tenant attributes.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attrs
   */
  @VsoMethod
  public void setAttrs(List<KeyValue>  attrs) {
    this.attrs = attrs;
  }

  /**
   * This is the setter method this will set the attrs
   * Key/value tenant attributes.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attrs
   */
  @VsoMethod
  public Tenant addAttrsItem(KeyValue attrsItem) {
    if (this.attrs == null) {
      this.attrs = new ArrayList<KeyValue>();
    }
    this.attrs.add(attrsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return configSettings
   */
  @VsoMethod
  public TenantConfiguration getConfigSettings() {
    return configSettings;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param configSettings set the configSettings.
   */
  @VsoMethod
  public void setConfigSettings(TenantConfiguration configSettings) {
    this.configSettings = configSettings;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Creator of this tenant.
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
   * Creator of this tenant.
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
   * The referred label groups are enforced on the tenant if this is set to true.if this is set to false, the label groups are suggested for the
   * tenant.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enforceLabelGroup
   */
  @VsoMethod
  public Boolean getEnforceLabelGroup() {
    return enforceLabelGroup;
  }

  /**
   * This is the setter method to the attribute.
   * The referred label groups are enforced on the tenant if this is set to true.if this is set to false, the label groups are suggested for the
   * tenant.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enforceLabelGroup set the enforceLabelGroup.
   */
  @VsoMethod
  public void setEnforceLabelGroup(Boolean  enforceLabelGroup) {
    this.enforceLabelGroup = enforceLabelGroup;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The label_groups to be enforced on the tenant.
   * This is strictly enforced only if enforce_label_group is set to true.
   * It is a reference to an object of type labelgroup.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return labelGroupRefs
   */
  @VsoMethod
  public List<String> getLabelGroupRefs() {
    return labelGroupRefs;
  }

  /**
   * This is the setter method. this will set the labelGroupRefs
   * The label_groups to be enforced on the tenant.
   * This is strictly enforced only if enforce_label_group is set to true.
   * It is a reference to an object of type labelgroup.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return labelGroupRefs
   */
  @VsoMethod
  public void setLabelGroupRefs(List<String>  labelGroupRefs) {
    this.labelGroupRefs = labelGroupRefs;
  }

  /**
   * This is the setter method this will set the labelGroupRefs
   * The label_groups to be enforced on the tenant.
   * This is strictly enforced only if enforce_label_group is set to true.
   * It is a reference to an object of type labelgroup.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return labelGroupRefs
   */
  @VsoMethod
  public Tenant addLabelGroupRefsItem(String labelGroupRefsItem) {
    if (this.labelGroupRefs == null) {
      this.labelGroupRefs = new ArrayList<String>();
    }
    this.labelGroupRefs.add(labelGroupRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return local
   */
  @VsoMethod
  public Boolean getLocal() {
    return local;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param local set the local.
   */
  @VsoMethod
  public void setLocal(Boolean  local) {
    this.local = local;
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
  Tenant objTenant = (Tenant) o;
  return   Objects.equals(this.uuid, objTenant.uuid)&&
  Objects.equals(this.name, objTenant.name)&&
  Objects.equals(this.local, objTenant.local)&&
  Objects.equals(this.description, objTenant.description)&&
  Objects.equals(this.configSettings, objTenant.configSettings)&&
  Objects.equals(this.createdBy, objTenant.createdBy)&&
  Objects.equals(this.enforceLabelGroup, objTenant.enforceLabelGroup)&&
  Objects.equals(this.labelGroupRefs, objTenant.labelGroupRefs)&&
  Objects.equals(this.attrs, objTenant.attrs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Tenant {\n");
      sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
        sb.append("    configSettings: ").append(toIndentedString(configSettings)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enforceLabelGroup: ").append(toIndentedString(enforceLabelGroup)).append("\n");
        sb.append("    labelGroupRefs: ").append(toIndentedString(labelGroupRefs)).append("\n");
        sb.append("    local: ").append(toIndentedString(local)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

