// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDollarFrRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDollarFrRequest;

/**
 * The class for the Base Workbook Functions Dollar Fr Request Builder.
 */
public class BaseWorkbookFunctionsDollarFrRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDollarFr
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param decimalDollar the decimalDollar
     * @param fraction the fraction
     */
    public BaseWorkbookFunctionsDollarFrRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement decimalDollar, final com.google.gson.JsonElement fraction) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("decimalDollar", decimalDollar);
        bodyParams.put("fraction", fraction);
    }

    /**
     * Creates the IWorkbookFunctionsDollarFrRequest
     *
     * @return the IWorkbookFunctionsDollarFrRequest instance
     */
    public IWorkbookFunctionsDollarFrRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDollarFrRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDollarFrRequest instance
     */
    public IWorkbookFunctionsDollarFrRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsDollarFrRequest request = new WorkbookFunctionsDollarFrRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("decimalDollar")) {
            request.body.decimalDollar = getParameter("decimalDollar");
        }

        if (hasParameter("fraction")) {
            request.body.fraction = getParameter("fraction");
        }

        return request;
    }
}
