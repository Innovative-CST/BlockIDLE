package org.apache.http.conn.ssl;

import javax.net.ssl.SSLException;

@Deprecated
public class BrowserCompatHostnameVerifier extends AbstractVerifier
{
    @Deprecated
    public BrowserCompatHostnameVerifier() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final void verify(final String host, final String[] cns, final String[] subjectAlts) throws SSLException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final String toString() {
        throw new RuntimeException("Stub!");
    }
}
