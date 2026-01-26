package android.widget.inline;

import android.graphics.Rect;
import android.view.SurfaceControl;
import android.content.Context;
import android.view.ViewGroup;

public class InlineContentView extends ViewGroup
{
    InlineContentView() {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SurfaceControl getSurfaceControl() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setClipBounds(final Rect clipBounds) {
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
    
    public void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSurfaceControlCallback(@Nullable final SurfaceControlCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isZOrderedOnTop() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setZOrderedOnTop(final boolean onTop) {
        throw new RuntimeException("Stub!");
    }
    
    public interface SurfaceControlCallback
    {
        void onCreated(@NonNull final SurfaceControl p0);
        
        void onDestroyed(@NonNull final SurfaceControl p0);
    }
}
