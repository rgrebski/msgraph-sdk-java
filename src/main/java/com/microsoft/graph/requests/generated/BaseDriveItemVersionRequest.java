// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.DriveItemVersion;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.DriveItemVersionRequest;
import com.microsoft.graph.requests.extensions.IDriveItemVersionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Drive Item Version Request.
 */
public class BaseDriveItemVersionRequest extends BaseRequest implements IBaseDriveItemVersionRequest {

    /**
     * The request for the DriveItemVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDriveItemVersionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<DriveItemVersion> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DriveItemVersion from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DriveItemVersion> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DriveItemVersion from the service
     *
     * @return the DriveItemVersion from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DriveItemVersion get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this DriveItemVersion with a source
     *
     * @param sourceDriveItemVersion the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DriveItemVersion sourceDriveItemVersion, final ICallback<DriveItemVersion> callback) {
        send(HttpMethod.PATCH, callback, sourceDriveItemVersion);
    }

    /**
     * Patches this DriveItemVersion with a source
     *
     * @param sourceDriveItemVersion the source object with updates
     * @return the updated DriveItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DriveItemVersion patch(final DriveItemVersion sourceDriveItemVersion) throws ClientException {
        return send(HttpMethod.PATCH, sourceDriveItemVersion);
    }

    /**
     * Creates a DriveItemVersion with a new object
     *
     * @param newDriveItemVersion the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DriveItemVersion newDriveItemVersion, final ICallback<DriveItemVersion> callback) {
        send(HttpMethod.POST, callback, newDriveItemVersion);
    }

    /**
     * Creates a DriveItemVersion with a new object
     *
     * @param newDriveItemVersion the new object to create
     * @return the created DriveItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DriveItemVersion post(final DriveItemVersion newDriveItemVersion) throws ClientException {
        return send(HttpMethod.POST, newDriveItemVersion);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDriveItemVersionRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DriveItemVersionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDriveItemVersionRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DriveItemVersionRequest)this;
     }

}

