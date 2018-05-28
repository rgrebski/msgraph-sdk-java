// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNegBinom_DistRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNegBinom_DistRequest;

/**
 * The class for the Base Workbook Functions Neg Binom_Dist Request Builder.
 */
public class BaseWorkbookFunctionsNegBinom_DistRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNegBinom_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param numberF the numberF
     * @param numberS the numberS
     * @param probabilityS the probabilityS
     * @param cumulative the cumulative
     */
    public BaseWorkbookFunctionsNegBinom_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement numberF, final com.google.gson.JsonElement numberS, final com.google.gson.JsonElement probabilityS, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("numberF", numberF);
        bodyParams.put("numberS", numberS);
        bodyParams.put("probabilityS", probabilityS);
        bodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsNegBinom_DistRequest
     *
     * @return the IWorkbookFunctionsNegBinom_DistRequest instance
     */
    public IWorkbookFunctionsNegBinom_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsNegBinom_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNegBinom_DistRequest instance
     */
    public IWorkbookFunctionsNegBinom_DistRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsNegBinom_DistRequest request = new WorkbookFunctionsNegBinom_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("numberF")) {
            request.body.numberF = getParameter("numberF");
        }

        if (hasParameter("numberS")) {
            request.body.numberS = getParameter("numberS");
        }

        if (hasParameter("probabilityS")) {
            request.body.probabilityS = getParameter("probabilityS");
        }

        if (hasParameter("cumulative")) {
            request.body.cumulative = getParameter("cumulative");
        }

        return request;
    }
}
