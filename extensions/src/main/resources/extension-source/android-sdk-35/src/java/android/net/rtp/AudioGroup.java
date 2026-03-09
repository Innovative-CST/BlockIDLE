package android.net.rtp;

import android.content.Context;

@Deprecated
public class AudioGroup
{
    @Deprecated
    public static final int MODE_ECHO_SUPPRESSION = 3;
    @Deprecated
    public static final int MODE_MUTED = 1;
    @Deprecated
    public static final int MODE_NORMAL = 2;
    @Deprecated
    public static final int MODE_ON_HOLD = 0;
    
    @Deprecated
    public AudioGroup() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public AudioGroup(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public AudioStream[] getStreams() {
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
    public void sendDtmf(final int event) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void clear() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
}
