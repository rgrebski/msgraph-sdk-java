// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFormatAutofitRowsRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeFormatAutofitRowsRequest;

/**
 * The class for the Base Workbook Range Format Autofit Rows Request Builder.
 */
public class BaseWorkbookRangeFormatAutofitRowsRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeFormatAutofitRows
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookRangeFormatAutofitRowsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookRangeFormatAutofitRowsRequest
     *
     * @return the IWorkbookRangeFormatAutofitRowsRequest instance
     */
    public IWorkbookRangeFormatAutofitRowsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeFormatAutofitRowsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeFormatAutofitRowsRequest instance
     */
    public IWorkbookRangeFormatAutofitRowsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeFormatAutofitRowsRequest request = new WorkbookRangeFormatAutofitRowsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
