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
 * DecodeRawTransactionHexRBDataItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class DecodeRawTransactionHexRBDataItem {
  public static final String SERIALIZED_NAME_RAW_TRANSACTION_HEX = "rawTransactionHex";
  @SerializedName(SERIALIZED_NAME_RAW_TRANSACTION_HEX)
  private String rawTransactionHex;

  public DecodeRawTransactionHexRBDataItem() { 
  }

  public DecodeRawTransactionHexRBDataItem rawTransactionHex(String rawTransactionHex) {
    
    this.rawTransactionHex = rawTransactionHex;
    return this;
  }

   /**
   * Represents the raw transaction Hex that has to be decoded.
   * @return rawTransactionHex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0100000001f3f6a909f8521adb57d898d2985834e632374e770fd9e2b98656f1bf1fdfd427010000006b48304502203a776322ebf8eb8b58cc6ced4f2574f4c73aa664edce0b0022690f2f6f47c521022100b82353305988cb0ebd443089a173ceec93fe4dbfe98d74419ecc84a6a698e31d012103c5c1bc61f60ce3d6223a63cedbece03b12ef9f0068f2f3c4a7e7f06c523c3664ffffffff0260e31600000000001976a914977ae6e32349b99b72196cb62b5ef37329ed81b488ac063d1000000000001976a914f76bc4190f3d8e2315e5c11c59cfc8be9df747e388ac00000000", required = true, value = "Represents the raw transaction Hex that has to be decoded.")

  public String getRawTransactionHex() {
    return rawTransactionHex;
  }


  public void setRawTransactionHex(String rawTransactionHex) {
    this.rawTransactionHex = rawTransactionHex;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecodeRawTransactionHexRBDataItem decodeRawTransactionHexRBDataItem = (DecodeRawTransactionHexRBDataItem) o;
    return Objects.equals(this.rawTransactionHex, decodeRawTransactionHexRBDataItem.rawTransactionHex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawTransactionHex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecodeRawTransactionHexRBDataItem {\n");
    sb.append("    rawTransactionHex: ").append(toIndentedString(rawTransactionHex)).append("\n");
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
    openapiFields.add("rawTransactionHex");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rawTransactionHex");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DecodeRawTransactionHexRBDataItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DecodeRawTransactionHexRBDataItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DecodeRawTransactionHexRBDataItem is not found in the empty JSON string", DecodeRawTransactionHexRBDataItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DecodeRawTransactionHexRBDataItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DecodeRawTransactionHexRBDataItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DecodeRawTransactionHexRBDataItem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("rawTransactionHex") != null && !jsonObj.get("rawTransactionHex").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rawTransactionHex` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rawTransactionHex").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DecodeRawTransactionHexRBDataItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DecodeRawTransactionHexRBDataItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DecodeRawTransactionHexRBDataItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DecodeRawTransactionHexRBDataItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DecodeRawTransactionHexRBDataItem>() {
           @Override
           public void write(JsonWriter out, DecodeRawTransactionHexRBDataItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DecodeRawTransactionHexRBDataItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DecodeRawTransactionHexRBDataItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DecodeRawTransactionHexRBDataItem
  * @throws IOException if the JSON string is invalid with respect to DecodeRawTransactionHexRBDataItem
  */
  public static DecodeRawTransactionHexRBDataItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DecodeRawTransactionHexRBDataItem.class);
  }

 /**
  * Convert an instance of DecodeRawTransactionHexRBDataItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

