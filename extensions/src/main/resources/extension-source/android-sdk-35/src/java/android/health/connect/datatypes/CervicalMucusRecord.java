package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;

public final class CervicalMucusRecord extends InstantRecord
{
    CervicalMucusRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSensation() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAppearance() {
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
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant time, final int sensation, final int appearance) {
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
        public CervicalMucusRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class CervicalMucusAppearance
    {
        public static final int APPEARANCE_CREAMY = 3;
        public static final int APPEARANCE_DRY = 1;
        public static final int APPEARANCE_EGG_WHITE = 5;
        public static final int APPEARANCE_STICKY = 2;
        public static final int APPEARANCE_UNKNOWN = 0;
        public static final int APPEARANCE_UNUSUAL = 6;
        public static final int APPEARANCE_WATERY = 4;
        
        CervicalMucusAppearance() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class CervicalMucusSensation
    {
        public static final int SENSATION_HEAVY = 3;
        public static final int SENSATION_LIGHT = 1;
        public static final int SENSATION_MEDIUM = 2;
        public static final int SENSATION_UNKNOWN = 0;
        
        CervicalMucusSensation() {
            throw new RuntimeException("Stub!");
        }
    }
}
