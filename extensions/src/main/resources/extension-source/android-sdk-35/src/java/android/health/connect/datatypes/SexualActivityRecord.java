package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;

public final class SexualActivityRecord extends InstantRecord
{
    SexualActivityRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public int getProtectionUsed() {
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
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant time, final int protectionUsed) {
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
        public SexualActivityRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class SexualActivityProtectionUsed
    {
        public static final int PROTECTION_USED_PROTECTED = 1;
        public static final int PROTECTION_USED_UNKNOWN = 0;
        public static final int PROTECTION_USED_UNPROTECTED = 2;
        
        SexualActivityProtectionUsed() {
            throw new RuntimeException("Stub!");
        }
    }
}
