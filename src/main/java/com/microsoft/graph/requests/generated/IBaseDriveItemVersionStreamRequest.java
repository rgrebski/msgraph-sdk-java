// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import java.io.InputStream;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpStreamRequest;
import com.microsoft.graph.models.extensions.DriveItemVersion;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Drive Item Version Stream Request.
 */
public interface IBaseDriveItemVersionStreamRequest extends IHttpStreamRequest {

    /**
     * Gets the contents of this stream
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<InputStream> callback);

    /**
     * Gets the contents of this stream
     *
     * @return the stream that the caller needs to close
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    InputStream get() throws ClientException;

    /**
     * Uploads to the stream
     *
     * @param fileContents the contents of the stream to upload
     * @param callback the callback to be called after success or failure
     */
    void put(final byte[] fileContents, final ICallback<DriveItemVersion> callback);

    /**
     * Uploads to the stream
     *
     * @param fileContents the contents of the stream to upload
     * @return the result of the upload
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    DriveItemVersion put(final byte[] fileContents) throws ClientException;
}
