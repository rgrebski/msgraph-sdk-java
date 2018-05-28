// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeCellRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeCellRequest;

/**
 * The class for the Base Workbook Range Cell Request Builder.
 */
public class BaseWorkbookRangeCellRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeCell
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param row the row
     * @param column the column
     */
    public BaseWorkbookRangeCellRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer row, final Integer column) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("row", row));
        functionOptions.add(new FunctionOption("column", column));
    }

    /**
     * Creates the IWorkbookRangeCellRequest
     *
     * @return the IWorkbookRangeCellRequest instance
     */
    public IWorkbookRangeCellRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeCellRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeCellRequest instance
     */
    public IWorkbookRangeCellRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeCellRequest request = new WorkbookRangeCellRequest(
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
