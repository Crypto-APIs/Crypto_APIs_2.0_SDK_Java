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
 * Object representation of the transaction fee
 */
@ApiModel(description = "Object representation of the transaction fee")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class ListAllUnconfirmedTransactionsRIBSEFee {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public ListAllUnconfirmedTransactionsRIBSEFee() { 
  }

  public ListAllUnconfirmedTransactionsRIBSEFee amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * String representation of the fee value
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.0122", required = true, value = "String representation of the fee value")

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
    ListAllUnconfirmedTransactionsRIBSEFee listAllUnconfirmedTransactionsRIBSEFee = (ListAllUnconfirmedTransactionsRIBSEFee) o;
    return Objects.equals(this.amount, listAllUnconfirmedTransactionsRIBSEFee.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAllUnconfirmedTransactionsRIBSEFee {\n");
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
    openapiFields.add("amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAllUnconfirmedTransactionsRIBSEFee
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListAllUnconfirmedTransactionsRIBSEFee.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAllUnconfirmedTransactionsRIBSEFee is not found in the empty JSON string", ListAllUnconfirmedTransactionsRIBSEFee.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAllUnconfirmedTransactionsRIBSEFee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAllUnconfirmedTransactionsRIBSEFee` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListAllUnconfirmedTransactionsRIBSEFee.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAllUnconfirmedTransactionsRIBSEFee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAllUnconfirmedTransactionsRIBSEFee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAllUnconfirmedTransactionsRIBSEFee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAllUnconfirmedTransactionsRIBSEFee.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAllUnconfirmedTransactionsRIBSEFee>() {
           @Override
           public void write(JsonWriter out, ListAllUnconfirmedTransactionsRIBSEFee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAllUnconfirmedTransactionsRIBSEFee read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAllUnconfirmedTransactionsRIBSEFee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAllUnconfirmedTransactionsRIBSEFee
  * @throws IOException if the JSON string is invalid with respect to ListAllUnconfirmedTransactionsRIBSEFee
  */
  public static ListAllUnconfirmedTransactionsRIBSEFee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAllUnconfirmedTransactionsRIBSEFee.class);
  }

 /**
  * Convert an instance of ListAllUnconfirmedTransactionsRIBSEFee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

