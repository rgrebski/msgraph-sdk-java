// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IOutlookCategoryCollectionRequest;
import com.microsoft.graph.requests.extensions.IOutlookCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookCategoryCollectionRequest;
import com.microsoft.graph.requests.extensions.OutlookCategoryRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Outlook Category Collection Request Builder.
 */
public class BaseOutlookCategoryCollectionRequestBuilder extends BaseRequestBuilder implements IBaseOutlookCategoryCollectionRequestBuilder {

    /**
     * The request builder for this collection of OutlookUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseOutlookCategoryCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IOutlookCategoryCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IOutlookCategoryCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new OutlookCategoryCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IOutlookCategoryRequestBuilder byId(final String id) {
        return new OutlookCategoryRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
