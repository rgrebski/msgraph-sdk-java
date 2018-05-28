// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.FileAttachment;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base File Attachment Request.
 */
public interface IBaseFileAttachmentRequest extends IHttpRequest {

    /**
     * Gets the FileAttachment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<FileAttachment> callback);

    /**
     * Gets the FileAttachment from the service
     *
     * @return the FileAttachment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    FileAttachment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this FileAttachment with a source
     *
     * @param sourceFileAttachment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final FileAttachment sourceFileAttachment, final ICallback<FileAttachment> callback);

    /**
     * Patches this FileAttachment with a source
     *
     * @param sourceFileAttachment the source object with updates
     * @return the updated FileAttachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    FileAttachment patch(final FileAttachment sourceFileAttachment) throws ClientException;

    /**
     * Posts a FileAttachment with a new object
     *
     * @param newFileAttachment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final FileAttachment newFileAttachment, final ICallback<FileAttachment> callback);

    /**
     * Posts a FileAttachment with a new object
     *
     * @param newFileAttachment the new object to create
     * @return the created FileAttachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    FileAttachment post(final FileAttachment newFileAttachment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseFileAttachmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseFileAttachmentRequest expand(final String value);

}

