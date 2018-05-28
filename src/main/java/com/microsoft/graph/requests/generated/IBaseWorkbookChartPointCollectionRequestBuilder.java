// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointCollectionRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointCountRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointItemAtRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Chart Point Collection Request Builder.
 */
public interface IBaseWorkbookChartPointCollectionRequestBuilder extends IRequestBuilder {

    IWorkbookChartPointCollectionRequest buildRequest();

    IWorkbookChartPointCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IWorkbookChartPointRequestBuilder byId(final String id);

    IWorkbookChartPointItemAtRequestBuilder itemAt(final Integer index);
    IWorkbookChartPointCountRequestBuilder count();
}
