package android.widget;

import android.content.res.TypedArray;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillValue;
import android.view.View;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;

@RemoteViews.RemoteView
public class RadioGroup extends LinearLayout
{
    public RadioGroup(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public RadioGroup(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setOnHierarchyChangeListener(final OnHierarchyChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onFinishInflate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addView(final View child, final int index, final ViewGroup.LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    public void check(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCheckedRadioButtonId() {
        throw new RuntimeException("Stub!");
    }
    
    public void clearCheck() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnCheckedChangeListener(final OnCheckedChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public LayoutParams generateLayoutParams(final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean checkLayoutParams(final ViewGroup.LayoutParams p) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected LinearLayout.LayoutParams generateDefaultLayoutParams() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void autofill(final AutofillValue value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getAutofillType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public AutofillValue getAutofillValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo info) {
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
    
    public interface OnCheckedChangeListener
    {
        void onCheckedChanged(final RadioGroup p0, final int p1);
    }
}
