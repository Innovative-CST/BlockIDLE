package android.app;

import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.SpinnerAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;

public abstract class ActionBar
{
    public static final int DISPLAY_HOME_AS_UP = 4;
    public static final int DISPLAY_SHOW_CUSTOM = 16;
    public static final int DISPLAY_SHOW_HOME = 2;
    public static final int DISPLAY_SHOW_TITLE = 8;
    public static final int DISPLAY_USE_LOGO = 1;
    @Deprecated
    public static final int NAVIGATION_MODE_LIST = 1;
    @Deprecated
    public static final int NAVIGATION_MODE_STANDARD = 0;
    @Deprecated
    public static final int NAVIGATION_MODE_TABS = 2;
    
    public ActionBar() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setCustomView(final View p0);
    
    public abstract void setCustomView(final View p0, final LayoutParams p1);
    
    public abstract void setCustomView(final int p0);
    
    public abstract void setIcon(final int p0);
    
    public abstract void setIcon(final Drawable p0);
    
    public abstract void setLogo(final int p0);
    
    public abstract void setLogo(final Drawable p0);
    
    @Deprecated
    public abstract void setListNavigationCallbacks(final SpinnerAdapter p0, final OnNavigationListener p1);
    
    @Deprecated
    public abstract void setSelectedNavigationItem(final int p0);
    
    @Deprecated
    public abstract int getSelectedNavigationIndex();
    
    @Deprecated
    public abstract int getNavigationItemCount();
    
    public abstract void setTitle(final CharSequence p0);
    
    public abstract void setTitle(final int p0);
    
    public abstract void setSubtitle(final CharSequence p0);
    
    public abstract void setSubtitle(final int p0);
    
    public abstract void setDisplayOptions(final int p0);
    
    public abstract void setDisplayOptions(final int p0, final int p1);
    
    public abstract void setDisplayUseLogoEnabled(final boolean p0);
    
    public abstract void setDisplayShowHomeEnabled(final boolean p0);
    
    public abstract void setDisplayHomeAsUpEnabled(final boolean p0);
    
    public abstract void setDisplayShowTitleEnabled(final boolean p0);
    
    public abstract void setDisplayShowCustomEnabled(final boolean p0);
    
    public abstract void setBackgroundDrawable(@Nullable final Drawable p0);
    
    public void setStackedBackgroundDrawable(final Drawable d) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSplitBackgroundDrawable(final Drawable d) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract View getCustomView();
    
    public abstract CharSequence getTitle();
    
    public abstract CharSequence getSubtitle();
    
    @Deprecated
    public abstract int getNavigationMode();
    
    @Deprecated
    public abstract void setNavigationMode(final int p0);
    
    public abstract int getDisplayOptions();
    
    @Deprecated
    public abstract Tab newTab();
    
    @Deprecated
    public abstract void addTab(final Tab p0);
    
    @Deprecated
    public abstract void addTab(final Tab p0, final boolean p1);
    
    @Deprecated
    public abstract void addTab(final Tab p0, final int p1);
    
    @Deprecated
    public abstract void addTab(final Tab p0, final int p1, final boolean p2);
    
    @Deprecated
    public abstract void removeTab(final Tab p0);
    
    @Deprecated
    public abstract void removeTabAt(final int p0);
    
    @Deprecated
    public abstract void removeAllTabs();
    
    @Deprecated
    public abstract void selectTab(final Tab p0);
    
    @Deprecated
    public abstract Tab getSelectedTab();
    
    @Deprecated
    public abstract Tab getTabAt(final int p0);
    
    @Deprecated
    public abstract int getTabCount();
    
    public abstract int getHeight();
    
    public abstract void show();
    
    public abstract void hide();
    
    public abstract boolean isShowing();
    
    public abstract void addOnMenuVisibilityListener(final OnMenuVisibilityListener p0);
    
    public abstract void removeOnMenuVisibilityListener(final OnMenuVisibilityListener p0);
    
    public void setHomeButtonEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public Context getThemedContext() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHomeAsUpIndicator(final Drawable indicator) {
        throw new RuntimeException("Stub!");
    }
    
