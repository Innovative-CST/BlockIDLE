package android.net.http;

import java.security.cert.X509Certificate;

public class SslError
{
    public static final int SSL_DATE_INVALID = 4;
    public static final int SSL_EXPIRED = 1;
    public static final int SSL_IDMISMATCH = 2;
    public static final int SSL_INVALID = 5;
    @Deprecated
    public static final int SSL_MAX_ERROR = 6;
    public static final int SSL_NOTYETVALID = 0;
    public static final int SSL_UNTRUSTED = 3;
    
    @Deprecated
    public SslError(final int error, final SslCertificate certificate) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SslError(final int error, final X509Certificate certificate) {
        throw new RuntimeException("Stub!");
    }
    
    public SslError(final int error, final SslCertificate certificate, final String url) {
        throw new RuntimeException("Stub!");
    }
    
    public SslError(final int error, final X509Certificate certificate, final String url) {
        throw new RuntimeException("Stub!");
    }
    
    public SslCertificate getCertificate() {
        throw new RuntimeException("Stub!");
    }
    
    public String getUrl() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean addError(final int error) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasError(final int error) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPrimaryError() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
