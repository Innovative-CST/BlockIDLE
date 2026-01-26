package android.view;

import android.os.IBinder;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Region;
import android.util.AttributeSet;
import android.content.Context;

public class SurfaceView extends View
{
    public static final int SURFACE_LIFECYCLE_DEFAULT = 0;
    public static final int SURFACE_LIFECYCLE_FOLLOWS_ATTACHMENT = 2;
    public static final int SURFACE_LIFECYCLE_FOLLOWS_VISIBILITY = 1;
    
    public SurfaceView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public SurfaceView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public SurfaceView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public SurfaceView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public SurfaceHolder getHolder() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onWindowVisibilityChanged(final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setVisibility(final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setAlpha(final float alpha) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean onSetAlpha(final int alpha) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean gatherTransparentRegion(final Region region) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setClipBounds(final Rect clipBounds) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean hasOverlappingRendering() {
        throw new RuntimeException("Stub!");
    }
    
    public void setZOrderMediaOverlay(final boolean isMediaOverlay) {
        throw new RuntimeException("Stub!");
    }
    
    public void setZOrderOnTop(final boolean onTop) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSecure(final boolean isSecure) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSurfaceLifecycle(final int lifecycleStrategy) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDesiredHdrHeadroom(final float desiredHeadroom) {
        throw new RuntimeException("Stub!");
    }
    
    public SurfaceControl getSurfaceControl() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public IBinder getHostToken() {
        throw new RuntimeException("Stub!");
    }
    
    public void setChildSurfacePackage(@NonNull final SurfaceControlViewHost.SurfacePackage p) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getImportantForAccessibility() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onFocusChanged(final boolean gainFocus, final int direction, @Nullable final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
    
    public void applyTransactionToFrame(@NonNull final SurfaceControl.Transaction transaction) {
        throw new RuntimeException("Stub!");
    }
}
