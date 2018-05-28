// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookChartItemRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartItemRequest;

/**
 * The class for the Base Workbook Chart Item Request Builder.
 */
public class BaseWorkbookChartItemRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookChartItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param name the name
     */
    public BaseWorkbookChartItemRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String name) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("name", name));
    }

    /**
     * Creates the IWorkbookChartItemRequest
     *
     * @return the IWorkbookChartItemRequest instance
     */
    public IWorkbookChartItemRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookChartItemRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartItemRequest instance
     */
    public IWorkbookChartItemRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookChartItemRequest request = new WorkbookChartItemRequest(
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
