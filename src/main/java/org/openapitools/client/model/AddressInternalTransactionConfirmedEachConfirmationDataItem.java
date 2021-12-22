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
import org.openapitools.client.model.AddressInternalTransactionConfirmedEachConfirmationDataItemMinedInBlock;

/**
 * Defines an &#x60;item&#x60; as one result.
 */
@ApiModel(description = "Defines an `item` as one result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class AddressInternalTransactionConfirmedEachConfirmationDataItem {
  public static final String SERIALIZED_NAME_BLOCKCHAIN = "blockchain";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN)
  private String blockchain;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK = "minedInBlock";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK)
  private AddressInternalTransactionConfirmedEachConfirmationDataItemMinedInBlock minedInBlock;

  public static final String SERIALIZED_NAME_PARENT_TRANSACTION_ID = "parentTransactionId";
  @SerializedName(SERIALIZED_NAME_PARENT_TRANSACTION_ID)
  private String parentTransactionId;

  public static final String SERIALIZED_NAME_OPERATION_ID = "operationId";
  @SerializedName(SERIALIZED_NAME_OPERATION_ID)
  private String operationId;

  public static final String SERIALIZED_NAME_CURRENT_CONFIRMATIONS = "currentConfirmations";
  @SerializedName(SERIALIZED_NAME_CURRENT_CONFIRMATIONS)
  private Integer currentConfirmations;

  public static final String SERIALIZED_NAME_TARGET_CONFIRMATIONS = "targetConfirmations";
  @SerializedName(SERIALIZED_NAME_TARGET_CONFIRMATIONS)
  private Integer targetConfirmations;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  /**
   * Defines whether the transaction is \&quot;incoming\&quot; or \&quot;outgoing\&quot;.
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    INCOMING("incoming"),
    
    OUTGOING("outgoing");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DirectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private DirectionEnum direction;

  public AddressInternalTransactionConfirmedEachConfirmationDataItem() { 
  }

  public AddressInternalTransactionConfirmedEachConfirmationDataItem blockchain(String blockchain) {
    
    this.blockchain = blockchain;
    return this;
  }

   /**
   * Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
   * @return blockchain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ethereum", required = true, value = "Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.")

  public String getBlockchain() {
    return blockchain;
  }


  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }


  public AddressInternalTransactionConfirmedEachConfirmationDataItem network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks.
   * @return network
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "mainnet", required = true, value = "Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public AddressInternalTransactionConfirmedEachConfirmationDataItem address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Defines the specific address of the internal transaction.
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0xC02aaA39b223FE8D0A0e5C4F27eAD9083C756Cc2", required = true, value = "Defines the specific address of the internal transaction.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AddressInternalTransactionConfirmedEachConfirmationDataItem minedInBlock(AddressInternalTransactionConfirmedEachConfirmationDataItemMinedInBlock minedInBlock) {
    
    this.minedInBlock = minedInBlock;
    return this;
  }

   /**
   * Get minedInBlock
   * @return minedInBlock
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AddressInternalTransactionConfirmedEachConfirmationDataItemMinedInBlock getMinedInBlock() {
    return minedInBlock;
  }


  public void setMinedInBlock(AddressInternalTransactionConfirmedEachConfirmationDataItemMinedInBlock minedInBlock) {
    this.minedInBlock = minedInBlock;
  }


  public AddressInternalTransactionConfirmedEachConfirmationDataItem parentTransactionId(String parentTransactionId) {
    
    this.parentTransactionId = parentTransactionId;
    return this;
  }

   /**
   * Defines the Parent Transaction&#39;s unique ID.
   * @return parentTransactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x5fc77216fdfb8c966387030be7bda4bacce0232f7115722ef5b228a223974784", required = true, value = "Defines the Parent Transaction's unique ID.")

  public String getParentTransactionId() {
    return parentTransactionId;
  }


  public void setParentTransactionId(String parentTransactionId) {
    this.parentTransactionId = parentTransactionId;
  }


  public AddressInternalTransactionConfirmedEachConfirmationDataItem operationId(String operationId) {
    
    this.operationId = operationId;
    return this;
  }

   /**
   * Defines the specific operation&#39;s unique ID.
   * @return operationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "call_1_0_1_0_3_0", required = true, value = "Defines the specific operation's unique ID.")

  public String getOperationId() {
    return operationId;
  }


  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }


  public AddressInternalTransactionConfirmedEachConfirmationDataItem currentConfirmations(Integer currentConfirmations) {
    
    this.currentConfirmations = currentConfirmations;
    return this;
  }

   /**
   * Defines the number of currently received confirmations for the transaction.
   * @return currentConfirmations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Defines the number of currently received confirmations for the transaction.")

  public Integer getCurrentConfirmations() {
    return currentConfirmations;
  }


  public void setCurrentConfirmations(Integer currentConfirmations) {
    this.currentConfirmations = currentConfirmations;
  }


  public AddressInternalTransactionConfirmedEachConfirmationDataItem targetConfirmations(Integer targetConfirmations) {
    
    this.targetConfirmations = targetConfirmations;
    return this;
  }

   /**
   * Defines the number of confirmation transactions requested as callbacks, i.e. the system can notify till the n-th confirmation.
   * @return targetConfirmations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "Defines the number of confirmation transactions requested as callbacks, i.e. the system can notify till the n-th confirmation.")

  public Integer getTargetConfirmations() {
    return targetConfirmations;
  }


  public void setTargetConfirmations(Integer targetConfirmations) {
    this.targetConfirmations = targetConfirmations;
  }


  public AddressInternalTransactionConfirmedEachConfirmationDataItem amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the amount of coins sent with the confirmed transaction.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.05710541741945074", required = true, value = "Defines the amount of coins sent with the confirmed transaction.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public AddressInternalTransactionConfirmedEachConfirmationDataItem unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Defines the unit of the transaction, e.g. Gwei.
   * @return unit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ETH", required = true, value = "Defines the unit of the transaction, e.g. Gwei.")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  public AddressInternalTransactionConfirmedEachConfirmationDataItem direction(DirectionEnum direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Defines whether the transaction is \&quot;incoming\&quot; or \&quot;outgoing\&quot;.
   * @return direction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "outgoing", required = true, value = "Defines whether the transaction is \"incoming\" or \"outgoing\".")

  public DirectionEnum getDirection() {
    return direction;
  }


  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressInternalTransactionConfirmedEachConfirmationDataItem addressInternalTransactionConfirmedEachConfirmationDataItem = (AddressInternalTransactionConfirmedEachConfirmationDataItem) o;
    return Objects.equals(this.blockchain, addressInternalTransactionConfirmedEachConfirmationDataItem.blockchain) &&
        Objects.equals(this.network, addressInternalTransactionConfirmedEachConfirmationDataItem.network) &&
        Objects.equals(this.address, addressInternalTransactionConfirmedEachConfirmationDataItem.address) &&
        Objects.equals(this.minedInBlock, addressInternalTransactionConfirmedEachConfirmationDataItem.minedInBlock) &&
        Objects.equals(this.parentTransactionId, addressInternalTransactionConfirmedEachConfirmationDataItem.parentTransactionId) &&
        Objects.equals(this.operationId, addressInternalTransactionConfirmedEachConfirmationDataItem.operationId) &&
        Objects.equals(this.currentConfirmations, addressInternalTransactionConfirmedEachConfirmationDataItem.currentConfirmations) &&
        Objects.equals(this.targetConfirmations, addressInternalTransactionConfirmedEachConfirmationDataItem.targetConfirmations) &&
        Objects.equals(this.amount, addressInternalTransactionConfirmedEachConfirmationDataItem.amount) &&
        Objects.equals(this.unit, addressInternalTransactionConfirmedEachConfirmationDataItem.unit) &&
        Objects.equals(this.direction, addressInternalTransactionConfirmedEachConfirmationDataItem.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchain, network, address, minedInBlock, parentTransactionId, operationId, currentConfirmations, targetConfirmations, amount, unit, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressInternalTransactionConfirmedEachConfirmationDataItem {\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    minedInBlock: ").append(toIndentedString(minedInBlock)).append("\n");
    sb.append("    parentTransactionId: ").append(toIndentedString(parentTransactionId)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    currentConfirmations: ").append(toIndentedString(currentConfirmations)).append("\n");
    sb.append("    targetConfirmations: ").append(toIndentedString(targetConfirmations)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

