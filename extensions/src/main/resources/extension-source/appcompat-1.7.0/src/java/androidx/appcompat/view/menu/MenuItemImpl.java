package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import android.view.SubMenu;
import android.content.res.Resources;
import androidx.appcompat.R;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import android.view.KeyEvent;
import android.view.ViewDebug;
import android.content.ActivityNotFoundException;
import android.util.Log;
import android.view.ContextMenu;
import androidx.core.view.ActionProvider;
import android.view.View;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import android.view.MenuItem;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenuItem;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public final class MenuItemImpl implements SupportMenuItem
{
    private static final String TAG = "MenuItemImpl";
    private static final int SHOW_AS_ACTION_MASK = 3;
    private final int mId;
    private final int mGroup;
    private final int mCategoryOrder;
    private final int mOrdering;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;
    private Intent mIntent;
    private char mShortcutNumericChar;
    private int mShortcutNumericModifiers;
    private char mShortcutAlphabeticChar;
    private int mShortcutAlphabeticModifiers;
    private Drawable mIconDrawable;
    private int mIconResId;
    MenuBuilder mMenu;
    private SubMenuBuilder mSubMenu;
    private Runnable mItemCallback;
    private MenuItem.OnMenuItemClickListener mClickListener;
    private CharSequence mContentDescription;
    private CharSequence mTooltipText;
    private ColorStateList mIconTintList;
    private PorterDuff.Mode mIconTintMode;
    private boolean mHasIconTint;
    private boolean mHasIconTintMode;
    private boolean mNeedToApplyIconTint;
    private int mFlags;
    private static final int CHECKABLE = 1;
    private static final int CHECKED = 2;
    private static final int EXCLUSIVE = 4;
    private static final int HIDDEN = 8;
    private static final int ENABLED = 16;
    private static final int IS_ACTION = 32;
    private int mShowAsAction;
    private View mActionView;
    private ActionProvider mActionProvider;
    private MenuItem.OnActionExpandListener mOnActionExpandListener;
    private boolean mIsActionViewExpanded;
    static final int NO_ICON = 0;
    private ContextMenu.ContextMenuInfo mMenuInfo;
    
    MenuItemImpl(final MenuBuilder menu, final int group, final int id, final int categoryOrder, final int ordering, final CharSequence title, final int showAsAction) {
        this.mShortcutNumericModifiers = 4096;
        this.mShortcutAlphabeticModifiers = 4096;
        this.mIconResId = 0;
        this.mIconTintList = null;
        this.mIconTintMode = null;
        this.mHasIconTint = false;
        this.mHasIconTintMode = false;
        this.mNeedToApplyIconTint = false;
        this.mFlags = 16;
        this.mShowAsAction = 0;
        this.mIsActionViewExpanded = false;
        this.mMenu = menu;
        this.mId = id;
        this.mGroup = group;
        this.mCategoryOrder = categoryOrder;
        this.mOrdering = ordering;
        this.mTitle = title;
        this.mShowAsAction = showAsAction;
    }
    
    public boolean invoke() {
        if (this.mClickListener != null && this.mClickListener.onMenuItemClick((MenuItem)this)) {
            return true;
        }
        if (this.mMenu.dispatchMenuItemSelected(this.mMenu, (MenuItem)this)) {
            return true;
        }
        if (this.mItemCallback != null) {
            this.mItemCallback.run();
            return true;
        }
        if (this.mIntent != null) {
            try {
                this.mMenu.getContext().startActivity(this.mIntent);
                return true;
            }
            catch (final ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", (Throwable)e);
            }
        }
        return this.mActionProvider != null && this.mActionProvider.onPerformDefaultAction();
    }
    
    public boolean isEnabled() {
        return (this.mFlags & 0x10) != 0x0;
    }
    
    public MenuItem setEnabled(final boolean enabled) {
        if (enabled) {
            this.mFlags |= 0x10;
        }
        else {
            this.mFlags &= 0xFFFFFFEF;
        }
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    public int getGroupId() {
        return this.mGroup;
    }
    
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.mId;
    }
    
    public int getOrder() {
        return this.mCategoryOrder;
    }
    
    public int getOrdering() {
        return this.mOrdering;
    }
    
    public Intent getIntent() {
        return this.mIntent;
    }
    
    public MenuItem setIntent(final Intent intent) {
        this.mIntent = intent;
        return (MenuItem)this;
    }
    
    Runnable getCallback() {
        return this.mItemCallback;
    }
    
    public MenuItem setCallback(final Runnable callback) {
        this.mItemCallback = callback;
        return (MenuItem)this;
    }
    
    public char getAlphabeticShortcut() {
        return this.mShortcutAlphabeticChar;
    }
    
    public MenuItem setAlphabeticShortcut(final char alphaChar) {
        if (this.mShortcutAlphabeticChar == alphaChar) {
            return (MenuItem)this;
        }
        this.mShortcutAlphabeticChar = Character.toLowerCase(alphaChar);
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    @NonNull
    public MenuItem setAlphabeticShortcut(final char alphaChar, final int alphaModifiers) {
        if (this.mShortcutAlphabeticChar == alphaChar && this.mShortcutAlphabeticModifiers == alphaModifiers) {
            return (MenuItem)this;
        }
        this.mShortcutAlphabeticChar = Character.toLowerCase(alphaChar);
        this.mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(alphaModifiers);
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    public int getAlphabeticModifiers() {
        return this.mShortcutAlphabeticModifiers;
    }
    
    public char getNumericShortcut() {
        return this.mShortcutNumericChar;
    }
    
    public int getNumericModifiers() {
        return this.mShortcutNumericModifiers;
    }
    
    public MenuItem setNumericShortcut(final char numericChar) {
        if (this.mShortcutNumericChar == numericChar) {
            return (MenuItem)this;
        }
        this.mShortcutNumericChar = numericChar;
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    @NonNull
    public MenuItem setNumericShortcut(final char numericChar, final int numericModifiers) {
        if (this.mShortcutNumericChar == numericChar && this.mShortcutNumericModifiers == numericModifiers) {
            return (MenuItem)this;
        }
        this.mShortcutNumericChar = numericChar;
        this.mShortcutNumericModifiers = KeyEvent.normalizeMetaState(numericModifiers);
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char numericChar, final char alphaChar) {
        this.mShortcutNumericChar = numericChar;
        this.mShortcutAlphabeticChar = Character.toLowerCase(alphaChar);
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    @NonNull
    public MenuItem setShortcut(final char numericChar, final char alphaChar, final int numericModifiers, final int alphaModifiers) {
        this.mShortcutNumericChar = numericChar;
        this.mShortcutNumericModifiers = KeyEvent.normalizeMetaState(numericModifiers);
        this.mShortcutAlphabeticChar = Character.toLowerCase(alphaChar);
        this.mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(alphaModifiers);
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    char getShortcut() {
        return this.mMenu.isQwertyMode() ? this.mShortcutAlphabeticChar : this.mShortcutNumericChar;
    }
    
    String getShortcutLabel() {
        final char shortcut = this.getShortcut();
        if (shortcut == '\0') {
            return "";
        }
        final Resources res = this.mMenu.getContext().getResources();
        final StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.mMenu.getContext()).hasPermanentMenuKey()) {
            sb.append(res.getString(R.string.abc_prepend_shortcut_label));
        }
        final int modifiers = this.mMenu.isQwertyMode() ? this.mShortcutAlphabeticModifiers : this.mShortcutNumericModifiers;
        appendModifier(sb, modifiers, 65536, res.getString(R.string.abc_menu_meta_shortcut_label));
        appendModifier(sb, modifiers, 4096, res.getString(R.string.abc_menu_ctrl_shortcut_label));
        appendModifier(sb, modifiers, 2, res.getString(R.string.abc_menu_alt_shortcut_label));
        appendModifier(sb, modifiers, 1, res.getString(R.string.abc_menu_shift_shortcut_label));
        appendModifier(sb, modifiers, 4, res.getString(R.string.abc_menu_sym_shortcut_label));
        appendModifier(sb, modifiers, 8, res.getString(R.string.abc_menu_function_shortcut_label));
        switch (shortcut) {
            case '\n': {
                sb.append(res.getString(R.string.abc_menu_enter_shortcut_label));
                break;
            }
            case '\b': {
                sb.append(res.getString(R.string.abc_menu_delete_shortcut_label));
                break;
            }
            case ' ': {
                sb.append(res.getString(R.string.abc_menu_space_shortcut_label));
                break;
            }
            default: {
                sb.append(shortcut);
                break;
            }
        }
        return sb.toString();
    }
    
    private static void appendModifier(final StringBuilder sb, final int modifiers, final int flag, final String label) {
        if ((modifiers & flag) == flag) {
            sb.append(label);
        }
    }
    
    boolean shouldShowShortcut() {
        return this.mMenu.isShortcutsVisible() && this.getShortcut() != '\0';
    }
    
    public SubMenu getSubMenu() {
        return (SubMenu)this.mSubMenu;
    }
    
    public boolean hasSubMenu() {
        return this.mSubMenu != null;
    }
    
    public void setSubMenu(final SubMenuBuilder subMenu) {
        (this.mSubMenu = subMenu).setHeaderTitle(this.getTitle());
    }
    
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.mTitle;
    }
    
    CharSequence getTitleForItemView(final MenuView.ItemView itemView) {
        return (itemView != null && itemView.prefersCondensedTitle()) ? this.getTitleCondensed() : this.getTitle();
    }
    
    public MenuItem setTitle(final CharSequence title) {
        this.mTitle = title;
        this.mMenu.onItemsChanged(false);
        if (this.mSubMenu != null) {
            this.mSubMenu.setHeaderTitle(title);
        }
        return (MenuItem)this;
    }
    
    public MenuItem setTitle(final int title) {
        return this.setTitle((CharSequence)this.mMenu.getContext().getString(title));
    }
    
    public CharSequence getTitleCondensed() {
        return (this.mTitleCondensed != null) ? this.mTitleCondensed : this.mTitle;
    }
    
    public MenuItem setTitleCondensed(CharSequence title) {
        this.mTitleCondensed = title;
        if (title == null) {
            title = this.mTitle;
        }
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    public Drawable getIcon() {
        if (this.mIconDrawable != null) {
            return this.applyIconTintIfNecessary(this.mIconDrawable);
        }
        if (this.mIconResId != 0) {
            final Drawable icon = AppCompatResources.getDrawable(this.mMenu.getContext(), this.mIconResId);
            this.mIconResId = 0;
            this.mIconDrawable = icon;
            return this.applyIconTintIfNecessary(icon);
        }
        return null;
    }
    
    public MenuItem setIcon(final Drawable icon) {
        this.mIconResId = 0;
        this.mIconDrawable = icon;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final int iconResId) {
        this.mIconDrawable = null;
        this.mIconResId = iconResId;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    @NonNull
    public MenuItem setIconTintList(@Nullable final ColorStateList iconTintList) {
        this.mIconTintList = iconTintList;
        this.mHasIconTint = true;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    public ColorStateList getIconTintList() {
        return this.mIconTintList;
    }
    
    @NonNull
    public MenuItem setIconTintMode(final PorterDuff.Mode iconTintMode) {
        this.mIconTintMode = iconTintMode;
        this.mHasIconTintMode = true;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return (MenuItem)this;
    }
    
    public PorterDuff.Mode getIconTintMode() {
        return this.mIconTintMode;
    }
    
    private Drawable applyIconTintIfNecessary(Drawable icon) {
        if (icon != null && this.mNeedToApplyIconTint && (this.mHasIconTint || this.mHasIconTintMode)) {
            icon = DrawableCompat.wrap(icon);
            icon = icon.mutate();
            if (this.mHasIconTint) {
                DrawableCompat.setTintList(icon, this.mIconTintList);
            }
            if (this.mHasIconTintMode) {
                DrawableCompat.setTintMode(icon, this.mIconTintMode);
            }
            this.mNeedToApplyIconTint = false;
        }
        return icon;
    }
    
    public boolean isCheckable() {
        return (this.mFlags & 0x1) == 0x1;
    }
    
    public MenuItem setCheckable(final boolean checkable) {
        final int oldFlags = this.mFlags;
        this.mFlags = ((this.mFlags & 0xFFFFFFFE) | (checkable ? 1 : 0));
        if (oldFlags != this.mFlags) {
            this.mMenu.onItemsChanged(false);
        }
        return (MenuItem)this;
    }
    
    public void setExclusiveCheckable(final boolean exclusive) {
        this.mFlags = ((this.mFlags & 0xFFFFFFFB) | (exclusive ? 4 : 0));
    }
    
    public boolean isExclusiveCheckable() {
        return (this.mFlags & 0x4) != 0x0;
    }
    
    public boolean isChecked() {
        return (this.mFlags & 0x2) == 0x2;
    }
    
    public MenuItem setChecked(final boolean checked) {
        if ((this.mFlags & 0x4) != 0x0) {
            this.mMenu.setExclusiveItemChecked((MenuItem)this);
        }
        else {
            this.setCheckedInt(checked);
        }
        return (MenuItem)this;
    }
    
    void setCheckedInt(final boolean checked) {
        final int oldFlags = this.mFlags;
        this.mFlags = ((this.mFlags & 0xFFFFFFFD) | (checked ? 2 : 0));
        if (oldFlags != this.mFlags) {
            this.mMenu.onItemsChanged(false);
        }
    }
    
    public boolean isVisible() {
        if (this.mActionProvider != null && this.mActionProvider.overridesItemVisibility()) {
            return (this.mFlags & 0x8) == 0x0 && this.mActionProvider.isVisible();
        }
        return (this.mFlags & 0x8) == 0x0;
    }
    
    boolean setVisibleInt(final boolean shown) {
        final int oldFlags = this.mFlags;
        this.mFlags = ((this.mFlags & 0xFFFFFFF7) | (shown ? 0 : 8));
        return oldFlags != this.mFlags;
    }
    
    public MenuItem setVisible(final boolean shown) {
        if (this.setVisibleInt(shown)) {
            this.mMenu.onItemVisibleChanged(this);
        }
        return (MenuItem)this;
    }
    
    public MenuItem setOnMenuItemClickListener(final MenuItem.OnMenuItemClickListener clickListener) {
        this.mClickListener = clickListener;
        return (MenuItem)this;
    }
    
    @Override
    public String toString() {
        return (this.mTitle != null) ? this.mTitle.toString() : null;
    }
    
    void setMenuInfo(final ContextMenu.ContextMenuInfo menuInfo) {
        this.mMenuInfo = menuInfo;
    }
    
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.mMenuInfo;
    }
    
    public void actionFormatChanged() {
        this.mMenu.onItemActionRequestChanged(this);
    }
    
    public boolean shouldShowIcon() {
        return this.mMenu.getOptionalIconsVisible();
    }
    
    public boolean isActionButton() {
        return (this.mFlags & 0x20) == 0x20;
    }
    
    public boolean requestsActionButton() {
        return (this.mShowAsAction & 0x1) == 0x1;
    }
    
    public boolean requiresActionButton() {
        return (this.mShowAsAction & 0x2) == 0x2;
    }
    
    public boolean requiresOverflow() {
        return !this.requiresActionButton() && !this.requestsActionButton();
    }
    
    public void setIsActionButton(final boolean isActionButton) {
        if (isActionButton) {
            this.mFlags |= 0x20;
        }
        else {
            this.mFlags &= 0xFFFFFFDF;
        }
    }
    
    public boolean showsTextAsAction() {
        return (this.mShowAsAction & 0x4) == 0x4;
    }
    
    public void setShowAsAction(final int actionEnum) {
        switch (actionEnum & 0x3) {
            case 0:
            case 1:
            case 2: {
                this.mShowAsAction = actionEnum;
                this.mMenu.onItemActionRequestChanged(this);
                return;
            }
            default: {
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            }
        }
    }
    
    @NonNull
    public SupportMenuItem setActionView(final View view) {
        this.mActionView = view;
        this.mActionProvider = null;
        if (view != null && view.getId() == -1 && this.mId > 0) {
            view.setId(this.mId);
        }
        this.mMenu.onItemActionRequestChanged(this);
        return (SupportMenuItem)this;
    }
    
    @NonNull
    public SupportMenuItem setActionView(final int resId) {
        final Context context = this.mMenu.getContext();
        final LayoutInflater inflater = LayoutInflater.from(context);
        this.setActionView(inflater.inflate(resId, (ViewGroup)new LinearLayout(context), false));
        return (SupportMenuItem)this;
    }
    
    public View getActionView() {
        if (this.mActionView != null) {
            return this.mActionView;
        }
        if (this.mActionProvider != null) {
            return this.mActionView = this.mActionProvider.onCreateActionView((MenuItem)this);
        }
        return null;
    }
    
    public MenuItem setActionProvider(final android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }
    
    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }
    
    public ActionProvider getSupportActionProvider() {
        return this.mActionProvider;
    }
    
    @NonNull
    public SupportMenuItem setSupportActionProvider(final ActionProvider actionProvider) {
        if (this.mActionProvider != null) {
            this.mActionProvider.reset();
        }
        this.mActionView = null;
        this.mActionProvider = actionProvider;
        this.mMenu.onItemsChanged(true);
        if (this.mActionProvider != null) {
            this.mActionProvider.setVisibilityListener((ActionProvider.VisibilityListener)new ActionProvider.VisibilityListener() {
                public void onActionProviderVisibilityChanged(final boolean isVisible) {
                    MenuItemImpl.this.mMenu.onItemVisibleChanged(MenuItemImpl.this);
                }
            });
        }
        return (SupportMenuItem)this;
    }
    
    @NonNull
    public SupportMenuItem setShowAsActionFlags(final int actionEnum) {
        this.setShowAsAction(actionEnum);
        return (SupportMenuItem)this;
    }
    
    public boolean expandActionView() {
        return this.hasCollapsibleActionView() && (this.mOnActionExpandListener == null || this.mOnActionExpandListener.onMenuItemActionExpand((MenuItem)this)) && this.mMenu.expandItemActionView(this);
    }
    
    public boolean collapseActionView() {
        return (this.mShowAsAction & 0x8) != 0x0 && (this.mActionView == null || ((this.mOnActionExpandListener == null || this.mOnActionExpandListener.onMenuItemActionCollapse((MenuItem)this)) && this.mMenu.collapseItemActionView(this)));
    }
    
    public boolean hasCollapsibleActionView() {
        if ((this.mShowAsAction & 0x8) != 0x0) {
            if (this.mActionView == null && this.mActionProvider != null) {
                this.mActionView = this.mActionProvider.onCreateActionView((MenuItem)this);
            }
            return this.mActionView != null;
        }
        return false;
    }
    
    public void setActionViewExpanded(final boolean isExpanded) {
        this.mIsActionViewExpanded = isExpanded;
        this.mMenu.onItemsChanged(false);
    }
    
    public boolean isActionViewExpanded() {
        return this.mIsActionViewExpanded;
    }
    
    public MenuItem setOnActionExpandListener(final MenuItem.OnActionExpandListener listener) {
        this.mOnActionExpandListener = listener;
        return (MenuItem)this;
    }
    
    @NonNull
    public SupportMenuItem setContentDescription(final CharSequence contentDescription) {
        this.mContentDescription = contentDescription;
        this.mMenu.onItemsChanged(false);
        return (SupportMenuItem)this;
    }
    
    public CharSequence getContentDescription() {
        return this.mContentDescription;
    }
    
    @NonNull
    public SupportMenuItem setTooltipText(final CharSequence tooltipText) {
        this.mTooltipText = tooltipText;
        this.mMenu.onItemsChanged(false);
        return (SupportMenuItem)this;
    }
    
    public CharSequence getTooltipText() {
        return this.mTooltipText;
    }
}
