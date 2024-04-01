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
 * The JournalInfo is a POJO class extends AviRestResource that used for creating
 * JournalInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "JournalInfo")
@VsoFinder(name = Constants.FINDER_VRO_JOURNALINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class JournalInfo extends AviRestResource {
    @JsonProperty("actions")
    @JsonInclude(Include.NON_NULL)
    private List<JournalAction> actions;

    @JsonProperty("total_objects")
    @JsonInclude(Include.NON_NULL)
    private Integer totalObjects;

    @JsonProperty("versions")
    @JsonInclude(Include.NON_NULL)
    private List<String> versions;



  /**
   * This is the getter method this will return the attribute value.
   * Details of run for each version.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actions
   */
  @VsoMethod
  public List<JournalAction> getActions() {
    return actions;
  }

  /**
   * This is the setter method. this will set the actions
   * Details of run for each version.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actions
   */
  @VsoMethod
  public void setActions(List<JournalAction>  actions) {
    this.actions = actions;
  }

  /**
   * This is the setter method this will set the actions
   * Details of run for each version.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return actions
   */
  @VsoMethod
  public JournalInfo addActionsItem(JournalAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<JournalAction>();
    }
    this.actions.add(actionsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Number of objects to be processed.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return totalObjects
   */
  @VsoMethod
  public Integer getTotalObjects() {
    return totalObjects;
  }

  /**
   * This is the setter method to the attribute.
   * Number of objects to be processed.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param totalObjects set the totalObjects.
   */
  @VsoMethod
  public void setTotalObjects(Integer  totalObjects) {
    this.totalObjects = totalObjects;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of versions to be migrated.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return versions
   */
  @VsoMethod
  public List<String> getVersions() {
    return versions;
  }

  /**
   * This is the setter method. this will set the versions
   * List of versions to be migrated.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return versions
   */
  @VsoMethod
  public void setVersions(List<String>  versions) {
    this.versions = versions;
  }

  /**
   * This is the setter method this will set the versions
   * List of versions to be migrated.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return versions
   */
  @VsoMethod
  public JournalInfo addVersionsItem(String versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<String>();
    }
    this.versions.add(versionsItem);
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
  JournalInfo objJournalInfo = (JournalInfo) o;
  return   Objects.equals(this.totalObjects, objJournalInfo.totalObjects)&&
  Objects.equals(this.versions, objJournalInfo.versions)&&
  Objects.equals(this.actions, objJournalInfo.actions);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class JournalInfo {\n");
      sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    totalObjects: ").append(toIndentedString(totalObjects)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

