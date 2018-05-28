// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeInsertRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeInsertRequest;

/**
 * The class for the Base Workbook Range Insert Request Builder.
 */
public class BaseWorkbookRangeInsertRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeInsert
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param shift the shift
     */
    public BaseWorkbookRangeInsertRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String shift) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("shift", shift);
    }

    /**
     * Creates the IWorkbookRangeInsertRequest
     *
     * @return the IWorkbookRangeInsertRequest instance
     */
    public IWorkbookRangeInsertRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeInsertRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeInsertRequest instance
     */
    public IWorkbookRangeInsertRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeInsertRequest request = new WorkbookRangeInsertRequest(
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
