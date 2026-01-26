package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;

public final class RestingHeartRateRecord extends InstantRecord
{
    @NonNull
    public static final AggregationType<Long> BPM_AVG;
    @NonNull
    public static final AggregationType<Long> BPM_MAX;
    @NonNull
    public static final AggregationType<Long> BPM_MIN;
    
    RestingHeartRateRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public long getBeatsPerMinute() {
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
        BPM_AVG = null;
        BPM_MAX = null;
        BPM_MIN = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant time, final long beatsPerMinute) {
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
        public RestingHeartRateRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
