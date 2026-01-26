package android.system;

public final class StructTimeval
{
    public final long tv_sec;
    public final long tv_usec;
    
    StructTimeval() {
        this.tv_sec = 0L;
        this.tv_usec = 0L;
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static StructTimeval fromMillis(final long millis) {
        throw new RuntimeException("Stub!");
    }
    
    public long toMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
