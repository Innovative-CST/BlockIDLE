package javax.net.ssl;

import java.io.IOException;
import java.net.Socket;
import javax.net.SocketFactory;

public abstract class SSLSocketFactory extends SocketFactory
{
    public SSLSocketFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public static synchronized SocketFactory getDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract String[] getDefaultCipherSuites();
    
    public abstract String[] getSupportedCipherSuites();
    
    public abstract Socket createSocket(final Socket p0, final String p1, final int p2, final boolean p3) throws IOException;
}
