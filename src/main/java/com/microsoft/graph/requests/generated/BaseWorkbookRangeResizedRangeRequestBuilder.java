// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeResizedRangeRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeResizedRangeRequest;

/**
 * The class for the Base Workbook Range Resized Range Request Builder.
 */
public class BaseWorkbookRangeResizedRangeRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeResizedRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param deltaRows the deltaRows
     * @param deltaColumns the deltaColumns
     */
    public BaseWorkbookRangeResizedRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer deltaRows, final Integer deltaColumns) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("deltaRows", deltaRows));
        functionOptions.add(new FunctionOption("deltaColumns", deltaColumns));
    }

    /**
     * Creates the IWorkbookRangeResizedRangeRequest
     *
     * @return the IWorkbookRangeResizedRangeRequest instance
     */
    public IWorkbookRangeResizedRangeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeResizedRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeResizedRangeRequest instance
     */
    public IWorkbookRangeResizedRangeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeResizedRangeRequest request = new WorkbookRangeResizedRangeRequest(
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
