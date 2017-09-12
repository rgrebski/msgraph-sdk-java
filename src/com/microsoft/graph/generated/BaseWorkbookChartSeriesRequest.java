// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Series Request.
 */
public class BaseWorkbookChartSeriesRequest extends BaseRequest implements IBaseWorkbookChartSeriesRequest {

    /**
     * The request for the WorkbookChartSeries
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseWorkbookChartSeriesRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookChartSeries from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookChartSeries> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartSeries from the service
     * @return The WorkbookChartSeries from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartSeries get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this WorkbookChartSeries with a source
     * @param sourceWorkbookChartSeries The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final WorkbookChartSeries sourceWorkbookChartSeries, final ICallback<WorkbookChartSeries> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartSeries);
    }

    /**
     * Patches this WorkbookChartSeries with a source
     * @param sourceWorkbookChartSeries The source object with updates
     * @return The updated WorkbookChartSeries
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartSeries patch(final WorkbookChartSeries sourceWorkbookChartSeries) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartSeries);
    }

    /**
     * Creates a WorkbookChartSeries with a new object
     * @param newWorkbookChartSeries The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final WorkbookChartSeries newWorkbookChartSeries, final ICallback<WorkbookChartSeries> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartSeries);
    }

    /**
     * Creates a WorkbookChartSeries with a new object
     * @param newWorkbookChartSeries The new object to create
     * @return The created WorkbookChartSeries
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartSeries post(final WorkbookChartSeries newWorkbookChartSeries) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartSeries);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IWorkbookChartSeriesRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookChartSeriesRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IWorkbookChartSeriesRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookChartSeriesRequest)this;
     }

}