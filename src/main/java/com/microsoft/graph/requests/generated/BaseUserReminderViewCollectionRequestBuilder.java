// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IUserReminderViewCollectionRequest;
import com.microsoft.graph.requests.extensions.UserReminderViewCollectionRequest;

/**
 * The class for the Base User Reminder View Collection Request Builder.
 */
public class BaseUserReminderViewCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseUserReminderViewCollectionRequestBuilder {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param startDateTime the startDateTime
     * @param endDateTime the endDateTime
     */
    public BaseUserReminderViewCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String startDateTime, final String endDateTime) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("startDateTime", startDateTime));
          functionOptions.add(new FunctionOption("endDateTime", endDateTime));
      }

    public IUserReminderViewCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IUserReminderViewCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        UserReminderViewCollectionRequest request = new UserReminderViewCollectionRequest(
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
