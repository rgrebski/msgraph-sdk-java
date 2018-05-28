// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowAddRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowCollectionRequest;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowCountRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowItemAtRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableRowAddRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableRowCollectionRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableRowCountRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableRowItemAtRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableRowRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Table Row Collection Request Builder.
 */
public class BaseWorkbookTableRowCollectionRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookTableRowCollectionRequestBuilder {

    /**
     * The request builder for this collection of WorkbookTable
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookTableRowCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IWorkbookTableRowCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IWorkbookTableRowCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookTableRowCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookTableRowRequestBuilder byId(final String id) {
        return new WorkbookTableRowRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IWorkbookTableRowAddRequestBuilder add(final Integer index, final com.google.gson.JsonElement values) {
        return new WorkbookTableRowAddRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.add"), getClient(), null, index, values);
    }

    public IWorkbookTableRowItemAtRequestBuilder itemAt(final Integer index) {
        return new WorkbookTableRowItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, index);
    }

    public IWorkbookTableRowCountRequestBuilder count() {
        return new WorkbookTableRowCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }
}
