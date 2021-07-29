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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSLScriptSig;

/**
 * GetTransactionDetailsByTransactionIDRIBSLVin
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-29T09:33:59.822482Z[Etc/UTC]")
public class GetTransactionDetailsByTransactionIDRIBSLVin {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = new ArrayList<String>();

  public static final String SERIALIZED_NAME_COINBASE = "coinbase";
  @SerializedName(SERIALIZED_NAME_COINBASE)
  private String coinbase;

  public static final String SERIALIZED_NAME_SCRIPT_SIG = "scriptSig";
  @SerializedName(SERIALIZED_NAME_SCRIPT_SIG)
  private GetTransactionDetailsByTransactionIDRIBSLScriptSig scriptSig;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private String sequence;

  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public static final String SERIALIZED_NAME_TXINWITNESS = "txinwitness";
  @SerializedName(SERIALIZED_NAME_TXINWITNESS)
  private List<String> txinwitness = new ArrayList<String>();

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private Integer vout;


  public GetTransactionDetailsByTransactionIDRIBSLVin addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSLVin addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public GetTransactionDetailsByTransactionIDRIBSLVin coinbase(String coinbase) {
    
    this.coinbase = coinbase;
    return this;
  }

   /**
   * Represents the coinbase hex.
   * @return coinbase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the coinbase hex.")

  public String getCoinbase() {
    return coinbase;
  }


  public void setCoinbase(String coinbase) {
    this.coinbase = coinbase;
  }


  public GetTransactionDetailsByTransactionIDRIBSLVin scriptSig(GetTransactionDetailsByTransactionIDRIBSLScriptSig scriptSig) {
    
    this.scriptSig = scriptSig;
    return this;
  }

   /**
   * Get scriptSig
   * @return scriptSig
  **/
  @ApiModelProperty(required = true, value = "")

  public GetTransactionDetailsByTransactionIDRIBSLScriptSig getScriptSig() {
    return scriptSig;
  }


  public void setScriptSig(GetTransactionDetailsByTransactionIDRIBSLScriptSig scriptSig) {
    this.scriptSig = scriptSig;
  }


  public GetTransactionDetailsByTransactionIDRIBSLVin sequence(String sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * Represents the script sequence number.
   * @return sequence
  **/
  @ApiModelProperty(example = "4294967294", required = true, value = "Represents the script sequence number.")

  public String getSequence() {
    return sequence;
  }


  public void setSequence(String sequence) {
    this.sequence = sequence;
  }


  public GetTransactionDetailsByTransactionIDRIBSLVin txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * Represents the reference transaction identifier.
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1db56e1e8dfab84f6f0e33f8ddb160c9b16286471a3b486d79ea85bcf4d076b2", value = "Represents the reference transaction identifier.")

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public GetTransactionDetailsByTransactionIDRIBSLVin txinwitness(List<String> txinwitness) {
    
    this.txinwitness = txinwitness;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSLVin addTxinwitnessItem(String txinwitnessItem) {
    this.txinwitness.add(txinwitnessItem);
    return this;
  }

   /**
   * Get txinwitness
   * @return txinwitness
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getTxinwitness() {
    return txinwitness;
  }


  public void setTxinwitness(List<String> txinwitness) {
    this.txinwitness = txinwitness;
  }


  public GetTransactionDetailsByTransactionIDRIBSLVin value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Represents the sent/received amount.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0225", value = "Represents the sent/received amount.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public GetTransactionDetailsByTransactionIDRIBSLVin vout(Integer vout) {
    
    this.vout = vout;
    return this;
  }

   /**
   * It refers to the index of the output address of this transaction. The index starts from 0.
   * @return vout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "It refers to the index of the output address of this transaction. The index starts from 0.")

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
    GetTransactionDetailsByTransactionIDRIBSLVin getTransactionDetailsByTransactionIDRIBSLVin = (GetTransactionDetailsByTransactionIDRIBSLVin) o;
    return Objects.equals(this.addresses, getTransactionDetailsByTransactionIDRIBSLVin.addresses) &&
        Objects.equals(this.coinbase, getTransactionDetailsByTransactionIDRIBSLVin.coinbase) &&
        Objects.equals(this.scriptSig, getTransactionDetailsByTransactionIDRIBSLVin.scriptSig) &&
        Objects.equals(this.sequence, getTransactionDetailsByTransactionIDRIBSLVin.sequence) &&
        Objects.equals(this.txid, getTransactionDetailsByTransactionIDRIBSLVin.txid) &&
        Objects.equals(this.txinwitness, getTransactionDetailsByTransactionIDRIBSLVin.txinwitness) &&
        Objects.equals(this.value, getTransactionDetailsByTransactionIDRIBSLVin.value) &&
        Objects.equals(this.vout, getTransactionDetailsByTransactionIDRIBSLVin.vout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, coinbase, scriptSig, sequence, txid, txinwitness, value, vout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionDetailsByTransactionIDRIBSLVin {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    coinbase: ").append(toIndentedString(coinbase)).append("\n");
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

