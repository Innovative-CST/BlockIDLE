package android.view;

import android.graphics.Rect;
import android.graphics.Canvas;

public interface SurfaceHolder
{
    @Deprecated
    public static final int SURFACE_TYPE_GPU = 2;
    @Deprecated
    public static final int SURFACE_TYPE_HARDWARE = 1;
    @Deprecated
    public static final int SURFACE_TYPE_NORMAL = 0;
    @Deprecated
    public static final int SURFACE_TYPE_PUSH_BUFFERS = 3;
    
    void addCallback(final Callback p0);
    
    void removeCallback(final Callback p0);
    
    boolean isCreating();
    
    @Deprecated
    void setType(final int p0);
    
    void setFixedSize(final int p0, final int p1);
    
    void setSizeFromLayout();
    
    void setFormat(final int p0);
    
    void setKeepScreenOn(final boolean p0);
    
    Canvas lockCanvas();
    
    Canvas lockCanvas(final Rect p0);
    
    default Canvas lockHardwareCanvas() {
        throw new RuntimeException("Stub!");
    }
    
    void unlockCanvasAndPost(final Canvas p0);
    
    Rect getSurfaceFrame();
    
    Surface getSurface();
    
    public static class BadSurfaceTypeException extends RuntimeException
    {
        public BadSurfaceTypeException() {
            throw new RuntimeException("Stub!");
        }
        
        public BadSurfaceTypeException(final String name) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface Callback2 extends Callback
    {
        void surfaceRedrawNeeded(@NonNull final SurfaceHolder p0);
        
        default void surfaceRedrawNeededAsync(@NonNull final SurfaceHolder holder, @NonNull final Runnable drawingFinished) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface Callback
    {
        void surfaceCreated(@NonNull final SurfaceHolder p0);
        
        void surfaceChanged(@NonNull final SurfaceHolder p0, final int p1, final int p2, final int p3);
        
        void surfaceDestroyed(@NonNull final SurfaceHolder p0);
    }
}
