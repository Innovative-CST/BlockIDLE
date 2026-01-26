package javax.net.ssl;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public interface X509TrustManager extends TrustManager
{
    void checkClientTrusted(final X509Certificate[] p0, final String p1) throws CertificateException;
    
    void checkServerTrusted(final X509Certificate[] p0, final String p1) throws CertificateException;
    
    X509Certificate[] getAcceptedIssuers();
}
