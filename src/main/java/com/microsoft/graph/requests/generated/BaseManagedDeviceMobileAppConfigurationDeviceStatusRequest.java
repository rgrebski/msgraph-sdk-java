// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationDeviceStatus;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceStatusRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationDeviceStatusRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed Device Mobile App Configuration Device Status Request.
 */
public class BaseManagedDeviceMobileAppConfigurationDeviceStatusRequest extends BaseRequest implements IBaseManagedDeviceMobileAppConfigurationDeviceStatusRequest {

    /**
     * The request for the ManagedDeviceMobileAppConfigurationDeviceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseManagedDeviceMobileAppConfigurationDeviceStatusRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<ManagedDeviceMobileAppConfigurationDeviceStatus> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationDeviceStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ManagedDeviceMobileAppConfigurationDeviceStatus> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationDeviceStatus from the service
     *
     * @return the ManagedDeviceMobileAppConfigurationDeviceStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationDeviceStatus get() throws ClientException {
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
     * Patches this ManagedDeviceMobileAppConfigurationDeviceStatus with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationDeviceStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedDeviceMobileAppConfigurationDeviceStatus sourceManagedDeviceMobileAppConfigurationDeviceStatus, final ICallback<ManagedDeviceMobileAppConfigurationDeviceStatus> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedDeviceMobileAppConfigurationDeviceStatus);
    }

    /**
     * Patches this ManagedDeviceMobileAppConfigurationDeviceStatus with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationDeviceStatus the source object with updates
     * @return the updated ManagedDeviceMobileAppConfigurationDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationDeviceStatus patch(final ManagedDeviceMobileAppConfigurationDeviceStatus sourceManagedDeviceMobileAppConfigurationDeviceStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedDeviceMobileAppConfigurationDeviceStatus);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationDeviceStatus with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationDeviceStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedDeviceMobileAppConfigurationDeviceStatus newManagedDeviceMobileAppConfigurationDeviceStatus, final ICallback<ManagedDeviceMobileAppConfigurationDeviceStatus> callback) {
        send(HttpMethod.POST, callback, newManagedDeviceMobileAppConfigurationDeviceStatus);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationDeviceStatus with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationDeviceStatus the new object to create
     * @return the created ManagedDeviceMobileAppConfigurationDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationDeviceStatus post(final ManagedDeviceMobileAppConfigurationDeviceStatus newManagedDeviceMobileAppConfigurationDeviceStatus) throws ClientException {
        return send(HttpMethod.POST, newManagedDeviceMobileAppConfigurationDeviceStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedDeviceMobileAppConfigurationDeviceStatusRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ManagedDeviceMobileAppConfigurationDeviceStatusRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedDeviceMobileAppConfigurationDeviceStatusRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ManagedDeviceMobileAppConfigurationDeviceStatusRequest)this;
     }

}

