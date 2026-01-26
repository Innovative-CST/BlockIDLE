package android.widget;

import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

@RemoteViews.RemoteView
public class FrameLayout extends ViewGroup
{
    public FrameLayout(@NonNull final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public FrameLayout(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public FrameLayout(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public FrameLayout(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setForegroundGravity(final int foregroundGravity) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected LayoutParams generateDefaultLayoutParams() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMeasureAllChildren(final boolean measureAll) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getConsiderGoneChildrenWhenMeasuring() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getMeasureAllChildren() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public LayoutParams generateLayoutParams(final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean shouldDelayChildPressedState() {
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
        public static final int UNSPECIFIED_GRAVITY = -1;
        public int gravity;
        
        public LayoutParams(@NonNull final Context c, @Nullable final AttributeSet attrs) {
            super(null);
            this.gravity = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int width, final int height) {
            super(null);
            this.gravity = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int width, final int height, final int gravity) {
            super(null);
            this.gravity = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(@NonNull final ViewGroup.LayoutParams source) {
            super(null);
            this.gravity = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(@NonNull final MarginLayoutParams source) {
            super(null);
            this.gravity = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(@NonNull final LayoutParams source) {
            super(null);
            this.gravity = -1;
            throw new RuntimeException("Stub!");
        }
    }
}
