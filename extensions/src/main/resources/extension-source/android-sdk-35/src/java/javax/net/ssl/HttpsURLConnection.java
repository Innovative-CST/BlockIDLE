package javax.net.ssl;

import java.security.Principal;
import java.security.cert.Certificate;
import java.net.URL;
import java.net.HttpURLConnection;

public abstract class HttpsURLConnection extends HttpURLConnection
{
    protected HostnameVerifier hostnameVerifier;
    
    protected HttpsURLConnection(final URL url) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public abstract String getCipherSuite();
    
    public abstract Certificate[] getLocalCertificates();
    
    public abstract Certificate[] getServerCertificates() throws SSLPeerUnverifiedException;
    
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        throw new RuntimeException("Stub!");
    }
    
    public Principal getLocalPrincipal() {
        throw new RuntimeException("Stub!");
    }
    
    public static void setDefaultHostnameVerifier(final HostnameVerifier v) {
        throw new RuntimeException("Stub!");
    }
    
    public static HostnameVerifier getDefaultHostnameVerifier() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHostnameVerifier(final HostnameVerifier v) {
        throw new RuntimeException("Stub!");
    }
    
    public HostnameVerifier getHostnameVerifier() {
        throw new RuntimeException("Stub!");
    }
    
    public static void setDefaultSSLSocketFactory(final SSLSocketFactory sf) {
        throw new RuntimeException("Stub!");
    }
    
    public static SSLSocketFactory getDefaultSSLSocketFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSSLSocketFactory(final SSLSocketFactory sf) {
        throw new RuntimeException("Stub!");
    }
    
    public SSLSocketFactory getSSLSocketFactory() {
        throw new RuntimeException("Stub!");
    }
}
