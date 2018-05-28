// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeCellRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Range Cell Request Builder.
 */
public interface IBaseWorkbookRangeCellRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookRangeCellRequest
     *
     * @return the IWorkbookRangeCellRequest instance
     */
    IWorkbookRangeCellRequest buildRequest();

    /**
     * Creates the IWorkbookRangeCellRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeCellRequest instance
     */
    IWorkbookRangeCellRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
