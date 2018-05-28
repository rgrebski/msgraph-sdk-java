// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnCountRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnCountRequest;

/**
 * The class for the Base Workbook Table Column Count Request Builder.
 */
public class BaseWorkbookTableColumnCountRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookTableColumnCount
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookTableColumnCountRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookTableColumnCountRequest
     *
     * @return the IWorkbookTableColumnCountRequest instance
     */
    public IWorkbookTableColumnCountRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableColumnCountRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableColumnCountRequest instance
     */
    public IWorkbookTableColumnCountRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookTableColumnCountRequest request = new WorkbookTableColumnCountRequest(
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
