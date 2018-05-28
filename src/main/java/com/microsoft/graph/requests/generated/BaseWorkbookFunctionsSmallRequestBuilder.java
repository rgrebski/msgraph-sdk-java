// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsSmallRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsSmallRequest;

/**
 * The class for the Base Workbook Functions Small Request Builder.
 */
public class BaseWorkbookFunctionsSmallRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSmall
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param array the array
     * @param k the k
     */
    public BaseWorkbookFunctionsSmallRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement array, final com.google.gson.JsonElement k) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("array", array);
        bodyParams.put("k", k);
    }

    /**
     * Creates the IWorkbookFunctionsSmallRequest
     *
     * @return the IWorkbookFunctionsSmallRequest instance
     */
    public IWorkbookFunctionsSmallRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsSmallRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSmallRequest instance
     */
    public IWorkbookFunctionsSmallRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsSmallRequest request = new WorkbookFunctionsSmallRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("array")) {
            request.body.array = getParameter("array");
        }

        if (hasParameter("k")) {
            request.body.k = getParameter("k");
        }

        return request;
    }
}
