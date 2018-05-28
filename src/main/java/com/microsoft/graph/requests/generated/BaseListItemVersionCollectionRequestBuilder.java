// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IListItemVersionCollectionRequest;
import com.microsoft.graph.requests.extensions.IListItemVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.ListItemVersionCollectionRequest;
import com.microsoft.graph.requests.extensions.ListItemVersionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base List Item Version Collection Request Builder.
 */
public class BaseListItemVersionCollectionRequestBuilder extends BaseRequestBuilder implements IBaseListItemVersionCollectionRequestBuilder {

    /**
     * The request builder for this collection of ListItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseListItemVersionCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IListItemVersionCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IListItemVersionCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ListItemVersionCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IListItemVersionRequestBuilder byId(final String id) {
        return new ListItemVersionRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
