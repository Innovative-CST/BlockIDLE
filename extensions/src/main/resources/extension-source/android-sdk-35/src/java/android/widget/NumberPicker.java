package android.widget;

import android.view.accessibility.AccessibilityNodeProvider;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;

public class NumberPicker extends LinearLayout
{
    public NumberPicker(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public NumberPicker(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public NumberPicker(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public NumberPicker(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onInterceptTouchEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchTouchEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchKeyEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchTrackballEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean dispatchHoverEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void computeScroll() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void scrollBy(final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int computeVerticalScrollOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int computeVerticalScrollRange() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int computeVerticalScrollExtent() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSolidColor() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnValueChangedListener(final OnValueChangeListener onValueChangedListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnScrollListener(final OnScrollListener onScrollListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFormatter(final Formatter formatter) {
        throw new RuntimeException("Stub!");
    }
    
    public void setValue(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean performClick() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean performLongClick() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getWrapSelectorWheel() {
        throw new RuntimeException("Stub!");
    }
    
    public void setWrapSelectorWheel(final boolean wrapSelectorWheel) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnLongPressUpdateInterval(final long intervalMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public int getValue() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinValue() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinValue(final int minValue) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxValue() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxValue(final int maxValue) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getDisplayedValues() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDisplayedValues(final String[] displayedValues) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSelectionDividerHeight(final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSelectionDividerHeight() {
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
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void drawableStateChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void jumpDrawablesToCurrentState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextColor() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextSize(final float size) {
        throw new RuntimeException("Stub!");
    }
    
    public float getTextSize() {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnValueChangeListener
    {
        void onValueChange(final NumberPicker p0, final int p1, final int p2);
    }
    
    public interface OnScrollListener
    {
        public static final int SCROLL_STATE_FLING = 2;
        public static final int SCROLL_STATE_IDLE = 0;
        public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
        
        void onScrollStateChange(final NumberPicker p0, final int p1);
    }
    
    public interface Formatter
    {
        String format(final int p0);
    }
}
