package org.apache.http.conn.ssl;

import javax.net.ssl.SSLException;
import java.security.cert.X509Certificate;
import java.io.IOException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSession;
import javax.net.ssl.HostnameVerifier;

@Deprecated
public interface X509HostnameVerifier extends HostnameVerifier
{
    @Deprecated
    boolean verify(final String p0, final SSLSession p1);
    
    @Deprecated
    void verify(final String p0, final SSLSocket p1) throws IOException;
    
    @Deprecated
    void verify(final String p0, final X509Certificate p1) throws SSLException;
    
    @Deprecated
    void verify(final String p0, final String[] p1, final String[] p2) throws SSLException;
}
