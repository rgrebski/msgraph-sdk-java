// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedDeviceSyncDeviceRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceSyncDeviceRequest;

/**
 * The class for the Base Managed Device Sync Device Request Builder.
 */
public class BaseManagedDeviceSyncDeviceRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceSyncDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedDeviceSyncDeviceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IManagedDeviceSyncDeviceRequest
     *
     * @return the IManagedDeviceSyncDeviceRequest instance
     */
    public IManagedDeviceSyncDeviceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedDeviceSyncDeviceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceSyncDeviceRequest instance
     */
    public IManagedDeviceSyncDeviceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedDeviceSyncDeviceRequest request = new ManagedDeviceSyncDeviceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
