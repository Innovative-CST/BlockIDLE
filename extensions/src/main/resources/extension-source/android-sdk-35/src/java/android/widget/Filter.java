package android.widget;

public abstract class Filter
{
    public Filter() {
        throw new RuntimeException("Stub!");
    }
    
    public final void filter(final CharSequence constraint) {
        throw new RuntimeException("Stub!");
    }
    
    public final void filter(final CharSequence constraint, final FilterListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract FilterResults performFiltering(final CharSequence p0);
    
    protected abstract void publishResults(final CharSequence p0, final FilterResults p1);
    
    public CharSequence convertResultToString(final Object resultValue) {
        throw new RuntimeException("Stub!");
    }
    
    protected static class FilterResults
    {
        public int count;
        public Object values;
        
        public FilterResults() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface FilterListener
    {
        void onFilterComplete(final int p0);
    }
}
