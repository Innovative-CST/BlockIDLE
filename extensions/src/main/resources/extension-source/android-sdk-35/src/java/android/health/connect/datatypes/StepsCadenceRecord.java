package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import java.util.List;

public final class StepsCadenceRecord extends IntervalRecord
{
    @NonNull
    public static final AggregationType<Double> STEPS_CADENCE_RATE_AVG;
    @NonNull
    public static final AggregationType<Double> STEPS_CADENCE_RATE_MAX;
    @NonNull
    public static final AggregationType<Double> STEPS_CADENCE_RATE_MIN;
    
    StepsCadenceRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<StepsCadenceRecordSample> getSamples() {
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
        STEPS_CADENCE_RATE_AVG = null;
        STEPS_CADENCE_RATE_MAX = null;
        STEPS_CADENCE_RATE_MIN = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant startTime, @NonNull final Instant endTime, @NonNull final List<StepsCadenceRecordSample> stepsCadenceRecordSamples) {
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
        public StepsCadenceRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class StepsCadenceRecordSample
    {
        public StepsCadenceRecordSample(final double rate, @NonNull final Instant time) {
            throw new RuntimeException("Stub!");
        }
        
        public double getRate() {
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
