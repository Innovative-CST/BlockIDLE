package androidx.appcompat.view.menu;

import android.view.View;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public abstract class BaseMenuPresenter implements MenuPresenter
{
    protected Context mSystemContext;
    protected Context mContext;
    protected MenuBuilder mMenu;
    protected LayoutInflater mSystemInflater;
    protected LayoutInflater mInflater;
    private Callback mCallback;
    private int mMenuLayoutRes;
    private int mItemLayoutRes;
    protected MenuView mMenuView;
    private int mId;
    
    public BaseMenuPresenter(final Context context, final int menuLayoutRes, final int itemLayoutRes) {
        this.mSystemContext = context;
        this.mSystemInflater = LayoutInflater.from(context);
        this.mMenuLayoutRes = menuLayoutRes;
        this.mItemLayoutRes = itemLayoutRes;
    }
    
    @Override
    public void initForMenu(final Context context, final MenuBuilder menu) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(this.mContext);
        this.mMenu = menu;
    }
    
    @Override
    public MenuView getMenuView(final ViewGroup root) {
        if (this.mMenuView == null) {
            (this.mMenuView = (MenuView)this.mSystemInflater.inflate(this.mMenuLayoutRes, root, false)).initialize(this.mMenu);
            this.updateMenuView(true);
        }
        return this.mMenuView;
    }
    
    @Override
    public void updateMenuView(final boolean cleared) {
        final ViewGroup parent = (ViewGroup)this.mMenuView;
        if (parent == null) {
            return;
        }
        int childIndex = 0;
        if (this.mMenu != null) {
            this.mMenu.flagActionItems();
            final ArrayList<MenuItemImpl> visibleItems = this.mMenu.getVisibleItems();
            for (int itemCount = visibleItems.size(), i = 0; i < itemCount; ++i) {
                final MenuItemImpl item = (MenuItemImpl)visibleItems.get(i);
                if (this.shouldIncludeItem(childIndex, item)) {
                    final View convertView = parent.getChildAt(childIndex);
                    final MenuItemImpl oldItem = (convertView instanceof MenuView.ItemView) ? ((MenuView.ItemView)convertView).getItemData() : null;
                    final View itemView = this.getItemView(item, convertView, parent);
                    if (item != oldItem) {
                        itemView.setPressed(false);
                        itemView.jumpDrawablesToCurrentState();
                    }
                    if (itemView != convertView) {
                        this.addItemView(itemView, childIndex);
                    }
                    ++childIndex;
                }
            }
        }
        while (childIndex < parent.getChildCount()) {
            if (!this.filterLeftoverView(parent, childIndex)) {
                ++childIndex;
            }
        }
    }
    
    protected void addItemView(final View itemView, final int childIndex) {
        final ViewGroup currentParent = (ViewGroup)itemView.getParent();
        if (currentParent != null) {
            currentParent.removeView(itemView);
        }
        ((ViewGroup)this.mMenuView).addView(itemView, childIndex);
    }
    
    protected boolean filterLeftoverView(final ViewGroup parent, final int childIndex) {
        parent.removeViewAt(childIndex);
        return true;
    }
    
    @Override
    public void setCallback(final Callback cb) {
        this.mCallback = cb;
    }
    
    public Callback getCallback() {
        return this.mCallback;
    }
    
    public MenuView.ItemView createItemView(final ViewGroup parent) {
        return (MenuView.ItemView)this.mSystemInflater.inflate(this.mItemLayoutRes, parent, false);
    }
    
    public View getItemView(final MenuItemImpl item, final View convertView, final ViewGroup parent) {
        MenuView.ItemView itemView;
        if (convertView instanceof MenuView.ItemView) {
            itemView = (MenuView.ItemView)convertView;
        }
        else {
            itemView = this.createItemView(parent);
        }
        this.bindItemView(item, itemView);
        return (View)itemView;
    }
    
    public abstract void bindItemView(final MenuItemImpl p0, final MenuView.ItemView p1);
    
    public boolean shouldIncludeItem(final int childIndex, final MenuItemImpl item) {
        return true;
    }
    
    @Override
    public void onCloseMenu(final MenuBuilder menu, final boolean allMenusAreClosing) {
        if (this.mCallback != null) {
            this.mCallback.onCloseMenu(menu, allMenusAreClosing);
        }
    }
    
    @Override
    public boolean onSubMenuSelected(final SubMenuBuilder menu) {
        return this.mCallback != null && this.mCallback.onOpenSubMenu((menu != null) ? menu : this.mMenu);
    }
    
    @Override
    public boolean flagActionItems() {
        return false;
    }
    
    @Override
    public boolean expandItemActionView(final MenuBuilder menu, final MenuItemImpl item) {
        return false;
    }
    
    @Override
    public boolean collapseItemActionView(final MenuBuilder menu, final MenuItemImpl item) {
        return false;
    }
    
    @Override
    public int getId() {
        return this.mId;
    }
    
    public void setId(final int id) {
        this.mId = id;
    }
}
