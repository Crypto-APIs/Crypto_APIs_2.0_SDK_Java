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
import org.openapitools.client.model.GetWalletTransactionDetailsByTransactionIDRIBSEGasPrice;

/**
 * Ethereum
 */
@ApiModel(description = "Ethereum")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class GetWalletTransactionDetailsByTransactionIDRIBSE {
  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private String contract;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gasLimit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private String gasLimit;

  public static final String SERIALIZED_NAME_GAS_PRICE = "gasPrice";
  @SerializedName(SERIALIZED_NAME_GAS_PRICE)
  private GetWalletTransactionDetailsByTransactionIDRIBSEGasPrice gasPrice;

  public static final String SERIALIZED_NAME_GAS_USED = "gasUsed";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private String gasUsed;

  public static final String SERIALIZED_NAME_INPUT_DATA = "inputData";
  @SerializedName(SERIALIZED_NAME_INPUT_DATA)
  private String inputData;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private Integer nonce;

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transactionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private String transactionStatus;

  public GetWalletTransactionDetailsByTransactionIDRIBSE() { 
  }

  public GetWalletTransactionDetailsByTransactionIDRIBSE contract(String contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Represents the specific transaction contract.
   * @return contract
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x20fe562d797a42dcb3399062ae9546cd06f63280", required = true, value = "Represents the specific transaction contract.")

  public String getContract() {
    return contract;
  }


  public void setContract(String contract) {
    this.contract = contract;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBSE gasLimit(String gasLimit) {
    
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


  public GetWalletTransactionDetailsByTransactionIDRIBSE gasPrice(GetWalletTransactionDetailsByTransactionIDRIBSEGasPrice gasPrice) {
    
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Get gasPrice
   * @return gasPrice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetWalletTransactionDetailsByTransactionIDRIBSEGasPrice getGasPrice() {
    return gasPrice;
  }


  public void setGasPrice(GetWalletTransactionDetailsByTransactionIDRIBSEGasPrice gasPrice) {
    this.gasPrice = gasPrice;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBSE gasUsed(String gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Represents the exact unit of gas that was used for the transaction.
   * @return gasUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "21000", required = true, value = "Represents the exact unit of gas that was used for the transaction.")

  public String getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBSE inputData(String inputData) {
    
    this.inputData = inputData;
    return this;
  }

   /**
   * Represents additional information that is required for the transaction.
   * @return inputData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x67a5cd0600000000000000000000000031f42841c2db5173425b5223809cf3a38fede360", required = true, value = "Represents additional information that is required for the transaction.")

  public String getInputData() {
    return inputData;
  }


  public void setInputData(String inputData) {
    this.inputData = inputData;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBSE nonce(Integer nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Represents the sequential running number for an address, starting from 0 for the first transaction. E.g., if the nonce of a transaction is 10, it would be the 11th transaction sent from the sender&#39;s address.
   * @return nonce
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "16", required = true, value = "Represents the sequential running number for an address, starting from 0 for the first transaction. E.g., if the nonce of a transaction is 10, it would be the 11th transaction sent from the sender's address.")

  public Integer getNonce() {
    return nonce;
  }


  public void setNonce(Integer nonce) {
    this.nonce = nonce;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBSE transactionStatus(String transactionStatus) {
    
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * String representation of the transaction status
   * @return transactionStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x1", required = true, value = "String representation of the transaction status")

  public String getTransactionStatus() {
    return transactionStatus;
  }


  public void setTransactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWalletTransactionDetailsByTransactionIDRIBSE getWalletTransactionDetailsByTransactionIDRIBSE = (GetWalletTransactionDetailsByTransactionIDRIBSE) o;
    return Objects.equals(this.contract, getWalletTransactionDetailsByTransactionIDRIBSE.contract) &&
        Objects.equals(this.gasLimit, getWalletTransactionDetailsByTransactionIDRIBSE.gasLimit) &&
        Objects.equals(this.gasPrice, getWalletTransactionDetailsByTransactionIDRIBSE.gasPrice) &&
        Objects.equals(this.gasUsed, getWalletTransactionDetailsByTransactionIDRIBSE.gasUsed) &&
        Objects.equals(this.inputData, getWalletTransactionDetailsByTransactionIDRIBSE.inputData) &&
        Objects.equals(this.nonce, getWalletTransactionDetailsByTransactionIDRIBSE.nonce) &&
        Objects.equals(this.transactionStatus, getWalletTransactionDetailsByTransactionIDRIBSE.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, gasLimit, gasPrice, gasUsed, inputData, nonce, transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWalletTransactionDetailsByTransactionIDRIBSE {\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    inputData: ").append(toIndentedString(inputData)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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

