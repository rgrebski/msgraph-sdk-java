// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.generated.TimeZoneStandard;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IOutlookUserSupportedTimeZonesCollectionRequest;
import com.microsoft.graph.requests.extensions.OutlookUserSupportedTimeZonesCollectionRequest;

/**
 * The class for the Base Outlook User Supported Time Zones Collection Request Builder.
 */
public class BaseOutlookUserSupportedTimeZonesCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseOutlookUserSupportedTimeZonesCollectionRequestBuilder {

    /**
     * The request builder for this collection of OutlookUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseOutlookUserSupportedTimeZonesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this collection of OutlookUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param timeZoneStandard the timeZoneStandard
     */
    public BaseOutlookUserSupportedTimeZonesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final TimeZoneStandard timeZoneStandard) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("timeZoneStandard", timeZoneStandard));
      }

    public IOutlookUserSupportedTimeZonesCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IOutlookUserSupportedTimeZonesCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        OutlookUserSupportedTimeZonesCollectionRequest request = new OutlookUserSupportedTimeZonesCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
