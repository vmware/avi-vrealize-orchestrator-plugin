package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.DnsOptRecord;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DnsResponse is a POJO class extends AviRestResource that used for creating
 * DnsResponse.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsResponse")
@VsoFinder(name = Constants.FINDER_VRO_DNSRESPONSE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsResponse extends AviRestResource {
    @JsonProperty("additional_records_count")
    @JsonInclude(Include.NON_NULL)
    private Integer additionalRecordsCount;

    @JsonProperty("answer_records_count")
    @JsonInclude(Include.NON_NULL)
    private Integer answerRecordsCount;

    @JsonProperty("authoritative_answer")
    @JsonInclude(Include.NON_NULL)
    private Boolean authoritativeAnswer;

    @JsonProperty("fallback_algorithm_used")
    @JsonInclude(Include.NON_NULL)
    private Boolean fallbackAlgorithmUsed;

    @JsonProperty("is_wildcard")
    @JsonInclude(Include.NON_NULL)
    private Boolean isWildcard;

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

    @JsonProperty("records")
    @JsonInclude(Include.NON_NULL)
    private List<DnsResourceRecord> records;

    @JsonProperty("recursion_available")
    @JsonInclude(Include.NON_NULL)
    private Boolean recursionAvailable;

    @JsonProperty("recursion_desired")
    @JsonInclude(Include.NON_NULL)
    private Boolean recursionDesired;

    @JsonProperty("response_code")
    @JsonInclude(Include.NON_NULL)
    private String responseCode;

    @JsonProperty("truncation")
    @JsonInclude(Include.NON_NULL)
    private Boolean truncation;



  /**
   * This is the getter method this will return the attribute value.
   * Number of additional records.
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
   * Number of answer records.
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
   * Number of answer records.
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
   * Flag to indicate the responding dns is an authority for the requested fqdn.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authoritativeAnswer
   */
  @VsoMethod
  public Boolean getAuthoritativeAnswer() {
    return authoritativeAnswer;
  }

  /**
   * This is the setter method to the attribute.
   * Flag to indicate the responding dns is an authority for the requested fqdn.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param authoritativeAnswer set the authoritativeAnswer.
   */
  @VsoMethod
  public void setAuthoritativeAnswer(Boolean  authoritativeAnswer) {
    this.authoritativeAnswer = authoritativeAnswer;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag to indicate whether fallback algorithm was used to serve this request.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fallbackAlgorithmUsed
   */
  @VsoMethod
  public Boolean getFallbackAlgorithmUsed() {
    return fallbackAlgorithmUsed;
  }

  /**
   * This is the setter method to the attribute.
   * Flag to indicate whether fallback algorithm was used to serve this request.
   * Field introduced in 18.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param fallbackAlgorithmUsed set the fallbackAlgorithmUsed.
   */
  @VsoMethod
  public void setFallbackAlgorithmUsed(Boolean  fallbackAlgorithmUsed) {
    this.fallbackAlgorithmUsed = fallbackAlgorithmUsed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Resource records in the response are generated based on wildcard match.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return isWildcard
   */
  @VsoMethod
  public Boolean getIsWildcard() {
    return isWildcard;
  }

  /**
   * This is the setter method to the attribute.
   * Resource records in the response are generated based on wildcard match.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param isWildcard set the isWildcard.
   */
  @VsoMethod
  public void setIsWildcard(Boolean  isWildcard) {
    this.isWildcard = isWildcard;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Number of nameserver records.
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
   * Number of nameserver records.
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
   * Dns response operation code e.g.
   * Query, notify, etc.
   * Enum options - DNS_OPCODE_QUERY, DNS_OPCODE_IQUERY, DNS_OPCODE_STATUS, DNS_OPCODE_NOTIFY, DNS_OPCODE_UPDATE.
   * Field introduced in 17.1.3.
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
   * Dns response operation code e.g.
   * Query, notify, etc.
   * Enum options - DNS_OPCODE_QUERY, DNS_OPCODE_IQUERY, DNS_OPCODE_STATUS, DNS_OPCODE_NOTIFY, DNS_OPCODE_UPDATE.
   * Field introduced in 17.1.3.
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
   * Opt resource records in the response.
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
   * Opt resource records in the response.
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
   * Flag indicating response is a client query (false) or server response (true).
   * Field introduced in 17.1.3.
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
   * Flag indicating response is a client query (false) or server response (true).
   * Field introduced in 17.1.3.
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
   * Number of questions in the client dns request eliciting this dns response.
   * Field introduced in 17.1.3.
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
   * Number of questions in the client dns request eliciting this dns response.
   * Field introduced in 17.1.3.
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
   * Resource records in the response.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return records
   */
  @VsoMethod
  public List<DnsResourceRecord> getRecords() {
    return records;
  }

  /**
   * This is the setter method. this will set the records
   * Resource records in the response.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return records
   */
  @VsoMethod
  public void setRecords(List<DnsResourceRecord>  records) {
    this.records = records;
  }

  /**
   * This is the setter method this will set the records
   * Resource records in the response.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return records
   */
  @VsoMethod
  public DnsResponse addRecordsItem(DnsResourceRecord recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<DnsResourceRecord>();
    }
    this.records.add(recordsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Flag indicating the dns query is fully answered.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return recursionAvailable
   */
  @VsoMethod
  public Boolean getRecursionAvailable() {
    return recursionAvailable;
  }

  /**
   * This is the setter method to the attribute.
   * Flag indicating the dns query is fully answered.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param recursionAvailable set the recursionAvailable.
   */
  @VsoMethod
  public void setRecursionAvailable(Boolean  recursionAvailable) {
    this.recursionAvailable = recursionAvailable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag copied from the dns query's recursion desired field by the responding dns.
   * Field introduced in 17.1.3.
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
   * Flag copied from the dns query's recursion desired field by the responding dns.
   * Field introduced in 17.1.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param recursionDesired set the recursionDesired.
   */
  @VsoMethod
  public void setRecursionDesired(Boolean  recursionDesired) {
    this.recursionDesired = recursionDesired;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Response code in the response.
   * Enum options - DNS_RCODE_NOERROR, DNS_RCODE_FORMERR, DNS_RCODE_SERVFAIL, DNS_RCODE_NXDOMAIN, DNS_RCODE_NOTIMP, DNS_RCODE_REFUSED,
   * DNS_RCODE_YXDOMAIN, DNS_RCODE_YXRRSET, DNS_RCODE_NXRRSET, DNS_RCODE_NOTAUTH, DNS_RCODE_NOTZONE.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return responseCode
   */
  @VsoMethod
  public String getResponseCode() {
    return responseCode;
  }

  /**
   * This is the setter method to the attribute.
   * Response code in the response.
   * Enum options - DNS_RCODE_NOERROR, DNS_RCODE_FORMERR, DNS_RCODE_SERVFAIL, DNS_RCODE_NXDOMAIN, DNS_RCODE_NOTIMP, DNS_RCODE_REFUSED,
   * DNS_RCODE_YXDOMAIN, DNS_RCODE_YXRRSET, DNS_RCODE_NXRRSET, DNS_RCODE_NOTAUTH, DNS_RCODE_NOTZONE.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param responseCode set the responseCode.
   */
  @VsoMethod
  public void setResponseCode(String  responseCode) {
    this.responseCode = responseCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag to indicate if the answer received from dns is truncated (original answer exceeds 512 bytes udp limit).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return truncation
   */
  @VsoMethod
  public Boolean getTruncation() {
    return truncation;
  }

  /**
   * This is the setter method to the attribute.
   * Flag to indicate if the answer received from dns is truncated (original answer exceeds 512 bytes udp limit).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param truncation set the truncation.
   */
  @VsoMethod
  public void setTruncation(Boolean  truncation) {
    this.truncation = truncation;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsResponse objDnsResponse = (DnsResponse) o;
  return   Objects.equals(this.responseCode, objDnsResponse.responseCode)&&
  Objects.equals(this.authoritativeAnswer, objDnsResponse.authoritativeAnswer)&&
  Objects.equals(this.truncation, objDnsResponse.truncation)&&
  Objects.equals(this.recursionAvailable, objDnsResponse.recursionAvailable)&&
  Objects.equals(this.answerRecordsCount, objDnsResponse.answerRecordsCount)&&
  Objects.equals(this.nameserverRecordsCount, objDnsResponse.nameserverRecordsCount)&&
  Objects.equals(this.additionalRecordsCount, objDnsResponse.additionalRecordsCount)&&
  Objects.equals(this.records, objDnsResponse.records)&&
  Objects.equals(this.optRecord, objDnsResponse.optRecord)&&
  Objects.equals(this.queryOrResponse, objDnsResponse.queryOrResponse)&&
  Objects.equals(this.opcode, objDnsResponse.opcode)&&
  Objects.equals(this.recursionDesired, objDnsResponse.recursionDesired)&&
  Objects.equals(this.questionCount, objDnsResponse.questionCount)&&
  Objects.equals(this.isWildcard, objDnsResponse.isWildcard)&&
  Objects.equals(this.fallbackAlgorithmUsed, objDnsResponse.fallbackAlgorithmUsed);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsResponse {\n");
      sb.append("    additionalRecordsCount: ").append(toIndentedString(additionalRecordsCount)).append("\n");
        sb.append("    answerRecordsCount: ").append(toIndentedString(answerRecordsCount)).append("\n");
        sb.append("    authoritativeAnswer: ").append(toIndentedString(authoritativeAnswer)).append("\n");
        sb.append("    fallbackAlgorithmUsed: ").append(toIndentedString(fallbackAlgorithmUsed)).append("\n");
        sb.append("    isWildcard: ").append(toIndentedString(isWildcard)).append("\n");
        sb.append("    nameserverRecordsCount: ").append(toIndentedString(nameserverRecordsCount)).append("\n");
        sb.append("    opcode: ").append(toIndentedString(opcode)).append("\n");
        sb.append("    optRecord: ").append(toIndentedString(optRecord)).append("\n");
        sb.append("    queryOrResponse: ").append(toIndentedString(queryOrResponse)).append("\n");
        sb.append("    questionCount: ").append(toIndentedString(questionCount)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    recursionAvailable: ").append(toIndentedString(recursionAvailable)).append("\n");
        sb.append("    recursionDesired: ").append(toIndentedString(recursionDesired)).append("\n");
        sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
        sb.append("    truncation: ").append(toIndentedString(truncation)).append("\n");
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

