// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookTableSortReapplyRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableSortReapplyRequest;

/**
 * The class for the Base Workbook Table Sort Reapply Request Builder.
 */
public class BaseWorkbookTableSortReapplyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookTableSortReapply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookTableSortReapplyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookTableSortReapplyRequest
     *
     * @return the IWorkbookTableSortReapplyRequest instance
     */
    public IWorkbookTableSortReapplyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableSortReapplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableSortReapplyRequest instance
     */
    public IWorkbookTableSortReapplyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookTableSortReapplyRequest request = new WorkbookTableSortReapplyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
