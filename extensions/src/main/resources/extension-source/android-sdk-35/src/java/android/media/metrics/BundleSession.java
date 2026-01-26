package android.media.metrics;

import android.os.PersistableBundle;

public final class BundleSession implements AutoCloseable
{
    public static final String KEY_STATSD_ATOM = "bundlesession-statsd-atom";
    
    BundleSession() {
        throw new RuntimeException("Stub!");
    }
    
    public void reportBundleMetrics(@NonNull final PersistableBundle metrics) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LogSessionId getSessionId() {
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
    public void close() {
        throw new RuntimeException("Stub!");
    }
}
