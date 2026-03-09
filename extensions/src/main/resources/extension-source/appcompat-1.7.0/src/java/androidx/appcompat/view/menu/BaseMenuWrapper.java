package androidx.appcompat.view.menu;

import android.view.SubMenu;
import androidx.core.internal.view.SupportSubMenu;
import android.view.MenuItem;
import androidx.core.internal.view.SupportMenuItem;
import androidx.collection.SimpleArrayMap;
import android.content.Context;

abstract class BaseMenuWrapper
{
    final Context mContext;
    private SimpleArrayMap<SupportMenuItem, MenuItem> mMenuItems;
    private SimpleArrayMap<SupportSubMenu, SubMenu> mSubMenus;
    
    BaseMenuWrapper(final Context context) {
        this.mContext = context;
    }
    
    final MenuItem getMenuItemWrapper(final MenuItem menuItem) {
        if (menuItem instanceof SupportMenuItem) {
            final SupportMenuItem supportMenuItem = (SupportMenuItem)menuItem;
            if (this.mMenuItems == null) {
                this.mMenuItems = (SimpleArrayMap<SupportMenuItem, MenuItem>)new SimpleArrayMap();
            }
            MenuItem wrappedItem = (MenuItem)this.mMenuItems.get((Object)supportMenuItem);
            if (null == wrappedItem) {
                wrappedItem = (MenuItem)new MenuItemWrapperICS(this.mContext, supportMenuItem);
                this.mMenuItems.put((Object)supportMenuItem, (Object)wrappedItem);
            }
            return wrappedItem;
        }
        return menuItem;
    }
    
    final SubMenu getSubMenuWrapper(final SubMenu subMenu) {
        if (subMenu instanceof SupportSubMenu) {
            final SupportSubMenu supportSubMenu = (SupportSubMenu)subMenu;
            if (this.mSubMenus == null) {
                this.mSubMenus = (SimpleArrayMap<SupportSubMenu, SubMenu>)new SimpleArrayMap();
            }
            SubMenu wrappedMenu = (SubMenu)this.mSubMenus.get((Object)supportSubMenu);
            if (null == wrappedMenu) {
                wrappedMenu = (SubMenu)new SubMenuWrapperICS(this.mContext, supportSubMenu);
                this.mSubMenus.put((Object)supportSubMenu, (Object)wrappedMenu);
            }
            return wrappedMenu;
        }
        return subMenu;
    }
    
    final void internalClear() {
        if (this.mMenuItems != null) {
            this.mMenuItems.clear();
        }
        if (this.mSubMenus != null) {
            this.mSubMenus.clear();
        }
    }
    
    final void internalRemoveGroup(final int groupId) {
        if (this.mMenuItems == null) {
            return;
        }
        for (int i = 0; i < this.mMenuItems.size(); ++i) {
            if (((SupportMenuItem)this.mMenuItems.keyAt(i)).getGroupId() == groupId) {
                this.mMenuItems.removeAt(i);
                --i;
            }
        }
    }
    
    final void internalRemoveItem(final int id) {
        if (this.mMenuItems == null) {
            return;
        }
        for (int i = 0; i < this.mMenuItems.size(); ++i) {
            if (((SupportMenuItem)this.mMenuItems.keyAt(i)).getItemId() == id) {
                this.mMenuItems.removeAt(i);
                break;
            }
        }
    }
}
