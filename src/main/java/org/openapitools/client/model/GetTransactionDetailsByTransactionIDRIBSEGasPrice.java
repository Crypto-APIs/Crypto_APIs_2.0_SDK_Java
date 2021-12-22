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

/**
 * GetTransactionDetailsByTransactionIDRIBSEGasPrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class GetTransactionDetailsByTransactionIDRIBSEGasPrice {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public GetTransactionDetailsByTransactionIDRIBSEGasPrice() { 
  }

  public GetTransactionDetailsByTransactionIDRIBSEGasPrice amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Represents the price offered to the miner to purchase this amount of gas.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2994782927", required = true, value = "Represents the price offered to the miner to purchase this amount of gas.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public GetTransactionDetailsByTransactionIDRIBSEGasPrice unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Defines the unit of the gas price amount, e.g. BTC, ETH, XRP.
   * @return unit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "WEI", required = true, value = "Defines the unit of the gas price amount, e.g. BTC, ETH, XRP.")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionDetailsByTransactionIDRIBSEGasPrice getTransactionDetailsByTransactionIDRIBSEGasPrice = (GetTransactionDetailsByTransactionIDRIBSEGasPrice) o;
    return Objects.equals(this.amount, getTransactionDetailsByTransactionIDRIBSEGasPrice.amount) &&
        Objects.equals(this.unit, getTransactionDetailsByTransactionIDRIBSEGasPrice.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionDetailsByTransactionIDRIBSEGasPrice {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

}

