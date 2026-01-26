package android.icu.util;

public interface Freezable<T> extends Cloneable
{
    boolean isFrozen();
    
    T freeze();
    
    T cloneAsThawed();
}
