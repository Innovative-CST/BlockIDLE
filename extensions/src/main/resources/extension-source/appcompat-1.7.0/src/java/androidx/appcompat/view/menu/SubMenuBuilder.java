package androidx.appcompat.view.menu;

import android.view.View;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import android.view.MenuItem;
import android.view.Menu;
import android.content.Context;
import androidx.annotation.RestrictTo;
import android.view.SubMenu;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class SubMenuBuilder extends MenuBuilder implements SubMenu
{
    private MenuBuilder mParentMenu;
    private MenuItemImpl mItem;
    
    public SubMenuBuilder(final Context context, final MenuBuilder parentMenu, final MenuItemImpl item) {
        super(context);
        this.mParentMenu = parentMenu;
        this.mItem = item;
    }
    
    @Override
    public void setQwertyMode(final boolean isQwerty) {
        this.mParentMenu.setQwertyMode(isQwerty);
    }
    
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }
    
    @Override
    public void setShortcutsVisible(final boolean shortcutsVisible) {
        this.mParentMenu.setShortcutsVisible(shortcutsVisible);
    }
    
    @Override
    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }
    
    public Menu getParentMenu() {
        return (Menu)this.mParentMenu;
    }
    
    public MenuItem getItem() {
        return (MenuItem)this.mItem;
    }
    
    @Override
    public void setCallback(final Callback callback) {
        this.mParentMenu.setCallback(callback);
    }
    
    @Override
    public MenuBuilder getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }
    
    @Override
    boolean dispatchMenuItemSelected(@NonNull final MenuBuilder menu, @NonNull final MenuItem item) {
        return super.dispatchMenuItemSelected(menu, item) || this.mParentMenu.dispatchMenuItemSelected(menu, item);
    }
    
    public SubMenu setIcon(final Drawable icon) {
        this.mItem.setIcon(icon);
        return (SubMenu)this;
    }
    
    public SubMenu setIcon(final int iconRes) {
        this.mItem.setIcon(iconRes);
        return (SubMenu)this;
    }
    
    public SubMenu setHeaderIcon(final Drawable icon) {
        return (SubMenu)super.setHeaderIconInt(icon);
    }
    
    public SubMenu setHeaderIcon(final int iconRes) {
        return (SubMenu)super.setHeaderIconInt(iconRes);
    }
    
    public SubMenu setHeaderTitle(final CharSequence title) {
        return (SubMenu)super.setHeaderTitleInt(title);
    }
    
    public SubMenu setHeaderTitle(final int titleRes) {
        return (SubMenu)super.setHeaderTitleInt(titleRes);
    }
    
    public SubMenu setHeaderView(final View view) {
        return (SubMenu)super.setHeaderViewInt(view);
    }
    
    @Override
    public boolean expandItemActionView(final MenuItemImpl item) {
        return this.mParentMenu.expandItemActionView(item);
    }
    
    @Override
    public boolean collapseItemActionView(final MenuItemImpl item) {
        return this.mParentMenu.collapseItemActionView(item);
    }
    
    public String getActionViewStatesKey() {
        final int itemId = (this.mItem != null) ? this.mItem.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + ":" + itemId;
    }
    
    @Override
    public void setGroupDividerEnabled(final boolean groupDividerEnabled) {
        this.mParentMenu.setGroupDividerEnabled(groupDividerEnabled);
    }
    
    @Override
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }
}
