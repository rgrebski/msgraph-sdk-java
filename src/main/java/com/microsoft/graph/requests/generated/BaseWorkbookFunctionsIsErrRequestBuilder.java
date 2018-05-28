// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIsErrRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsIsErrRequest;

/**
 * The class for the Base Workbook Functions Is Err Request Builder.
 */
public class BaseWorkbookFunctionsIsErrRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIsErr
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param value the value
     */
    public BaseWorkbookFunctionsIsErrRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement value) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("value", value);
    }

    /**
     * Creates the IWorkbookFunctionsIsErrRequest
     *
     * @return the IWorkbookFunctionsIsErrRequest instance
     */
    public IWorkbookFunctionsIsErrRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsIsErrRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIsErrRequest instance
     */
    public IWorkbookFunctionsIsErrRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsIsErrRequest request = new WorkbookFunctionsIsErrRequest(
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
