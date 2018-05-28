// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.CalendarGroup;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.CalendarGroupRequest;
import com.microsoft.graph.requests.extensions.ICalendarGroupRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Calendar Group Request.
 */
public class BaseCalendarGroupRequest extends BaseRequest implements IBaseCalendarGroupRequest {

    /**
     * The request for the CalendarGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseCalendarGroupRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<CalendarGroup> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the CalendarGroup from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<CalendarGroup> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the CalendarGroup from the service
     *
     * @return the CalendarGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CalendarGroup get() throws ClientException {
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
     * Patches this CalendarGroup with a source
     *
     * @param sourceCalendarGroup the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final CalendarGroup sourceCalendarGroup, final ICallback<CalendarGroup> callback) {
        send(HttpMethod.PATCH, callback, sourceCalendarGroup);
    }

    /**
     * Patches this CalendarGroup with a source
     *
     * @param sourceCalendarGroup the source object with updates
     * @return the updated CalendarGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CalendarGroup patch(final CalendarGroup sourceCalendarGroup) throws ClientException {
        return send(HttpMethod.PATCH, sourceCalendarGroup);
    }

    /**
     * Creates a CalendarGroup with a new object
     *
     * @param newCalendarGroup the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final CalendarGroup newCalendarGroup, final ICallback<CalendarGroup> callback) {
        send(HttpMethod.POST, callback, newCalendarGroup);
    }

    /**
     * Creates a CalendarGroup with a new object
     *
     * @param newCalendarGroup the new object to create
     * @return the created CalendarGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CalendarGroup post(final CalendarGroup newCalendarGroup) throws ClientException {
        return send(HttpMethod.POST, newCalendarGroup);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ICalendarGroupRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (CalendarGroupRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ICalendarGroupRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (CalendarGroupRequest)this;
     }

}

