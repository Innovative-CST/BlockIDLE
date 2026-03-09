package android.widget;

import android.view.ViewGroup;
import android.view.View;
import android.database.DataSetObserver;

public interface Adapter
{
    public static final int IGNORE_ITEM_VIEW_TYPE = -1;
    public static final int NO_SELECTION = Integer.MIN_VALUE;
    
    void registerDataSetObserver(final DataSetObserver p0);
    
    void unregisterDataSetObserver(final DataSetObserver p0);
    
    int getCount();
    
    Object getItem(final int p0);
    
    long getItemId(final int p0);
    
    boolean hasStableIds();
    
    View getView(final int p0, final View p1, final ViewGroup p2);
    
    int getItemViewType(final int p0);
    
    int getViewTypeCount();
    
    boolean isEmpty();
    
    @Nullable
    default CharSequence[] getAutofillOptions() {
        throw new RuntimeException("Stub!");
    }
}
