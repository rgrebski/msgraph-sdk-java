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
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationCollectionPage;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionWithReferencesRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed App Registration Collection With References Request.
 */
public class BaseManagedAppRegistrationCollectionWithReferencesRequest extends BaseCollectionRequest<BaseManagedAppRegistrationCollectionResponse, IManagedAppRegistrationCollectionPage> implements IBaseManagedAppRegistrationCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedAppRegistrationCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseManagedAppRegistrationCollectionResponse.class, IManagedAppRegistrationCollectionPage.class);
    }

    public void get(final ICallback<IManagedAppRegistrationCollectionWithReferencesPage> callback) {
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

    public IManagedAppRegistrationCollectionWithReferencesPage get() throws ClientException {
        final BaseManagedAppRegistrationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IManagedAppRegistrationCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ManagedAppRegistrationCollectionWithReferencesRequest)this;
    }

    public IManagedAppRegistrationCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ManagedAppRegistrationCollectionWithReferencesRequest)this;
    }

    public IManagedAppRegistrationCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ManagedAppRegistrationCollectionWithReferencesRequest)this;
    }

    public IManagedAppRegistrationCollectionWithReferencesPage buildFromResponse(final BaseManagedAppRegistrationCollectionResponse response) {
        final IManagedAppRegistrationCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ManagedAppRegistrationCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ManagedAppRegistrationCollectionWithReferencesPage page = new ManagedAppRegistrationCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
