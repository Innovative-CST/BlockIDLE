package javax.net.ssl;

import java.util.List;
import java.util.function.BiFunction;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;
import java.net.Socket;

public abstract class SSLSocket extends Socket
{
    protected SSLSocket() {
        throw new RuntimeException("Stub!");
    }
    
    protected SSLSocket(final String host, final int port) throws IOException, UnknownHostException {
        throw new RuntimeException("Stub!");
    }
    
    protected SSLSocket(final InetAddress address, final int port) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    protected SSLSocket(final String host, final int port, final InetAddress clientAddress, final int clientPort) throws IOException, UnknownHostException {
        throw new RuntimeException("Stub!");
    }
    
    protected SSLSocket(final InetAddress address, final int port, final InetAddress clientAddress, final int clientPort) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract String[] getSupportedCipherSuites();
    
    public abstract String[] getEnabledCipherSuites();
    
    public abstract void setEnabledCipherSuites(final String[] p0);
    
    public abstract String[] getSupportedProtocols();
    
    public abstract String[] getEnabledProtocols();
    
    public abstract void setEnabledProtocols(final String[] p0);
    
    public abstract SSLSession getSession();
    
    public SSLSession getHandshakeSession() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void addHandshakeCompletedListener(final HandshakeCompletedListener p0);
    
    public abstract void removeHandshakeCompletedListener(final HandshakeCompletedListener p0);
    
    public abstract void startHandshake() throws IOException;
    
    public abstract void setUseClientMode(final boolean p0);
    
    public abstract boolean getUseClientMode();
    
    public abstract void setNeedClientAuth(final boolean p0);
    
    public abstract boolean getNeedClientAuth();
    
    public abstract void setWantClientAuth(final boolean p0);
    
    public abstract boolean getWantClientAuth();
    
    public abstract void setEnableSessionCreation(final boolean p0);
    
    public abstract boolean getEnableSessionCreation();
    
    public SSLParameters getSSLParameters() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSSLParameters(final SSLParameters params) {
        throw new RuntimeException("Stub!");
    }
    
    public String getApplicationProtocol() {
        throw new RuntimeException("Stub!");
    }
    
    public String getHandshakeApplicationProtocol() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHandshakeApplicationProtocolSelector(final BiFunction<SSLSocket, List<String>, String> selector) {
        throw new RuntimeException("Stub!");
    }
    
    public BiFunction<SSLSocket, List<String>, String> getHandshakeApplicationProtocolSelector() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
