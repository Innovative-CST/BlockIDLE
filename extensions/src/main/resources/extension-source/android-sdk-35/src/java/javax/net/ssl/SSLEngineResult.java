package javax.net.ssl;

public class SSLEngineResult
{
    public SSLEngineResult(final Status status, final HandshakeStatus handshakeStatus, final int bytesConsumed, final int bytesProduced) {
        throw new RuntimeException("Stub!");
    }
    
    public final Status getStatus() {
        throw new RuntimeException("Stub!");
    }
    
    public final HandshakeStatus getHandshakeStatus() {
        throw new RuntimeException("Stub!");
    }
    
    public final int bytesConsumed() {
        throw new RuntimeException("Stub!");
    }
    
    public final int bytesProduced() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public enum HandshakeStatus
    {
        NOT_HANDSHAKING, 
        FINISHED, 
        NEED_TASK, 
        NEED_WRAP, 
        NEED_UNWRAP;
    }
    
    public enum Status
    {
        BUFFER_UNDERFLOW, 
        BUFFER_OVERFLOW, 
        OK, 
        CLOSED;
    }
}
