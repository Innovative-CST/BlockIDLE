package android.util;

public class Pair<F, S>
{
    public final F first;
    public final S second;
    
    public Pair(final F first, final S second) {
        this.first = null;
        this.second = null;
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static <A, B> Pair<A, B> create(final A a, final B b) {
        throw new RuntimeException("Stub!");
    }
}
