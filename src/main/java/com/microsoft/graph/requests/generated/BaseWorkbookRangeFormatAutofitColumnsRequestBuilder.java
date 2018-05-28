// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFormatAutofitColumnsRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeFormatAutofitColumnsRequest;

/**
 * The class for the Base Workbook Range Format Autofit Columns Request Builder.
 */
public class BaseWorkbookRangeFormatAutofitColumnsRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeFormatAutofitColumns
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookRangeFormatAutofitColumnsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookRangeFormatAutofitColumnsRequest
     *
     * @return the IWorkbookRangeFormatAutofitColumnsRequest instance
     */
    public IWorkbookRangeFormatAutofitColumnsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeFormatAutofitColumnsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeFormatAutofitColumnsRequest instance
     */
    public IWorkbookRangeFormatAutofitColumnsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeFormatAutofitColumnsRequest request = new WorkbookRangeFormatAutofitColumnsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
