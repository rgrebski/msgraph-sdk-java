// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPoisson_DistRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Poisson_Dist Request Builder.
 */
public interface IBaseWorkbookFunctionsPoisson_DistRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsPoisson_DistRequest
     *
     * @return the IWorkbookFunctionsPoisson_DistRequest instance
     */
    IWorkbookFunctionsPoisson_DistRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsPoisson_DistRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPoisson_DistRequest instance
     */
    IWorkbookFunctionsPoisson_DistRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
