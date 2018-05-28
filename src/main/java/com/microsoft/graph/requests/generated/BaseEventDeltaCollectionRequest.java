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
import com.microsoft.graph.requests.extensions.EventDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.EventDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.IEventDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.IEventDeltaCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Event Delta Collection Request.
 */
public class BaseEventDeltaCollectionRequest extends BaseCollectionRequest<BaseEventDeltaCollectionResponse, IEventDeltaCollectionPage> implements IBaseEventDeltaCollectionRequest {


    /**
     * The request for this EventDelta
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseEventDeltaCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseEventDeltaCollectionResponse.class, IEventDeltaCollectionPage.class);
    }


    public void get(final ICallback<IEventDeltaCollectionPage> callback) {
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

    public IEventDeltaCollectionPage get() throws ClientException {
        final BaseEventDeltaCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IEventDeltaCollectionPage buildFromResponse(final BaseEventDeltaCollectionResponse response) {
        final IEventDeltaCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EventDeltaCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IEventDeltaCollectionPage page = new EventDeltaCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEventDeltaCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (IEventDeltaCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IEventDeltaCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value+""));
        return (IEventDeltaCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEventDeltaCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (IEventDeltaCollectionRequest)this;
    }

}
