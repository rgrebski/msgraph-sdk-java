// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBeta_DistBody;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBeta_DistRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBeta_DistRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Beta_Dist Request.
 */
public class BaseWorkbookFunctionsBeta_DistRequest extends BaseRequest implements IBaseWorkbookFunctionsBeta_DistRequest {
    protected final WorkbookFunctionsBeta_DistBody body;

    /**
     * The request for this WorkbookFunctionsBeta_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookFunctionsBeta_DistRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookFunctionResult.class);
        body = new WorkbookFunctionsBeta_DistBody();
    }

    public void post(final ICallback<WorkbookFunctionResult> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public WorkbookFunctionResult post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookFunctionsBeta_DistRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookFunctionsBeta_DistRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWorkbookFunctionsBeta_DistRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (WorkbookFunctionsBeta_DistRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookFunctionsBeta_DistRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookFunctionsBeta_DistRequest)this;
    }

}
