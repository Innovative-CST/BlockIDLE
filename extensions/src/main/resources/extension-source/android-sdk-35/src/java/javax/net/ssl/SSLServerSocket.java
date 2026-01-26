package javax.net.ssl;

import java.net.InetAddress;
import java.io.IOException;
import java.net.ServerSocket;

public abstract class SSLServerSocket extends ServerSocket
{
    protected SSLServerSocket() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    protected SSLServerSocket(final int port) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    protected SSLServerSocket(final int port, final int backlog) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    protected SSLServerSocket(final int port, final int backlog, final InetAddress address) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract String[] getEnabledCipherSuites();
    
    public abstract void setEnabledCipherSuites(final String[] p0);
    
    public abstract String[] getSupportedCipherSuites();
    
    public abstract String[] getSupportedProtocols();
    
    public abstract String[] getEnabledProtocols();
    
    public abstract void setEnabledProtocols(final String[] p0);
    
    public abstract void setNeedClientAuth(final boolean p0);
    
    public abstract boolean getNeedClientAuth();
    
    public abstract void setWantClientAuth(final boolean p0);
    
    public abstract boolean getWantClientAuth();
    
    public abstract void setUseClientMode(final boolean p0);
    
    public abstract boolean getUseClientMode();
    
    public abstract void setEnableSessionCreation(final boolean p0);
    
    public abstract boolean getEnableSessionCreation();
    
    public SSLParameters getSSLParameters() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSSLParameters(final SSLParameters params) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
