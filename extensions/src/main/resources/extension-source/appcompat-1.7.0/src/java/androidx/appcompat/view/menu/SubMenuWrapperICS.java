package androidx.appcompat.view.menu;

import android.view.MenuItem;
import android.view.View;
import android.graphics.drawable.Drawable;
import androidx.core.internal.view.SupportMenu;
import android.content.Context;
import androidx.core.internal.view.SupportSubMenu;
import androidx.annotation.RestrictTo;
import android.view.SubMenu;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
class SubMenuWrapperICS extends MenuWrapperICS implements SubMenu
{
    private final SupportSubMenu mSubMenu;
    
    SubMenuWrapperICS(final Context context, final SupportSubMenu subMenu) {
        super(context, (SupportMenu)subMenu);
        this.mSubMenu = subMenu;
    }
    
    public SubMenu setHeaderTitle(final int titleRes) {
        this.mSubMenu.setHeaderTitle(titleRes);
        return (SubMenu)this;
    }
    
    public SubMenu setHeaderTitle(final CharSequence title) {
        this.mSubMenu.setHeaderTitle(title);
        return (SubMenu)this;
    }
    
    public SubMenu setHeaderIcon(final int iconRes) {
        this.mSubMenu.setHeaderIcon(iconRes);
        return (SubMenu)this;
    }
    
    public SubMenu setHeaderIcon(final Drawable icon) {
        this.mSubMenu.setHeaderIcon(icon);
        return (SubMenu)this;
    }
    
    public SubMenu setHeaderView(final View view) {
        this.mSubMenu.setHeaderView(view);
        return (SubMenu)this;
    }
    
    public void clearHeader() {
        this.mSubMenu.clearHeader();
    }
    
    public SubMenu setIcon(final int iconRes) {
        this.mSubMenu.setIcon(iconRes);
        return (SubMenu)this;
    }
    
    public SubMenu setIcon(final Drawable icon) {
        this.mSubMenu.setIcon(icon);
        return (SubMenu)this;
    }
    
    public MenuItem getItem() {
        return this.getMenuItemWrapper(this.mSubMenu.getItem());
    }
}
