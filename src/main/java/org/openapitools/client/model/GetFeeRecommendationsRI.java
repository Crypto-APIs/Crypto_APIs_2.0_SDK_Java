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
 * GetFeeRecommendationsRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class GetFeeRecommendationsRI {
  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_FAST = "fast";
  @SerializedName(SERIALIZED_NAME_FAST)
  private String fast;

  public static final String SERIALIZED_NAME_SLOW = "slow";
  @SerializedName(SERIALIZED_NAME_SLOW)
  private String slow;

  public static final String SERIALIZED_NAME_STANDARD = "standard";
  @SerializedName(SERIALIZED_NAME_STANDARD)
  private String standard;

  public GetFeeRecommendationsRI() { 
  }

  public GetFeeRecommendationsRI unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Defines the unit of the fee, e.g. BTC.
   * @return unit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "Defines the unit of the fee, e.g. BTC.")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  public GetFeeRecommendationsRI fast(String fast) {
    
    this.fast = fast;
    return this;
  }

   /**
   * Fast fee per byte calculated from unconfirmed transactions
   * @return fast
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.00000021", required = true, value = "Fast fee per byte calculated from unconfirmed transactions")

  public String getFast() {
    return fast;
  }


  public void setFast(String fast) {
    this.fast = fast;
  }


  public GetFeeRecommendationsRI slow(String slow) {
    
    this.slow = slow;
    return this;
  }

   /**
   * Slow fee per byte calculated from unconfirmed transactions
   * @return slow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.00000021", required = true, value = "Slow fee per byte calculated from unconfirmed transactions")

  public String getSlow() {
    return slow;
  }


  public void setSlow(String slow) {
    this.slow = slow;
  }


  public GetFeeRecommendationsRI standard(String standard) {
    
    this.standard = standard;
    return this;
  }

   /**
   * Standard fee per byte calculated from unconfirmed transactions
   * @return standard
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.00000021", required = true, value = "Standard fee per byte calculated from unconfirmed transactions")

  public String getStandard() {
    return standard;
  }


  public void setStandard(String standard) {
    this.standard = standard;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFeeRecommendationsRI getFeeRecommendationsRI = (GetFeeRecommendationsRI) o;
    return Objects.equals(this.unit, getFeeRecommendationsRI.unit) &&
        Objects.equals(this.fast, getFeeRecommendationsRI.fast) &&
        Objects.equals(this.slow, getFeeRecommendationsRI.slow) &&
        Objects.equals(this.standard, getFeeRecommendationsRI.standard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, fast, slow, standard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFeeRecommendationsRI {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    fast: ").append(toIndentedString(fast)).append("\n");
    sb.append("    slow: ").append(toIndentedString(slow)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
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

