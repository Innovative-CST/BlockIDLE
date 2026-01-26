package android.health.connect;

import java.time.LocalDateTime;

public final class LocalTimeRangeFilter implements TimeRangeFilter
{
    LocalTimeRangeFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public LocalDateTime getStartTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public LocalDateTime getEndTime() {
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
        public Builder setStartTime(@Nullable final LocalDateTime localStartTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEndTime(@Nullable final LocalDateTime localEndTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public LocalTimeRangeFilter build() {
            throw new RuntimeException("Stub!");
        }
    }
}
