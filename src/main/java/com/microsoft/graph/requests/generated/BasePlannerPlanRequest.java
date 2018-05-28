// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IPlannerPlanRequest;
import com.microsoft.graph.requests.extensions.PlannerPlanRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner Plan Request.
 */
public class BasePlannerPlanRequest extends BaseRequest implements IBasePlannerPlanRequest {

    /**
     * The request for the PlannerPlan
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BasePlannerPlanRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<PlannerPlan> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the PlannerPlan from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PlannerPlan> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerPlan from the service
     *
     * @return the PlannerPlan from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerPlan get() throws ClientException {
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
     * Patches this PlannerPlan with a source
     *
     * @param sourcePlannerPlan the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerPlan sourcePlannerPlan, final ICallback<PlannerPlan> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerPlan);
    }

    /**
     * Patches this PlannerPlan with a source
     *
     * @param sourcePlannerPlan the source object with updates
     * @return the updated PlannerPlan
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerPlan patch(final PlannerPlan sourcePlannerPlan) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerPlan);
    }

    /**
     * Creates a PlannerPlan with a new object
     *
     * @param newPlannerPlan the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerPlan newPlannerPlan, final ICallback<PlannerPlan> callback) {
        send(HttpMethod.POST, callback, newPlannerPlan);
    }

    /**
     * Creates a PlannerPlan with a new object
     *
     * @param newPlannerPlan the new object to create
     * @return the created PlannerPlan
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerPlan post(final PlannerPlan newPlannerPlan) throws ClientException {
        return send(HttpMethod.POST, newPlannerPlan);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerPlanRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PlannerPlanRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerPlanRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PlannerPlanRequest)this;
     }

}

