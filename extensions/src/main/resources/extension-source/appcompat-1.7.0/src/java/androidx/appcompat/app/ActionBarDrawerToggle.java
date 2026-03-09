package androidx.appcompat.app;

import androidx.annotation.Nullable;
import android.app.ActionBar;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import android.view.MenuItem;
import android.content.res.Configuration;
import androidx.appcompat.widget.Toolbar;
import androidx.annotation.StringRes;
import android.app.Activity;
import android.view.View;
import android.graphics.drawable.Drawable;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.drawerlayout.widget.DrawerLayout;

public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener
{
    private final Delegate mActivityImpl;
    private final DrawerLayout mDrawerLayout;
    private DrawerArrowDrawable mSlider;
    private boolean mDrawerSlideAnimationEnabled;
    private Drawable mHomeAsUpIndicator;
    boolean mDrawerIndicatorEnabled;
    private boolean mHasCustomUpIndicator;
    private final int mOpenDrawerContentDescRes;
    private final int mCloseDrawerContentDescRes;
    View.OnClickListener mToolbarNavigationClickListener;
    private boolean mWarnedForDisplayHomeAsUp;
    
    public ActionBarDrawerToggle(final Activity activity, final DrawerLayout drawerLayout, @StringRes final int openDrawerContentDescRes, @StringRes final int closeDrawerContentDescRes) {
        this(activity, null, drawerLayout, null, openDrawerContentDescRes, closeDrawerContentDescRes);
    }
    
    public ActionBarDrawerToggle(final Activity activity, final DrawerLayout drawerLayout, final Toolbar toolbar, @StringRes final int openDrawerContentDescRes, @StringRes final int closeDrawerContentDescRes) {
        this(activity, toolbar, drawerLayout, null, openDrawerContentDescRes, closeDrawerContentDescRes);
    }
    
    ActionBarDrawerToggle(final Activity activity, final Toolbar toolbar, final DrawerLayout drawerLayout, final DrawerArrowDrawable slider, @StringRes final int openDrawerContentDescRes, @StringRes final int closeDrawerContentDescRes) {
        this.mDrawerSlideAnimationEnabled = true;
        this.mDrawerIndicatorEnabled = true;
        this.mWarnedForDisplayHomeAsUp = false;
        if (toolbar != null) {
            this.mActivityImpl = new ToolbarCompatDelegate(toolbar);
            toolbar.setNavigationOnClickListener((View.OnClickListener)new View.OnClickListener() {
                public void onClick(final View v) {
                    if (ActionBarDrawerToggle.this.mDrawerIndicatorEnabled) {
                        ActionBarDrawerToggle.this.toggle();
                    }
                    else if (ActionBarDrawerToggle.this.mToolbarNavigationClickListener != null) {
                        ActionBarDrawerToggle.this.mToolbarNavigationClickListener.onClick(v);
                    }
                }
            });
        }
        else if (activity instanceof DelegateProvider) {
            this.mActivityImpl = ((DelegateProvider)activity).getDrawerToggleDelegate();
        }
        else {
            this.mActivityImpl = new FrameworkActionBarDelegate(activity);
        }
        this.mDrawerLayout = drawerLayout;
        this.mOpenDrawerContentDescRes = openDrawerContentDescRes;
        this.mCloseDrawerContentDescRes = closeDrawerContentDescRes;
        if (slider == null) {
            this.mSlider = new DrawerArrowDrawable(this.mActivityImpl.getActionBarThemedContext());
        }
        else {
            this.mSlider = slider;
        }
        this.mHomeAsUpIndicator = this.getThemeUpIndicator();
    }
    
    public void syncState() {
        if (this.mDrawerLayout.isDrawerOpen(8388611)) {
            this.setPosition(1.0f);
        }
        else {
            this.setPosition(0.0f);
        }
        if (this.mDrawerIndicatorEnabled) {
            this.setActionBarUpIndicator(this.mSlider, this.mDrawerLayout.isDrawerOpen(8388611) ? this.mCloseDrawerContentDescRes : this.mOpenDrawerContentDescRes);
        }
    }
    
    public void onConfigurationChanged(final Configuration newConfig) {
        if (!this.mHasCustomUpIndicator) {
            this.mHomeAsUpIndicator = this.getThemeUpIndicator();
        }
        this.syncState();
    }
    
    public boolean onOptionsItemSelected(final MenuItem item) {
        if (item != null && item.getItemId() == 16908332 && this.mDrawerIndicatorEnabled) {
            this.toggle();
            return true;
        }
        return false;
    }
    
    void toggle() {
        final int drawerLockMode = this.mDrawerLayout.getDrawerLockMode(8388611);
        if (this.mDrawerLayout.isDrawerVisible(8388611) && drawerLockMode != 2) {
            this.mDrawerLayout.closeDrawer(8388611);
        }
        else if (drawerLockMode != 1) {
            this.mDrawerLayout.openDrawer(8388611);
        }
    }
    
    public void setHomeAsUpIndicator(final Drawable indicator) {
        if (indicator == null) {
            this.mHomeAsUpIndicator = this.getThemeUpIndicator();
            this.mHasCustomUpIndicator = false;
        }
        else {
            this.mHomeAsUpIndicator = indicator;
            this.mHasCustomUpIndicator = true;
        }
        if (!this.mDrawerIndicatorEnabled) {
            this.setActionBarUpIndicator(this.mHomeAsUpIndicator, 0);
        }
    }
    
    public void setHomeAsUpIndicator(final int resId) {
        Drawable indicator = null;
        if (resId != 0) {
            indicator = this.mDrawerLayout.getResources().getDrawable(resId);
        }
        this.setHomeAsUpIndicator(indicator);
    }
    
    public boolean isDrawerIndicatorEnabled() {
        return this.mDrawerIndicatorEnabled;
    }
    
    public void setDrawerIndicatorEnabled(final boolean enable) {
        if (enable != this.mDrawerIndicatorEnabled) {
            if (enable) {
                this.setActionBarUpIndicator(this.mSlider, this.mDrawerLayout.isDrawerOpen(8388611) ? this.mCloseDrawerContentDescRes : this.mOpenDrawerContentDescRes);
            }
            else {
                this.setActionBarUpIndicator(this.mHomeAsUpIndicator, 0);
            }
            this.mDrawerIndicatorEnabled = enable;
        }
    }
    
    @NonNull
    public DrawerArrowDrawable getDrawerArrowDrawable() {
        return this.mSlider;
    }
    
    public void setDrawerArrowDrawable(@NonNull final DrawerArrowDrawable drawable) {
        this.mSlider = drawable;
        this.syncState();
    }
    
    public void setDrawerSlideAnimationEnabled(final boolean enabled) {
        if (!(this.mDrawerSlideAnimationEnabled = enabled)) {
            this.setPosition(0.0f);
        }
    }
    
    public boolean isDrawerSlideAnimationEnabled() {
        return this.mDrawerSlideAnimationEnabled;
    }
    
    public void onDrawerSlide(final View drawerView, final float slideOffset) {
        if (this.mDrawerSlideAnimationEnabled) {
            this.setPosition(Math.min(1.0f, Math.max(0.0f, slideOffset)));
        }
        else {
            this.setPosition(0.0f);
        }
    }
    
    public void onDrawerOpened(final View drawerView) {
        this.setPosition(1.0f);
        if (this.mDrawerIndicatorEnabled) {
            this.setActionBarDescription(this.mCloseDrawerContentDescRes);
        }
    }
    
    public void onDrawerClosed(final View drawerView) {
        this.setPosition(0.0f);
        if (this.mDrawerIndicatorEnabled) {
            this.setActionBarDescription(this.mOpenDrawerContentDescRes);
        }
    }
    
    public void onDrawerStateChanged(final int newState) {
    }
    
    public View.OnClickListener getToolbarNavigationClickListener() {
        return this.mToolbarNavigationClickListener;
    }
    
    public void setToolbarNavigationClickListener(final View.OnClickListener onToolbarNavigationClickListener) {
        this.mToolbarNavigationClickListener = onToolbarNavigationClickListener;
    }
    
    void setActionBarUpIndicator(final Drawable upDrawable, final int contentDescRes) {
        if (!this.mWarnedForDisplayHomeAsUp && !this.mActivityImpl.isNavigationVisible()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.mWarnedForDisplayHomeAsUp = true;
        }
        this.mActivityImpl.setActionBarUpIndicator(upDrawable, contentDescRes);
    }
    
    void setActionBarDescription(final int contentDescRes) {
        this.mActivityImpl.setActionBarDescription(contentDescRes);
    }
    
    Drawable getThemeUpIndicator() {
        return this.mActivityImpl.getThemeUpIndicator();
    }
    
    private void setPosition(final float position) {
        if (position == 1.0f) {
            this.mSlider.setVerticalMirror(true);
        }
        else if (position == 0.0f) {
            this.mSlider.setVerticalMirror(false);
        }
        this.mSlider.setProgress(position);
    }
    
    private static class FrameworkActionBarDelegate implements Delegate
    {
        private final Activity mActivity;
        
        FrameworkActionBarDelegate(final Activity activity) {
            this.mActivity = activity;
        }
        
        @Override
        public Drawable getThemeUpIndicator() {
            final TypedArray a = this.getActionBarThemedContext().obtainStyledAttributes((AttributeSet)null, new int[] { 16843531 }, 16843470, 0);
            final Drawable result = a.getDrawable(0);
            a.recycle();
            return result;
        }
        
        @Override
        public Context getActionBarThemedContext() {
            final ActionBar actionBar = this.mActivity.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return (Context)this.mActivity;
        }
        
        @Override
        public boolean isNavigationVisible() {
            final ActionBar actionBar = this.mActivity.getActionBar();
            return actionBar != null && (actionBar.getDisplayOptions() & 0x4) != 0x0;
        }
        
        @Override
        public void setActionBarUpIndicator(final Drawable themeImage, final int contentDescRes) {
            final ActionBar actionBar = this.mActivity.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(themeImage);
                actionBar.setHomeActionContentDescription(contentDescRes);
            }
        }
        
        @Override
        public void setActionBarDescription(final int contentDescRes) {
            final ActionBar actionBar = this.mActivity.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(contentDescRes);
            }
        }
    }
    
    static class ToolbarCompatDelegate implements Delegate
    {
        final Toolbar mToolbar;
        final Drawable mDefaultUpIndicator;
        final CharSequence mDefaultContentDescription;
        
        ToolbarCompatDelegate(final Toolbar toolbar) {
            this.mToolbar = toolbar;
            this.mDefaultUpIndicator = toolbar.getNavigationIcon();
            this.mDefaultContentDescription = toolbar.getNavigationContentDescription();
        }
        
        @Override
        public void setActionBarUpIndicator(final Drawable upDrawable, @StringRes final int contentDescRes) {
            this.mToolbar.setNavigationIcon(upDrawable);
            this.setActionBarDescription(contentDescRes);
        }
        
        @Override
        public void setActionBarDescription(@StringRes final int contentDescRes) {
            if (contentDescRes == 0) {
                this.mToolbar.setNavigationContentDescription(this.mDefaultContentDescription);
            }
            else {
                this.mToolbar.setNavigationContentDescription(contentDescRes);
            }
        }
        
        @Override
        public Drawable getThemeUpIndicator() {
            return this.mDefaultUpIndicator;
        }
        
        @Override
        public Context getActionBarThemedContext() {
            return this.mToolbar.getContext();
        }
        
        @Override
        public boolean isNavigationVisible() {
            return true;
        }
    }
    
    public interface Delegate
    {
        void setActionBarUpIndicator(final Drawable p0, @StringRes final int p1);
        
        void setActionBarDescription(@StringRes final int p0);
        
        Drawable getThemeUpIndicator();
        
        Context getActionBarThemedContext();
        
        boolean isNavigationVisible();
    }
    
    public interface DelegateProvider
    {
        @Nullable
        Delegate getDrawerToggleDelegate();
    }
}
