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
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionPage;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionWithReferencesRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Education School Collection With References Request.
 */
public class BaseEducationSchoolCollectionWithReferencesRequest extends BaseCollectionRequest<BaseEducationSchoolCollectionResponse, IEducationSchoolCollectionPage> implements IBaseEducationSchoolCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of EducationSchool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseEducationSchoolCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseEducationSchoolCollectionResponse.class, IEducationSchoolCollectionPage.class);
    }

    public void get(final ICallback<IEducationSchoolCollectionWithReferencesPage> callback) {
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

    public IEducationSchoolCollectionWithReferencesPage get() throws ClientException {
        final BaseEducationSchoolCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IEducationSchoolCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (EducationSchoolCollectionWithReferencesRequest)this;
    }

    public IEducationSchoolCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (EducationSchoolCollectionWithReferencesRequest)this;
    }

    public IEducationSchoolCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (EducationSchoolCollectionWithReferencesRequest)this;
    }

    public IEducationSchoolCollectionWithReferencesPage buildFromResponse(final BaseEducationSchoolCollectionResponse response) {
        final IEducationSchoolCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EducationSchoolCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final EducationSchoolCollectionWithReferencesPage page = new EducationSchoolCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
