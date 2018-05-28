// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImExpRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsImExpRequest;

/**
 * The class for the Base Workbook Functions Im Exp Request Builder.
 */
public class BaseWorkbookFunctionsImExpRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsImExp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param inumber the inumber
     */
    public BaseWorkbookFunctionsImExpRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement inumber) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("inumber", inumber);
    }

    /**
     * Creates the IWorkbookFunctionsImExpRequest
     *
     * @return the IWorkbookFunctionsImExpRequest instance
     */
    public IWorkbookFunctionsImExpRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsImExpRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImExpRequest instance
     */
    public IWorkbookFunctionsImExpRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsImExpRequest request = new WorkbookFunctionsImExpRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("inumber")) {
            request.body.inumber = getParameter("inumber");
        }

        return request;
    }
}
