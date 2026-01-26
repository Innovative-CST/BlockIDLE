package android.graphics;

import android.os.Handler;

public class SurfaceTexture
{
    public SurfaceTexture(final int texName) {
        throw new RuntimeException("Stub!");
    }
    
    public SurfaceTexture(final int texName, final boolean singleBufferMode) {
        throw new RuntimeException("Stub!");
    }
    
    public SurfaceTexture(final boolean singleBufferMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnFrameAvailableListener(@Nullable final OnFrameAvailableListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnFrameAvailableListener(@Nullable final OnFrameAvailableListener listener, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDefaultBufferSize(final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateTexImage() {
        throw new RuntimeException("Stub!");
    }
    
    public void releaseTexImage() {
        throw new RuntimeException("Stub!");
    }
    
    public void detachFromGLContext() {
        throw new RuntimeException("Stub!");
    }
    
    public void attachToGLContext(final int texName) {
        throw new RuntimeException("Stub!");
    }
    
    public void getTransformMatrix(final float[] mtx) {
        throw new RuntimeException("Stub!");
    }
    
    public long getTimestamp() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDataSpace() {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isReleased() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static class OutOfResourcesException extends Exception
    {
        @Deprecated
        public OutOfResourcesException() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public OutOfResourcesException(final String name) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnFrameAvailableListener
    {
        void onFrameAvailable(final SurfaceTexture p0);
    }
}
