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
 * OMNI
 */
@ApiModel(description = "OMNI")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class AddressTokensTransactionConfirmedEachConfirmationOmni {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROPERTY_ID = "propertyId";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private String propertyId;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private String transactionType;

  public static final String SERIALIZED_NAME_CREATED_BY_TRANSACTION_ID = "createdByTransactionId";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_TRANSACTION_ID)
  private String createdByTransactionId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public AddressTokensTransactionConfirmedEachConfirmationOmni() { 
  }

  public AddressTokensTransactionConfirmedEachConfirmationOmni name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the token.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "TetherUSDT", required = true, value = "Specifies the name of the token.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AddressTokensTransactionConfirmedEachConfirmationOmni propertyId(String propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Defines the ID of the property for Omni Layer.
   * @return propertyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "31", required = true, value = "Defines the ID of the property for Omni Layer.")

  public String getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(String propertyId) {
    this.propertyId = propertyId;
  }


  public AddressTokensTransactionConfirmedEachConfirmationOmni transactionType(String transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Defines the type of the transaction.
   * @return transactionType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Simple Send, DEx Purchase etc.", required = true, value = "Defines the type of the transaction.")

  public String getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  public AddressTokensTransactionConfirmedEachConfirmationOmni createdByTransactionId(String createdByTransactionId) {
    
    this.createdByTransactionId = createdByTransactionId;
    return this;
  }

   /**
   * The transaction ID used to create the token.
   * @return createdByTransactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "be5be71feac9e7019fbcdea5a87098a7862a0ee8c60bd5809b4d3b0cda940ddc", required = true, value = "The transaction ID used to create the token.")

  public String getCreatedByTransactionId() {
    return createdByTransactionId;
  }


  public void setCreatedByTransactionId(String createdByTransactionId) {
    this.createdByTransactionId = createdByTransactionId;
  }


  public AddressTokensTransactionConfirmedEachConfirmationOmni amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the amount of tokens sent with the confirmed transaction.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "190.531725", required = true, value = "Defines the amount of tokens sent with the confirmed transaction.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressTokensTransactionConfirmedEachConfirmationOmni addressTokensTransactionConfirmedEachConfirmationOmni = (AddressTokensTransactionConfirmedEachConfirmationOmni) o;
    return Objects.equals(this.name, addressTokensTransactionConfirmedEachConfirmationOmni.name) &&
        Objects.equals(this.propertyId, addressTokensTransactionConfirmedEachConfirmationOmni.propertyId) &&
        Objects.equals(this.transactionType, addressTokensTransactionConfirmedEachConfirmationOmni.transactionType) &&
        Objects.equals(this.createdByTransactionId, addressTokensTransactionConfirmedEachConfirmationOmni.createdByTransactionId) &&
        Objects.equals(this.amount, addressTokensTransactionConfirmedEachConfirmationOmni.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, propertyId, transactionType, createdByTransactionId, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressTokensTransactionConfirmedEachConfirmationOmni {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    createdByTransactionId: ").append(toIndentedString(createdByTransactionId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("propertyId");
    openapiFields.add("transactionType");
    openapiFields.add("createdByTransactionId");
    openapiFields.add("amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("propertyId");
    openapiRequiredFields.add("transactionType");
    openapiRequiredFields.add("createdByTransactionId");
    openapiRequiredFields.add("amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddressTokensTransactionConfirmedEachConfirmationOmni
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AddressTokensTransactionConfirmedEachConfirmationOmni.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressTokensTransactionConfirmedEachConfirmationOmni is not found in the empty JSON string", AddressTokensTransactionConfirmedEachConfirmationOmni.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddressTokensTransactionConfirmedEachConfirmationOmni.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddressTokensTransactionConfirmedEachConfirmationOmni` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddressTokensTransactionConfirmedEachConfirmationOmni.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("propertyId") != null && !jsonObj.get("propertyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("propertyId").toString()));
      }
      if (jsonObj.get("transactionType") != null && !jsonObj.get("transactionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionType").toString()));
      }
      if (jsonObj.get("createdByTransactionId") != null && !jsonObj.get("createdByTransactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByTransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdByTransactionId").toString()));
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressTokensTransactionConfirmedEachConfirmationOmni.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressTokensTransactionConfirmedEachConfirmationOmni' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressTokensTransactionConfirmedEachConfirmationOmni> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressTokensTransactionConfirmedEachConfirmationOmni.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressTokensTransactionConfirmedEachConfirmationOmni>() {
           @Override
           public void write(JsonWriter out, AddressTokensTransactionConfirmedEachConfirmationOmni value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressTokensTransactionConfirmedEachConfirmationOmni read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressTokensTransactionConfirmedEachConfirmationOmni given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressTokensTransactionConfirmedEachConfirmationOmni
  * @throws IOException if the JSON string is invalid with respect to AddressTokensTransactionConfirmedEachConfirmationOmni
  */
  public static AddressTokensTransactionConfirmedEachConfirmationOmni fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressTokensTransactionConfirmedEachConfirmationOmni.class);
  }

 /**
  * Convert an instance of AddressTokensTransactionConfirmedEachConfirmationOmni to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

