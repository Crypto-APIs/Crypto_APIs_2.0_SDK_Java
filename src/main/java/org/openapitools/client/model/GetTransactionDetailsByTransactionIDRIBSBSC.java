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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSBSCGasPrice;

/**
 * Binance Smart Chain
 */
@ApiModel(description = "Binance Smart Chain")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class GetTransactionDetailsByTransactionIDRIBSBSC {
  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private String contract;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gasLimit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private String gasLimit;

  public static final String SERIALIZED_NAME_GAS_PRICE = "gasPrice";
  @SerializedName(SERIALIZED_NAME_GAS_PRICE)
  private GetTransactionDetailsByTransactionIDRIBSBSCGasPrice gasPrice;

  public static final String SERIALIZED_NAME_GAS_USED = "gasUsed";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private String gasUsed;

  public static final String SERIALIZED_NAME_INPUT_DATA = "inputData";
  @SerializedName(SERIALIZED_NAME_INPUT_DATA)
  private String inputData;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private Integer nonce;

  public GetTransactionDetailsByTransactionIDRIBSBSC() { 
  }

  public GetTransactionDetailsByTransactionIDRIBSBSC contract(String contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Represents the specific transaction contract
   * @return contract
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x0000000000000000000000000000000000001000", required = true, value = "Represents the specific transaction contract")

  public String getContract() {
    return contract;
  }


  public void setContract(String contract) {
    this.contract = contract;
  }


  public GetTransactionDetailsByTransactionIDRIBSBSC gasLimit(String gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Represents the amount of gas used by this specific transaction alone.
   * @return gasLimit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "21000", required = true, value = "Represents the amount of gas used by this specific transaction alone.")

  public String getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  public GetTransactionDetailsByTransactionIDRIBSBSC gasPrice(GetTransactionDetailsByTransactionIDRIBSBSCGasPrice gasPrice) {
    
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Get gasPrice
   * @return gasPrice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetTransactionDetailsByTransactionIDRIBSBSCGasPrice getGasPrice() {
    return gasPrice;
  }


  public void setGasPrice(GetTransactionDetailsByTransactionIDRIBSBSCGasPrice gasPrice) {
    this.gasPrice = gasPrice;
  }


  public GetTransactionDetailsByTransactionIDRIBSBSC gasUsed(String gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Defines the unit of the gas price amount, e.g. BTC, ETH, XRP.
   * @return gasUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "21000", required = true, value = "Defines the unit of the gas price amount, e.g. BTC, ETH, XRP.")

  public String getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }


  public GetTransactionDetailsByTransactionIDRIBSBSC inputData(String inputData) {
    
    this.inputData = inputData;
    return this;
  }

   /**
   * Represents additional information that is required for the transaction.
   * @return inputData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x", required = true, value = "Represents additional information that is required for the transaction.")

  public String getInputData() {
    return inputData;
  }


  public void setInputData(String inputData) {
    this.inputData = inputData;
  }


  public GetTransactionDetailsByTransactionIDRIBSBSC nonce(Integer nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Represents the sequential running number for an address, starting from 0 for the first transaction. E.g., if the nonce of a transaction is 10, it would be the 11th transaction sent from the sender&#39;s address.
   * @return nonce
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "25341", required = true, value = "Represents the sequential running number for an address, starting from 0 for the first transaction. E.g., if the nonce of a transaction is 10, it would be the 11th transaction sent from the sender's address.")

  public Integer getNonce() {
    return nonce;
  }


  public void setNonce(Integer nonce) {
    this.nonce = nonce;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionDetailsByTransactionIDRIBSBSC getTransactionDetailsByTransactionIDRIBSBSC = (GetTransactionDetailsByTransactionIDRIBSBSC) o;
    return Objects.equals(this.contract, getTransactionDetailsByTransactionIDRIBSBSC.contract) &&
        Objects.equals(this.gasLimit, getTransactionDetailsByTransactionIDRIBSBSC.gasLimit) &&
        Objects.equals(this.gasPrice, getTransactionDetailsByTransactionIDRIBSBSC.gasPrice) &&
        Objects.equals(this.gasUsed, getTransactionDetailsByTransactionIDRIBSBSC.gasUsed) &&
        Objects.equals(this.inputData, getTransactionDetailsByTransactionIDRIBSBSC.inputData) &&
        Objects.equals(this.nonce, getTransactionDetailsByTransactionIDRIBSBSC.nonce);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, gasLimit, gasPrice, gasUsed, inputData, nonce);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionDetailsByTransactionIDRIBSBSC {\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    inputData: ").append(toIndentedString(inputData)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
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

