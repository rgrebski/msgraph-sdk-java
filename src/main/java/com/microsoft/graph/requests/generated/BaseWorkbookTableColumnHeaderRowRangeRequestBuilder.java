// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnHeaderRowRangeRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnHeaderRowRangeRequest;

/**
 * The class for the Base Workbook Table Column Header Row Range Request Builder.
 */
public class BaseWorkbookTableColumnHeaderRowRangeRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookTableColumnHeaderRowRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookTableColumnHeaderRowRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookTableColumnHeaderRowRangeRequest
     *
     * @return the IWorkbookTableColumnHeaderRowRangeRequest instance
     */
    public IWorkbookTableColumnHeaderRowRangeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableColumnHeaderRowRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableColumnHeaderRowRangeRequest instance
     */
    public IWorkbookTableColumnHeaderRowRangeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookTableColumnHeaderRowRangeRequest request = new WorkbookTableColumnHeaderRowRangeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
