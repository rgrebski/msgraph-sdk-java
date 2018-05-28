// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeIntersectionRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeIntersectionRequest;

/**
 * The class for the Base Workbook Range Intersection Request Builder.
 */
public class BaseWorkbookRangeIntersectionRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeIntersection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param anotherRange the anotherRange
     */
    public BaseWorkbookRangeIntersectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String anotherRange) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("anotherRange", anotherRange));
    }

    /**
     * Creates the IWorkbookRangeIntersectionRequest
     *
     * @return the IWorkbookRangeIntersectionRequest instance
     */
    public IWorkbookRangeIntersectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeIntersectionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeIntersectionRequest instance
     */
    public IWorkbookRangeIntersectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeIntersectionRequest request = new WorkbookRangeIntersectionRequest(
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
