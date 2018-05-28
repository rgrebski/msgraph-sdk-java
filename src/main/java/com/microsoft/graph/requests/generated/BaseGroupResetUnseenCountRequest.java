// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Group Reset Unseen Count Request.
 */
public class BaseGroupResetUnseenCountRequest extends BaseRequest implements IBaseGroupResetUnseenCountRequest {

    /**
     * The request for this GroupResetUnseenCount
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseGroupResetUnseenCountRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
    }

    /**
     * Creates the GroupResetUnseenCount
     *
     * @param callback the callback to be called after success or failure
     */
    public void post(final ICallback<Void> callback) {
        final IExecutors executors = getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    post();
                    executors.performOnForeground((Void)null, callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    /**
     * Creates the GroupResetUnseenCount
     *
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public void post() throws ClientException {
        this.send(HttpMethod.POST, null);
    }
}
