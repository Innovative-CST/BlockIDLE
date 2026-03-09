package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;

public final class HeartRateVariabilityRmssdRecord extends InstantRecord
{
    HeartRateVariabilityRmssdRecord() {
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
    
    public double getHeartRateVariabilityMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant time, final double heartRateVariabilityMillis) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setZoneOffset(@NonNull final ZoneOffset zoneOffset) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearZoneOffset() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public HeartRateVariabilityRmssdRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
