// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyState;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateRequest;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Compliance Policy State Request.
 */
public class BaseDeviceCompliancePolicyStateRequest extends BaseRequest implements IBaseDeviceCompliancePolicyStateRequest {

    /**
     * The request for the DeviceCompliancePolicyState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDeviceCompliancePolicyStateRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<DeviceCompliancePolicyState> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DeviceCompliancePolicyState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceCompliancePolicyState> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceCompliancePolicyState from the service
     *
     * @return the DeviceCompliancePolicyState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyState get() throws ClientException {
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
     * Patches this DeviceCompliancePolicyState with a source
     *
     * @param sourceDeviceCompliancePolicyState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceCompliancePolicyState sourceDeviceCompliancePolicyState, final ICallback<DeviceCompliancePolicyState> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceCompliancePolicyState);
    }

    /**
     * Patches this DeviceCompliancePolicyState with a source
     *
     * @param sourceDeviceCompliancePolicyState the source object with updates
     * @return the updated DeviceCompliancePolicyState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyState patch(final DeviceCompliancePolicyState sourceDeviceCompliancePolicyState) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCompliancePolicyState);
    }

    /**
     * Creates a DeviceCompliancePolicyState with a new object
     *
     * @param newDeviceCompliancePolicyState the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceCompliancePolicyState newDeviceCompliancePolicyState, final ICallback<DeviceCompliancePolicyState> callback) {
        send(HttpMethod.POST, callback, newDeviceCompliancePolicyState);
    }

    /**
     * Creates a DeviceCompliancePolicyState with a new object
     *
     * @param newDeviceCompliancePolicyState the new object to create
     * @return the created DeviceCompliancePolicyState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyState post(final DeviceCompliancePolicyState newDeviceCompliancePolicyState) throws ClientException {
        return send(HttpMethod.POST, newDeviceCompliancePolicyState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyStateRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceCompliancePolicyStateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyStateRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceCompliancePolicyStateRequest)this;
     }

}

