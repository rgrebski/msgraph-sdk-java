// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsTodayRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsTodayRequest;

/**
 * The class for the Base Workbook Functions Today Request Builder.
 */
public class BaseWorkbookFunctionsTodayRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsToday
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookFunctionsTodayRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookFunctionsTodayRequest
     *
     * @return the IWorkbookFunctionsTodayRequest instance
     */
    public IWorkbookFunctionsTodayRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsTodayRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsTodayRequest instance
     */
    public IWorkbookFunctionsTodayRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsTodayRequest request = new WorkbookFunctionsTodayRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
