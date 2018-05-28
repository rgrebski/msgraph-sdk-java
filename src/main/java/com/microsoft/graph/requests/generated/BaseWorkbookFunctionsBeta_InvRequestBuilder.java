// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBeta_InvRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBeta_InvRequest;

/**
 * The class for the Base Workbook Functions Beta_Inv Request Builder.
 */
public class BaseWorkbookFunctionsBeta_InvRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBeta_Inv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param probability the probability
     * @param alpha the alpha
     * @param beta the beta
     * @param a the a
     * @param b the b
     */
    public BaseWorkbookFunctionsBeta_InvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement probability, final com.google.gson.JsonElement alpha, final com.google.gson.JsonElement beta, final com.google.gson.JsonElement a, final com.google.gson.JsonElement b) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("probability", probability);
        bodyParams.put("alpha", alpha);
        bodyParams.put("beta", beta);
        bodyParams.put("a", a);
        bodyParams.put("b", b);
    }

    /**
     * Creates the IWorkbookFunctionsBeta_InvRequest
     *
     * @return the IWorkbookFunctionsBeta_InvRequest instance
     */
    public IWorkbookFunctionsBeta_InvRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBeta_InvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBeta_InvRequest instance
     */
    public IWorkbookFunctionsBeta_InvRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsBeta_InvRequest request = new WorkbookFunctionsBeta_InvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("probability")) {
            request.body.probability = getParameter("probability");
        }

        if (hasParameter("alpha")) {
            request.body.alpha = getParameter("alpha");
        }

        if (hasParameter("beta")) {
            request.body.beta = getParameter("beta");
        }

        if (hasParameter("a")) {
            request.body.a = getParameter("a");
        }

        if (hasParameter("b")) {
            request.body.b = getParameter("b");
        }

        return request;
    }
}
