// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.models.extensions.Subscription;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionPage;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionRequest;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionPage;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequest;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Subscription Collection Request.
 */
public class BaseSubscriptionCollectionRequest extends BaseCollectionRequest<BaseSubscriptionCollectionResponse, ISubscriptionCollectionPage> implements IBaseSubscriptionCollectionRequest {

    /**
     * The request builder for this collection of Subscription
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseSubscriptionCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseSubscriptionCollectionResponse.class, ISubscriptionCollectionPage.class);
    }

    public void get(final ICallback<ISubscriptionCollectionPage> callback) {
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

    public ISubscriptionCollectionPage get() throws ClientException {
        final BaseSubscriptionCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Subscription newSubscription, final ICallback<Subscription> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SubscriptionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newSubscription, callback);
    }

    public Subscription post(final Subscription newSubscription) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SubscriptionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newSubscription);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISubscriptionCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (SubscriptionCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISubscriptionCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (SubscriptionCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISubscriptionCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (SubscriptionCollectionRequest)this;
    }

    public ISubscriptionCollectionPage buildFromResponse(final BaseSubscriptionCollectionResponse response) {
        final ISubscriptionCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SubscriptionCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SubscriptionCollectionPage page = new SubscriptionCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
