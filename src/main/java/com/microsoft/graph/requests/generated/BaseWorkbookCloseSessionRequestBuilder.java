// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookCloseSessionRequest;
import com.microsoft.graph.requests.extensions.WorkbookCloseSessionRequest;

/**
 * The class for the Base Workbook Close Session Request Builder.
 */
public class BaseWorkbookCloseSessionRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookCloseSession
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookCloseSessionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookCloseSessionRequest
     *
     * @return the IWorkbookCloseSessionRequest instance
     */
    public IWorkbookCloseSessionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookCloseSessionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookCloseSessionRequest instance
     */
    public IWorkbookCloseSessionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookCloseSessionRequest request = new WorkbookCloseSessionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
