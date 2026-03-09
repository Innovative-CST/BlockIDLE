package android.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.view.InputQueue;
import android.view.SurfaceHolder;

public class NativeActivity extends Activity implements SurfaceHolder.Callback2, InputQueue.Callback, ViewTreeObserver.OnGlobalLayoutListener
{
    public static final String META_DATA_FUNC_NAME = "android.app.func_name";
    public static final String META_DATA_LIB_NAME = "android.app.lib_name";
    
    public NativeActivity() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onPause() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onResume() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onStart() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onStop() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onConfigurationChanged(final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onLowMemory() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onWindowFocusChanged(final boolean hasFocus) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void surfaceCreated(final SurfaceHolder holder) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void surfaceChanged(final SurfaceHolder holder, final int format, final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void surfaceRedrawNeeded(final SurfaceHolder holder) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void surfaceDestroyed(final SurfaceHolder holder) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onInputQueueCreated(final InputQueue queue) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onInputQueueDestroyed(final InputQueue queue) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onGlobalLayout() {
        throw new RuntimeException("Stub!");
    }
}
