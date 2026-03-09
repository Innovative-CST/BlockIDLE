package android.widget;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.View;
import java.util.Map;
import java.util.List;
import android.content.Context;

public class SimpleAdapter extends BaseAdapter implements Filterable, ThemedSpinnerAdapter
{
    public SimpleAdapter(final Context context, final List<? extends Map<String, ?>> data, final int resource, final String[] from, final int[] to) {
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
    public View getView(final int position, final View convertView, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDropDownViewResource(final int resource) {
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
    
    @Override
    public View getDropDownView(final int position, final View convertView, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    public ViewBinder getViewBinder() {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewBinder(final ViewBinder viewBinder) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewImage(final ImageView v, final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewImage(final ImageView v, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewText(final TextView v, final String text) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Filter getFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public interface ViewBinder
    {
        boolean setViewValue(final View p0, final Object p1, final String p2);
    }
}
