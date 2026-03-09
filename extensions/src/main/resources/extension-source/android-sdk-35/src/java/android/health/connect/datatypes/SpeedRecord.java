package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import java.util.List;
import android.health.connect.datatypes.units.Velocity;

public final class SpeedRecord extends IntervalRecord
{
    @NonNull
    public static final AggregationType<Velocity> SPEED_AVG;
    @NonNull
    public static final AggregationType<Velocity> SPEED_MAX;
    @NonNull
    public static final AggregationType<Velocity> SPEED_MIN;
    
    SpeedRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<SpeedRecordSample> getSamples() {
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
        SPEED_AVG = null;
        SPEED_MAX = null;
        SPEED_MIN = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant startTime, @NonNull final Instant endTime, @NonNull final List<SpeedRecordSample> speedRecordSamples) {
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
        public SpeedRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class SpeedRecordSample
    {
        public SpeedRecordSample(@NonNull final Velocity speed, @NonNull final Instant time) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Velocity getSpeed() {
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
