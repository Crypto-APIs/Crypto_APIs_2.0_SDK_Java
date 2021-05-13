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
 * Defines the total fees included in the specific block.
 */
@ApiModel(description = "Defines the total fees included in the specific block.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:47:47.583665Z[Etc/UTC]")
public class GetXRPRippleBlockDetailsByBlockHeightRITotalFees {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;


  public GetXRPRippleBlockDetailsByBlockHeightRITotalFees amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the amount of all fees included in the specific block.
   * @return amount
  **/
  @ApiModelProperty(example = "0.004487", required = true, value = "Defines the amount of all fees included in the specific block.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public GetXRPRippleBlockDetailsByBlockHeightRITotalFees unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Defines the unit of all fees included in the specific block.
   * @return unit
  **/
  @ApiModelProperty(example = "XRP", required = true, value = "Defines the unit of all fees included in the specific block.")

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
    GetXRPRippleBlockDetailsByBlockHeightRITotalFees getXRPRippleBlockDetailsByBlockHeightRITotalFees = (GetXRPRippleBlockDetailsByBlockHeightRITotalFees) o;
    return Objects.equals(this.amount, getXRPRippleBlockDetailsByBlockHeightRITotalFees.amount) &&
        Objects.equals(this.unit, getXRPRippleBlockDetailsByBlockHeightRITotalFees.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXRPRippleBlockDetailsByBlockHeightRITotalFees {\n");
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
