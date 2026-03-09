package javax.net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;
import java.net.Socket;

public abstract class SocketFactory
{
    protected SocketFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public static SocketFactory getDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public Socket createSocket() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Socket createSocket(final String p0, final int p1) throws IOException, UnknownHostException;
    
    public abstract Socket createSocket(final String p0, final int p1, final InetAddress p2, final int p3) throws IOException, UnknownHostException;
    
    public abstract Socket createSocket(final InetAddress p0, final int p1) throws IOException;
    
    public abstract Socket createSocket(final InetAddress p0, final int p1, final InetAddress p2, final int p3) throws IOException;
}
