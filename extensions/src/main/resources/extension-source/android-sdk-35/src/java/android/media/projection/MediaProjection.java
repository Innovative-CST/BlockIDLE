package android.media.projection;

import android.hardware.display.VirtualDisplay;
import android.view.Surface;
import android.os.Handler;

public final class MediaProjection
{
    MediaProjection() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerCallback(@NonNull final Callback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterCallback(@NonNull final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public VirtualDisplay createVirtualDisplay(@NonNull final String name, final int width, final int height, final int dpi, final int flags, @Nullable final Surface surface, @Nullable final VirtualDisplay.Callback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void stop() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class Callback
    {
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onStop() {
            throw new RuntimeException("Stub!");
        }
        
        public void onCapturedContentResize(final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCapturedContentVisibilityChanged(final boolean isVisible) {
            throw new RuntimeException("Stub!");
        }
    }
}
