// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppPolicyAssignmentRequest;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Targeted Managed App Policy Assignment Request Builder.
 */
public class BaseTargetedManagedAppPolicyAssignmentRequestBuilder extends BaseRequestBuilder implements IBaseTargetedManagedAppPolicyAssignmentRequestBuilder {

    /**
     * The request builder for the TargetedManagedAppPolicyAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseTargetedManagedAppPolicyAssignmentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ITargetedManagedAppPolicyAssignmentRequest instance
     */
    public ITargetedManagedAppPolicyAssignmentRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITargetedManagedAppPolicyAssignmentRequest instance
     */
    public ITargetedManagedAppPolicyAssignmentRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new TargetedManagedAppPolicyAssignmentRequest(getRequestUrl(), getClient(), requestOptions);
    }

}
