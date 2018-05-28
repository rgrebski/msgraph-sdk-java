// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPriceDiscRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsPriceDiscRequest;

/**
 * The class for the Base Workbook Functions Price Disc Request Builder.
 */
public class BaseWorkbookFunctionsPriceDiscRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPriceDisc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param discount the discount
     * @param redemption the redemption
     * @param basis the basis
     */
    public BaseWorkbookFunctionsPriceDiscRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement discount, final com.google.gson.JsonElement redemption, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("settlement", settlement);
        bodyParams.put("maturity", maturity);
        bodyParams.put("discount", discount);
        bodyParams.put("redemption", redemption);
        bodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsPriceDiscRequest
     *
     * @return the IWorkbookFunctionsPriceDiscRequest instance
     */
    public IWorkbookFunctionsPriceDiscRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPriceDiscRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPriceDiscRequest instance
     */
    public IWorkbookFunctionsPriceDiscRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsPriceDiscRequest request = new WorkbookFunctionsPriceDiscRequest(
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

        if (hasParameter("discount")) {
            request.body.discount = getParameter("discount");
        }

        if (hasParameter("redemption")) {
            request.body.redemption = getParameter("redemption");
        }

        if (hasParameter("basis")) {
            request.body.basis = getParameter("basis");
        }

        return request;
    }
}
