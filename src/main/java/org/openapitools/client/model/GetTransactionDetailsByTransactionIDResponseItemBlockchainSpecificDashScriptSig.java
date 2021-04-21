/*
 * Crypto APIs
 * Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: bizdev@cryptoapis.io
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
 * Specifies the required signatures.
 */
@ApiModel(description = "Specifies the required signatures.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T16:59:17.199745Z[Etc/UTC]")
public class GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashScriptSig {
  public static final String SERIALIZED_NAME_ASM = "asm";
  @SerializedName(SERIALIZED_NAME_ASM)
  private String asm;

  public static final String SERIALIZED_NAME_HEX = "hex";
  @SerializedName(SERIALIZED_NAME_HEX)
  private String hex;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashScriptSig asm(String asm) {
    
    this.asm = asm;
    return this;
  }

   /**
   * The asm strands for assembly, which is the symbolic representation of the Bitcoin&#39;s Script language op-codes.
   * @return asm
  **/
  @ApiModelProperty(example = "OP_DUP OP_HASH160 1fd680935cd42f95702493d44c8de964a42656b5 OP_EQUALVERIFY OP_CHECKSIG", required = true, value = "The asm strands for assembly, which is the symbolic representation of the Bitcoin's Script language op-codes.")

  public String getAsm() {
    return asm;
  }


  public void setAsm(String asm) {
    this.asm = asm;
  }


  public GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashScriptSig hex(String hex) {
    
    this.hex = hex;
    return this;
  }

   /**
   * Represents the hex of the public key of the address.
   * @return hex
  **/
  @ApiModelProperty(example = "4197968cb34bfba488b4a2399f7959b823fefad79ca0b5ed3f3a4bec4c0286cab55b896b28bbbcd4e61cf584cecfd47063b18b481d8d680eafbf869ada1a02c52441210237a84e6d70e775f274e4cbd9f30f9f8b1a426e8b08a9f802a851ce501c930011", required = true, value = "Represents the hex of the public key of the address.")

  public String getHex() {
    return hex;
  }


  public void setHex(String hex) {
    this.hex = hex;
  }


  public GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashScriptSig type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Represents the script type of the reference transaction identifier.
   * @return type
  **/
  @ApiModelProperty(example = "scripthash", required = true, value = "Represents the script type of the reference transaction identifier.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashScriptSig getTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashScriptSig = (GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashScriptSig) o;
    return Objects.equals(this.asm, getTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashScriptSig.asm) &&
        Objects.equals(this.hex, getTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashScriptSig.hex) &&
        Objects.equals(this.type, getTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashScriptSig.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asm, hex, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashScriptSig {\n");
    sb.append("    asm: ").append(toIndentedString(asm)).append("\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

