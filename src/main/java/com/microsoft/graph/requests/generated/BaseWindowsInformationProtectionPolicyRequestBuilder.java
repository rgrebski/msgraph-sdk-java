// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionPolicyRequest;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionPolicyRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Windows Information Protection Policy Request Builder.
 */
public class BaseWindowsInformationProtectionPolicyRequestBuilder extends BaseRequestBuilder implements IBaseWindowsInformationProtectionPolicyRequestBuilder {

    /**
     * The request builder for the WindowsInformationProtectionPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWindowsInformationProtectionPolicyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWindowsInformationProtectionPolicyRequest instance
     */
    public IWindowsInformationProtectionPolicyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindowsInformationProtectionPolicyRequest instance
     */
    public IWindowsInformationProtectionPolicyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WindowsInformationProtectionPolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }

}
