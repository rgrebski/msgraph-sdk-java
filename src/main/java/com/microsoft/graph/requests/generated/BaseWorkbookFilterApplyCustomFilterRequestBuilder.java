// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyCustomFilterRequest;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyCustomFilterRequest;

/**
 * The class for the Base Workbook Filter Apply Custom Filter Request Builder.
 */
public class BaseWorkbookFilterApplyCustomFilterRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyCustomFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param criteria1 the criteria1
     * @param criteria2 the criteria2
     * @param oper the oper
     */
    public BaseWorkbookFilterApplyCustomFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String criteria1, final String criteria2, final String oper) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("criteria1", criteria1);
        bodyParams.put("criteria2", criteria2);
        bodyParams.put("oper", oper);
    }

    /**
     * Creates the IWorkbookFilterApplyCustomFilterRequest
     *
     * @return the IWorkbookFilterApplyCustomFilterRequest instance
     */
    public IWorkbookFilterApplyCustomFilterRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFilterApplyCustomFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFilterApplyCustomFilterRequest instance
     */
    public IWorkbookFilterApplyCustomFilterRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFilterApplyCustomFilterRequest request = new WorkbookFilterApplyCustomFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("criteria1")) {
            request.body.criteria1 = getParameter("criteria1");
        }

        if (hasParameter("criteria2")) {
            request.body.criteria2 = getParameter("criteria2");
        }

        if (hasParameter("oper")) {
            request.body.oper = getParameter("oper");
        }

        return request;
    }
}
