// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsValueRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsValueRequest;

/**
 * The class for the Base Workbook Functions Value Request Builder.
 */
public class BaseWorkbookFunctionsValueRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsValue
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     */
    public BaseWorkbookFunctionsValueRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement text) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text", text);
    }

    /**
     * Creates the IWorkbookFunctionsValueRequest
     *
     * @return the IWorkbookFunctionsValueRequest instance
     */
    public IWorkbookFunctionsValueRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsValueRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsValueRequest instance
     */
    public IWorkbookFunctionsValueRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsValueRequest request = new WorkbookFunctionsValueRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text")) {
            request.body.text = getParameter("text");
        }

        return request;
    }
}
