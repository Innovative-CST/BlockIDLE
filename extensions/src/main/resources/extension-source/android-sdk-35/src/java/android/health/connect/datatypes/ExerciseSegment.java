package android.health.connect.datatypes;

import java.time.Instant;

public final class ExerciseSegment
{
    ExerciseSegment() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSegmentType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRepetitionsCount() {
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
        public Builder(@NonNull final Instant startTime, @NonNull final Instant endTime, final int segmentType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRepetitionsCount(final int repetitionsCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ExerciseSegment build() {
            throw new RuntimeException("Stub!");
        }
    }
}
