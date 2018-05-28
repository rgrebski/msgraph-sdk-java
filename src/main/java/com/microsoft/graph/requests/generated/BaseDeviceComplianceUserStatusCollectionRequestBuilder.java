// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusCollectionRequest;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Compliance User Status Collection Request Builder.
 */
public class BaseDeviceComplianceUserStatusCollectionRequestBuilder extends BaseRequestBuilder implements IBaseDeviceComplianceUserStatusCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDeviceComplianceUserStatusCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDeviceComplianceUserStatusCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceComplianceUserStatusCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DeviceComplianceUserStatusCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceComplianceUserStatusRequestBuilder byId(final String id) {
        return new DeviceComplianceUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
