// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationAssignment;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed Device Mobile App Configuration Assignment Collection Page.
 */
public class BaseManagedDeviceMobileAppConfigurationAssignmentCollectionPage extends BaseCollectionPage<ManagedDeviceMobileAppConfigurationAssignment, IManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder> implements IBaseManagedDeviceMobileAppConfigurationAssignmentCollectionPage {

    /**
     * A collection page for ManagedDeviceMobileAppConfigurationAssignment
     *
     * @param response the serialized BaseManagedDeviceMobileAppConfigurationAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseManagedDeviceMobileAppConfigurationAssignmentCollectionPage(final BaseManagedDeviceMobileAppConfigurationAssignmentCollectionResponse response, final IManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
