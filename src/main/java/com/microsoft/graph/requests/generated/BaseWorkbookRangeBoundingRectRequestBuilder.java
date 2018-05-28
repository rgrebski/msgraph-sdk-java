// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBoundingRectRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeBoundingRectRequest;

/**
 * The class for the Base Workbook Range Bounding Rect Request Builder.
 */
public class BaseWorkbookRangeBoundingRectRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeBoundingRect
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param anotherRange the anotherRange
     */
    public BaseWorkbookRangeBoundingRectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String anotherRange) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("anotherRange", anotherRange));
    }

    /**
     * Creates the IWorkbookRangeBoundingRectRequest
     *
     * @return the IWorkbookRangeBoundingRectRequest instance
     */
    public IWorkbookRangeBoundingRectRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeBoundingRectRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeBoundingRectRequest instance
     */
    public IWorkbookRangeBoundingRectRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeBoundingRectRequest request = new WorkbookRangeBoundingRectRequest(
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
