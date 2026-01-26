package android.widget;

import android.content.res.TypedArray;
import android.view.ViewDebug;
import android.view.View;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;

public class TableRow extends LinearLayout
{
    public TableRow(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TableRow(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setOnHierarchyChangeListener(final OnHierarchyChangeListener listener) {
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
    
    public View getVirtualChildAt(final int i) {
        throw new RuntimeException("Stub!");
    }
    
    public int getVirtualChildCount() {
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
        @ViewDebug.ExportedProperty(category = "layout")
        public int column;
        @ViewDebug.ExportedProperty(category = "layout")
        public int span;
        
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
        
        public LayoutParams(final int column) {
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
