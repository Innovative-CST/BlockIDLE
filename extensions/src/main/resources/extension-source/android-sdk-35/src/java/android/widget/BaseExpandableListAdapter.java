package android.widget;

import android.database.DataSetObserver;

public abstract class BaseExpandableListAdapter implements ExpandableListAdapter, HeterogeneousExpandableList
{
    public BaseExpandableListAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void registerDataSetObserver(final DataSetObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unregisterDataSetObserver(final DataSetObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyDataSetInvalidated() {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyDataSetChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean areAllItemsEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onGroupCollapsed(final int groupPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onGroupExpanded(final int groupPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getCombinedChildId(final long groupId, final long childId) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getCombinedGroupId(final long groupId) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getChildType(final int groupPosition, final int childPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getChildTypeCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getGroupType(final int groupPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getGroupTypeCount() {
        throw new RuntimeException("Stub!");
    }
}
