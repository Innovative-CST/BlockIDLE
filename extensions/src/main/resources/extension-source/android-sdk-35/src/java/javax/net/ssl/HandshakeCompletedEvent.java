package javax.net.ssl;

import java.security.Principal;
import javax.security.cert.X509Certificate;
import java.security.cert.Certificate;
import java.util.EventObject;

public class HandshakeCompletedEvent extends EventObject
{
    public HandshakeCompletedEvent(final SSLSocket sock, final SSLSession s) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public SSLSession getSession() {
        throw new RuntimeException("Stub!");
    }
    
    public String getCipherSuite() {
        throw new RuntimeException("Stub!");
    }
    
    public Certificate[] getLocalCertificates() {
        throw new RuntimeException("Stub!");
    }
    
    public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
        throw new RuntimeException("Stub!");
    }
    
    public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
        throw new RuntimeException("Stub!");
    }
    
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        throw new RuntimeException("Stub!");
    }
    
    public Principal getLocalPrincipal() {
        throw new RuntimeException("Stub!");
    }
    
    public SSLSocket getSocket() {
        throw new RuntimeException("Stub!");
    }
}
