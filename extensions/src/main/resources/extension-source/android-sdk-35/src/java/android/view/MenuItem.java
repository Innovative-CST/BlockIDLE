package android.view;

import android.content.Intent;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

public interface MenuItem
{
    public static final int SHOW_AS_ACTION_ALWAYS = 2;
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;
    public static final int SHOW_AS_ACTION_NEVER = 0;
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
    
    int getItemId();
    
    int getGroupId();
    
    int getOrder();
    
    @NonNull
    MenuItem setTitle(@Nullable final CharSequence p0);
    
    @NonNull
    MenuItem setTitle(final int p0);
    
    @Nullable
    CharSequence getTitle();
    
    @NonNull
    MenuItem setTitleCondensed(@Nullable final CharSequence p0);
    
    @Nullable
    CharSequence getTitleCondensed();
    
    @NonNull
    MenuItem setIcon(@Nullable final Drawable p0);
    
    @NonNull
    MenuItem setIcon(final int p0);
    
    @Nullable
    Drawable getIcon();
    
    @NonNull
    default MenuItem setIconTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    default ColorStateList getIconTintList() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    default MenuItem setIconTintMode(@Nullable final PorterDuff.Mode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    default MenuItem setIconTintBlendMode(@Nullable final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    default PorterDuff.Mode getIconTintMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    default BlendMode getIconTintBlendMode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    MenuItem setIntent(@Nullable final Intent p0);
    
    @Nullable
    Intent getIntent();
    
    @NonNull
    MenuItem setShortcut(final char p0, final char p1);
    
    @NonNull
    default MenuItem setShortcut(final char numericChar, final char alphaChar, final int numericModifiers, final int alphaModifiers) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    MenuItem setNumericShortcut(final char p0);
    
    @NonNull
    default MenuItem setNumericShortcut(final char numericChar, final int numericModifiers) {
        throw new RuntimeException("Stub!");
    }
    
    char getNumericShortcut();
    
    default int getNumericModifiers() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    MenuItem setAlphabeticShortcut(final char p0);
    
    @NonNull
    default MenuItem setAlphabeticShortcut(final char alphaChar, final int alphaModifiers) {
        throw new RuntimeException("Stub!");
    }
    
    char getAlphabeticShortcut();
    
    default int getAlphabeticModifiers() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    MenuItem setCheckable(final boolean p0);
    
    boolean isCheckable();
    
    @NonNull
    MenuItem setChecked(final boolean p0);
    
    boolean isChecked();
    
    @NonNull
    MenuItem setVisible(final boolean p0);
    
    boolean isVisible();
    
    @NonNull
    MenuItem setEnabled(final boolean p0);
    
    boolean isEnabled();
    
    boolean hasSubMenu();
    
    @Nullable
    SubMenu getSubMenu();
    
    @NonNull
    MenuItem setOnMenuItemClickListener(@Nullable final OnMenuItemClickListener p0);
    
    @Nullable
    ContextMenu.ContextMenuInfo getMenuInfo();
    
    void setShowAsAction(final int p0);
    
    @NonNull
    MenuItem setShowAsActionFlags(final int p0);
    
    @NonNull
    MenuItem setActionView(@Nullable final View p0);
    
    @NonNull
    MenuItem setActionView(final int p0);
    
    @Nullable
    View getActionView();
    
    @NonNull
    MenuItem setActionProvider(@Nullable final ActionProvider p0);
    
    @Nullable
    ActionProvider getActionProvider();
    
    boolean expandActionView();
    
    boolean collapseActionView();
    
    boolean isActionViewExpanded();
    
    @NonNull
    MenuItem setOnActionExpandListener(@Nullable final OnActionExpandListener p0);
    
    @NonNull
    default MenuItem setContentDescription(@Nullable final CharSequence contentDescription) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    default CharSequence getContentDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    default MenuItem setTooltipText(@Nullable final CharSequence tooltipText) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    default CharSequence getTooltipText() {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnMenuItemClickListener
    {
        boolean onMenuItemClick(@NonNull final MenuItem p0);
    }
    
    public interface OnActionExpandListener
    {
        boolean onMenuItemActionExpand(@NonNull final MenuItem p0);
        
        boolean onMenuItemActionCollapse(@NonNull final MenuItem p0);
    }
}
