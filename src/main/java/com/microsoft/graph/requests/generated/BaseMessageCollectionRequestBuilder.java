// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IMessageCollectionRequest;
import com.microsoft.graph.requests.extensions.IMessageDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMessageRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageCollectionRequest;
import com.microsoft.graph.requests.extensions.MessageDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Message Collection Request Builder.
 */
public class BaseMessageCollectionRequestBuilder extends BaseRequestBuilder implements IBaseMessageCollectionRequestBuilder {

    /**
     * The request builder for this collection of MailFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseMessageCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IMessageCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IMessageCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new MessageCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMessageRequestBuilder byId(final String id) {
        return new MessageRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IMessageDeltaCollectionRequestBuilder delta() {
        return new MessageDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

	public IMessageDeltaCollectionRequestBuilder delta(final String deltaLink) {
        return new MessageDeltaCollectionRequestBuilder(deltaLink, getClient(), null);
    }
}
