// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedDeviceLogoutSharedAppleDeviceActiveUserRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceLogoutSharedAppleDeviceActiveUserRequest;

/**
 * The class for the Base Managed Device Logout Shared Apple Device Active User Request Builder.
 */
public class BaseManagedDeviceLogoutSharedAppleDeviceActiveUserRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceLogoutSharedAppleDeviceActiveUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedDeviceLogoutSharedAppleDeviceActiveUserRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IManagedDeviceLogoutSharedAppleDeviceActiveUserRequest
     *
     * @return the IManagedDeviceLogoutSharedAppleDeviceActiveUserRequest instance
     */
    public IManagedDeviceLogoutSharedAppleDeviceActiveUserRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedDeviceLogoutSharedAppleDeviceActiveUserRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceLogoutSharedAppleDeviceActiveUserRequest instance
     */
    public IManagedDeviceLogoutSharedAppleDeviceActiveUserRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedDeviceLogoutSharedAppleDeviceActiveUserRequest request = new ManagedDeviceLogoutSharedAppleDeviceActiveUserRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
