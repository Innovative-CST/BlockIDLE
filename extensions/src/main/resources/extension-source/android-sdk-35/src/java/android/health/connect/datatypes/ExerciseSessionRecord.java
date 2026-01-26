package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import java.util.List;

public final class ExerciseSessionRecord extends IntervalRecord
{
    @NonNull
    public static final AggregationType<Long> EXERCISE_DURATION_TOTAL;
    
    ExerciseSessionRecord() {
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
    
    @Nullable
    public ExerciseRoute getRoute() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ExerciseSegment> getSegments() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ExerciseLap> getLaps() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public boolean hasRoute() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPlannedExerciseSessionId() {
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
        EXERCISE_DURATION_TOTAL = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant startTime, @NonNull final Instant endTime, final int exerciseType) {
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
        public Builder setRoute(@Nullable final ExerciseRoute route) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLaps(@NonNull final List<ExerciseLap> laps) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSegments(@NonNull final List<ExerciseSegment> segments) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPlannedExerciseSessionId(@Nullable final String id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ExerciseSessionRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
