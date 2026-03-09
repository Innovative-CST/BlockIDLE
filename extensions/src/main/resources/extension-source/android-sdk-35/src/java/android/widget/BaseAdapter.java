package android.widget;

import android.view.ViewGroup;
import android.view.View;
import android.database.DataSetObserver;

public abstract class BaseAdapter implements ListAdapter, SpinnerAdapter
{
    public BaseAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean hasStableIds() {
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
    
    public void notifyDataSetChanged() {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyDataSetInvalidated() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean areAllItemsEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isEnabled(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View getDropDownView(final int position, final View convertView, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getItemViewType(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getViewTypeCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence[] getAutofillOptions() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAutofillOptions(@Nullable final CharSequence... options) {
        throw new RuntimeException("Stub!");
    }
}
