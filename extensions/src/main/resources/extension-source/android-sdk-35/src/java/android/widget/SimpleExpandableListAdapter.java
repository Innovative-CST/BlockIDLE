package android.widget;

import android.view.ViewGroup;
import android.view.View;
import java.util.Map;
import java.util.List;
import android.content.Context;

public class SimpleExpandableListAdapter extends BaseExpandableListAdapter
{
    public SimpleExpandableListAdapter(final Context context, final List<? extends Map<String, ?>> groupData, final int groupLayout, final String[] groupFrom, final int[] groupTo, final List<? extends List<? extends Map<String, ?>>> childData, final int childLayout, final String[] childFrom, final int[] childTo) {
        throw new RuntimeException("Stub!");
    }
    
    public SimpleExpandableListAdapter(final Context context, final List<? extends Map<String, ?>> groupData, final int expandedGroupLayout, final int collapsedGroupLayout, final String[] groupFrom, final int[] groupTo, final List<? extends List<? extends Map<String, ?>>> childData, final int childLayout, final String[] childFrom, final int[] childTo) {
        throw new RuntimeException("Stub!");
    }
    
    public SimpleExpandableListAdapter(final Context context, final List<? extends Map<String, ?>> groupData, final int expandedGroupLayout, final int collapsedGroupLayout, final String[] groupFrom, final int[] groupTo, final List<? extends List<? extends Map<String, ?>>> childData, final int childLayout, final int lastChildLayout, final String[] childFrom, final int[] childTo) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object getChild(final int groupPosition, final int childPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getChildId(final int groupPosition, final int childPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View getChildView(final int groupPosition, final int childPosition, final boolean isLastChild, final View convertView, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    public View newChildView(final boolean isLastChild, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getChildrenCount(final int groupPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object getGroup(final int groupPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getGroupCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getGroupId(final int groupPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View getGroupView(final int groupPosition, final boolean isExpanded, final View convertView, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    public View newGroupView(final boolean isExpanded, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isChildSelectable(final int groupPosition, final int childPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean hasStableIds() {
        throw new RuntimeException("Stub!");
    }
}
