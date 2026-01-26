package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;

public abstract class InstantRecord extends Record
{
    InstantRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Instant getTime() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ZoneOffset getZoneOffset() {
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
