// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeColumnsAfterRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeColumnsAfterRequest;

/**
 * The class for the Base Workbook Range Columns After Request Builder.
 */
public class BaseWorkbookRangeColumnsAfterRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeColumnsAfter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookRangeColumnsAfterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this WorkbookRangeColumnsAfter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param count the count
     */
    public BaseWorkbookRangeColumnsAfterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer count) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("count", count));
    }

    /**
     * Creates the IWorkbookRangeColumnsAfterRequest
     *
     * @return the IWorkbookRangeColumnsAfterRequest instance
     */
    public IWorkbookRangeColumnsAfterRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeColumnsAfterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeColumnsAfterRequest instance
     */
    public IWorkbookRangeColumnsAfterRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeColumnsAfterRequest request = new WorkbookRangeColumnsAfterRequest(
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
