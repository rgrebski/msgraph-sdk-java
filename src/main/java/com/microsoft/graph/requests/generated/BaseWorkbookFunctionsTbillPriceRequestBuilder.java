// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsTbillPriceRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsTbillPriceRequest;

/**
 * The class for the Base Workbook Functions Tbill Price Request Builder.
 */
public class BaseWorkbookFunctionsTbillPriceRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsTbillPrice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param discount the discount
     */
    public BaseWorkbookFunctionsTbillPriceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement discount) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("settlement", settlement);
        bodyParams.put("maturity", maturity);
        bodyParams.put("discount", discount);
    }

    /**
     * Creates the IWorkbookFunctionsTbillPriceRequest
     *
     * @return the IWorkbookFunctionsTbillPriceRequest instance
     */
    public IWorkbookFunctionsTbillPriceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsTbillPriceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsTbillPriceRequest instance
     */
    public IWorkbookFunctionsTbillPriceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsTbillPriceRequest request = new WorkbookFunctionsTbillPriceRequest(
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

        return request;
    }
}
