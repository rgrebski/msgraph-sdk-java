// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner Progress Task Board Task Format Request.
 */
public class BasePlannerProgressTaskBoardTaskFormatRequest extends BaseRequest implements IBasePlannerProgressTaskBoardTaskFormatRequest {

    /**
     * The request for the PlannerProgressTaskBoardTaskFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BasePlannerProgressTaskBoardTaskFormatRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<PlannerProgressTaskBoardTaskFormat> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the PlannerProgressTaskBoardTaskFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PlannerProgressTaskBoardTaskFormat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerProgressTaskBoardTaskFormat from the service
     *
     * @return the PlannerProgressTaskBoardTaskFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerProgressTaskBoardTaskFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this PlannerProgressTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerProgressTaskBoardTaskFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerProgressTaskBoardTaskFormat sourcePlannerProgressTaskBoardTaskFormat, final ICallback<PlannerProgressTaskBoardTaskFormat> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerProgressTaskBoardTaskFormat);
    }

    /**
     * Patches this PlannerProgressTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerProgressTaskBoardTaskFormat the source object with updates
     * @return the updated PlannerProgressTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerProgressTaskBoardTaskFormat patch(final PlannerProgressTaskBoardTaskFormat sourcePlannerProgressTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerProgressTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerProgressTaskBoardTaskFormat with a new object
     *
     * @param newPlannerProgressTaskBoardTaskFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerProgressTaskBoardTaskFormat newPlannerProgressTaskBoardTaskFormat, final ICallback<PlannerProgressTaskBoardTaskFormat> callback) {
        send(HttpMethod.POST, callback, newPlannerProgressTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerProgressTaskBoardTaskFormat with a new object
     *
     * @param newPlannerProgressTaskBoardTaskFormat the new object to create
     * @return the created PlannerProgressTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerProgressTaskBoardTaskFormat post(final PlannerProgressTaskBoardTaskFormat newPlannerProgressTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.POST, newPlannerProgressTaskBoardTaskFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerProgressTaskBoardTaskFormatRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PlannerProgressTaskBoardTaskFormatRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerProgressTaskBoardTaskFormatRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PlannerProgressTaskBoardTaskFormatRequest)this;
     }

}

