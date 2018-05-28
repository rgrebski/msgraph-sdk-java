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
import com.microsoft.graph.models.extensions.DeviceManagementExchangeConnector;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorCollectionRequest;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Management Exchange Connector Collection Request.
 */
public class BaseDeviceManagementExchangeConnectorCollectionRequest extends BaseCollectionRequest<BaseDeviceManagementExchangeConnectorCollectionResponse, IDeviceManagementExchangeConnectorCollectionPage> implements IBaseDeviceManagementExchangeConnectorCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementExchangeConnector
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDeviceManagementExchangeConnectorCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseDeviceManagementExchangeConnectorCollectionResponse.class, IDeviceManagementExchangeConnectorCollectionPage.class);
    }

    public void get(final ICallback<IDeviceManagementExchangeConnectorCollectionPage> callback) {
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

    public IDeviceManagementExchangeConnectorCollectionPage get() throws ClientException {
        final BaseDeviceManagementExchangeConnectorCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementExchangeConnector newDeviceManagementExchangeConnector, final ICallback<DeviceManagementExchangeConnector> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementExchangeConnectorRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementExchangeConnector, callback);
    }

    public DeviceManagementExchangeConnector post(final DeviceManagementExchangeConnector newDeviceManagementExchangeConnector) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementExchangeConnectorRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementExchangeConnector);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementExchangeConnectorCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DeviceManagementExchangeConnectorCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementExchangeConnectorCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DeviceManagementExchangeConnectorCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementExchangeConnectorCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DeviceManagementExchangeConnectorCollectionRequest)this;
    }

    public IDeviceManagementExchangeConnectorCollectionPage buildFromResponse(final BaseDeviceManagementExchangeConnectorCollectionResponse response) {
        final IDeviceManagementExchangeConnectorCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementExchangeConnectorCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementExchangeConnectorCollectionPage page = new DeviceManagementExchangeConnectorCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
