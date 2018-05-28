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
import com.microsoft.graph.models.extensions.MessageRule;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IMessageRuleCollectionPage;
import com.microsoft.graph.requests.extensions.IMessageRuleCollectionRequest;
import com.microsoft.graph.requests.extensions.IMessageRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageRuleCollectionPage;
import com.microsoft.graph.requests.extensions.MessageRuleCollectionRequest;
import com.microsoft.graph.requests.extensions.MessageRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageRuleRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Message Rule Collection Request.
 */
public class BaseMessageRuleCollectionRequest extends BaseCollectionRequest<BaseMessageRuleCollectionResponse, IMessageRuleCollectionPage> implements IBaseMessageRuleCollectionRequest {

    /**
     * The request builder for this collection of MessageRule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseMessageRuleCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseMessageRuleCollectionResponse.class, IMessageRuleCollectionPage.class);
    }

    public void get(final ICallback<IMessageRuleCollectionPage> callback) {
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

    public IMessageRuleCollectionPage get() throws ClientException {
        final BaseMessageRuleCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final MessageRule newMessageRule, final ICallback<MessageRule> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MessageRuleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMessageRule, callback);
    }

    public MessageRule post(final MessageRule newMessageRule) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MessageRuleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMessageRule);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMessageRuleCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (MessageRuleCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMessageRuleCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (MessageRuleCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMessageRuleCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (MessageRuleCollectionRequest)this;
    }

    public IMessageRuleCollectionPage buildFromResponse(final BaseMessageRuleCollectionResponse response) {
        final IMessageRuleCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MessageRuleCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MessageRuleCollectionPage page = new MessageRuleCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
