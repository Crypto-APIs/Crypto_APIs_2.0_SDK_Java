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
 * Object representation of the script
 */
@ApiModel(description = "Object representation of the script")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig {
  public static final String SERIALIZED_NAME_ASM = "asm";
  @SerializedName(SERIALIZED_NAME_ASM)
  private String asm;

  public static final String SERIALIZED_NAME_HEX = "hex";
  @SerializedName(SERIALIZED_NAME_HEX)
  private String hex;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig() { 
  }

  public GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig asm(String asm) {
    
    this.asm = asm;
    return this;
  }

   /**
   * The asm strands for assembly, which is the symbolic representation of the Bitcoin&#39;s Script language op-codes.
   * @return asm
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "00148b3ed2c15710b61a43cb354a7e637dc6bbd448ce", required = true, value = "The asm strands for assembly, which is the symbolic representation of the Bitcoin's Script language op-codes.")

  public String getAsm() {
    return asm;
  }


  public void setAsm(String asm) {
    this.asm = asm;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig hex(String hex) {
    
    this.hex = hex;
    return this;
  }

   /**
   * Represents the hex of the public key of the address.
   * @return hex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1600148b3ed2c15710b61a43cb354a7e637dc6bbd448ce", required = true, value = "Represents the hex of the public key of the address.")

  public String getHex() {
    return hex;
  }


  public void setHex(String hex) {
    this.hex = hex;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Represents the script type of the reference transaction identifier.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "scripthash", required = true, value = "Represents the script type of the reference transaction identifier.")

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
    GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig getWalletTransactionDetailsByTransactionIDRIBSBScriptSig = (GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig) o;
    return Objects.equals(this.asm, getWalletTransactionDetailsByTransactionIDRIBSBScriptSig.asm) &&
        Objects.equals(this.hex, getWalletTransactionDetailsByTransactionIDRIBSBScriptSig.hex) &&
        Objects.equals(this.type, getWalletTransactionDetailsByTransactionIDRIBSBScriptSig.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asm, hex, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig {\n");
    sb.append("    asm: ").append(toIndentedString(asm)).append("\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
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
    openapiFields.add("asm");
    openapiFields.add("hex");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("asm");
    openapiRequiredFields.add("hex");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig is not found in the empty JSON string", GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
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
       if (!GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig.class));

       return (TypeAdapter<T>) new TypeAdapter<GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig>() {
           @Override
           public void write(JsonWriter out, GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig
  * @throws IOException if the JSON string is invalid with respect to GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig
  */
  public static GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig.class);
  }

 /**
  * Convert an instance of GetWalletTransactionDetailsByTransactionIDRIBSBScriptSig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

