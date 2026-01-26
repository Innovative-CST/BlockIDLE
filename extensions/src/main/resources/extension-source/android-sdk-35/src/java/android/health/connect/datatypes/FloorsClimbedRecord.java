package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;

public final class FloorsClimbedRecord extends IntervalRecord
{
    @NonNull
    public static final AggregationType<Double> FLOORS_CLIMBED_TOTAL;
    
    FloorsClimbedRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public double getFloors() {
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
        FLOORS_CLIMBED_TOTAL = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant startTime, @NonNull final Instant endTime, final double floors) {
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
        public FloorsClimbedRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
