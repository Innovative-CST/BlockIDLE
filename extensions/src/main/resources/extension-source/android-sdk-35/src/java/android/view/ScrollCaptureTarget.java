package android.view;

import android.graphics.Point;
import android.graphics.Rect;

public final class ScrollCaptureTarget
{
    public ScrollCaptureTarget(@NonNull final View scrollTarget, @NonNull final Rect localVisibleRect, @NonNull final Point positionInWindow, @NonNull final ScrollCaptureCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public int getHint() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ScrollCaptureCallback getCallback() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public View getContainingView() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Rect getLocalVisibleRect() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Point getPositionInWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Rect getScrollBounds() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollBounds(@Nullable final Rect scrollBounds) {
        throw new RuntimeException("Stub!");
    }
    
    public void updatePositionInWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
