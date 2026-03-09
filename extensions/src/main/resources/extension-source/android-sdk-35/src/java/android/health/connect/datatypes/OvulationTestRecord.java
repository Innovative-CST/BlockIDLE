package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;

public final class OvulationTestRecord extends InstantRecord
{
    OvulationTestRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public int getResult() {
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
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant time, final int result) {
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
        public OvulationTestRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class OvulationTestResult
    {
        public static final int RESULT_HIGH = 2;
        public static final int RESULT_INCONCLUSIVE = 0;
        public static final int RESULT_NEGATIVE = 3;
        public static final int RESULT_POSITIVE = 1;
        
        OvulationTestResult() {
            throw new RuntimeException("Stub!");
        }
    }
}
