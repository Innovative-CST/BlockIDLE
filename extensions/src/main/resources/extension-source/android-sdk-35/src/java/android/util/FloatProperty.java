package android.util;

public abstract class FloatProperty<T> extends Property<T, Float>
{
    public FloatProperty(final String name) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setValue(final T p0, final float p1);
    
    @Override
    public final void set(final T object, final Float value) {
        throw new RuntimeException("Stub!");
    }
}
