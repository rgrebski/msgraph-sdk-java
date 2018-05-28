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
import com.microsoft.graph.models.extensions.DomainDnsRecord;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.DomainDnsRecordCollectionPage;
import com.microsoft.graph.requests.extensions.DomainDnsRecordCollectionRequest;
import com.microsoft.graph.requests.extensions.DomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionPage;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionRequest;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Domain Dns Record Collection Request.
 */
public class BaseDomainDnsRecordCollectionRequest extends BaseCollectionRequest<BaseDomainDnsRecordCollectionResponse, IDomainDnsRecordCollectionPage> implements IBaseDomainDnsRecordCollectionRequest {

    /**
     * The request builder for this collection of DomainDnsRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDomainDnsRecordCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseDomainDnsRecordCollectionResponse.class, IDomainDnsRecordCollectionPage.class);
    }

    public void get(final ICallback<IDomainDnsRecordCollectionPage> callback) {
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

    public IDomainDnsRecordCollectionPage get() throws ClientException {
        final BaseDomainDnsRecordCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DomainDnsRecord newDomainDnsRecord, final ICallback<DomainDnsRecord> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DomainDnsRecordRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDomainDnsRecord, callback);
    }

    public DomainDnsRecord post(final DomainDnsRecord newDomainDnsRecord) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DomainDnsRecordRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDomainDnsRecord);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDomainDnsRecordCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DomainDnsRecordCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDomainDnsRecordCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DomainDnsRecordCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDomainDnsRecordCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DomainDnsRecordCollectionRequest)this;
    }

    public IDomainDnsRecordCollectionPage buildFromResponse(final BaseDomainDnsRecordCollectionResponse response) {
        final IDomainDnsRecordCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DomainDnsRecordCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DomainDnsRecordCollectionPage page = new DomainDnsRecordCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
