package android.accessibilityservice;

import android.view.MotionEvent;
import java.util.concurrent.Executor;

public final class TouchInteractionController
{
    public static final int STATE_CLEAR = 0;
    public static final int STATE_DELEGATING = 4;
    public static final int STATE_DRAGGING = 3;
    public static final int STATE_TOUCH_EXPLORING = 2;
    public static final int STATE_TOUCH_INTERACTING = 1;
    
    TouchInteractionController() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerCallback(@Nullable final Executor executor, @NonNull final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean unregisterCallback(@NonNull final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterAllCallbacks() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestTouchExploration() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestDragging(final int pointerId) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestDelegating() {
        throw new RuntimeException("Stub!");
    }
    
    public void performClick() {
        throw new RuntimeException("Stub!");
    }
    
    public void performLongClickAndStartDrag() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxPointerCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDisplayId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getState() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static String stateToString(final int state) {
        throw new RuntimeException("Stub!");
    }
    
    public interface Callback
    {
        void onMotionEvent(@NonNull final MotionEvent p0);
        
        void onStateChanged(final int p0);
    }
}
