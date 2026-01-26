package android.net.http;

import java.security.cert.CertificateException;
import java.util.List;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class X509TrustManagerExtensions
{
    public X509TrustManagerExtensions(final X509TrustManager tm) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    public List<X509Certificate> checkServerTrusted(final X509Certificate[] chain, final String authType, final String host) throws CertificateException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUserAddedCertificate(final X509Certificate cert) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSameTrustConfiguration(final String hostname1, final String hostname2) {
        throw new RuntimeException("Stub!");
    }
}
