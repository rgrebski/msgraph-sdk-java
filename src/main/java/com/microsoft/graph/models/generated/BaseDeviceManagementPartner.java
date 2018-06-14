// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Management Partner.
 */
public class BaseDeviceManagementPartner extends Entity implements IJsonBackedObject {


    /**
     * The Last Heartbeat Date Time.
     * Timestamp of last heartbeat after admin enabled option Connect to Device management Partner
     */
    @SerializedName("lastHeartbeatDateTime")
    @Expose
    public java.util.Calendar lastHeartbeatDateTime;

    /**
     * The Partner State.
     * Partner state of this tenant Possible values are: unknown, unavailable, enabled, terminated, rejected, unresponsive.
     */
    @SerializedName("partnerState")
    @Expose
    public DeviceManagementPartnerTenantState partnerState;

    /**
     * The Partner App Type.
     * Partner App type Possible values are: unknown, singleTenantApp, multiTenantApp.
     */
    @SerializedName("partnerAppType")
    @Expose
    public DeviceManagementPartnerAppType partnerAppType;

    /**
     * The Single Tenant App Id.
     * Partner Single tenant App id
     */
    @SerializedName("singleTenantAppId")
    @Expose
    public String singleTenantAppId;

    /**
     * The Display Name.
     * Partner display name
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Is Configured.
     * Whether device management partner is configured or not
     */
    @SerializedName("isConfigured")
    @Expose
    public Boolean isConfigured;

    /**
     * The When Partner Devices Will Be Removed Date Time.
     * DateTime in UTC when PartnerDevices will be removed
     */
    @SerializedName("whenPartnerDevicesWillBeRemovedDateTime")
    @Expose
    public java.util.Calendar whenPartnerDevicesWillBeRemovedDateTime;

    /**
     * The When Partner Devices Will Be Marked As Non Compliant Date Time.
     * DateTime in UTC when PartnerDevices will be marked as NonCompliant
     */
    @SerializedName("whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime")
    @Expose
    public java.util.Calendar whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime;


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
