package android.widget;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.View;

@Deprecated
public class ZoomButtonsController implements View.OnTouchListener
{
    @Deprecated
    public ZoomButtonsController(final View ownerView) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setZoomInEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setZoomOutEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setZoomSpeed(final long speed) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setOnZoomListener(final OnZoomListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setFocusable(final boolean focusable) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isAutoDismissed() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setAutoDismissed(final boolean autoDismiss) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isVisible() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setVisible(final boolean visible) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ViewGroup getContainer() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public View getZoomControls() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onTouch(final View v, final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public interface OnZoomListener
    {
        @Deprecated
        void onVisibilityChanged(final boolean p0);
        
        @Deprecated
        void onZoom(final boolean p0);
    }
}
