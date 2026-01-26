package androidx.appcompat.view.menu;

import androidx.core.graphics.drawable.DrawableCompat;
import androidx.annotation.Nullable;
import android.view.ActionProvider;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.annotation.NonNull;
import android.view.KeyEvent;
import android.view.SubMenu;
import android.view.ContextMenu;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import android.view.MenuItem;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenuItem;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class ActionMenuItem implements SupportMenuItem
{
    private final int mId;
    private final int mGroup;
    private final int mOrdering;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;
    private Intent mIntent;
    private char mShortcutNumericChar;
    private int mShortcutNumericModifiers;
    private char mShortcutAlphabeticChar;
    private int mShortcutAlphabeticModifiers;
    private Drawable mIconDrawable;
    private Context mContext;
    private MenuItem.OnMenuItemClickListener mClickListener;
    private CharSequence mContentDescription;
    private CharSequence mTooltipText;
    private ColorStateList mIconTintList;
    private PorterDuff.Mode mIconTintMode;
    private boolean mHasIconTint;
    private boolean mHasIconTintMode;
    private int mFlags;
    private static final int CHECKABLE = 1;
    private static final int CHECKED = 2;
    private static final int EXCLUSIVE = 4;
    private static final int HIDDEN = 8;
    private static final int ENABLED = 16;
    
    public ActionMenuItem(final Context context, final int group, final int id, final int categoryOrder, final int ordering, final CharSequence title) {
        this.mShortcutNumericModifiers = 4096;
        this.mShortcutAlphabeticModifiers = 4096;
        this.mIconTintList = null;
        this.mIconTintMode = null;
        this.mHasIconTint = false;
        this.mHasIconTintMode = false;
        this.mFlags = 16;
        this.mContext = context;
        this.mId = id;
        this.mGroup = group;
        this.mOrdering = ordering;
        this.mTitle = title;
    }
    
    public char getAlphabeticShortcut() {
        return this.mShortcutAlphabeticChar;
    }
    
    public int getAlphabeticModifiers() {
        return this.mShortcutAlphabeticModifiers;
    }
    
    public int getGroupId() {
        return this.mGroup;
    }
    
    public Drawable getIcon() {
        return this.mIconDrawable;
    }
    
    public Intent getIntent() {
        return this.mIntent;
    }
    
    public int getItemId() {
        return this.mId;
    }
    
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }
    
    public char getNumericShortcut() {
        return this.mShortcutNumericChar;
    }
    
    public int getNumericModifiers() {
        return this.mShortcutNumericModifiers;
    }
    
    public int getOrder() {
        return this.mOrdering;
    }
    
    public SubMenu getSubMenu() {
        return null;
    }
    
    public CharSequence getTitle() {
        return this.mTitle;
    }
    
    public CharSequence getTitleCondensed() {
        return (this.mTitleCondensed != null) ? this.mTitleCondensed : this.mTitle;
    }
    
    public boolean hasSubMenu() {
        return false;
    }
    
    public boolean isCheckable() {
        return (this.mFlags & 0x1) != 0x0;
    }
    
    public boolean isChecked() {
        return (this.mFlags & 0x2) != 0x0;
    }
    
    public boolean isEnabled() {
        return (this.mFlags & 0x10) != 0x0;
    }
    
    public boolean isVisible() {
        return (this.mFlags & 0x8) == 0x0;
    }
    
    public MenuItem setAlphabeticShortcut(final char alphaChar) {
        this.mShortcutAlphabeticChar = Character.toLowerCase(alphaChar);
        return (MenuItem)this;
    }
    
    @NonNull
    public MenuItem setAlphabeticShortcut(final char alphaChar, final int alphaModifiers) {
        this.mShortcutAlphabeticChar = Character.toLowerCase(alphaChar);
        this.mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(alphaModifiers);
        return (MenuItem)this;
    }
    
    public MenuItem setCheckable(final boolean checkable) {
        this.mFlags = ((this.mFlags & 0xFFFFFFFE) | (checkable ? 1 : 0));
        return (MenuItem)this;
    }
    
    public ActionMenuItem setExclusiveCheckable(final boolean exclusive) {
        this.mFlags = ((this.mFlags & 0xFFFFFFFB) | (exclusive ? 4 : 0));
        return this;
    }
    
    public MenuItem setChecked(final boolean checked) {
        this.mFlags = ((this.mFlags & 0xFFFFFFFD) | (checked ? 2 : 0));
        return (MenuItem)this;
    }
    
    public MenuItem setEnabled(final boolean enabled) {
        this.mFlags = ((this.mFlags & 0xFFFFFFEF) | (enabled ? 16 : 0));
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final Drawable icon) {
        this.mIconDrawable = icon;
        this.applyIconTint();
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final int iconRes) {
        this.mIconDrawable = ContextCompat.getDrawable(this.mContext, iconRes);
        this.applyIconTint();
        return (MenuItem)this;
    }
    
    public MenuItem setIntent(final Intent intent) {
        this.mIntent = intent;
        return (MenuItem)this;
    }
    
    public MenuItem setNumericShortcut(final char numericChar) {
        this.mShortcutNumericChar = numericChar;
        return (MenuItem)this;
    }
    
    @NonNull
    public MenuItem setNumericShortcut(final char numericChar, final int numericModifiers) {
        this.mShortcutNumericChar = numericChar;
        this.mShortcutNumericModifiers = KeyEvent.normalizeMetaState(numericModifiers);
        return (MenuItem)this;
    }
    
    public MenuItem setOnMenuItemClickListener(final MenuItem.OnMenuItemClickListener menuItemClickListener) {
        this.mClickListener = menuItemClickListener;
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char numericChar, final char alphaChar) {
        this.mShortcutNumericChar = numericChar;
        this.mShortcutAlphabeticChar = Character.toLowerCase(alphaChar);
        return (MenuItem)this;
    }
    
    @NonNull
    public MenuItem setShortcut(final char numericChar, final char alphaChar, final int numericModifiers, final int alphaModifiers) {
        this.mShortcutNumericChar = numericChar;
        this.mShortcutNumericModifiers = KeyEvent.normalizeMetaState(numericModifiers);
        this.mShortcutAlphabeticChar = Character.toLowerCase(alphaChar);
        this.mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(alphaModifiers);
        return (MenuItem)this;
    }
    
    public MenuItem setTitle(final CharSequence title) {
        this.mTitle = title;
        return (MenuItem)this;
    }
    
    public MenuItem setTitle(final int title) {
        this.mTitle = (CharSequence)this.mContext.getResources().getString(title);
        return (MenuItem)this;
    }
    
    public MenuItem setTitleCondensed(final CharSequence title) {
        this.mTitleCondensed = title;
        return (MenuItem)this;
    }
    
    public MenuItem setVisible(final boolean visible) {
        this.mFlags = ((this.mFlags & 0x8) | (visible ? 0 : 8));
        return (MenuItem)this;
    }
    
    public boolean invoke() {
        if (this.mClickListener != null && this.mClickListener.onMenuItemClick((MenuItem)this)) {
            return true;
        }
        if (this.mIntent != null) {
            this.mContext.startActivity(this.mIntent);
            return true;
        }
        return false;
    }
    
    public void setShowAsAction(final int show) {
    }
    
    public boolean requiresActionButton() {
        return true;
    }
    
    public boolean requiresOverflow() {
        return false;
    }
    
    @NonNull
    public SupportMenuItem setActionView(final View actionView) {
        throw new UnsupportedOperationException();
    }
    
    public View getActionView() {
        return null;
    }
    
    public MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }
    
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }
    
    @NonNull
    public SupportMenuItem setActionView(final int resId) {
        throw new UnsupportedOperationException();
    }
    
    public androidx.core.view.ActionProvider getSupportActionProvider() {
        return null;
    }
    
    @NonNull
    public SupportMenuItem setSupportActionProvider(final androidx.core.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }
    
    @NonNull
    public SupportMenuItem setShowAsActionFlags(final int actionEnum) {
        this.setShowAsAction(actionEnum);
        return (SupportMenuItem)this;
    }
    
    public boolean expandActionView() {
        return false;
    }
    
    public boolean collapseActionView() {
        return false;
    }
    
    public boolean isActionViewExpanded() {
        return false;
    }
    
    public MenuItem setOnActionExpandListener(final MenuItem.OnActionExpandListener listener) {
        throw new UnsupportedOperationException();
    }
    
    @NonNull
    public SupportMenuItem setContentDescription(final CharSequence contentDescription) {
        this.mContentDescription = contentDescription;
        return (SupportMenuItem)this;
    }
    
    public CharSequence getContentDescription() {
        return this.mContentDescription;
    }
    
    @NonNull
    public SupportMenuItem setTooltipText(final CharSequence tooltipText) {
        this.mTooltipText = tooltipText;
        return (SupportMenuItem)this;
    }
    
    public CharSequence getTooltipText() {
        return this.mTooltipText;
    }
    
    @NonNull
    public MenuItem setIconTintList(@Nullable final ColorStateList iconTintList) {
        this.mIconTintList = iconTintList;
        this.mHasIconTint = true;
        this.applyIconTint();
        return (MenuItem)this;
    }
    
    public ColorStateList getIconTintList() {
        return this.mIconTintList;
    }
    
    @NonNull
    public MenuItem setIconTintMode(final PorterDuff.Mode iconTintMode) {
        this.mIconTintMode = iconTintMode;
        this.mHasIconTintMode = true;
        this.applyIconTint();
        return (MenuItem)this;
    }
    
    public PorterDuff.Mode getIconTintMode() {
        return this.mIconTintMode;
    }
    
    private void applyIconTint() {
        if (this.mIconDrawable != null && (this.mHasIconTint || this.mHasIconTintMode)) {
            this.mIconDrawable = DrawableCompat.wrap(this.mIconDrawable);
            this.mIconDrawable = this.mIconDrawable.mutate();
            if (this.mHasIconTint) {
                DrawableCompat.setTintList(this.mIconDrawable, this.mIconTintList);
            }
            if (this.mHasIconTintMode) {
                DrawableCompat.setTintMode(this.mIconDrawable, this.mIconTintMode);
            }
        }
    }
}
