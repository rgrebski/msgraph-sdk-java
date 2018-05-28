// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeOffsetRangeRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeOffsetRangeRequest;

/**
 * The class for the Base Workbook Range Offset Range Request Builder.
 */
public class BaseWorkbookRangeOffsetRangeRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeOffsetRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rowOffset the rowOffset
     * @param columnOffset the columnOffset
     */
    public BaseWorkbookRangeOffsetRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer rowOffset, final Integer columnOffset) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("rowOffset", rowOffset));
        functionOptions.add(new FunctionOption("columnOffset", columnOffset));
    }

    /**
     * Creates the IWorkbookRangeOffsetRangeRequest
     *
     * @return the IWorkbookRangeOffsetRangeRequest instance
     */
    public IWorkbookRangeOffsetRangeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeOffsetRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeOffsetRangeRequest instance
     */
    public IWorkbookRangeOffsetRangeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeOffsetRangeRequest request = new WorkbookRangeOffsetRangeRequest(
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
