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
 * EstimateGasLimitRBDataItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class EstimateGasLimitRBDataItem {
  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additionalData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private String additionalData;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private String recipient;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  public EstimateGasLimitRBDataItem() { 
  }

  public EstimateGasLimitRBDataItem additionalData(String additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

   /**
   * Represents an optional field to add additonal data.
   * @return additionalData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yourAdditionalString", value = "Represents an optional field to add additonal data.")

  public String getAdditionalData() {
    return additionalData;
  }


  public void setAdditionalData(String additionalData) {
    this.additionalData = additionalData;
  }


  public EstimateGasLimitRBDataItem amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Represents transactions&#39; amount.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.002", required = true, value = "Represents transactions' amount.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public EstimateGasLimitRBDataItem recipient(String recipient) {
    
    this.recipient = recipient;
    return this;
  }

   /**
   * The address which receives this transaction. In UTXO-based protocols like Bitcoin there could be several senders while in account-based protocols like Ethereum there is always only one recipient.
   * @return recipient
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0xc065b539490f81b6c297c37b1925c3be2f190738", required = true, value = "The address which receives this transaction. In UTXO-based protocols like Bitcoin there could be several senders while in account-based protocols like Ethereum there is always only one recipient.")

  public String getRecipient() {
    return recipient;
  }


  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }


  public EstimateGasLimitRBDataItem sender(String sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Represents the address which sends this transaction. In UTXO-based protocols like Bitcoin there could be several senders while in account-based protocols like Ethereum there is always only one sender.
   * @return sender
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x6f61e3c2fbb8c8be698bd0907ba6c04b62800fe5", required = true, value = "Represents the address which sends this transaction. In UTXO-based protocols like Bitcoin there could be several senders while in account-based protocols like Ethereum there is always only one sender.")

  public String getSender() {
    return sender;
  }


  public void setSender(String sender) {
    this.sender = sender;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimateGasLimitRBDataItem estimateGasLimitRBDataItem = (EstimateGasLimitRBDataItem) o;
    return Objects.equals(this.additionalData, estimateGasLimitRBDataItem.additionalData) &&
        Objects.equals(this.amount, estimateGasLimitRBDataItem.amount) &&
        Objects.equals(this.recipient, estimateGasLimitRBDataItem.recipient) &&
        Objects.equals(this.sender, estimateGasLimitRBDataItem.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, amount, recipient, sender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimateGasLimitRBDataItem {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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
    openapiFields.add("additionalData");
    openapiFields.add("amount");
    openapiFields.add("recipient");
    openapiFields.add("sender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("recipient");
    openapiRequiredFields.add("sender");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EstimateGasLimitRBDataItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EstimateGasLimitRBDataItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EstimateGasLimitRBDataItem is not found in the empty JSON string", EstimateGasLimitRBDataItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EstimateGasLimitRBDataItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EstimateGasLimitRBDataItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EstimateGasLimitRBDataItem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("additionalData") != null && !jsonObj.get("additionalData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalData").toString()));
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("recipient") != null && !jsonObj.get("recipient").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient").toString()));
      }
      if (jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EstimateGasLimitRBDataItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EstimateGasLimitRBDataItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EstimateGasLimitRBDataItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EstimateGasLimitRBDataItem.class));

       return (TypeAdapter<T>) new TypeAdapter<EstimateGasLimitRBDataItem>() {
           @Override
           public void write(JsonWriter out, EstimateGasLimitRBDataItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EstimateGasLimitRBDataItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EstimateGasLimitRBDataItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EstimateGasLimitRBDataItem
  * @throws IOException if the JSON string is invalid with respect to EstimateGasLimitRBDataItem
  */
  public static EstimateGasLimitRBDataItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EstimateGasLimitRBDataItem.class);
  }

 /**
  * Convert an instance of EstimateGasLimitRBDataItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

