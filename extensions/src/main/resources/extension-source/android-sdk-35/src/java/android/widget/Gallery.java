package android.widget;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.ContextMenu;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.Transformation;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.GestureDetector;

@Deprecated
public class Gallery extends AbsSpinner implements GestureDetector.OnGestureListener
{
    @Deprecated
    public Gallery(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Gallery(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Gallery(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Gallery(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setCallbackDuringFling(final boolean shouldCallback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setAnimationDuration(final int animationDurationMillis) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSpacing(final int spacing) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setUnselectedAlpha(final float unselectedAlpha) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected boolean getChildStaticTransformation(final View child, final Transformation t) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected int computeHorizontalScrollExtent() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected int computeHorizontalScrollOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected int computeHorizontalScrollRange() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected boolean checkLayoutParams(final ViewGroup.LayoutParams p) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected ViewGroup.LayoutParams generateLayoutParams(final ViewGroup.LayoutParams p) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public ViewGroup.LayoutParams generateLayoutParams(final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onTouchEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onSingleTapUp(final MotionEvent e) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onFling(final MotionEvent e1, final MotionEvent e2, final float velocityX, final float velocityY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onScroll(final MotionEvent e1, final MotionEvent e2, final float distanceX, final float distanceY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onDown(final MotionEvent e) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onLongPress(@NonNull final MotionEvent e) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onShowPress(final MotionEvent e) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void dispatchSetSelected(final boolean selected) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void dispatchSetPressed(final boolean pressed) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean showContextMenuForChild(final View originalView) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean showContextMenuForChild(final View originalView, final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean showContextMenu() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean showContextMenu(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean dispatchKeyEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setGravity(final int gravity) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected int getChildDrawingOrder(final int childCount, final int i) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onFocusChanged(final boolean gainFocus, final int direction, final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static class LayoutParams extends ViewGroup.LayoutParams
    {
        @Deprecated
        public LayoutParams(final Context c, final AttributeSet attrs) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public LayoutParams(final int w, final int h) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public LayoutParams(final ViewGroup.LayoutParams source) {
            super(null);
            throw new RuntimeException("Stub!");
        }
    }
}
