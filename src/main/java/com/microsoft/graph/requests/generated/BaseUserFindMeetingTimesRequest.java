// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.MeetingTimeSuggestionsResult;
import com.microsoft.graph.models.extensions.UserFindMeetingTimesBody;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IUserFindMeetingTimesRequest;
import com.microsoft.graph.requests.extensions.UserFindMeetingTimesRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base User Find Meeting Times Request.
 */
public class BaseUserFindMeetingTimesRequest extends BaseRequest implements IBaseUserFindMeetingTimesRequest {
    protected final UserFindMeetingTimesBody body;

    /**
     * The request for this UserFindMeetingTimes
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseUserFindMeetingTimesRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, MeetingTimeSuggestionsResult.class);
        body = new UserFindMeetingTimesBody();
    }

    public void post(final ICallback<MeetingTimeSuggestionsResult> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public MeetingTimeSuggestionsResult post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserFindMeetingTimesRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (UserFindMeetingTimesRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUserFindMeetingTimesRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (UserFindMeetingTimesRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserFindMeetingTimesRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (UserFindMeetingTimesRequest)this;
    }

}
