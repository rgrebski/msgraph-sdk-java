// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IOnenotePagePreviewRequest;
import com.microsoft.graph.requests.extensions.OnenotePagePreviewRequest;

/**
 * The class for the Base Onenote Page Preview Request Builder.
 */
public class BaseOnenotePagePreviewRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this OnenotePagePreview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseOnenotePagePreviewRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IOnenotePagePreviewRequest
     *
     * @return the IOnenotePagePreviewRequest instance
     */
    public IOnenotePagePreviewRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IOnenotePagePreviewRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IOnenotePagePreviewRequest instance
     */
    public IOnenotePagePreviewRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        OnenotePagePreviewRequest request = new OnenotePagePreviewRequest(
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
