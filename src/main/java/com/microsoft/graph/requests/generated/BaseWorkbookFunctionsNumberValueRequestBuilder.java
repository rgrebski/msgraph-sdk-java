// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNumberValueRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNumberValueRequest;

/**
 * The class for the Base Workbook Functions Number Value Request Builder.
 */
public class BaseWorkbookFunctionsNumberValueRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNumberValue
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     * @param decimalSeparator the decimalSeparator
     * @param groupSeparator the groupSeparator
     */
    public BaseWorkbookFunctionsNumberValueRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement text, final com.google.gson.JsonElement decimalSeparator, final com.google.gson.JsonElement groupSeparator) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text", text);
        bodyParams.put("decimalSeparator", decimalSeparator);
        bodyParams.put("groupSeparator", groupSeparator);
    }

    /**
     * Creates the IWorkbookFunctionsNumberValueRequest
     *
     * @return the IWorkbookFunctionsNumberValueRequest instance
     */
    public IWorkbookFunctionsNumberValueRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsNumberValueRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNumberValueRequest instance
     */
    public IWorkbookFunctionsNumberValueRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsNumberValueRequest request = new WorkbookFunctionsNumberValueRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text")) {
            request.body.text = getParameter("text");
        }

        if (hasParameter("decimalSeparator")) {
            request.body.decimalSeparator = getParameter("decimalSeparator");
        }

        if (hasParameter("groupSeparator")) {
            request.body.groupSeparator = getParameter("groupSeparator");
        }

        return request;
    }
}
