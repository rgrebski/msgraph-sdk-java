// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeColumnRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeColumnRequest;

/**
 * The class for the Base Workbook Range Column Request Builder.
 */
public class BaseWorkbookRangeColumnRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeColumn
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param column the column
     */
    public BaseWorkbookRangeColumnRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer column) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("column", column));
    }

    /**
     * Creates the IWorkbookRangeColumnRequest
     *
     * @return the IWorkbookRangeColumnRequest instance
     */
    public IWorkbookRangeColumnRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeColumnRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeColumnRequest instance
     */
    public IWorkbookRangeColumnRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeColumnRequest request = new WorkbookRangeColumnRequest(
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
