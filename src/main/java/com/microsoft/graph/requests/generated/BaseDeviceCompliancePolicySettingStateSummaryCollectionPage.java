// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingStateSummary;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Compliance Policy Setting State Summary Collection Page.
 */
public class BaseDeviceCompliancePolicySettingStateSummaryCollectionPage extends BaseCollectionPage<DeviceCompliancePolicySettingStateSummary, IDeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder> implements IBaseDeviceCompliancePolicySettingStateSummaryCollectionPage {

    /**
     * A collection page for DeviceCompliancePolicySettingStateSummary
     *
     * @param response the serialized BaseDeviceCompliancePolicySettingStateSummaryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseDeviceCompliancePolicySettingStateSummaryCollectionPage(final BaseDeviceCompliancePolicySettingStateSummaryCollectionResponse response, final IDeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
