// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsLogNorm_InvRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsLogNorm_InvRequest;

/**
 * The class for the Base Workbook Functions Log Norm_Inv Request Builder.
 */
public class BaseWorkbookFunctionsLogNorm_InvRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsLogNorm_Inv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param probability the probability
     * @param mean the mean
     * @param standardDev the standardDev
     */
    public BaseWorkbookFunctionsLogNorm_InvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement probability, final com.google.gson.JsonElement mean, final com.google.gson.JsonElement standardDev) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("probability", probability);
        bodyParams.put("mean", mean);
        bodyParams.put("standardDev", standardDev);
    }

    /**
     * Creates the IWorkbookFunctionsLogNorm_InvRequest
     *
     * @return the IWorkbookFunctionsLogNorm_InvRequest instance
     */
    public IWorkbookFunctionsLogNorm_InvRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsLogNorm_InvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsLogNorm_InvRequest instance
     */
    public IWorkbookFunctionsLogNorm_InvRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsLogNorm_InvRequest request = new WorkbookFunctionsLogNorm_InvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("probability")) {
            request.body.probability = getParameter("probability");
        }

        if (hasParameter("mean")) {
            request.body.mean = getParameter("mean");
        }

        if (hasParameter("standardDev")) {
            request.body.standardDev = getParameter("standardDev");
        }

        return request;
    }
}
