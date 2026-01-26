package android.animation;

public abstract class TypeConverter<T, V>
{
    public TypeConverter(final Class<T> fromClass, final Class<V> toClass) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract V convert(final T p0);
}
