// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.AndroidCompliancePolicyRequest;
import com.microsoft.graph.requests.extensions.IAndroidCompliancePolicyRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Android Compliance Policy Request Builder.
 */
public class BaseAndroidCompliancePolicyRequestBuilder extends BaseRequestBuilder implements IBaseAndroidCompliancePolicyRequestBuilder {

    /**
     * The request builder for the AndroidCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseAndroidCompliancePolicyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IAndroidCompliancePolicyRequest instance
     */
    public IAndroidCompliancePolicyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAndroidCompliancePolicyRequest instance
     */
    public IAndroidCompliancePolicyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new AndroidCompliancePolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }

}
