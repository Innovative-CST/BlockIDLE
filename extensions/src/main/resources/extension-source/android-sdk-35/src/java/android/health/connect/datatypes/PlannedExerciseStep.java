package android.health.connect.datatypes;

import java.util.List;

public final class PlannedExerciseStep
{
    public static final int EXERCISE_CATEGORY_ACTIVE = 3;
    public static final int EXERCISE_CATEGORY_COOLDOWN = 4;
    public static final int EXERCISE_CATEGORY_RECOVERY = 5;
    public static final int EXERCISE_CATEGORY_REST = 2;
    public static final int EXERCISE_CATEGORY_UNKNOWN = 0;
    public static final int EXERCISE_CATEGORY_WARMUP = 1;
    
    PlannedExerciseStep() {
        throw new RuntimeException("Stub!");
    }
    
    public int getExerciseType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public int getExerciseCategory() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ExerciseCompletionGoal getCompletionGoal() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ExercisePerformanceGoal> getPerformanceGoals() {
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
        public Builder(final int exerciseType, final int exerciseCategory, @NonNull final ExerciseCompletionGoal completionGoal) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExerciseType(final int exerciseType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExerciseCategory(final int category) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDescription(@Nullable final CharSequence description) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCompletionGoal(@NonNull final ExerciseCompletionGoal completionGoal) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addPerformanceGoal(@NonNull final ExercisePerformanceGoal performanceGoal) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPerformanceGoals(@NonNull final List<ExercisePerformanceGoal> performanceGoals) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearPerformanceGoals() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PlannedExerciseStep build() {
            throw new RuntimeException("Stub!");
        }
    }
}
