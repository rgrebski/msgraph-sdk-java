// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointCountRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartPointCountRequest;

/**
 * The class for the Base Workbook Chart Point Count Request Builder.
 */
public class BaseWorkbookChartPointCountRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookChartPointCount
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookChartPointCountRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookChartPointCountRequest
     *
     * @return the IWorkbookChartPointCountRequest instance
     */
    public IWorkbookChartPointCountRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookChartPointCountRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartPointCountRequest instance
     */
    public IWorkbookChartPointCountRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookChartPointCountRequest request = new WorkbookChartPointCountRequest(
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
