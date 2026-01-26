package android.health.connect.datatypes;

import java.util.List;

public final class PlannedExerciseBlock
{
    PlannedExerciseBlock() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<PlannedExerciseStep> getSteps() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRepetitions() {
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
        public Builder(final int repetitions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRepetitions(final int repetitions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDescription(@Nullable final CharSequence description) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addStep(@NonNull final PlannedExerciseStep step) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSteps(@NonNull final List<PlannedExerciseStep> steps) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearSteps() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PlannedExerciseBlock build() {
            throw new RuntimeException("Stub!");
        }
    }
}
