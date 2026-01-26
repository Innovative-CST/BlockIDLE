package android.health.connect.datatypes;

import java.time.Duration;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Energy;

public abstract class ExerciseCompletionGoal
{
    ExerciseCompletionGoal() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class ActiveCaloriesBurnedGoal extends ExerciseCompletionGoal
    {
        public ActiveCaloriesBurnedGoal(@NonNull final Energy activeCalories) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Energy getActiveCalories() {
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
    
    public static final class DistanceGoal extends ExerciseCompletionGoal
    {
        public DistanceGoal(@NonNull final Length distance) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Length getDistance() {
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
    }
    
    public static final class DistanceWithVariableRestGoal extends ExerciseCompletionGoal
    {
        public DistanceWithVariableRestGoal(@NonNull final Length distance, @NonNull final Duration duration) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Length getDistance() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Duration getDuration() {
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
    }
    
    public static final class DurationGoal extends ExerciseCompletionGoal
    {
        public DurationGoal(@NonNull final Duration duration) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Duration getDuration() {
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
    }
    
    public static final class RepetitionsGoal extends ExerciseCompletionGoal
    {
        public RepetitionsGoal(final int repetitions) {
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
    }
    
    public static final class StepsGoal extends ExerciseCompletionGoal
    {
        public StepsGoal(final int steps) {
            throw new RuntimeException("Stub!");
        }
        
        public int getSteps() {
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
    }
    
    public static final class TotalCaloriesBurnedGoal extends ExerciseCompletionGoal
    {
        public TotalCaloriesBurnedGoal(@NonNull final Energy totalCalories) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Energy getTotalCalories() {
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
    }
    
    public static final class UnknownGoal extends ExerciseCompletionGoal
    {
        @NonNull
        public static final UnknownGoal INSTANCE;
        
        UnknownGoal() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            INSTANCE = null;
        }
    }
    
    public static final class UnspecifiedGoal extends ExerciseCompletionGoal
    {
        @NonNull
        public static final UnspecifiedGoal INSTANCE;
        
        UnspecifiedGoal() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            INSTANCE = null;
        }
    }
}
