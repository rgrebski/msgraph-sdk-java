// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyBottomPercentFilterRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Filter Apply Bottom Percent Filter Request Builder.
 */
public interface IBaseWorkbookFilterApplyBottomPercentFilterRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFilterApplyBottomPercentFilterRequest
     *
     * @return the IWorkbookFilterApplyBottomPercentFilterRequest instance
     */
    IWorkbookFilterApplyBottomPercentFilterRequest buildRequest();

    /**
     * Creates the IWorkbookFilterApplyBottomPercentFilterRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFilterApplyBottomPercentFilterRequest instance
     */
    IWorkbookFilterApplyBottomPercentFilterRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
