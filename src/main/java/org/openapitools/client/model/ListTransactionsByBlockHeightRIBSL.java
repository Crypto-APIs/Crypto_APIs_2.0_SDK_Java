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
import org.openapitools.client.model.ListTransactionsByBlockHeightRIBSLVin;
import org.openapitools.client.model.ListTransactionsByBlockHeightRIBSLVout;

/**
 * Litecoin
 */
@ApiModel(description = "Litecoin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class ListTransactionsByBlockHeightRIBSL {
  public static final String SERIALIZED_NAME_LOCKTIME = "locktime";
  @SerializedName(SERIALIZED_NAME_LOCKTIME)
  private Integer locktime;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_V_SIZE = "vSize";
  @SerializedName(SERIALIZED_NAME_V_SIZE)
  private Integer vSize;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VIN = "vin";
  @SerializedName(SERIALIZED_NAME_VIN)
  private List<ListTransactionsByBlockHeightRIBSLVin> vin = new ArrayList<ListTransactionsByBlockHeightRIBSLVin>();

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private List<ListTransactionsByBlockHeightRIBSLVout> vout = new ArrayList<ListTransactionsByBlockHeightRIBSLVout>();

  public ListTransactionsByBlockHeightRIBSL() { 
  }

  public ListTransactionsByBlockHeightRIBSL locktime(Integer locktime) {
    
    this.locktime = locktime;
    return this;
  }

   /**
   * Represents the time at which a particular transaction can be added to the blockchain.
   * @return locktime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Represents the time at which a particular transaction can be added to the blockchain.")

  public Integer getLocktime() {
    return locktime;
  }


  public void setLocktime(Integer locktime) {
    this.locktime = locktime;
  }


  public ListTransactionsByBlockHeightRIBSL size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of this transaction.
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "223", required = true, value = "Represents the total size of this transaction.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public ListTransactionsByBlockHeightRIBSL vSize(Integer vSize) {
    
    this.vSize = vSize;
    return this;
  }

   /**
   * Represents the virtual size of this transaction.
   * @return vSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "141", required = true, value = "Represents the virtual size of this transaction.")

  public Integer getvSize() {
    return vSize;
  }


  public void setvSize(Integer vSize) {
    this.vSize = vSize;
  }


  public ListTransactionsByBlockHeightRIBSL version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Represents transaction version number.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Represents transaction version number.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public ListTransactionsByBlockHeightRIBSL vin(List<ListTransactionsByBlockHeightRIBSLVin> vin) {
    
    this.vin = vin;
    return this;
  }

  public ListTransactionsByBlockHeightRIBSL addVinItem(ListTransactionsByBlockHeightRIBSLVin vinItem) {
    this.vin.add(vinItem);
    return this;
  }

   /**
   * Represents the transaction inputs.
   * @return vin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the transaction inputs.")

  public List<ListTransactionsByBlockHeightRIBSLVin> getVin() {
    return vin;
  }


  public void setVin(List<ListTransactionsByBlockHeightRIBSLVin> vin) {
    this.vin = vin;
  }


  public ListTransactionsByBlockHeightRIBSL vout(List<ListTransactionsByBlockHeightRIBSLVout> vout) {
    
    this.vout = vout;
    return this;
  }

  public ListTransactionsByBlockHeightRIBSL addVoutItem(ListTransactionsByBlockHeightRIBSLVout voutItem) {
    this.vout.add(voutItem);
    return this;
  }

   /**
   * Represents the transaction outputs.
   * @return vout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the transaction outputs.")

  public List<ListTransactionsByBlockHeightRIBSLVout> getVout() {
    return vout;
  }


  public void setVout(List<ListTransactionsByBlockHeightRIBSLVout> vout) {
    this.vout = vout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTransactionsByBlockHeightRIBSL listTransactionsByBlockHeightRIBSL = (ListTransactionsByBlockHeightRIBSL) o;
    return Objects.equals(this.locktime, listTransactionsByBlockHeightRIBSL.locktime) &&
        Objects.equals(this.size, listTransactionsByBlockHeightRIBSL.size) &&
        Objects.equals(this.vSize, listTransactionsByBlockHeightRIBSL.vSize) &&
        Objects.equals(this.version, listTransactionsByBlockHeightRIBSL.version) &&
        Objects.equals(this.vin, listTransactionsByBlockHeightRIBSL.vin) &&
        Objects.equals(this.vout, listTransactionsByBlockHeightRIBSL.vout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locktime, size, vSize, version, vin, vout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsByBlockHeightRIBSL {\n");
    sb.append("    locktime: ").append(toIndentedString(locktime)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    vSize: ").append(toIndentedString(vSize)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    vout: ").append(toIndentedString(vout)).append("\n");
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

