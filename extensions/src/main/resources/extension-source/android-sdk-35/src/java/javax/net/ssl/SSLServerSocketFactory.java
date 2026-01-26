package javax.net.ssl;

import javax.net.ServerSocketFactory;

public abstract class SSLServerSocketFactory extends ServerSocketFactory
{
    protected SSLServerSocketFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public static synchronized ServerSocketFactory getDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract String[] getDefaultCipherSuites();
    
    public abstract String[] getSupportedCipherSuites();
}
