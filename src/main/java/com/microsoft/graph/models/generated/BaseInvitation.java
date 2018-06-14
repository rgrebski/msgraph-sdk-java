// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.models.extensions.InvitedUserMessageInfo;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Invitation.
 */
public class BaseInvitation extends Entity implements IJsonBackedObject {


    /**
     * The Invited User Display Name.
     * 
     */
    @SerializedName("invitedUserDisplayName")
    @Expose
    public String invitedUserDisplayName;

    /**
     * The Invited User Type.
     * 
     */
    @SerializedName("invitedUserType")
    @Expose
    public String invitedUserType;

    /**
     * The Invited User Email Address.
     * 
     */
    @SerializedName("invitedUserEmailAddress")
    @Expose
    public String invitedUserEmailAddress;

    /**
     * The Invited User Message Info.
     * 
     */
    @SerializedName("invitedUserMessageInfo")
    @Expose
    public InvitedUserMessageInfo invitedUserMessageInfo;

    /**
     * The Send Invitation Message.
     * 
     */
    @SerializedName("sendInvitationMessage")
    @Expose
    public Boolean sendInvitationMessage;

    /**
     * The Invite Redirect Url.
     * 
     */
    @SerializedName("inviteRedirectUrl")
    @Expose
    public String inviteRedirectUrl;

    /**
     * The Invite Redeem Url.
     * 
     */
    @SerializedName("inviteRedeemUrl")
    @Expose
    public String inviteRedeemUrl;

    /**
     * The Status.
     * 
     */
    @SerializedName("status")
    @Expose
    public String status;

    /**
     * The Invited User.
     * 
     */
    @SerializedName("invitedUser")
    @Expose
    public User invitedUser;


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
