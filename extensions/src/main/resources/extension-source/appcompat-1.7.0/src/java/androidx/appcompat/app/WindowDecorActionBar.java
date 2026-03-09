package androidx.appcompat.app;

import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.SubMenuBuilder;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.view.SupportMenuInflater;
import android.view.MenuInflater;
import java.lang.ref.WeakReference;
import androidx.appcompat.view.menu.MenuBuilder;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.Menu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.util.TypedValue;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentActivity;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.Configuration;
import androidx.appcompat.widget.Toolbar;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.R;
import android.app.Dialog;
import android.view.Window;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.view.ActionMode;
import java.util.ArrayList;
import androidx.appcompat.widget.ScrollingTabContainerView;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ActionBarContainer;
import android.app.Activity;
import android.content.Context;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionBarOverlayLayout;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class WindowDecorActionBar extends ActionBar implements ActionBarOverlayLayout.ActionBarVisibilityCallback
{
    private static final String TAG = "WindowDecorActionBar";
    private static final Interpolator sHideInterpolator;
    private static final Interpolator sShowInterpolator;
    Context mContext;
    private Context mThemedContext;
    private Activity mActivity;
    ActionBarOverlayLayout mOverlayLayout;
    ActionBarContainer mContainerView;
    DecorToolbar mDecorToolbar;
    ActionBarContextView mContextView;
    View mContentView;
    ScrollingTabContainerView mTabScrollView;
    private ArrayList<TabImpl> mTabs;
    private TabImpl mSelectedTab;
    private int mSavedTabPosition;
    private boolean mDisplayHomeAsUpSet;
    ActionModeImpl mActionMode;
    ActionMode mDeferredDestroyActionMode;
    ActionMode.Callback mDeferredModeDestroyCallback;
    private boolean mLastMenuVisibility;
    private ArrayList<OnMenuVisibilityListener> mMenuVisibilityListeners;
    private static final int INVALID_POSITION = -1;
    private static final long FADE_OUT_DURATION_MS = 100L;
    private static final long FADE_IN_DURATION_MS = 200L;
    private boolean mHasEmbeddedTabs;
    private int mCurWindowVisibility;
    boolean mContentAnimations;
    boolean mHiddenByApp;
    boolean mHiddenBySystem;
    private boolean mShowingForMode;
    private boolean mNowShowing;
    ViewPropertyAnimatorCompatSet mCurrentShowAnim;
    private boolean mShowHideAnimationEnabled;
    boolean mHideOnContentScroll;
    final ViewPropertyAnimatorListener mHideListener;
    final ViewPropertyAnimatorListener mShowListener;
    final ViewPropertyAnimatorUpdateListener mUpdateListener;
    
    public WindowDecorActionBar(final Activity activity, final boolean overlayMode) {
        this.mTabs = (ArrayList<TabImpl>)new ArrayList();
        this.mSavedTabPosition = -1;
        this.mMenuVisibilityListeners = (ArrayList<OnMenuVisibilityListener>)new ArrayList();
        this.mCurWindowVisibility = 0;
        this.mContentAnimations = true;
        this.mNowShowing = true;
        this.mHideListener = (ViewPropertyAnimatorListener)new ViewPropertyAnimatorListenerAdapter() {
            public void onAnimationEnd(final View view) {
                if (WindowDecorActionBar.this.mContentAnimations && WindowDecorActionBar.this.mContentView != null) {
                    WindowDecorActionBar.this.mContentView.setTranslationY(0.0f);
                    WindowDecorActionBar.this.mContainerView.setTranslationY(0.0f);
                }
                WindowDecorActionBar.this.mContainerView.setVisibility(8);
                WindowDecorActionBar.this.mContainerView.setTransitioning(false);
                WindowDecorActionBar.this.mCurrentShowAnim = null;
                WindowDecorActionBar.this.completeDeferredDestroyActionMode();
                if (WindowDecorActionBar.this.mOverlayLayout != null) {
                    ViewCompat.requestApplyInsets((View)WindowDecorActionBar.this.mOverlayLayout);
                }
            }
        };
        this.mShowListener = (ViewPropertyAnimatorListener)new ViewPropertyAnimatorListenerAdapter() {
            public void onAnimationEnd(final View view) {
                WindowDecorActionBar.this.mCurrentShowAnim = null;
                WindowDecorActionBar.this.mContainerView.requestLayout();
            }
        };
        this.mUpdateListener = (ViewPropertyAnimatorUpdateListener)new ViewPropertyAnimatorUpdateListener() {
            public void onAnimationUpdate(final View view) {
                final ViewParent parent = WindowDecorActionBar.this.mContainerView.getParent();
                ((View)parent).invalidate();
            }
        };
        this.mActivity = activity;
        final Window window = activity.getWindow();
        final View decor = window.getDecorView();
        this.init(decor);
        if (!overlayMode) {
            this.mContentView = decor.findViewById(16908290);
        }
    }
    
    public WindowDecorActionBar(final Dialog dialog) {
        this.mTabs = (ArrayList<TabImpl>)new ArrayList();
        this.mSavedTabPosition = -1;
        this.mMenuVisibilityListeners = (ArrayList<OnMenuVisibilityListener>)new ArrayList();
        this.mCurWindowVisibility = 0;
        this.mContentAnimations = true;
        this.mNowShowing = true;
        this.mHideListener = (ViewPropertyAnimatorListener)new ViewPropertyAnimatorListenerAdapter() {
            public void onAnimationEnd(final View view) {
                if (WindowDecorActionBar.this.mContentAnimations && WindowDecorActionBar.this.mContentView != null) {
                    WindowDecorActionBar.this.mContentView.setTranslationY(0.0f);
                    WindowDecorActionBar.this.mContainerView.setTranslationY(0.0f);
                }
                WindowDecorActionBar.this.mContainerView.setVisibility(8);
                WindowDecorActionBar.this.mContainerView.setTransitioning(false);
                WindowDecorActionBar.this.mCurrentShowAnim = null;
                WindowDecorActionBar.this.completeDeferredDestroyActionMode();
                if (WindowDecorActionBar.this.mOverlayLayout != null) {
                    ViewCompat.requestApplyInsets((View)WindowDecorActionBar.this.mOverlayLayout);
                }
            }
        };
        this.mShowListener = (ViewPropertyAnimatorListener)new ViewPropertyAnimatorListenerAdapter() {
            public void onAnimationEnd(final View view) {
                WindowDecorActionBar.this.mCurrentShowAnim = null;
                WindowDecorActionBar.this.mContainerView.requestLayout();
            }
        };
        this.mUpdateListener = (ViewPropertyAnimatorUpdateListener)new ViewPropertyAnimatorUpdateListener() {
            public void onAnimationUpdate(final View view) {
                final ViewParent parent = WindowDecorActionBar.this.mContainerView.getParent();
                ((View)parent).invalidate();
            }
        };
        this.init(dialog.getWindow().getDecorView());
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public WindowDecorActionBar(final View layout) {
        this.mTabs = (ArrayList<TabImpl>)new ArrayList();
        this.mSavedTabPosition = -1;
        this.mMenuVisibilityListeners = (ArrayList<OnMenuVisibilityListener>)new ArrayList();
        this.mCurWindowVisibility = 0;
        this.mContentAnimations = true;
        this.mNowShowing = true;
        this.mHideListener = (ViewPropertyAnimatorListener)new ViewPropertyAnimatorListenerAdapter() {
            public void onAnimationEnd(final View view) {
                if (WindowDecorActionBar.this.mContentAnimations && WindowDecorActionBar.this.mContentView != null) {
                    WindowDecorActionBar.this.mContentView.setTranslationY(0.0f);
                    WindowDecorActionBar.this.mContainerView.setTranslationY(0.0f);
                }
                WindowDecorActionBar.this.mContainerView.setVisibility(8);
                WindowDecorActionBar.this.mContainerView.setTransitioning(false);
                WindowDecorActionBar.this.mCurrentShowAnim = null;
                WindowDecorActionBar.this.completeDeferredDestroyActionMode();
                if (WindowDecorActionBar.this.mOverlayLayout != null) {
                    ViewCompat.requestApplyInsets((View)WindowDecorActionBar.this.mOverlayLayout);
                }
            }
        };
        this.mShowListener = (ViewPropertyAnimatorListener)new ViewPropertyAnimatorListenerAdapter() {
            public void onAnimationEnd(final View view) {
                WindowDecorActionBar.this.mCurrentShowAnim = null;
                WindowDecorActionBar.this.mContainerView.requestLayout();
            }
        };
        this.mUpdateListener = (ViewPropertyAnimatorUpdateListener)new ViewPropertyAnimatorUpdateListener() {
            public void onAnimationUpdate(final View view) {
                final ViewParent parent = WindowDecorActionBar.this.mContainerView.getParent();
                ((View)parent).invalidate();
            }
        };
        this.init(layout);
    }
    
    private void init(final View decor) {
        this.mOverlayLayout = (ActionBarOverlayLayout)decor.findViewById(R.id.decor_content_parent);
        if (this.mOverlayLayout != null) {
            this.mOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.mDecorToolbar = this.getDecorToolbar(decor.findViewById(R.id.action_bar));
        this.mContextView = (ActionBarContextView)decor.findViewById(R.id.action_context_bar);
        this.mContainerView = (ActionBarContainer)decor.findViewById(R.id.action_bar_container);
        if (this.mDecorToolbar == null || this.mContextView == null || this.mContainerView == null) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.mContext = this.mDecorToolbar.getContext();
        final int current = this.mDecorToolbar.getDisplayOptions();
        final boolean homeAsUp = (current & 0x4) != 0x0;
        if (homeAsUp) {
            this.mDisplayHomeAsUpSet = true;
        }
        final ActionBarPolicy abp = ActionBarPolicy.get(this.mContext);
        this.setHomeButtonEnabled(abp.enableHomeButtonByDefault() || homeAsUp);
        this.setHasEmbeddedTabs(abp.hasEmbeddedTabs());
        final TypedArray a = this.mContext.obtainStyledAttributes((AttributeSet)null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        if (a.getBoolean(R.styleable.ActionBar_hideOnContentScroll, false)) {
            this.setHideOnContentScrollEnabled(true);
        }
        final int elevation = a.getDimensionPixelSize(R.styleable.ActionBar_elevation, 0);
        if (elevation != 0) {
            this.setElevation((float)elevation);
        }
        a.recycle();
    }
    
    private DecorToolbar getDecorToolbar(final View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar)view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar)view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + ((view != null) ? view.getClass().getSimpleName() : "null"));
    }
    
    @Override
    public void setElevation(final float elevation) {
        ViewCompat.setElevation((View)this.mContainerView, elevation);
    }
    
    @Override
    public float getElevation() {
        return ViewCompat.getElevation((View)this.mContainerView);
    }
    
    @Override
    public void onConfigurationChanged(final Configuration newConfig) {
        this.setHasEmbeddedTabs(ActionBarPolicy.get(this.mContext).hasEmbeddedTabs());
    }
    
    private void setHasEmbeddedTabs(final boolean hasEmbeddedTabs) {
        if (!(this.mHasEmbeddedTabs = hasEmbeddedTabs)) {
            this.mDecorToolbar.setEmbeddedTabView(null);
            this.mContainerView.setTabContainer(this.mTabScrollView);
        }
        else {
            this.mContainerView.setTabContainer(null);
            this.mDecorToolbar.setEmbeddedTabView(this.mTabScrollView);
        }
        final boolean isInTabMode = this.getNavigationMode() == 2;
        if (this.mTabScrollView != null) {
            if (isInTabMode) {
                this.mTabScrollView.setVisibility(0);
                if (this.mOverlayLayout != null) {
                    ViewCompat.requestApplyInsets((View)this.mOverlayLayout);
                }
            }
            else {
                this.mTabScrollView.setVisibility(8);
            }
        }
        this.mDecorToolbar.setCollapsible(!this.mHasEmbeddedTabs && isInTabMode);
        this.mOverlayLayout.setHasNonEmbeddedTabs(!this.mHasEmbeddedTabs && isInTabMode);
    }
    
    private void ensureTabsExist() {
        if (this.mTabScrollView != null) {
            return;
        }
        final ScrollingTabContainerView tabScroller = new ScrollingTabContainerView(this.mContext);
        if (this.mHasEmbeddedTabs) {
            tabScroller.setVisibility(0);
            this.mDecorToolbar.setEmbeddedTabView(tabScroller);
        }
        else {
            if (this.getNavigationMode() == 2) {
                tabScroller.setVisibility(0);
                if (this.mOverlayLayout != null) {
                    ViewCompat.requestApplyInsets((View)this.mOverlayLayout);
                }
            }
            else {
                tabScroller.setVisibility(8);
            }
            this.mContainerView.setTabContainer(tabScroller);
        }
        this.mTabScrollView = tabScroller;
    }
    
    void completeDeferredDestroyActionMode() {
        if (this.mDeferredModeDestroyCallback != null) {
            this.mDeferredModeDestroyCallback.onDestroyActionMode(this.mDeferredDestroyActionMode);
            this.mDeferredDestroyActionMode = null;
            this.mDeferredModeDestroyCallback = null;
        }
    }
    
    @Override
    public void onWindowVisibilityChanged(final int visibility) {
        this.mCurWindowVisibility = visibility;
    }
    
    @Override
    public void setShowHideAnimationEnabled(final boolean enabled) {
        this.mShowHideAnimationEnabled = enabled;
        if (!enabled && this.mCurrentShowAnim != null) {
            this.mCurrentShowAnim.cancel();
        }
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
    
    @Override
    public void setCustomView(final int resId) {
        this.setCustomView(LayoutInflater.from(this.getThemedContext()).inflate(resId, this.mDecorToolbar.getViewGroup(), false));
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
    public void setHomeButtonEnabled(final boolean enable) {
        this.mDecorToolbar.setHomeButtonEnabled(enable);
    }
    
    @Override
    public void setTitle(final int resId) {
        this.setTitle((CharSequence)this.mContext.getString(resId));
    }
    
    @Override
    public void setSubtitle(final int resId) {
        this.setSubtitle((CharSequence)this.mContext.getString(resId));
    }
    
    @Override
    public void setSelectedNavigationItem(final int position) {
        switch (this.mDecorToolbar.getNavigationMode()) {
            case 2: {
                this.selectTab((Tab)this.mTabs.get(position));
                break;
            }
            case 1: {
                this.mDecorToolbar.setDropdownSelectedPosition(position);
                break;
            }
            default: {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
        }
    }
    
    @Override
    public void removeAllTabs() {
        this.cleanupTabs();
    }
    
    private void cleanupTabs() {
        if (this.mSelectedTab != null) {
            this.selectTab(null);
        }
        this.mTabs.clear();
        if (this.mTabScrollView != null) {
            this.mTabScrollView.removeAllTabs();
        }
        this.mSavedTabPosition = -1;
    }
    
    @Override
    public void setTitle(final CharSequence title) {
        this.mDecorToolbar.setTitle(title);
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
    public void setDisplayOptions(final int options) {
        if ((options & 0x4) != 0x0) {
            this.mDisplayHomeAsUpSet = true;
        }
        this.mDecorToolbar.setDisplayOptions(options);
    }
    
    @Override
    public void setDisplayOptions(final int options, final int mask) {
        final int current = this.mDecorToolbar.getDisplayOptions();
        if ((mask & 0x4) != 0x0) {
            this.mDisplayHomeAsUpSet = true;
        }
        this.mDecorToolbar.setDisplayOptions((options & mask) | (current & ~mask));
    }
    
    @Override
    public void setBackgroundDrawable(final Drawable d) {
        this.mContainerView.setPrimaryBackground(d);
    }
    
    @Override
    public void setStackedBackgroundDrawable(final Drawable d) {
        this.mContainerView.setStackedBackground(d);
    }
    
    @Override
    public void setSplitBackgroundDrawable(final Drawable d) {
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
        return this.mDecorToolbar.getNavigationMode();
    }
    
    @Override
    public int getDisplayOptions() {
        return this.mDecorToolbar.getDisplayOptions();
    }
    
    @Override
    public ActionMode startActionMode(final ActionMode.Callback callback) {
        if (this.mActionMode != null) {
            this.mActionMode.finish();
        }
        this.mOverlayLayout.setHideOnContentScrollEnabled(false);
        this.mContextView.killMode();
        final ActionModeImpl mode = new ActionModeImpl(this.mContextView.getContext(), callback);
        if (mode.dispatchOnCreate()) {
            (this.mActionMode = mode).invalidate();
            this.mContextView.initForMode(mode);
            this.animateToMode(true);
            return mode;
        }
        return null;
    }
    
    private void configureTab(final Tab tab, final int position) {
        final TabImpl tabi = (TabImpl)tab;
        final TabListener callback = tabi.getCallback();
        if (callback == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        tabi.setPosition(position);
        this.mTabs.add(position, (Object)tabi);
        for (int count = this.mTabs.size(), i = position + 1; i < count; ++i) {
            ((TabImpl)this.mTabs.get(i)).setPosition(i);
        }
    }
    
    @Override
    public void addTab(final Tab tab) {
        this.addTab(tab, this.mTabs.isEmpty());
    }
    
    @Override
    public void addTab(final Tab tab, final int position) {
        this.addTab(tab, position, this.mTabs.isEmpty());
    }
    
    @Override
    public void addTab(final Tab tab, final boolean setSelected) {
        this.ensureTabsExist();
        this.mTabScrollView.addTab(tab, setSelected);
        this.configureTab(tab, this.mTabs.size());
        if (setSelected) {
            this.selectTab(tab);
        }
    }
    
    @Override
    public void addTab(final Tab tab, final int position, final boolean setSelected) {
        this.ensureTabsExist();
        this.mTabScrollView.addTab(tab, position, setSelected);
        this.configureTab(tab, position);
        if (setSelected) {
            this.selectTab(tab);
        }
    }
    
    @Override
    public Tab newTab() {
        return new TabImpl();
    }
    
    @Override
    public void removeTab(final Tab tab) {
        this.removeTabAt(tab.getPosition());
    }
    
    @Override
    public void removeTabAt(final int position) {
        if (this.mTabScrollView == null) {
            return;
        }
        final int selectedTabPosition = (this.mSelectedTab != null) ? this.mSelectedTab.getPosition() : this.mSavedTabPosition;
        this.mTabScrollView.removeTabAt(position);
        final TabImpl removedTab = (TabImpl)this.mTabs.remove(position);
        if (removedTab != null) {
            removedTab.setPosition(-1);
        }
        for (int newTabCount = this.mTabs.size(), i = position; i < newTabCount; ++i) {
            ((TabImpl)this.mTabs.get(i)).setPosition(i);
        }
        if (selectedTabPosition == position) {
            this.selectTab(this.mTabs.isEmpty() ? null : ((Tab)this.mTabs.get(Math.max(0, position - 1))));
        }
    }
    
    @Override
    public void selectTab(final Tab tab) {
        if (this.getNavigationMode() != 2) {
            this.mSavedTabPosition = ((tab != null) ? tab.getPosition() : -1);
            return;
        }
        FragmentTransaction trans;
        if (this.mActivity instanceof FragmentActivity && !this.mDecorToolbar.getViewGroup().isInEditMode()) {
            trans = ((FragmentActivity)this.mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
        }
        else {
            trans = null;
        }
        if (this.mSelectedTab == tab) {
            if (this.mSelectedTab != null) {
                this.mSelectedTab.getCallback().onTabReselected(this.mSelectedTab, trans);
                this.mTabScrollView.animateToTab(tab.getPosition());
            }
        }
        else {
            this.mTabScrollView.setTabSelected((tab != null) ? tab.getPosition() : -1);
            if (this.mSelectedTab != null) {
                this.mSelectedTab.getCallback().onTabUnselected(this.mSelectedTab, trans);
            }
            this.mSelectedTab = (TabImpl)tab;
            if (this.mSelectedTab != null) {
                this.mSelectedTab.getCallback().onTabSelected(this.mSelectedTab, trans);
            }
        }
        if (trans != null && !trans.isEmpty()) {
            trans.commit();
        }
    }
    
    @Override
    public Tab getSelectedTab() {
        return this.mSelectedTab;
    }
    
    @Override
    public int getHeight() {
        return this.mContainerView.getHeight();
    }
    
    @Override
    public void enableContentAnimations(final boolean enabled) {
        this.mContentAnimations = enabled;
    }
    
    @Override
    public void show() {
        if (this.mHiddenByApp) {
            this.updateVisibility(this.mHiddenByApp = false);
        }
    }
    
    private void showForActionMode() {
        if (!this.mShowingForMode) {
            this.mShowingForMode = true;
            if (this.mOverlayLayout != null) {
                this.mOverlayLayout.setShowingForActionMode(true);
            }
            this.updateVisibility(false);
        }
    }
    
    @Override
    public void showForSystem() {
        if (this.mHiddenBySystem) {
            this.mHiddenBySystem = false;
            this.updateVisibility(true);
        }
    }
    
    @Override
    public void hide() {
        if (!this.mHiddenByApp) {
            this.mHiddenByApp = true;
            this.updateVisibility(false);
        }
    }
    
    private void hideForActionMode() {
        if (this.mShowingForMode) {
            this.mShowingForMode = false;
            if (this.mOverlayLayout != null) {
                this.mOverlayLayout.setShowingForActionMode(false);
            }
            this.updateVisibility(false);
        }
    }
    
    @Override
    public void hideForSystem() {
        if (!this.mHiddenBySystem) {
            this.updateVisibility(this.mHiddenBySystem = true);
        }
    }
    
    @Override
    public void setHideOnContentScrollEnabled(final boolean hideOnContentScroll) {
        if (hideOnContentScroll && !this.mOverlayLayout.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.mHideOnContentScroll = hideOnContentScroll;
        this.mOverlayLayout.setHideOnContentScrollEnabled(hideOnContentScroll);
    }
    
    @Override
    public boolean isHideOnContentScrollEnabled() {
        return this.mOverlayLayout.isHideOnContentScrollEnabled();
    }
    
    @Override
    public int getHideOffset() {
        return this.mOverlayLayout.getActionBarHideOffset();
    }
    
    @Override
    public void setHideOffset(final int offset) {
        if (offset != 0 && !this.mOverlayLayout.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.mOverlayLayout.setActionBarHideOffset(offset);
    }
    
    static boolean checkShowingFlags(final boolean hiddenByApp, final boolean hiddenBySystem, final boolean showingForMode) {
        return showingForMode || (!hiddenByApp && !hiddenBySystem);
    }
    
    private void updateVisibility(final boolean fromSystem) {
        final boolean shown = checkShowingFlags(this.mHiddenByApp, this.mHiddenBySystem, this.mShowingForMode);
        if (shown) {
            if (!this.mNowShowing) {
                this.mNowShowing = true;
                this.doShow(fromSystem);
            }
        }
        else if (this.mNowShowing) {
            this.mNowShowing = false;
            this.doHide(fromSystem);
        }
    }
    
    public void doShow(final boolean fromSystem) {
        if (this.mCurrentShowAnim != null) {
            this.mCurrentShowAnim.cancel();
        }
        this.mContainerView.setVisibility(0);
        if (this.mCurWindowVisibility == 0 && (this.mShowHideAnimationEnabled || fromSystem)) {
            this.mContainerView.setTranslationY(0.0f);
            float startingY = (float)(-this.mContainerView.getHeight());
            if (fromSystem) {
                final int[] topLeft = { 0, 0 };
                this.mContainerView.getLocationInWindow(topLeft);
                startingY -= topLeft[1];
            }
            this.mContainerView.setTranslationY(startingY);
            final ViewPropertyAnimatorCompatSet anim = new ViewPropertyAnimatorCompatSet();
            final ViewPropertyAnimatorCompat a = ViewCompat.animate((View)this.mContainerView).translationY(0.0f);
            a.setUpdateListener(this.mUpdateListener);
            anim.play(a);
            if (this.mContentAnimations && this.mContentView != null) {
                this.mContentView.setTranslationY(startingY);
                anim.play(ViewCompat.animate(this.mContentView).translationY(0.0f));
            }
            anim.setInterpolator(WindowDecorActionBar.sShowInterpolator);
            anim.setDuration(250L);
            anim.setListener(this.mShowListener);
            (this.mCurrentShowAnim = anim).start();
        }
        else {
            this.mContainerView.setAlpha(1.0f);
            this.mContainerView.setTranslationY(0.0f);
            if (this.mContentAnimations && this.mContentView != null) {
                this.mContentView.setTranslationY(0.0f);
            }
            this.mShowListener.onAnimationEnd((View)null);
        }
        if (this.mOverlayLayout != null) {
            ViewCompat.requestApplyInsets((View)this.mOverlayLayout);
        }
    }
    
    public void doHide(final boolean fromSystem) {
        if (this.mCurrentShowAnim != null) {
            this.mCurrentShowAnim.cancel();
        }
        if (this.mCurWindowVisibility == 0 && (this.mShowHideAnimationEnabled || fromSystem)) {
            this.mContainerView.setAlpha(1.0f);
            this.mContainerView.setTransitioning(true);
            final ViewPropertyAnimatorCompatSet anim = new ViewPropertyAnimatorCompatSet();
            float endingY = (float)(-this.mContainerView.getHeight());
            if (fromSystem) {
                final int[] topLeft = { 0, 0 };
                this.mContainerView.getLocationInWindow(topLeft);
                endingY -= topLeft[1];
            }
            final ViewPropertyAnimatorCompat a = ViewCompat.animate((View)this.mContainerView).translationY(endingY);
            a.setUpdateListener(this.mUpdateListener);
            anim.play(a);
            if (this.mContentAnimations && this.mContentView != null) {
                anim.play(ViewCompat.animate(this.mContentView).translationY(endingY));
            }
            anim.setInterpolator(WindowDecorActionBar.sHideInterpolator);
            anim.setDuration(250L);
            anim.setListener(this.mHideListener);
            (this.mCurrentShowAnim = anim).start();
        }
        else {
            this.mHideListener.onAnimationEnd((View)null);
        }
    }
    
    @Override
    public boolean isShowing() {
        final int height = this.getHeight();
        return this.mNowShowing && (height == 0 || this.getHideOffset() < height);
    }
    
    public void animateToMode(final boolean toActionMode) {
        if (toActionMode) {
            this.showForActionMode();
        }
        else {
            this.hideForActionMode();
        }
        if (this.shouldAnimateContextView()) {
            ViewPropertyAnimatorCompat fadeOut;
            ViewPropertyAnimatorCompat fadeIn;
            if (toActionMode) {
                fadeOut = this.mDecorToolbar.setupAnimatorToVisibility(4, 100L);
                fadeIn = this.mContextView.setupAnimatorToVisibility();
            }
            else {
                fadeIn = this.mDecorToolbar.setupAnimatorToVisibility(0, 200L);
                fadeOut = this.mContextView.setupAnimatorToVisibility();
            }
            final ViewPropertyAnimatorCompatSet set = new ViewPropertyAnimatorCompatSet();
            set.playSequentially(fadeOut, fadeIn);
            set.start();
        }
        else if (toActionMode) {
            this.mDecorToolbar.setVisibility(4);
            this.mContextView.setVisibility();
        }
        else {
            this.mDecorToolbar.setVisibility(0);
            this.mContextView.setVisibility();
        }
    }
    
    private boolean shouldAnimateContextView() {
        return this.mContainerView.isLaidOut();
    }
    
    @Override
    public Context getThemedContext() {
        if (this.mThemedContext == null) {
            final TypedValue outValue = new TypedValue();
            final Resources.Theme currentTheme = this.mContext.getTheme();
            currentTheme.resolveAttribute(R.attr.actionBarWidgetTheme, outValue, true);
            final int targetThemeRes = outValue.resourceId;
            if (targetThemeRes != 0) {
                this.mThemedContext = (Context)new ContextThemeWrapper(this.mContext, targetThemeRes);
            }
            else {
                this.mThemedContext = this.mContext;
            }
        }
        return this.mThemedContext;
    }
    
    @Override
    public boolean isTitleTruncated() {
        return this.mDecorToolbar != null && this.mDecorToolbar.isTitleTruncated();
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
    public void setHomeActionContentDescription(final int resId) {
        this.mDecorToolbar.setNavigationContentDescription(resId);
    }
    
    @Override
    public void onContentScrollStarted() {
        if (this.mCurrentShowAnim != null) {
            this.mCurrentShowAnim.cancel();
            this.mCurrentShowAnim = null;
        }
    }
    
    @Override
    public void onContentScrollStopped() {
    }
    
    @Override
    public boolean collapseActionView() {
        if (this.mDecorToolbar != null && this.mDecorToolbar.hasExpandedActionView()) {
            this.mDecorToolbar.collapseActionView();
            return true;
        }
        return false;
    }
    
    @Override
    public void setCustomView(final View view) {
        this.mDecorToolbar.setCustomView(view);
    }
    
    @Override
    public void setCustomView(final View view, final ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        this.mDecorToolbar.setCustomView(view);
    }
    
    @Override
    public void setListNavigationCallbacks(final SpinnerAdapter adapter, final OnNavigationListener callback) {
        this.mDecorToolbar.setDropdownParams(adapter, (AdapterView.OnItemSelectedListener)new NavItemSelectedListener(callback));
    }
    
    @Override
    public int getSelectedNavigationIndex() {
        switch (this.mDecorToolbar.getNavigationMode()) {
            case 2: {
                return (this.mSelectedTab != null) ? this.mSelectedTab.getPosition() : -1;
            }
            case 1: {
                return this.mDecorToolbar.getDropdownSelectedPosition();
            }
            default: {
                return -1;
            }
        }
    }
    
    @Override
    public int getNavigationItemCount() {
        switch (this.mDecorToolbar.getNavigationMode()) {
            case 2: {
                return this.mTabs.size();
            }
            case 1: {
                return this.mDecorToolbar.getDropdownItemCount();
            }
            default: {
                return 0;
            }
        }
    }
    
    @Override
    public int getTabCount() {
        return this.mTabs.size();
    }
    
    @Override
    public void setNavigationMode(final int mode) {
        final int oldMode = this.mDecorToolbar.getNavigationMode();
        switch (oldMode) {
            case 2: {
                this.mSavedTabPosition = this.getSelectedNavigationIndex();
                this.selectTab(null);
                this.mTabScrollView.setVisibility(8);
                break;
            }
        }
        if (oldMode != mode && !this.mHasEmbeddedTabs && this.mOverlayLayout != null) {
            ViewCompat.requestApplyInsets((View)this.mOverlayLayout);
        }
        this.mDecorToolbar.setNavigationMode(mode);
        switch (mode) {
            case 2: {
                this.ensureTabsExist();
                this.mTabScrollView.setVisibility(0);
                if (this.mSavedTabPosition != -1) {
                    this.setSelectedNavigationItem(this.mSavedTabPosition);
                    this.mSavedTabPosition = -1;
                    break;
                }
                break;
            }
        }
        this.mDecorToolbar.setCollapsible(mode == 2 && !this.mHasEmbeddedTabs);
        this.mOverlayLayout.setHasNonEmbeddedTabs(mode == 2 && !this.mHasEmbeddedTabs);
    }
    
    @Override
    public Tab getTabAt(final int index) {
        return (Tab)this.mTabs.get(index);
    }
    
    @Override
    public void setIcon(final int resId) {
        this.mDecorToolbar.setIcon(resId);
    }
    
    @Override
    public void setIcon(final Drawable icon) {
        this.mDecorToolbar.setIcon(icon);
    }
    
    public boolean hasIcon() {
        return this.mDecorToolbar.hasIcon();
    }
    
    @Override
    public void setLogo(final int resId) {
        this.mDecorToolbar.setLogo(resId);
    }
    
    @Override
    public void setLogo(final Drawable logo) {
        this.mDecorToolbar.setLogo(logo);
    }
    
    public boolean hasLogo() {
        return this.mDecorToolbar.hasLogo();
    }
    
    @Override
    public void setDefaultDisplayHomeAsUpEnabled(final boolean enable) {
        if (!this.mDisplayHomeAsUpSet) {
            this.setDisplayHomeAsUpEnabled(enable);
        }
    }
    
    @Override
    public boolean onKeyShortcut(final int keyCode, final KeyEvent event) {
        if (this.mActionMode == null) {
            return false;
        }
        final Menu menu = this.mActionMode.getMenu();
        if (menu != null) {
            final KeyCharacterMap kmap = KeyCharacterMap.load((event != null) ? event.getDeviceId() : -1);
            menu.setQwertyMode(kmap.getKeyboardType() != 1);
            return menu.performShortcut(keyCode, event, 0);
        }
        return false;
    }
    
    static {
        sHideInterpolator = (Interpolator)new AccelerateInterpolator();
        sShowInterpolator = (Interpolator)new DecelerateInterpolator();
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public class ActionModeImpl extends ActionMode implements MenuBuilder.Callback
    {
        private final Context mActionModeContext;
        private final MenuBuilder mMenu;
        private ActionMode.Callback mCallback;
        private WeakReference<View> mCustomView;
        
        public ActionModeImpl(final Context context, final ActionMode.Callback callback) {
            this.mActionModeContext = context;
            this.mCallback = callback;
            (this.mMenu = new MenuBuilder(context).setDefaultShowAsAction(1)).setCallback(this);
        }
        
        @Override
        public MenuInflater getMenuInflater() {
            return new SupportMenuInflater(this.mActionModeContext);
        }
        
        @Override
        public Menu getMenu() {
            return (Menu)this.mMenu;
        }
        
        @Override
        public void finish() {
            if (WindowDecorActionBar.this.mActionMode != this) {
                return;
            }
            if (!WindowDecorActionBar.checkShowingFlags(WindowDecorActionBar.this.mHiddenByApp, WindowDecorActionBar.this.mHiddenBySystem, false)) {
                WindowDecorActionBar.this.mDeferredDestroyActionMode = this;
                WindowDecorActionBar.this.mDeferredModeDestroyCallback = this.mCallback;
            }
            else {
                this.mCallback.onDestroyActionMode(this);
            }
            this.mCallback = null;
            WindowDecorActionBar.this.animateToMode(false);
            WindowDecorActionBar.this.mContextView.closeMode();
            WindowDecorActionBar.this.mOverlayLayout.setHideOnContentScrollEnabled(WindowDecorActionBar.this.mHideOnContentScroll);
            WindowDecorActionBar.this.mActionMode = null;
        }
        
        @Override
        public void invalidate() {
            if (WindowDecorActionBar.this.mActionMode != this) {
                return;
            }
            this.mMenu.stopDispatchingItemsChanged();
            try {
                this.mCallback.onPrepareActionMode(this, (Menu)this.mMenu);
            }
            finally {
                this.mMenu.startDispatchingItemsChanged();
            }
        }
        
        public boolean dispatchOnCreate() {
            this.mMenu.stopDispatchingItemsChanged();
            try {
                return this.mCallback.onCreateActionMode(this, (Menu)this.mMenu);
            }
            finally {
                this.mMenu.startDispatchingItemsChanged();
            }
        }
        
        @Override
        public void setCustomView(final View view) {
            WindowDecorActionBar.this.mContextView.setCustomView(view);
            this.mCustomView = (WeakReference<View>)new WeakReference((Object)view);
        }
        
        @Override
        public void setSubtitle(final CharSequence subtitle) {
            WindowDecorActionBar.this.mContextView.setSubtitle(subtitle);
        }
        
        @Override
        public void setTitle(final CharSequence title) {
            WindowDecorActionBar.this.mContextView.setTitle(title);
        }
        
        @Override
        public void setTitle(final int resId) {
            this.setTitle((CharSequence)WindowDecorActionBar.this.mContext.getResources().getString(resId));
        }
        
        @Override
        public void setSubtitle(final int resId) {
            this.setSubtitle((CharSequence)WindowDecorActionBar.this.mContext.getResources().getString(resId));
        }
        
        @Override
        public CharSequence getTitle() {
            return WindowDecorActionBar.this.mContextView.getTitle();
        }
        
        @Override
        public CharSequence getSubtitle() {
            return WindowDecorActionBar.this.mContextView.getSubtitle();
        }
        
        @Override
        public void setTitleOptionalHint(final boolean titleOptional) {
            super.setTitleOptionalHint(titleOptional);
            WindowDecorActionBar.this.mContextView.setTitleOptional(titleOptional);
        }
        
        @Override
        public boolean isTitleOptional() {
            return WindowDecorActionBar.this.mContextView.isTitleOptional();
        }
        
        @Override
        public View getCustomView() {
            return (this.mCustomView != null) ? ((View)this.mCustomView.get()) : null;
        }
        
        @Override
        public boolean onMenuItemSelected(@NonNull final MenuBuilder menu, @NonNull final MenuItem item) {
            return this.mCallback != null && this.mCallback.onActionItemClicked(this, item);
        }
        
        public void onCloseMenu(final MenuBuilder menu, final boolean allMenusAreClosing) {
        }
        
        public boolean onSubMenuSelected(final SubMenuBuilder subMenu) {
            if (this.mCallback == null) {
                return false;
            }
            if (!subMenu.hasVisibleItems()) {
                return true;
            }
            new MenuPopupHelper(WindowDecorActionBar.this.getThemedContext(), subMenu).show();
            return true;
        }
        
        public void onCloseSubMenu(final SubMenuBuilder menu) {
        }
        
        @Override
        public void onMenuModeChange(@NonNull final MenuBuilder menu) {
            if (this.mCallback == null) {
                return;
            }
            this.invalidate();
            WindowDecorActionBar.this.mContextView.showOverflowMenu();
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public class TabImpl extends Tab
    {
        private TabListener mCallback;
        private Object mTag;
        private Drawable mIcon;
        private CharSequence mText;
        private CharSequence mContentDesc;
        private int mPosition;
        private View mCustomView;
        
        public TabImpl() {
            this.mPosition = -1;
        }
        
        @Override
        public Object getTag() {
            return this.mTag;
        }
        
        @Override
        public Tab setTag(final Object tag) {
            this.mTag = tag;
            return this;
        }
        
        public TabListener getCallback() {
            return this.mCallback;
        }
        
        @Override
        public Tab setTabListener(final TabListener callback) {
            this.mCallback = callback;
            return this;
        }
        
        @Override
        public View getCustomView() {
            return this.mCustomView;
        }
        
        @Override
        public Tab setCustomView(final View view) {
            this.mCustomView = view;
            if (this.mPosition >= 0) {
                WindowDecorActionBar.this.mTabScrollView.updateTab(this.mPosition);
            }
            return this;
        }
        
        @Override
        public Tab setCustomView(final int layoutResId) {
            return this.setCustomView(LayoutInflater.from(WindowDecorActionBar.this.getThemedContext()).inflate(layoutResId, (ViewGroup)null));
        }
        
        @Override
        public Drawable getIcon() {
            return this.mIcon;
        }
        
        @Override
        public int getPosition() {
            return this.mPosition;
        }
        
        public void setPosition(final int position) {
            this.mPosition = position;
        }
        
        @Override
        public CharSequence getText() {
            return this.mText;
        }
        
        @Override
        public Tab setIcon(final Drawable icon) {
            this.mIcon = icon;
            if (this.mPosition >= 0) {
                WindowDecorActionBar.this.mTabScrollView.updateTab(this.mPosition);
            }
            return this;
        }
        
        @Override
        public Tab setIcon(final int resId) {
            return this.setIcon(AppCompatResources.getDrawable(WindowDecorActionBar.this.mContext, resId));
        }
        
        @Override
        public Tab setText(final CharSequence text) {
            this.mText = text;
            if (this.mPosition >= 0) {
                WindowDecorActionBar.this.mTabScrollView.updateTab(this.mPosition);
            }
            return this;
        }
        
        @Override
        public Tab setText(final int resId) {
            return this.setText(WindowDecorActionBar.this.mContext.getResources().getText(resId));
        }
        
        @Override
        public void select() {
            WindowDecorActionBar.this.selectTab(this);
        }
        
        @Override
        public Tab setContentDescription(final int resId) {
            return this.setContentDescription(WindowDecorActionBar.this.mContext.getResources().getText(resId));
        }
        
        @Override
        public Tab setContentDescription(final CharSequence contentDesc) {
            this.mContentDesc = contentDesc;
            if (this.mPosition >= 0) {
                WindowDecorActionBar.this.mTabScrollView.updateTab(this.mPosition);
            }
            return this;
        }
        
        @Override
        public CharSequence getContentDescription() {
            return this.mContentDesc;
        }
    }
}
