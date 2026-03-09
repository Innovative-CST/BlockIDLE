package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import java.util.List;
import java.time.Duration;
import java.time.LocalDate;

public final class PlannedExerciseSessionRecord extends IntervalRecord
{
    PlannedExerciseSessionRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public int getExerciseType() {
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
    public LocalDate getStartDate() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Duration getDuration() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasExplicitTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getCompletedExerciseSessionId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<PlannedExerciseBlock> getBlocks() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, final int exerciseType, @NonNull final Instant startTime, @NonNull final Instant endTime) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final Metadata metadata, final int exerciseType, @NonNull final LocalDate startDate, @NonNull final Duration duration) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMetadata(@NonNull final Metadata metadata) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExerciseType(final int exerciseType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStartTime(@NonNull final Instant startTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEndTime(@NonNull final Instant endTime) {
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
        public Builder addBlock(@NonNull final PlannedExerciseBlock block) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBlocks(@NonNull final List<PlannedExerciseBlock> blocks) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearBlocks() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PlannedExerciseSessionRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
