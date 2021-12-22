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
 * Defines an &#x60;item&#x60; as one result.
 */
@ApiModel(description = "Defines an `item` as one result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class TokensForwardingFailDataItem {
  public static final String SERIALIZED_NAME_BLOCKCHAIN = "blockchain";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN)
  private String blockchain;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_FROM_ADDRESS = "fromAddress";
  @SerializedName(SERIALIZED_NAME_FROM_ADDRESS)
  private String fromAddress;

  public static final String SERIALIZED_NAME_TO_ADDRESS = "toAddress";
  @SerializedName(SERIALIZED_NAME_TO_ADDRESS)
  private String toAddress;

  public static final String SERIALIZED_NAME_TRIGGER_TRANSACTION_ID = "triggerTransactionId";
  @SerializedName(SERIALIZED_NAME_TRIGGER_TRANSACTION_ID)
  private String triggerTransactionId;

  /**
   * Represents the error code received for the failed token forwarding.
   */
  @JsonAdapter(ErrorCodeEnum.Adapter.class)
  public enum ErrorCodeEnum {
    NOT_ENOUGH_CREDITS("NOT_ENOUGH_CREDITS"),
    
    FEE_ADDRESS_OUT_OF_FUNDS("FEE_ADDRESS_OUT_OF_FUNDS"),
    
    WRONG_ADDRESS_CREDENTIALS("WRONG_ADDRESS_CREDENTIALS");

    private String value;

    ErrorCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorCodeEnum fromValue(String value) {
      for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ErrorCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private ErrorCodeEnum errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public TokensForwardingFailDataItem() { 
  }

  public TokensForwardingFailDataItem blockchain(String blockchain) {
    
    this.blockchain = blockchain;
    return this;
  }

   /**
   * Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
   * @return blockchain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "bitcoin", required = true, value = "Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.")

  public String getBlockchain() {
    return blockchain;
  }


  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }


  public TokensForwardingFailDataItem network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks.
   * @return network
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "testnet", required = true, value = "Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public TokensForwardingFailDataItem fromAddress(String fromAddress) {
    
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Represents the hash of the address that provides the tokens.
   * @return fromAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "mizRduUBKEbJ6uzYJUegPh78gEGgM3WjAr", required = true, value = "Represents the hash of the address that provides the tokens.")

  public String getFromAddress() {
    return fromAddress;
  }


  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }


  public TokensForwardingFailDataItem toAddress(String toAddress) {
    
    this.toAddress = toAddress;
    return this;
  }

   /**
   * Represents the hash of the address to forward the tokens to.
   * @return toAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "mnumE76iEKN47bUsdni85oped5D1fRwKWi", required = true, value = "Represents the hash of the address to forward the tokens to.")

  public String getToAddress() {
    return toAddress;
  }


  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }


  public TokensForwardingFailDataItem triggerTransactionId(String triggerTransactionId) {
    
    this.triggerTransactionId = triggerTransactionId;
    return this;
  }

   /**
   * Defines the unique Transaction ID that triggered the token forwarding.
   * @return triggerTransactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ba1a4e661d36457abc46ea0effef0105f639912119fc64df8fb866118ce7c0d8", required = true, value = "Defines the unique Transaction ID that triggered the token forwarding.")

  public String getTriggerTransactionId() {
    return triggerTransactionId;
  }


  public void setTriggerTransactionId(String triggerTransactionId) {
    this.triggerTransactionId = triggerTransactionId;
  }


  public TokensForwardingFailDataItem errorCode(ErrorCodeEnum errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Represents the error code received for the failed token forwarding.
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "FEE_ADDRESS_OUT_OF_FUNDS", required = true, value = "Represents the error code received for the failed token forwarding.")

  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }


  public TokensForwardingFailDataItem errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Represents the error message received for the failed token forwarding.
   * @return errorMessage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "You have insufficient credits.", required = true, value = "Represents the error message received for the failed token forwarding.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokensForwardingFailDataItem tokensForwardingFailDataItem = (TokensForwardingFailDataItem) o;
    return Objects.equals(this.blockchain, tokensForwardingFailDataItem.blockchain) &&
        Objects.equals(this.network, tokensForwardingFailDataItem.network) &&
        Objects.equals(this.fromAddress, tokensForwardingFailDataItem.fromAddress) &&
        Objects.equals(this.toAddress, tokensForwardingFailDataItem.toAddress) &&
        Objects.equals(this.triggerTransactionId, tokensForwardingFailDataItem.triggerTransactionId) &&
        Objects.equals(this.errorCode, tokensForwardingFailDataItem.errorCode) &&
        Objects.equals(this.errorMessage, tokensForwardingFailDataItem.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchain, network, fromAddress, toAddress, triggerTransactionId, errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokensForwardingFailDataItem {\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    triggerTransactionId: ").append(toIndentedString(triggerTransactionId)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

