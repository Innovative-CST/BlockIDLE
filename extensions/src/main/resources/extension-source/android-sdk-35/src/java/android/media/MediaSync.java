package android.media;

import java.nio.ByteBuffer;
import android.view.Surface;
import android.os.Handler;

public final class MediaSync
{
    public static final int MEDIASYNC_ERROR_AUDIOTRACK_FAIL = 1;
    public static final int MEDIASYNC_ERROR_SURFACE_FAIL = 2;
    
    public MediaSync() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCallback(@Nullable final Callback cb, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnErrorListener(@Nullable final OnErrorListener listener, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSurface(@Nullable final Surface surface) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAudioTrack(@Nullable final AudioTrack audioTrack) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public native Surface createInputSurface();
    
    public void setPlaybackParams(@NonNull final PlaybackParams params) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public native PlaybackParams getPlaybackParams();
    
    public void setSyncParams(@NonNull final SyncParams params) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public native SyncParams getSyncParams();
    
    public void flush() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MediaTimestamp getTimestamp() {
        throw new RuntimeException("Stub!");
    }
    
    public void queueAudio(@NonNull final ByteBuffer audioData, final int bufferId, final long presentationTimeUs) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class Callback
    {
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onAudioBufferConsumed(@NonNull final MediaSync p0, @NonNull final ByteBuffer p1, final int p2);
    }
    
    public interface OnErrorListener
    {
        void onError(@NonNull final MediaSync p0, final int p1, final int p2);
    }
}
