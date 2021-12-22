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
import org.openapitools.client.model.ListAllUnconfirmedTransactionsE400;

/**
 * InlineResponse40016
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class InlineResponse40016 {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private String context;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private ListAllUnconfirmedTransactionsE400 error;

  public InlineResponse40016() { 
  }

  public InlineResponse40016 apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Specifies the version of the API that incorporates this endpoint.
   * @return apiVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2.0", required = true, value = "Specifies the version of the API that incorporates this endpoint.")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public InlineResponse40016 requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Defines the ID of the request. The &#x60;requestId&#x60; is generated by Crypto APIs and it&#39;s unique for every request.
   * @return requestId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "601c1710034ed6d407996b30", required = true, value = "Defines the ID of the request. The `requestId` is generated by Crypto APIs and it's unique for every request.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public InlineResponse40016 context(String context) {
    
    this.context = context;
    return this;
  }

   /**
   * In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user.
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "You can add any text here", value = "In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.")

  public String getContext() {
    return context;
  }


  public void setContext(String context) {
    this.context = context;
  }


  public InlineResponse40016 error(ListAllUnconfirmedTransactionsE400 error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListAllUnconfirmedTransactionsE400 getError() {
    return error;
  }


  public void setError(ListAllUnconfirmedTransactionsE400 error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse40016 inlineResponse40016 = (InlineResponse40016) o;
    return Objects.equals(this.apiVersion, inlineResponse40016.apiVersion) &&
        Objects.equals(this.requestId, inlineResponse40016.requestId) &&
        Objects.equals(this.context, inlineResponse40016.context) &&
        Objects.equals(this.error, inlineResponse40016.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, requestId, context, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse40016 {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

