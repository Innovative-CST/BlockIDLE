package android.widget;

import android.view.View;
import android.view.ViewGroup;
import android.database.Cursor;
import android.content.Context;

public abstract class ResourceCursorTreeAdapter extends CursorTreeAdapter
{
    public ResourceCursorTreeAdapter(final Context context, final Cursor cursor, final int collapsedGroupLayout, final int expandedGroupLayout, final int childLayout, final int lastChildLayout) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    public ResourceCursorTreeAdapter(final Context context, final Cursor cursor, final int collapsedGroupLayout, final int expandedGroupLayout, final int childLayout) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    public ResourceCursorTreeAdapter(final Context context, final Cursor cursor, final int groupLayout, final int childLayout) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    public View newChildView(final Context context, final Cursor cursor, final boolean isLastChild, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    public View newGroupView(final Context context, final Cursor cursor, final boolean isExpanded, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
}
