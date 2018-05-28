// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.WorkbookChartLegend;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookChartLegendRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Chart Legend Request.
 */
public class WorkbookChartLegendRequest extends BaseWorkbookChartLegendRequest implements IWorkbookChartLegendRequest {

    /**
     * The request for the WorkbookChartLegend
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartLegendRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartLegend.class);
    }
}
