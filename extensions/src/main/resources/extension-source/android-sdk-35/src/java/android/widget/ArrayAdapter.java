package android.widget;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.View;
import java.util.Comparator;
import java.util.Collection;
import java.util.List;
import android.content.Context;

public class ArrayAdapter<T> extends BaseAdapter implements Filterable, ThemedSpinnerAdapter
{
    public ArrayAdapter(@NonNull final Context context, final int resource) {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayAdapter(@NonNull final Context context, final int resource, final int textViewResourceId) {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayAdapter(@NonNull final Context context, final int resource, @NonNull final T[] objects) {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayAdapter(@NonNull final Context context, final int resource, final int textViewResourceId, @NonNull final T[] objects) {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayAdapter(@NonNull final Context context, final int resource, @NonNull final List<T> objects) {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayAdapter(@NonNull final Context context, final int resource, final int textViewResourceId, @NonNull final List<T> objects) {
        throw new RuntimeException("Stub!");
    }
    
    public void add(@Nullable final T object) {
        throw new RuntimeException("Stub!");
    }
    
    public void addAll(@NonNull final Collection<? extends T> collection) {
        throw new RuntimeException("Stub!");
    }
    
    public void addAll(final T... items) {
        throw new RuntimeException("Stub!");
    }
    
    public void insert(@Nullable final T object, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void remove(@Nullable final T object) {
        throw new RuntimeException("Stub!");
    }
    
    public void clear() {
        throw new RuntimeException("Stub!");
    }
    
    public void sort(@NonNull final Comparator<? super T> comparator) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void notifyDataSetChanged() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNotifyOnChange(final boolean notifyOnChange) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Context getContext() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public T getItem(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPosition(@Nullable final T item) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getItemId(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public View getView(final int position, @Nullable final View convertView, @NonNull final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDropDownViewResource(final int resource) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setDropDownViewTheme(@Nullable final Resources.Theme theme) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public Resources.Theme getDropDownViewTheme() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View getDropDownView(final int position, @RecentlyNullable final View convertView, @RecentlyNonNull final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ArrayAdapter<CharSequence> createFromResource(@NonNull final Context context, final int textArrayResId, final int textViewResId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public Filter getFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence[] getAutofillOptions() {
        throw new RuntimeException("Stub!");
    }
}
