// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPercentRank_ExcRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsPercentRank_ExcRequest;

/**
 * The class for the Base Workbook Functions Percent Rank_Exc Request Builder.
 */
public class BaseWorkbookFunctionsPercentRank_ExcRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPercentRank_Exc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param array the array
     * @param x the x
     * @param significance the significance
     */
    public BaseWorkbookFunctionsPercentRank_ExcRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement array, final com.google.gson.JsonElement x, final com.google.gson.JsonElement significance) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("array", array);
        bodyParams.put("x", x);
        bodyParams.put("significance", significance);
    }

    /**
     * Creates the IWorkbookFunctionsPercentRank_ExcRequest
     *
     * @return the IWorkbookFunctionsPercentRank_ExcRequest instance
     */
    public IWorkbookFunctionsPercentRank_ExcRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPercentRank_ExcRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPercentRank_ExcRequest instance
     */
    public IWorkbookFunctionsPercentRank_ExcRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsPercentRank_ExcRequest request = new WorkbookFunctionsPercentRank_ExcRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("array")) {
            request.body.array = getParameter("array");
        }

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        if (hasParameter("significance")) {
            request.body.significance = getParameter("significance");
        }

        return request;
    }
}
