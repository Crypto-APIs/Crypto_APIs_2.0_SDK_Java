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
 * Represents the script public key.
 */
@ApiModel(description = "Represents the script public key.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class ListTransactionsByBlockHeightRIBSDScriptPubKey {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_ASM = "asm";
  @SerializedName(SERIALIZED_NAME_ASM)
  private String asm;

  public static final String SERIALIZED_NAME_HEX = "hex";
  @SerializedName(SERIALIZED_NAME_HEX)
  private String hex;

  public static final String SERIALIZED_NAME_REQ_SIGS = "reqSigs";
  @SerializedName(SERIALIZED_NAME_REQ_SIGS)
  private Integer reqSigs;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ListTransactionsByBlockHeightRIBSDScriptPubKey() { 
  }

  public ListTransactionsByBlockHeightRIBSDScriptPubKey addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public ListTransactionsByBlockHeightRIBSDScriptPubKey addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public ListTransactionsByBlockHeightRIBSDScriptPubKey asm(String asm) {
    
    this.asm = asm;
    return this;
  }

   /**
   * Represents the assembly of the script public key of the address.
   * @return asm
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the assembly of the script public key of the address.")

  public String getAsm() {
    return asm;
  }


  public void setAsm(String asm) {
    this.asm = asm;
  }


  public ListTransactionsByBlockHeightRIBSDScriptPubKey hex(String hex) {
    
    this.hex = hex;
    return this;
  }

   /**
   * Represents the hex of the script public key of the address.
   * @return hex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the hex of the script public key of the address.")

  public String getHex() {
    return hex;
  }


  public void setHex(String hex) {
    this.hex = hex;
  }


  public ListTransactionsByBlockHeightRIBSDScriptPubKey reqSigs(Integer reqSigs) {
    
    this.reqSigs = reqSigs;
    return this;
  }

   /**
   * Represents the required signatures.
   * @return reqSigs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Represents the required signatures.")

  public Integer getReqSigs() {
    return reqSigs;
  }


  public void setReqSigs(Integer reqSigs) {
    this.reqSigs = reqSigs;
  }


  public ListTransactionsByBlockHeightRIBSDScriptPubKey type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Represents the script type.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "scripthash", required = true, value = "Represents the script type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTransactionsByBlockHeightRIBSDScriptPubKey listTransactionsByBlockHeightRIBSDScriptPubKey = (ListTransactionsByBlockHeightRIBSDScriptPubKey) o;
    return Objects.equals(this.addresses, listTransactionsByBlockHeightRIBSDScriptPubKey.addresses) &&
        Objects.equals(this.asm, listTransactionsByBlockHeightRIBSDScriptPubKey.asm) &&
        Objects.equals(this.hex, listTransactionsByBlockHeightRIBSDScriptPubKey.hex) &&
        Objects.equals(this.reqSigs, listTransactionsByBlockHeightRIBSDScriptPubKey.reqSigs) &&
        Objects.equals(this.type, listTransactionsByBlockHeightRIBSDScriptPubKey.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, asm, hex, reqSigs, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsByBlockHeightRIBSDScriptPubKey {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    asm: ").append(toIndentedString(asm)).append("\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
    sb.append("    reqSigs: ").append(toIndentedString(reqSigs)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("addresses");
    openapiFields.add("asm");
    openapiFields.add("hex");
    openapiFields.add("reqSigs");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("addresses");
    openapiRequiredFields.add("asm");
    openapiRequiredFields.add("hex");
    openapiRequiredFields.add("reqSigs");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListTransactionsByBlockHeightRIBSDScriptPubKey
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListTransactionsByBlockHeightRIBSDScriptPubKey.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListTransactionsByBlockHeightRIBSDScriptPubKey is not found in the empty JSON string", ListTransactionsByBlockHeightRIBSDScriptPubKey.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListTransactionsByBlockHeightRIBSDScriptPubKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListTransactionsByBlockHeightRIBSDScriptPubKey` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListTransactionsByBlockHeightRIBSDScriptPubKey.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }
      if (jsonObj.get("asm") != null && !jsonObj.get("asm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asm").toString()));
      }
      if (jsonObj.get("hex") != null && !jsonObj.get("hex").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hex` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hex").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListTransactionsByBlockHeightRIBSDScriptPubKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListTransactionsByBlockHeightRIBSDScriptPubKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListTransactionsByBlockHeightRIBSDScriptPubKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListTransactionsByBlockHeightRIBSDScriptPubKey.class));

       return (TypeAdapter<T>) new TypeAdapter<ListTransactionsByBlockHeightRIBSDScriptPubKey>() {
           @Override
           public void write(JsonWriter out, ListTransactionsByBlockHeightRIBSDScriptPubKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListTransactionsByBlockHeightRIBSDScriptPubKey read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListTransactionsByBlockHeightRIBSDScriptPubKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListTransactionsByBlockHeightRIBSDScriptPubKey
  * @throws IOException if the JSON string is invalid with respect to ListTransactionsByBlockHeightRIBSDScriptPubKey
  */
  public static ListTransactionsByBlockHeightRIBSDScriptPubKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListTransactionsByBlockHeightRIBSDScriptPubKey.class);
  }

 /**
  * Convert an instance of ListTransactionsByBlockHeightRIBSDScriptPubKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

