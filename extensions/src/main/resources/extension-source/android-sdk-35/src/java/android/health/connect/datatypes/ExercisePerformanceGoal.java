package android.health.connect.datatypes;

import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Velocity;
import android.health.connect.datatypes.units.Power;

public abstract class ExercisePerformanceGoal
{
    ExercisePerformanceGoal() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class AmrapGoal extends ExercisePerformanceGoal
    {
        @NonNull
        public static final AmrapGoal INSTANCE;
        
        AmrapGoal() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            INSTANCE = null;
        }
    }
    
    public static final class CadenceGoal extends ExercisePerformanceGoal
    {
        public CadenceGoal(final double minRpm, final double maxRpm) {
            throw new RuntimeException("Stub!");
        }
        
        public double getMinRpm() {
            throw new RuntimeException("Stub!");
        }
        
        public double getMaxRpm() {
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
    
    public static final class HeartRateGoal extends ExercisePerformanceGoal
    {
        public HeartRateGoal(final int minBpm, final int maxBpm) {
            throw new RuntimeException("Stub!");
        }
        
        public int getMinBpm() {
            throw new RuntimeException("Stub!");
        }
        
        public int getMaxBpm() {
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
    
    public static final class PowerGoal extends ExercisePerformanceGoal
    {
        public PowerGoal(@NonNull final Power minPower, @NonNull final Power maxPower) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Power getMinPower() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Power getMaxPower() {
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
    
    public static final class RateOfPerceivedExertionGoal extends ExercisePerformanceGoal
    {
        public RateOfPerceivedExertionGoal(final int rpe) {
            throw new RuntimeException("Stub!");
        }
        
        public int getRpe() {
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
    
    public static final class SpeedGoal extends ExercisePerformanceGoal
    {
        public SpeedGoal(@NonNull final Velocity minSpeed, @NonNull final Velocity maxSpeed) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Velocity getMinSpeed() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Velocity getMaxSpeed() {
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
    
    public static final class UnknownGoal extends ExercisePerformanceGoal
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
    
    public static final class WeightGoal extends ExercisePerformanceGoal
    {
        public WeightGoal(@NonNull final Mass mass) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Mass getMass() {
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
}
