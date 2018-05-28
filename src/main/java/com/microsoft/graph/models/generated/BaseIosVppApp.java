// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.extensions.IosDeviceType;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.models.extensions.VppLicensingType;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Ios Vpp App.
 */
public class BaseIosVppApp extends MobileApp implements IJsonBackedObject {


    /**
     * The Used License Count.
     * The number of VPP licenses in use.
     */
    @SerializedName("usedLicenseCount")
    @Expose
    public Integer usedLicenseCount;

    /**
     * The Total License Count.
     * The total number of VPP licenses.
     */
    @SerializedName("totalLicenseCount")
    @Expose
    public Integer totalLicenseCount;

    /**
     * The Release Date Time.
     * The VPP application release date and time.
     */
    @SerializedName("releaseDateTime")
    @Expose
    public java.util.Calendar releaseDateTime;

    /**
     * The App Store Url.
     * The store URL.
     */
    @SerializedName("appStoreUrl")
    @Expose
    public String appStoreUrl;

    /**
     * The Licensing Type.
     * The supported License Type.
     */
    @SerializedName("licensingType")
    @Expose
    public VppLicensingType licensingType;

    /**
     * The Applicable Device Type.
     * The applicable iOS Device Type.
     */
    @SerializedName("applicableDeviceType")
    @Expose
    public IosDeviceType applicableDeviceType;

    /**
     * The Vpp Token Organization Name.
     * The organization associated with the Apple Volume Purchase Program Token
     */
    @SerializedName("vppTokenOrganizationName")
    @Expose
    public String vppTokenOrganizationName;

    /**
     * The Vpp Token Account Type.
     * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible values are: business, education. Possible values are: business, education.
     */
    @SerializedName("vppTokenAccountType")
    @Expose
    public VppTokenAccountType vppTokenAccountType;

    /**
     * The Vpp Token Apple Id.
     * The Apple Id associated with the given Apple Volume Purchase Program Token.
     */
    @SerializedName("vppTokenAppleId")
    @Expose
    public String vppTokenAppleId;

    /**
     * The Bundle Id.
     * The Identity Name.
     */
    @SerializedName("bundleId")
    @Expose
    public String bundleId;


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
