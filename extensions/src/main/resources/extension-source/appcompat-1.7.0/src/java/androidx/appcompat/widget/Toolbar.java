package androidx.appcompat.widget;

import java.util.Objects;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import android.view.ViewParent;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import android.os.Parcel;
import androidx.customview.view.AbsSavedState;
import android.os.Build;
import java.util.Iterator;
import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.annotation.MainThread;
import androidx.core.view.MenuProvider;
import java.util.Collection;
import androidx.appcompat.app.ActionBar;
import androidx.core.view.GravityCompat;
import java.util.List;
import android.view.MotionEvent;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.MenuRes;
import androidx.appcompat.view.SupportMenuInflater;
import android.view.MenuInflater;
import android.view.Menu;
import androidx.annotation.ColorInt;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.annotation.StringRes;
import android.text.Layout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.annotation.DrawableRes;
import android.view.ContextThemeWrapper;
import androidx.annotation.StyleRes;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.window.OnBackInvokedDispatcher;
import android.window.OnBackInvokedCallback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import android.view.MenuItem;
import androidx.core.view.MenuHostHelper;
import java.util.ArrayList;
import android.content.res.ColorStateList;
import android.content.Context;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.view.MenuHost;
import android.view.ViewGroup;

public class Toolbar extends ViewGroup implements MenuHost
{
    private static final String TAG = "Toolbar";
    ActionMenuView mMenuView;
    private TextView mTitleTextView;
    private TextView mSubtitleTextView;
    private ImageButton mNavButtonView;
    private ImageView mLogoView;
    private Drawable mCollapseIcon;
    private CharSequence mCollapseDescription;
    ImageButton mCollapseButtonView;
    View mExpandedActionView;
    private Context mPopupContext;
    private int mPopupTheme;
    private int mTitleTextAppearance;
    private int mSubtitleTextAppearance;
    int mButtonGravity;
    private int mMaxButtonHeight;
    private int mTitleMarginStart;
    private int mTitleMarginEnd;
    private int mTitleMarginTop;
    private int mTitleMarginBottom;
    private RtlSpacingHelper mContentInsets;
    private int mContentInsetStartWithNavigation;
    private int mContentInsetEndWithActions;
    private int mGravity;
    private CharSequence mTitleText;
    private CharSequence mSubtitleText;
    private ColorStateList mTitleTextColor;
    private ColorStateList mSubtitleTextColor;
    private boolean mEatingTouch;
    private boolean mEatingHover;
    private final ArrayList<View> mTempViews;
    private final ArrayList<View> mHiddenViews;
    private final int[] mTempMargins;
    final MenuHostHelper mMenuHostHelper;
    private ArrayList<MenuItem> mProvidedMenuItems;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private final ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
    private ToolbarWidgetWrapper mWrapper;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private MenuPresenter.Callback mActionMenuPresenterCallback;
    MenuBuilder.Callback mMenuBuilderCallback;
    private boolean mCollapsible;
    private OnBackInvokedCallback mBackInvokedCallback;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    private boolean mBackInvokedCallbackEnabled;
    private final Runnable mShowOverflowMenuRunnable;
    
    public Toolbar(@NonNull final Context context) {
        this(context, null);
    }
    
