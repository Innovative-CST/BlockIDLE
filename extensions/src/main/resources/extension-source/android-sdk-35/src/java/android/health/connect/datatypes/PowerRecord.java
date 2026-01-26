package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import java.util.List;
import android.health.connect.datatypes.units.Power;

public final class PowerRecord extends IntervalRecord
{
    @NonNull
    public static final AggregationType<Power> POWER_AVG;
    @NonNull
    public static final AggregationType<Power> POWER_MAX;
    @NonNull
    public static final AggregationType<Power> POWER_MIN;
    
    PowerRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<PowerRecordSample> getSamples() {
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
        POWER_AVG = null;
        POWER_MAX = null;
        POWER_MIN = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant startTime, @NonNull final Instant endTime, @NonNull final List<PowerRecordSample> powerRecordSamples) {
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
        public PowerRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class PowerRecordSample
    {
        public PowerRecordSample(@NonNull final Power power, @NonNull final Instant time) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Power getPower() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Instant getTime() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object object) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
    }
}
