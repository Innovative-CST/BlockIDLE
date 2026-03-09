package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import android.health.connect.datatypes.units.Length;

public final class HeightRecord extends InstantRecord
{
    @NonNull
    public static final AggregationType<Length> HEIGHT_AVG;
    @NonNull
    public static final AggregationType<Length> HEIGHT_MAX;
    @NonNull
    public static final AggregationType<Length> HEIGHT_MIN;
    
    HeightRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Length getHeight() {
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
        HEIGHT_AVG = null;
        HEIGHT_MAX = null;
        HEIGHT_MIN = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant time, @NonNull final Length height) {
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
        public HeightRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
