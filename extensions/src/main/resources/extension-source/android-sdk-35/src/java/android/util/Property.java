package android.util;

public abstract class Property<T, V>
{
    public Property(final Class<V> type, final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public static <T, V> Property<T, V> of(final Class<T> hostType, final Class<V> valueType, final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isReadOnly() {
        throw new RuntimeException("Stub!");
    }
    
    public void set(final T object, final V value) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract V get(final T p0);
    
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public Class<V> getType() {
        throw new RuntimeException("Stub!");
    }
}
