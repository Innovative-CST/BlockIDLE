package android.widget;

import android.view.ViewDebug;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

@RemoteViews.RemoteView
public class RelativeLayout extends ViewGroup
{
    public static final int ABOVE = 2;
    public static final int ALIGN_BASELINE = 4;
    public static final int ALIGN_BOTTOM = 8;
    public static final int ALIGN_END = 19;
    public static final int ALIGN_LEFT = 5;
    public static final int ALIGN_PARENT_BOTTOM = 12;
    public static final int ALIGN_PARENT_END = 21;
    public static final int ALIGN_PARENT_LEFT = 9;
    public static final int ALIGN_PARENT_RIGHT = 11;
    public static final int ALIGN_PARENT_START = 20;
    public static final int ALIGN_PARENT_TOP = 10;
    public static final int ALIGN_RIGHT = 7;
    public static final int ALIGN_START = 18;
    public static final int ALIGN_TOP = 6;
    public static final int BELOW = 3;
    public static final int CENTER_HORIZONTAL = 14;
    public static final int CENTER_IN_PARENT = 13;
    public static final int CENTER_VERTICAL = 15;
    public static final int END_OF = 17;
    public static final int LEFT_OF = 0;
    public static final int RIGHT_OF = 1;
    public static final int START_OF = 16;
    public static final int TRUE = -1;
    
    public RelativeLayout(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public RelativeLayout(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public RelativeLayout(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public RelativeLayout(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean shouldDelayChildPressedState() {
        throw new RuntimeException("Stub!");
    }
    
    public void setIgnoreGravity(final int viewId) {
        throw new RuntimeException("Stub!");
    }
    
    public int getIgnoreGravity() {
        throw new RuntimeException("Stub!");
    }
    
    public int getGravity() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGravity(final int gravity) {
        throw new RuntimeException("Stub!");
    }
    
    public void setHorizontalGravity(final int horizontalGravity) {
        throw new RuntimeException("Stub!");
    }
    
    public void setVerticalGravity(final int verticalGravity) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getBaseline() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void requestLayout() {
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
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean checkLayoutParams(final ViewGroup.LayoutParams p) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected ViewGroup.LayoutParams generateLayoutParams(final ViewGroup.LayoutParams lp) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public static class LayoutParams extends MarginLayoutParams
    {
        @ViewDebug.ExportedProperty(category = "layout")
        public boolean alignWithParent;
        
        public LayoutParams(final Context c, final AttributeSet attrs) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int w, final int h) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final ViewGroup.LayoutParams source) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final MarginLayoutParams source) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final LayoutParams source) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public String debug(final String output) {
            throw new RuntimeException("Stub!");
        }
        
        public void addRule(final int verb) {
            throw new RuntimeException("Stub!");
        }
        
        public void addRule(final int verb, final int subject) {
            throw new RuntimeException("Stub!");
        }
        
        public void removeRule(final int verb) {
            throw new RuntimeException("Stub!");
        }
        
        public int getRule(final int verb) {
            throw new RuntimeException("Stub!");
        }
        
        public int[] getRules() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void resolveLayoutDirection(final int layoutDirection) {
            throw new RuntimeException("Stub!");
        }
    }
}
