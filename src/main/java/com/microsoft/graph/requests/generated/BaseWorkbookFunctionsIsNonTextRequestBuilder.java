// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIsNonTextRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsIsNonTextRequest;

/**
 * The class for the Base Workbook Functions Is Non Text Request Builder.
 */
public class BaseWorkbookFunctionsIsNonTextRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIsNonText
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param value the value
     */
    public BaseWorkbookFunctionsIsNonTextRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement value) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("value", value);
    }

    /**
     * Creates the IWorkbookFunctionsIsNonTextRequest
     *
     * @return the IWorkbookFunctionsIsNonTextRequest instance
     */
    public IWorkbookFunctionsIsNonTextRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsIsNonTextRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIsNonTextRequest instance
     */
    public IWorkbookFunctionsIsNonTextRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsIsNonTextRequest request = new WorkbookFunctionsIsNonTextRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("value")) {
            request.body.value = getParameter("value");
        }

        return request;
    }
}
