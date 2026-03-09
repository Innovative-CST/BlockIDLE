package javax.net.ssl;

import java.security.cert.CertificateException;
import java.net.Socket;
import java.security.cert.X509Certificate;

public abstract class X509ExtendedTrustManager implements X509TrustManager
{
    public X509ExtendedTrustManager() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void checkClientTrusted(final X509Certificate[] p0, final String p1, final Socket p2) throws CertificateException;
    
    public abstract void checkServerTrusted(final X509Certificate[] p0, final String p1, final Socket p2) throws CertificateException;
    
    public abstract void checkClientTrusted(final X509Certificate[] p0, final String p1, final SSLEngine p2) throws CertificateException;
    
    public abstract void checkServerTrusted(final X509Certificate[] p0, final String p1, final SSLEngine p2) throws CertificateException;
}
