// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemAddFormulaLocalRequest;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemAddFormulaLocalRequest;

/**
 * The class for the Base Workbook Named Item Add Formula Local Request Builder.
 */
public class BaseWorkbookNamedItemAddFormulaLocalRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookNamedItemAddFormulaLocal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param name the name
     * @param formula the formula
     * @param comment the comment
     */
    public BaseWorkbookNamedItemAddFormulaLocalRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String name, final String formula, final String comment) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("name", name);
        bodyParams.put("formula", formula);
        bodyParams.put("comment", comment);
    }

    /**
     * Creates the IWorkbookNamedItemAddFormulaLocalRequest
     *
     * @return the IWorkbookNamedItemAddFormulaLocalRequest instance
     */
    public IWorkbookNamedItemAddFormulaLocalRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookNamedItemAddFormulaLocalRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookNamedItemAddFormulaLocalRequest instance
     */
    public IWorkbookNamedItemAddFormulaLocalRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookNamedItemAddFormulaLocalRequest request = new WorkbookNamedItemAddFormulaLocalRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("name")) {
            request.body.name = getParameter("name");
        }

        if (hasParameter("formula")) {
            request.body.formula = getParameter("formula");
        }

        if (hasParameter("comment")) {
            request.body.comment = getParameter("comment");
        }

        return request;
    }
}
