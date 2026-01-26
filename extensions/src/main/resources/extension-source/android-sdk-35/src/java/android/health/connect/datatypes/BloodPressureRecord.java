package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import android.health.connect.datatypes.units.Pressure;

public final class BloodPressureRecord extends InstantRecord
{
    @NonNull
    public static final AggregationType<Pressure> DIASTOLIC_AVG;
    @NonNull
    public static final AggregationType<Pressure> DIASTOLIC_MAX;
    @NonNull
    public static final AggregationType<Pressure> DIASTOLIC_MIN;
    @NonNull
    public static final AggregationType<Pressure> SYSTOLIC_AVG;
    @NonNull
    public static final AggregationType<Pressure> SYSTOLIC_MAX;
    @NonNull
    public static final AggregationType<Pressure> SYSTOLIC_MIN;
    
    BloodPressureRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMeasurementLocation() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Pressure getSystolic() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Pressure getDiastolic() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBodyPosition() {
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
        DIASTOLIC_AVG = null;
        DIASTOLIC_MAX = null;
        DIASTOLIC_MIN = null;
        SYSTOLIC_AVG = null;
        SYSTOLIC_MAX = null;
        SYSTOLIC_MIN = null;
    }
    
    public static final class BloodPressureMeasurementLocation
    {
        public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_LEFT_UPPER_ARM = 3;
        public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_LEFT_WRIST = 1;
        public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_RIGHT_UPPER_ARM = 4;
        public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_RIGHT_WRIST = 2;
        public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_UNKNOWN = 0;
        
        BloodPressureMeasurementLocation() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class BodyPosition
    {
        public static final int BODY_POSITION_LYING_DOWN = 3;
        public static final int BODY_POSITION_RECLINING = 4;
        public static final int BODY_POSITION_SITTING_DOWN = 2;
        public static final int BODY_POSITION_STANDING_UP = 1;
        public static final int BODY_POSITION_UNKNOWN = 0;
        
        BodyPosition() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant time, final int measurementLocation, @NonNull final Pressure systolic, @NonNull final Pressure diastolic, final int bodyPosition) {
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
        public BloodPressureRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
