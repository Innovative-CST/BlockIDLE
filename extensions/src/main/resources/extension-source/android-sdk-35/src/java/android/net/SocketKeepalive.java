package android.net;

public abstract class SocketKeepalive implements AutoCloseable
{
    public static final int ERROR_HARDWARE_ERROR = -31;
    public static final int ERROR_INSUFFICIENT_RESOURCES = -32;
    public static final int ERROR_INVALID_INTERVAL = -24;
    public static final int ERROR_INVALID_IP_ADDRESS = -21;
    public static final int ERROR_INVALID_LENGTH = -23;
    public static final int ERROR_INVALID_NETWORK = -20;
    public static final int ERROR_INVALID_PORT = -22;
    public static final int ERROR_INVALID_SOCKET = -25;
    public static final int ERROR_SOCKET_NOT_IDLE = -26;
    public static final int ERROR_UNSUPPORTED = -30;
    
    SocketKeepalive() {
        throw new RuntimeException("Stub!");
    }
    
    public final void start(final int intervalSec) {
        throw new RuntimeException("Stub!");
    }
    
    public final void stop() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void close() {
        throw new RuntimeException("Stub!");
    }
    
    public static class Callback
    {
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onStarted() {
            throw new RuntimeException("Stub!");
        }
        
        public void onStopped() {
            throw new RuntimeException("Stub!");
        }
        
        public void onError(final int error) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDataReceived() {
            throw new RuntimeException("Stub!");
        }
    }
}
