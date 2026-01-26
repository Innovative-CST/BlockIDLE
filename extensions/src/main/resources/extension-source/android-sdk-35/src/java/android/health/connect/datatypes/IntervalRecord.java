package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;

public abstract class IntervalRecord extends Record
{
    IntervalRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Instant getStartTime() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ZoneOffset getStartZoneOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Instant getEndTime() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ZoneOffset getEndZoneOffset() {
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
