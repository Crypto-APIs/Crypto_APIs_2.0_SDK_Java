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
import org.openapitools.client.model.ListAllUnconfirmedTransactionsRIBSBScriptSig;

/**
 * ListAllUnconfirmedTransactionsRIBSBVin
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class ListAllUnconfirmedTransactionsRIBSBVin {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = new ArrayList<String>();

  public static final String SERIALIZED_NAME_SCRIPT_SIG = "scriptSig";
  @SerializedName(SERIALIZED_NAME_SCRIPT_SIG)
  private ListAllUnconfirmedTransactionsRIBSBScriptSig scriptSig;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private String sequence;

  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public static final String SERIALIZED_NAME_TXINWITNESS = "txinwitness";
  @SerializedName(SERIALIZED_NAME_TXINWITNESS)
  private List<String> txinwitness = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private Integer vout;

  public ListAllUnconfirmedTransactionsRIBSBVin() { 
  }

  public ListAllUnconfirmedTransactionsRIBSBVin addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public ListAllUnconfirmedTransactionsRIBSBVin addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public ListAllUnconfirmedTransactionsRIBSBVin scriptSig(ListAllUnconfirmedTransactionsRIBSBScriptSig scriptSig) {
    
    this.scriptSig = scriptSig;
    return this;
  }

   /**
   * Get scriptSig
   * @return scriptSig
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListAllUnconfirmedTransactionsRIBSBScriptSig getScriptSig() {
    return scriptSig;
  }


  public void setScriptSig(ListAllUnconfirmedTransactionsRIBSBScriptSig scriptSig) {
    this.scriptSig = scriptSig;
  }


  public ListAllUnconfirmedTransactionsRIBSBVin sequence(String sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * Represents the script sequence number.
   * @return sequence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4294967295", required = true, value = "Represents the script sequence number.")

  public String getSequence() {
    return sequence;
  }


  public void setSequence(String sequence) {
    this.sequence = sequence;
  }


  public ListAllUnconfirmedTransactionsRIBSBVin txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * Represents the reference transaction identifier.
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aca730af131622fa0d765706e9e5263faee054b03a00b6e9b25f235462fb3043", value = "Represents the reference transaction identifier.")

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public ListAllUnconfirmedTransactionsRIBSBVin txinwitness(List<String> txinwitness) {
    
    this.txinwitness = txinwitness;
    return this;
  }

  public ListAllUnconfirmedTransactionsRIBSBVin addTxinwitnessItem(String txinwitnessItem) {
    if (this.txinwitness == null) {
      this.txinwitness = new ArrayList<String>();
    }
    this.txinwitness.add(txinwitnessItem);
    return this;
  }

   /**
   * Get txinwitness
   * @return txinwitness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTxinwitness() {
    return txinwitness;
  }


  public void setTxinwitness(List<String> txinwitness) {
    this.txinwitness = txinwitness;
  }


  public ListAllUnconfirmedTransactionsRIBSBVin value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Represents the sent/received amount.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.19163773", value = "Represents the sent/received amount.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public ListAllUnconfirmedTransactionsRIBSBVin vout(Integer vout) {
    
    this.vout = vout;
    return this;
  }

   /**
   * Defines the vout of the transaction output, i.e. which output to spend.
   * @return vout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Defines the vout of the transaction output, i.e. which output to spend.")

  public Integer getVout() {
    return vout;
  }


  public void setVout(Integer vout) {
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
    ListAllUnconfirmedTransactionsRIBSBVin listAllUnconfirmedTransactionsRIBSBVin = (ListAllUnconfirmedTransactionsRIBSBVin) o;
    return Objects.equals(this.addresses, listAllUnconfirmedTransactionsRIBSBVin.addresses) &&
        Objects.equals(this.scriptSig, listAllUnconfirmedTransactionsRIBSBVin.scriptSig) &&
        Objects.equals(this.sequence, listAllUnconfirmedTransactionsRIBSBVin.sequence) &&
        Objects.equals(this.txid, listAllUnconfirmedTransactionsRIBSBVin.txid) &&
        Objects.equals(this.txinwitness, listAllUnconfirmedTransactionsRIBSBVin.txinwitness) &&
        Objects.equals(this.value, listAllUnconfirmedTransactionsRIBSBVin.value) &&
        Objects.equals(this.vout, listAllUnconfirmedTransactionsRIBSBVin.vout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, scriptSig, sequence, txid, txinwitness, value, vout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAllUnconfirmedTransactionsRIBSBVin {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    scriptSig: ").append(toIndentedString(scriptSig)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    txinwitness: ").append(toIndentedString(txinwitness)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

