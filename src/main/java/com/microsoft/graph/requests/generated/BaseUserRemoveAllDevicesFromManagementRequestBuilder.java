// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IUserRemoveAllDevicesFromManagementRequest;
import com.microsoft.graph.requests.extensions.UserRemoveAllDevicesFromManagementRequest;

/**
 * The class for the Base User Remove All Devices From Management Request Builder.
 */
public class BaseUserRemoveAllDevicesFromManagementRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this UserRemoveAllDevicesFromManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseUserRemoveAllDevicesFromManagementRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IUserRemoveAllDevicesFromManagementRequest
     *
     * @return the IUserRemoveAllDevicesFromManagementRequest instance
     */
    public IUserRemoveAllDevicesFromManagementRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IUserRemoveAllDevicesFromManagementRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IUserRemoveAllDevicesFromManagementRequest instance
     */
    public IUserRemoveAllDevicesFromManagementRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        UserRemoveAllDevicesFromManagementRequest request = new UserRemoveAllDevicesFromManagementRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
