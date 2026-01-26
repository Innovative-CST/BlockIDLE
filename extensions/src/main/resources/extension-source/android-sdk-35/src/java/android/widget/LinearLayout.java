package android.widget;

import android.view.ViewDebug;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

@RemoteViews.RemoteView
public class LinearLayout extends ViewGroup
{
    public static final int HORIZONTAL = 0;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    
    public LinearLayout(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public LinearLayout(final Context context, @Nullable final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public LinearLayout(final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public LinearLayout(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setShowDividers(final int showDividers) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean shouldDelayChildPressedState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getShowDividers() {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getDividerDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDividerDrawable(final Drawable divider) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDividerPadding(final int padding) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDividerPadding() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isBaselineAligned() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBaselineAligned(final boolean baselineAligned) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMeasureWithLargestChildEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMeasureWithLargestChildEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getBaseline() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBaselineAlignedChildIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBaselineAlignedChildIndex(final int i) {
        throw new RuntimeException("Stub!");
    }
    
    public float getWeightSum() {
        throw new RuntimeException("Stub!");
    }
    
    public void setWeightSum(final float weightSum) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onRtlPropertiesChanged(final int layoutDirection) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOrientation(final int orientation) {
        throw new RuntimeException("Stub!");
    }
    
    public int getOrientation() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGravity(final int gravity) {
        throw new RuntimeException("Stub!");
    }
    
    public int getGravity() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHorizontalGravity(final int horizontalGravity) {
        throw new RuntimeException("Stub!");
    }
    
    public void setVerticalGravity(final int verticalGravity) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public LayoutParams generateLayoutParams(final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected LayoutParams generateDefaultLayoutParams() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected LayoutParams generateLayoutParams(final ViewGroup.LayoutParams lp) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean checkLayoutParams(final ViewGroup.LayoutParams p) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public static class LayoutParams extends MarginLayoutParams
    {
        @ViewDebug.ExportedProperty(category = "layout", mapping = { @ViewDebug.IntToString(from = -1, to = "NONE"), @ViewDebug.IntToString(from = 0, to = "NONE"), @ViewDebug.IntToString(from = 48, to = "TOP"), @ViewDebug.IntToString(from = 80, to = "BOTTOM"), @ViewDebug.IntToString(from = 3, to = "LEFT"), @ViewDebug.IntToString(from = 5, to = "RIGHT"), @ViewDebug.IntToString(from = 8388611, to = "START"), @ViewDebug.IntToString(from = 8388613, to = "END"), @ViewDebug.IntToString(from = 16, to = "CENTER_VERTICAL"), @ViewDebug.IntToString(from = 112, to = "FILL_VERTICAL"), @ViewDebug.IntToString(from = 1, to = "CENTER_HORIZONTAL"), @ViewDebug.IntToString(from = 7, to = "FILL_HORIZONTAL"), @ViewDebug.IntToString(from = 17, to = "CENTER"), @ViewDebug.IntToString(from = 119, to = "FILL") })
        public int gravity;
        @ViewDebug.ExportedProperty(category = "layout")
        public float weight;
        
        public LayoutParams(final Context c, final AttributeSet attrs) {
            super(null);
            this.gravity = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int width, final int height) {
            super(null);
            this.gravity = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int width, final int height, final float weight) {
            super(null);
            this.gravity = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final ViewGroup.LayoutParams p) {
            super(null);
            this.gravity = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final MarginLayoutParams source) {
            super(null);
            this.gravity = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final LayoutParams source) {
            super(null);
            this.gravity = -1;
            throw new RuntimeException("Stub!");
        }
        
        public String debug(final String output) {
            throw new RuntimeException("Stub!");
        }
    }
}
