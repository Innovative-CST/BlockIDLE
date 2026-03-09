package android.widget;

import android.content.res.TypedArray;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

@RemoteViews.RemoteView
public class GridLayout extends ViewGroup
{
    public static final int ALIGN_BOUNDS = 0;
    public static final int ALIGN_MARGINS = 1;
    public static final Alignment BASELINE;
    public static final Alignment BOTTOM;
    public static final Alignment CENTER;
    public static final Alignment END;
    public static final Alignment FILL;
    public static final int HORIZONTAL = 0;
    public static final Alignment LEFT;
    public static final Alignment RIGHT;
    public static final Alignment START;
    public static final Alignment TOP;
    public static final int UNDEFINED = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;
    
    public GridLayout(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public GridLayout(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public GridLayout(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public GridLayout(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public int getOrientation() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOrientation(final int orientation) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRowCount() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRowCount(final int rowCount) {
        throw new RuntimeException("Stub!");
    }
    
    public int getColumnCount() {
        throw new RuntimeException("Stub!");
    }
    
    public void setColumnCount(final int columnCount) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getUseDefaultMargins() {
        throw new RuntimeException("Stub!");
    }
    
    public void setUseDefaultMargins(final boolean useDefaultMargins) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAlignmentMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAlignmentMode(final int alignmentMode) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRowOrderPreserved() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRowOrderPreserved(final boolean rowOrderPreserved) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isColumnOrderPreserved() {
        throw new RuntimeException("Stub!");
    }
    
    public void setColumnOrderPreserved(final boolean columnOrderPreserved) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean checkLayoutParams(final ViewGroup.LayoutParams p) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected LayoutParams generateDefaultLayoutParams() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public LayoutParams generateLayoutParams(final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected LayoutParams generateLayoutParams(final ViewGroup.LayoutParams lp) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onViewAdded(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onViewRemoved(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthSpec, final int heightSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void requestLayout() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public static Spec spec(final int start, final int size, final Alignment alignment, final float weight) {
        throw new RuntimeException("Stub!");
    }
    
    public static Spec spec(final int start, final Alignment alignment, final float weight) {
        throw new RuntimeException("Stub!");
    }
    
    public static Spec spec(final int start, final int size, final float weight) {
        throw new RuntimeException("Stub!");
    }
    
    public static Spec spec(final int start, final float weight) {
        throw new RuntimeException("Stub!");
    }
    
    public static Spec spec(final int start, final int size, final Alignment alignment) {
        throw new RuntimeException("Stub!");
    }
    
    public static Spec spec(final int start, final Alignment alignment) {
        throw new RuntimeException("Stub!");
    }
    
    public static Spec spec(final int start, final int size) {
        throw new RuntimeException("Stub!");
    }
    
    public static Spec spec(final int start) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        BASELINE = null;
        BOTTOM = null;
        CENTER = null;
        END = null;
        FILL = null;
        LEFT = null;
        RIGHT = null;
        START = null;
        TOP = null;
    }
    
    public abstract static class Alignment
    {
        Alignment() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class LayoutParams extends MarginLayoutParams
    {
        public Spec columnSpec;
        public Spec rowSpec;
        
        public LayoutParams(final Spec rowSpec, final Spec columnSpec) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final ViewGroup.LayoutParams params) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final MarginLayoutParams params) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final LayoutParams source) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final Context context, final AttributeSet attrs) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public void setGravity(final int gravity) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        protected void setBaseAttributes(final TypedArray attributes, final int widthAttr, final int heightAttr) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class Spec
    {
        Spec() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object that) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
    }
}
