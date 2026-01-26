package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import android.health.connect.datatypes.units.Mass;

public final class WeightRecord extends InstantRecord
{
    @NonNull
    public static final AggregationType<Mass> WEIGHT_AVG;
    @NonNull
    public static final AggregationType<Mass> WEIGHT_MAX;
    @NonNull
    public static final AggregationType<Mass> WEIGHT_MIN;
    
    WeightRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Mass getWeight() {
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
        WEIGHT_AVG = null;
        WEIGHT_MAX = null;
        WEIGHT_MIN = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant time, @NonNull final Mass weight) {
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
        public WeightRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
