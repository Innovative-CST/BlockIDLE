package androidx.appcompat.view.menu;

import android.view.KeyEvent;
import android.content.Intent;
import android.content.ComponentName;
import android.view.SubMenu;
import android.view.MenuItem;
import android.content.Context;
import androidx.core.internal.view.SupportMenu;
import androidx.annotation.RestrictTo;
import android.view.Menu;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class MenuWrapperICS extends BaseMenuWrapper implements Menu
{
    private final SupportMenu mWrappedObject;
    
    public MenuWrapperICS(final Context context, final SupportMenu object) {
        super(context);
        if (object == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.mWrappedObject = object;
    }
    
    public MenuItem add(final CharSequence title) {
        return this.getMenuItemWrapper(this.mWrappedObject.add(title));
    }
    
    public MenuItem add(final int titleRes) {
        return this.getMenuItemWrapper(this.mWrappedObject.add(titleRes));
    }
    
    public MenuItem add(final int groupId, final int itemId, final int order, final CharSequence title) {
        return this.getMenuItemWrapper(this.mWrappedObject.add(groupId, itemId, order, title));
    }
    
    public MenuItem add(final int groupId, final int itemId, final int order, final int titleRes) {
        return this.getMenuItemWrapper(this.mWrappedObject.add(groupId, itemId, order, titleRes));
    }
    
    public SubMenu addSubMenu(final CharSequence title) {
        return this.getSubMenuWrapper(this.mWrappedObject.addSubMenu(title));
    }
    
    public SubMenu addSubMenu(final int titleRes) {
        return this.getSubMenuWrapper(this.mWrappedObject.addSubMenu(titleRes));
    }
    
    public SubMenu addSubMenu(final int groupId, final int itemId, final int order, final CharSequence title) {
        return this.getSubMenuWrapper(this.mWrappedObject.addSubMenu(groupId, itemId, order, title));
    }
    
    public SubMenu addSubMenu(final int groupId, final int itemId, final int order, final int titleRes) {
        return this.getSubMenuWrapper(this.mWrappedObject.addSubMenu(groupId, itemId, order, titleRes));
    }
    
    public int addIntentOptions(final int groupId, final int itemId, final int order, final ComponentName caller, final Intent[] specifics, final Intent intent, final int flags, final MenuItem[] outSpecificItems) {
        MenuItem[] items = null;
        if (outSpecificItems != null) {
            items = new MenuItem[outSpecificItems.length];
        }
        final int result = this.mWrappedObject.addIntentOptions(groupId, itemId, order, caller, specifics, intent, flags, items);
        if (items != null) {
            for (int i = 0, z = items.length; i < z; ++i) {
                outSpecificItems[i] = this.getMenuItemWrapper(items[i]);
            }
        }
        return result;
    }
    
    public void removeItem(final int id) {
        this.internalRemoveItem(id);
        this.mWrappedObject.removeItem(id);
    }
    
    public void removeGroup(final int groupId) {
        this.internalRemoveGroup(groupId);
        this.mWrappedObject.removeGroup(groupId);
    }
    
    public void clear() {
        this.internalClear();
        this.mWrappedObject.clear();
    }
    
    public void setGroupCheckable(final int group, final boolean checkable, final boolean exclusive) {
        this.mWrappedObject.setGroupCheckable(group, checkable, exclusive);
    }
    
    public void setGroupVisible(final int group, final boolean visible) {
        this.mWrappedObject.setGroupVisible(group, visible);
    }
    
    public void setGroupEnabled(final int group, final boolean enabled) {
        this.mWrappedObject.setGroupEnabled(group, enabled);
    }
    
    public boolean hasVisibleItems() {
        return this.mWrappedObject.hasVisibleItems();
    }
    
    public MenuItem findItem(final int id) {
        return this.getMenuItemWrapper(this.mWrappedObject.findItem(id));
    }
    
    public int size() {
        return this.mWrappedObject.size();
    }
    
    public MenuItem getItem(final int index) {
        return this.getMenuItemWrapper(this.mWrappedObject.getItem(index));
    }
    
    public void close() {
        this.mWrappedObject.close();
    }
    
    public boolean performShortcut(final int keyCode, final KeyEvent event, final int flags) {
        return this.mWrappedObject.performShortcut(keyCode, event, flags);
    }
    
    public boolean isShortcutKey(final int keyCode, final KeyEvent event) {
        return this.mWrappedObject.isShortcutKey(keyCode, event);
    }
    
    public boolean performIdentifierAction(final int id, final int flags) {
        return this.mWrappedObject.performIdentifierAction(id, flags);
    }
    
    public void setQwertyMode(final boolean isQwerty) {
        this.mWrappedObject.setQwertyMode(isQwerty);
    }
}
