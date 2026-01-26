package org.apache.http.conn.ssl;

import javax.net.ssl.SSLException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLSession;
import java.io.IOException;
import javax.net.ssl.SSLSocket;

@Deprecated
public abstract class AbstractVerifier implements X509HostnameVerifier
{
    @Deprecated
    public AbstractVerifier() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final void verify(final String host, final SSLSocket ssl) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final boolean verify(final String host, final SSLSession session) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final void verify(final String host, final X509Certificate cert) throws SSLException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void verify(final String host, final String[] cns, final String[] subjectAlts, final boolean strictWithSubDomains) throws SSLException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static boolean acceptableCountryWildcard(final String cn) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static String[] getCNs(final X509Certificate cert) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static String[] getDNSSubjectAlts(final X509Certificate cert) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int countDots(final String s) {
        throw new RuntimeException("Stub!");
    }
}
