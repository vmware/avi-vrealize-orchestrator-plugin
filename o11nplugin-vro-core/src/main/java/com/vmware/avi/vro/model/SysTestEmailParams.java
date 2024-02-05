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
 * The SysTestEmailParams is a POJO class extends AviRestResource that used for creating
 * SysTestEmailParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SysTestEmailParams")
@VsoFinder(name = Constants.FINDER_VRO_SYSTESTEMAILPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SysTestEmailParams extends AviRestResource {
    @JsonProperty("cc_emails")
    @JsonInclude(Include.NON_NULL)
    private String ccEmails;

    @JsonProperty("subject")
    @JsonInclude(Include.NON_NULL)
    private String subject;

    @JsonProperty("text")
    @JsonInclude(Include.NON_NULL)
    private String text;

    @JsonProperty("to_emails")
    @JsonInclude(Include.NON_NULL)
    private String toEmails;



  /**
   * This is the getter method this will return the attribute value.
   * Alerts are copied to the comma separated list of  email recipients.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ccEmails
   */
  @VsoMethod
  public String getCcEmails() {
    return ccEmails;
  }

  /**
   * This is the setter method to the attribute.
   * Alerts are copied to the comma separated list of  email recipients.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccEmails set the ccEmails.
   */
  @VsoMethod
  public void setCcEmails(String  ccEmails) {
    this.ccEmails = ccEmails;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The subject line of the originating email from  avi controller.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subject
   */
  @VsoMethod
  public String getSubject() {
    return subject;
  }

  /**
   * This is the setter method to the attribute.
   * The subject line of the originating email from  avi controller.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subject set the subject.
   */
  @VsoMethod
  public void setSubject(String  subject) {
    this.subject = subject;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The email context.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return text
   */
  @VsoMethod
  public String getText() {
    return text;
  }

  /**
   * This is the setter method to the attribute.
   * The email context.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param text set the text.
   */
  @VsoMethod
  public void setText(String  text) {
    this.text = text;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Alerts are sent to the comma separated list of  email recipients.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return toEmails
   */
  @VsoMethod
  public String getToEmails() {
    return toEmails;
  }

  /**
   * This is the setter method to the attribute.
   * Alerts are sent to the comma separated list of  email recipients.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param toEmails set the toEmails.
   */
  @VsoMethod
  public void setToEmails(String  toEmails) {
    this.toEmails = toEmails;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SysTestEmailParams objSysTestEmailParams = (SysTestEmailParams) o;
  return   Objects.equals(this.toEmails, objSysTestEmailParams.toEmails)&&
  Objects.equals(this.ccEmails, objSysTestEmailParams.ccEmails)&&
  Objects.equals(this.subject, objSysTestEmailParams.subject)&&
  Objects.equals(this.text, objSysTestEmailParams.text);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SysTestEmailParams {\n");
      sb.append("    ccEmails: ").append(toIndentedString(ccEmails)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    toEmails: ").append(toIndentedString(toEmails)).append("\n");
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

