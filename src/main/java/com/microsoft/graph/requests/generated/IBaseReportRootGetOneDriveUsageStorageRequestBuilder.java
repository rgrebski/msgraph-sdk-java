// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageStorageRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Report Root Get One Drive Usage Storage Request Builder.
 */
public interface IBaseReportRootGetOneDriveUsageStorageRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetOneDriveUsageStorageRequest
     *
     * @return the IReportRootGetOneDriveUsageStorageRequest instance
     */
    IReportRootGetOneDriveUsageStorageRequest buildRequest();

    /**
     * Creates the IReportRootGetOneDriveUsageStorageRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOneDriveUsageStorageRequest instance
     */
    IReportRootGetOneDriveUsageStorageRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
