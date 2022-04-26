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
import org.openapitools.client.model.InvalidApiKey;
import org.openapitools.client.model.MissingApiKey;

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
public class ListSupportedTokensE401 extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ListSupportedTokensE401.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ListSupportedTokensE401.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ListSupportedTokensE401' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<InvalidApiKey> adapterInvalidApiKey = gson.getDelegateAdapter(this, TypeToken.get(InvalidApiKey.class));
            final TypeAdapter<MissingApiKey> adapterMissingApiKey = gson.getDelegateAdapter(this, TypeToken.get(MissingApiKey.class));

            return (TypeAdapter<T>) new TypeAdapter<ListSupportedTokensE401>() {
                @Override
                public void write(JsonWriter out, ListSupportedTokensE401 value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `InvalidApiKey`
                    if (value.getActualInstance() instanceof InvalidApiKey) {
                        JsonObject obj = adapterInvalidApiKey.toJsonTree((InvalidApiKey)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `MissingApiKey`
                    if (value.getActualInstance() instanceof MissingApiKey) {
                        JsonObject obj = adapterMissingApiKey.toJsonTree((MissingApiKey)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: InvalidApiKey, MissingApiKey");
                }

                @Override
                public ListSupportedTokensE401 read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize InvalidApiKey
                    try {
                        // validate the JSON object to see if any exception is thrown
                        InvalidApiKey.validateJsonObject(jsonObject);
                        actualAdapter = adapterInvalidApiKey;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'InvalidApiKey'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'InvalidApiKey'", e);
                    }

                    // deserialize MissingApiKey
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MissingApiKey.validateJsonObject(jsonObject);
                        actualAdapter = adapterMissingApiKey;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MissingApiKey'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'MissingApiKey'", e);
                    }

                    if (match == 1) {
                        ListSupportedTokensE401 ret = new ListSupportedTokensE401();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ListSupportedTokensE401: %d classes match result, expected 1. JSON: %s", match, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ListSupportedTokensE401() {
        super("oneOf", Boolean.FALSE);
    }

    public ListSupportedTokensE401(InvalidApiKey o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListSupportedTokensE401(MissingApiKey o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("InvalidApiKey", new GenericType<InvalidApiKey>() {
        });
        schemas.put("MissingApiKey", new GenericType<MissingApiKey>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ListSupportedTokensE401.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * InvalidApiKey, MissingApiKey
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof InvalidApiKey) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MissingApiKey) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be InvalidApiKey, MissingApiKey");
    }

    /**
     * Get the actual instance, which can be the following:
     * InvalidApiKey, MissingApiKey
     *
     * @return The actual instance (InvalidApiKey, MissingApiKey)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `InvalidApiKey`. If the actual instance is not `InvalidApiKey`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InvalidApiKey`
     * @throws ClassCastException if the instance is not `InvalidApiKey`
     */
    public InvalidApiKey getInvalidApiKey() throws ClassCastException {
        return (InvalidApiKey)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MissingApiKey`. If the actual instance is not `MissingApiKey`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MissingApiKey`
     * @throws ClassCastException if the instance is not `MissingApiKey`
     */
    public MissingApiKey getMissingApiKey() throws ClassCastException {
        return (MissingApiKey)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListSupportedTokensE401
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    // validate the json string with InvalidApiKey
    try {
      InvalidApiKey.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with MissingApiKey
    try {
      MissingApiKey.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ListSupportedTokensE401 with oneOf schemas: InvalidApiKey, MissingApiKey. %d class(es) match the result, expected 1. JSON: %s", validCount, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ListSupportedTokensE401 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListSupportedTokensE401
  * @throws IOException if the JSON string is invalid with respect to ListSupportedTokensE401
  */
  public static ListSupportedTokensE401 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListSupportedTokensE401.class);
  }

 /**
  * Convert an instance of ListSupportedTokensE401 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

