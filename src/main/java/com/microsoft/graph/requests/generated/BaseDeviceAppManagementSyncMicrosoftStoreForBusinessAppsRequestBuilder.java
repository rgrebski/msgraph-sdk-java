// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest;

/**
 * The class for the Base Device App Management Sync Microsoft Store For Business Apps Request Builder.
 */
public class BaseDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this DeviceAppManagementSyncMicrosoftStoreForBusinessApps
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest
     *
     * @return the IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest instance
     */
    public IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest instance
     */
    public IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest request = new DeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
