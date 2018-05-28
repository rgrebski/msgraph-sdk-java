// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIsNumberRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Is Number Request Builder.
 */
public interface IBaseWorkbookFunctionsIsNumberRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsIsNumberRequest
     *
     * @return the IWorkbookFunctionsIsNumberRequest instance
     */
    IWorkbookFunctionsIsNumberRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsIsNumberRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIsNumberRequest instance
     */
    IWorkbookFunctionsIsNumberRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
