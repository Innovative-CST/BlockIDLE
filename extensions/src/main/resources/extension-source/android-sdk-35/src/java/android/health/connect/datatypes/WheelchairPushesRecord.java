package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;

public final class WheelchairPushesRecord extends IntervalRecord
{
    @NonNull
    public static final AggregationType<Long> WHEEL_CHAIR_PUSHES_COUNT_TOTAL;
    
    WheelchairPushesRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public long getCount() {
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
        WHEEL_CHAIR_PUSHES_COUNT_TOTAL = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant startTime, @NonNull final Instant endTime, final long count) {
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
        public WheelchairPushesRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
