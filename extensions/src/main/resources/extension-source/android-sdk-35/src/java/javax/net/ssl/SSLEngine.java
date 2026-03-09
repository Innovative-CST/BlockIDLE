package javax.net.ssl;

import java.util.List;
import java.util.function.BiFunction;
import java.nio.ByteBuffer;

public abstract class SSLEngine
{
    protected SSLEngine() {
        throw new RuntimeException("Stub!");
    }
    
    protected SSLEngine(final String peerHost, final int peerPort) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPeerHost() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPeerPort() {
        throw new RuntimeException("Stub!");
    }
    
    public SSLEngineResult wrap(final ByteBuffer src, final ByteBuffer dst) throws SSLException {
        throw new RuntimeException("Stub!");
    }
    
    public SSLEngineResult wrap(final ByteBuffer[] srcs, final ByteBuffer dst) throws SSLException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract SSLEngineResult wrap(final ByteBuffer[] p0, final int p1, final int p2, final ByteBuffer p3) throws SSLException;
    
    public SSLEngineResult unwrap(final ByteBuffer src, final ByteBuffer dst) throws SSLException {
        throw new RuntimeException("Stub!");
    }
    
    public SSLEngineResult unwrap(final ByteBuffer src, final ByteBuffer[] dsts) throws SSLException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract SSLEngineResult unwrap(final ByteBuffer p0, final ByteBuffer[] p1, final int p2, final int p3) throws SSLException;
    
    public abstract Runnable getDelegatedTask();
    
    public abstract void closeInbound() throws SSLException;
    
    public abstract boolean isInboundDone();
    
    public abstract void closeOutbound();
    
    public abstract boolean isOutboundDone();
    
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
    
    public abstract void beginHandshake() throws SSLException;
    
    public abstract SSLEngineResult.HandshakeStatus getHandshakeStatus();
    
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
    
    public void setHandshakeApplicationProtocolSelector(final BiFunction<SSLEngine, List<String>, String> selector) {
        throw new RuntimeException("Stub!");
    }
    
    public BiFunction<SSLEngine, List<String>, String> getHandshakeApplicationProtocolSelector() {
        throw new RuntimeException("Stub!");
    }
}
