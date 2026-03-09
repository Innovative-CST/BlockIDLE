package android.widget;

import android.view.View;
import android.view.ViewGroup;
import android.content.res.Resources;
import android.database.Cursor;
import android.content.Context;

public abstract class ResourceCursorAdapter extends CursorAdapter
{
    @Deprecated
    public ResourceCursorAdapter(final Context context, final int layout, final Cursor c) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    public ResourceCursorAdapter(final Context context, final int layout, final Cursor c, final boolean autoRequery) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    public ResourceCursorAdapter(final Context context, final int layout, final Cursor c, final int flags) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setDropDownViewTheme(final Resources.Theme theme) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View newDropDownView(final Context context, final Cursor cursor, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewResource(final int layout) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDropDownViewResource(final int dropDownLayout) {
        throw new RuntimeException("Stub!");
    }
}
