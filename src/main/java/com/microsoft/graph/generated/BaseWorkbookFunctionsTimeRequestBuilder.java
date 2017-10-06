// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Time Request Builder.
 */
public class BaseWorkbookFunctionsTimeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsTime
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsTimeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement hour, final com.google.gson.JsonElement minute, final com.google.gson.JsonElement second) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("hour", hour);
        mBodyParams.put("minute", minute);
        mBodyParams.put("second", second);
    }

    /**
     * Creates the IWorkbookFunctionsTimeRequest
     *
     * @return The IWorkbookFunctionsTimeRequest instance
     */
    public IWorkbookFunctionsTimeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsTimeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsTimeRequest instance
     */
    public IWorkbookFunctionsTimeRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsTimeRequest request = new WorkbookFunctionsTimeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("hour")) {
            request.mBody.hour = getParameter("hour");
        }

        if (hasParameter("minute")) {
            request.mBody.minute = getParameter("minute");
        }

        if (hasParameter("second")) {
            request.mBody.second = getParameter("second");
        }

        return request;
    }
}