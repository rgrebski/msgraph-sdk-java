// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFalseRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsFalseRequest;

/**
 * The class for the Base Workbook Functions False Request Builder.
 */
public class BaseWorkbookFunctionsFalseRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFalse
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookFunctionsFalseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookFunctionsFalseRequest
     *
     * @return the IWorkbookFunctionsFalseRequest instance
     */
    public IWorkbookFunctionsFalseRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsFalseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFalseRequest instance
     */
    public IWorkbookFunctionsFalseRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsFalseRequest request = new WorkbookFunctionsFalseRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
