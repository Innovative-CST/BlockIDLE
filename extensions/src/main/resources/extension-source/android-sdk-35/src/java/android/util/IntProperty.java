package android.util;

public abstract class IntProperty<T> extends Property<T, Integer>
{
    public IntProperty(final String name) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setValue(final T p0, final int p1);
    
    @Override
    public final void set(final T object, final Integer value) {
        throw new RuntimeException("Stub!");
    }
}
