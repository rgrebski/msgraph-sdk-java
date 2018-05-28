// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionPage;
import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionRequest;
import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionRequest;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner Plan Collection Request.
 */
public class BasePlannerPlanCollectionRequest extends BaseCollectionRequest<BasePlannerPlanCollectionResponse, IPlannerPlanCollectionPage> implements IBasePlannerPlanCollectionRequest {

    /**
     * The request builder for this collection of PlannerPlan
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BasePlannerPlanCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BasePlannerPlanCollectionResponse.class, IPlannerPlanCollectionPage.class);
    }

    public void get(final ICallback<IPlannerPlanCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IPlannerPlanCollectionPage get() throws ClientException {
        final BasePlannerPlanCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PlannerPlan newPlannerPlan, final ICallback<PlannerPlan> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PlannerPlanRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPlannerPlan, callback);
    }

    public PlannerPlan post(final PlannerPlan newPlannerPlan) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PlannerPlanRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPlannerPlan);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPlannerPlanCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (PlannerPlanCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPlannerPlanCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (PlannerPlanCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPlannerPlanCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (PlannerPlanCollectionRequest)this;
    }

    public IPlannerPlanCollectionPage buildFromResponse(final BasePlannerPlanCollectionResponse response) {
        final IPlannerPlanCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PlannerPlanCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PlannerPlanCollectionPage page = new PlannerPlanCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
