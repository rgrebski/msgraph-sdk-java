// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsOddLPriceRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsOddLPriceRequest;

/**
 * The class for the Base Workbook Functions Odd LPrice Request Builder.
 */
public class BaseWorkbookFunctionsOddLPriceRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsOddLPrice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param lastInterest the lastInterest
     * @param rate the rate
     * @param yld the yld
     * @param redemption the redemption
     * @param frequency the frequency
     * @param basis the basis
     */
    public BaseWorkbookFunctionsOddLPriceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement lastInterest, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement yld, final com.google.gson.JsonElement redemption, final com.google.gson.JsonElement frequency, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("settlement", settlement);
        bodyParams.put("maturity", maturity);
        bodyParams.put("lastInterest", lastInterest);
        bodyParams.put("rate", rate);
        bodyParams.put("yld", yld);
        bodyParams.put("redemption", redemption);
        bodyParams.put("frequency", frequency);
        bodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsOddLPriceRequest
     *
     * @return the IWorkbookFunctionsOddLPriceRequest instance
     */
    public IWorkbookFunctionsOddLPriceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsOddLPriceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsOddLPriceRequest instance
     */
    public IWorkbookFunctionsOddLPriceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsOddLPriceRequest request = new WorkbookFunctionsOddLPriceRequest(
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

        if (hasParameter("lastInterest")) {
            request.body.lastInterest = getParameter("lastInterest");
        }

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("yld")) {
            request.body.yld = getParameter("yld");
        }

        if (hasParameter("redemption")) {
            request.body.redemption = getParameter("redemption");
        }

        if (hasParameter("frequency")) {
            request.body.frequency = getParameter("frequency");
        }

        if (hasParameter("basis")) {
            request.body.basis = getParameter("basis");
        }

        return request;
    }
}
