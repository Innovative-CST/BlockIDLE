package android.widget;

import android.view.MenuItem;
import android.view.Menu;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.content.Context;

public class ActionMenuView extends LinearLayout
{
    public ActionMenuView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ActionMenuView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setPopupTheme(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPopupTheme() {
        throw new RuntimeException("Stub!");
    }
    
    public void onConfigurationChanged(final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnMenuItemClickListener(final OnMenuItemClickListener listener) {
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
    
    public void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOverflowIcon(@Nullable final Drawable icon) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getOverflowIcon() {
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
    protected LayoutParams generateLayoutParams(final ViewGroup.LayoutParams p) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean checkLayoutParams(final ViewGroup.LayoutParams p) {
        throw new RuntimeException("Stub!");
    }
    
    public Menu getMenu() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean showOverflowMenu() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hideOverflowMenu() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOverflowMenuShowing() {
        throw new RuntimeException("Stub!");
    }
    
    public void dismissPopupMenus() {
        throw new RuntimeException("Stub!");
    }
    
    public static class LayoutParams extends LinearLayout.LayoutParams
    {
        public LayoutParams(final Context c, final AttributeSet attrs) {
            super((ViewGroup.LayoutParams)null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final ViewGroup.LayoutParams other) {
            super((ViewGroup.LayoutParams)null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final LayoutParams other) {
            super((ViewGroup.LayoutParams)null);
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int width, final int height) {
            super((ViewGroup.LayoutParams)null);
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnMenuItemClickListener
    {
        boolean onMenuItemClick(final MenuItem p0);
    }
}
