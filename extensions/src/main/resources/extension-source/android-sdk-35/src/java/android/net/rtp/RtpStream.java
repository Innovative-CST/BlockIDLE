package android.net.rtp;

import java.net.InetAddress;

@Deprecated
public class RtpStream
{
    @Deprecated
    public static final int MODE_NORMAL = 0;
    @Deprecated
    public static final int MODE_RECEIVE_ONLY = 2;
    @Deprecated
    public static final int MODE_SEND_ONLY = 1;
    
    RtpStream() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public InetAddress getLocalAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getLocalPort() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public InetAddress getRemoteAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getRemotePort() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isBusy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void associate(final InetAddress address, final int port) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
}
