// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IPlannerTaskDetailsRequest;
import com.microsoft.graph.requests.extensions.PlannerTaskDetailsRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner Task Details Request Builder.
 */
public class BasePlannerTaskDetailsRequestBuilder extends BaseRequestBuilder implements IBasePlannerTaskDetailsRequestBuilder {

    /**
     * The request builder for the PlannerTaskDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BasePlannerTaskDetailsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IPlannerTaskDetailsRequest instance
     */
    public IPlannerTaskDetailsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPlannerTaskDetailsRequest instance
     */
    public IPlannerTaskDetailsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new PlannerTaskDetailsRequest(getRequestUrl(), getClient(), requestOptions);
    }

}
