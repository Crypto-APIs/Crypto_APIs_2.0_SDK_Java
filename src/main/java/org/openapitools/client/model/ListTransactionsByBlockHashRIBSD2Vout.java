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
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSD2ScriptPubKey;

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
 * ListTransactionsByBlockHashRIBSD2Vout
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class ListTransactionsByBlockHashRIBSD2Vout {
  public static final String SERIALIZED_NAME_IS_SPENT = "isSpent";
  @SerializedName(SERIALIZED_NAME_IS_SPENT)
  private Boolean isSpent;

  public static final String SERIALIZED_NAME_SCRIPT_PUB_KEY = "scriptPubKey";
  @SerializedName(SERIALIZED_NAME_SCRIPT_PUB_KEY)
  private ListTransactionsByBlockHashRIBSD2ScriptPubKey scriptPubKey;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public ListTransactionsByBlockHashRIBSD2Vout() { 
  }

  public ListTransactionsByBlockHashRIBSD2Vout isSpent(Boolean isSpent) {
    
    this.isSpent = isSpent;
    return this;
  }

   /**
   * Defines whether the output is spent or not.
   * @return isSpent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Defines whether the output is spent or not.")

  public Boolean getIsSpent() {
    return isSpent;
  }


  public void setIsSpent(Boolean isSpent) {
    this.isSpent = isSpent;
  }


  public ListTransactionsByBlockHashRIBSD2Vout scriptPubKey(ListTransactionsByBlockHashRIBSD2ScriptPubKey scriptPubKey) {
    
    this.scriptPubKey = scriptPubKey;
    return this;
  }

   /**
   * Get scriptPubKey
   * @return scriptPubKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListTransactionsByBlockHashRIBSD2ScriptPubKey getScriptPubKey() {
    return scriptPubKey;
  }


  public void setScriptPubKey(ListTransactionsByBlockHashRIBSD2ScriptPubKey scriptPubKey) {
    this.scriptPubKey = scriptPubKey;
  }


  public ListTransactionsByBlockHashRIBSD2Vout value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Represents the sent/received amount.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10000", required = true, value = "Represents the sent/received amount.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTransactionsByBlockHashRIBSD2Vout listTransactionsByBlockHashRIBSD2Vout = (ListTransactionsByBlockHashRIBSD2Vout) o;
    return Objects.equals(this.isSpent, listTransactionsByBlockHashRIBSD2Vout.isSpent) &&
        Objects.equals(this.scriptPubKey, listTransactionsByBlockHashRIBSD2Vout.scriptPubKey) &&
        Objects.equals(this.value, listTransactionsByBlockHashRIBSD2Vout.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSpent, scriptPubKey, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsByBlockHashRIBSD2Vout {\n");
    sb.append("    isSpent: ").append(toIndentedString(isSpent)).append("\n");
    sb.append("    scriptPubKey: ").append(toIndentedString(scriptPubKey)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("isSpent");
    openapiFields.add("scriptPubKey");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("isSpent");
    openapiRequiredFields.add("scriptPubKey");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListTransactionsByBlockHashRIBSD2Vout
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListTransactionsByBlockHashRIBSD2Vout.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListTransactionsByBlockHashRIBSD2Vout is not found in the empty JSON string", ListTransactionsByBlockHashRIBSD2Vout.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListTransactionsByBlockHashRIBSD2Vout.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListTransactionsByBlockHashRIBSD2Vout` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListTransactionsByBlockHashRIBSD2Vout.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `scriptPubKey`
      if (jsonObj.getAsJsonObject("scriptPubKey") != null) {
        ListTransactionsByBlockHashRIBSD2ScriptPubKey.validateJsonObject(jsonObj.getAsJsonObject("scriptPubKey"));
      }
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListTransactionsByBlockHashRIBSD2Vout.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListTransactionsByBlockHashRIBSD2Vout' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListTransactionsByBlockHashRIBSD2Vout> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListTransactionsByBlockHashRIBSD2Vout.class));

       return (TypeAdapter<T>) new TypeAdapter<ListTransactionsByBlockHashRIBSD2Vout>() {
           @Override
           public void write(JsonWriter out, ListTransactionsByBlockHashRIBSD2Vout value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListTransactionsByBlockHashRIBSD2Vout read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListTransactionsByBlockHashRIBSD2Vout given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListTransactionsByBlockHashRIBSD2Vout
  * @throws IOException if the JSON string is invalid with respect to ListTransactionsByBlockHashRIBSD2Vout
  */
  public static ListTransactionsByBlockHashRIBSD2Vout fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListTransactionsByBlockHashRIBSD2Vout.class);
  }

 /**
  * Convert an instance of ListTransactionsByBlockHashRIBSD2Vout to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

