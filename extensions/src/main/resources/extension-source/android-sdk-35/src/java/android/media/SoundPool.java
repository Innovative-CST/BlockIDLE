package android.media;

import java.io.FileDescriptor;
import android.content.res.AssetFileDescriptor;
import android.content.Context;

public class SoundPool
{
    @Deprecated
    public SoundPool(final int maxStreams, final int streamType, final int srcQuality) {
        throw new RuntimeException("Stub!");
    }
    
    public final void release() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public int load(final String path, final int priority) {
        throw new RuntimeException("Stub!");
    }
    
    public int load(final Context context, final int resId, final int priority) {
        throw new RuntimeException("Stub!");
    }
    
    public int load(final AssetFileDescriptor afd, final int priority) {
        throw new RuntimeException("Stub!");
    }
    
    public int load(final FileDescriptor fd, final long offset, final long length, final int priority) {
        throw new RuntimeException("Stub!");
    }
    
    public final native boolean unload(final int p0);
    
    public final int play(final int soundID, final float leftVolume, final float rightVolume, final int priority, final int loop, final float rate) {
        throw new RuntimeException("Stub!");
    }
    
    public final native void pause(final int p0);
    
    public final native void resume(final int p0);
    
    public final native void autoPause();
    
    public final native void autoResume();
    
    public final native void stop(final int p0);
    
    public final void setVolume(final int streamID, final float leftVolume, final float rightVolume) {
        throw new RuntimeException("Stub!");
    }
    
    public final native void setPriority(final int p0, final int p1);
    
    public final native void setLoop(final int p0, final int p1);
    
    public final native void setRate(final int p0, final float p1);
    
    public void setOnLoadCompleteListener(final OnLoadCompleteListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public static class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setMaxStreams(final int maxStreams) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setAudioAttributes(final AudioAttributes attributes) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAudioSessionId(final int sessionId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setContext(@NonNull final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        public SoundPool build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnLoadCompleteListener
    {
        void onLoadComplete(final SoundPool p0, final int p1, final int p2);
    }
}
