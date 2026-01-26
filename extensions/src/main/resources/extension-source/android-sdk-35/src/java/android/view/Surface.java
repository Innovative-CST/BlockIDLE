package android.view;

import android.os.Parcel;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Parcelable;

public class Surface implements Parcelable
{
    public static final int CHANGE_FRAME_RATE_ALWAYS = 1;
    public static final int CHANGE_FRAME_RATE_ONLY_IF_SEAMLESS = 0;
    @NonNull
    public static final Creator<Surface> CREATOR;
    public static final int FRAME_RATE_COMPATIBILITY_DEFAULT = 0;
    public static final int FRAME_RATE_COMPATIBILITY_FIXED_SOURCE = 1;
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int ROTATION_90 = 1;
    
    public Surface(@NonNull final SurfaceControl from) {
        throw new RuntimeException("Stub!");
    }
    
    public Surface(final SurfaceTexture surfaceTexture) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isValid() {
        throw new RuntimeException("Stub!");
    }
    
    public Canvas lockCanvas(final Rect inOutDirty) throws IllegalArgumentException, OutOfResourcesException {
        throw new RuntimeException("Stub!");
    }
    
    public void unlockCanvasAndPost(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public Canvas lockHardwareCanvas() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void unlockCanvas(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    public void readFromParcel(final Parcel source) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFrameRate(final float frameRate, final int compatibility, final int changeFrameRateStrategy) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearFrameRate() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFrameRate(final float frameRate, final int compatibility) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class OutOfResourcesException extends RuntimeException
    {
        public OutOfResourcesException() {
            throw new RuntimeException("Stub!");
        }
        
        public OutOfResourcesException(final String name) {
            throw new RuntimeException("Stub!");
        }
    }
}
