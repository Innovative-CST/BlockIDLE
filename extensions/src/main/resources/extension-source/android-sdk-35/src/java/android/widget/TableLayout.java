package android.widget;

import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;

public class TableLayout extends LinearLayout
{
    public TableLayout(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TableLayout(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setOnHierarchyChangeListener(final OnHierarchyChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void requestLayout() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isShrinkAllColumns() {
        throw new RuntimeException("Stub!");
    }
    
    public void setShrinkAllColumns(final boolean shrinkAllColumns) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStretchAllColumns() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStretchAllColumns(final boolean stretchAllColumns) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColumnCollapsed(final int columnIndex, final boolean isCollapsed) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isColumnCollapsed(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColumnStretchable(final int columnIndex, final boolean isStretchable) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isColumnStretchable(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColumnShrinkable(final int columnIndex, final boolean isShrinkable) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isColumnShrinkable(final int columnIndex) {
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
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public LayoutParams generateLayoutParams(final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected LinearLayout.LayoutParams generateDefaultLayoutParams() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean checkLayoutParams(final ViewGroup.LayoutParams p) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected LinearLayout.LayoutParams generateLayoutParams(final ViewGroup.LayoutParams p) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public static class LayoutParams extends LinearLayout.LayoutParams
    {
        public LayoutParams(final Context c, final AttributeSet attrs) {
            super((ViewGroup.LayoutParams)null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int w, final int h) {
            super((ViewGroup.LayoutParams)null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int w, final int h, final float initWeight) {
            super((ViewGroup.LayoutParams)null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams() {
            super((ViewGroup.LayoutParams)null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final ViewGroup.LayoutParams p) {
            super((ViewGroup.LayoutParams)null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final MarginLayoutParams source) {
            super((ViewGroup.LayoutParams)null);
            throw new RuntimeException("Stub!");
        }
        
        @Override
        protected void setBaseAttributes(final TypedArray a, final int widthAttr, final int heightAttr) {
            throw new RuntimeException("Stub!");
        }
    }
}
