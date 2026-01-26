package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import android.health.connect.datatypes.units.Length;

public final class DistanceRecord extends IntervalRecord
{
    @NonNull
    public static final AggregationType<Length> DISTANCE_TOTAL;
    
    DistanceRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Length getDistance() {
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
    
    static {
        DISTANCE_TOTAL = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant startTime, @NonNull final Instant endTime, @NonNull final Length distance) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStartZoneOffset(@NonNull final ZoneOffset startZoneOffset) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEndZoneOffset(@NonNull final ZoneOffset endZoneOffset) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearStartZoneOffset() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearEndZoneOffset() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public DistanceRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
