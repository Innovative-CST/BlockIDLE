package androidx.appcompat.view.menu;

import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import android.view.LayoutInflater;
import androidx.annotation.RestrictTo;
import android.widget.BaseAdapter;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class MenuAdapter extends BaseAdapter
{
    MenuBuilder mAdapterMenu;
    private int mExpandedIndex;
    private boolean mForceShowIcon;
    private final boolean mOverflowOnly;
    private final LayoutInflater mInflater;
    private final int mItemLayoutRes;
    
    public MenuAdapter(final MenuBuilder menu, final LayoutInflater inflater, final boolean overflowOnly, final int itemLayoutRes) {
        this.mExpandedIndex = -1;
        this.mOverflowOnly = overflowOnly;
        this.mInflater = inflater;
        this.mAdapterMenu = menu;
        this.mItemLayoutRes = itemLayoutRes;
        this.findExpandedIndex();
    }
    
    public boolean getForceShowIcon() {
        return this.mForceShowIcon;
    }
    
    public void setForceShowIcon(final boolean forceShow) {
        this.mForceShowIcon = forceShow;
    }
    
    public int getCount() {
        final ArrayList<MenuItemImpl> items = this.mOverflowOnly ? this.mAdapterMenu.getNonActionItems() : this.mAdapterMenu.getVisibleItems();
        if (this.mExpandedIndex < 0) {
            return items.size();
        }
        return items.size() - 1;
    }
    
    public MenuBuilder getAdapterMenu() {
        return this.mAdapterMenu;
    }
    
    public MenuItemImpl getItem(int position) {
        final ArrayList<MenuItemImpl> items = this.mOverflowOnly ? this.mAdapterMenu.getNonActionItems() : this.mAdapterMenu.getVisibleItems();
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
            convertView = this.mInflater.inflate(this.mItemLayoutRes, parent, false);
        }
        final int currGroupId = this.getItem(position).getGroupId();
        final int prevGroupId = (position - 1 >= 0) ? this.getItem(position - 1).getGroupId() : currGroupId;
        ((ListMenuItemView)convertView).setGroupDividerEnabled(this.mAdapterMenu.isGroupDividerEnabled() && currGroupId != prevGroupId);
        final MenuView.ItemView itemView = (MenuView.ItemView)convertView;
        if (this.mForceShowIcon) {
            ((ListMenuItemView)convertView).setForceShowIcon(true);
        }
        itemView.initialize(this.getItem(position), 0);
        return convertView;
    }
    
    void findExpandedIndex() {
        final MenuItemImpl expandedItem = this.mAdapterMenu.getExpandedItem();
        if (expandedItem != null) {
            final ArrayList<MenuItemImpl> items = this.mAdapterMenu.getNonActionItems();
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
