package android.net;

import java.net.InetAddress;
import java.io.IOException;
import javax.net.ssl.KeyManager;
import java.net.Socket;
import javax.net.ssl.TrustManager;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

@Deprecated
public class SSLCertificateSocketFactory extends SSLSocketFactory
{
    @Deprecated
    public SSLCertificateSocketFactory(final int handshakeTimeoutMillis) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static SocketFactory getDefault(final int handshakeTimeoutMillis) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static SSLSocketFactory getDefault(final int handshakeTimeoutMillis, final SSLSessionCache cache) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static SSLSocketFactory getInsecure(final int handshakeTimeoutMillis, final SSLSessionCache cache) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setTrustManagers(final TrustManager[] trustManager) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setNpnProtocols(final byte[][] npnProtocols) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public byte[] getNpnSelectedProtocol(final Socket socket) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setKeyManagers(final KeyManager[] keyManagers) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setUseSessionTickets(final Socket socket, final boolean useSessionTickets) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setHostname(final Socket socket, final String hostName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public Socket createSocket(final Socket k, final String host, final int port, final boolean close) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public Socket createSocket() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public Socket createSocket(final InetAddress addr, final int port, final InetAddress localAddr, final int localPort) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public Socket createSocket(final InetAddress addr, final int port) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public Socket createSocket(final String host, final int port, final InetAddress localAddr, final int localPort) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public Socket createSocket(final String host, final int port) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public String[] getDefaultCipherSuites() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public String[] getSupportedCipherSuites() {
        throw new RuntimeException("Stub!");
    }
}
