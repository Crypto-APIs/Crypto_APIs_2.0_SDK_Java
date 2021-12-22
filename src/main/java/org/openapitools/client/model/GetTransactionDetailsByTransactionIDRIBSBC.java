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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSBCVin;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSBCVout;

/**
 * Bitcoin Cash
 */
@ApiModel(description = "Bitcoin Cash")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class GetTransactionDetailsByTransactionIDRIBSBC {
  public static final String SERIALIZED_NAME_LOCKTIME = "locktime";
  @SerializedName(SERIALIZED_NAME_LOCKTIME)
  private Integer locktime;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VIN = "vin";
  @SerializedName(SERIALIZED_NAME_VIN)
  private List<GetTransactionDetailsByTransactionIDRIBSBCVin> vin = new ArrayList<GetTransactionDetailsByTransactionIDRIBSBCVin>();

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private List<GetTransactionDetailsByTransactionIDRIBSBCVout> vout = new ArrayList<GetTransactionDetailsByTransactionIDRIBSBCVout>();

  public GetTransactionDetailsByTransactionIDRIBSBC() { 
  }

  public GetTransactionDetailsByTransactionIDRIBSBC locktime(Integer locktime) {
    
    this.locktime = locktime;
    return this;
  }

   /**
   * Represents the time at which a particular transaction can be added to the blockchain.
   * @return locktime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1781965", required = true, value = "Represents the time at which a particular transaction can be added to the blockchain.")

  public Integer getLocktime() {
    return locktime;
  }


  public void setLocktime(Integer locktime) {
    this.locktime = locktime;
  }


  public GetTransactionDetailsByTransactionIDRIBSBC size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of this transaction.
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "248", required = true, value = "Represents the total size of this transaction.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public GetTransactionDetailsByTransactionIDRIBSBC version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Represents transaction version number.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Represents transaction version number.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public GetTransactionDetailsByTransactionIDRIBSBC vin(List<GetTransactionDetailsByTransactionIDRIBSBCVin> vin) {
    
    this.vin = vin;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSBC addVinItem(GetTransactionDetailsByTransactionIDRIBSBCVin vinItem) {
    this.vin.add(vinItem);
    return this;
  }

   /**
   * Represents the transaction inputs.
   * @return vin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the transaction inputs.")

  public List<GetTransactionDetailsByTransactionIDRIBSBCVin> getVin() {
    return vin;
  }


  public void setVin(List<GetTransactionDetailsByTransactionIDRIBSBCVin> vin) {
    this.vin = vin;
  }


  public GetTransactionDetailsByTransactionIDRIBSBC vout(List<GetTransactionDetailsByTransactionIDRIBSBCVout> vout) {
    
    this.vout = vout;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSBC addVoutItem(GetTransactionDetailsByTransactionIDRIBSBCVout voutItem) {
    this.vout.add(voutItem);
    return this;
  }

   /**
   * Represents the transaction outputs.
   * @return vout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the transaction outputs.")

  public List<GetTransactionDetailsByTransactionIDRIBSBCVout> getVout() {
    return vout;
  }


  public void setVout(List<GetTransactionDetailsByTransactionIDRIBSBCVout> vout) {
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
    GetTransactionDetailsByTransactionIDRIBSBC getTransactionDetailsByTransactionIDRIBSBC = (GetTransactionDetailsByTransactionIDRIBSBC) o;
    return Objects.equals(this.locktime, getTransactionDetailsByTransactionIDRIBSBC.locktime) &&
        Objects.equals(this.size, getTransactionDetailsByTransactionIDRIBSBC.size) &&
        Objects.equals(this.version, getTransactionDetailsByTransactionIDRIBSBC.version) &&
        Objects.equals(this.vin, getTransactionDetailsByTransactionIDRIBSBC.vin) &&
        Objects.equals(this.vout, getTransactionDetailsByTransactionIDRIBSBC.vout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locktime, size, version, vin, vout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionDetailsByTransactionIDRIBSBC {\n");
    sb.append("    locktime: ").append(toIndentedString(locktime)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

