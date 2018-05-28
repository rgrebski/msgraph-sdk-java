// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedDeviceWipeRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceWipeRequest;

/**
 * The class for the Base Managed Device Wipe Request Builder.
 */
public class BaseManagedDeviceWipeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceWipe
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param keepEnrollmentData the keepEnrollmentData
     * @param keepUserData the keepUserData
     * @param macOsUnlockCode the macOsUnlockCode
     */
    public BaseManagedDeviceWipeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean keepEnrollmentData, final Boolean keepUserData, final String macOsUnlockCode) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("keepEnrollmentData", keepEnrollmentData);
        bodyParams.put("keepUserData", keepUserData);
        bodyParams.put("macOsUnlockCode", macOsUnlockCode);
    }

    /**
     * Creates the IManagedDeviceWipeRequest
     *
     * @return the IManagedDeviceWipeRequest instance
     */
    public IManagedDeviceWipeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedDeviceWipeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceWipeRequest instance
     */
    public IManagedDeviceWipeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedDeviceWipeRequest request = new ManagedDeviceWipeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("keepEnrollmentData")) {
            request.body.keepEnrollmentData = getParameter("keepEnrollmentData");
        }

        if (hasParameter("keepUserData")) {
            request.body.keepUserData = getParameter("keepUserData");
        }

        if (hasParameter("macOsUnlockCode")) {
            request.body.macOsUnlockCode = getParameter("macOsUnlockCode");
        }

        return request;
    }
}
