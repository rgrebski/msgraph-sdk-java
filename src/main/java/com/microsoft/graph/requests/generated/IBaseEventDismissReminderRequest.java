// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Event Dismiss Reminder Request.
 */
public interface IBaseEventDismissReminderRequest {

    /**
     * Creates the EventDismissReminder
     *
     * @param callback the callback to be called after success or failure
     */
    void post(final ICallback<Void> callback);

    /**
     * Creates the EventDismissReminder
     *
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    void post() throws ClientException;

}
