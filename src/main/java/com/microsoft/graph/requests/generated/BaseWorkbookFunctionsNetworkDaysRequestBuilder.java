// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNetworkDaysRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNetworkDaysRequest;

/**
 * The class for the Base Workbook Functions Network Days Request Builder.
 */
public class BaseWorkbookFunctionsNetworkDaysRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNetworkDays
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param startDate the startDate
     * @param endDate the endDate
     * @param holidays the holidays
     */
    public BaseWorkbookFunctionsNetworkDaysRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement endDate, final com.google.gson.JsonElement holidays) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("startDate", startDate);
        bodyParams.put("endDate", endDate);
        bodyParams.put("holidays", holidays);
    }

    /**
     * Creates the IWorkbookFunctionsNetworkDaysRequest
     *
     * @return the IWorkbookFunctionsNetworkDaysRequest instance
     */
    public IWorkbookFunctionsNetworkDaysRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsNetworkDaysRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNetworkDaysRequest instance
     */
    public IWorkbookFunctionsNetworkDaysRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsNetworkDaysRequest request = new WorkbookFunctionsNetworkDaysRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("startDate")) {
            request.body.startDate = getParameter("startDate");
        }

        if (hasParameter("endDate")) {
            request.body.endDate = getParameter("endDate");
        }

        if (hasParameter("holidays")) {
            request.body.holidays = getParameter("holidays");
        }

        return request;
    }
}
