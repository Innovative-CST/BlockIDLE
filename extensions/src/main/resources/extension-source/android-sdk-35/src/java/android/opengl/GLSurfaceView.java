package android.opengl;

import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.util.AttributeSet;
import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GLSurfaceView extends SurfaceView implements SurfaceHolder.Callback2
{
    public static final int DEBUG_CHECK_GL_ERROR = 1;
    public static final int DEBUG_LOG_GL_CALLS = 2;
    public static final int RENDERMODE_CONTINUOUSLY = 1;
    public static final int RENDERMODE_WHEN_DIRTY = 0;
    
    public GLSurfaceView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public GLSurfaceView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public void setGLWrapper(final GLWrapper glWrapper) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDebugFlags(final int debugFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDebugFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPreserveEGLContextOnPause(final boolean preserveOnPause) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getPreserveEGLContextOnPause() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRenderer(final Renderer renderer) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEGLContextFactory(final EGLContextFactory factory) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEGLWindowSurfaceFactory(final EGLWindowSurfaceFactory factory) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEGLConfigChooser(final EGLConfigChooser configChooser) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEGLConfigChooser(final boolean needDepth) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEGLConfigChooser(final int redSize, final int greenSize, final int blueSize, final int alphaSize, final int depthSize, final int stencilSize) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEGLContextClientVersion(final int version) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRenderMode(final int renderMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRenderMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestRender() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void surfaceCreated(final SurfaceHolder holder) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void surfaceDestroyed(final SurfaceHolder holder) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void surfaceChanged(final SurfaceHolder holder, final int format, final int w, final int h) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void surfaceRedrawNeededAsync(final SurfaceHolder holder, final Runnable finishDrawing) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void surfaceRedrawNeeded(final SurfaceHolder holder) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPause() {
        throw new RuntimeException("Stub!");
    }
    
    public void onResume() {
        throw new RuntimeException("Stub!");
    }
    
    public void queueEvent(final Runnable r) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    public interface Renderer
    {
        void onSurfaceCreated(final GL10 p0, final EGLConfig p1);
        
        void onSurfaceChanged(final GL10 p0, final int p1, final int p2);
        
        void onDrawFrame(final GL10 p0);
    }
    
    public interface GLWrapper
    {
        GL wrap(final GL p0);
    }
    
    public interface EGLWindowSurfaceFactory
    {
        EGLSurface createWindowSurface(final EGL10 p0, final EGLDisplay p1, final EGLConfig p2, final Object p3);
        
        void destroySurface(final EGL10 p0, final EGLDisplay p1, final EGLSurface p2);
    }
    
    public interface EGLContextFactory
    {
        EGLContext createContext(final EGL10 p0, final EGLDisplay p1, final EGLConfig p2);
        
        void destroyContext(final EGL10 p0, final EGLDisplay p1, final EGLContext p2);
    }
    
    public interface EGLConfigChooser
    {
        EGLConfig chooseConfig(final EGL10 p0, final EGLDisplay p1);
    }
}
