/*
 * Crypto APIs
 * Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: bizdev@cryptoapis.io
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
 * Specifies the latest price of the asset.
 */
@ApiModel(description = "Specifies the latest price of the asset.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T16:59:17.199745Z[Etc/UTC]")
public class ListAssetsDetailsResponseItemLatestRate {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CALCULATION_TIMESTAMP = "calculationTimestamp";
  @SerializedName(SERIALIZED_NAME_CALCULATION_TIMESTAMP)
  private Integer calculationTimestamp;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;


  public ListAssetsDetailsResponseItemLatestRate amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Specifies the amount of the latest price of the asset.
   * @return amount
  **/
  @ApiModelProperty(example = "55249.960371879235", required = true, value = "Specifies the amount of the latest price of the asset.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ListAssetsDetailsResponseItemLatestRate calculationTimestamp(Integer calculationTimestamp) {
    
    this.calculationTimestamp = calculationTimestamp;
    return this;
  }

   /**
   * Defines when the price was calculated in UNIX timestamp.
   * @return calculationTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1618843796", value = "Defines when the price was calculated in UNIX timestamp.")

  public Integer getCalculationTimestamp() {
    return calculationTimestamp;
  }


  public void setCalculationTimestamp(Integer calculationTimestamp) {
    this.calculationTimestamp = calculationTimestamp;
  }


  public ListAssetsDetailsResponseItemLatestRate unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Specifies the unit of the latest price of the asset.
   * @return unit
  **/
  @ApiModelProperty(example = "USD", required = true, value = "Specifies the unit of the latest price of the asset.")

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
    ListAssetsDetailsResponseItemLatestRate listAssetsDetailsResponseItemLatestRate = (ListAssetsDetailsResponseItemLatestRate) o;
    return Objects.equals(this.amount, listAssetsDetailsResponseItemLatestRate.amount) &&
        Objects.equals(this.calculationTimestamp, listAssetsDetailsResponseItemLatestRate.calculationTimestamp) &&
        Objects.equals(this.unit, listAssetsDetailsResponseItemLatestRate.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, calculationTimestamp, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAssetsDetailsResponseItemLatestRate {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    calculationTimestamp: ").append(toIndentedString(calculationTimestamp)).append("\n");
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

