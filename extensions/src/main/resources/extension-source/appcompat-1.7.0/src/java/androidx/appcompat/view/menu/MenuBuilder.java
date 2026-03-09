package androidx.appcompat.view.menu;

import androidx.core.content.ContextCompat;
import java.util.Collection;
import androidx.core.view.ActionProvider;
import android.view.KeyCharacterMap;
import androidx.annotation.NonNull;
import androidx.core.view.ViewConfigurationCompat;
import android.view.ViewConfiguration;
import android.view.KeyEvent;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.ComponentName;
import android.view.SubMenu;
import android.view.MenuItem;
import android.os.Parcelable;
import android.util.SparseArray;
import android.os.Bundle;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import java.util.ArrayList;
import android.content.res.Resources;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenu;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class MenuBuilder implements SupportMenu
{
    private static final String TAG = "MenuBuilder";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final int[] sCategoryToOrder;
    private final Context mContext;
    private final Resources mResources;
    private boolean mQwertyMode;
    private boolean mShortcutsVisible;
    private Callback mCallback;
    private ArrayList<MenuItemImpl> mItems;
    private ArrayList<MenuItemImpl> mVisibleItems;
    private boolean mIsVisibleItemsStale;
    private ArrayList<MenuItemImpl> mActionItems;
    private ArrayList<MenuItemImpl> mNonActionItems;
    private boolean mIsActionItemsStale;
    private int mDefaultShowAsAction;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    CharSequence mHeaderTitle;
    Drawable mHeaderIcon;
    View mHeaderView;
    private boolean mPreventDispatchingItemsChanged;
    private boolean mItemsChangedWhileDispatchPrevented;
    private boolean mStructureChangedWhileDispatchPrevented;
    private boolean mOptionalIconsVisible;
    private boolean mIsClosing;
    private ArrayList<MenuItemImpl> mTempShortcutItemList;
    private CopyOnWriteArrayList<WeakReference<MenuPresenter>> mPresenters;
    private MenuItemImpl mExpandedItem;
    private boolean mGroupDividerEnabled;
    private boolean mOverrideVisibleItems;
    
    public MenuBuilder(final Context context) {
        this.mDefaultShowAsAction = 0;
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        this.mOptionalIconsVisible = false;
        this.mIsClosing = false;
        this.mTempShortcutItemList = (ArrayList<MenuItemImpl>)new ArrayList();
        this.mPresenters = (CopyOnWriteArrayList<WeakReference<MenuPresenter>>)new CopyOnWriteArrayList();
        this.mGroupDividerEnabled = false;
        this.mContext = context;
        this.mResources = context.getResources();
        this.mItems = (ArrayList<MenuItemImpl>)new ArrayList();
        this.mVisibleItems = (ArrayList<MenuItemImpl>)new ArrayList();
        this.mIsVisibleItemsStale = true;
        this.mActionItems = (ArrayList<MenuItemImpl>)new ArrayList();
        this.mNonActionItems = (ArrayList<MenuItemImpl>)new ArrayList();
        this.setShortcutsVisibleInner(this.mIsActionItemsStale = true);
    }
    
    public MenuBuilder setDefaultShowAsAction(final int defaultShowAsAction) {
        this.mDefaultShowAsAction = defaultShowAsAction;
        return this;
    }
    
    public void addMenuPresenter(final MenuPresenter presenter) {
        this.addMenuPresenter(presenter, this.mContext);
    }
    
    public void addMenuPresenter(final MenuPresenter presenter, final Context menuContext) {
        this.mPresenters.add((Object)new WeakReference((Object)presenter));
        presenter.initForMenu(menuContext, this);
        this.mIsActionItemsStale = true;
    }
    
    public void removeMenuPresenter(final MenuPresenter presenter) {
        for (final WeakReference<MenuPresenter> ref : this.mPresenters) {
            final MenuPresenter item = (MenuPresenter)ref.get();
            if (item == null || item == presenter) {
                this.mPresenters.remove((Object)ref);
            }
        }
    }
    
    private void dispatchPresenterUpdate(final boolean cleared) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        this.stopDispatchingItemsChanged();
        for (final WeakReference<MenuPresenter> ref : this.mPresenters) {
            final MenuPresenter presenter = (MenuPresenter)ref.get();
            if (presenter == null) {
                this.mPresenters.remove((Object)ref);
            }
            else {
                presenter.updateMenuView(cleared);
            }
        }
        this.startDispatchingItemsChanged();
    }
    
    private boolean dispatchSubMenuSelected(final SubMenuBuilder subMenu, final MenuPresenter preferredPresenter) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean result = false;
        if (preferredPresenter != null) {
            result = preferredPresenter.onSubMenuSelected(subMenu);
        }
        for (final WeakReference<MenuPresenter> ref : this.mPresenters) {
            final MenuPresenter presenter = (MenuPresenter)ref.get();
            if (presenter == null) {
                this.mPresenters.remove((Object)ref);
            }
            else {
                if (result) {
                    continue;
                }
                result = presenter.onSubMenuSelected(subMenu);
            }
        }
        return result;
    }
    
    private void dispatchSaveInstanceState(final Bundle outState) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        final SparseArray<Parcelable> presenterStates = (SparseArray<Parcelable>)new SparseArray();
        for (final WeakReference<MenuPresenter> ref : this.mPresenters) {
            final MenuPresenter presenter = (MenuPresenter)ref.get();
            if (presenter == null) {
                this.mPresenters.remove((Object)ref);
            }
            else {
                final int id = presenter.getId();
                if (id <= 0) {
                    continue;
                }
                final Parcelable state = presenter.onSaveInstanceState();
                if (state == null) {
                    continue;
                }
                presenterStates.put(id, (Object)state);
            }
        }
        outState.putSparseParcelableArray("android:menu:presenters", (SparseArray)presenterStates);
    }
    
    private void dispatchRestoreInstanceState(final Bundle state) {
        final SparseArray<Parcelable> presenterStates = (SparseArray<Parcelable>)state.getSparseParcelableArray("android:menu:presenters");
        if (presenterStates == null || this.mPresenters.isEmpty()) {
            return;
        }
        for (final WeakReference<MenuPresenter> ref : this.mPresenters) {
            final MenuPresenter presenter = (MenuPresenter)ref.get();
            if (presenter == null) {
                this.mPresenters.remove((Object)ref);
            }
            else {
                final int id = presenter.getId();
                if (id <= 0) {
                    continue;
                }
                final Parcelable parcel = (Parcelable)presenterStates.get(id);
                if (parcel == null) {
                    continue;
                }
                presenter.onRestoreInstanceState(parcel);
            }
        }
    }
    
    public void savePresenterStates(final Bundle outState) {
        this.dispatchSaveInstanceState(outState);
    }
    
    public void restorePresenterStates(final Bundle state) {
        this.dispatchRestoreInstanceState(state);
    }
    
    public void saveActionViewStates(final Bundle outStates) {
        SparseArray<Parcelable> viewStates = null;
        for (int itemCount = this.size(), i = 0; i < itemCount; ++i) {
            final MenuItem item = this.getItem(i);
            final View v = item.getActionView();
            if (v != null && v.getId() != -1) {
                if (viewStates == null) {
                    viewStates = (SparseArray<Parcelable>)new SparseArray();
                }
                v.saveHierarchyState((SparseArray)viewStates);
                if (item.isActionViewExpanded()) {
                    outStates.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                final SubMenuBuilder subMenu = (SubMenuBuilder)item.getSubMenu();
                subMenu.saveActionViewStates(outStates);
            }
        }
        if (viewStates != null) {
            outStates.putSparseParcelableArray(this.getActionViewStatesKey(), (SparseArray)viewStates);
        }
    }
    
    public void restoreActionViewStates(final Bundle states) {
        if (states == null) {
            return;
        }
        final SparseArray<Parcelable> viewStates = (SparseArray<Parcelable>)states.getSparseParcelableArray(this.getActionViewStatesKey());
        for (int itemCount = this.size(), i = 0; i < itemCount; ++i) {
            final MenuItem item = this.getItem(i);
            final View v = item.getActionView();
            if (v != null && v.getId() != -1) {
                v.restoreHierarchyState((SparseArray)viewStates);
            }
            if (item.hasSubMenu()) {
                final SubMenuBuilder subMenu = (SubMenuBuilder)item.getSubMenu();
                subMenu.restoreActionViewStates(states);
            }
        }
        final int expandedId = states.getInt("android:menu:expandedactionview");
        if (expandedId > 0) {
            final MenuItem itemToExpand = this.findItem(expandedId);
            if (itemToExpand != null) {
                itemToExpand.expandActionView();
            }
        }
    }
    
    protected String getActionViewStatesKey() {
        return "android:menu:actionviewstates";
    }
    
    public void setCallback(final Callback cb) {
        this.mCallback = cb;
    }
    
    protected MenuItem addInternal(final int group, final int id, final int categoryOrder, final CharSequence title) {
        final int ordering = getOrdering(categoryOrder);
        final MenuItemImpl item = this.createNewMenuItem(group, id, categoryOrder, ordering, title, this.mDefaultShowAsAction);
        if (this.mCurrentMenuInfo != null) {
            item.setMenuInfo(this.mCurrentMenuInfo);
        }
        this.mItems.add(findInsertIndex(this.mItems, ordering), (Object)item);
        this.onItemsChanged(true);
        return (MenuItem)item;
    }
    
    private MenuItemImpl createNewMenuItem(final int group, final int id, final int categoryOrder, final int ordering, final CharSequence title, final int defaultShowAsAction) {
        return new MenuItemImpl(this, group, id, categoryOrder, ordering, title, defaultShowAsAction);
    }
    
    public MenuItem add(final CharSequence title) {
        return this.addInternal(0, 0, 0, title);
    }
    
    public MenuItem add(final int titleRes) {
        return this.addInternal(0, 0, 0, (CharSequence)this.mResources.getString(titleRes));
    }
    
    public MenuItem add(final int group, final int id, final int categoryOrder, final CharSequence title) {
        return this.addInternal(group, id, categoryOrder, title);
    }
    
    public MenuItem add(final int group, final int id, final int categoryOrder, final int title) {
        return this.addInternal(group, id, categoryOrder, (CharSequence)this.mResources.getString(title));
    }
    
    public SubMenu addSubMenu(final CharSequence title) {
        return this.addSubMenu(0, 0, 0, title);
    }
    
    public SubMenu addSubMenu(final int titleRes) {
        return this.addSubMenu(0, 0, 0, (CharSequence)this.mResources.getString(titleRes));
    }
    
    public SubMenu addSubMenu(final int group, final int id, final int categoryOrder, final CharSequence title) {
        final MenuItemImpl item = (MenuItemImpl)this.addInternal(group, id, categoryOrder, title);
        final SubMenuBuilder subMenu = new SubMenuBuilder(this.mContext, this, item);
        item.setSubMenu(subMenu);
        return (SubMenu)subMenu;
    }
    
    public SubMenu addSubMenu(final int group, final int id, final int categoryOrder, final int title) {
        return this.addSubMenu(group, id, categoryOrder, (CharSequence)this.mResources.getString(title));
    }
    
    public void setGroupDividerEnabled(final boolean enabled) {
        this.mGroupDividerEnabled = enabled;
    }
    
    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }
    
    public int addIntentOptions(final int group, final int id, final int categoryOrder, final ComponentName caller, final Intent[] specifics, final Intent intent, final int flags, final MenuItem[] outSpecificItems) {
        final PackageManager pm = this.mContext.getPackageManager();
        final List<ResolveInfo> lri = (List<ResolveInfo>)pm.queryIntentActivityOptions(caller, specifics, intent, 0);
        final int N = (lri != null) ? lri.size() : 0;
        if ((flags & 0x1) == 0x0) {
            this.removeGroup(group);
        }
        for (int i = 0; i < N; ++i) {
            final ResolveInfo ri = (ResolveInfo)lri.get(i);
            final Intent rintent = new Intent((ri.specificIndex < 0) ? intent : specifics[ri.specificIndex]);
            rintent.setComponent(new ComponentName(ri.activityInfo.applicationInfo.packageName, ri.activityInfo.name));
            final MenuItem item = this.add(group, id, categoryOrder, ri.loadLabel(pm)).setIcon(ri.loadIcon(pm)).setIntent(rintent);
            if (outSpecificItems != null && ri.specificIndex >= 0) {
                outSpecificItems[ri.specificIndex] = item;
            }
        }
        return N;
    }
    
    public void removeItem(final int id) {
        this.removeItemAtInt(this.findItemIndex(id), true);
    }
    
    public void removeGroup(final int group) {
        final int i = this.findGroupIndex(group);
        if (i >= 0) {
            final int maxRemovable = this.mItems.size() - i;
            int numRemoved = 0;
            while (numRemoved++ < maxRemovable && ((MenuItemImpl)this.mItems.get(i)).getGroupId() == group) {
                this.removeItemAtInt(i, false);
            }
            this.onItemsChanged(true);
        }
    }
    
    private void removeItemAtInt(final int index, final boolean updateChildrenOnMenuViews) {
        if (index < 0 || index >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(index);
        if (updateChildrenOnMenuViews) {
            this.onItemsChanged(true);
        }
    }
    
    public void removeItemAt(final int index) {
        this.removeItemAtInt(index, true);
    }
    
    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        this.clear();
        this.clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        this.onItemsChanged(true);
    }
    
    public void clear() {
        if (this.mExpandedItem != null) {
            this.collapseItemActionView(this.mExpandedItem);
        }
        this.mItems.clear();
        this.onItemsChanged(true);
    }
    
    void setExclusiveItemChecked(final MenuItem item) {
        final int group = item.getGroupId();
        final int N = this.mItems.size();
        this.stopDispatchingItemsChanged();
        for (int i = 0; i < N; ++i) {
            final MenuItemImpl curItem = (MenuItemImpl)this.mItems.get(i);
            if (curItem.getGroupId() == group) {
                if (curItem.isExclusiveCheckable()) {
                    if (curItem.isCheckable()) {
                        curItem.setCheckedInt(curItem == item);
                    }
                }
            }
        }
        this.startDispatchingItemsChanged();
    }
    
    public void setGroupCheckable(final int group, final boolean checkable, final boolean exclusive) {
        for (int N = this.mItems.size(), i = 0; i < N; ++i) {
            final MenuItemImpl item = (MenuItemImpl)this.mItems.get(i);
            if (item.getGroupId() == group) {
                item.setExclusiveCheckable(exclusive);
                item.setCheckable(checkable);
            }
        }
    }
    
    public void setGroupVisible(final int group, final boolean visible) {
        final int N = this.mItems.size();
        boolean changedAtLeastOneItem = false;
        for (int i = 0; i < N; ++i) {
            final MenuItemImpl item = (MenuItemImpl)this.mItems.get(i);
            if (item.getGroupId() == group && item.setVisibleInt(visible)) {
                changedAtLeastOneItem = true;
            }
        }
        if (changedAtLeastOneItem) {
            this.onItemsChanged(true);
        }
    }
    
    public void setGroupEnabled(final int group, final boolean enabled) {
        for (int N = this.mItems.size(), i = 0; i < N; ++i) {
            final MenuItemImpl item = (MenuItemImpl)this.mItems.get(i);
            if (item.getGroupId() == group) {
                item.setEnabled(enabled);
            }
        }
    }
    
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        for (int size = this.size(), i = 0; i < size; ++i) {
            final MenuItemImpl item = (MenuItemImpl)this.mItems.get(i);
            if (item.isVisible()) {
                return true;
            }
        }
        return false;
    }
    
    public MenuItem findItem(final int id) {
        for (int size = this.size(), i = 0; i < size; ++i) {
            final MenuItemImpl item = (MenuItemImpl)this.mItems.get(i);
            if (item.getItemId() == id) {
                return (MenuItem)item;
            }
            if (item.hasSubMenu()) {
                final MenuItem possibleItem = item.getSubMenu().findItem(id);
                if (possibleItem != null) {
                    return possibleItem;
                }
            }
        }
        return null;
    }
    
    public int findItemIndex(final int id) {
        for (int size = this.size(), i = 0; i < size; ++i) {
            final MenuItemImpl item = (MenuItemImpl)this.mItems.get(i);
            if (item.getItemId() == id) {
                return i;
            }
        }
        return -1;
    }
    
    public int findGroupIndex(final int group) {
        return this.findGroupIndex(group, 0);
    }
    
    public int findGroupIndex(final int group, int start) {
        final int size = this.size();
        if (start < 0) {
            start = 0;
        }
        for (int i = start; i < size; ++i) {
            final MenuItemImpl item = (MenuItemImpl)this.mItems.get(i);
            if (item.getGroupId() == group) {
                return i;
            }
        }
        return -1;
    }
    
    public int size() {
        return this.mItems.size();
    }
    
    public MenuItem getItem(final int index) {
        return (MenuItem)this.mItems.get(index);
    }
    
    public boolean isShortcutKey(final int keyCode, final KeyEvent event) {
        return this.findItemWithShortcutForKey(keyCode, event) != null;
    }
    
    public void setQwertyMode(final boolean isQwerty) {
        this.mQwertyMode = isQwerty;
        this.onItemsChanged(false);
    }
    
    private static int getOrdering(final int categoryOrder) {
        final int index = (categoryOrder & 0xFFFF0000) >> 16;
        if (index < 0 || index >= MenuBuilder.sCategoryToOrder.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        return MenuBuilder.sCategoryToOrder[index] << 16 | (categoryOrder & 0xFFFF);
    }
    
    boolean isQwertyMode() {
        return this.mQwertyMode;
    }
    
    public void setShortcutsVisible(final boolean shortcutsVisible) {
        if (this.mShortcutsVisible == shortcutsVisible) {
            return;
        }
        this.setShortcutsVisibleInner(shortcutsVisible);
        this.onItemsChanged(false);
    }
    
    private void setShortcutsVisibleInner(final boolean shortcutsVisible) {
        this.mShortcutsVisible = (shortcutsVisible && this.mResources.getConfiguration().keyboard != 1 && ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration.get(this.mContext), this.mContext));
    }
    
    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }
    
    Resources getResources() {
        return this.mResources;
    }
    
    public Context getContext() {
        return this.mContext;
    }
    
    boolean dispatchMenuItemSelected(@NonNull final MenuBuilder menu, @NonNull final MenuItem item) {
        return this.mCallback != null && this.mCallback.onMenuItemSelected(menu, item);
    }
    
    public void changeMenuMode() {
        if (this.mCallback != null) {
            this.mCallback.onMenuModeChange(this);
        }
    }
    
    private static int findInsertIndex(final ArrayList<MenuItemImpl> items, final int ordering) {
        for (int i = items.size() - 1; i >= 0; --i) {
            final MenuItemImpl item = (MenuItemImpl)items.get(i);
            if (item.getOrdering() <= ordering) {
                return i + 1;
            }
        }
        return 0;
    }
    
    public boolean performShortcut(final int keyCode, final KeyEvent event, final int flags) {
        final MenuItemImpl item = this.findItemWithShortcutForKey(keyCode, event);
        boolean handled = false;
        if (item != null) {
            handled = this.performItemAction((MenuItem)item, flags);
        }
        if ((flags & 0x2) != 0x0) {
            this.close(true);
        }
        return handled;
    }
    
    void findItemsWithShortcutForKey(final List<MenuItemImpl> items, final int keyCode, final KeyEvent event) {
        final boolean qwerty = this.isQwertyMode();
        final int modifierState = event.getModifiers();
        final KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        final boolean isKeyCodeMapped = event.getKeyData(possibleChars);
        if (!isKeyCodeMapped && keyCode != 67) {
            return;
        }
        for (int N = this.mItems.size(), i = 0; i < N; ++i) {
            final MenuItemImpl item = (MenuItemImpl)this.mItems.get(i);
            if (item.hasSubMenu()) {
                ((MenuBuilder)item.getSubMenu()).findItemsWithShortcutForKey(items, keyCode, event);
            }
            final char shortcutChar = qwerty ? item.getAlphabeticShortcut() : item.getNumericShortcut();
            final int shortcutModifiers = qwerty ? item.getAlphabeticModifiers() : item.getNumericModifiers();
            final boolean isModifiersExactMatch = (modifierState & 0x1100F) == (shortcutModifiers & 0x1100F);
            if (isModifiersExactMatch && shortcutChar != '\0' && (shortcutChar == possibleChars.meta[0] || shortcutChar == possibleChars.meta[2] || (qwerty && shortcutChar == '\b' && keyCode == 67)) && item.isEnabled()) {
                items.add((Object)item);
            }
        }
    }
    
    MenuItemImpl findItemWithShortcutForKey(final int keyCode, final KeyEvent event) {
        final ArrayList<MenuItemImpl> items = this.mTempShortcutItemList;
        items.clear();
        this.findItemsWithShortcutForKey((List<MenuItemImpl>)items, keyCode, event);
        if (items.isEmpty()) {
            return null;
        }
        final int metaState = event.getMetaState();
        final KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        event.getKeyData(possibleChars);
        final int size = items.size();
        if (size == 1) {
            return (MenuItemImpl)items.get(0);
        }
        final boolean qwerty = this.isQwertyMode();
        for (int i = 0; i < size; ++i) {
            final MenuItemImpl item = (MenuItemImpl)items.get(i);
            final char shortcutChar = qwerty ? item.getAlphabeticShortcut() : item.getNumericShortcut();
            if ((shortcutChar == possibleChars.meta[0] && (metaState & 0x2) == 0x0) || (shortcutChar == possibleChars.meta[2] && (metaState & 0x2) != 0x0) || (qwerty && shortcutChar == '\b' && keyCode == 67)) {
                return item;
            }
        }
        return null;
    }
    
    public boolean performIdentifierAction(final int id, final int flags) {
        return this.performItemAction(this.findItem(id), flags);
    }
    
    public boolean performItemAction(final MenuItem item, final int flags) {
        return this.performItemAction(item, null, flags);
    }
    
    public boolean performItemAction(final MenuItem item, final MenuPresenter preferredPresenter, final int flags) {
        final MenuItemImpl itemImpl = (MenuItemImpl)item;
        if (itemImpl == null || !itemImpl.isEnabled()) {
            return false;
        }
        boolean invoked = itemImpl.invoke();
        final ActionProvider provider = itemImpl.getSupportActionProvider();
        final boolean providerHasSubMenu = provider != null && provider.hasSubMenu();
        if (itemImpl.hasCollapsibleActionView()) {
            invoked |= itemImpl.expandActionView();
            if (invoked) {
                this.close(true);
            }
        }
        else if (itemImpl.hasSubMenu() || providerHasSubMenu) {
            if ((flags & 0x4) == 0x0) {
                this.close(false);
            }
            if (!itemImpl.hasSubMenu()) {
                itemImpl.setSubMenu(new SubMenuBuilder(this.getContext(), this, itemImpl));
            }
            final SubMenuBuilder subMenu = (SubMenuBuilder)itemImpl.getSubMenu();
            if (providerHasSubMenu) {
                provider.onPrepareSubMenu((SubMenu)subMenu);
            }
            invoked |= this.dispatchSubMenuSelected(subMenu, preferredPresenter);
            if (!invoked) {
                this.close(true);
            }
        }
        else if ((flags & 0x1) == 0x0) {
            this.close(true);
        }
        return invoked;
    }
    
    public final void close(final boolean closeAllMenus) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        for (final WeakReference<MenuPresenter> ref : this.mPresenters) {
            final MenuPresenter presenter = (MenuPresenter)ref.get();
            if (presenter == null) {
                this.mPresenters.remove((Object)ref);
            }
            else {
                presenter.onCloseMenu(this, closeAllMenus);
            }
        }
        this.mIsClosing = false;
    }
    
    public void close() {
        this.close(true);
    }
    
    public void onItemsChanged(final boolean structureChanged) {
        if (!this.mPreventDispatchingItemsChanged) {
            if (structureChanged) {
                this.mIsVisibleItemsStale = true;
                this.mIsActionItemsStale = true;
            }
            this.dispatchPresenterUpdate(structureChanged);
        }
        else {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (structureChanged) {
                this.mStructureChangedWhileDispatchPrevented = true;
            }
        }
    }
    
    public boolean isDispatchingItemsChanged() {
        return !this.mPreventDispatchingItemsChanged;
    }
    
    public void stopDispatchingItemsChanged() {
        if (!this.mPreventDispatchingItemsChanged) {
            this.mPreventDispatchingItemsChanged = true;
            this.mItemsChangedWhileDispatchPrevented = false;
            this.mStructureChangedWhileDispatchPrevented = false;
        }
    }
    
    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            this.onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }
    
    void onItemVisibleChanged(final MenuItemImpl item) {
        this.onItemsChanged(this.mIsVisibleItemsStale = true);
    }
    
    void onItemActionRequestChanged(final MenuItemImpl item) {
        this.onItemsChanged(this.mIsActionItemsStale = true);
    }
    
    @NonNull
    public ArrayList<MenuItemImpl> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        for (int itemsSize = this.mItems.size(), i = 0; i < itemsSize; ++i) {
            final MenuItemImpl item = (MenuItemImpl)this.mItems.get(i);
            if (item.isVisible()) {
                this.mVisibleItems.add((Object)item);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }
    
    public void flagActionItems() {
        final ArrayList<MenuItemImpl> visibleItems = this.getVisibleItems();
        if (!this.mIsActionItemsStale) {
            return;
        }
        boolean flagged = false;
        for (final WeakReference<MenuPresenter> ref : this.mPresenters) {
            final MenuPresenter presenter = (MenuPresenter)ref.get();
            if (presenter == null) {
                this.mPresenters.remove((Object)ref);
            }
            else {
                flagged |= presenter.flagActionItems();
            }
        }
        if (flagged) {
            this.mActionItems.clear();
            this.mNonActionItems.clear();
            for (int itemsSize = visibleItems.size(), i = 0; i < itemsSize; ++i) {
                final MenuItemImpl item = (MenuItemImpl)visibleItems.get(i);
                if (item.isActionButton()) {
                    this.mActionItems.add((Object)item);
                }
                else {
                    this.mNonActionItems.add((Object)item);
                }
            }
        }
        else {
            this.mActionItems.clear();
            this.mNonActionItems.clear();
            this.mNonActionItems.addAll((Collection)this.getVisibleItems());
        }
        this.mIsActionItemsStale = false;
    }
    
    public ArrayList<MenuItemImpl> getActionItems() {
        this.flagActionItems();
        return this.mActionItems;
    }
    
    public ArrayList<MenuItemImpl> getNonActionItems() {
        this.flagActionItems();
        return this.mNonActionItems;
    }
    
    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        this.onItemsChanged(false);
    }
    
    private void setHeaderInternal(final int titleRes, final CharSequence title, final int iconRes, final Drawable icon, final View view) {
        final Resources r = this.getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        }
        else {
            if (titleRes > 0) {
                this.mHeaderTitle = r.getText(titleRes);
            }
            else if (title != null) {
                this.mHeaderTitle = title;
            }
            if (iconRes > 0) {
                this.mHeaderIcon = ContextCompat.getDrawable(this.getContext(), iconRes);
            }
            else if (icon != null) {
                this.mHeaderIcon = icon;
            }
            this.mHeaderView = null;
        }
        this.onItemsChanged(false);
    }
    
    protected MenuBuilder setHeaderTitleInt(final CharSequence title) {
        this.setHeaderInternal(0, title, 0, null, null);
        return this;
    }
    
    protected MenuBuilder setHeaderTitleInt(final int titleRes) {
        this.setHeaderInternal(titleRes, null, 0, null, null);
        return this;
    }
    
    protected MenuBuilder setHeaderIconInt(final Drawable icon) {
        this.setHeaderInternal(0, null, 0, icon, null);
        return this;
    }
    
    protected MenuBuilder setHeaderIconInt(final int iconRes) {
        this.setHeaderInternal(0, null, iconRes, null, null);
        return this;
    }
    
    protected MenuBuilder setHeaderViewInt(final View view) {
        this.setHeaderInternal(0, null, 0, null, view);
        return this;
    }
    
    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }
    
    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }
    
    public View getHeaderView() {
        return this.mHeaderView;
    }
    
    public MenuBuilder getRootMenu() {
        return this;
    }
    
    public void setCurrentMenuInfo(final ContextMenu.ContextMenuInfo menuInfo) {
        this.mCurrentMenuInfo = menuInfo;
    }
    
    public void setOptionalIconsVisible(final boolean visible) {
        this.mOptionalIconsVisible = visible;
    }
    
    boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }
    
    public boolean expandItemActionView(final MenuItemImpl item) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean expanded = false;
        this.stopDispatchingItemsChanged();
        for (final WeakReference<MenuPresenter> ref : this.mPresenters) {
            final MenuPresenter presenter = (MenuPresenter)ref.get();
            if (presenter == null) {
                this.mPresenters.remove((Object)ref);
            }
            else {
                if (expanded = presenter.expandItemActionView(this, item)) {
                    break;
                }
                continue;
            }
        }
        this.startDispatchingItemsChanged();
        if (expanded) {
            this.mExpandedItem = item;
        }
        return expanded;
    }
    
    public boolean collapseItemActionView(final MenuItemImpl item) {
        if (this.mPresenters.isEmpty() || this.mExpandedItem != item) {
            return false;
        }
        boolean collapsed = false;
        this.stopDispatchingItemsChanged();
        for (final WeakReference<MenuPresenter> ref : this.mPresenters) {
            final MenuPresenter presenter = (MenuPresenter)ref.get();
            if (presenter == null) {
                this.mPresenters.remove((Object)ref);
            }
            else {
                if (collapsed = presenter.collapseItemActionView(this, item)) {
                    break;
                }
                continue;
            }
        }
        this.startDispatchingItemsChanged();
        if (collapsed) {
            this.mExpandedItem = null;
        }
        return collapsed;
    }
    
    public MenuItemImpl getExpandedItem() {
        return this.mExpandedItem;
    }
    
    public void setOverrideVisibleItems(final boolean override) {
        this.mOverrideVisibleItems = override;
    }
    
    static {
        sCategoryToOrder = new int[] { 1, 4, 5, 3, 2, 0 };
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public interface Callback
    {
        boolean onMenuItemSelected(@NonNull final MenuBuilder p0, @NonNull final MenuItem p1);
        
        void onMenuModeChange(@NonNull final MenuBuilder p0);
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public interface ItemInvoker
    {
        boolean invokeItem(final MenuItemImpl p0);
    }
}
