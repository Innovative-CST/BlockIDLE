package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import java.util.List;

public final class HeartRateRecord extends IntervalRecord
{
    @NonNull
    public static final AggregationType<Long> BPM_AVG;
    @NonNull
    public static final AggregationType<Long> BPM_MAX;
    @NonNull
    public static final AggregationType<Long> BPM_MIN;
    @NonNull
    public static final AggregationType<Long> HEART_MEASUREMENTS_COUNT;
    
    HeartRateRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<HeartRateSample> getSamples() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object object) {
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
        HEART_MEASUREMENTS_COUNT = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant startTime, @NonNull final Instant endTime, @NonNull final List<HeartRateSample> heartRateSamples) {
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
        public HeartRateRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class HeartRateSample
    {
        public HeartRateSample(final long beatsPerMinute, @NonNull final Instant time) {
            throw new RuntimeException("Stub!");
        }
        
        public long getBeatsPerMinute() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Instant getTime() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object object) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
    }
}
