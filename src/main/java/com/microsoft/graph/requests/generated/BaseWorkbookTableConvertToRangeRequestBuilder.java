// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookTableConvertToRangeRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableConvertToRangeRequest;

/**
 * The class for the Base Workbook Table Convert To Range Request Builder.
 */
public class BaseWorkbookTableConvertToRangeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookTableConvertToRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookTableConvertToRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookTableConvertToRangeRequest
     *
     * @return the IWorkbookTableConvertToRangeRequest instance
     */
    public IWorkbookTableConvertToRangeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableConvertToRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableConvertToRangeRequest instance
     */
    public IWorkbookTableConvertToRangeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookTableConvertToRangeRequest request = new WorkbookTableConvertToRangeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
