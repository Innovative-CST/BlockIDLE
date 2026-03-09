package android.widget;

import android.view.View;
import android.view.MotionEvent;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

@Deprecated
public class SlidingDrawer extends ViewGroup
{
    @Deprecated
    public static final int ORIENTATION_HORIZONTAL = 0;
    @Deprecated
    public static final int ORIENTATION_VERTICAL = 1;
    
    @Deprecated
    public SlidingDrawer(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SlidingDrawer(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SlidingDrawer(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onFinishInflate() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void dispatchDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onInterceptTouchEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onTouchEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void toggle() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void animateToggle() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void open() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void animateClose() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void animateOpen() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setOnDrawerOpenListener(final OnDrawerOpenListener onDrawerOpenListener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setOnDrawerCloseListener(final OnDrawerCloseListener onDrawerCloseListener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setOnDrawerScrollListener(final OnDrawerScrollListener onDrawerScrollListener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public View getHandle() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public View getContent() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void unlock() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void lock() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isOpened() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isMoving() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public interface OnDrawerScrollListener
    {
        @Deprecated
        void onScrollStarted();
        
        @Deprecated
        void onScrollEnded();
    }
    
    @Deprecated
    public interface OnDrawerOpenListener
    {
        @Deprecated
        void onDrawerOpened();
    }
    
    @Deprecated
    public interface OnDrawerCloseListener
    {
        @Deprecated
        void onDrawerClosed();
    }
}
