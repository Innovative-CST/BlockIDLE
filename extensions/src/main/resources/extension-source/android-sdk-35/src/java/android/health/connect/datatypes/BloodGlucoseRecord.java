package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import android.health.connect.datatypes.units.BloodGlucose;

public final class BloodGlucoseRecord extends InstantRecord
{
    BloodGlucoseRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSpecimenSource() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public BloodGlucose getLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRelationToMeal() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMealType() {
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
        public Builder(@NonNull final Metadata metadata, @NonNull final Instant time, final int specimenSource, @NonNull final BloodGlucose level, final int relationToMeal, final int mealType) {
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
        public BloodGlucoseRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class RelationToMealType
    {
        public static final int RELATION_TO_MEAL_AFTER_MEAL = 4;
        public static final int RELATION_TO_MEAL_BEFORE_MEAL = 3;
        public static final int RELATION_TO_MEAL_FASTING = 2;
        public static final int RELATION_TO_MEAL_GENERAL = 1;
        public static final int RELATION_TO_MEAL_UNKNOWN = 0;
        
        RelationToMealType() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class SpecimenSource
    {
        public static final int SPECIMEN_SOURCE_CAPILLARY_BLOOD = 2;
        public static final int SPECIMEN_SOURCE_INTERSTITIAL_FLUID = 1;
        public static final int SPECIMEN_SOURCE_PLASMA = 3;
        public static final int SPECIMEN_SOURCE_SERUM = 4;
        public static final int SPECIMEN_SOURCE_TEARS = 5;
        public static final int SPECIMEN_SOURCE_UNKNOWN = 0;
        public static final int SPECIMEN_SOURCE_WHOLE_BLOOD = 6;
        
        SpecimenSource() {
            throw new RuntimeException("Stub!");
        }
    }
}
