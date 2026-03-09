package android.util;

public final class Range<T extends Comparable<? super T>>
{
    public Range(final T lower, final T upper) {
        throw new RuntimeException("Stub!");
    }
    
    public static <T extends Comparable<? super T>> Range<T> create(final T lower, final T upper) {
        throw new RuntimeException("Stub!");
    }
    
    public T getLower() {
        throw new RuntimeException("Stub!");
    }
    
    public T getUpper() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean contains(final T value) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean contains(final Range<T> range) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    public T clamp(final T value) {
        throw new RuntimeException("Stub!");
    }
    
    public Range<T> intersect(final Range<T> range) {
        throw new RuntimeException("Stub!");
    }
    
    public Range<T> intersect(final T lower, final T upper) {
        throw new RuntimeException("Stub!");
    }
    
    public Range<T> extend(final Range<T> range) {
        throw new RuntimeException("Stub!");
    }
    
    public Range<T> extend(final T lower, final T upper) {
        throw new RuntimeException("Stub!");
    }
    
    public Range<T> extend(final T value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
