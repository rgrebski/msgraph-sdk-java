// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyIconFilterRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Filter Apply Icon Filter Request Builder.
 */
public interface IBaseWorkbookFilterApplyIconFilterRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFilterApplyIconFilterRequest
     *
     * @return the IWorkbookFilterApplyIconFilterRequest instance
     */
    IWorkbookFilterApplyIconFilterRequest buildRequest();

    /**
     * Creates the IWorkbookFilterApplyIconFilterRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFilterApplyIconFilterRequest instance
     */
    IWorkbookFilterApplyIconFilterRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
