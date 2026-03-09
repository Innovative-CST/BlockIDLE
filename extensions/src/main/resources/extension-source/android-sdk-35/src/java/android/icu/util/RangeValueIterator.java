package android.icu.util;

public interface RangeValueIterator
{
    boolean next(final Element p0);
    
    void reset();
    
    public static class Element
    {
        public int limit;
        public int start;
        public int value;
        
        public Element() {
            throw new RuntimeException("Stub!");
        }
    }
}
