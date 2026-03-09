package android.health.connect;

import java.time.Instant;

public final class TimeInstantRangeFilter implements TimeRangeFilter
{
    TimeInstantRangeFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Instant getStartTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Instant getEndTime() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public boolean isBounded() {
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
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStartTime(@Nullable final Instant startTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEndTime(@Nullable final Instant endTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TimeInstantRangeFilter build() {
            throw new RuntimeException("Stub!");
        }
    }
}
