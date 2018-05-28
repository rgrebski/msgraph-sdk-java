// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsImaginaryRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Imaginary Request Builder.
 */
public class WorkbookFunctionsImaginaryRequestBuilder extends BaseWorkbookFunctionsImaginaryRequestBuilder implements IWorkbookFunctionsImaginaryRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsImaginary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param inumber the inumber
     */
    public WorkbookFunctionsImaginaryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement inumber) {
        super(requestUrl, client, requestOptions, inumber);
    }
}
