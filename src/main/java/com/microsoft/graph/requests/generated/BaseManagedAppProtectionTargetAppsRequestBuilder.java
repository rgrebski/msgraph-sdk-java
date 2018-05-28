// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedAppProtectionTargetAppsRequest;
import com.microsoft.graph.requests.extensions.ManagedAppProtectionTargetAppsRequest;

/**
 * The class for the Base Managed App Protection Target Apps Request Builder.
 */
public class BaseManagedAppProtectionTargetAppsRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedAppProtectionTargetApps
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param apps the apps
     */
    public BaseManagedAppProtectionTargetAppsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<ManagedMobileApp> apps) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("apps", apps);
    }

    /**
     * Creates the IManagedAppProtectionTargetAppsRequest
     *
     * @return the IManagedAppProtectionTargetAppsRequest instance
     */
    public IManagedAppProtectionTargetAppsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedAppProtectionTargetAppsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedAppProtectionTargetAppsRequest instance
     */
    public IManagedAppProtectionTargetAppsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedAppProtectionTargetAppsRequest request = new ManagedAppProtectionTargetAppsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("apps")) {
            request.body.apps = getParameter("apps");
        }

        return request;
    }
}
