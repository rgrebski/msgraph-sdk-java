// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.extensions.IosDeviceType;
import com.microsoft.graph.models.extensions.IosMinimumOperatingSystem;
import com.microsoft.graph.models.extensions.ManagedApp;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed IOSStore App.
 */
public class BaseManagedIOSStoreApp extends ManagedApp implements IJsonBackedObject {


    /**
     * The Bundle Id.
     * The app's Bundle ID.
     */
    @SerializedName("bundleId")
    @Expose
    public String bundleId;

    /**
     * The App Store Url.
     * The Apple AppStoreUrl.
     */
    @SerializedName("appStoreUrl")
    @Expose
    public String appStoreUrl;

    /**
     * The Applicable Device Type.
     * The iOS architecture for which this app can run on.
     */
    @SerializedName("applicableDeviceType")
    @Expose
    public IosDeviceType applicableDeviceType;

    /**
     * The Minimum Supported Operating System.
     * The value for the minimum supported operating system.
     */
    @SerializedName("minimumSupportedOperatingSystem")
    @Expose
    public IosMinimumOperatingSystem minimumSupportedOperatingSystem;


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
