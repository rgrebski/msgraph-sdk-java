// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNaRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNaRequest;

/**
 * The class for the Base Workbook Functions Na Request Builder.
 */
public class BaseWorkbookFunctionsNaRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNa
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookFunctionsNaRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookFunctionsNaRequest
     *
     * @return the IWorkbookFunctionsNaRequest instance
     */
    public IWorkbookFunctionsNaRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsNaRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNaRequest instance
     */
    public IWorkbookFunctionsNaRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsNaRequest request = new WorkbookFunctionsNaRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
