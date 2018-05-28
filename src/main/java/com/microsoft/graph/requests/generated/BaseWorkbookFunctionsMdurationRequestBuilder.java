// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsMdurationRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsMdurationRequest;

/**
 * The class for the Base Workbook Functions Mduration Request Builder.
 */
public class BaseWorkbookFunctionsMdurationRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsMduration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param coupon the coupon
     * @param yld the yld
     * @param frequency the frequency
     * @param basis the basis
     */
    public BaseWorkbookFunctionsMdurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement coupon, final com.google.gson.JsonElement yld, final com.google.gson.JsonElement frequency, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("settlement", settlement);
        bodyParams.put("maturity", maturity);
        bodyParams.put("coupon", coupon);
        bodyParams.put("yld", yld);
        bodyParams.put("frequency", frequency);
        bodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsMdurationRequest
     *
     * @return the IWorkbookFunctionsMdurationRequest instance
     */
    public IWorkbookFunctionsMdurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsMdurationRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsMdurationRequest instance
     */
    public IWorkbookFunctionsMdurationRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsMdurationRequest request = new WorkbookFunctionsMdurationRequest(
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

        if (hasParameter("coupon")) {
            request.body.coupon = getParameter("coupon");
        }

        if (hasParameter("yld")) {
            request.body.yld = getParameter("yld");
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
