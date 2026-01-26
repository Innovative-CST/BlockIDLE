package android.animation;

public abstract class BidirectionalTypeConverter<T, V> extends TypeConverter<T, V>
{
    public BidirectionalTypeConverter(final Class<T> fromClass, final Class<V> toClass) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    public abstract T convertBack(final V p0);
    
    public BidirectionalTypeConverter<V, T> invert() {
        throw new RuntimeException("Stub!");
    }
}
