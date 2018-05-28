// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetUsedRangeRequest;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetUsedRangeRequest;

/**
 * The class for the Base Workbook Worksheet Used Range Request Builder.
 */
public class BaseWorkbookWorksheetUsedRangeRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookWorksheetUsedRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookWorksheetUsedRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this WorkbookWorksheetUsedRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param valuesOnly the valuesOnly
     */
    public BaseWorkbookWorksheetUsedRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean valuesOnly) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("valuesOnly", valuesOnly));
    }

    /**
     * Creates the IWorkbookWorksheetUsedRangeRequest
     *
     * @return the IWorkbookWorksheetUsedRangeRequest instance
     */
    public IWorkbookWorksheetUsedRangeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookWorksheetUsedRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookWorksheetUsedRangeRequest instance
     */
    public IWorkbookWorksheetUsedRangeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookWorksheetUsedRangeRequest request = new WorkbookWorksheetUsedRangeRequest(
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
