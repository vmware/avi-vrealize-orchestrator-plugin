package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GeoLocation;
import com.vmware.avi.vro.model.DnsOptRecord;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DnsRequest is a POJO class extends AviRestResource that used for creating
 * DnsRequest.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsRequest")
@VsoFinder(name = Constants.FINDER_VRO_DNSREQUEST)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsRequest extends AviRestResource {
    @JsonProperty("additional_records_count")
    @JsonInclude(Include.NON_NULL)
    private Integer additionalRecordsCount;

    @JsonProperty("answer_records_count")
    @JsonInclude(Include.NON_NULL)
    private Integer answerRecordsCount;

    @JsonProperty("authentic_data")
    @JsonInclude(Include.NON_NULL)
    private Boolean authenticData;

    @JsonProperty("checking_disabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean checkingDisabled;

    @JsonProperty("client_location")
    @JsonInclude(Include.NON_NULL)
    private GeoLocation clientLocation;

    @JsonProperty("identifier")
    @JsonInclude(Include.NON_NULL)
    private Integer identifier;

    @JsonProperty("nameserver_records_count")
    @JsonInclude(Include.NON_NULL)
    private Integer nameserverRecordsCount;

    @JsonProperty("opcode")
    @JsonInclude(Include.NON_NULL)
    private String opcode;

    @JsonProperty("opt_record")
    @JsonInclude(Include.NON_NULL)
    private DnsOptRecord optRecord;

    @JsonProperty("query_or_response")
    @JsonInclude(Include.NON_NULL)
    private Boolean queryOrResponse;

    @JsonProperty("question_count")
    @JsonInclude(Include.NON_NULL)
    private Integer questionCount;

    @JsonProperty("recursion_desired")
    @JsonInclude(Include.NON_NULL)
    private Boolean recursionDesired;



  /**
   * This is the getter method this will return the attribute value.
   * Number of additional records.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return additionalRecordsCount
   */
  @VsoMethod
  public Integer getAdditionalRecordsCount() {
    return additionalRecordsCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of additional records.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param additionalRecordsCount set the additionalRecordsCount.
   */
  @VsoMethod
  public void setAdditionalRecordsCount(Integer  additionalRecordsCount) {
    this.additionalRecordsCount = additionalRecordsCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of answer records in the client dns request.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return answerRecordsCount
   */
  @VsoMethod
  public Integer getAnswerRecordsCount() {
    return answerRecordsCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of answer records in the client dns request.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param answerRecordsCount set the answerRecordsCount.
   */
  @VsoMethod
  public void setAnswerRecordsCount(Integer  answerRecordsCount) {
    this.answerRecordsCount = answerRecordsCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag indicating client understands ad bit and is interested in the value of ad bit in the response.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authenticData
   */
  @VsoMethod
  public Boolean getAuthenticData() {
    return authenticData;
  }

  /**
   * This is the setter method to the attribute.
   * Flag indicating client understands ad bit and is interested in the value of ad bit in the response.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param authenticData set the authenticData.
   */
  @VsoMethod
  public void setAuthenticData(Boolean  authenticData) {
    this.authenticData = authenticData;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag indicating client does not want dnssec validation of the response.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return checkingDisabled
   */
  @VsoMethod
  public Boolean getCheckingDisabled() {
    return checkingDisabled;
  }

  /**
   * This is the setter method to the attribute.
   * Flag indicating client does not want dnssec validation of the response.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param checkingDisabled set the checkingDisabled.
   */
  @VsoMethod
  public void setCheckingDisabled(Boolean  checkingDisabled) {
    this.checkingDisabled = checkingDisabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Geo location of client.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientLocation
   */
  @VsoMethod
  public GeoLocation getClientLocation() {
    return clientLocation;
  }

  /**
   * This is the setter method to the attribute.
   * Geo location of client.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientLocation set the clientLocation.
   */
  @VsoMethod
  public void setClientLocation(GeoLocation clientLocation) {
    this.clientLocation = clientLocation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Id of the dns request.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return identifier
   */
  @VsoMethod
  public Integer getIdentifier() {
    return identifier;
  }

  /**
   * This is the setter method to the attribute.
   * Id of the dns request.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param identifier set the identifier.
   */
  @VsoMethod
  public void setIdentifier(Integer  identifier) {
    this.identifier = identifier;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of nameserver records in the client dns request.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nameserverRecordsCount
   */
  @VsoMethod
  public Integer getNameserverRecordsCount() {
    return nameserverRecordsCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of nameserver records in the client dns request.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nameserverRecordsCount set the nameserverRecordsCount.
   */
  @VsoMethod
  public void setNameserverRecordsCount(Integer  nameserverRecordsCount) {
    this.nameserverRecordsCount = nameserverRecordsCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dns request operation code e.g.
   * Query, notify, etc.
   * Enum options - DNS_OPCODE_QUERY, DNS_OPCODE_IQUERY, DNS_OPCODE_STATUS, DNS_OPCODE_NOTIFY, DNS_OPCODE_UPDATE.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return opcode
   */
  @VsoMethod
  public String getOpcode() {
    return opcode;
  }

  /**
   * This is the setter method to the attribute.
   * Dns request operation code e.g.
   * Query, notify, etc.
   * Enum options - DNS_OPCODE_QUERY, DNS_OPCODE_IQUERY, DNS_OPCODE_STATUS, DNS_OPCODE_NOTIFY, DNS_OPCODE_UPDATE.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param opcode set the opcode.
   */
  @VsoMethod
  public void setOpcode(String  opcode) {
    this.opcode = opcode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Opt resource records in the request.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return optRecord
   */
  @VsoMethod
  public DnsOptRecord getOptRecord() {
    return optRecord;
  }

  /**
   * This is the setter method to the attribute.
   * Opt resource records in the request.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param optRecord set the optRecord.
   */
  @VsoMethod
  public void setOptRecord(DnsOptRecord optRecord) {
    this.optRecord = optRecord;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag indicating request is a client query (false) or server response (true).
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return queryOrResponse
   */
  @VsoMethod
  public Boolean getQueryOrResponse() {
    return queryOrResponse;
  }

  /**
   * This is the setter method to the attribute.
   * Flag indicating request is a client query (false) or server response (true).
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param queryOrResponse set the queryOrResponse.
   */
  @VsoMethod
  public void setQueryOrResponse(Boolean  queryOrResponse) {
    this.queryOrResponse = queryOrResponse;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of questions in the client dns request.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return questionCount
   */
  @VsoMethod
  public Integer getQuestionCount() {
    return questionCount;
  }

  /**
   * This is the setter method to the attribute.
   * Number of questions in the client dns request.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param questionCount set the questionCount.
   */
  @VsoMethod
  public void setQuestionCount(Integer  questionCount) {
    this.questionCount = questionCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag indicating client request for recursive resolution.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return recursionDesired
   */
  @VsoMethod
  public Boolean getRecursionDesired() {
    return recursionDesired;
  }

  /**
   * This is the setter method to the attribute.
   * Flag indicating client request for recursive resolution.
   * Field introduced in 17.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param recursionDesired set the recursionDesired.
   */
  @VsoMethod
  public void setRecursionDesired(Boolean  recursionDesired) {
    this.recursionDesired = recursionDesired;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsRequest objDnsRequest = (DnsRequest) o;
  return   Objects.equals(this.queryOrResponse, objDnsRequest.queryOrResponse)&&
  Objects.equals(this.opcode, objDnsRequest.opcode)&&
  Objects.equals(this.recursionDesired, objDnsRequest.recursionDesired)&&
  Objects.equals(this.checkingDisabled, objDnsRequest.checkingDisabled)&&
  Objects.equals(this.authenticData, objDnsRequest.authenticData)&&
  Objects.equals(this.questionCount, objDnsRequest.questionCount)&&
  Objects.equals(this.answerRecordsCount, objDnsRequest.answerRecordsCount)&&
  Objects.equals(this.nameserverRecordsCount, objDnsRequest.nameserverRecordsCount)&&
  Objects.equals(this.additionalRecordsCount, objDnsRequest.additionalRecordsCount)&&
  Objects.equals(this.optRecord, objDnsRequest.optRecord)&&
  Objects.equals(this.clientLocation, objDnsRequest.clientLocation)&&
  Objects.equals(this.identifier, objDnsRequest.identifier);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsRequest {\n");
      sb.append("    additionalRecordsCount: ").append(toIndentedString(additionalRecordsCount)).append("\n");
        sb.append("    answerRecordsCount: ").append(toIndentedString(answerRecordsCount)).append("\n");
        sb.append("    authenticData: ").append(toIndentedString(authenticData)).append("\n");
        sb.append("    checkingDisabled: ").append(toIndentedString(checkingDisabled)).append("\n");
        sb.append("    clientLocation: ").append(toIndentedString(clientLocation)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    nameserverRecordsCount: ").append(toIndentedString(nameserverRecordsCount)).append("\n");
        sb.append("    opcode: ").append(toIndentedString(opcode)).append("\n");
        sb.append("    optRecord: ").append(toIndentedString(optRecord)).append("\n");
        sb.append("    queryOrResponse: ").append(toIndentedString(queryOrResponse)).append("\n");
        sb.append("    questionCount: ").append(toIndentedString(questionCount)).append("\n");
        sb.append("    recursionDesired: ").append(toIndentedString(recursionDesired)).append("\n");
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

