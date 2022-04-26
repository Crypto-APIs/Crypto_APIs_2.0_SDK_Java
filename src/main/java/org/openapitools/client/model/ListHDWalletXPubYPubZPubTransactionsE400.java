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
import org.openapitools.client.model.BannedIpAddressDetails;
import org.openapitools.client.model.InvalidBlockchain;
import org.openapitools.client.model.InvalidNetwork;
import org.openapitools.client.model.InvalidPagination;
import org.openapitools.client.model.InvalidXpub;
import org.openapitools.client.model.LimitGreaterThanAllowed;
import org.openapitools.client.model.UriNotFound;
import org.openapitools.client.model.XpubNotSynced;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import io.cryptoapis.sdk.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class ListHDWalletXPubYPubZPubTransactionsE400 extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ListHDWalletXPubYPubZPubTransactionsE400.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ListHDWalletXPubYPubZPubTransactionsE400.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ListHDWalletXPubYPubZPubTransactionsE400' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<InvalidBlockchain> adapterInvalidBlockchain = gson.getDelegateAdapter(this, TypeToken.get(InvalidBlockchain.class));
            final TypeAdapter<InvalidNetwork> adapterInvalidNetwork = gson.getDelegateAdapter(this, TypeToken.get(InvalidNetwork.class));
            final TypeAdapter<InvalidPagination> adapterInvalidPagination = gson.getDelegateAdapter(this, TypeToken.get(InvalidPagination.class));
            final TypeAdapter<InvalidXpub> adapterInvalidXpub = gson.getDelegateAdapter(this, TypeToken.get(InvalidXpub.class));
            final TypeAdapter<LimitGreaterThanAllowed> adapterLimitGreaterThanAllowed = gson.getDelegateAdapter(this, TypeToken.get(LimitGreaterThanAllowed.class));
            final TypeAdapter<UriNotFound> adapterUriNotFound = gson.getDelegateAdapter(this, TypeToken.get(UriNotFound.class));
            final TypeAdapter<XpubNotSynced> adapterXpubNotSynced = gson.getDelegateAdapter(this, TypeToken.get(XpubNotSynced.class));

            return (TypeAdapter<T>) new TypeAdapter<ListHDWalletXPubYPubZPubTransactionsE400>() {
                @Override
                public void write(JsonWriter out, ListHDWalletXPubYPubZPubTransactionsE400 value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `InvalidBlockchain`
                    if (value.getActualInstance() instanceof InvalidBlockchain) {
                        JsonObject obj = adapterInvalidBlockchain.toJsonTree((InvalidBlockchain)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `InvalidNetwork`
                    if (value.getActualInstance() instanceof InvalidNetwork) {
                        JsonObject obj = adapterInvalidNetwork.toJsonTree((InvalidNetwork)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `InvalidPagination`
                    if (value.getActualInstance() instanceof InvalidPagination) {
                        JsonObject obj = adapterInvalidPagination.toJsonTree((InvalidPagination)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `InvalidXpub`
                    if (value.getActualInstance() instanceof InvalidXpub) {
                        JsonObject obj = adapterInvalidXpub.toJsonTree((InvalidXpub)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `LimitGreaterThanAllowed`
                    if (value.getActualInstance() instanceof LimitGreaterThanAllowed) {
                        JsonObject obj = adapterLimitGreaterThanAllowed.toJsonTree((LimitGreaterThanAllowed)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UriNotFound`
                    if (value.getActualInstance() instanceof UriNotFound) {
                        JsonObject obj = adapterUriNotFound.toJsonTree((UriNotFound)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `XpubNotSynced`
                    if (value.getActualInstance() instanceof XpubNotSynced) {
                        JsonObject obj = adapterXpubNotSynced.toJsonTree((XpubNotSynced)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: InvalidBlockchain, InvalidNetwork, InvalidPagination, InvalidXpub, LimitGreaterThanAllowed, UriNotFound, XpubNotSynced");
                }

                @Override
                public ListHDWalletXPubYPubZPubTransactionsE400 read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize InvalidBlockchain
                    try {
                        // validate the JSON object to see if any exception is thrown
                        InvalidBlockchain.validateJsonObject(jsonObject);
                        actualAdapter = adapterInvalidBlockchain;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'InvalidBlockchain'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'InvalidBlockchain'", e);
                    }

                    // deserialize InvalidNetwork
                    try {
                        // validate the JSON object to see if any exception is thrown
                        InvalidNetwork.validateJsonObject(jsonObject);
                        actualAdapter = adapterInvalidNetwork;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'InvalidNetwork'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'InvalidNetwork'", e);
                    }

                    // deserialize InvalidPagination
                    try {
                        // validate the JSON object to see if any exception is thrown
                        InvalidPagination.validateJsonObject(jsonObject);
                        actualAdapter = adapterInvalidPagination;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'InvalidPagination'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'InvalidPagination'", e);
                    }

                    // deserialize InvalidXpub
                    try {
                        // validate the JSON object to see if any exception is thrown
                        InvalidXpub.validateJsonObject(jsonObject);
                        actualAdapter = adapterInvalidXpub;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'InvalidXpub'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'InvalidXpub'", e);
                    }

                    // deserialize LimitGreaterThanAllowed
                    try {
                        // validate the JSON object to see if any exception is thrown
                        LimitGreaterThanAllowed.validateJsonObject(jsonObject);
                        actualAdapter = adapterLimitGreaterThanAllowed;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'LimitGreaterThanAllowed'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'LimitGreaterThanAllowed'", e);
                    }

                    // deserialize UriNotFound
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UriNotFound.validateJsonObject(jsonObject);
                        actualAdapter = adapterUriNotFound;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UriNotFound'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'UriNotFound'", e);
                    }

                    // deserialize XpubNotSynced
                    try {
                        // validate the JSON object to see if any exception is thrown
                        XpubNotSynced.validateJsonObject(jsonObject);
                        actualAdapter = adapterXpubNotSynced;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'XpubNotSynced'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'XpubNotSynced'", e);
                    }

                    if (match == 1) {
                        ListHDWalletXPubYPubZPubTransactionsE400 ret = new ListHDWalletXPubYPubZPubTransactionsE400();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ListHDWalletXPubYPubZPubTransactionsE400: %d classes match result, expected 1. JSON: %s", match, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ListHDWalletXPubYPubZPubTransactionsE400() {
        super("oneOf", Boolean.FALSE);
    }

    public ListHDWalletXPubYPubZPubTransactionsE400(InvalidBlockchain o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListHDWalletXPubYPubZPubTransactionsE400(InvalidNetwork o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListHDWalletXPubYPubZPubTransactionsE400(InvalidPagination o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListHDWalletXPubYPubZPubTransactionsE400(InvalidXpub o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListHDWalletXPubYPubZPubTransactionsE400(LimitGreaterThanAllowed o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListHDWalletXPubYPubZPubTransactionsE400(UriNotFound o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListHDWalletXPubYPubZPubTransactionsE400(XpubNotSynced o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("InvalidBlockchain", new GenericType<InvalidBlockchain>() {
        });
        schemas.put("InvalidNetwork", new GenericType<InvalidNetwork>() {
        });
        schemas.put("InvalidPagination", new GenericType<InvalidPagination>() {
        });
        schemas.put("InvalidXpub", new GenericType<InvalidXpub>() {
        });
        schemas.put("LimitGreaterThanAllowed", new GenericType<LimitGreaterThanAllowed>() {
        });
        schemas.put("UriNotFound", new GenericType<UriNotFound>() {
        });
        schemas.put("XpubNotSynced", new GenericType<XpubNotSynced>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ListHDWalletXPubYPubZPubTransactionsE400.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * InvalidBlockchain, InvalidNetwork, InvalidPagination, InvalidXpub, LimitGreaterThanAllowed, UriNotFound, XpubNotSynced
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof InvalidBlockchain) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof InvalidNetwork) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof InvalidPagination) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof InvalidXpub) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof LimitGreaterThanAllowed) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UriNotFound) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof XpubNotSynced) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be InvalidBlockchain, InvalidNetwork, InvalidPagination, InvalidXpub, LimitGreaterThanAllowed, UriNotFound, XpubNotSynced");
    }

    /**
     * Get the actual instance, which can be the following:
     * InvalidBlockchain, InvalidNetwork, InvalidPagination, InvalidXpub, LimitGreaterThanAllowed, UriNotFound, XpubNotSynced
     *
     * @return The actual instance (InvalidBlockchain, InvalidNetwork, InvalidPagination, InvalidXpub, LimitGreaterThanAllowed, UriNotFound, XpubNotSynced)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `InvalidBlockchain`. If the actual instance is not `InvalidBlockchain`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InvalidBlockchain`
     * @throws ClassCastException if the instance is not `InvalidBlockchain`
     */
    public InvalidBlockchain getInvalidBlockchain() throws ClassCastException {
        return (InvalidBlockchain)super.getActualInstance();
    }

    /**
     * Get the actual instance of `InvalidNetwork`. If the actual instance is not `InvalidNetwork`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InvalidNetwork`
     * @throws ClassCastException if the instance is not `InvalidNetwork`
     */
    public InvalidNetwork getInvalidNetwork() throws ClassCastException {
        return (InvalidNetwork)super.getActualInstance();
    }

    /**
     * Get the actual instance of `InvalidPagination`. If the actual instance is not `InvalidPagination`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InvalidPagination`
     * @throws ClassCastException if the instance is not `InvalidPagination`
     */
    public InvalidPagination getInvalidPagination() throws ClassCastException {
        return (InvalidPagination)super.getActualInstance();
    }

    /**
     * Get the actual instance of `InvalidXpub`. If the actual instance is not `InvalidXpub`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InvalidXpub`
     * @throws ClassCastException if the instance is not `InvalidXpub`
     */
    public InvalidXpub getInvalidXpub() throws ClassCastException {
        return (InvalidXpub)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LimitGreaterThanAllowed`. If the actual instance is not `LimitGreaterThanAllowed`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LimitGreaterThanAllowed`
     * @throws ClassCastException if the instance is not `LimitGreaterThanAllowed`
     */
    public LimitGreaterThanAllowed getLimitGreaterThanAllowed() throws ClassCastException {
        return (LimitGreaterThanAllowed)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UriNotFound`. If the actual instance is not `UriNotFound`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UriNotFound`
     * @throws ClassCastException if the instance is not `UriNotFound`
     */
    public UriNotFound getUriNotFound() throws ClassCastException {
        return (UriNotFound)super.getActualInstance();
    }

    /**
     * Get the actual instance of `XpubNotSynced`. If the actual instance is not `XpubNotSynced`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `XpubNotSynced`
     * @throws ClassCastException if the instance is not `XpubNotSynced`
     */
    public XpubNotSynced getXpubNotSynced() throws ClassCastException {
        return (XpubNotSynced)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListHDWalletXPubYPubZPubTransactionsE400
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    // validate the json string with InvalidBlockchain
    try {
      InvalidBlockchain.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with InvalidNetwork
    try {
      InvalidNetwork.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with InvalidPagination
    try {
      InvalidPagination.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with InvalidXpub
    try {
      InvalidXpub.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with LimitGreaterThanAllowed
    try {
      LimitGreaterThanAllowed.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with UriNotFound
    try {
      UriNotFound.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with XpubNotSynced
    try {
      XpubNotSynced.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ListHDWalletXPubYPubZPubTransactionsE400 with oneOf schemas: InvalidBlockchain, InvalidNetwork, InvalidPagination, InvalidXpub, LimitGreaterThanAllowed, UriNotFound, XpubNotSynced. %d class(es) match the result, expected 1. JSON: %s", validCount, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ListHDWalletXPubYPubZPubTransactionsE400 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListHDWalletXPubYPubZPubTransactionsE400
  * @throws IOException if the JSON string is invalid with respect to ListHDWalletXPubYPubZPubTransactionsE400
  */
  public static ListHDWalletXPubYPubZPubTransactionsE400 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListHDWalletXPubYPubZPubTransactionsE400.class);
  }

 /**
  * Convert an instance of ListHDWalletXPubYPubZPubTransactionsE400 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

