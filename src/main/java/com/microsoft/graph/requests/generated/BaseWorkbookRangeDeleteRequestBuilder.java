// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeDeleteRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeDeleteRequest;

/**
 * The class for the Base Workbook Range Delete Request Builder.
 */
public class BaseWorkbookRangeDeleteRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeDelete
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param shift the shift
     */
    public BaseWorkbookRangeDeleteRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String shift) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("shift", shift);
    }

    /**
     * Creates the IWorkbookRangeDeleteRequest
     *
     * @return the IWorkbookRangeDeleteRequest instance
     */
    public IWorkbookRangeDeleteRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeDeleteRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeDeleteRequest instance
     */
    public IWorkbookRangeDeleteRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeDeleteRequest request = new WorkbookRangeDeleteRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("shift")) {
            request.body.shift = getParameter("shift");
        }

        return request;
    }
}
