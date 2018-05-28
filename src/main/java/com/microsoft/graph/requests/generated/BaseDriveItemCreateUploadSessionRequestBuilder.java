// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.DriveItemUploadableProperties;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DriveItemCreateUploadSessionRequest;
import com.microsoft.graph.requests.extensions.IDriveItemCreateUploadSessionRequest;

/**
 * The class for the Base Drive Item Create Upload Session Request Builder.
 */
public class BaseDriveItemCreateUploadSessionRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this DriveItemCreateUploadSession
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param item the item
     */
    public BaseDriveItemCreateUploadSessionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final DriveItemUploadableProperties item) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("item", item);
    }

    /**
     * Creates the IDriveItemCreateUploadSessionRequest
     *
     * @return the IDriveItemCreateUploadSessionRequest instance
     */
    public IDriveItemCreateUploadSessionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IDriveItemCreateUploadSessionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDriveItemCreateUploadSessionRequest instance
     */
    public IDriveItemCreateUploadSessionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DriveItemCreateUploadSessionRequest request = new DriveItemCreateUploadSessionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("item")) {
            request.body.item = getParameter("item");
        }

        return request;
    }
}
