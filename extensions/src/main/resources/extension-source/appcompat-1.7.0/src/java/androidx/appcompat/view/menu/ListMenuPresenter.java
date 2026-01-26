package androidx.appcompat.view.menu;

import java.util.ArrayList;
import android.widget.BaseAdapter;
import android.os.Parcelable;
import android.util.SparseArray;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.os.IBinder;
import android.widget.ListAdapter;
import androidx.appcompat.R;
import android.view.ViewGroup;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.content.Context;
import androidx.annotation.RestrictTo;
import android.widget.AdapterView;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class ListMenuPresenter implements MenuPresenter, AdapterView.OnItemClickListener
{
    private static final String TAG = "ListMenuPresenter";
    Context mContext;
    LayoutInflater mInflater;
    MenuBuilder mMenu;
    ExpandedMenuView mMenuView;
    int mItemIndexOffset;
    int mThemeRes;
    int mItemLayoutRes;
    private Callback mCallback;
    MenuAdapter mAdapter;
    private int mId;
    public static final String VIEWS_TAG = "android:menu:list";
    
    public ListMenuPresenter(final Context context, final int itemLayoutRes) {
        this(itemLayoutRes, 0);
        this.mContext = context;
        this.mInflater = LayoutInflater.from(this.mContext);
    }
    
    public ListMenuPresenter(final int itemLayoutRes, final int themeRes) {
        this.mItemLayoutRes = itemLayoutRes;
        this.mThemeRes = themeRes;
    }
    
    @Override
    public void initForMenu(final Context context, final MenuBuilder menu) {
        if (this.mThemeRes != 0) {
            this.mContext = (Context)new ContextThemeWrapper(context, this.mThemeRes);
            this.mInflater = LayoutInflater.from(this.mContext);
        }
        else if (this.mContext != null) {
            this.mContext = context;
            if (this.mInflater == null) {
                this.mInflater = LayoutInflater.from(this.mContext);
            }
        }
        this.mMenu = menu;
        if (this.mAdapter != null) {
            this.mAdapter.notifyDataSetChanged();
        }
    }
    
    @Override
    public MenuView getMenuView(final ViewGroup root) {
        if (this.mMenuView == null) {
            this.mMenuView = (ExpandedMenuView)this.mInflater.inflate(R.layout.abc_expanded_menu_layout, root, false);
            if (this.mAdapter == null) {
                this.mAdapter = new MenuAdapter();
            }
            this.mMenuView.setAdapter((ListAdapter)this.mAdapter);
            this.mMenuView.setOnItemClickListener((AdapterView.OnItemClickListener)this);
        }
        return this.mMenuView;
    }
    
    public ListAdapter getAdapter() {
        if (this.mAdapter == null) {
            this.mAdapter = new MenuAdapter();
        }
        return (ListAdapter)this.mAdapter;
    }
    
    @Override
    public void updateMenuView(final boolean cleared) {
        if (this.mAdapter != null) {
            this.mAdapter.notifyDataSetChanged();
        }
    }
    
    @Override
    public void setCallback(final Callback cb) {
        this.mCallback = cb;
    }
    
    @Override
    public boolean onSubMenuSelected(final SubMenuBuilder subMenu) {
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        new MenuDialogHelper(subMenu).show(null);
        if (this.mCallback != null) {
            this.mCallback.onOpenSubMenu(subMenu);
        }
        return true;
    }
    
    @Override
    public void onCloseMenu(final MenuBuilder menu, final boolean allMenusAreClosing) {
        if (this.mCallback != null) {
            this.mCallback.onCloseMenu(menu, allMenusAreClosing);
        }
    }
    
    int getItemIndexOffset() {
        return this.mItemIndexOffset;
    }
    
    public void setItemIndexOffset(final int offset) {
        this.mItemIndexOffset = offset;
        if (this.mMenuView != null) {
            this.updateMenuView(false);
        }
    }
    
    public void onItemClick(final AdapterView<?> parent, final View view, final int position, final long id) {
        this.mMenu.performItemAction((MenuItem)this.mAdapter.getItem(position), this, 0);
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
    
    public void saveHierarchyState(final Bundle outState) {
        final SparseArray<Parcelable> viewStates = (SparseArray<Parcelable>)new SparseArray();
        if (this.mMenuView != null) {
            ((View)this.mMenuView).saveHierarchyState((SparseArray)viewStates);
        }
        outState.putSparseParcelableArray("android:menu:list", (SparseArray)viewStates);
    }
    
    public void restoreHierarchyState(final Bundle inState) {
        final SparseArray<Parcelable> viewStates = (SparseArray<Parcelable>)inState.getSparseParcelableArray("android:menu:list");
        if (viewStates != null) {
            ((View)this.mMenuView).restoreHierarchyState((SparseArray)viewStates);
        }
    }
    
    public void setId(final int id) {
        this.mId = id;
    }
    
    @Override
    public int getId() {
        return this.mId;
    }
    
    @Override
    public Parcelable onSaveInstanceState() {
        if (this.mMenuView == null) {
            return null;
        }
        final Bundle state = new Bundle();
        this.saveHierarchyState(state);
        return (Parcelable)state;
    }
    
    @Override
    public void onRestoreInstanceState(final Parcelable state) {
        this.restoreHierarchyState((Bundle)state);
    }
    
    private class MenuAdapter extends BaseAdapter
    {
        private int mExpandedIndex;
        
        public MenuAdapter() {
            this.mExpandedIndex = -1;
            this.findExpandedIndex();
        }
        
        public int getCount() {
            final ArrayList<MenuItemImpl> items = ListMenuPresenter.this.mMenu.getNonActionItems();
            final int count = items.size() - ListMenuPresenter.this.mItemIndexOffset;
            if (this.mExpandedIndex < 0) {
                return count;
            }
            return count - 1;
        }
        
        public MenuItemImpl getItem(int position) {
            final ArrayList<MenuItemImpl> items = ListMenuPresenter.this.mMenu.getNonActionItems();
            position += ListMenuPresenter.this.mItemIndexOffset;
            if (this.mExpandedIndex >= 0 && position >= this.mExpandedIndex) {
                ++position;
            }
            return (MenuItemImpl)items.get(position);
        }
        
        public long getItemId(final int position) {
            return position;
        }
        
        public View getView(final int position, View convertView, final ViewGroup parent) {
            if (convertView == null) {
                convertView = ListMenuPresenter.this.mInflater.inflate(ListMenuPresenter.this.mItemLayoutRes, parent, false);
            }
            final MenuView.ItemView itemView = (MenuView.ItemView)convertView;
            itemView.initialize(this.getItem(position), 0);
            return convertView;
        }
        
        void findExpandedIndex() {
            final MenuItemImpl expandedItem = ListMenuPresenter.this.mMenu.getExpandedItem();
            if (expandedItem != null) {
                final ArrayList<MenuItemImpl> items = ListMenuPresenter.this.mMenu.getNonActionItems();
                for (int count = items.size(), i = 0; i < count; ++i) {
                    final MenuItemImpl item = (MenuItemImpl)items.get(i);
                    if (item == expandedItem) {
                        this.mExpandedIndex = i;
                        return;
                    }
                }
            }
            this.mExpandedIndex = -1;
        }
        
        public void notifyDataSetChanged() {
            this.findExpandedIndex();
            super.notifyDataSetChanged();
        }
    }
}
