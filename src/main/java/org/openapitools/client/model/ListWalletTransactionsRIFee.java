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
 * ListWalletTransactionsRIFee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class ListWalletTransactionsRIFee {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CONVERTED_AMOUNT = "convertedAmount";
  @SerializedName(SERIALIZED_NAME_CONVERTED_AMOUNT)
  private String convertedAmount;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE_UNIT = "exchangeRateUnit";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE_UNIT)
  private String exchangeRateUnit;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public ListWalletTransactionsRIFee() { 
  }

  public ListWalletTransactionsRIFee amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the fee for the transaction.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.00003", required = true, value = "Defines the fee for the transaction.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ListWalletTransactionsRIFee convertedAmount(String convertedAmount) {
    
    this.convertedAmount = convertedAmount;
    return this;
  }

   /**
   * Defines the converted amount of the transaction&#39;s fee.
   * @return convertedAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1.50", required = true, value = "Defines the converted amount of the transaction's fee.")

  public String getConvertedAmount() {
    return convertedAmount;
  }


  public void setConvertedAmount(String convertedAmount) {
    this.convertedAmount = convertedAmount;
  }


  public ListWalletTransactionsRIFee exchangeRateUnit(String exchangeRateUnit) {
    
    this.exchangeRateUnit = exchangeRateUnit;
    return this;
  }

   /**
   * Defines the exchange rate for the transaction&#39;s unit.
   * @return exchangeRateUnit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USD", required = true, value = "Defines the exchange rate for the transaction's unit.")

  public String getExchangeRateUnit() {
    return exchangeRateUnit;
  }


  public void setExchangeRateUnit(String exchangeRateUnit) {
    this.exchangeRateUnit = exchangeRateUnit;
  }


  public ListWalletTransactionsRIFee symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Defines the unit of the transaction&#39;s fee.
   * @return symbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ETH", required = true, value = "Defines the unit of the transaction's fee.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListWalletTransactionsRIFee listWalletTransactionsRIFee = (ListWalletTransactionsRIFee) o;
    return Objects.equals(this.amount, listWalletTransactionsRIFee.amount) &&
        Objects.equals(this.convertedAmount, listWalletTransactionsRIFee.convertedAmount) &&
        Objects.equals(this.exchangeRateUnit, listWalletTransactionsRIFee.exchangeRateUnit) &&
        Objects.equals(this.symbol, listWalletTransactionsRIFee.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, convertedAmount, exchangeRateUnit, symbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListWalletTransactionsRIFee {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    convertedAmount: ").append(toIndentedString(convertedAmount)).append("\n");
    sb.append("    exchangeRateUnit: ").append(toIndentedString(exchangeRateUnit)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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
    openapiFields.add("convertedAmount");
    openapiFields.add("exchangeRateUnit");
    openapiFields.add("symbol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("convertedAmount");
    openapiRequiredFields.add("exchangeRateUnit");
    openapiRequiredFields.add("symbol");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListWalletTransactionsRIFee
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListWalletTransactionsRIFee.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListWalletTransactionsRIFee is not found in the empty JSON string", ListWalletTransactionsRIFee.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListWalletTransactionsRIFee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListWalletTransactionsRIFee` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListWalletTransactionsRIFee.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("convertedAmount") != null && !jsonObj.get("convertedAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `convertedAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("convertedAmount").toString()));
      }
      if (jsonObj.get("exchangeRateUnit") != null && !jsonObj.get("exchangeRateUnit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exchangeRateUnit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exchangeRateUnit").toString()));
      }
      if (jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListWalletTransactionsRIFee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListWalletTransactionsRIFee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListWalletTransactionsRIFee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListWalletTransactionsRIFee.class));

       return (TypeAdapter<T>) new TypeAdapter<ListWalletTransactionsRIFee>() {
           @Override
           public void write(JsonWriter out, ListWalletTransactionsRIFee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListWalletTransactionsRIFee read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListWalletTransactionsRIFee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListWalletTransactionsRIFee
  * @throws IOException if the JSON string is invalid with respect to ListWalletTransactionsRIFee
  */
  public static ListWalletTransactionsRIFee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListWalletTransactionsRIFee.class);
  }

 /**
  * Convert an instance of ListWalletTransactionsRIFee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

