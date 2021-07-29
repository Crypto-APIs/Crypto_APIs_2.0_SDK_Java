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
 * ListHDWalletXPubYPubZPubTransactionsRISenders
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-29T09:33:59.822482Z[Etc/UTC]")
public class ListHDWalletXPubYPubZPubTransactionsRISenders {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_IS_MEMBER = "isMember";
  @SerializedName(SERIALIZED_NAME_IS_MEMBER)
  private Boolean isMember;


  public ListHDWalletXPubYPubZPubTransactionsRISenders address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Represents the address which sends this transaction. In UTXO-based protocols like Bitcoin there could be several senders while in account-based protocols like Ethereum there is always only one sender.
   * @return address
  **/
  @ApiModelProperty(example = "2N5PcdirZUzKF9bWuGdugNuzcQrCbBudxv1", required = true, value = "Represents the address which sends this transaction. In UTXO-based protocols like Bitcoin there could be several senders while in account-based protocols like Ethereum there is always only one sender.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ListHDWalletXPubYPubZPubTransactionsRISenders amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Represents the amount sent by this address.
   * @return amount
  **/
  @ApiModelProperty(example = "0.00873472", required = true, value = "Represents the amount sent by this address.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ListHDWalletXPubYPubZPubTransactionsRISenders isMember(Boolean isMember) {
    
    this.isMember = isMember;
    return this;
  }

   /**
   * Defines whether an address is a child address derived from the HD wallet (xPub, yPub, zPub) as boolean.
   * @return isMember
  **/
  @ApiModelProperty(example = "true", required = true, value = "Defines whether an address is a child address derived from the HD wallet (xPub, yPub, zPub) as boolean.")

  public Boolean getIsMember() {
    return isMember;
  }


  public void setIsMember(Boolean isMember) {
    this.isMember = isMember;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListHDWalletXPubYPubZPubTransactionsRISenders listHDWalletXPubYPubZPubTransactionsRISenders = (ListHDWalletXPubYPubZPubTransactionsRISenders) o;
    return Objects.equals(this.address, listHDWalletXPubYPubZPubTransactionsRISenders.address) &&
        Objects.equals(this.amount, listHDWalletXPubYPubZPubTransactionsRISenders.amount) &&
        Objects.equals(this.isMember, listHDWalletXPubYPubZPubTransactionsRISenders.isMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, amount, isMember);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListHDWalletXPubYPubZPubTransactionsRISenders {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
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

