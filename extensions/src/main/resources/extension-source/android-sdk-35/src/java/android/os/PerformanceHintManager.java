package android.os;

import java.io.Closeable;

public final class PerformanceHintManager
{
    PerformanceHintManager() {
        throw new RuntimeException("Stub!");
    }
    
    public long getPreferredUpdateRateNanos() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Session createHintSession(@NonNull final int[] tids, final long initialTargetWorkDurationNanos) {
        throw new RuntimeException("Stub!");
    }
    
    public static class Session implements Closeable
    {
        Session() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        protected void finalize() throws Throwable {
            throw new RuntimeException("Stub!");
        }
        
        public void updateTargetWorkDuration(final long targetDurationNanos) {
            throw new RuntimeException("Stub!");
        }
        
        public void reportActualWorkDuration(final long actualDurationNanos) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void close() {
            throw new RuntimeException("Stub!");
        }
        
        public void setPreferPowerEfficiency(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        public void setThreads(@NonNull final int[] tids) {
            throw new RuntimeException("Stub!");
        }
        
        public void reportActualWorkDuration(@NonNull final WorkDuration workDuration) {
            throw new RuntimeException("Stub!");
        }
    }
}
