// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.EventDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.IEventDeltaCollectionRequest;

/**
 * The class for the Base Event Delta Collection Request Builder.
 */
public class BaseEventDeltaCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseEventDeltaCollectionRequestBuilder {

    /**
     * The request builder for this collection of Event
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseEventDeltaCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IEventDeltaCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IEventDeltaCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        EventDeltaCollectionRequest request = new EventDeltaCollectionRequest(
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
