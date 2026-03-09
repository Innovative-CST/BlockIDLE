package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;

public final class Vo2MaxRecord extends InstantRecord
{
    Vo2MaxRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMeasurementMethod() {
        throw new RuntimeException("Stub!");
    }
    
    public double getVo2MillilitersPerMinuteKilogram() {
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
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant time, final int measurementMethod, final double vo2MillilitersPerMinuteKilogram) {
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
        public Vo2MaxRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Vo2MaxMeasurementMethod
    {
        public static final int MEASUREMENT_METHOD_COOPER_TEST = 3;
        public static final int MEASUREMENT_METHOD_HEART_RATE_RATIO = 2;
        public static final int MEASUREMENT_METHOD_METABOLIC_CART = 1;
        public static final int MEASUREMENT_METHOD_MULTISTAGE_FITNESS_TEST = 4;
        public static final int MEASUREMENT_METHOD_OTHER = 0;
        public static final int MEASUREMENT_METHOD_ROCKPORT_FITNESS_TEST = 5;
        
        Vo2MaxMeasurementMethod() {
            throw new RuntimeException("Stub!");
        }
    }
}
