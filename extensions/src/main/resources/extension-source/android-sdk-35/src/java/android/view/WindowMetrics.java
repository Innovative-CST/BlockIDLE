package android.view;

import android.graphics.Rect;

public final class WindowMetrics
{
    @Deprecated
    public WindowMetrics(@NonNull final Rect bounds, @NonNull final WindowInsets windowInsets) {
        throw new RuntimeException("Stub!");
    }
    
    public WindowMetrics(@NonNull final Rect bounds, @NonNull final WindowInsets windowInsets, final float density) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Rect getBounds() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public WindowInsets getWindowInsets() {
        throw new RuntimeException("Stub!");
    }
    
    public float getDensity() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
