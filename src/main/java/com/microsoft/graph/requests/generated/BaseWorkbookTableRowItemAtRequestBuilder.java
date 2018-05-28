// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowItemAtRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableRowItemAtRequest;

/**
 * The class for the Base Workbook Table Row Item At Request Builder.
 */
public class BaseWorkbookTableRowItemAtRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookTableRowItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param index the index
     */
    public BaseWorkbookTableRowItemAtRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer index) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("index", index));
    }

    /**
     * Creates the IWorkbookTableRowItemAtRequest
     *
     * @return the IWorkbookTableRowItemAtRequest instance
     */
    public IWorkbookTableRowItemAtRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableRowItemAtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableRowItemAtRequest instance
     */
    public IWorkbookTableRowItemAtRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookTableRowItemAtRequest request = new WorkbookTableRowItemAtRequest(
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
