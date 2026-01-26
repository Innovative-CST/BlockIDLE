package android.widget;

import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.database.Cursor;

public abstract class CursorTreeAdapter extends BaseExpandableListAdapter implements Filterable
{
    public CursorTreeAdapter(final Cursor cursor, final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public CursorTreeAdapter(final Cursor cursor, final Context context, final boolean autoRequery) {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract Cursor getChildrenCursor(final Cursor p0);
    
    public void setGroupCursor(final Cursor cursor) {
        throw new RuntimeException("Stub!");
    }
    
    public void setChildrenCursor(final int groupPosition, final Cursor childrenCursor) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Cursor getChild(final int groupPosition, final int childPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getChildId(final int groupPosition, final int childPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getChildrenCount(final int groupPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Cursor getGroup(final int groupPosition) {
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
    
    protected abstract View newGroupView(final Context p0, final Cursor p1, final boolean p2, final ViewGroup p3);
    
    protected abstract void bindGroupView(final View p0, final Context p1, final Cursor p2, final boolean p3);
    
    @Override
    public View getChildView(final int groupPosition, final int childPosition, final boolean isLastChild, final View convertView, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract View newChildView(final Context p0, final Cursor p1, final boolean p2, final ViewGroup p3);
    
    protected abstract void bindChildView(final View p0, final Context p1, final Cursor p2, final boolean p3);
    
    @Override
    public boolean isChildSelectable(final int groupPosition, final int childPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean hasStableIds() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void notifyDataSetChanged() {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyDataSetChanged(final boolean releaseCursors) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void notifyDataSetInvalidated() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onGroupCollapsed(final int groupPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public String convertToString(final Cursor cursor) {
        throw new RuntimeException("Stub!");
    }
    
    public Cursor runQueryOnBackgroundThread(final CharSequence constraint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Filter getFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public FilterQueryProvider getFilterQueryProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFilterQueryProvider(final FilterQueryProvider filterQueryProvider) {
        throw new RuntimeException("Stub!");
    }
    
    public void changeCursor(final Cursor cursor) {
        throw new RuntimeException("Stub!");
    }
    
    public Cursor getCursor() {
        throw new RuntimeException("Stub!");
    }
}
