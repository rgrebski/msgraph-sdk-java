// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsF_InvRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions F_Inv Request Builder.
 */
public interface IBaseWorkbookFunctionsF_InvRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsF_InvRequest
     *
     * @return the IWorkbookFunctionsF_InvRequest instance
     */
    IWorkbookFunctionsF_InvRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsF_InvRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsF_InvRequest instance
     */
    IWorkbookFunctionsF_InvRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
