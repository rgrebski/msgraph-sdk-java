// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsReplaceRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Replace Request Builder.
 */
public interface IBaseWorkbookFunctionsReplaceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsReplaceRequest
     *
     * @return the IWorkbookFunctionsReplaceRequest instance
     */
    IWorkbookFunctionsReplaceRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsReplaceRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsReplaceRequest instance
     */
    IWorkbookFunctionsReplaceRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
