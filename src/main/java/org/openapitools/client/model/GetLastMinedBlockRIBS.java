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
import org.openapitools.client.model.GetLastMinedBlockRIBSB;
import org.openapitools.client.model.GetLastMinedBlockRIBSBC;
import org.openapitools.client.model.GetLastMinedBlockRIBSBSC;
import org.openapitools.client.model.GetLastMinedBlockRIBSD;
import org.openapitools.client.model.GetLastMinedBlockRIBSD2;
import org.openapitools.client.model.GetLastMinedBlockRIBSE;
import org.openapitools.client.model.GetLastMinedBlockRIBSEC;
import org.openapitools.client.model.GetLastMinedBlockRIBSL;
import org.openapitools.client.model.GetLastMinedBlockRIBSZ;

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
public class GetLastMinedBlockRIBS extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetLastMinedBlockRIBS.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetLastMinedBlockRIBS.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetLastMinedBlockRIBS' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetLastMinedBlockRIBSB> adapterGetLastMinedBlockRIBSB = gson.getDelegateAdapter(this, TypeToken.get(GetLastMinedBlockRIBSB.class));
            final TypeAdapter<GetLastMinedBlockRIBSBC> adapterGetLastMinedBlockRIBSBC = gson.getDelegateAdapter(this, TypeToken.get(GetLastMinedBlockRIBSBC.class));
            final TypeAdapter<GetLastMinedBlockRIBSBSC> adapterGetLastMinedBlockRIBSBSC = gson.getDelegateAdapter(this, TypeToken.get(GetLastMinedBlockRIBSBSC.class));
            final TypeAdapter<GetLastMinedBlockRIBSD> adapterGetLastMinedBlockRIBSD = gson.getDelegateAdapter(this, TypeToken.get(GetLastMinedBlockRIBSD.class));
            final TypeAdapter<GetLastMinedBlockRIBSD2> adapterGetLastMinedBlockRIBSD2 = gson.getDelegateAdapter(this, TypeToken.get(GetLastMinedBlockRIBSD2.class));
            final TypeAdapter<GetLastMinedBlockRIBSE> adapterGetLastMinedBlockRIBSE = gson.getDelegateAdapter(this, TypeToken.get(GetLastMinedBlockRIBSE.class));
            final TypeAdapter<GetLastMinedBlockRIBSEC> adapterGetLastMinedBlockRIBSEC = gson.getDelegateAdapter(this, TypeToken.get(GetLastMinedBlockRIBSEC.class));
            final TypeAdapter<GetLastMinedBlockRIBSL> adapterGetLastMinedBlockRIBSL = gson.getDelegateAdapter(this, TypeToken.get(GetLastMinedBlockRIBSL.class));
            final TypeAdapter<GetLastMinedBlockRIBSZ> adapterGetLastMinedBlockRIBSZ = gson.getDelegateAdapter(this, TypeToken.get(GetLastMinedBlockRIBSZ.class));

            return (TypeAdapter<T>) new TypeAdapter<GetLastMinedBlockRIBS>() {
                @Override
                public void write(JsonWriter out, GetLastMinedBlockRIBS value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `GetLastMinedBlockRIBSB`
                    if (value.getActualInstance() instanceof GetLastMinedBlockRIBSB) {
                        JsonObject obj = adapterGetLastMinedBlockRIBSB.toJsonTree((GetLastMinedBlockRIBSB)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetLastMinedBlockRIBSBC`
                    if (value.getActualInstance() instanceof GetLastMinedBlockRIBSBC) {
                        JsonObject obj = adapterGetLastMinedBlockRIBSBC.toJsonTree((GetLastMinedBlockRIBSBC)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetLastMinedBlockRIBSBSC`
                    if (value.getActualInstance() instanceof GetLastMinedBlockRIBSBSC) {
                        JsonObject obj = adapterGetLastMinedBlockRIBSBSC.toJsonTree((GetLastMinedBlockRIBSBSC)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetLastMinedBlockRIBSD`
                    if (value.getActualInstance() instanceof GetLastMinedBlockRIBSD) {
                        JsonObject obj = adapterGetLastMinedBlockRIBSD.toJsonTree((GetLastMinedBlockRIBSD)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetLastMinedBlockRIBSD2`
                    if (value.getActualInstance() instanceof GetLastMinedBlockRIBSD2) {
                        JsonObject obj = adapterGetLastMinedBlockRIBSD2.toJsonTree((GetLastMinedBlockRIBSD2)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetLastMinedBlockRIBSE`
                    if (value.getActualInstance() instanceof GetLastMinedBlockRIBSE) {
                        JsonObject obj = adapterGetLastMinedBlockRIBSE.toJsonTree((GetLastMinedBlockRIBSE)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetLastMinedBlockRIBSEC`
                    if (value.getActualInstance() instanceof GetLastMinedBlockRIBSEC) {
                        JsonObject obj = adapterGetLastMinedBlockRIBSEC.toJsonTree((GetLastMinedBlockRIBSEC)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetLastMinedBlockRIBSL`
                    if (value.getActualInstance() instanceof GetLastMinedBlockRIBSL) {
                        JsonObject obj = adapterGetLastMinedBlockRIBSL.toJsonTree((GetLastMinedBlockRIBSL)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetLastMinedBlockRIBSZ`
                    if (value.getActualInstance() instanceof GetLastMinedBlockRIBSZ) {
                        JsonObject obj = adapterGetLastMinedBlockRIBSZ.toJsonTree((GetLastMinedBlockRIBSZ)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: GetLastMinedBlockRIBSB, GetLastMinedBlockRIBSBC, GetLastMinedBlockRIBSBSC, GetLastMinedBlockRIBSD, GetLastMinedBlockRIBSD2, GetLastMinedBlockRIBSE, GetLastMinedBlockRIBSEC, GetLastMinedBlockRIBSL, GetLastMinedBlockRIBSZ");
                }

                @Override
                public GetLastMinedBlockRIBS read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize GetLastMinedBlockRIBSB
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetLastMinedBlockRIBSB.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetLastMinedBlockRIBSB;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetLastMinedBlockRIBSB'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'GetLastMinedBlockRIBSB'", e);
                    }

                    // deserialize GetLastMinedBlockRIBSBC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetLastMinedBlockRIBSBC.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetLastMinedBlockRIBSBC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetLastMinedBlockRIBSBC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'GetLastMinedBlockRIBSBC'", e);
                    }

                    // deserialize GetLastMinedBlockRIBSBSC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetLastMinedBlockRIBSBSC.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetLastMinedBlockRIBSBSC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetLastMinedBlockRIBSBSC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'GetLastMinedBlockRIBSBSC'", e);
                    }

                    // deserialize GetLastMinedBlockRIBSD
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetLastMinedBlockRIBSD.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetLastMinedBlockRIBSD;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetLastMinedBlockRIBSD'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'GetLastMinedBlockRIBSD'", e);
                    }

                    // deserialize GetLastMinedBlockRIBSD2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetLastMinedBlockRIBSD2.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetLastMinedBlockRIBSD2;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetLastMinedBlockRIBSD2'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'GetLastMinedBlockRIBSD2'", e);
                    }

                    // deserialize GetLastMinedBlockRIBSE
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetLastMinedBlockRIBSE.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetLastMinedBlockRIBSE;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetLastMinedBlockRIBSE'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'GetLastMinedBlockRIBSE'", e);
                    }

                    // deserialize GetLastMinedBlockRIBSEC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetLastMinedBlockRIBSEC.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetLastMinedBlockRIBSEC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetLastMinedBlockRIBSEC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'GetLastMinedBlockRIBSEC'", e);
                    }

                    // deserialize GetLastMinedBlockRIBSL
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetLastMinedBlockRIBSL.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetLastMinedBlockRIBSL;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetLastMinedBlockRIBSL'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'GetLastMinedBlockRIBSL'", e);
                    }

                    // deserialize GetLastMinedBlockRIBSZ
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetLastMinedBlockRIBSZ.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetLastMinedBlockRIBSZ;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetLastMinedBlockRIBSZ'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'GetLastMinedBlockRIBSZ'", e);
                    }

                    if (match == 1) {
                        GetLastMinedBlockRIBS ret = new GetLastMinedBlockRIBS();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GetLastMinedBlockRIBS: %d classes match result, expected 1. JSON: %s", match, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetLastMinedBlockRIBS() {
        super("oneOf", Boolean.FALSE);
    }

    public GetLastMinedBlockRIBS(GetLastMinedBlockRIBSB o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetLastMinedBlockRIBS(GetLastMinedBlockRIBSBC o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetLastMinedBlockRIBS(GetLastMinedBlockRIBSBSC o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetLastMinedBlockRIBS(GetLastMinedBlockRIBSD o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetLastMinedBlockRIBS(GetLastMinedBlockRIBSD2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetLastMinedBlockRIBS(GetLastMinedBlockRIBSE o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetLastMinedBlockRIBS(GetLastMinedBlockRIBSEC o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetLastMinedBlockRIBS(GetLastMinedBlockRIBSL o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetLastMinedBlockRIBS(GetLastMinedBlockRIBSZ o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("GetLastMinedBlockRIBSB", new GenericType<GetLastMinedBlockRIBSB>() {
        });
        schemas.put("GetLastMinedBlockRIBSBC", new GenericType<GetLastMinedBlockRIBSBC>() {
        });
        schemas.put("GetLastMinedBlockRIBSBSC", new GenericType<GetLastMinedBlockRIBSBSC>() {
        });
        schemas.put("GetLastMinedBlockRIBSD", new GenericType<GetLastMinedBlockRIBSD>() {
        });
        schemas.put("GetLastMinedBlockRIBSD2", new GenericType<GetLastMinedBlockRIBSD2>() {
        });
        schemas.put("GetLastMinedBlockRIBSE", new GenericType<GetLastMinedBlockRIBSE>() {
        });
        schemas.put("GetLastMinedBlockRIBSEC", new GenericType<GetLastMinedBlockRIBSEC>() {
        });
        schemas.put("GetLastMinedBlockRIBSL", new GenericType<GetLastMinedBlockRIBSL>() {
        });
        schemas.put("GetLastMinedBlockRIBSZ", new GenericType<GetLastMinedBlockRIBSZ>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetLastMinedBlockRIBS.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * GetLastMinedBlockRIBSB, GetLastMinedBlockRIBSBC, GetLastMinedBlockRIBSBSC, GetLastMinedBlockRIBSD, GetLastMinedBlockRIBSD2, GetLastMinedBlockRIBSE, GetLastMinedBlockRIBSEC, GetLastMinedBlockRIBSL, GetLastMinedBlockRIBSZ
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof GetLastMinedBlockRIBSB) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetLastMinedBlockRIBSBC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetLastMinedBlockRIBSBSC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetLastMinedBlockRIBSD) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetLastMinedBlockRIBSD2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetLastMinedBlockRIBSE) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetLastMinedBlockRIBSEC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetLastMinedBlockRIBSL) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetLastMinedBlockRIBSZ) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be GetLastMinedBlockRIBSB, GetLastMinedBlockRIBSBC, GetLastMinedBlockRIBSBSC, GetLastMinedBlockRIBSD, GetLastMinedBlockRIBSD2, GetLastMinedBlockRIBSE, GetLastMinedBlockRIBSEC, GetLastMinedBlockRIBSL, GetLastMinedBlockRIBSZ");
    }

    /**
     * Get the actual instance, which can be the following:
     * GetLastMinedBlockRIBSB, GetLastMinedBlockRIBSBC, GetLastMinedBlockRIBSBSC, GetLastMinedBlockRIBSD, GetLastMinedBlockRIBSD2, GetLastMinedBlockRIBSE, GetLastMinedBlockRIBSEC, GetLastMinedBlockRIBSL, GetLastMinedBlockRIBSZ
     *
     * @return The actual instance (GetLastMinedBlockRIBSB, GetLastMinedBlockRIBSBC, GetLastMinedBlockRIBSBSC, GetLastMinedBlockRIBSD, GetLastMinedBlockRIBSD2, GetLastMinedBlockRIBSE, GetLastMinedBlockRIBSEC, GetLastMinedBlockRIBSL, GetLastMinedBlockRIBSZ)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetLastMinedBlockRIBSB`. If the actual instance is not `GetLastMinedBlockRIBSB`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetLastMinedBlockRIBSB`
     * @throws ClassCastException if the instance is not `GetLastMinedBlockRIBSB`
     */
    public GetLastMinedBlockRIBSB getGetLastMinedBlockRIBSB() throws ClassCastException {
        return (GetLastMinedBlockRIBSB)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetLastMinedBlockRIBSBC`. If the actual instance is not `GetLastMinedBlockRIBSBC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetLastMinedBlockRIBSBC`
     * @throws ClassCastException if the instance is not `GetLastMinedBlockRIBSBC`
     */
    public GetLastMinedBlockRIBSBC getGetLastMinedBlockRIBSBC() throws ClassCastException {
        return (GetLastMinedBlockRIBSBC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetLastMinedBlockRIBSBSC`. If the actual instance is not `GetLastMinedBlockRIBSBSC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetLastMinedBlockRIBSBSC`
     * @throws ClassCastException if the instance is not `GetLastMinedBlockRIBSBSC`
     */
    public GetLastMinedBlockRIBSBSC getGetLastMinedBlockRIBSBSC() throws ClassCastException {
        return (GetLastMinedBlockRIBSBSC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetLastMinedBlockRIBSD`. If the actual instance is not `GetLastMinedBlockRIBSD`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetLastMinedBlockRIBSD`
     * @throws ClassCastException if the instance is not `GetLastMinedBlockRIBSD`
     */
    public GetLastMinedBlockRIBSD getGetLastMinedBlockRIBSD() throws ClassCastException {
        return (GetLastMinedBlockRIBSD)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetLastMinedBlockRIBSD2`. If the actual instance is not `GetLastMinedBlockRIBSD2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetLastMinedBlockRIBSD2`
     * @throws ClassCastException if the instance is not `GetLastMinedBlockRIBSD2`
     */
    public GetLastMinedBlockRIBSD2 getGetLastMinedBlockRIBSD2() throws ClassCastException {
        return (GetLastMinedBlockRIBSD2)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetLastMinedBlockRIBSE`. If the actual instance is not `GetLastMinedBlockRIBSE`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetLastMinedBlockRIBSE`
     * @throws ClassCastException if the instance is not `GetLastMinedBlockRIBSE`
     */
    public GetLastMinedBlockRIBSE getGetLastMinedBlockRIBSE() throws ClassCastException {
        return (GetLastMinedBlockRIBSE)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetLastMinedBlockRIBSEC`. If the actual instance is not `GetLastMinedBlockRIBSEC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetLastMinedBlockRIBSEC`
     * @throws ClassCastException if the instance is not `GetLastMinedBlockRIBSEC`
     */
    public GetLastMinedBlockRIBSEC getGetLastMinedBlockRIBSEC() throws ClassCastException {
        return (GetLastMinedBlockRIBSEC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetLastMinedBlockRIBSL`. If the actual instance is not `GetLastMinedBlockRIBSL`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetLastMinedBlockRIBSL`
     * @throws ClassCastException if the instance is not `GetLastMinedBlockRIBSL`
     */
    public GetLastMinedBlockRIBSL getGetLastMinedBlockRIBSL() throws ClassCastException {
        return (GetLastMinedBlockRIBSL)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetLastMinedBlockRIBSZ`. If the actual instance is not `GetLastMinedBlockRIBSZ`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetLastMinedBlockRIBSZ`
     * @throws ClassCastException if the instance is not `GetLastMinedBlockRIBSZ`
     */
    public GetLastMinedBlockRIBSZ getGetLastMinedBlockRIBSZ() throws ClassCastException {
        return (GetLastMinedBlockRIBSZ)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetLastMinedBlockRIBS
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    // validate the json string with GetLastMinedBlockRIBSB
    try {
      GetLastMinedBlockRIBSB.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with GetLastMinedBlockRIBSBC
    try {
      GetLastMinedBlockRIBSBC.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with GetLastMinedBlockRIBSBSC
    try {
      GetLastMinedBlockRIBSBSC.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with GetLastMinedBlockRIBSD
    try {
      GetLastMinedBlockRIBSD.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with GetLastMinedBlockRIBSD2
    try {
      GetLastMinedBlockRIBSD2.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with GetLastMinedBlockRIBSE
    try {
      GetLastMinedBlockRIBSE.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with GetLastMinedBlockRIBSEC
    try {
      GetLastMinedBlockRIBSEC.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with GetLastMinedBlockRIBSL
    try {
      GetLastMinedBlockRIBSL.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with GetLastMinedBlockRIBSZ
    try {
      GetLastMinedBlockRIBSZ.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for GetLastMinedBlockRIBS with oneOf schemas: GetLastMinedBlockRIBSB, GetLastMinedBlockRIBSBC, GetLastMinedBlockRIBSBSC, GetLastMinedBlockRIBSD, GetLastMinedBlockRIBSD2, GetLastMinedBlockRIBSE, GetLastMinedBlockRIBSEC, GetLastMinedBlockRIBSL, GetLastMinedBlockRIBSZ. %d class(es) match the result, expected 1. JSON: %s", validCount, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of GetLastMinedBlockRIBS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetLastMinedBlockRIBS
  * @throws IOException if the JSON string is invalid with respect to GetLastMinedBlockRIBS
  */
  public static GetLastMinedBlockRIBS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetLastMinedBlockRIBS.class);
  }

 /**
  * Convert an instance of GetLastMinedBlockRIBS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

