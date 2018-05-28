// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPoisson_DistRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsPoisson_DistRequest;

/**
 * The class for the Base Workbook Functions Poisson_Dist Request Builder.
 */
public class BaseWorkbookFunctionsPoisson_DistRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPoisson_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param mean the mean
     * @param cumulative the cumulative
     */
    public BaseWorkbookFunctionsPoisson_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement mean, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
        bodyParams.put("mean", mean);
        bodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsPoisson_DistRequest
     *
     * @return the IWorkbookFunctionsPoisson_DistRequest instance
     */
    public IWorkbookFunctionsPoisson_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPoisson_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPoisson_DistRequest instance
     */
    public IWorkbookFunctionsPoisson_DistRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsPoisson_DistRequest request = new WorkbookFunctionsPoisson_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        if (hasParameter("mean")) {
            request.body.mean = getParameter("mean");
        }

        if (hasParameter("cumulative")) {
            request.body.cumulative = getParameter("cumulative");
        }

        return request;
    }
}
