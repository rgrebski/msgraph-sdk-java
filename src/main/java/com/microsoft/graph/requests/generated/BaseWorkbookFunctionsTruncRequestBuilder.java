// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsTruncRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsTruncRequest;

/**
 * The class for the Base Workbook Functions Trunc Request Builder.
 */
public class BaseWorkbookFunctionsTruncRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsTrunc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param numDigits the numDigits
     */
    public BaseWorkbookFunctionsTruncRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement numDigits) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("numDigits", numDigits);
    }

    /**
     * Creates the IWorkbookFunctionsTruncRequest
     *
     * @return the IWorkbookFunctionsTruncRequest instance
     */
    public IWorkbookFunctionsTruncRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsTruncRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsTruncRequest instance
     */
    public IWorkbookFunctionsTruncRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsTruncRequest request = new WorkbookFunctionsTruncRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("numDigits")) {
            request.body.numDigits = getParameter("numDigits");
        }

        return request;
    }
}
