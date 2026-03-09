package android.widget;

import android.os.Parcelable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class ScrollView extends FrameLayout
{
    public ScrollView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ScrollView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ScrollView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ScrollView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean shouldDelayChildPressedState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected float getTopFadingEdgeStrength() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected float getBottomFadingEdgeStrength() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEdgeEffectColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBottomEdgeEffectColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTopEdgeEffectColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTopEdgeEffectColor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBottomEdgeEffectColor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxScrollAmount() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addView(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addView(final View child, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addView(final View child, final ViewGroup.LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addView(final View child, final int index, final ViewGroup.LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFillViewport() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFillViewport(final boolean fillViewport) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSmoothScrollingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSmoothScrollingEnabled(final boolean smoothScrollingEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchKeyEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean executeKeyEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void requestDisallowInterceptTouchEvent(final boolean disallowIntercept) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onInterceptTouchEvent(final MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onGenericMotionEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onOverScrolled(final int scrollX, final int scrollY, final boolean clampedX, final boolean clampedY) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean pageScroll(final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean fullScroll(final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean arrowScroll(final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public final void smoothScrollBy(final int dx, final int dy) {
        throw new RuntimeException("Stub!");
    }
    
    public final void smoothScrollTo(final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int computeVerticalScrollRange() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int computeVerticalScrollOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void measureChild(final View child, final int parentWidthMeasureSpec, final int parentHeightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void measureChildWithMargins(final View child, final int parentWidthMeasureSpec, final int widthUsed, final int parentHeightMeasureSpec, final int heightUsed) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void computeScroll() {
        throw new RuntimeException("Stub!");
    }
    
    public void scrollToDescendant(@NonNull final View child) {
        throw new RuntimeException("Stub!");
    }
    
    protected int computeScrollDeltaToGetChildRectOnScreen(final Rect rect) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void requestChildFocus(final View child, final View focused) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean onRequestFocusInDescendants(final int direction, final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean requestChildRectangleOnScreen(final View child, final Rect rectangle, final boolean immediate) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void requestLayout() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onSizeChanged(final int w, final int h, final int oldw, final int oldh) {
        throw new RuntimeException("Stub!");
    }
    
    public void fling(final int velocityY) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void scrollTo(final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onStartNestedScroll(final View child, final View target, final int nestedScrollAxes) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onNestedScrollAccepted(final View child, final View target, final int axes) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onStopNestedScroll(final View target) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onNestedScroll(final View target, final int dxConsumed, final int dyConsumed, final int dxUnconsumed, final int dyUnconsumed) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onNestedFling(final View target, final float velocityX, final float velocityY, final boolean consumed) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onRestoreInstanceState(final Parcelable state) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected Parcelable onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
}
