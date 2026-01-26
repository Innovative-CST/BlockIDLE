package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import java.util.List;

public final class SleepSessionRecord extends IntervalRecord
{
    @NonNull
    public static final AggregationType<Long> SLEEP_DURATION_TOTAL;
    
    SleepSessionRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getNotes() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getTitle() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Stage> getStages() {
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
        SLEEP_DURATION_TOTAL = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant startTime, @NonNull final Instant endTime) {
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
        public Builder setNotes(@Nullable final CharSequence notes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTitle(@Nullable final CharSequence title) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStages(@NonNull final List<Stage> stages) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SleepSessionRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class Stage
    {
        public Stage(@NonNull final Instant startTime, @NonNull final Instant endTime, final int stageType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Instant getStartTime() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Instant getEndTime() {
            throw new RuntimeException("Stub!");
        }
        
        public int getType() {
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
    }
    
    public static final class StageType
    {
        public static final int STAGE_TYPE_AWAKE = 1;
        public static final int STAGE_TYPE_AWAKE_IN_BED = 7;
        public static final int STAGE_TYPE_AWAKE_OUT_OF_BED = 3;
        public static final int STAGE_TYPE_SLEEPING = 2;
        public static final int STAGE_TYPE_SLEEPING_DEEP = 5;
        public static final int STAGE_TYPE_SLEEPING_LIGHT = 4;
        public static final int STAGE_TYPE_SLEEPING_REM = 6;
        public static final int STAGE_TYPE_UNKNOWN = 0;
        
        StageType() {
            throw new RuntimeException("Stub!");
        }
    }
}
