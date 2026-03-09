package android.widget;

import android.view.ViewGroup;
import android.view.View;
import android.database.DataSetObserver;

public interface ExpandableListAdapter
{
    void registerDataSetObserver(final DataSetObserver p0);
    
    void unregisterDataSetObserver(final DataSetObserver p0);
    
    int getGroupCount();
    
    int getChildrenCount(final int p0);
    
    Object getGroup(final int p0);
    
    Object getChild(final int p0, final int p1);
    
    long getGroupId(final int p0);
    
    long getChildId(final int p0, final int p1);
    
    boolean hasStableIds();
    
    View getGroupView(final int p0, final boolean p1, final View p2, final ViewGroup p3);
    
    View getChildView(final int p0, final int p1, final boolean p2, final View p3, final ViewGroup p4);
    
    boolean isChildSelectable(final int p0, final int p1);
    
    boolean areAllItemsEnabled();
    
    boolean isEmpty();
    
    void onGroupExpanded(final int p0);
    
    void onGroupCollapsed(final int p0);
    
    long getCombinedChildId(final long p0, final long p1);
    
    long getCombinedGroupId(final long p0);
}
