package android.widget;

import android.view.View;
import android.database.Cursor;
import android.content.Context;

public abstract class SimpleCursorTreeAdapter extends ResourceCursorTreeAdapter
{
    public SimpleCursorTreeAdapter(final Context context, final Cursor cursor, final int collapsedGroupLayout, final int expandedGroupLayout, final String[] groupFrom, final int[] groupTo, final int childLayout, final int lastChildLayout, final String[] childFrom, final int[] childTo) {
        super(null, null, 0, 0);
        throw new RuntimeException("Stub!");
    }
    
    public SimpleCursorTreeAdapter(final Context context, final Cursor cursor, final int collapsedGroupLayout, final int expandedGroupLayout, final String[] groupFrom, final int[] groupTo, final int childLayout, final String[] childFrom, final int[] childTo) {
        super(null, null, 0, 0);
        throw new RuntimeException("Stub!");
    }
    
    public SimpleCursorTreeAdapter(final Context context, final Cursor cursor, final int groupLayout, final String[] groupFrom, final int[] groupTo, final int childLayout, final String[] childFrom, final int[] childTo) {
        super(null, null, 0, 0);
        throw new RuntimeException("Stub!");
    }
    
    public ViewBinder getViewBinder() {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewBinder(final ViewBinder viewBinder) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void bindChildView(final View view, final Context context, final Cursor cursor, final boolean isLastChild) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void bindGroupView(final View view, final Context context, final Cursor cursor, final boolean isExpanded) {
        throw new RuntimeException("Stub!");
    }
    
    protected void setViewImage(final ImageView v, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewText(final TextView v, final String text) {
        throw new RuntimeException("Stub!");
    }
    
    public interface ViewBinder
    {
        boolean setViewValue(final View p0, final Cursor p1, final int p2);
    }
}
