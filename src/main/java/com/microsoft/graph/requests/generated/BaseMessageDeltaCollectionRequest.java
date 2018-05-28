// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IMessageDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.IMessageDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.IMessageDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.MessageDeltaCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Message Delta Collection Request.
 */
public class BaseMessageDeltaCollectionRequest extends BaseCollectionRequest<BaseMessageDeltaCollectionResponse, IMessageDeltaCollectionPage> implements IBaseMessageDeltaCollectionRequest {


    /**
     * The request for this MessageDelta
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseMessageDeltaCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseMessageDeltaCollectionResponse.class, IMessageDeltaCollectionPage.class);
    }


    public void get(final ICallback<IMessageDeltaCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IMessageDeltaCollectionPage get() throws ClientException {
        final BaseMessageDeltaCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IMessageDeltaCollectionPage buildFromResponse(final BaseMessageDeltaCollectionResponse response) {
        final IMessageDeltaCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MessageDeltaCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IMessageDeltaCollectionPage page = new MessageDeltaCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMessageDeltaCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (IMessageDeltaCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMessageDeltaCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value+""));
        return (IMessageDeltaCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMessageDeltaCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (IMessageDeltaCollectionRequest)this;
    }

}
