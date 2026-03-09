package androidx.appcompat.widget;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.ViewPropertyAnimatorCompat;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import android.view.Menu;
import androidx.appcompat.content.res.AppCompatResources;
import android.util.Log;
import androidx.core.view.ViewCompat;
import android.content.Context;
import android.view.MenuItem;
import androidx.appcompat.view.menu.ActionMenuItem;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.R;
import android.view.Window;
import android.graphics.drawable.Drawable;
import android.widget.Spinner;
import android.view.View;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class ToolbarWidgetWrapper implements DecorToolbar
{
    private static final String TAG = "ToolbarWidgetWrapper";
    private static final int AFFECTS_LOGO_MASK = 3;
    private static final long DEFAULT_FADE_DURATION_MS = 200L;
    Toolbar mToolbar;
    private int mDisplayOpts;
    private View mTabView;
    private Spinner mSpinner;
    private View mCustomView;
    private Drawable mIcon;
    private Drawable mLogo;
    private Drawable mNavIcon;
    private boolean mTitleSet;
    CharSequence mTitle;
    private CharSequence mSubtitle;
    private CharSequence mHomeDescription;
    Window.Callback mWindowCallback;
    boolean mMenuPrepared;
    private ActionMenuPresenter mActionMenuPresenter;
    private int mNavigationMode;
    private int mDefaultNavigationContentDescription;
    private Drawable mDefaultNavigationIcon;
    
    public ToolbarWidgetWrapper(final Toolbar toolbar, final boolean style) {
        this(toolbar, style, R.string.abc_action_bar_up_description, R.drawable.abc_ic_ab_back_material);
    }
    
    public ToolbarWidgetWrapper(final Toolbar toolbar, final boolean style, final int defaultNavigationContentDescription, final int defaultNavigationIcon) {
        this.mNavigationMode = 0;
        this.mDefaultNavigationContentDescription = 0;
        this.mToolbar = toolbar;
        this.mTitle = toolbar.getTitle();
        this.mSubtitle = toolbar.getSubtitle();
        this.mTitleSet = (this.mTitle != null);
        this.mNavIcon = toolbar.getNavigationIcon();
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(toolbar.getContext(), null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        this.mDefaultNavigationIcon = a.getDrawable(R.styleable.ActionBar_homeAsUpIndicator);
        if (style) {
            final CharSequence title = a.getText(R.styleable.ActionBar_title);
            if (!TextUtils.isEmpty(title)) {
                this.setTitle(title);
            }
            final CharSequence subtitle = a.getText(R.styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(subtitle)) {
                this.setSubtitle(subtitle);
            }
            final Drawable logo = a.getDrawable(R.styleable.ActionBar_logo);
            if (logo != null) {
                this.setLogo(logo);
            }
            final Drawable icon = a.getDrawable(R.styleable.ActionBar_icon);
            if (icon != null) {
                this.setIcon(icon);
            }
            if (this.mNavIcon == null && this.mDefaultNavigationIcon != null) {
                this.setNavigationIcon(this.mDefaultNavigationIcon);
            }
            this.setDisplayOptions(a.getInt(R.styleable.ActionBar_displayOptions, 0));
            final int customNavId = a.getResourceId(R.styleable.ActionBar_customNavigationLayout, 0);
            if (customNavId != 0) {
                this.setCustomView(LayoutInflater.from(this.mToolbar.getContext()).inflate(customNavId, (ViewGroup)this.mToolbar, false));
                this.setDisplayOptions(this.mDisplayOpts | 0x10);
            }
            final int height = a.getLayoutDimension(R.styleable.ActionBar_height, 0);
            if (height > 0) {
                final ViewGroup.LayoutParams lp = this.mToolbar.getLayoutParams();
                lp.height = height;
                this.mToolbar.setLayoutParams(lp);
            }
            final int contentInsetStart = a.getDimensionPixelOffset(R.styleable.ActionBar_contentInsetStart, -1);
            final int contentInsetEnd = a.getDimensionPixelOffset(R.styleable.ActionBar_contentInsetEnd, -1);
            if (contentInsetStart >= 0 || contentInsetEnd >= 0) {
                this.mToolbar.setContentInsetsRelative(Math.max(contentInsetStart, 0), Math.max(contentInsetEnd, 0));
            }
            final int titleTextStyle = a.getResourceId(R.styleable.ActionBar_titleTextStyle, 0);
            if (titleTextStyle != 0) {
                this.mToolbar.setTitleTextAppearance(this.mToolbar.getContext(), titleTextStyle);
            }
            final int subtitleTextStyle = a.getResourceId(R.styleable.ActionBar_subtitleTextStyle, 0);
            if (subtitleTextStyle != 0) {
                this.mToolbar.setSubtitleTextAppearance(this.mToolbar.getContext(), subtitleTextStyle);
            }
            final int popupTheme = a.getResourceId(R.styleable.ActionBar_popupTheme, 0);
            if (popupTheme != 0) {
                this.mToolbar.setPopupTheme(popupTheme);
            }
        }
        else {
            this.mDisplayOpts = this.detectDisplayOptions();
        }
        a.recycle();
        this.setDefaultNavigationContentDescription(defaultNavigationContentDescription);
        this.mHomeDescription = this.mToolbar.getNavigationContentDescription();
        this.mToolbar.setNavigationOnClickListener((View.OnClickListener)new View.OnClickListener() {
            final ActionMenuItem mNavItem = new ActionMenuItem(ToolbarWidgetWrapper.this.mToolbar.getContext(), 0, 16908332, 0, 0, ToolbarWidgetWrapper.this.mTitle);
            
            public void onClick(final View v) {
                if (ToolbarWidgetWrapper.this.mWindowCallback != null && ToolbarWidgetWrapper.this.mMenuPrepared) {
                    ToolbarWidgetWrapper.this.mWindowCallback.onMenuItemSelected(0, (MenuItem)this.mNavItem);
                }
            }
        });
    }
    
    @Override
    public void setDefaultNavigationContentDescription(final int defaultNavigationContentDescription) {
        if (defaultNavigationContentDescription == this.mDefaultNavigationContentDescription) {
            return;
        }
        this.mDefaultNavigationContentDescription = defaultNavigationContentDescription;
        if (TextUtils.isEmpty(this.mToolbar.getNavigationContentDescription())) {
            this.setNavigationContentDescription(this.mDefaultNavigationContentDescription);
        }
    }
    
    private int detectDisplayOptions() {
        int opts = 11;
        if (this.mToolbar.getNavigationIcon() != null) {
            opts |= 0x4;
            this.mDefaultNavigationIcon = this.mToolbar.getNavigationIcon();
        }
        return opts;
    }
    
    @Override
    public ViewGroup getViewGroup() {
        return this.mToolbar;
    }
    
    @Override
    public Context getContext() {
        return this.mToolbar.getContext();
    }
    
    @Override
    public boolean hasExpandedActionView() {
        return this.mToolbar.hasExpandedActionView();
    }
    
    @Override
    public void collapseActionView() {
        this.mToolbar.collapseActionView();
    }
    
    @Override
    public void setWindowCallback(final Window.Callback cb) {
        this.mWindowCallback = cb;
    }
    
    @Override
    public void setWindowTitle(final CharSequence title) {
        if (!this.mTitleSet) {
            this.setTitleInt(title);
        }
    }
    
    @Override
    public CharSequence getTitle() {
        return this.mToolbar.getTitle();
    }
    
    @Override
    public void setTitle(final CharSequence title) {
        this.mTitleSet = true;
        this.setTitleInt(title);
    }
    
    private void setTitleInt(final CharSequence title) {
        this.mTitle = title;
        if ((this.mDisplayOpts & 0x8) != 0x0) {
            this.mToolbar.setTitle(title);
            if (this.mTitleSet) {
                ViewCompat.setAccessibilityPaneTitle(this.mToolbar.getRootView(), title);
            }
        }
    }
    
    @Override
    public CharSequence getSubtitle() {
        return this.mToolbar.getSubtitle();
    }
    
    @Override
    public void setSubtitle(final CharSequence subtitle) {
        this.mSubtitle = subtitle;
        if ((this.mDisplayOpts & 0x8) != 0x0) {
            this.mToolbar.setSubtitle(subtitle);
        }
    }
    
    @Override
    public void initProgress() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }
    
    @Override
    public void initIndeterminateProgress() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }
    
    @Override
    public boolean hasIcon() {
        return this.mIcon != null;
    }
    
    @Override
    public boolean hasLogo() {
        return this.mLogo != null;
    }
    
    @Override
    public void setIcon(final int resId) {
        this.setIcon((resId != 0) ? AppCompatResources.getDrawable(this.getContext(), resId) : null);
    }
    
    @Override
    public void setIcon(final Drawable d) {
        this.mIcon = d;
        this.updateToolbarLogo();
    }
    
    @Override
    public void setLogo(final int resId) {
        this.setLogo((resId != 0) ? AppCompatResources.getDrawable(this.getContext(), resId) : null);
    }
    
    @Override
    public void setLogo(final Drawable d) {
        this.mLogo = d;
        this.updateToolbarLogo();
    }
    
    private void updateToolbarLogo() {
        Drawable logo = null;
        if ((this.mDisplayOpts & 0x2) != 0x0) {
            if ((this.mDisplayOpts & 0x1) != 0x0) {
                logo = ((this.mLogo != null) ? this.mLogo : this.mIcon);
            }
            else {
                logo = this.mIcon;
            }
        }
        this.mToolbar.setLogo(logo);
    }
    
    @Override
    public boolean canShowOverflowMenu() {
        return this.mToolbar.canShowOverflowMenu();
    }
    
    @Override
    public boolean isOverflowMenuShowing() {
        return this.mToolbar.isOverflowMenuShowing();
    }
    
    @Override
    public boolean isOverflowMenuShowPending() {
        return this.mToolbar.isOverflowMenuShowPending();
    }
    
    @Override
    public boolean showOverflowMenu() {
        return this.mToolbar.showOverflowMenu();
    }
    
    @Override
    public boolean hideOverflowMenu() {
        return this.mToolbar.hideOverflowMenu();
    }
    
    @Override
    public void setMenuPrepared() {
        this.mMenuPrepared = true;
    }
    
    @Override
    public void setMenu(final Menu menu, final MenuPresenter.Callback cb) {
        if (this.mActionMenuPresenter == null) {
            (this.mActionMenuPresenter = new ActionMenuPresenter(this.mToolbar.getContext())).setId(R.id.action_menu_presenter);
        }
        this.mActionMenuPresenter.setCallback(cb);
        this.mToolbar.setMenu((MenuBuilder)menu, this.mActionMenuPresenter);
    }
    
    @Override
    public void dismissPopupMenus() {
        this.mToolbar.dismissPopupMenus();
    }
    
    @Override
    public int getDisplayOptions() {
        return this.mDisplayOpts;
    }
    
    @Override
    public void setDisplayOptions(final int newOpts) {
        final int oldOpts = this.mDisplayOpts;
        final int changed = oldOpts ^ newOpts;
        this.mDisplayOpts = newOpts;
        if (changed != 0) {
            if ((changed & 0x4) != 0x0) {
                if ((newOpts & 0x4) != 0x0) {
                    this.updateHomeAccessibility();
                }
                this.updateNavigationIcon();
            }
            if ((changed & 0x3) != 0x0) {
                this.updateToolbarLogo();
            }
            if ((changed & 0x8) != 0x0) {
                if ((newOpts & 0x8) != 0x0) {
                    this.mToolbar.setTitle(this.mTitle);
                    this.mToolbar.setSubtitle(this.mSubtitle);
                }
                else {
                    this.mToolbar.setTitle(null);
                    this.mToolbar.setSubtitle(null);
                }
            }
            if ((changed & 0x10) != 0x0 && this.mCustomView != null) {
                if ((newOpts & 0x10) != 0x0) {
                    this.mToolbar.addView(this.mCustomView);
                }
                else {
                    this.mToolbar.removeView(this.mCustomView);
                }
            }
        }
    }
    
    @Override
    public void setEmbeddedTabView(final ScrollingTabContainerView tabView) {
        if (this.mTabView != null && this.mTabView.getParent() == this.mToolbar) {
            this.mToolbar.removeView(this.mTabView);
        }
        if ((this.mTabView = (View)tabView) != null && this.mNavigationMode == 2) {
            this.mToolbar.addView(this.mTabView, 0);
            final Toolbar.LayoutParams lp = (Toolbar.LayoutParams)this.mTabView.getLayoutParams();
            lp.width = -2;
            lp.height = -2;
            lp.gravity = 8388691;
            tabView.setAllowCollapse(true);
        }
    }
    
    @Override
    public boolean hasEmbeddedTabs() {
        return this.mTabView != null;
    }
    
    @Override
    public boolean isTitleTruncated() {
        return this.mToolbar.isTitleTruncated();
    }
    
    @Override
    public void setCollapsible(final boolean collapsible) {
        this.mToolbar.setCollapsible(collapsible);
    }
    
    @Override
    public void setHomeButtonEnabled(final boolean enable) {
    }
    
    @Override
    public int getNavigationMode() {
        return this.mNavigationMode;
    }
    
    @Override
    public void setNavigationMode(final int mode) {
        final int oldMode = this.mNavigationMode;
        if (mode != oldMode) {
            switch (oldMode) {
                case 1: {
                    if (this.mSpinner != null && this.mSpinner.getParent() == this.mToolbar) {
                        this.mToolbar.removeView((View)this.mSpinner);
                        break;
                    }
                    break;
                }
                case 2: {
                    if (this.mTabView != null && this.mTabView.getParent() == this.mToolbar) {
                        this.mToolbar.removeView(this.mTabView);
                        break;
                    }
                    break;
                }
            }
            switch (this.mNavigationMode = mode) {
                case 0: {
                    break;
                }
                case 1: {
                    this.ensureSpinner();
                    this.mToolbar.addView((View)this.mSpinner, 0);
                    break;
                }
                case 2: {
                    if (this.mTabView != null) {
                        this.mToolbar.addView(this.mTabView, 0);
                        final Toolbar.LayoutParams lp = (Toolbar.LayoutParams)this.mTabView.getLayoutParams();
                        lp.width = -2;
                        lp.height = -2;
                        lp.gravity = 8388691;
                        break;
                    }
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Invalid navigation mode " + mode);
                }
            }
        }
    }
    
    private void ensureSpinner() {
        if (this.mSpinner == null) {
            this.mSpinner = new AppCompatSpinner(this.getContext(), null, R.attr.actionDropDownStyle);
            final Toolbar.LayoutParams lp = new Toolbar.LayoutParams(-2, -2, 8388627);
            this.mSpinner.setLayoutParams((ViewGroup.LayoutParams)lp);
        }
    }
    
    @Override
    public void setDropdownParams(final SpinnerAdapter adapter, final AdapterView.OnItemSelectedListener listener) {
        this.ensureSpinner();
        this.mSpinner.setAdapter(adapter);
        this.mSpinner.setOnItemSelectedListener(listener);
    }
    
    @Override
    public void setDropdownSelectedPosition(final int position) {
        if (this.mSpinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        this.mSpinner.setSelection(position);
    }
    
    @Override
    public int getDropdownSelectedPosition() {
        return (this.mSpinner != null) ? this.mSpinner.getSelectedItemPosition() : 0;
    }
    
    @Override
    public int getDropdownItemCount() {
        return (this.mSpinner != null) ? this.mSpinner.getCount() : 0;
    }
    
    @Override
    public void setCustomView(final View view) {
        if (this.mCustomView != null && (this.mDisplayOpts & 0x10) != 0x0) {
            this.mToolbar.removeView(this.mCustomView);
        }
        if ((this.mCustomView = view) != null && (this.mDisplayOpts & 0x10) != 0x0) {
            this.mToolbar.addView(this.mCustomView);
        }
    }
    
    @Override
    public View getCustomView() {
        return this.mCustomView;
    }
    
    @Override
    public void animateToVisibility(final int visibility) {
        final ViewPropertyAnimatorCompat anim = this.setupAnimatorToVisibility(visibility, 200L);
        if (anim != null) {
            anim.start();
        }
    }
    
    @Override
    public ViewPropertyAnimatorCompat setupAnimatorToVisibility(final int visibility, final long duration) {
        return ViewCompat.animate((View)this.mToolbar).alpha((visibility == 0) ? 1.0f : 0.0f).setDuration(duration).setListener((ViewPropertyAnimatorListener)new ViewPropertyAnimatorListenerAdapter() {
            private boolean mCanceled = false;
            
            public void onAnimationStart(final View view) {
                ToolbarWidgetWrapper.this.mToolbar.setVisibility(0);
            }
            
            public void onAnimationEnd(final View view) {
                if (!this.mCanceled) {
                    ToolbarWidgetWrapper.this.mToolbar.setVisibility(visibility);
                }
            }
            
            public void onAnimationCancel(final View view) {
                this.mCanceled = true;
            }
        });
    }
    
    @Override
    public void setNavigationIcon(final Drawable icon) {
        this.mNavIcon = icon;
        this.updateNavigationIcon();
    }
    
    @Override
    public void setNavigationIcon(final int resId) {
        this.setNavigationIcon((resId != 0) ? AppCompatResources.getDrawable(this.getContext(), resId) : null);
    }
    
    @Override
    public void setDefaultNavigationIcon(final Drawable defaultNavigationIcon) {
        if (this.mDefaultNavigationIcon != defaultNavigationIcon) {
            this.mDefaultNavigationIcon = defaultNavigationIcon;
            this.updateNavigationIcon();
        }
    }
    
    private void updateNavigationIcon() {
        if ((this.mDisplayOpts & 0x4) != 0x0) {
            this.mToolbar.setNavigationIcon((this.mNavIcon != null) ? this.mNavIcon : this.mDefaultNavigationIcon);
        }
        else {
            this.mToolbar.setNavigationIcon(null);
        }
    }
    
    @Override
    public void setNavigationContentDescription(final CharSequence description) {
        this.mHomeDescription = description;
        this.updateHomeAccessibility();
    }
    
    @Override
    public void setNavigationContentDescription(final int resId) {
        this.setNavigationContentDescription((CharSequence)((resId == 0) ? null : this.getContext().getString(resId)));
    }
    
    private void updateHomeAccessibility() {
        if ((this.mDisplayOpts & 0x4) != 0x0) {
            if (TextUtils.isEmpty(this.mHomeDescription)) {
                this.mToolbar.setNavigationContentDescription(this.mDefaultNavigationContentDescription);
            }
            else {
                this.mToolbar.setNavigationContentDescription(this.mHomeDescription);
            }
        }
    }
    
    @Override
    public void saveHierarchyState(final SparseArray<Parcelable> toolbarStates) {
        this.mToolbar.saveHierarchyState((SparseArray)toolbarStates);
    }
    
    @Override
    public void restoreHierarchyState(final SparseArray<Parcelable> toolbarStates) {
        this.mToolbar.restoreHierarchyState((SparseArray)toolbarStates);
    }
    
    @Override
    public void setBackgroundDrawable(final Drawable d) {
        this.mToolbar.setBackground(d);
    }
    
    @Override
    public int getHeight() {
        return this.mToolbar.getHeight();
    }
    
    @Override
    public void setVisibility(final int visible) {
        this.mToolbar.setVisibility(visible);
    }
    
    @Override
    public int getVisibility() {
        return this.mToolbar.getVisibility();
    }
    
    @Override
    public void setMenuCallbacks(final MenuPresenter.Callback actionMenuPresenterCallback, final MenuBuilder.Callback menuBuilderCallback) {
        this.mToolbar.setMenuCallbacks(actionMenuPresenterCallback, menuBuilderCallback);
    }
    
    @Override
    public Menu getMenu() {
        return this.mToolbar.getMenu();
    }
}
