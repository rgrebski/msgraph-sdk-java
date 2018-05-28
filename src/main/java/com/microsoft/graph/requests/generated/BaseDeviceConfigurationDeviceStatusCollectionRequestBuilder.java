// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStatusCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusCollectionRequest;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Configuration Device Status Collection Request Builder.
 */
public class BaseDeviceConfigurationDeviceStatusCollectionRequestBuilder extends BaseRequestBuilder implements IBaseDeviceConfigurationDeviceStatusCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDeviceConfigurationDeviceStatusCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDeviceConfigurationDeviceStatusCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceConfigurationDeviceStatusCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DeviceConfigurationDeviceStatusCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceConfigurationDeviceStatusRequestBuilder byId(final String id) {
        return new DeviceConfigurationDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
