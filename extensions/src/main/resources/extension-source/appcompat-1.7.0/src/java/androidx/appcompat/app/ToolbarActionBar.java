package androidx.appcompat.app;

import androidx.appcompat.view.menu.MenuPresenter;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.view.menu.MenuBuilder;
import android.annotation.SuppressLint;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import android.content.res.Configuration;
import android.content.Context;
import androidx.core.view.ViewCompat;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.core.util.Preconditions;
import android.view.MenuItem;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import android.view.Window;
import androidx.appcompat.widget.DecorToolbar;

class ToolbarActionBar extends ActionBar
{
    final DecorToolbar mDecorToolbar;
    final Window.Callback mWindowCallback;
    final AppCompatDelegateImpl.ActionBarMenuCallback mMenuCallback;
    boolean mToolbarMenuPrepared;
    private boolean mMenuCallbackSet;
    private boolean mLastMenuVisibility;
    private ArrayList<OnMenuVisibilityListener> mMenuVisibilityListeners;
    private final Runnable mMenuInvalidator;
    private final Toolbar.OnMenuItemClickListener mMenuClicker;
    
    ToolbarActionBar(@NonNull final Toolbar toolbar, @Nullable final CharSequence title, @NonNull final Window.Callback windowCallback) {
        this.mMenuVisibilityListeners = (ArrayList<OnMenuVisibilityListener>)new ArrayList();
        this.mMenuInvalidator = (Runnable)new Runnable() {
            public void run() {
                ToolbarActionBar.this.populateOptionsMenu();
            }
        };
        this.mMenuClicker = new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(final MenuItem item) {
                return ToolbarActionBar.this.mWindowCallback.onMenuItemSelected(0, item);
            }
        };
        Preconditions.checkNotNull((Object)toolbar);
        this.mDecorToolbar = new ToolbarWidgetWrapper(toolbar, false);
        this.mWindowCallback = (Window.Callback)Preconditions.checkNotNull((Object)windowCallback);
        this.mDecorToolbar.setWindowCallback(windowCallback);
        toolbar.setOnMenuItemClickListener(this.mMenuClicker);
        this.mDecorToolbar.setWindowTitle(title);
        this.mMenuCallback = new ToolbarMenuCallback();
    }
    
    @Override
    public void setCustomView(final View view) {
        this.setCustomView(view, new LayoutParams(-2, -2));
    }
    
    @Override
    public void setCustomView(final View view, final LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        }
        this.mDecorToolbar.setCustomView(view);
    }
    
    @Override
    public void setCustomView(final int resId) {
        final LayoutInflater inflater = LayoutInflater.from(this.mDecorToolbar.getContext());
        this.setCustomView(inflater.inflate(resId, this.mDecorToolbar.getViewGroup(), false));
    }
    
    @Override
    public void setIcon(final int resId) {
        this.mDecorToolbar.setIcon(resId);
    }
    
    @Override
    public void setIcon(final Drawable icon) {
        this.mDecorToolbar.setIcon(icon);
    }
    
    @Override
    public void setLogo(final int resId) {
        this.mDecorToolbar.setLogo(resId);
    }
    
    @Override
    public void setLogo(final Drawable logo) {
        this.mDecorToolbar.setLogo(logo);
    }
    
    @Override
    public void setStackedBackgroundDrawable(final Drawable d) {
    }
    
    @Override
    public void setSplitBackgroundDrawable(final Drawable d) {
    }
    
    @Override
    public void setHomeButtonEnabled(final boolean enabled) {
    }
    
    @Override
    public void setElevation(final float elevation) {
        ViewCompat.setElevation((View)this.mDecorToolbar.getViewGroup(), elevation);
    }
    
    @Override
    public float getElevation() {
        return ViewCompat.getElevation((View)this.mDecorToolbar.getViewGroup());
    }
    
    @Override
    public Context getThemedContext() {
        return this.mDecorToolbar.getContext();
    }
    
    @Override
    public boolean isTitleTruncated() {
        return super.isTitleTruncated();
    }
    
    @Override
    public void setHomeAsUpIndicator(final Drawable indicator) {
        this.mDecorToolbar.setNavigationIcon(indicator);
    }
    
    @Override
    public void setHomeAsUpIndicator(final int resId) {
        this.mDecorToolbar.setNavigationIcon(resId);
    }
    
    @Override
    public void setHomeActionContentDescription(final CharSequence description) {
        this.mDecorToolbar.setNavigationContentDescription(description);
    }
    
    @Override
    public void setDefaultDisplayHomeAsUpEnabled(final boolean enabled) {
    }
    
    @Override
    public void setHomeActionContentDescription(final int resId) {
        this.mDecorToolbar.setNavigationContentDescription(resId);
    }
    
    @Override
    public void setShowHideAnimationEnabled(final boolean enabled) {
    }
    
    @Override
    public void onConfigurationChanged(final Configuration config) {
        super.onConfigurationChanged(config);
    }
    
    @Override
    public void setListNavigationCallbacks(final SpinnerAdapter adapter, final OnNavigationListener callback) {
        this.mDecorToolbar.setDropdownParams(adapter, (AdapterView.OnItemSelectedListener)new NavItemSelectedListener(callback));
    }
    
    @Override
    public void setSelectedNavigationItem(final int position) {
        switch (this.mDecorToolbar.getNavigationMode()) {
            case 1: {
                this.mDecorToolbar.setDropdownSelectedPosition(position);
                return;
            }
            default: {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
        }
    }
    
    @Override
    public int getSelectedNavigationIndex() {
        return -1;
    }
    
    @Override
    public int getNavigationItemCount() {
        return 0;
    }
    
    @Override
    public void setTitle(final CharSequence title) {
        this.mDecorToolbar.setTitle(title);
    }
    
    @Override
    public void setTitle(final int resId) {
        this.mDecorToolbar.setTitle((resId != 0) ? this.mDecorToolbar.getContext().getText(resId) : null);
    }
    
    @Override
    public void setWindowTitle(final CharSequence title) {
        this.mDecorToolbar.setWindowTitle(title);
    }
    
    public boolean requestFocus() {
        final ViewGroup viewGroup = this.mDecorToolbar.getViewGroup();
        if (viewGroup != null && !viewGroup.hasFocus()) {
            viewGroup.requestFocus();
            return true;
        }
        return false;
    }
    
    @Override
    public void setSubtitle(final CharSequence subtitle) {
        this.mDecorToolbar.setSubtitle(subtitle);
    }
    
    @Override
    public void setSubtitle(final int resId) {
        this.mDecorToolbar.setSubtitle((resId != 0) ? this.mDecorToolbar.getContext().getText(resId) : null);
    }
    
    @SuppressLint({ "WrongConstant" })
    @Override
    public void setDisplayOptions(final int options) {
        this.setDisplayOptions(options, -1);
    }
    
    @Override
    public void setDisplayOptions(final int options, final int mask) {
        final int currentOptions = this.mDecorToolbar.getDisplayOptions();
        this.mDecorToolbar.setDisplayOptions((options & mask) | (currentOptions & ~mask));
    }
    
    @Override
    public void setDisplayUseLogoEnabled(final boolean useLogo) {
        this.setDisplayOptions(useLogo ? 1 : 0, 1);
    }
    
    @Override
    public void setDisplayShowHomeEnabled(final boolean showHome) {
        this.setDisplayOptions(showHome ? 2 : 0, 2);
    }
    
    @Override
    public void setDisplayHomeAsUpEnabled(final boolean showHomeAsUp) {
        this.setDisplayOptions(showHomeAsUp ? 4 : 0, 4);
    }
    
    @Override
    public void setDisplayShowTitleEnabled(final boolean showTitle) {
        this.setDisplayOptions(showTitle ? 8 : 0, 8);
    }
    
    @Override
    public void setDisplayShowCustomEnabled(final boolean showCustom) {
        this.setDisplayOptions(showCustom ? 16 : 0, 16);
    }
    
    @Override
    public void setBackgroundDrawable(@Nullable final Drawable d) {
        this.mDecorToolbar.setBackgroundDrawable(d);
    }
    
    @Override
    public View getCustomView() {
        return this.mDecorToolbar.getCustomView();
    }
    
    @Override
    public CharSequence getTitle() {
        return this.mDecorToolbar.getTitle();
    }
    
    @Override
    public CharSequence getSubtitle() {
        return this.mDecorToolbar.getSubtitle();
    }
    
    @Override
    public int getNavigationMode() {
        return 0;
    }
    
    @Override
    public void setNavigationMode(final int mode) {
        if (mode == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.mDecorToolbar.setNavigationMode(mode);
    }
    
    @Override
    public int getDisplayOptions() {
        return this.mDecorToolbar.getDisplayOptions();
    }
    
    @Override
    public Tab newTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void addTab(final Tab tab) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void addTab(final Tab tab, final boolean setSelected) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void addTab(final Tab tab, final int position) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void addTab(final Tab tab, final int position, final boolean setSelected) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void removeTab(final Tab tab) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void removeTabAt(final int position) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void removeAllTabs() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void selectTab(final Tab tab) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public Tab getSelectedTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public Tab getTabAt(final int index) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public int getTabCount() {
        return 0;
    }
    
    @Override
    public int getHeight() {
        return this.mDecorToolbar.getHeight();
    }
    
    @Override
    public void show() {
        this.mDecorToolbar.setVisibility(0);
    }
    
    @Override
    public void hide() {
        this.mDecorToolbar.setVisibility(8);
    }
    
    @Override
    public boolean isShowing() {
        return this.mDecorToolbar.getVisibility() == 0;
    }
    
    @Override
    public boolean openOptionsMenu() {
        return this.mDecorToolbar.showOverflowMenu();
    }
    
    @Override
    public boolean closeOptionsMenu() {
        return this.mDecorToolbar.hideOverflowMenu();
    }
    
    @Override
    public boolean invalidateOptionsMenu() {
        this.mDecorToolbar.getViewGroup().removeCallbacks(this.mMenuInvalidator);
        ViewCompat.postOnAnimation((View)this.mDecorToolbar.getViewGroup(), this.mMenuInvalidator);
        return true;
    }
    
    @Override
    public boolean collapseActionView() {
        if (this.mDecorToolbar.hasExpandedActionView()) {
            this.mDecorToolbar.collapseActionView();
            return true;
        }
        return false;
    }
    
    void populateOptionsMenu() {
        final Menu menu = this.getMenu();
        final MenuBuilder mb = (menu instanceof MenuBuilder) ? menu : null;
        if (mb != null) {
            mb.stopDispatchingItemsChanged();
        }
        try {
            menu.clear();
            if (!this.mWindowCallback.onCreatePanelMenu(0, menu) || !this.mWindowCallback.onPreparePanel(0, (View)null, menu)) {
                menu.clear();
            }
        }
        finally {
            if (mb != null) {
                mb.startDispatchingItemsChanged();
            }
        }
    }
    
    @Override
    public boolean onMenuKeyEvent(final KeyEvent event) {
        if (event.getAction() == 1) {
            this.openOptionsMenu();
        }
        return true;
    }
    
    @Override
    public boolean onKeyShortcut(final int keyCode, final KeyEvent ev) {
        final Menu menu = this.getMenu();
        if (menu != null) {
            final KeyCharacterMap kmap = KeyCharacterMap.load((ev != null) ? ev.getDeviceId() : -1);
            menu.setQwertyMode(kmap.getKeyboardType() != 1);
            return menu.performShortcut(keyCode, ev, 0);
        }
        return false;
    }
    
    @Override
    void onDestroy() {
        this.mDecorToolbar.getViewGroup().removeCallbacks(this.mMenuInvalidator);
    }
    
    @Override
    public void addOnMenuVisibilityListener(final OnMenuVisibilityListener listener) {
        this.mMenuVisibilityListeners.add((Object)listener);
    }
    
    @Override
    public void removeOnMenuVisibilityListener(final OnMenuVisibilityListener listener) {
        this.mMenuVisibilityListeners.remove((Object)listener);
    }
    
    @Override
    public void dispatchMenuVisibilityChanged(final boolean isVisible) {
        if (isVisible == this.mLastMenuVisibility) {
            return;
        }
        this.mLastMenuVisibility = isVisible;
        for (int count = this.mMenuVisibilityListeners.size(), i = 0; i < count; ++i) {
            ((OnMenuVisibilityListener)this.mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(isVisible);
        }
    }
    
    private Menu getMenu() {
        if (!this.mMenuCallbackSet) {
            this.mDecorToolbar.setMenuCallbacks(new ActionMenuPresenterCallback(), new MenuBuilderCallback());
            this.mMenuCallbackSet = true;
        }
        return this.mDecorToolbar.getMenu();
    }
    
    private class ToolbarMenuCallback implements AppCompatDelegateImpl.ActionBarMenuCallback
    {
        ToolbarMenuCallback() {
        }
        
        @Override
        public boolean onPreparePanel(final int featureId) {
            if (featureId == 0 && !ToolbarActionBar.this.mToolbarMenuPrepared) {
                ToolbarActionBar.this.mDecorToolbar.setMenuPrepared();
                ToolbarActionBar.this.mToolbarMenuPrepared = true;
            }
            return false;
        }
        
        @Override
        public View onCreatePanelView(final int featureId) {
            if (featureId == 0) {
                return new View(ToolbarActionBar.this.mDecorToolbar.getContext());
            }
            return null;
        }
    }
    
    private final class ActionMenuPresenterCallback implements MenuPresenter.Callback
    {
        private boolean mClosingActionMenu;
        
        ActionMenuPresenterCallback() {
        }
        
        @Override
        public boolean onOpenSubMenu(@NonNull final MenuBuilder subMenu) {
            ToolbarActionBar.this.mWindowCallback.onMenuOpened(108, (Menu)subMenu);
            return true;
        }
        
        @Override
        public void onCloseMenu(@NonNull final MenuBuilder menu, final boolean allMenusAreClosing) {
            if (this.mClosingActionMenu) {
                return;
            }
            this.mClosingActionMenu = true;
            ToolbarActionBar.this.mDecorToolbar.dismissPopupMenus();
            ToolbarActionBar.this.mWindowCallback.onPanelClosed(108, (Menu)menu);
            this.mClosingActionMenu = false;
        }
    }
    
    private final class MenuBuilderCallback implements MenuBuilder.Callback
    {
        MenuBuilderCallback() {
        }
        
        @Override
        public boolean onMenuItemSelected(@NonNull final MenuBuilder menu, @NonNull final MenuItem item) {
            return false;
        }
        
        @Override
        public void onMenuModeChange(@NonNull final MenuBuilder menu) {
            if (ToolbarActionBar.this.mDecorToolbar.isOverflowMenuShowing()) {
                ToolbarActionBar.this.mWindowCallback.onPanelClosed(108, (Menu)menu);
            }
            else if (ToolbarActionBar.this.mWindowCallback.onPreparePanel(0, (View)null, (Menu)menu)) {
                ToolbarActionBar.this.mWindowCallback.onMenuOpened(108, (Menu)menu);
            }
        }
    }
}
