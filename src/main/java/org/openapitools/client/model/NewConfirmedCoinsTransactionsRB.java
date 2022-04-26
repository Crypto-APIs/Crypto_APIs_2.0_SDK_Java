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
import org.openapitools.client.model.NewConfirmedCoinsTransactionsRBData;

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
 * NewConfirmedCoinsTransactionsRB
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class NewConfirmedCoinsTransactionsRB {
  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private String context;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private NewConfirmedCoinsTransactionsRBData data;

  public NewConfirmedCoinsTransactionsRB() { 
  }

  public NewConfirmedCoinsTransactionsRB context(String context) {
    
    this.context = context;
    return this;
  }

   /**
   * In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user.
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yourExampleString", value = "In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.")

  public String getContext() {
    return context;
  }


  public void setContext(String context) {
    this.context = context;
  }


  public NewConfirmedCoinsTransactionsRB data(NewConfirmedCoinsTransactionsRBData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NewConfirmedCoinsTransactionsRBData getData() {
    return data;
  }


  public void setData(NewConfirmedCoinsTransactionsRBData data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewConfirmedCoinsTransactionsRB newConfirmedCoinsTransactionsRB = (NewConfirmedCoinsTransactionsRB) o;
    return Objects.equals(this.context, newConfirmedCoinsTransactionsRB.context) &&
        Objects.equals(this.data, newConfirmedCoinsTransactionsRB.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewConfirmedCoinsTransactionsRB {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("context");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NewConfirmedCoinsTransactionsRB
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NewConfirmedCoinsTransactionsRB.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NewConfirmedCoinsTransactionsRB is not found in the empty JSON string", NewConfirmedCoinsTransactionsRB.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NewConfirmedCoinsTransactionsRB.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NewConfirmedCoinsTransactionsRB` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NewConfirmedCoinsTransactionsRB.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("context") != null && !jsonObj.get("context").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `context` to be a primitive type in the JSON string but got `%s`", jsonObj.get("context").toString()));
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        NewConfirmedCoinsTransactionsRBData.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NewConfirmedCoinsTransactionsRB.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NewConfirmedCoinsTransactionsRB' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NewConfirmedCoinsTransactionsRB> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NewConfirmedCoinsTransactionsRB.class));

       return (TypeAdapter<T>) new TypeAdapter<NewConfirmedCoinsTransactionsRB>() {
           @Override
           public void write(JsonWriter out, NewConfirmedCoinsTransactionsRB value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NewConfirmedCoinsTransactionsRB read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NewConfirmedCoinsTransactionsRB given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NewConfirmedCoinsTransactionsRB
  * @throws IOException if the JSON string is invalid with respect to NewConfirmedCoinsTransactionsRB
  */
  public static NewConfirmedCoinsTransactionsRB fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewConfirmedCoinsTransactionsRB.class);
  }

 /**
  * Convert an instance of NewConfirmedCoinsTransactionsRB to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

