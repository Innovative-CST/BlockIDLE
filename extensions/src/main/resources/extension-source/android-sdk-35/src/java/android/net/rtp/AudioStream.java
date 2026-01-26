package android.net.rtp;

import java.net.SocketException;
import java.net.InetAddress;

@Deprecated
public class AudioStream extends RtpStream
{
    @Deprecated
    public AudioStream(final InetAddress address) throws SocketException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final boolean isBusy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public AudioGroup getGroup() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void join(final AudioGroup group) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public AudioCodec getCodec() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setCodec(final AudioCodec codec) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getDtmfType() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDtmfType(final int type) {
        throw new RuntimeException("Stub!");
    }
}
