// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookTableRangeRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Table Range Request Builder.
 */
public interface IBaseWorkbookTableRangeRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookTableRangeRequest
     *
     * @return the IWorkbookTableRangeRequest instance
     */
    IWorkbookTableRangeRequest buildRequest();

    /**
     * Creates the IWorkbookTableRangeRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableRangeRequest instance
     */
    IWorkbookTableRangeRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
