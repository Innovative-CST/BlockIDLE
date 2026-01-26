package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;

public final class MenstruationFlowRecord extends InstantRecord
{
    MenstruationFlowRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFlow() {
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
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant time, final int flow) {
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
        public MenstruationFlowRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class MenstruationFlowType
    {
        public static final int FLOW_HEAVY = 3;
        public static final int FLOW_LIGHT = 1;
        public static final int FLOW_MEDIUM = 2;
        public static final int FLOW_UNKNOWN = 0;
        
        MenstruationFlowType() {
            throw new RuntimeException("Stub!");
        }
    }
}
