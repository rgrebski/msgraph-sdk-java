// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtectionOptions;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetProtectionProtectRequest;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetProtectionProtectRequest;

/**
 * The class for the Base Workbook Worksheet Protection Protect Request Builder.
 */
public class BaseWorkbookWorksheetProtectionProtectRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookWorksheetProtectionProtect
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param options the options
     */
    public BaseWorkbookWorksheetProtectionProtectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final WorkbookWorksheetProtectionOptions options) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("options", options);
    }

    /**
     * Creates the IWorkbookWorksheetProtectionProtectRequest
     *
     * @return the IWorkbookWorksheetProtectionProtectRequest instance
     */
    public IWorkbookWorksheetProtectionProtectRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookWorksheetProtectionProtectRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookWorksheetProtectionProtectRequest instance
     */
    public IWorkbookWorksheetProtectionProtectRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookWorksheetProtectionProtectRequest request = new WorkbookWorksheetProtectionProtectRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("options")) {
            request.body.options = getParameter("options");
        }

        return request;
    }
}
