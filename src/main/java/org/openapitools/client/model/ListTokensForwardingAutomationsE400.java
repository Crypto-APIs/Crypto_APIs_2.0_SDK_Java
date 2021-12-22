/*
 * CryptoAPIs
 * Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: developers@cryptoapis.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BannedIpAddressDetails;
import org.openapitools.client.model.InvalidPagination;
import org.openapitools.client.model.LimitGreaterThanAllowed;
import org.openapitools.client.model.UriNotFound;

/**
 * ListTokensForwardingAutomationsE400
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class ListTokensForwardingAutomationsE400 {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<BannedIpAddressDetails> details = null;

  public ListTokensForwardingAutomationsE400() { 
  }

  public ListTokensForwardingAutomationsE400 code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Specifies an error code, e.g. error 404.
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "invalid_pagination", required = true, value = "Specifies an error code, e.g. error 404.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ListTokensForwardingAutomationsE400 message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Specifies the message of the error, i.e. why the error was returned, e.g. error 404 stands for “not found”.
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "The pagination attributes that have been used are invalid. Please check the Documentation to see details on pagination.", required = true, value = "Specifies the message of the error, i.e. why the error was returned, e.g. error 404 stands for “not found”.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ListTokensForwardingAutomationsE400 details(List<BannedIpAddressDetails> details) {
    
    this.details = details;
    return this;
  }

  public ListTokensForwardingAutomationsE400 addDetailsItem(BannedIpAddressDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<BannedIpAddressDetails>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BannedIpAddressDetails> getDetails() {
    return details;
  }


  public void setDetails(List<BannedIpAddressDetails> details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTokensForwardingAutomationsE400 listTokensForwardingAutomationsE400 = (ListTokensForwardingAutomationsE400) o;
    return Objects.equals(this.code, listTokensForwardingAutomationsE400.code) &&
        Objects.equals(this.message, listTokensForwardingAutomationsE400.message) &&
        Objects.equals(this.details, listTokensForwardingAutomationsE400.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTokensForwardingAutomationsE400 {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