    public void setHomeAsUpIndicator(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setHomeActionContentDescription(final CharSequence description) {
        throw new RuntimeException("Stub!");
    }
    
    public void setHomeActionContentDescription(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setHideOnContentScrollEnabled(final boolean hideOnContentScroll) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isHideOnContentScrollEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHideOffset() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHideOffset(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public void setElevation(final float elevation) {
        throw new RuntimeException("Stub!");
    }
    
    public float getElevation() {
        throw new RuntimeException("Stub!");
    }
    
    public static class LayoutParams extends ViewGroup.MarginLayoutParams
    {
        @ViewDebug.ExportedProperty(category = "layout", mapping = { @ViewDebug.IntToString(from = -1, to = "NONE"), @ViewDebug.IntToString(from = 0, to = "NONE"), @ViewDebug.IntToString(from = 48, to = "TOP"), @ViewDebug.IntToString(from = 80, to = "BOTTOM"), @ViewDebug.IntToString(from = 3, to = "LEFT"), @ViewDebug.IntToString(from = 5, to = "RIGHT"), @ViewDebug.IntToString(from = 8388611, to = "START"), @ViewDebug.IntToString(from = 8388613, to = "END"), @ViewDebug.IntToString(from = 16, to = "CENTER_VERTICAL"), @ViewDebug.IntToString(from = 112, to = "FILL_VERTICAL"), @ViewDebug.IntToString(from = 1, to = "CENTER_HORIZONTAL"), @ViewDebug.IntToString(from = 7, to = "FILL_HORIZONTAL"), @ViewDebug.IntToString(from = 17, to = "CENTER"), @ViewDebug.IntToString(from = 119, to = "FILL") })
        public int gravity;
        
        public LayoutParams(@NonNull final Context c, final AttributeSet attrs) {
            super(null);
            this.gravity = 0;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int width, final int height) {
            super(null);
            this.gravity = 0;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int width, final int height, final int gravity) {
            super(null);
            this.gravity = 0;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int gravity) {
            super(null);
            this.gravity = 0;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final LayoutParams source) {
            super(null);
            this.gravity = 0;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final ViewGroup.LayoutParams source) {
            super(null);
            this.gravity = 0;
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public abstract static class Tab
    {
        @Deprecated
        public static final int INVALID_POSITION = -1;
        
        @Deprecated
        public Tab() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public abstract int getPosition();
        
        @Deprecated
        public abstract Drawable getIcon();
        
        @Deprecated
        public abstract CharSequence getText();
        
        @Deprecated
        public abstract Tab setIcon(final Drawable p0);
        
        @Deprecated
        public abstract Tab setIcon(final int p0);
        
        @Deprecated
        public abstract Tab setText(final CharSequence p0);
        
        @Deprecated
        public abstract Tab setText(final int p0);
        
        @Deprecated
        public abstract Tab setCustomView(final View p0);
        
        @Deprecated
        public abstract Tab setCustomView(final int p0);
        
        @Deprecated
        public abstract View getCustomView();
        
        @Deprecated
        public abstract Tab setTag(final Object p0);
        
        @Deprecated
        public abstract Object getTag();
        
        @Deprecated
        public abstract Tab setTabListener(final TabListener p0);
        
        @Deprecated
        public abstract void select();
        
        @Deprecated
        public abstract Tab setContentDescription(final int p0);
        
        @Deprecated
        public abstract Tab setContentDescription(final CharSequence p0);
        
        @Deprecated
        public abstract CharSequence getContentDescription();
    }
    
    @Deprecated
    public interface TabListener
    {
        @Deprecated
        void onTabSelected(final Tab p0, final FragmentTransaction p1);
        
        @Deprecated
        void onTabUnselected(final Tab p0, final FragmentTransaction p1);
        
        @Deprecated
        void onTabReselected(final Tab p0, final FragmentTransaction p1);
    }
    
    @Deprecated
    public interface OnNavigationListener
    {
        @Deprecated
        boolean onNavigationItemSelected(final int p0, final long p1);
    }
    
    public interface OnMenuVisibilityListener
    {
        void onMenuVisibilityChanged(final boolean p0);
    }
}
