package android.widget;

import android.database.DataSetObserver;
import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;

public class HeaderViewListAdapter implements WrapperListAdapter, Filterable
{
    public HeaderViewListAdapter(final ArrayList<ListView.FixedViewInfo> headerViewInfos, final ArrayList<ListView.FixedViewInfo> footerViewInfos, final ListAdapter adapter) {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeadersCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFootersCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeHeader(final View v) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeFooter(final View v) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getCount() {
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
    public int getItemViewType(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getViewTypeCount() {
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
    
    @Override
    public Filter getFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ListAdapter getWrappedAdapter() {
        throw new RuntimeException("Stub!");
    }
}
