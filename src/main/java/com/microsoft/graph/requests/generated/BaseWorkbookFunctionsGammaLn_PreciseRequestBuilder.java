// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsGammaLn_PreciseRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsGammaLn_PreciseRequest;

/**
 * The class for the Base Workbook Functions Gamma Ln_Precise Request Builder.
 */
public class BaseWorkbookFunctionsGammaLn_PreciseRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsGammaLn_Precise
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     */
    public BaseWorkbookFunctionsGammaLn_PreciseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement x) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
    }

    /**
     * Creates the IWorkbookFunctionsGammaLn_PreciseRequest
     *
     * @return the IWorkbookFunctionsGammaLn_PreciseRequest instance
     */
    public IWorkbookFunctionsGammaLn_PreciseRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsGammaLn_PreciseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsGammaLn_PreciseRequest instance
     */
    public IWorkbookFunctionsGammaLn_PreciseRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsGammaLn_PreciseRequest request = new WorkbookFunctionsGammaLn_PreciseRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        return request;
    }
}
