package android.system;

public final class StructTimespec implements Comparable<StructTimespec>
{
    public final long tv_nsec;
    public final long tv_sec;
    
    public StructTimespec(final long tv_sec, final long tv_nsec) {
        this.tv_nsec = 0L;
        this.tv_sec = 0L;
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int compareTo(final StructTimespec other) {
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
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
