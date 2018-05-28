// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.ILocalizedNotificationMessageCollectionRequest;
import com.microsoft.graph.requests.extensions.ILocalizedNotificationMessageRequestBuilder;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageCollectionRequest;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Localized Notification Message Collection Request Builder.
 */
public class BaseLocalizedNotificationMessageCollectionRequestBuilder extends BaseRequestBuilder implements IBaseLocalizedNotificationMessageCollectionRequestBuilder {

    /**
     * The request builder for this collection of NotificationMessageTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseLocalizedNotificationMessageCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ILocalizedNotificationMessageCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ILocalizedNotificationMessageCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new LocalizedNotificationMessageCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ILocalizedNotificationMessageRequestBuilder byId(final String id) {
        return new LocalizedNotificationMessageRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
