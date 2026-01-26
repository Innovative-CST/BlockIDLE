package javax.net;

import java.net.InetAddress;
import java.io.IOException;
import java.net.ServerSocket;

public abstract class ServerSocketFactory
{
    protected ServerSocketFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public static ServerSocketFactory getDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public ServerSocket createServerSocket() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract ServerSocket createServerSocket(final int p0) throws IOException;
    
    public abstract ServerSocket createServerSocket(final int p0, final int p1) throws IOException;
    
    public abstract ServerSocket createServerSocket(final int p0, final int p1, final InetAddress p2) throws IOException;
}
