package android.media;

public final class MediaTimestamp
{
    public static final MediaTimestamp TIMESTAMP_UNKNOWN;
    
    public MediaTimestamp(final long mediaTimeUs, final long nanoTimeNs, final float clockRate) {
        throw new RuntimeException("Stub!");
    }
    
    public long getAnchorMediaTimeUs() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public long getAnchorSytemNanoTime() {
        throw new RuntimeException("Stub!");
    }
    
    public long getAnchorSystemNanoTime() {
        throw new RuntimeException("Stub!");
    }
    
    public float getMediaClockRate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        TIMESTAMP_UNKNOWN = null;
    }
}
