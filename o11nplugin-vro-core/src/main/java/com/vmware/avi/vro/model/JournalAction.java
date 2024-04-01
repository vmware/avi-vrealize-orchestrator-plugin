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
 * The JournalAction is a POJO class extends AviRestResource that used for creating
 * JournalAction.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "JournalAction")
@VsoFinder(name = Constants.FINDER_VRO_JOURNALACTION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class JournalAction extends AviRestResource {
    @JsonProperty("objects")
    @JsonInclude(Include.NON_NULL)
    private List<JournalObject> objects;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private String version;



  /**
   * This is the getter method this will return the attribute value.
   * Details of the process for each object type.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objects
   */
  @VsoMethod
  public List<JournalObject> getObjects() {
    return objects;
  }

  /**
   * This is the setter method. this will set the objects
   * Details of the process for each object type.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objects
   */
  @VsoMethod
  public void setObjects(List<JournalObject>  objects) {
    this.objects = objects;
  }

  /**
   * This is the setter method this will set the objects
   * Details of the process for each object type.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objects
   */
  @VsoMethod
  public JournalAction addObjectsItem(JournalObject objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<JournalObject>();
    }
    this.objects.add(objectsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Migrated version.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return version
   */
  @VsoMethod
  public String getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Migrated version.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(String  version) {
    this.version = version;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  JournalAction objJournalAction = (JournalAction) o;
  return   Objects.equals(this.version, objJournalAction.version)&&
  Objects.equals(this.objects, objJournalAction.objects);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class JournalAction {\n");
      sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

