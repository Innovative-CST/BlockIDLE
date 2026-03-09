package android.adservices.ondevicepersonalization;

import java.time.Duration;

public final class TrainingInterval
{
    public static final int SCHEDULING_MODE_ONE_TIME = 1;
    public static final int SCHEDULING_MODE_RECURRENT = 2;
    
    TrainingInterval() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSchedulingMode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Duration getMinimumInterval() {
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
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSchedulingMode(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinimumInterval(@NonNull final Duration value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TrainingInterval build() {
            throw new RuntimeException("Stub!");
        }
    }
}
