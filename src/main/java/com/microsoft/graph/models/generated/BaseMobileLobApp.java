// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import java.util.Arrays;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.models.extensions.MobileAppContent;
import com.microsoft.graph.requests.extensions.MobileAppContentCollectionPage;
import com.microsoft.graph.requests.generated.BaseMobileAppContentCollectionResponse;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Mobile Lob App.
 */
public class BaseMobileLobApp extends MobileApp implements IJsonBackedObject {


    /**
     * The Committed Content Version.
     * The internal committed content version.
     */
    @SerializedName("committedContentVersion")
    @Expose
    public String committedContentVersion;

    /**
     * The File Name.
     * The name of the main Lob application file.
     */
    @SerializedName("fileName")
    @Expose
    public String fileName;

    /**
     * The Size.
     * The total size, including all uploaded files.
     */
    @SerializedName("size")
    @Expose
    public Long size;

    /**
     * The Content Versions.
     * The list of content versions for this app.
     */
    public MobileAppContentCollectionPage contentVersions;


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


        if (json.has("contentVersions")) {
            final BaseMobileAppContentCollectionResponse response = new BaseMobileAppContentCollectionResponse();
            if (json.has("contentVersions@odata.nextLink")) {
                response.nextLink = json.get("contentVersions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("contentVersions").toString(), JsonObject[].class);
            final MobileAppContent[] array = new MobileAppContent[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MobileAppContent.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            contentVersions = new MobileAppContentCollectionPage(response, null);
        }
    }
}
