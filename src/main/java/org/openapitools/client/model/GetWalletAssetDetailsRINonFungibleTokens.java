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
 * GetWalletAssetDetailsRINonFungibleTokens
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class GetWalletAssetDetailsRINonFungibleTokens {
  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_TOKEN_ID = "tokenId";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public GetWalletAssetDetailsRINonFungibleTokens() { 
  }

  public GetWalletAssetDetailsRINonFungibleTokens identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Defines the specific token identifier. For Bitcoin-based transactions it should be the propertyId and for Ethereum-based transactions - the contract.
   * @return identifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x90ca8a3eb2574f937f514749ce619fdcca187d45", required = true, value = "Defines the specific token identifier. For Bitcoin-based transactions it should be the propertyId and for Ethereum-based transactions - the contract.")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public GetWalletAssetDetailsRINonFungibleTokens symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Defines the symbol of the non-fungible tokens.
   * @return symbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ENS", required = true, value = "Defines the symbol of the non-fungible tokens.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public GetWalletAssetDetailsRINonFungibleTokens tokenId(String tokenId) {
    
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Represents tokens&#39; unique identifier.
   * @return tokenId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x000000000000000000000000000000000000000000000000000000000000195b", required = true, value = "Represents tokens' unique identifier.")

  public String getTokenId() {
    return tokenId;
  }


  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public GetWalletAssetDetailsRINonFungibleTokens type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines the specific token type.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ERC-721", required = true, value = "Defines the specific token type.")

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
    GetWalletAssetDetailsRINonFungibleTokens getWalletAssetDetailsRINonFungibleTokens = (GetWalletAssetDetailsRINonFungibleTokens) o;
    return Objects.equals(this.identifier, getWalletAssetDetailsRINonFungibleTokens.identifier) &&
        Objects.equals(this.symbol, getWalletAssetDetailsRINonFungibleTokens.symbol) &&
        Objects.equals(this.tokenId, getWalletAssetDetailsRINonFungibleTokens.tokenId) &&
        Objects.equals(this.type, getWalletAssetDetailsRINonFungibleTokens.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, symbol, tokenId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWalletAssetDetailsRINonFungibleTokens {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
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
    openapiFields.add("identifier");
    openapiFields.add("symbol");
    openapiFields.add("tokenId");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("identifier");
    openapiRequiredFields.add("symbol");
    openapiRequiredFields.add("tokenId");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetWalletAssetDetailsRINonFungibleTokens
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetWalletAssetDetailsRINonFungibleTokens.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetWalletAssetDetailsRINonFungibleTokens is not found in the empty JSON string", GetWalletAssetDetailsRINonFungibleTokens.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetWalletAssetDetailsRINonFungibleTokens.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetWalletAssetDetailsRINonFungibleTokens` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetWalletAssetDetailsRINonFungibleTokens.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if (jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      if (jsonObj.get("tokenId") != null && !jsonObj.get("tokenId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenId").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetWalletAssetDetailsRINonFungibleTokens.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetWalletAssetDetailsRINonFungibleTokens' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetWalletAssetDetailsRINonFungibleTokens> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetWalletAssetDetailsRINonFungibleTokens.class));

       return (TypeAdapter<T>) new TypeAdapter<GetWalletAssetDetailsRINonFungibleTokens>() {
           @Override
           public void write(JsonWriter out, GetWalletAssetDetailsRINonFungibleTokens value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetWalletAssetDetailsRINonFungibleTokens read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetWalletAssetDetailsRINonFungibleTokens given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetWalletAssetDetailsRINonFungibleTokens
  * @throws IOException if the JSON string is invalid with respect to GetWalletAssetDetailsRINonFungibleTokens
  */
  public static GetWalletAssetDetailsRINonFungibleTokens fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetWalletAssetDetailsRINonFungibleTokens.class);
  }

 /**
  * Convert an instance of GetWalletAssetDetailsRINonFungibleTokens to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

