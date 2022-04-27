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
import org.openapitools.client.model.CreateFungibleTokensTransactionRequestFromAddressRIRecipients;
import org.openapitools.client.model.CreateFungibleTokensTransactionRequestFromAddressRIS;
import org.openapitools.client.model.CreateFungibleTokensTransactionRequestFromAddressRISenders;

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
 * CreateFungibleTokensTransactionRequestFromAddressRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class CreateFungibleTokensTransactionRequestFromAddressRI {
  public static final String SERIALIZED_NAME_CALLBACK_SECRET_KEY = "callbackSecretKey";
  @SerializedName(SERIALIZED_NAME_CALLBACK_SECRET_KEY)
  private String callbackSecretKey;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  /**
   * Represents the fee priority of the automation, whether it is \&quot;slow\&quot;, \&quot;standard\&quot; or \&quot;fast\&quot;.
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

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<CreateFungibleTokensTransactionRequestFromAddressRIRecipients> recipients = new ArrayList<>();

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  private CreateFungibleTokensTransactionRequestFromAddressRISenders senders;

  public static final String SERIALIZED_NAME_TOKEN_TYPE_SPECIFIC_DATA = "tokenTypeSpecificData";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE_SPECIFIC_DATA)
  private CreateFungibleTokensTransactionRequestFromAddressRIS tokenTypeSpecificData;

  public static final String SERIALIZED_NAME_TRANSACTION_REQUEST_ID = "transactionRequestId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_REQUEST_ID)
  private String transactionRequestId;

  public CreateFungibleTokensTransactionRequestFromAddressRI() { 
  }

  public CreateFungibleTokensTransactionRequestFromAddressRI callbackSecretKey(String callbackSecretKey) {
    
    this.callbackSecretKey = callbackSecretKey;
    return this;
  }

   /**
   * Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs. For more information please see our [Documentation](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-security).
   * @return callbackSecretKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "yourSecretString", required = true, value = "Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs. For more information please see our [Documentation](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-security).")

  public String getCallbackSecretKey() {
    return callbackSecretKey;
  }


  public void setCallbackSecretKey(String callbackSecretKey) {
    this.callbackSecretKey = callbackSecretKey;
  }


  public CreateFungibleTokensTransactionRequestFromAddressRI callbackUrl(String callbackUrl) {
    
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


  public CreateFungibleTokensTransactionRequestFromAddressRI feePriority(FeePriorityEnum feePriority) {
    
    this.feePriority = feePriority;
    return this;
  }

   /**
   * Represents the fee priority of the automation, whether it is \&quot;slow\&quot;, \&quot;standard\&quot; or \&quot;fast\&quot;.
   * @return feePriority
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "fast", required = true, value = "Represents the fee priority of the automation, whether it is \"slow\", \"standard\" or \"fast\".")

  public FeePriorityEnum getFeePriority() {
    return feePriority;
  }


  public void setFeePriority(FeePriorityEnum feePriority) {
    this.feePriority = feePriority;
  }


  public CreateFungibleTokensTransactionRequestFromAddressRI note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * Represents an optional note to add a free text in, explaining or providing additional detail on the transaction request.
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yourAdditionalInformationhere", value = "Represents an optional note to add a free text in, explaining or providing additional detail on the transaction request.")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public CreateFungibleTokensTransactionRequestFromAddressRI recipients(List<CreateFungibleTokensTransactionRequestFromAddressRIRecipients> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public CreateFungibleTokensTransactionRequestFromAddressRI addRecipientsItem(CreateFungibleTokensTransactionRequestFromAddressRIRecipients recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Defines the destination for the transaction, i.e. the recipient(s).
   * @return recipients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x1316bea88fb7cd4ccc4a57e2f9f4f43d1a86ee59", required = true, value = "Defines the destination for the transaction, i.e. the recipient(s).")

  public List<CreateFungibleTokensTransactionRequestFromAddressRIRecipients> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<CreateFungibleTokensTransactionRequestFromAddressRIRecipients> recipients) {
    this.recipients = recipients;
  }


  public CreateFungibleTokensTransactionRequestFromAddressRI senders(CreateFungibleTokensTransactionRequestFromAddressRISenders senders) {
    
    this.senders = senders;
    return this;
  }

   /**
   * Get senders
   * @return senders
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CreateFungibleTokensTransactionRequestFromAddressRISenders getSenders() {
    return senders;
  }


  public void setSenders(CreateFungibleTokensTransactionRequestFromAddressRISenders senders) {
    this.senders = senders;
  }


  public CreateFungibleTokensTransactionRequestFromAddressRI tokenTypeSpecificData(CreateFungibleTokensTransactionRequestFromAddressRIS tokenTypeSpecificData) {
    
    this.tokenTypeSpecificData = tokenTypeSpecificData;
    return this;
  }

   /**
   * Get tokenTypeSpecificData
   * @return tokenTypeSpecificData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CreateFungibleTokensTransactionRequestFromAddressRIS getTokenTypeSpecificData() {
    return tokenTypeSpecificData;
  }


  public void setTokenTypeSpecificData(CreateFungibleTokensTransactionRequestFromAddressRIS tokenTypeSpecificData) {
    this.tokenTypeSpecificData = tokenTypeSpecificData;
  }


  public CreateFungibleTokensTransactionRequestFromAddressRI transactionRequestId(String transactionRequestId) {
    
    this.transactionRequestId = transactionRequestId;
    return this;
  }

   /**
   * Represents a unique identifier of the transaction request (the request sent to make a transaction), which helps in identifying which callback and which &#x60;referenceId&#x60; concern that specific transaction request.
   * @return transactionRequestId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6038d09050653d1f0e40584c", required = true, value = "Represents a unique identifier of the transaction request (the request sent to make a transaction), which helps in identifying which callback and which `referenceId` concern that specific transaction request.")

  public String getTransactionRequestId() {
    return transactionRequestId;
  }


  public void setTransactionRequestId(String transactionRequestId) {
    this.transactionRequestId = transactionRequestId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFungibleTokensTransactionRequestFromAddressRI createFungibleTokensTransactionRequestFromAddressRI = (CreateFungibleTokensTransactionRequestFromAddressRI) o;
    return Objects.equals(this.callbackSecretKey, createFungibleTokensTransactionRequestFromAddressRI.callbackSecretKey) &&
        Objects.equals(this.callbackUrl, createFungibleTokensTransactionRequestFromAddressRI.callbackUrl) &&
        Objects.equals(this.feePriority, createFungibleTokensTransactionRequestFromAddressRI.feePriority) &&
        Objects.equals(this.note, createFungibleTokensTransactionRequestFromAddressRI.note) &&
        Objects.equals(this.recipients, createFungibleTokensTransactionRequestFromAddressRI.recipients) &&
        Objects.equals(this.senders, createFungibleTokensTransactionRequestFromAddressRI.senders) &&
        Objects.equals(this.tokenTypeSpecificData, createFungibleTokensTransactionRequestFromAddressRI.tokenTypeSpecificData) &&
        Objects.equals(this.transactionRequestId, createFungibleTokensTransactionRequestFromAddressRI.transactionRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackSecretKey, callbackUrl, feePriority, note, recipients, senders, tokenTypeSpecificData, transactionRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFungibleTokensTransactionRequestFromAddressRI {\n");
    sb.append("    callbackSecretKey: ").append(toIndentedString(callbackSecretKey)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    feePriority: ").append(toIndentedString(feePriority)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    tokenTypeSpecificData: ").append(toIndentedString(tokenTypeSpecificData)).append("\n");
    sb.append("    transactionRequestId: ").append(toIndentedString(transactionRequestId)).append("\n");
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
    openapiFields.add("callbackSecretKey");
    openapiFields.add("callbackUrl");
    openapiFields.add("feePriority");
    openapiFields.add("note");
    openapiFields.add("recipients");
    openapiFields.add("senders");
    openapiFields.add("tokenTypeSpecificData");
    openapiFields.add("transactionRequestId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("callbackSecretKey");
    openapiRequiredFields.add("callbackUrl");
    openapiRequiredFields.add("feePriority");
    openapiRequiredFields.add("recipients");
    openapiRequiredFields.add("senders");
    openapiRequiredFields.add("tokenTypeSpecificData");
    openapiRequiredFields.add("transactionRequestId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateFungibleTokensTransactionRequestFromAddressRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateFungibleTokensTransactionRequestFromAddressRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFungibleTokensTransactionRequestFromAddressRI is not found in the empty JSON string", CreateFungibleTokensTransactionRequestFromAddressRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateFungibleTokensTransactionRequestFromAddressRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateFungibleTokensTransactionRequestFromAddressRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateFungibleTokensTransactionRequestFromAddressRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("callbackSecretKey") != null && !jsonObj.get("callbackSecretKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callbackSecretKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callbackSecretKey").toString()));
      }
      if (jsonObj.get("callbackUrl") != null && !jsonObj.get("callbackUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callbackUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callbackUrl").toString()));
      }
      if (jsonObj.get("feePriority") != null && !jsonObj.get("feePriority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feePriority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feePriority").toString()));
      }
      if (jsonObj.get("note") != null && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
      JsonArray jsonArrayrecipients = jsonObj.getAsJsonArray("recipients");
      if (jsonArrayrecipients != null) {
        // ensure the json data is an array
        if (!jsonObj.get("recipients").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `recipients` to be an array in the JSON string but got `%s`", jsonObj.get("recipients").toString()));
        }

        // validate the optional field `recipients` (array)
        for (int i = 0; i < jsonArrayrecipients.size(); i++) {
          CreateFungibleTokensTransactionRequestFromAddressRIRecipients.validateJsonObject(jsonArrayrecipients.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `senders`
      if (jsonObj.getAsJsonObject("senders") != null) {
        CreateFungibleTokensTransactionRequestFromAddressRISenders.validateJsonObject(jsonObj.getAsJsonObject("senders"));
      }
      // validate the optional field `tokenTypeSpecificData`
      if (jsonObj.getAsJsonObject("tokenTypeSpecificData") != null) {
        CreateFungibleTokensTransactionRequestFromAddressRIS.validateJsonObject(jsonObj.getAsJsonObject("tokenTypeSpecificData"));
      }
      if (jsonObj.get("transactionRequestId") != null && !jsonObj.get("transactionRequestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionRequestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionRequestId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFungibleTokensTransactionRequestFromAddressRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFungibleTokensTransactionRequestFromAddressRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFungibleTokensTransactionRequestFromAddressRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFungibleTokensTransactionRequestFromAddressRI.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFungibleTokensTransactionRequestFromAddressRI>() {
           @Override
           public void write(JsonWriter out, CreateFungibleTokensTransactionRequestFromAddressRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateFungibleTokensTransactionRequestFromAddressRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateFungibleTokensTransactionRequestFromAddressRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateFungibleTokensTransactionRequestFromAddressRI
  * @throws IOException if the JSON string is invalid with respect to CreateFungibleTokensTransactionRequestFromAddressRI
  */
  public static CreateFungibleTokensTransactionRequestFromAddressRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFungibleTokensTransactionRequestFromAddressRI.class);
  }

 /**
  * Convert an instance of CreateFungibleTokensTransactionRequestFromAddressRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
