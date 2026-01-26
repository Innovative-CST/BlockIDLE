package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import android.health.connect.datatypes.units.Mass;

public final class BodyWaterMassRecord extends InstantRecord
{
    BodyWaterMassRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Mass getBodyWaterMass() {
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
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant time, @NonNull final Mass bodyWaterMass) {
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
        public BodyWaterMassRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
