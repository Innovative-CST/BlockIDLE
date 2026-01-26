package android.widget;

import android.view.ViewGroup;
import android.view.View;
import android.content.res.Resources;
import android.database.Cursor;
import android.content.Context;

public abstract class CursorAdapter extends BaseAdapter implements Filterable, ThemedSpinnerAdapter
{
    @Deprecated
    public static final int FLAG_AUTO_REQUERY = 1;
    public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
    
    @Deprecated
    public CursorAdapter(final Context context, final Cursor c) {
        throw new RuntimeException("Stub!");
    }
    
    public CursorAdapter(final Context context, final Cursor c, final boolean autoRequery) {
        throw new RuntimeException("Stub!");
    }
    
    public CursorAdapter(final Context context, final Cursor c, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void init(final Context context, final Cursor c, final boolean autoRequery) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setDropDownViewTheme(final Resources.Theme theme) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Resources.Theme getDropDownViewTheme() {
        throw new RuntimeException("Stub!");
    }
    
    public Cursor getCursor() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object getItem(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getItemId(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean hasStableIds() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View getDropDownView(final int position, final View convertView, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract View newView(final Context p0, final Cursor p1, final ViewGroup p2);
    
    public View newDropDownView(final Context context, final Cursor cursor, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void bindView(final View p0, final Context p1, final Cursor p2);
    
    public void changeCursor(final Cursor cursor) {
        throw new RuntimeException("Stub!");
    }
    
    public Cursor swapCursor(final Cursor newCursor) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence convertToString(final Cursor cursor) {
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
    
    protected void onContentChanged() {
        throw new RuntimeException("Stub!");
    }
}
