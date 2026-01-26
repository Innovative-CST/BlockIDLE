package android.hardware.display;

import android.view.Surface;
import android.view.Display;

public final class VirtualDisplay
{
    VirtualDisplay() {
        throw new RuntimeException("Stub!");
    }
    
    public Display getDisplay() {
        throw new RuntimeException("Stub!");
    }
    
    public Surface getSurface() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSurface(final Surface surface) {
        throw new RuntimeException("Stub!");
    }
    
    public void resize(final int width, final int height, final int densityDpi) {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class Callback
    {
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onPaused() {
            throw new RuntimeException("Stub!");
        }
        
        public void onResumed() {
            throw new RuntimeException("Stub!");
        }
        
        public void onStopped() {
            throw new RuntimeException("Stub!");
        }
    }
}
