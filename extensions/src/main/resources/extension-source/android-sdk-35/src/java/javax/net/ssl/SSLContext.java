package javax.net.ssl;

import java.security.KeyManagementException;
import java.security.SecureRandom;
import java.security.NoSuchProviderException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

public class SSLContext
{
    protected SSLContext(final SSLContextSpi contextSpi, final Provider provider, final String protocol) {
        throw new RuntimeException("Stub!");
    }
    
    public static synchronized SSLContext getDefault() throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public static synchronized void setDefault(final SSLContext context) {
        throw new RuntimeException("Stub!");
    }
    
    public static SSLContext getInstance(final String protocol) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public static SSLContext getInstance(final String protocol, final String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
        throw new RuntimeException("Stub!");
    }
    
    public static SSLContext getInstance(final String protocol, final Provider provider) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public final String getProtocol() {
        throw new RuntimeException("Stub!");
    }
    
    public final Provider getProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final KeyManager[] km, final TrustManager[] tm, final SecureRandom random) throws KeyManagementException {
        throw new RuntimeException("Stub!");
    }
    
    public final SSLSocketFactory getSocketFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public final SSLServerSocketFactory getServerSocketFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public final SSLEngine createSSLEngine() {
        throw new RuntimeException("Stub!");
    }
    
    public final SSLEngine createSSLEngine(final String peerHost, final int peerPort) {
        throw new RuntimeException("Stub!");
    }
    
    public final SSLSessionContext getServerSessionContext() {
        throw new RuntimeException("Stub!");
    }
    
    public final SSLSessionContext getClientSessionContext() {
        throw new RuntimeException("Stub!");
    }
    
    public final SSLParameters getDefaultSSLParameters() {
        throw new RuntimeException("Stub!");
    }
    
    public final SSLParameters getSupportedSSLParameters() {
        throw new RuntimeException("Stub!");
    }
}
