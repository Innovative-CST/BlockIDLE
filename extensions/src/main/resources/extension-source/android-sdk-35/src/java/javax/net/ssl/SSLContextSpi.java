package javax.net.ssl;

import java.security.KeyManagementException;
import java.security.SecureRandom;

public abstract class SSLContextSpi
{
    public SSLContextSpi() {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract void engineInit(final KeyManager[] p0, final TrustManager[] p1, final SecureRandom p2) throws KeyManagementException;
    
    protected abstract SSLSocketFactory engineGetSocketFactory();
    
    protected abstract SSLServerSocketFactory engineGetServerSocketFactory();
    
    protected abstract SSLEngine engineCreateSSLEngine();
    
    protected abstract SSLEngine engineCreateSSLEngine(final String p0, final int p1);
    
    protected abstract SSLSessionContext engineGetServerSessionContext();
    
    protected abstract SSLSessionContext engineGetClientSessionContext();
    
    protected SSLParameters engineGetDefaultSSLParameters() {
        throw new RuntimeException("Stub!");
    }
    
    protected SSLParameters engineGetSupportedSSLParameters() {
        throw new RuntimeException("Stub!");
    }
}
