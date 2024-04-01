package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.JournalSummary;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ReportTask is a POJO class extends AviRestResource that used for creating
 * ReportTask.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ReportTask")
@VsoFinder(name = Constants.FINDER_VRO_REPORTTASK)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ReportTask extends AviRestResource {
    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason;

    @JsonProperty("summary")
    @JsonInclude(Include.NON_NULL)
    private JournalSummary summary;

    @JsonProperty("task_journal_ref")
    @JsonInclude(Include.NON_NULL)
    private String taskJournalRef;



  /**
   * This is the getter method this will return the attribute value.
   * Name for the task journal.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name for the task journal.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason in case of failure.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason in case of failure.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Copy of journal summary for immediate visibility.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return summary
   */
  @VsoMethod
  public JournalSummary getSummary() {
    return summary;
  }

  /**
   * This is the setter method to the attribute.
   * Copy of journal summary for immediate visibility.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param summary set the summary.
   */
  @VsoMethod
  public void setSummary(JournalSummary summary) {
    this.summary = summary;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Journal reference for the task.
   * It is a reference to an object of type taskjournal.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return taskJournalRef
   */
  @VsoMethod
  public String getTaskJournalRef() {
    return taskJournalRef;
  }

  /**
   * This is the setter method to the attribute.
   * Journal reference for the task.
   * It is a reference to an object of type taskjournal.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param taskJournalRef set the taskJournalRef.
   */
  @VsoMethod
  public void setTaskJournalRef(String  taskJournalRef) {
    this.taskJournalRef = taskJournalRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ReportTask objReportTask = (ReportTask) o;
  return   Objects.equals(this.name, objReportTask.name)&&
  Objects.equals(this.reason, objReportTask.reason)&&
  Objects.equals(this.summary, objReportTask.summary)&&
  Objects.equals(this.taskJournalRef, objReportTask.taskJournalRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ReportTask {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    taskJournalRef: ").append(toIndentedString(taskJournalRef)).append("\n");
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

