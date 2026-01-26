package org.apache.http.conn;

import java.io.InterruptedIOException;

@Deprecated
public class ConnectTimeoutException extends InterruptedIOException
{
    @Deprecated
    public ConnectTimeoutException() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ConnectTimeoutException(final String message) {
        throw new RuntimeException("Stub!");
    }
}
