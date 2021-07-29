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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSBSCGasPrice;
import org.openapitools.client.model.ListTransactionsByAddressRIBSB;
import org.openapitools.client.model.ListTransactionsByAddressRIBSBC;
import org.openapitools.client.model.ListTransactionsByAddressRIBSBSC;
import org.openapitools.client.model.ListTransactionsByAddressRIBSD;
import org.openapitools.client.model.ListTransactionsByAddressRIBSD2;
import org.openapitools.client.model.ListTransactionsByAddressRIBSD2Vin;
import org.openapitools.client.model.ListTransactionsByAddressRIBSD2Vout;
import org.openapitools.client.model.ListTransactionsByAddressRIBSE;
import org.openapitools.client.model.ListTransactionsByAddressRIBSEC;
import org.openapitools.client.model.ListTransactionsByAddressRIBSL;

/**
 * ListTransactionsByAddressRIBS
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-29T09:33:59.822482Z[Etc/UTC]")
public class ListTransactionsByAddressRIBS {
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
  private List<ListTransactionsByAddressRIBSD2Vin> vin = new ArrayList<ListTransactionsByAddressRIBSD2Vin>();

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private List<ListTransactionsByAddressRIBSD2Vout> vout = new ArrayList<ListTransactionsByAddressRIBSD2Vout>();

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

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transactionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private String transactionStatus;


  public ListTransactionsByAddressRIBS locktime(Integer locktime) {
    
    this.locktime = locktime;
    return this;
  }

   /**
   * Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid.
   * @return locktime
  **/
  @ApiModelProperty(example = "0", required = true, value = "Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid.")

  public Integer getLocktime() {
    return locktime;
  }


  public void setLocktime(Integer locktime) {
    this.locktime = locktime;
  }


  public ListTransactionsByAddressRIBS size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of this transaction.
   * @return size
  **/
  @ApiModelProperty(example = "196", required = true, value = "Represents the total size of this transaction.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public ListTransactionsByAddressRIBS vSize(Integer vSize) {
    
    this.vSize = vSize;
    return this;
  }

   /**
   * Represents the virtual size of this transaction.
   * @return vSize
  **/
  @ApiModelProperty(example = "141", required = true, value = "Represents the virtual size of this transaction.")

  public Integer getvSize() {
    return vSize;
  }


  public void setvSize(Integer vSize) {
    this.vSize = vSize;
  }


  public ListTransactionsByAddressRIBS version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Represents the transaction&#39;s version number.
   * @return version
  **/
  @ApiModelProperty(example = "3", required = true, value = "Represents the transaction's version number.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public ListTransactionsByAddressRIBS vin(List<ListTransactionsByAddressRIBSD2Vin> vin) {
    
    this.vin = vin;
    return this;
  }

  public ListTransactionsByAddressRIBS addVinItem(ListTransactionsByAddressRIBSD2Vin vinItem) {
    this.vin.add(vinItem);
    return this;
  }

   /**
   * Represents the transaction inputs.
   * @return vin
  **/
  @ApiModelProperty(required = true, value = "Represents the transaction inputs.")

  public List<ListTransactionsByAddressRIBSD2Vin> getVin() {
    return vin;
  }


  public void setVin(List<ListTransactionsByAddressRIBSD2Vin> vin) {
    this.vin = vin;
  }


  public ListTransactionsByAddressRIBS vout(List<ListTransactionsByAddressRIBSD2Vout> vout) {
    
    this.vout = vout;
    return this;
  }

  public ListTransactionsByAddressRIBS addVoutItem(ListTransactionsByAddressRIBSD2Vout voutItem) {
    this.vout.add(voutItem);
    return this;
  }

   /**
   * Represents the transaction outputs.
   * @return vout
  **/
  @ApiModelProperty(required = true, value = "Represents the transaction outputs.")

  public List<ListTransactionsByAddressRIBSD2Vout> getVout() {
    return vout;
  }


  public void setVout(List<ListTransactionsByAddressRIBSD2Vout> vout) {
    this.vout = vout;
  }


  public ListTransactionsByAddressRIBS contract(String contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Numeric representation of the transaction contract
   * @return contract
  **/
  @ApiModelProperty(required = true, value = "Numeric representation of the transaction contract")

  public String getContract() {
    return contract;
  }


  public void setContract(String contract) {
    this.contract = contract;
  }


  public ListTransactionsByAddressRIBS gasLimit(String gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * String representation of the transaction gas
   * @return gasLimit
  **/
  @ApiModelProperty(required = true, value = "String representation of the transaction gas")

  public String getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  public ListTransactionsByAddressRIBS gasPrice(GetTransactionDetailsByTransactionIDRIBSBSCGasPrice gasPrice) {
    
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Get gasPrice
   * @return gasPrice
  **/
  @ApiModelProperty(required = true, value = "")

  public GetTransactionDetailsByTransactionIDRIBSBSCGasPrice getGasPrice() {
    return gasPrice;
  }


  public void setGasPrice(GetTransactionDetailsByTransactionIDRIBSBSCGasPrice gasPrice) {
    this.gasPrice = gasPrice;
  }


  public ListTransactionsByAddressRIBS gasUsed(String gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Numeric representation of the transaction gas used
   * @return gasUsed
  **/
  @ApiModelProperty(required = true, value = "Numeric representation of the transaction gas used")

  public String getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }


  public ListTransactionsByAddressRIBS inputData(String inputData) {
    
    this.inputData = inputData;
    return this;
  }

   /**
   * Numeric representation of the transaction input
   * @return inputData
  **/
  @ApiModelProperty(required = true, value = "Numeric representation of the transaction input")

  public String getInputData() {
    return inputData;
  }


  public void setInputData(String inputData) {
    this.inputData = inputData;
  }


  public ListTransactionsByAddressRIBS nonce(Integer nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Numeric representation of the transaction nonce
   * @return nonce
  **/
  @ApiModelProperty(required = true, value = "Numeric representation of the transaction nonce")

  public Integer getNonce() {
    return nonce;
  }


  public void setNonce(Integer nonce) {
    this.nonce = nonce;
  }


  public ListTransactionsByAddressRIBS transactionStatus(String transactionStatus) {
    
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * String representation of the transaction status
   * @return transactionStatus
  **/
  @ApiModelProperty(required = true, value = "String representation of the transaction status")

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
    ListTransactionsByAddressRIBS listTransactionsByAddressRIBS = (ListTransactionsByAddressRIBS) o;
    return Objects.equals(this.locktime, listTransactionsByAddressRIBS.locktime) &&
        Objects.equals(this.size, listTransactionsByAddressRIBS.size) &&
        Objects.equals(this.vSize, listTransactionsByAddressRIBS.vSize) &&
        Objects.equals(this.version, listTransactionsByAddressRIBS.version) &&
        Objects.equals(this.vin, listTransactionsByAddressRIBS.vin) &&
        Objects.equals(this.vout, listTransactionsByAddressRIBS.vout) &&
        Objects.equals(this.contract, listTransactionsByAddressRIBS.contract) &&
        Objects.equals(this.gasLimit, listTransactionsByAddressRIBS.gasLimit) &&
        Objects.equals(this.gasPrice, listTransactionsByAddressRIBS.gasPrice) &&
        Objects.equals(this.gasUsed, listTransactionsByAddressRIBS.gasUsed) &&
        Objects.equals(this.inputData, listTransactionsByAddressRIBS.inputData) &&
        Objects.equals(this.nonce, listTransactionsByAddressRIBS.nonce) &&
        Objects.equals(this.transactionStatus, listTransactionsByAddressRIBS.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locktime, size, vSize, version, vin, vout, contract, gasLimit, gasPrice, gasUsed, inputData, nonce, transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsByAddressRIBS {\n");
    sb.append("    locktime: ").append(toIndentedString(locktime)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    vSize: ").append(toIndentedString(vSize)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    vout: ").append(toIndentedString(vout)).append("\n");
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

