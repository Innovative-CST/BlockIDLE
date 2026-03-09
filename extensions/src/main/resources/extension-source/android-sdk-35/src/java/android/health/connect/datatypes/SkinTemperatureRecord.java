package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import java.util.List;
import android.health.connect.datatypes.units.Temperature;
import android.health.connect.datatypes.units.TemperatureDelta;

public final class SkinTemperatureRecord extends IntervalRecord
{
    public static final int MEASUREMENT_LOCATION_FINGER = 1;
    public static final int MEASUREMENT_LOCATION_TOE = 2;
    public static final int MEASUREMENT_LOCATION_UNKNOWN = 0;
    public static final int MEASUREMENT_LOCATION_WRIST = 3;
    @NonNull
    public static final AggregationType<TemperatureDelta> SKIN_TEMPERATURE_DELTA_AVG;
    @NonNull
    public static final AggregationType<TemperatureDelta> SKIN_TEMPERATURE_DELTA_MAX;
    @NonNull
    public static final AggregationType<TemperatureDelta> SKIN_TEMPERATURE_DELTA_MIN;
    
    SkinTemperatureRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Temperature getBaseline() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Delta> getDeltas() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMeasurementLocation() {
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
        SKIN_TEMPERATURE_DELTA_AVG = null;
        SKIN_TEMPERATURE_DELTA_MAX = null;
        SKIN_TEMPERATURE_DELTA_MIN = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant startTime, @NonNull final Instant endTime) {
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
        public Builder setBaseline(@Nullable final Temperature baseline) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDeltas(@NonNull final List<Delta> deltas) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMeasurementLocation(final int measurementLocation) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SkinTemperatureRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Delta
    {
        public Delta(@NonNull final TemperatureDelta delta, @NonNull final Instant time) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TemperatureDelta getDelta() {
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
