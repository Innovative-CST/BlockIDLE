package android.health.connect.datatypes;

import java.time.Instant;
import android.health.connect.datatypes.units.Length;

public final class ExerciseLap
{
    ExerciseLap() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Length getLength() {
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
        public Builder(@NonNull final Instant startTime, @NonNull final Instant endTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLength(@NonNull final Length length) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ExerciseLap build() {
            throw new RuntimeException("Stub!");
        }
    }
}
