// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsReceivedRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsReceivedRequest;

/**
 * The class for the Base Workbook Functions Received Request Builder.
 */
public class BaseWorkbookFunctionsReceivedRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsReceived
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param investment the investment
     * @param discount the discount
     * @param basis the basis
     */
    public BaseWorkbookFunctionsReceivedRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement investment, final com.google.gson.JsonElement discount, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("settlement", settlement);
        bodyParams.put("maturity", maturity);
        bodyParams.put("investment", investment);
        bodyParams.put("discount", discount);
        bodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsReceivedRequest
     *
     * @return the IWorkbookFunctionsReceivedRequest instance
     */
    public IWorkbookFunctionsReceivedRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsReceivedRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsReceivedRequest instance
     */
    public IWorkbookFunctionsReceivedRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsReceivedRequest request = new WorkbookFunctionsReceivedRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("settlement")) {
            request.body.settlement = getParameter("settlement");
        }

        if (hasParameter("maturity")) {
            request.body.maturity = getParameter("maturity");
        }

        if (hasParameter("investment")) {
            request.body.investment = getParameter("investment");
        }

        if (hasParameter("discount")) {
            request.body.discount = getParameter("discount");
        }

        if (hasParameter("basis")) {
            request.body.basis = getParameter("basis");
        }

        return request;
    }
}
