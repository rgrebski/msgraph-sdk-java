// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Microsoft Store For Business App.
 */
public class BaseMicrosoftStoreForBusinessApp extends MobileApp implements IJsonBackedObject {


    /**
     * The Used License Count.
     * The number of Microsoft Store for Business licenses in use.
     */
    @SerializedName("usedLicenseCount")
    @Expose
    public Integer usedLicenseCount;

    /**
     * The Total License Count.
     * The total number of Microsoft Store for Business licenses.
     */
    @SerializedName("totalLicenseCount")
    @Expose
    public Integer totalLicenseCount;

    /**
     * The Product Key.
     * The app product key
     */
    @SerializedName("productKey")
    @Expose
    public String productKey;

    /**
     * The License Type.
     * The app license type Possible values are: offline, online.
     */
    @SerializedName("licenseType")
    @Expose
    public MicrosoftStoreForBusinessLicenseType licenseType;

    /**
     * The Package Identity Name.
     * The app package identifier
     */
    @SerializedName("packageIdentityName")
    @Expose
    public String packageIdentityName;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
