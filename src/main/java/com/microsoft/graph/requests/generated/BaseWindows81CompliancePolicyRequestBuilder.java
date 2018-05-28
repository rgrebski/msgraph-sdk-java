// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWindows81CompliancePolicyRequest;
import com.microsoft.graph.requests.extensions.Windows81CompliancePolicyRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Windows81Compliance Policy Request Builder.
 */
public class BaseWindows81CompliancePolicyRequestBuilder extends BaseRequestBuilder implements IBaseWindows81CompliancePolicyRequestBuilder {

    /**
     * The request builder for the Windows81CompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWindows81CompliancePolicyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWindows81CompliancePolicyRequest instance
     */
    public IWindows81CompliancePolicyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindows81CompliancePolicyRequest instance
     */
    public IWindows81CompliancePolicyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new Windows81CompliancePolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }

}
