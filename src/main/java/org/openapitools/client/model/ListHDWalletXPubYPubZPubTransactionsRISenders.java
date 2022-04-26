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
 * ListHDWalletXPubYPubZPubTransactionsRISenders
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class ListHDWalletXPubYPubZPubTransactionsRISenders {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_IS_MEMBER = "isMember";
  @SerializedName(SERIALIZED_NAME_IS_MEMBER)
  private Boolean isMember;

  public ListHDWalletXPubYPubZPubTransactionsRISenders() { 
  }

  public ListHDWalletXPubYPubZPubTransactionsRISenders address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Represents the address which sends this transaction. In UTXO-based protocols like Bitcoin there could be several senders while in account-based protocols like Ethereum there is always only one sender.
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2N5PcdirZUzKF9bWuGdugNuzcQrCbBudxv1", required = true, value = "Represents the address which sends this transaction. In UTXO-based protocols like Bitcoin there could be several senders while in account-based protocols like Ethereum there is always only one sender.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ListHDWalletXPubYPubZPubTransactionsRISenders amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Represents the amount sent by this address.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.00873472", required = true, value = "Represents the amount sent by this address.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ListHDWalletXPubYPubZPubTransactionsRISenders isMember(Boolean isMember) {
    
    this.isMember = isMember;
    return this;
  }

   /**
   * Defines whether an address is a child address derived from the HD wallet (xPub, yPub, zPub) as boolean.
   * @return isMember
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Defines whether an address is a child address derived from the HD wallet (xPub, yPub, zPub) as boolean.")

  public Boolean getIsMember() {
    return isMember;
  }


  public void setIsMember(Boolean isMember) {
    this.isMember = isMember;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListHDWalletXPubYPubZPubTransactionsRISenders listHDWalletXPubYPubZPubTransactionsRISenders = (ListHDWalletXPubYPubZPubTransactionsRISenders) o;
    return Objects.equals(this.address, listHDWalletXPubYPubZPubTransactionsRISenders.address) &&
        Objects.equals(this.amount, listHDWalletXPubYPubZPubTransactionsRISenders.amount) &&
        Objects.equals(this.isMember, listHDWalletXPubYPubZPubTransactionsRISenders.isMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, amount, isMember);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListHDWalletXPubYPubZPubTransactionsRISenders {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("amount");
    openapiFields.add("isMember");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("isMember");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListHDWalletXPubYPubZPubTransactionsRISenders
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListHDWalletXPubYPubZPubTransactionsRISenders.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListHDWalletXPubYPubZPubTransactionsRISenders is not found in the empty JSON string", ListHDWalletXPubYPubZPubTransactionsRISenders.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListHDWalletXPubYPubZPubTransactionsRISenders.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListHDWalletXPubYPubZPubTransactionsRISenders` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListHDWalletXPubYPubZPubTransactionsRISenders.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListHDWalletXPubYPubZPubTransactionsRISenders.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListHDWalletXPubYPubZPubTransactionsRISenders' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListHDWalletXPubYPubZPubTransactionsRISenders> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListHDWalletXPubYPubZPubTransactionsRISenders.class));

       return (TypeAdapter<T>) new TypeAdapter<ListHDWalletXPubYPubZPubTransactionsRISenders>() {
           @Override
           public void write(JsonWriter out, ListHDWalletXPubYPubZPubTransactionsRISenders value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListHDWalletXPubYPubZPubTransactionsRISenders read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListHDWalletXPubYPubZPubTransactionsRISenders given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListHDWalletXPubYPubZPubTransactionsRISenders
  * @throws IOException if the JSON string is invalid with respect to ListHDWalletXPubYPubZPubTransactionsRISenders
  */
  public static ListHDWalletXPubYPubZPubTransactionsRISenders fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListHDWalletXPubYPubZPubTransactionsRISenders.class);
  }

 /**
  * Convert an instance of ListHDWalletXPubYPubZPubTransactionsRISenders to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

