package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import java.util.List;

public final class CyclingPedalingCadenceRecord extends IntervalRecord
{
    @NonNull
    public static final AggregationType<Double> RPM_AVG;
    @NonNull
    public static final AggregationType<Double> RPM_MAX;
    @NonNull
    public static final AggregationType<Double> RPM_MIN;
    
    CyclingPedalingCadenceRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<CyclingPedalingCadenceRecordSample> getSamples() {
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
        RPM_AVG = null;
        RPM_MAX = null;
        RPM_MIN = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant startTime, @NonNull final Instant endTime, @NonNull final List<CyclingPedalingCadenceRecordSample> cyclingPedalingCadenceRecordSamples) {
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
        public CyclingPedalingCadenceRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class CyclingPedalingCadenceRecordSample
    {
        public CyclingPedalingCadenceRecordSample(final double revolutionsPerMinute, @NonNull final Instant time) {
            throw new RuntimeException("Stub!");
        }
        
        public double getRevolutionsPerMinute() {
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
