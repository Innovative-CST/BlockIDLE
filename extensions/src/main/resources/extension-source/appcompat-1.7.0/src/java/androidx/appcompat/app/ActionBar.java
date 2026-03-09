package androidx.appcompat.app;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import androidx.fragment.app.FragmentTransaction;
import android.content.res.TypedArray;
import androidx.appcompat.R;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.view.ViewGroup;
import android.view.KeyEvent;
import androidx.appcompat.view.ActionMode;
import android.content.res.Configuration;
import androidx.annotation.RestrictTo;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import android.widget.SpinnerAdapter;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import android.view.View;

public abstract class ActionBar
{
    @Deprecated
    public static final int NAVIGATION_MODE_STANDARD = 0;
    @Deprecated
    public static final int NAVIGATION_MODE_LIST = 1;
    @Deprecated
    public static final int NAVIGATION_MODE_TABS = 2;
    public static final int DISPLAY_USE_LOGO = 1;
    public static final int DISPLAY_SHOW_HOME = 2;
    public static final int DISPLAY_HOME_AS_UP = 4;
    public static final int DISPLAY_SHOW_TITLE = 8;
    public static final int DISPLAY_SHOW_CUSTOM = 16;
    
    public abstract void setCustomView(final View p0);
    
    public abstract void setCustomView(final View p0, final LayoutParams p1);
    
    public abstract void setCustomView(final int p0);
    
    public abstract void setIcon(@DrawableRes final int p0);
    
    public abstract void setIcon(final Drawable p0);
    
    public abstract void setLogo(@DrawableRes final int p0);
    
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
    
    public abstract void setTitle(@StringRes final int p0);
    
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
    }
    
    public void setSplitBackgroundDrawable(final Drawable d) {
    }
    
    public abstract View getCustomView();
    
    @Nullable
    public abstract CharSequence getTitle();
    
    @Nullable
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
    @Nullable
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
    }
    
    public Context getThemedContext() {
        return null;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public boolean isTitleTruncated() {
        return false;
    }
    
    public void setHomeAsUpIndicator(@Nullable final Drawable indicator) {
    }
    
    public void setHomeAsUpIndicator(@DrawableRes final int resId) {
    }
    
    public void setHomeActionContentDescription(@Nullable final CharSequence description) {
    }
    
    public void setHomeActionContentDescription(@StringRes final int resId) {
    }
    
    public void setHideOnContentScrollEnabled(final boolean hideOnContentScroll) {
        if (hideOnContentScroll) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }
    
    public boolean isHideOnContentScrollEnabled() {
        return false;
    }
    
    public int getHideOffset() {
        return 0;
    }
    
    public void setHideOffset(final int offset) {
        if (offset != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }
    
    public void setElevation(final float elevation) {
        if (elevation != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }
    
    public float getElevation() {
        return 0.0f;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setDefaultDisplayHomeAsUpEnabled(final boolean enabled) {
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setShowHideAnimationEnabled(final boolean enabled) {
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void onConfigurationChanged(final Configuration config) {
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void dispatchMenuVisibilityChanged(final boolean visible) {
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public ActionMode startActionMode(final ActionMode.Callback callback) {
        return null;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public boolean openOptionsMenu() {
        return false;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public boolean closeOptionsMenu() {
        return false;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public boolean invalidateOptionsMenu() {
        return false;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public boolean onMenuKeyEvent(final KeyEvent event) {
        return false;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public boolean onKeyShortcut(final int keyCode, final KeyEvent ev) {
        return false;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public boolean collapseActionView() {
        return false;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setWindowTitle(final CharSequence title) {
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    boolean requestFocus() {
        return false;
    }
    
    void onDestroy() {
    }
    
    @Deprecated
    public abstract static class Tab
    {
        public static final int INVALID_POSITION = -1;
        
        public abstract int getPosition();
        
        public abstract Drawable getIcon();
        
        public abstract CharSequence getText();
        
        public abstract Tab setIcon(final Drawable p0);
        
        public abstract Tab setIcon(@DrawableRes final int p0);
        
        public abstract Tab setText(final CharSequence p0);
        
        public abstract Tab setText(final int p0);
        
        public abstract Tab setCustomView(final View p0);
        
        public abstract Tab setCustomView(final int p0);
        
        public abstract View getCustomView();
        
        public abstract Tab setTag(final Object p0);
        
        public abstract Object getTag();
        
        public abstract Tab setTabListener(final TabListener p0);
        
        public abstract void select();
        
        public abstract Tab setContentDescription(@StringRes final int p0);
        
        public abstract Tab setContentDescription(final CharSequence p0);
        
        public abstract CharSequence getContentDescription();
    }
    
    public static class LayoutParams extends ViewGroup.MarginLayoutParams
    {
        public int gravity;
        
        public LayoutParams(@NonNull final Context c, final AttributeSet attrs) {
            super(c, attrs);
            this.gravity = 0;
            final TypedArray a = c.obtainStyledAttributes(attrs, R.styleable.ActionBarLayout);
            this.gravity = a.getInt(R.styleable.ActionBarLayout_android_layout_gravity, 0);
            a.recycle();
        }
        
        public LayoutParams(final int width, final int height) {
            super(width, height);
            this.gravity = 0;
            this.gravity = 8388627;
        }
        
        public LayoutParams(final int width, final int height, final int gravity) {
            super(width, height);
            this.gravity = 0;
            this.gravity = gravity;
        }
        
        public LayoutParams(final int gravity) {
            this(-2, -1, gravity);
        }
        
        public LayoutParams(final LayoutParams source) {
            super((ViewGroup.MarginLayoutParams)source);
            this.gravity = 0;
            this.gravity = source.gravity;
        }
        
        public LayoutParams(final ViewGroup.LayoutParams source) {
            super(source);
            this.gravity = 0;
        }
    }
    
    @Deprecated
    public interface TabListener
    {
        void onTabSelected(final Tab p0, final FragmentTransaction p1);
        
        void onTabUnselected(final Tab p0, final FragmentTransaction p1);
        
        void onTabReselected(final Tab p0, final FragmentTransaction p1);
    }
    
    public interface OnMenuVisibilityListener
    {
        void onMenuVisibilityChanged(final boolean p0);
    }
    
    @Deprecated
    public interface OnNavigationListener
    {
        boolean onNavigationItemSelected(final int p0, final long p1);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public @interface DisplayOptions {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public @interface NavigationMode {
    }
}
