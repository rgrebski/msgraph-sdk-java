// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookCreateSessionRequest;
import com.microsoft.graph.requests.extensions.WorkbookCreateSessionRequest;

/**
 * The class for the Base Workbook Create Session Request Builder.
 */
public class BaseWorkbookCreateSessionRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookCreateSession
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param persistChanges the persistChanges
     */
    public BaseWorkbookCreateSessionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean persistChanges) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("persistChanges", persistChanges);
    }

    /**
     * Creates the IWorkbookCreateSessionRequest
     *
     * @return the IWorkbookCreateSessionRequest instance
     */
    public IWorkbookCreateSessionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookCreateSessionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookCreateSessionRequest instance
     */
    public IWorkbookCreateSessionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookCreateSessionRequest request = new WorkbookCreateSessionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("persistChanges")) {
            request.body.persistChanges = getParameter("persistChanges");
        }

        return request;
    }
}
