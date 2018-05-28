// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRangeRequest;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetRangeRequest;

/**
 * The class for the Base Workbook Worksheet Range Request Builder.
 */
public class BaseWorkbookWorksheetRangeRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookWorksheetRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookWorksheetRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this WorkbookWorksheetRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param address the address
     */
    public BaseWorkbookWorksheetRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String address) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("address", address));
    }

    /**
     * Creates the IWorkbookWorksheetRangeRequest
     *
     * @return the IWorkbookWorksheetRangeRequest instance
     */
    public IWorkbookWorksheetRangeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookWorksheetRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookWorksheetRangeRequest instance
     */
    public IWorkbookWorksheetRangeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookWorksheetRangeRequest request = new WorkbookWorksheetRangeRequest(
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
