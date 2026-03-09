package android.view;

import android.view.accessibility.AccessibilityNodeInfo;
import android.graphics.Rect;

public class TouchDelegate
{
    public static final int ABOVE = 1;
    public static final int BELOW = 2;
    public static final int TO_LEFT = 4;
    public static final int TO_RIGHT = 8;
    
    public TouchDelegate(final Rect bounds, final View delegateView) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onTouchEvent(@NonNull final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onTouchExplorationHoverEvent(@NonNull final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        throw new RuntimeException("Stub!");
    }
}
