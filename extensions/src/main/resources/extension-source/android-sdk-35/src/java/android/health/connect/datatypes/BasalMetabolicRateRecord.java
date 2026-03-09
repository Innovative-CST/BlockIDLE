package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import android.health.connect.datatypes.units.Power;
import android.health.connect.datatypes.units.Energy;

public final class BasalMetabolicRateRecord extends InstantRecord
{
    @NonNull
    public static final AggregationType<Energy> BASAL_CALORIES_TOTAL;
    
    BasalMetabolicRateRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Power getBasalMetabolicRate() {
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
        BASAL_CALORIES_TOTAL = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant time, @NonNull final Power basalMetabolicRate) {
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
        public BasalMetabolicRateRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
