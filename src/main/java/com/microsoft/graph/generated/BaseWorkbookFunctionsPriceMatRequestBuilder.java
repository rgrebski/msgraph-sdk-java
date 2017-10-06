// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Price Mat Request Builder.
 */
public class BaseWorkbookFunctionsPriceMatRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPriceMat
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsPriceMatRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement issue, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement yld, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("settlement", settlement);
        mBodyParams.put("maturity", maturity);
        mBodyParams.put("issue", issue);
        mBodyParams.put("rate", rate);
        mBodyParams.put("yld", yld);
        mBodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsPriceMatRequest
     *
     * @return The IWorkbookFunctionsPriceMatRequest instance
     */
    public IWorkbookFunctionsPriceMatRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPriceMatRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsPriceMatRequest instance
     */
    public IWorkbookFunctionsPriceMatRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsPriceMatRequest request = new WorkbookFunctionsPriceMatRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("settlement")) {
            request.mBody.settlement = getParameter("settlement");
        }

        if (hasParameter("maturity")) {
            request.mBody.maturity = getParameter("maturity");
        }

        if (hasParameter("issue")) {
            request.mBody.issue = getParameter("issue");
        }

        if (hasParameter("rate")) {
            request.mBody.rate = getParameter("rate");
        }

        if (hasParameter("yld")) {
            request.mBody.yld = getParameter("yld");
        }

        if (hasParameter("basis")) {
            request.mBody.basis = getParameter("basis");
        }

        return request;
    }
}