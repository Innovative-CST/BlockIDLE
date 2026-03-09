package javax.net.ssl;

import java.security.Principal;
import javax.security.cert.X509Certificate;
import java.security.cert.Certificate;

public interface SSLSession
{
    byte[] getId();
    
    SSLSessionContext getSessionContext();
    
    long getCreationTime();
    
    long getLastAccessedTime();
    
    void invalidate();
    
    boolean isValid();
    
    void putValue(final String p0, final Object p1);
    
    Object getValue(final String p0);
    
    void removeValue(final String p0);
    
    String[] getValueNames();
    
    Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException;
    
    Certificate[] getLocalCertificates();
    
    X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException;
    
    Principal getPeerPrincipal() throws SSLPeerUnverifiedException;
    
    Principal getLocalPrincipal();
    
    String getCipherSuite();
    
    String getProtocol();
    
    String getPeerHost();
    
    int getPeerPort();
    
    int getPacketBufferSize();
    
    int getApplicationBufferSize();
}
