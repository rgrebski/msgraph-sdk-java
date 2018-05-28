// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsTbillEqRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Tbill Eq Request Builder.
 */
public interface IBaseWorkbookFunctionsTbillEqRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsTbillEqRequest
     *
     * @return the IWorkbookFunctionsTbillEqRequest instance
     */
    IWorkbookFunctionsTbillEqRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsTbillEqRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsTbillEqRequest instance
     */
    IWorkbookFunctionsTbillEqRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