    public Toolbar(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, R.attr.toolbarStyle);
    }
    
    public Toolbar(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mGravity = 8388627;
        this.mTempViews = (ArrayList<View>)new ArrayList();
        this.mHiddenViews = (ArrayList<View>)new ArrayList();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new MenuHostHelper(this::invalidateMenu);
        this.mProvidedMenuItems = (ArrayList<MenuItem>)new ArrayList();
        this.mMenuViewItemClickListener = new ActionMenuView.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(final MenuItem item) {
                final boolean consumed = Toolbar.this.mMenuHostHelper.onMenuItemSelected(item);
                return consumed || (Toolbar.this.mOnMenuItemClickListener != null && Toolbar.this.mOnMenuItemClickListener.onMenuItemClick(item));
            }
        };
        this.mShowOverflowMenuRunnable = (Runnable)new Runnable() {
            public void run() {
                Toolbar.this.showOverflowMenu();
            }
        };
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(this.getContext(), attrs, R.styleable.Toolbar, defStyleAttr, 0);
        ViewCompat.saveAttributeDataForStyleable((View)this, context, R.styleable.Toolbar, attrs, a.getWrappedTypeArray(), defStyleAttr, 0);
        this.mTitleTextAppearance = a.getResourceId(R.styleable.Toolbar_titleTextAppearance, 0);
        this.mSubtitleTextAppearance = a.getResourceId(R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.mGravity = a.getInteger(R.styleable.Toolbar_android_gravity, this.mGravity);
        this.mButtonGravity = a.getInteger(R.styleable.Toolbar_buttonGravity, 48);
        int titleMargin = a.getDimensionPixelOffset(R.styleable.Toolbar_titleMargin, 0);
        if (a.hasValue(R.styleable.Toolbar_titleMargins)) {
            titleMargin = a.getDimensionPixelOffset(R.styleable.Toolbar_titleMargins, titleMargin);
        }
        final int n = titleMargin;
        this.mTitleMarginBottom = n;
        this.mTitleMarginTop = n;
        this.mTitleMarginEnd = n;
        this.mTitleMarginStart = n;
        final int marginStart = a.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginStart, -1);
        if (marginStart >= 0) {
            this.mTitleMarginStart = marginStart;
        }
        final int marginEnd = a.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginEnd, -1);
        if (marginEnd >= 0) {
            this.mTitleMarginEnd = marginEnd;
        }
        final int marginTop = a.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginTop, -1);
        if (marginTop >= 0) {
            this.mTitleMarginTop = marginTop;
        }
        final int marginBottom = a.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginBottom, -1);
        if (marginBottom >= 0) {
            this.mTitleMarginBottom = marginBottom;
        }
        this.mMaxButtonHeight = a.getDimensionPixelSize(R.styleable.Toolbar_maxButtonHeight, -1);
        final int contentInsetStart = a.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        final int contentInsetEnd = a.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        final int contentInsetLeft = a.getDimensionPixelSize(R.styleable.Toolbar_contentInsetLeft, 0);
        final int contentInsetRight = a.getDimensionPixelSize(R.styleable.Toolbar_contentInsetRight, 0);
        this.ensureContentInsets();
        this.mContentInsets.setAbsolute(contentInsetLeft, contentInsetRight);
        if (contentInsetStart != Integer.MIN_VALUE || contentInsetEnd != Integer.MIN_VALUE) {
            this.mContentInsets.setRelative(contentInsetStart, contentInsetEnd);
        }
        this.mContentInsetStartWithNavigation = a.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = a.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.mCollapseIcon = a.getDrawable(R.styleable.Toolbar_collapseIcon);
        this.mCollapseDescription = a.getText(R.styleable.Toolbar_collapseContentDescription);
        final CharSequence title = a.getText(R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(title)) {
            this.setTitle(title);
        }
        final CharSequence subtitle = a.getText(R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(subtitle)) {
            this.setSubtitle(subtitle);
        }
        this.mPopupContext = this.getContext();
        this.setPopupTheme(a.getResourceId(R.styleable.Toolbar_popupTheme, 0));
        final Drawable navIcon = a.getDrawable(R.styleable.Toolbar_navigationIcon);
        if (navIcon != null) {
            this.setNavigationIcon(navIcon);
        }
        final CharSequence navDesc = a.getText(R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(navDesc)) {
            this.setNavigationContentDescription(navDesc);
        }
        final Drawable logo = a.getDrawable(R.styleable.Toolbar_logo);
        if (logo != null) {
            this.setLogo(logo);
        }
        final CharSequence logoDesc = a.getText(R.styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(logoDesc)) {
            this.setLogoDescription(logoDesc);
        }
        if (a.hasValue(R.styleable.Toolbar_titleTextColor)) {
            this.setTitleTextColor(a.getColorStateList(R.styleable.Toolbar_titleTextColor));
        }
        if (a.hasValue(R.styleable.Toolbar_subtitleTextColor)) {
            this.setSubtitleTextColor(a.getColorStateList(R.styleable.Toolbar_subtitleTextColor));
        }
        if (a.hasValue(R.styleable.Toolbar_menu)) {
            this.inflateMenu(a.getResourceId(R.styleable.Toolbar_menu, 0));
        }
        a.recycle();
    }
    
    public void setBackInvokedCallbackEnabled(final boolean enabled) {
        if (this.mBackInvokedCallbackEnabled != enabled) {
            this.mBackInvokedCallbackEnabled = enabled;
            this.updateBackInvokedCallbackState();
        }
    }
    
    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }
    
    public void setPopupTheme(@StyleRes final int resId) {
        if (this.mPopupTheme != resId) {
            if ((this.mPopupTheme = resId) == 0) {
                this.mPopupContext = this.getContext();
            }
            else {
                this.mPopupContext = (Context)new ContextThemeWrapper(this.getContext(), resId);
            }
        }
    }
    
    @StyleRes
    public int getPopupTheme() {
        return this.mPopupTheme;
    }
    
    public void setTitleMargin(final int start, final int top, final int end, final int bottom) {
        this.mTitleMarginStart = start;
        this.mTitleMarginTop = top;
        this.mTitleMarginEnd = end;
        this.mTitleMarginBottom = bottom;
        this.requestLayout();
    }
    
    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }
    
    public void setTitleMarginStart(final int margin) {
        this.mTitleMarginStart = margin;
        this.requestLayout();
    }
    
    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }
    
    public void setTitleMarginTop(final int margin) {
        this.mTitleMarginTop = margin;
        this.requestLayout();
    }
    
    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }
    
    public void setTitleMarginEnd(final int margin) {
        this.mTitleMarginEnd = margin;
        this.requestLayout();
    }
    
    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }
    
    public void setTitleMarginBottom(final int margin) {
        this.mTitleMarginBottom = margin;
        this.requestLayout();
    }
    
    public void onRtlPropertiesChanged(final int layoutDirection) {
        super.onRtlPropertiesChanged(layoutDirection);
        this.ensureContentInsets();
        this.mContentInsets.setDirection(layoutDirection == 1);
    }
    
    public void setLogo(@DrawableRes final int resId) {
        this.setLogo(AppCompatResources.getDrawable(this.getContext(), resId));
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public boolean canShowOverflowMenu() {
        return this.getVisibility() == 0 && this.mMenuView != null && this.mMenuView.isOverflowReserved();
    }
    
    public boolean isOverflowMenuShowing() {
        return this.mMenuView != null && this.mMenuView.isOverflowMenuShowing();
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public boolean isOverflowMenuShowPending() {
        return this.mMenuView != null && this.mMenuView.isOverflowMenuShowPending();
    }
    
    public boolean showOverflowMenu() {
        return this.mMenuView != null && this.mMenuView.showOverflowMenu();
    }
    
    public boolean hideOverflowMenu() {
        return this.mMenuView != null && this.mMenuView.hideOverflowMenu();
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY })
    public void setMenu(final MenuBuilder menu, final ActionMenuPresenter outerPresenter) {
        if (menu == null && this.mMenuView == null) {
            return;
        }
        this.ensureMenuView();
        final MenuBuilder oldMenu = this.mMenuView.peekMenu();
        if (oldMenu == menu) {
            return;
        }
        if (oldMenu != null) {
            oldMenu.removeMenuPresenter(this.mOuterActionMenuPresenter);
            oldMenu.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
        }
        outerPresenter.setExpandedActionViewsExclusive(true);
        if (menu != null) {
            menu.addMenuPresenter(outerPresenter, this.mPopupContext);
            menu.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        }
        else {
            outerPresenter.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            outerPresenter.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(outerPresenter);
        this.mOuterActionMenuPresenter = outerPresenter;
        this.updateBackInvokedCallbackState();
    }
    
    public void dismissPopupMenus() {
        if (this.mMenuView != null) {
            this.mMenuView.dismissPopupMenus();
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public boolean isTitleTruncated() {
        if (this.mTitleTextView == null) {
            return false;
        }
        final Layout titleLayout = this.mTitleTextView.getLayout();
        if (titleLayout == null) {
            return false;
        }
        for (int lineCount = titleLayout.getLineCount(), i = 0; i < lineCount; ++i) {
            if (titleLayout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }
    
    public void setLogo(final Drawable drawable) {
        if (drawable != null) {
            this.ensureLogoView();
            if (!this.isChildOrHidden((View)this.mLogoView)) {
                this.addSystemView((View)this.mLogoView, true);
            }
        }
        else if (this.mLogoView != null && this.isChildOrHidden((View)this.mLogoView)) {
            this.removeView((View)this.mLogoView);
            this.mHiddenViews.remove((Object)this.mLogoView);
        }
        if (this.mLogoView != null) {
            this.mLogoView.setImageDrawable(drawable);
        }
    }
    
    public Drawable getLogo() {
        return (this.mLogoView != null) ? this.mLogoView.getDrawable() : null;
    }
    
    public void setLogoDescription(@StringRes final int resId) {
        this.setLogoDescription(this.getContext().getText(resId));
    }
    
    public void setLogoDescription(final CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            this.ensureLogoView();
        }
        if (this.mLogoView != null) {
            this.mLogoView.setContentDescription(description);
        }
    }
    
    public CharSequence getLogoDescription() {
        return (this.mLogoView != null) ? this.mLogoView.getContentDescription() : null;
    }
    
    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(this.getContext());
        }
    }
    
    public boolean hasExpandedActionView() {
        return this.mExpandedMenuPresenter != null && this.mExpandedMenuPresenter.mCurrentExpandedItem != null;
    }
    
    public void collapseActionView() {
        final MenuItemImpl item = (this.mExpandedMenuPresenter == null) ? null : this.mExpandedMenuPresenter.mCurrentExpandedItem;
        if (item != null) {
            item.collapseActionView();
        }
    }
    
    public CharSequence getTitle() {
        return this.mTitleText;
    }
    
    public void setTitle(@StringRes final int resId) {
        this.setTitle(this.getContext().getText(resId));
    }
    
    public void setTitle(final CharSequence title) {
        if (!TextUtils.isEmpty(title)) {
            if (this.mTitleTextView == null) {
                final Context context = this.getContext();
                (this.mTitleTextView = new AppCompatTextView(context)).setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                if (this.mTitleTextAppearance != 0) {
                    this.mTitleTextView.setTextAppearance(context, this.mTitleTextAppearance);
                }
                if (this.mTitleTextColor != null) {
                    this.mTitleTextView.setTextColor(this.mTitleTextColor);
                }
            }
            if (!this.isChildOrHidden((View)this.mTitleTextView)) {
                this.addSystemView((View)this.mTitleTextView, true);
            }
        }
        else if (this.mTitleTextView != null && this.isChildOrHidden((View)this.mTitleTextView)) {
            this.removeView((View)this.mTitleTextView);
            this.mHiddenViews.remove((Object)this.mTitleTextView);
        }
        if (this.mTitleTextView != null) {
            this.mTitleTextView.setText(title);
        }
        this.mTitleText = title;
    }
    
    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }
    
    public void setSubtitle(@StringRes final int resId) {
        this.setSubtitle(this.getContext().getText(resId));
    }
    
    public void setSubtitle(final CharSequence subtitle) {
        if (!TextUtils.isEmpty(subtitle)) {
            if (this.mSubtitleTextView == null) {
                final Context context = this.getContext();
                (this.mSubtitleTextView = new AppCompatTextView(context)).setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                if (this.mSubtitleTextAppearance != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, this.mSubtitleTextAppearance);
                }
                if (this.mSubtitleTextColor != null) {
                    this.mSubtitleTextView.setTextColor(this.mSubtitleTextColor);
                }
            }
            if (!this.isChildOrHidden((View)this.mSubtitleTextView)) {
                this.addSystemView((View)this.mSubtitleTextView, true);
            }
        }
        else if (this.mSubtitleTextView != null && this.isChildOrHidden((View)this.mSubtitleTextView)) {
            this.removeView((View)this.mSubtitleTextView);
            this.mHiddenViews.remove((Object)this.mSubtitleTextView);
        }
        if (this.mSubtitleTextView != null) {
            this.mSubtitleTextView.setText(subtitle);
        }
        this.mSubtitleText = subtitle;
    }
    
    public void setTitleTextAppearance(final Context context, @StyleRes final int resId) {
        this.mTitleTextAppearance = resId;
        if (this.mTitleTextView != null) {
            this.mTitleTextView.setTextAppearance(context, resId);
        }
    }
    
    public void setSubtitleTextAppearance(final Context context, @StyleRes final int resId) {
        this.mSubtitleTextAppearance = resId;
        if (this.mSubtitleTextView != null) {
            this.mSubtitleTextView.setTextAppearance(context, resId);
        }
    }
    
    public void setTitleTextColor(@ColorInt final int color) {
        this.setTitleTextColor(ColorStateList.valueOf(color));
    }
    
    public void setTitleTextColor(@NonNull final ColorStateList color) {
        this.mTitleTextColor = color;
        if (this.mTitleTextView != null) {
            this.mTitleTextView.setTextColor(color);
        }
    }
    
    public void setSubtitleTextColor(@ColorInt final int color) {
        this.setSubtitleTextColor(ColorStateList.valueOf(color));
    }
    
    public void setSubtitleTextColor(@NonNull final ColorStateList color) {
        this.mSubtitleTextColor = color;
        if (this.mSubtitleTextView != null) {
            this.mSubtitleTextView.setTextColor(color);
        }
    }
    
    @Nullable
    public CharSequence getNavigationContentDescription() {
        return (this.mNavButtonView != null) ? this.mNavButtonView.getContentDescription() : null;
    }
    
    public void setNavigationContentDescription(@StringRes final int resId) {
        this.setNavigationContentDescription((resId != 0) ? this.getContext().getText(resId) : null);
    }
    
    public void setNavigationContentDescription(@Nullable final CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            this.ensureNavButtonView();
        }
        if (this.mNavButtonView != null) {
            this.mNavButtonView.setContentDescription(description);
            TooltipCompat.setTooltipText((View)this.mNavButtonView, description);
        }
    }
    
    public void setNavigationIcon(@DrawableRes final int resId) {
        this.setNavigationIcon(AppCompatResources.getDrawable(this.getContext(), resId));
    }
    
    public void setNavigationIcon(@Nullable final Drawable icon) {
        if (icon != null) {
            this.ensureNavButtonView();
            if (!this.isChildOrHidden((View)this.mNavButtonView)) {
                this.addSystemView((View)this.mNavButtonView, true);
            }
        }
        else if (this.mNavButtonView != null && this.isChildOrHidden((View)this.mNavButtonView)) {
            this.removeView((View)this.mNavButtonView);
            this.mHiddenViews.remove((Object)this.mNavButtonView);
        }
        if (this.mNavButtonView != null) {
            this.mNavButtonView.setImageDrawable(icon);
        }
    }
    
    @Nullable
    public Drawable getNavigationIcon() {
        return (this.mNavButtonView != null) ? this.mNavButtonView.getDrawable() : null;
    }
    
    public void setNavigationOnClickListener(final View.OnClickListener listener) {
        this.ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(listener);
    }
    
    @Nullable
    public CharSequence getCollapseContentDescription() {
        return (this.mCollapseButtonView != null) ? this.mCollapseButtonView.getContentDescription() : null;
    }
    
    public void setCollapseContentDescription(@StringRes final int resId) {
        this.setCollapseContentDescription((resId != 0) ? this.getContext().getText(resId) : null);
    }
    
    public void setCollapseContentDescription(@Nullable final CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            this.ensureCollapseButtonView();
        }
        if (this.mCollapseButtonView != null) {
            this.mCollapseButtonView.setContentDescription(description);
        }
    }
    
    @Nullable
    public Drawable getCollapseIcon() {
        return (this.mCollapseButtonView != null) ? this.mCollapseButtonView.getDrawable() : null;
    }
    
    public void setCollapseIcon(@DrawableRes final int resId) {
        this.setCollapseIcon(AppCompatResources.getDrawable(this.getContext(), resId));
    }
    
    public void setCollapseIcon(@Nullable final Drawable icon) {
        if (icon != null) {
            this.ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(icon);
        }
        else if (this.mCollapseButtonView != null) {
            this.mCollapseButtonView.setImageDrawable(this.mCollapseIcon);
        }
    }
    
    public Menu getMenu() {
        this.ensureMenu();
        return this.mMenuView.getMenu();
    }
    
    public void setOverflowIcon(@Nullable final Drawable icon) {
        this.ensureMenu();
        this.mMenuView.setOverflowIcon(icon);
    }
    
    @Nullable
    public Drawable getOverflowIcon() {
        this.ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }
    
    private void ensureMenu() {
        this.ensureMenuView();
        if (this.mMenuView.peekMenu() == null) {
            final MenuBuilder menu = (MenuBuilder)this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            menu.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            this.updateBackInvokedCallbackState();
        }
    }
    
    private void ensureMenuView() {
        if (this.mMenuView == null) {
            (this.mMenuView = new ActionMenuView(this.getContext())).setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.setMenuCallbacks(this.mActionMenuPresenterCallback, new MenuBuilder.Callback() {
                @Override
                public boolean onMenuItemSelected(@NonNull final MenuBuilder menu, @NonNull final MenuItem item) {
                    return Toolbar.this.mMenuBuilderCallback != null && Toolbar.this.mMenuBuilderCallback.onMenuItemSelected(menu, item);
                }
                
                @Override
                public void onMenuModeChange(@NonNull final MenuBuilder menu) {
                    if (!Toolbar.this.mMenuView.isOverflowMenuShowing()) {
                        Toolbar.this.mMenuHostHelper.onPrepareMenu((Menu)menu);
                    }
                    if (Toolbar.this.mMenuBuilderCallback != null) {
                        Toolbar.this.mMenuBuilderCallback.onMenuModeChange(menu);
                    }
                }
            });
            final LayoutParams lp = this.generateDefaultLayoutParams();
            lp.gravity = (0x800005 | (this.mButtonGravity & 0x70));
            this.mMenuView.setLayoutParams((ViewGroup.LayoutParams)lp);
            this.addSystemView((View)this.mMenuView, false);
        }
    }
    
    private MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.getContext());
    }
    
    public void inflateMenu(@MenuRes final int resId) {
        this.getMenuInflater().inflate(resId, this.getMenu());
    }
    
    public void setOnMenuItemClickListener(final OnMenuItemClickListener listener) {
        this.mOnMenuItemClickListener = listener;
    }
    
    public void setContentInsetsRelative(final int contentInsetStart, final int contentInsetEnd) {
        this.ensureContentInsets();
        this.mContentInsets.setRelative(contentInsetStart, contentInsetEnd);
    }
    
    public int getContentInsetStart() {
        return (this.mContentInsets != null) ? this.mContentInsets.getStart() : 0;
    }
    
    public int getContentInsetEnd() {
        return (this.mContentInsets != null) ? this.mContentInsets.getEnd() : 0;
    }
    
    public void setContentInsetsAbsolute(final int contentInsetLeft, final int contentInsetRight) {
        this.ensureContentInsets();
        this.mContentInsets.setAbsolute(contentInsetLeft, contentInsetRight);
    }
    
    public int getContentInsetLeft() {
        return (this.mContentInsets != null) ? this.mContentInsets.getLeft() : 0;
    }
    
    public int getContentInsetRight() {
        return (this.mContentInsets != null) ? this.mContentInsets.getRight() : 0;
    }
    
    public int getContentInsetStartWithNavigation() {
        return (this.mContentInsetStartWithNavigation != Integer.MIN_VALUE) ? this.mContentInsetStartWithNavigation : this.getContentInsetStart();
    }
    
    public void setContentInsetStartWithNavigation(int insetStartWithNavigation) {
        if (insetStartWithNavigation < 0) {
            insetStartWithNavigation = Integer.MIN_VALUE;
        }
        if (insetStartWithNavigation != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = insetStartWithNavigation;
            if (this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }
    
    public int getContentInsetEndWithActions() {
        return (this.mContentInsetEndWithActions != Integer.MIN_VALUE) ? this.mContentInsetEndWithActions : this.getContentInsetEnd();
    }
    
    public void setContentInsetEndWithActions(int insetEndWithActions) {
        if (insetEndWithActions < 0) {
            insetEndWithActions = Integer.MIN_VALUE;
        }
        if (insetEndWithActions != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = insetEndWithActions;
            if (this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }
    
    public int getCurrentContentInsetStart() {
        return (this.getNavigationIcon() != null) ? Math.max(this.getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : this.getContentInsetStart();
    }
    
    public int getCurrentContentInsetEnd() {
        boolean hasActions = false;
        if (this.mMenuView != null) {
            final MenuBuilder mb = this.mMenuView.peekMenu();
            hasActions = (mb != null && mb.hasVisibleItems());
        }
        return hasActions ? Math.max(this.getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0)) : this.getContentInsetEnd();
    }
    
    public int getCurrentContentInsetLeft() {
        return (this.getLayoutDirection() == 1) ? this.getCurrentContentInsetEnd() : this.getCurrentContentInsetStart();
    }
    
    public int getCurrentContentInsetRight() {
        return (this.getLayoutDirection() == 1) ? this.getCurrentContentInsetStart() : this.getCurrentContentInsetEnd();
    }
    
    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(this.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            final LayoutParams lp = this.generateDefaultLayoutParams();
            lp.gravity = (0x800003 | (this.mButtonGravity & 0x70));
            this.mNavButtonView.setLayoutParams((ViewGroup.LayoutParams)lp);
        }
    }
    
    @VisibleForTesting
    @Nullable
    View getNavButtonView() {
        return (View)this.mNavButtonView;
    }
    
    void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            (this.mCollapseButtonView = new AppCompatImageButton(this.getContext(), null, R.attr.toolbarNavigationButtonStyle)).setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            final LayoutParams lp = this.generateDefaultLayoutParams();
            lp.gravity = (0x800003 | (this.mButtonGravity & 0x70));
            lp.mViewType = 2;
            this.mCollapseButtonView.setLayoutParams((ViewGroup.LayoutParams)lp);
            this.mCollapseButtonView.setOnClickListener((View.OnClickListener)new View.OnClickListener() {
                public void onClick(final View v) {
                    Toolbar.this.collapseActionView();
                }
            });
        }
    }
    
    private void addSystemView(final View v, final boolean allowHide) {
        final ViewGroup.LayoutParams vlp = v.getLayoutParams();
        LayoutParams lp;
        if (vlp == null) {
            lp = this.generateDefaultLayoutParams();
        }
        else if (!this.checkLayoutParams(vlp)) {
            lp = this.generateLayoutParams(vlp);
        }
        else {
            lp = (LayoutParams)vlp;
        }
        lp.mViewType = 1;
        if (allowHide && this.mExpandedActionView != null) {
            v.setLayoutParams((ViewGroup.LayoutParams)lp);
            this.mHiddenViews.add((Object)v);
        }
        else {
            this.addView(v, (ViewGroup.LayoutParams)lp);
        }
    }
    
    protected Parcelable onSaveInstanceState() {
        final SavedState state = new SavedState(super.onSaveInstanceState());
        if (this.mExpandedMenuPresenter != null && this.mExpandedMenuPresenter.mCurrentExpandedItem != null) {
            state.expandedMenuItemId = this.mExpandedMenuPresenter.mCurrentExpandedItem.getItemId();
        }
        state.isOverflowOpen = this.isOverflowMenuShowing();
        return (Parcelable)state;
    }
    
    protected void onRestoreInstanceState(final Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        final SavedState ss = (SavedState)state;
        super.onRestoreInstanceState(ss.getSuperState());
        final Menu menu = (Menu)((this.mMenuView != null) ? this.mMenuView.peekMenu() : null);
        if (ss.expandedMenuItemId != 0 && this.mExpandedMenuPresenter != null && menu != null) {
            final MenuItem item = menu.findItem(ss.expandedMenuItemId);
            if (item != null) {
                item.expandActionView();
            }
        }
        if (ss.isOverflowOpen) {
            this.postShowOverflowMenu();
        }
    }
    
    private void postShowOverflowMenu() {
        this.removeCallbacks(this.mShowOverflowMenuRunnable);
        this.post(this.mShowOverflowMenuRunnable);
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.mShowOverflowMenuRunnable);
        this.updateBackInvokedCallbackState();
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.updateBackInvokedCallbackState();
    }
    
    public boolean onTouchEvent(final MotionEvent ev) {
        final int action = ev.getActionMasked();
        if (action == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            final boolean handled = super.onTouchEvent(ev);
            if (action == 0 && !handled) {
                this.mEatingTouch = true;
            }
        }
        if (action == 1 || action == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }
    
    public boolean onHoverEvent(final MotionEvent ev) {
        final int action = ev.getActionMasked();
        if (action == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            final boolean handled = super.onHoverEvent(ev);
            if (action == 9 && !handled) {
                this.mEatingHover = true;
            }
        }
        if (action == 10 || action == 3) {
            this.mEatingHover = false;
        }
        return true;
    }
    
    private void measureChildConstrained(final View child, final int parentWidthSpec, final int widthUsed, final int parentHeightSpec, final int heightUsed, final int heightConstraint) {
        final ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams)child.getLayoutParams();
        final int childWidthSpec = getChildMeasureSpec(parentWidthSpec, this.getPaddingLeft() + this.getPaddingRight() + lp.leftMargin + lp.rightMargin + widthUsed, lp.width);
        int childHeightSpec = getChildMeasureSpec(parentHeightSpec, this.getPaddingTop() + this.getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed, lp.height);
        final int childHeightMode = View.MeasureSpec.getMode(childHeightSpec);
        if (childHeightMode != 1073741824 && heightConstraint >= 0) {
            final int size = (childHeightMode != 0) ? Math.min(View.MeasureSpec.getSize(childHeightSpec), heightConstraint) : heightConstraint;
            childHeightSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        child.measure(childWidthSpec, childHeightSpec);
    }
    
    private int measureChildCollapseMargins(final View child, final int parentWidthMeasureSpec, final int widthUsed, final int parentHeightMeasureSpec, final int heightUsed, final int[] collapsingMargins) {
        final ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams)child.getLayoutParams();
        final int leftDiff = lp.leftMargin - collapsingMargins[0];
        final int rightDiff = lp.rightMargin - collapsingMargins[1];
        final int leftMargin = Math.max(0, leftDiff);
        final int rightMargin = Math.max(0, rightDiff);
        final int hMargins = leftMargin + rightMargin;
        collapsingMargins[0] = Math.max(0, -leftDiff);
        collapsingMargins[1] = Math.max(0, -rightDiff);
        final int childWidthMeasureSpec = getChildMeasureSpec(parentWidthMeasureSpec, this.getPaddingLeft() + this.getPaddingRight() + hMargins + widthUsed, lp.width);
        final int childHeightMeasureSpec = getChildMeasureSpec(parentHeightMeasureSpec, this.getPaddingTop() + this.getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed, lp.height);
        child.measure(childWidthMeasureSpec, childHeightMeasureSpec);
        return child.getMeasuredWidth() + hMargins;
    }
    
    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (this.shouldLayout(child) && child.getMeasuredWidth() > 0 && child.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }
    
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        int width = 0;
        int height = 0;
        int childState = 0;
        final int[] collapsingMargins = this.mTempMargins;
        int marginStartIndex;
        int marginEndIndex;
        if (ViewUtils.isLayoutRtl((View)this)) {
            marginStartIndex = 1;
            marginEndIndex = 0;
        }
        else {
            marginStartIndex = 0;
            marginEndIndex = 1;
        }
        int navWidth = 0;
        if (this.shouldLayout((View)this.mNavButtonView)) {
            this.measureChildConstrained((View)this.mNavButtonView, widthMeasureSpec, width, heightMeasureSpec, 0, this.mMaxButtonHeight);
            navWidth = this.mNavButtonView.getMeasuredWidth() + this.getHorizontalMargins((View)this.mNavButtonView);
            height = Math.max(height, this.mNavButtonView.getMeasuredHeight() + this.getVerticalMargins((View)this.mNavButtonView));
            childState = View.combineMeasuredStates(childState, this.mNavButtonView.getMeasuredState());
        }
        if (this.shouldLayout((View)this.mCollapseButtonView)) {
            this.measureChildConstrained((View)this.mCollapseButtonView, widthMeasureSpec, width, heightMeasureSpec, 0, this.mMaxButtonHeight);
            navWidth = this.mCollapseButtonView.getMeasuredWidth() + this.getHorizontalMargins((View)this.mCollapseButtonView);
            height = Math.max(height, this.mCollapseButtonView.getMeasuredHeight() + this.getVerticalMargins((View)this.mCollapseButtonView));
            childState = View.combineMeasuredStates(childState, this.mCollapseButtonView.getMeasuredState());
        }
        final int contentInsetStart = this.getCurrentContentInsetStart();
        width += Math.max(contentInsetStart, navWidth);
        collapsingMargins[marginStartIndex] = Math.max(0, contentInsetStart - navWidth);
        int menuWidth = 0;
        if (this.shouldLayout((View)this.mMenuView)) {
            this.measureChildConstrained((View)this.mMenuView, widthMeasureSpec, width, heightMeasureSpec, 0, this.mMaxButtonHeight);
            menuWidth = this.mMenuView.getMeasuredWidth() + this.getHorizontalMargins((View)this.mMenuView);
            height = Math.max(height, this.mMenuView.getMeasuredHeight() + this.getVerticalMargins((View)this.mMenuView));
            childState = View.combineMeasuredStates(childState, this.mMenuView.getMeasuredState());
        }
        final int contentInsetEnd = this.getCurrentContentInsetEnd();
        width += Math.max(contentInsetEnd, menuWidth);
        collapsingMargins[marginEndIndex] = Math.max(0, contentInsetEnd - menuWidth);
        if (this.shouldLayout(this.mExpandedActionView)) {
            width += this.measureChildCollapseMargins(this.mExpandedActionView, widthMeasureSpec, width, heightMeasureSpec, 0, collapsingMargins);
            height = Math.max(height, this.mExpandedActionView.getMeasuredHeight() + this.getVerticalMargins(this.mExpandedActionView));
            childState = View.combineMeasuredStates(childState, this.mExpandedActionView.getMeasuredState());
        }
        if (this.shouldLayout((View)this.mLogoView)) {
            width += this.measureChildCollapseMargins((View)this.mLogoView, widthMeasureSpec, width, heightMeasureSpec, 0, collapsingMargins);
            height = Math.max(height, this.mLogoView.getMeasuredHeight() + this.getVerticalMargins((View)this.mLogoView));
            childState = View.combineMeasuredStates(childState, this.mLogoView.getMeasuredState());
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final LayoutParams lp = (LayoutParams)child.getLayoutParams();
            if (lp.mViewType == 0) {
                if (this.shouldLayout(child)) {
                    width += this.measureChildCollapseMargins(child, widthMeasureSpec, width, heightMeasureSpec, 0, collapsingMargins);
                    height = Math.max(height, child.getMeasuredHeight() + this.getVerticalMargins(child));
                    childState = View.combineMeasuredStates(childState, child.getMeasuredState());
                }
            }
        }
        int titleWidth = 0;
        int titleHeight = 0;
        final int titleVertMargins = this.mTitleMarginTop + this.mTitleMarginBottom;
        final int titleHorizMargins = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (this.shouldLayout((View)this.mTitleTextView)) {
            titleWidth = this.measureChildCollapseMargins((View)this.mTitleTextView, widthMeasureSpec, width + titleHorizMargins, heightMeasureSpec, titleVertMargins, collapsingMargins);
            titleWidth = this.mTitleTextView.getMeasuredWidth() + this.getHorizontalMargins((View)this.mTitleTextView);
            titleHeight = this.mTitleTextView.getMeasuredHeight() + this.getVerticalMargins((View)this.mTitleTextView);
            childState = View.combineMeasuredStates(childState, this.mTitleTextView.getMeasuredState());
        }
        if (this.shouldLayout((View)this.mSubtitleTextView)) {
            titleWidth = Math.max(titleWidth, this.measureChildCollapseMargins((View)this.mSubtitleTextView, widthMeasureSpec, width + titleHorizMargins, heightMeasureSpec, titleHeight + titleVertMargins, collapsingMargins));
            titleHeight += this.mSubtitleTextView.getMeasuredHeight() + this.getVerticalMargins((View)this.mSubtitleTextView);
            childState = View.combineMeasuredStates(childState, this.mSubtitleTextView.getMeasuredState());
        }
        width += titleWidth;
        height = Math.max(height, titleHeight);
        width += this.getPaddingLeft() + this.getPaddingRight();
        height += this.getPaddingTop() + this.getPaddingBottom();
        final int measuredWidth = View.resolveSizeAndState(Math.max(width, this.getSuggestedMinimumWidth()), widthMeasureSpec, childState & 0xFF000000);
        final int measuredHeight = View.resolveSizeAndState(Math.max(height, this.getSuggestedMinimumHeight()), heightMeasureSpec, childState << 16);
        this.setMeasuredDimension(measuredWidth, this.shouldCollapse() ? 0 : measuredHeight);
    }
    
    protected void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {
        final boolean isRtl = this.getLayoutDirection() == 1;
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        int left = paddingLeft;
        int right = width - paddingRight;
        final int[] collapsingMargins = this.mTempMargins;
        collapsingMargins[0] = (collapsingMargins[1] = 0);
        final int minHeight = ViewCompat.getMinimumHeight((View)this);
        final int alignmentHeight = (minHeight >= 0) ? Math.min(minHeight, b - t) : 0;
        if (this.shouldLayout((View)this.mNavButtonView)) {
            if (isRtl) {
                right = this.layoutChildRight((View)this.mNavButtonView, right, collapsingMargins, alignmentHeight);
            }
            else {
                left = this.layoutChildLeft((View)this.mNavButtonView, left, collapsingMargins, alignmentHeight);
            }
        }
        if (this.shouldLayout((View)this.mCollapseButtonView)) {
            if (isRtl) {
                right = this.layoutChildRight((View)this.mCollapseButtonView, right, collapsingMargins, alignmentHeight);
            }
            else {
                left = this.layoutChildLeft((View)this.mCollapseButtonView, left, collapsingMargins, alignmentHeight);
            }
        }
        if (this.shouldLayout((View)this.mMenuView)) {
            if (isRtl) {
                left = this.layoutChildLeft((View)this.mMenuView, left, collapsingMargins, alignmentHeight);
            }
            else {
                right = this.layoutChildRight((View)this.mMenuView, right, collapsingMargins, alignmentHeight);
            }
        }
        final int contentInsetLeft = this.getCurrentContentInsetLeft();
        final int contentInsetRight = this.getCurrentContentInsetRight();
        collapsingMargins[0] = Math.max(0, contentInsetLeft - left);
        collapsingMargins[1] = Math.max(0, contentInsetRight - (width - paddingRight - right));
        left = Math.max(left, contentInsetLeft);
        right = Math.min(right, width - paddingRight - contentInsetRight);
        if (this.shouldLayout(this.mExpandedActionView)) {
            if (isRtl) {
                right = this.layoutChildRight(this.mExpandedActionView, right, collapsingMargins, alignmentHeight);
            }
            else {
                left = this.layoutChildLeft(this.mExpandedActionView, left, collapsingMargins, alignmentHeight);
            }
        }
        if (this.shouldLayout((View)this.mLogoView)) {
            if (isRtl) {
                right = this.layoutChildRight((View)this.mLogoView, right, collapsingMargins, alignmentHeight);
            }
            else {
                left = this.layoutChildLeft((View)this.mLogoView, left, collapsingMargins, alignmentHeight);
            }
        }
        final boolean layoutTitle = this.shouldLayout((View)this.mTitleTextView);
        final boolean layoutSubtitle = this.shouldLayout((View)this.mSubtitleTextView);
        int titleHeight = 0;
        if (layoutTitle) {
            final LayoutParams lp = (LayoutParams)this.mTitleTextView.getLayoutParams();
            titleHeight += lp.topMargin + this.mTitleTextView.getMeasuredHeight() + lp.bottomMargin;
        }
        if (layoutSubtitle) {
            final LayoutParams lp = (LayoutParams)this.mSubtitleTextView.getLayoutParams();
            titleHeight += lp.topMargin + this.mSubtitleTextView.getMeasuredHeight() + lp.bottomMargin;
        }
        if (layoutTitle || layoutSubtitle) {
            final View topChild = (View)(layoutTitle ? this.mTitleTextView : this.mSubtitleTextView);
            final View bottomChild = (View)(layoutSubtitle ? this.mSubtitleTextView : this.mTitleTextView);
            final LayoutParams toplp = (LayoutParams)topChild.getLayoutParams();
            final LayoutParams bottomlp = (LayoutParams)bottomChild.getLayoutParams();
            final boolean titleHasWidth = (layoutTitle && this.mTitleTextView.getMeasuredWidth() > 0) || (layoutSubtitle && this.mSubtitleTextView.getMeasuredWidth() > 0);
            int titleTop = 0;
            switch (this.mGravity & 0x70) {
                case 48: {
                    titleTop = this.getPaddingTop() + toplp.topMargin + this.mTitleMarginTop;
                    break;
                }
                default: {
                    final int space = height - paddingTop - paddingBottom;
                    int spaceAbove = (space - titleHeight) / 2;
                    if (spaceAbove < toplp.topMargin + this.mTitleMarginTop) {
                        spaceAbove = toplp.topMargin + this.mTitleMarginTop;
                    }
                    else {
                        final int spaceBelow = height - paddingBottom - titleHeight - spaceAbove - paddingTop;
                        if (spaceBelow < toplp.bottomMargin + this.mTitleMarginBottom) {
                            spaceAbove = Math.max(0, spaceAbove - (bottomlp.bottomMargin + this.mTitleMarginBottom - spaceBelow));
                        }
                    }
                    titleTop = paddingTop + spaceAbove;
                    break;
                }
                case 80: {
                    titleTop = height - paddingBottom - bottomlp.bottomMargin - this.mTitleMarginBottom - titleHeight;
                    break;
                }
            }
            if (isRtl) {
                final int rd = (titleHasWidth ? this.mTitleMarginStart : 0) - collapsingMargins[1];
                right -= Math.max(0, rd);
                collapsingMargins[1] = Math.max(0, -rd);
                int titleRight = right;
                int subtitleRight = right;
                if (layoutTitle) {
                    final LayoutParams lp2 = (LayoutParams)this.mTitleTextView.getLayoutParams();
                    final int titleLeft = titleRight - this.mTitleTextView.getMeasuredWidth();
                    final int titleBottom = titleTop + this.mTitleTextView.getMeasuredHeight();
                    this.mTitleTextView.layout(titleLeft, titleTop, titleRight, titleBottom);
                    titleRight = titleLeft - this.mTitleMarginEnd;
                    titleTop = titleBottom + lp2.bottomMargin;
                }
                if (layoutSubtitle) {
                    final LayoutParams lp2 = (LayoutParams)this.mSubtitleTextView.getLayoutParams();
                    titleTop += lp2.topMargin;
                    final int subtitleLeft = subtitleRight - this.mSubtitleTextView.getMeasuredWidth();
                    final int subtitleBottom = titleTop + this.mSubtitleTextView.getMeasuredHeight();
                    this.mSubtitleTextView.layout(subtitleLeft, titleTop, subtitleRight, subtitleBottom);
                    subtitleRight -= this.mTitleMarginEnd;
                    titleTop = subtitleBottom + lp2.bottomMargin;
                }
                if (titleHasWidth) {
                    right = Math.min(titleRight, subtitleRight);
                }
            }
            else {
                final int ld = (titleHasWidth ? this.mTitleMarginStart : 0) - collapsingMargins[0];
                left += Math.max(0, ld);
                collapsingMargins[0] = Math.max(0, -ld);
                int titleLeft2 = left;
                int subtitleLeft2 = left;
                if (layoutTitle) {
                    final LayoutParams lp2 = (LayoutParams)this.mTitleTextView.getLayoutParams();
                    final int titleRight2 = titleLeft2 + this.mTitleTextView.getMeasuredWidth();
                    final int titleBottom = titleTop + this.mTitleTextView.getMeasuredHeight();
                    this.mTitleTextView.layout(titleLeft2, titleTop, titleRight2, titleBottom);
                    titleLeft2 = titleRight2 + this.mTitleMarginEnd;
                    titleTop = titleBottom + lp2.bottomMargin;
                }
                if (layoutSubtitle) {
                    final LayoutParams lp2 = (LayoutParams)this.mSubtitleTextView.getLayoutParams();
                    titleTop += lp2.topMargin;
                    final int subtitleRight2 = subtitleLeft2 + this.mSubtitleTextView.getMeasuredWidth();
                    final int subtitleBottom = titleTop + this.mSubtitleTextView.getMeasuredHeight();
                    this.mSubtitleTextView.layout(subtitleLeft2, titleTop, subtitleRight2, subtitleBottom);
                    subtitleLeft2 = subtitleRight2 + this.mTitleMarginEnd;
                    titleTop = subtitleBottom + lp2.bottomMargin;
                }
                if (titleHasWidth) {
                    left = Math.max(titleLeft2, subtitleLeft2);
                }
            }
        }
        this.addCustomViewsWithGravity((List<View>)this.mTempViews, 3);
        for (int leftViewsCount = this.mTempViews.size(), i = 0; i < leftViewsCount; ++i) {
            left = this.layoutChildLeft((View)this.mTempViews.get(i), left, collapsingMargins, alignmentHeight);
        }
        this.addCustomViewsWithGravity((List<View>)this.mTempViews, 5);
        for (int rightViewsCount = this.mTempViews.size(), j = 0; j < rightViewsCount; ++j) {
            right = this.layoutChildRight((View)this.mTempViews.get(j), right, collapsingMargins, alignmentHeight);
        }
        this.addCustomViewsWithGravity((List<View>)this.mTempViews, 1);
        final int centerViewsWidth = this.getViewListMeasuredWidth((List<View>)this.mTempViews, collapsingMargins);
        final int parentCenter = paddingLeft + (width - paddingLeft - paddingRight) / 2;
        final int halfCenterViewsWidth = centerViewsWidth / 2;
        int centerLeft = parentCenter - halfCenterViewsWidth;
        final int centerRight = centerLeft + centerViewsWidth;
        if (centerLeft < left) {
            centerLeft = left;
        }
        else if (centerRight > right) {
            centerLeft -= centerRight - right;
        }
        for (int centerViewsCount = this.mTempViews.size(), k = 0; k < centerViewsCount; ++k) {
            centerLeft = this.layoutChildLeft((View)this.mTempViews.get(k), centerLeft, collapsingMargins, alignmentHeight);
        }
        this.mTempViews.clear();
    }
    
    private int getViewListMeasuredWidth(final List<View> views, final int[] collapsingMargins) {
        int collapseLeft = collapsingMargins[0];
        int collapseRight = collapsingMargins[1];
        int width = 0;
        for (int count = views.size(), i = 0; i < count; ++i) {
            final View v = (View)views.get(i);
            final LayoutParams lp = (LayoutParams)v.getLayoutParams();
            final int l = lp.leftMargin - collapseLeft;
            final int r = lp.rightMargin - collapseRight;
            final int leftMargin = Math.max(0, l);
            final int rightMargin = Math.max(0, r);
            collapseLeft = Math.max(0, -l);
            collapseRight = Math.max(0, -r);
            width += leftMargin + v.getMeasuredWidth() + rightMargin;
        }
        return width;
    }
    
    private int layoutChildLeft(final View child, int left, final int[] collapsingMargins, final int alignmentHeight) {
        final LayoutParams lp = (LayoutParams)child.getLayoutParams();
        final int l = lp.leftMargin - collapsingMargins[0];
        left += Math.max(0, l);
        collapsingMargins[0] = Math.max(0, -l);
        final int top = this.getChildTop(child, alignmentHeight);
        final int childWidth = child.getMeasuredWidth();
        child.layout(left, top, left + childWidth, top + child.getMeasuredHeight());
        left += childWidth + lp.rightMargin;
        return left;
    }
    
    private int layoutChildRight(final View child, int right, final int[] collapsingMargins, final int alignmentHeight) {
        final LayoutParams lp = (LayoutParams)child.getLayoutParams();
        final int r = lp.rightMargin - collapsingMargins[1];
        right -= Math.max(0, r);
        collapsingMargins[1] = Math.max(0, -r);
        final int top = this.getChildTop(child, alignmentHeight);
        final int childWidth = child.getMeasuredWidth();
        child.layout(right - childWidth, top, right, top + child.getMeasuredHeight());
        right -= childWidth + lp.leftMargin;
        return right;
    }
    
    private int getChildTop(final View child, final int alignmentHeight) {
        final LayoutParams lp = (LayoutParams)child.getLayoutParams();
        final int childHeight = child.getMeasuredHeight();
        final int alignmentOffset = (alignmentHeight > 0) ? ((childHeight - alignmentHeight) / 2) : 0;
        switch (this.getChildVerticalGravity(lp.gravity)) {
            case 48: {
                return this.getPaddingTop() - alignmentOffset;
            }
            case 80: {
                return this.getHeight() - this.getPaddingBottom() - childHeight - lp.bottomMargin - alignmentOffset;
            }
            default: {
                final int paddingTop = this.getPaddingTop();
                final int paddingBottom = this.getPaddingBottom();
                final int height = this.getHeight();
                final int space = height - paddingTop - paddingBottom;
                int spaceAbove = (space - childHeight) / 2;
                if (spaceAbove < lp.topMargin) {
                    spaceAbove = lp.topMargin;
                }
                else {
                    final int spaceBelow = height - paddingBottom - childHeight - spaceAbove - paddingTop;
                    if (spaceBelow < lp.bottomMargin) {
                        spaceAbove = Math.max(0, spaceAbove - (lp.bottomMargin - spaceBelow));
                    }
                }
                return paddingTop + spaceAbove;
            }
        }
    }
    
    private int getChildVerticalGravity(final int gravity) {
        final int vgrav = gravity & 0x70;
        switch (vgrav) {
            case 16:
            case 48:
            case 80: {
                return vgrav;
            }
            default: {
                return this.mGravity & 0x70;
            }
        }
    }
    
    private void addCustomViewsWithGravity(final List<View> views, final int gravity) {
        final boolean isRtl = this.getLayoutDirection() == 1;
        final int childCount = this.getChildCount();
        final int absGrav = GravityCompat.getAbsoluteGravity(gravity, this.getLayoutDirection());
        views.clear();
        if (isRtl) {
            for (int i = childCount - 1; i >= 0; --i) {
                final View child = this.getChildAt(i);
                final LayoutParams lp = (LayoutParams)child.getLayoutParams();
                if (lp.mViewType == 0 && this.shouldLayout(child) && this.getChildHorizontalGravity(lp.gravity) == absGrav) {
                    views.add((Object)child);
                }
            }
        }
        else {
            for (int i = 0; i < childCount; ++i) {
                final View child = this.getChildAt(i);
                final LayoutParams lp = (LayoutParams)child.getLayoutParams();
                if (lp.mViewType == 0 && this.shouldLayout(child) && this.getChildHorizontalGravity(lp.gravity) == absGrav) {
                    views.add((Object)child);
                }
            }
        }
    }
    
    private int getChildHorizontalGravity(final int gravity) {
        final int ld = this.getLayoutDirection();
        final int absGrav = GravityCompat.getAbsoluteGravity(gravity, ld);
        final int hGrav = absGrav & 0x7;
        switch (hGrav) {
            case 1:
            case 3:
            case 5: {
                return hGrav;
            }
            default: {
                return (ld == 1) ? 5 : 3;
            }
        }
    }
    
    private boolean shouldLayout(final View view) {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }
    
    private int getHorizontalMargins(final View v) {
        final ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams)v.getLayoutParams();
        return mlp.getMarginStart() + mlp.getMarginEnd();
    }
    
    private int getVerticalMargins(final View v) {
        final ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams)v.getLayoutParams();
        return mlp.topMargin + mlp.bottomMargin;
    }
    
    public LayoutParams generateLayoutParams(final AttributeSet attrs) {
        return new LayoutParams(this.getContext(), attrs);
    }
    
    protected LayoutParams generateLayoutParams(final ViewGroup.LayoutParams p) {
        if (p instanceof LayoutParams) {
            return new LayoutParams((LayoutParams)p);
        }
        if (p instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams)p);
        }
        if (p instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams)p);
        }
        return new LayoutParams(p);
    }
    
    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }
    
    protected boolean checkLayoutParams(final ViewGroup.LayoutParams p) {
        return super.checkLayoutParams(p) && p instanceof LayoutParams;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public DecorToolbar getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new ToolbarWidgetWrapper(this, true);
        }
        return this.mWrapper;
    }
    
    void removeChildrenForExpandedActionView() {
        final int childCount = this.getChildCount();
        for (int i = childCount - 1; i >= 0; --i) {
            final View child = this.getChildAt(i);
            final LayoutParams lp = (LayoutParams)child.getLayoutParams();
            if (lp.mViewType != 2 && child != this.mMenuView) {
                this.removeViewAt(i);
                this.mHiddenViews.add((Object)child);
            }
        }
    }
    
    void addChildrenForExpandedActionView() {
        final int count = this.mHiddenViews.size();
        for (int i = count - 1; i >= 0; --i) {
            this.addView((View)this.mHiddenViews.get(i));
        }
        this.mHiddenViews.clear();
    }
    
    private boolean isChildOrHidden(final View child) {
        return child.getParent() == this || this.mHiddenViews.contains((Object)child);
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setCollapsible(final boolean collapsible) {
        this.mCollapsible = collapsible;
        this.requestLayout();
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setMenuCallbacks(final MenuPresenter.Callback pcb, final MenuBuilder.Callback mcb) {
        this.mActionMenuPresenterCallback = pcb;
        this.mMenuBuilderCallback = mcb;
        if (this.mMenuView != null) {
            this.mMenuView.setMenuCallbacks(pcb, mcb);
        }
    }
    
    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new RtlSpacingHelper();
        }
    }
    
    @VisibleForTesting
    @Nullable
    final TextView getTitleTextView() {
        return this.mTitleTextView;
    }
    
    @VisibleForTesting
    @Nullable
    final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }
    
    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }
    
    Context getPopupContext() {
        return this.mPopupContext;
    }
    
    private ArrayList<MenuItem> getCurrentMenuItems() {
        final ArrayList<MenuItem> menuItems = (ArrayList<MenuItem>)new ArrayList();
        final Menu menu = this.getMenu();
        for (int i = 0; i < menu.size(); ++i) {
            menuItems.add((Object)menu.getItem(i));
        }
        return menuItems;
    }
    
    private void onCreateMenu() {
        final Menu menu = this.getMenu();
        final ArrayList<MenuItem> oldMenuItemList = this.getCurrentMenuItems();
        this.mMenuHostHelper.onCreateMenu(menu, this.getMenuInflater());
        final ArrayList<MenuItem> newMenuItemList = this.getCurrentMenuItems();
        newMenuItemList.removeAll((Collection)oldMenuItemList);
        this.mProvidedMenuItems = newMenuItemList;
    }
    
    @MainThread
    public void addMenuProvider(@NonNull final MenuProvider provider) {
        this.mMenuHostHelper.addMenuProvider(provider);
    }
    
    @MainThread
    public void addMenuProvider(@NonNull final MenuProvider provider, @NonNull final LifecycleOwner owner) {
        this.mMenuHostHelper.addMenuProvider(provider, owner);
    }
    
    @MainThread
    @SuppressLint({ "LambdaLast" })
    public void addMenuProvider(@NonNull final MenuProvider provider, @NonNull final LifecycleOwner owner, @NonNull final Lifecycle.State state) {
        this.mMenuHostHelper.addMenuProvider(provider, owner, state);
    }
    
    @MainThread
    public void removeMenuProvider(@NonNull final MenuProvider provider) {
        this.mMenuHostHelper.removeMenuProvider(provider);
    }
    
    @MainThread
    public void invalidateMenu() {
        for (final MenuItem menuItem : this.mProvidedMenuItems) {
            this.getMenu().removeItem(menuItem.getItemId());
        }
        this.onCreateMenu();
    }
    
    void updateBackInvokedCallbackState() {
        if (Build.VERSION.SDK_INT >= 33) {
            final OnBackInvokedDispatcher currentDispatcher = Api33Impl.findOnBackInvokedDispatcher((View)this);
            final boolean shouldBeRegistered = this.hasExpandedActionView() && currentDispatcher != null && this.isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (shouldBeRegistered && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = Api33Impl.newOnBackInvokedCallback(this::collapseActionView);
                }
                Api33Impl.tryRegisterOnBackInvokedCallback(currentDispatcher, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = currentDispatcher;
            }
            else if (!shouldBeRegistered && this.mBackInvokedDispatcher != null) {
                Api33Impl.tryUnregisterOnBackInvokedCallback(this.mBackInvokedDispatcher, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = null;
            }
        }
    }
    
    public static class LayoutParams extends ActionBar.LayoutParams
    {
        static final int CUSTOM = 0;
        static final int SYSTEM = 1;
        static final int EXPANDED = 2;
        int mViewType;
        
        public LayoutParams(@NonNull final Context c, final AttributeSet attrs) {
            super(c, attrs);
            this.mViewType = 0;
        }
        
        public LayoutParams(final int width, final int height) {
            super(width, height);
            this.mViewType = 0;
            this.gravity = 8388627;
        }
        
        public LayoutParams(final int width, final int height, final int gravity) {
            super(width, height);
            this.mViewType = 0;
            this.gravity = gravity;
        }
        
        public LayoutParams(final int gravity) {
            this(-2, -1, gravity);
        }
        
        public LayoutParams(final LayoutParams source) {
            super(source);
            this.mViewType = 0;
            this.mViewType = source.mViewType;
        }
        
        public LayoutParams(final ActionBar.LayoutParams source) {
            super(source);
            this.mViewType = 0;
        }
        
        public LayoutParams(final ViewGroup.MarginLayoutParams source) {
            super((ViewGroup.LayoutParams)source);
            this.mViewType = 0;
            this.copyMarginsFromCompat(source);
        }
        
        public LayoutParams(final ViewGroup.LayoutParams source) {
            super(source);
            this.mViewType = 0;
        }
        
        void copyMarginsFromCompat(final ViewGroup.MarginLayoutParams source) {
            this.leftMargin = source.leftMargin;
            this.topMargin = source.topMargin;
            this.rightMargin = source.rightMargin;
            this.bottomMargin = source.bottomMargin;
        }
    }
    
    public static class SavedState extends AbsSavedState
    {
        int expandedMenuItemId;
        boolean isOverflowOpen;
        public static final Parcelable.Creator<SavedState> CREATOR;
        
        public SavedState(final Parcel source) {
            this(source, null);
        }
        
        public SavedState(final Parcel source, final ClassLoader loader) {
            super(source, loader);
            this.expandedMenuItemId = source.readInt();
            this.isOverflowOpen = (source.readInt() != 0);
        }
        
        public SavedState(final Parcelable superState) {
            super(superState);
        }
        
        public void writeToParcel(final Parcel out, final int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.expandedMenuItemId);
            out.writeInt((int)(this.isOverflowOpen ? 1 : 0));
        }
        
        static {
            CREATOR = (Parcelable.Creator)new Parcelable.ClassLoaderCreator<SavedState>() {
                public SavedState createFromParcel(final Parcel in, final ClassLoader loader) {
                    return new SavedState(in, loader);
                }
                
                public SavedState createFromParcel(final Parcel in) {
                    return new SavedState(in, null);
                }
                
                public SavedState[] newArray(final int size) {
                    return new SavedState[size];
                }
            };
        }
    }
    
    private class ExpandedActionViewMenuPresenter implements MenuPresenter
    {
        MenuBuilder mMenu;
        MenuItemImpl mCurrentExpandedItem;
        
        ExpandedActionViewMenuPresenter() {
        }
        
        @Override
        public void initForMenu(final Context context, final MenuBuilder menu) {
            if (this.mMenu != null && this.mCurrentExpandedItem != null) {
                this.mMenu.collapseItemActionView(this.mCurrentExpandedItem);
            }
            this.mMenu = menu;
        }
        
        @Override
        public MenuView getMenuView(final ViewGroup root) {
            return null;
        }
        
        @Override
        public void updateMenuView(final boolean cleared) {
            if (this.mCurrentExpandedItem != null) {
                boolean found = false;
                if (this.mMenu != null) {
                    for (int count = this.mMenu.size(), i = 0; i < count; ++i) {
                        final MenuItem item = this.mMenu.getItem(i);
                        if (item == this.mCurrentExpandedItem) {
                            found = true;
                            break;
                        }
                    }
                }
                if (!found) {
                    this.collapseItemActionView(this.mMenu, this.mCurrentExpandedItem);
                }
            }
        }
        
        @Override
        public void setCallback(final Callback cb) {
        }
        
        @Override
        public boolean onSubMenuSelected(final SubMenuBuilder subMenu) {
            return false;
        }
        
        @Override
        public void onCloseMenu(final MenuBuilder menu, final boolean allMenusAreClosing) {
        }
        
        @Override
        public boolean flagActionItems() {
            return false;
        }
        
        @Override
        public boolean expandItemActionView(final MenuBuilder menu, final MenuItemImpl item) {
            Toolbar.this.ensureCollapseButtonView();
            final ViewParent collapseButtonParent = Toolbar.this.mCollapseButtonView.getParent();
            if (collapseButtonParent != Toolbar.this) {
                if (collapseButtonParent instanceof ViewGroup) {
                    ((ViewGroup)collapseButtonParent).removeView((View)Toolbar.this.mCollapseButtonView);
                }
                Toolbar.this.addView((View)Toolbar.this.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = item.getActionView();
            this.mCurrentExpandedItem = item;
            final ViewParent expandedActionParent = Toolbar.this.mExpandedActionView.getParent();
            if (expandedActionParent != Toolbar.this) {
                if (expandedActionParent instanceof ViewGroup) {
                    ((ViewGroup)expandedActionParent).removeView(Toolbar.this.mExpandedActionView);
                }
                final LayoutParams lp = Toolbar.this.generateDefaultLayoutParams();
                lp.gravity = (0x800003 | (Toolbar.this.mButtonGravity & 0x70));
                lp.mViewType = 2;
                Toolbar.this.mExpandedActionView.setLayoutParams((ViewGroup.LayoutParams)lp);
                Toolbar.this.addView(Toolbar.this.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            item.setActionViewExpanded(true);
            if (Toolbar.this.mExpandedActionView instanceof CollapsibleActionView) {
                ((CollapsibleActionView)Toolbar.this.mExpandedActionView).onActionViewExpanded();
            }
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }
        
        @Override
        public boolean collapseItemActionView(final MenuBuilder menu, final MenuItemImpl item) {
            if (Toolbar.this.mExpandedActionView instanceof CollapsibleActionView) {
                ((CollapsibleActionView)Toolbar.this.mExpandedActionView).onActionViewCollapsed();
            }
            Toolbar.this.removeView(Toolbar.this.mExpandedActionView);
            Toolbar.this.removeView((View)Toolbar.this.mCollapseButtonView);
            Toolbar.this.mExpandedActionView = null;
            Toolbar.this.addChildrenForExpandedActionView();
            this.mCurrentExpandedItem = null;
            Toolbar.this.requestLayout();
            item.setActionViewExpanded(false);
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }
        
        @Override
        public int getId() {
            return 0;
        }
        
        @Override
        public Parcelable onSaveInstanceState() {
            return null;
        }
        
        @Override
        public void onRestoreInstanceState(final Parcelable state) {
        }
    }
    
    @RequiresApi(33)
    static class Api33Impl
    {
        private Api33Impl() {
        }
        
        @DoNotInline
        static void tryRegisterOnBackInvokedCallback(@NonNull final Object dispatcherObj, @NonNull final Object callback) {
            final OnBackInvokedDispatcher dispatcher = (OnBackInvokedDispatcher)dispatcherObj;
            dispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback)callback);
        }
        
        @DoNotInline
        static void tryUnregisterOnBackInvokedCallback(@NonNull final Object dispatcherObj, @NonNull final Object callbackObj) {
            final OnBackInvokedDispatcher dispatcher = (OnBackInvokedDispatcher)dispatcherObj;
            dispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback)callbackObj);
        }
        
        @Nullable
        @DoNotInline
        static OnBackInvokedDispatcher findOnBackInvokedDispatcher(@NonNull final View view) {
            return view.findOnBackInvokedDispatcher();
        }
        
        @NonNull
        @DoNotInline
        static OnBackInvokedCallback newOnBackInvokedCallback(@NonNull final Runnable action) {
            Objects.requireNonNull((Object)action);
            return action::run;
        }
    }
    
    public interface OnMenuItemClickListener
    {
        boolean onMenuItemClick(final MenuItem p0);
    }
}
