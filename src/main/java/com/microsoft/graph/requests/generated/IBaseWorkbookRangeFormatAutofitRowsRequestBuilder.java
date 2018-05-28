// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFormatAutofitRowsRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Range Format Autofit Rows Request Builder.
 */
public interface IBaseWorkbookRangeFormatAutofitRowsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookRangeFormatAutofitRowsRequest
     *
     * @return the IWorkbookRangeFormatAutofitRowsRequest instance
     */
    IWorkbookRangeFormatAutofitRowsRequest buildRequest();

    /**
     * Creates the IWorkbookRangeFormatAutofitRowsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeFormatAutofitRowsRequest instance
     */
    IWorkbookRangeFormatAutofitRowsRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
