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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.cryptoapis.sdk.JSON;

/**
 * ListCoinsForwardingAutomationsRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class ListCoinsForwardingAutomationsRI {
  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_CONFIRMATIONS_COUNT_TRIGGER = "confirmationsCountTrigger";
  @SerializedName(SERIALIZED_NAME_CONFIRMATIONS_COUNT_TRIGGER)
  private Integer confirmationsCountTrigger;

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "createdTimestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Integer createdTimestamp;

  /**
   * Represents the fee priority of the automation, whether it is \&quot;SLOW\&quot;, \&quot;STANDARD\&quot; OR \&quot;FAST\&quot;.
   */
  @JsonAdapter(FeePriorityEnum.Adapter.class)
  public enum FeePriorityEnum {
    SLOW("slow"),
    
    STANDARD("standard"),
    
    FAST("fast");

    private String value;

    FeePriorityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeePriorityEnum fromValue(String value) {
      for (FeePriorityEnum b : FeePriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeePriorityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeePriorityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeePriorityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeePriorityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEE_PRIORITY = "feePriority";
  @SerializedName(SERIALIZED_NAME_FEE_PRIORITY)
  private FeePriorityEnum feePriority;

  public static final String SERIALIZED_NAME_FROM_ADDRESS = "fromAddress";
  @SerializedName(SERIALIZED_NAME_FROM_ADDRESS)
  private String fromAddress;

  public static final String SERIALIZED_NAME_MINIMUM_TRANSFER_AMOUNT = "minimumTransferAmount";
  @SerializedName(SERIALIZED_NAME_MINIMUM_TRANSFER_AMOUNT)
  private String minimumTransferAmount;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_TO_ADDRESS = "toAddress";
  @SerializedName(SERIALIZED_NAME_TO_ADDRESS)
  private String toAddress;

  public ListCoinsForwardingAutomationsRI() { 
  }

  public ListCoinsForwardingAutomationsRI callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs. &#x60;We support ONLY httpS type of protocol&#x60;.
   * @return callbackUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://example.com", required = true, value = "Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs. `We support ONLY httpS type of protocol`.")

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public ListCoinsForwardingAutomationsRI confirmationsCountTrigger(Integer confirmationsCountTrigger) {
    
    this.confirmationsCountTrigger = confirmationsCountTrigger;
    return this;
  }

   /**
   * Represents the total count of the transaction confirmations before triggering the event.
   * @return confirmationsCountTrigger
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "Represents the total count of the transaction confirmations before triggering the event.")

  public Integer getConfirmationsCountTrigger() {
    return confirmationsCountTrigger;
  }


  public void setConfirmationsCountTrigger(Integer confirmationsCountTrigger) {
    this.confirmationsCountTrigger = confirmationsCountTrigger;
  }


  public ListCoinsForwardingAutomationsRI createdTimestamp(Integer createdTimestamp) {
    
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * Defines the specific time/date when the automatic forwarding was created in Unix Timestamp.
   * @return createdTimestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1611238648", required = true, value = "Defines the specific time/date when the automatic forwarding was created in Unix Timestamp.")

  public Integer getCreatedTimestamp() {
    return createdTimestamp;
  }


  public void setCreatedTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public ListCoinsForwardingAutomationsRI feePriority(FeePriorityEnum feePriority) {
    
    this.feePriority = feePriority;
    return this;
  }

   /**
   * Represents the fee priority of the automation, whether it is \&quot;SLOW\&quot;, \&quot;STANDARD\&quot; OR \&quot;FAST\&quot;.
   * @return feePriority
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "standard", required = true, value = "Represents the fee priority of the automation, whether it is \"SLOW\", \"STANDARD\" OR \"FAST\".")

  public FeePriorityEnum getFeePriority() {
    return feePriority;
  }


  public void setFeePriority(FeePriorityEnum feePriority) {
    this.feePriority = feePriority;
  }


  public ListCoinsForwardingAutomationsRI fromAddress(String fromAddress) {
    
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Represents the hash of the address that forwards the currency.
   * @return fromAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "mzAsK3csTnozLnYVdca4gaoH1btBZBC6QB", required = true, value = "Represents the hash of the address that forwards the currency.")

  public String getFromAddress() {
    return fromAddress;
  }


  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }


  public ListCoinsForwardingAutomationsRI minimumTransferAmount(String minimumTransferAmount) {
    
    this.minimumTransferAmount = minimumTransferAmount;
    return this;
  }

   /**
   * Represents the minimum transfer amount of the currency in the &#x60;fromAddress&#x60; that can be allowed for an automatic forwarding.
   * @return minimumTransferAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.0002", required = true, value = "Represents the minimum transfer amount of the currency in the `fromAddress` that can be allowed for an automatic forwarding.")

  public String getMinimumTransferAmount() {
    return minimumTransferAmount;
  }


  public void setMinimumTransferAmount(String minimumTransferAmount) {
    this.minimumTransferAmount = minimumTransferAmount;
  }


  public ListCoinsForwardingAutomationsRI referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Represents a unique ID used to reference the specific forwarding automation.
   * @return referenceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6017dd02a309213863be9e55", required = true, value = "Represents a unique ID used to reference the specific forwarding automation.")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public ListCoinsForwardingAutomationsRI toAddress(String toAddress) {
    
    this.toAddress = toAddress;
    return this;
  }

   /**
   * Represents the hash of the address the currency is forwarded to.
   * @return toAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "tb1q54j7qcu7kgsrx87yn0r9zjdvsxrnvxg4qua2z6", required = true, value = "Represents the hash of the address the currency is forwarded to.")

  public String getToAddress() {
    return toAddress;
  }


  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCoinsForwardingAutomationsRI listCoinsForwardingAutomationsRI = (ListCoinsForwardingAutomationsRI) o;
    return Objects.equals(this.callbackUrl, listCoinsForwardingAutomationsRI.callbackUrl) &&
        Objects.equals(this.confirmationsCountTrigger, listCoinsForwardingAutomationsRI.confirmationsCountTrigger) &&
        Objects.equals(this.createdTimestamp, listCoinsForwardingAutomationsRI.createdTimestamp) &&
        Objects.equals(this.feePriority, listCoinsForwardingAutomationsRI.feePriority) &&
        Objects.equals(this.fromAddress, listCoinsForwardingAutomationsRI.fromAddress) &&
        Objects.equals(this.minimumTransferAmount, listCoinsForwardingAutomationsRI.minimumTransferAmount) &&
        Objects.equals(this.referenceId, listCoinsForwardingAutomationsRI.referenceId) &&
        Objects.equals(this.toAddress, listCoinsForwardingAutomationsRI.toAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl, confirmationsCountTrigger, createdTimestamp, feePriority, fromAddress, minimumTransferAmount, referenceId, toAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCoinsForwardingAutomationsRI {\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    confirmationsCountTrigger: ").append(toIndentedString(confirmationsCountTrigger)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    feePriority: ").append(toIndentedString(feePriority)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    minimumTransferAmount: ").append(toIndentedString(minimumTransferAmount)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("callbackUrl");
    openapiFields.add("confirmationsCountTrigger");
    openapiFields.add("createdTimestamp");
    openapiFields.add("feePriority");
    openapiFields.add("fromAddress");
    openapiFields.add("minimumTransferAmount");
    openapiFields.add("referenceId");
    openapiFields.add("toAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("callbackUrl");
    openapiRequiredFields.add("confirmationsCountTrigger");
    openapiRequiredFields.add("createdTimestamp");
    openapiRequiredFields.add("feePriority");
    openapiRequiredFields.add("fromAddress");
    openapiRequiredFields.add("minimumTransferAmount");
    openapiRequiredFields.add("referenceId");
    openapiRequiredFields.add("toAddress");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListCoinsForwardingAutomationsRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListCoinsForwardingAutomationsRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListCoinsForwardingAutomationsRI is not found in the empty JSON string", ListCoinsForwardingAutomationsRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListCoinsForwardingAutomationsRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListCoinsForwardingAutomationsRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListCoinsForwardingAutomationsRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("callbackUrl") != null && !jsonObj.get("callbackUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callbackUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callbackUrl").toString()));
      }
      if (jsonObj.get("feePriority") != null && !jsonObj.get("feePriority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feePriority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feePriority").toString()));
      }
      if (jsonObj.get("fromAddress") != null && !jsonObj.get("fromAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromAddress").toString()));
      }
      if (jsonObj.get("minimumTransferAmount") != null && !jsonObj.get("minimumTransferAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minimumTransferAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minimumTransferAmount").toString()));
      }
      if (jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if (jsonObj.get("toAddress") != null && !jsonObj.get("toAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListCoinsForwardingAutomationsRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListCoinsForwardingAutomationsRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListCoinsForwardingAutomationsRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListCoinsForwardingAutomationsRI.class));

       return (TypeAdapter<T>) new TypeAdapter<ListCoinsForwardingAutomationsRI>() {
           @Override
           public void write(JsonWriter out, ListCoinsForwardingAutomationsRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListCoinsForwardingAutomationsRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListCoinsForwardingAutomationsRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListCoinsForwardingAutomationsRI
  * @throws IOException if the JSON string is invalid with respect to ListCoinsForwardingAutomationsRI
  */
  public static ListCoinsForwardingAutomationsRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListCoinsForwardingAutomationsRI.class);
  }

 /**
  * Convert an instance of ListCoinsForwardingAutomationsRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

