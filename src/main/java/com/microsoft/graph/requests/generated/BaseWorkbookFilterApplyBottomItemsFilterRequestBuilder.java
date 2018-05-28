// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyBottomItemsFilterRequest;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyBottomItemsFilterRequest;

/**
 * The class for the Base Workbook Filter Apply Bottom Items Filter Request Builder.
 */
public class BaseWorkbookFilterApplyBottomItemsFilterRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyBottomItemsFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param count the count
     */
    public BaseWorkbookFilterApplyBottomItemsFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer count) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("count", count);
    }

    /**
     * Creates the IWorkbookFilterApplyBottomItemsFilterRequest
     *
     * @return the IWorkbookFilterApplyBottomItemsFilterRequest instance
     */
    public IWorkbookFilterApplyBottomItemsFilterRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFilterApplyBottomItemsFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFilterApplyBottomItemsFilterRequest instance
     */
    public IWorkbookFilterApplyBottomItemsFilterRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFilterApplyBottomItemsFilterRequest request = new WorkbookFilterApplyBottomItemsFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("count")) {
            request.body.count = getParameter("count");
        }

        return request;
    }
}
