package android.health.connect.datatypes;

import java.time.ZoneOffset;
import java.time.Instant;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Mass;

public final class NutritionRecord extends IntervalRecord
{
    @NonNull
    public static final AggregationType<Mass> BIOTIN_TOTAL;
    @NonNull
    public static final AggregationType<Mass> CAFFEINE_TOTAL;
    @NonNull
    public static final AggregationType<Mass> CALCIUM_TOTAL;
    @NonNull
    public static final AggregationType<Mass> CHLORIDE_TOTAL;
    @NonNull
    public static final AggregationType<Mass> CHOLESTEROL_TOTAL;
    @NonNull
    public static final AggregationType<Mass> CHROMIUM_TOTAL;
    @NonNull
    public static final AggregationType<Mass> COPPER_TOTAL;
    @NonNull
    public static final AggregationType<Mass> DIETARY_FIBER_TOTAL;
    @NonNull
    public static final AggregationType<Energy> ENERGY_FROM_FAT_TOTAL;
    @NonNull
    public static final AggregationType<Energy> ENERGY_TOTAL;
    @NonNull
    public static final AggregationType<Mass> FOLATE_TOTAL;
    @NonNull
    public static final AggregationType<Mass> FOLIC_ACID_TOTAL;
    @NonNull
    public static final AggregationType<Mass> IODINE_TOTAL;
    @NonNull
    public static final AggregationType<Mass> IRON_TOTAL;
    @NonNull
    public static final AggregationType<Mass> MAGNESIUM_TOTAL;
    @NonNull
    public static final AggregationType<Mass> MANGANESE_TOTAL;
    @NonNull
    public static final AggregationType<Mass> MOLYBDENUM_TOTAL;
    @NonNull
    public static final AggregationType<Mass> MONOUNSATURATED_FAT_TOTAL;
    @NonNull
    public static final AggregationType<Mass> NIACIN_TOTAL;
    @NonNull
    public static final AggregationType<Mass> PANTOTHENIC_ACID_TOTAL;
    @NonNull
    public static final AggregationType<Mass> PHOSPHORUS_TOTAL;
    @NonNull
    public static final AggregationType<Mass> POLYUNSATURATED_FAT_TOTAL;
    @NonNull
    public static final AggregationType<Mass> POTASSIUM_TOTAL;
    @NonNull
    public static final AggregationType<Mass> PROTEIN_TOTAL;
    @NonNull
    public static final AggregationType<Mass> RIBOFLAVIN_TOTAL;
    @NonNull
    public static final AggregationType<Mass> SATURATED_FAT_TOTAL;
    @NonNull
    public static final AggregationType<Mass> SELENIUM_TOTAL;
    @NonNull
    public static final AggregationType<Mass> SODIUM_TOTAL;
    @NonNull
    public static final AggregationType<Mass> SUGAR_TOTAL;
    @NonNull
    public static final AggregationType<Mass> THIAMIN_TOTAL;
    @NonNull
    public static final AggregationType<Mass> TOTAL_CARBOHYDRATE_TOTAL;
    @NonNull
    public static final AggregationType<Mass> TOTAL_FAT_TOTAL;
    @NonNull
    public static final AggregationType<Mass> TRANS_FAT_TOTAL;
    @NonNull
    public static final AggregationType<Mass> UNSATURATED_FAT_TOTAL;
    @NonNull
    public static final AggregationType<Mass> VITAMIN_A_TOTAL;
    @NonNull
    public static final AggregationType<Mass> VITAMIN_B12_TOTAL;
    @NonNull
    public static final AggregationType<Mass> VITAMIN_B6_TOTAL;
    @NonNull
    public static final AggregationType<Mass> VITAMIN_C_TOTAL;
    @NonNull
    public static final AggregationType<Mass> VITAMIN_D_TOTAL;
    @NonNull
    public static final AggregationType<Mass> VITAMIN_E_TOTAL;
    @NonNull
    public static final AggregationType<Mass> VITAMIN_K_TOTAL;
    @NonNull
    public static final AggregationType<Mass> ZINC_TOTAL;
    
    NutritionRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMealType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getUnsaturatedFat() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getPotassium() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getThiamin() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getTransFat() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getManganese() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Energy getEnergyFromFat() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getCaffeine() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getDietaryFiber() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getSelenium() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getVitaminB6() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getProtein() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getChloride() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getCholesterol() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getCopper() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getIodine() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getVitaminB12() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getZinc() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getRiboflavin() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Energy getEnergy() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getMolybdenum() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getPhosphorus() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getChromium() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getTotalFat() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getCalcium() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getVitaminC() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getVitaminE() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getBiotin() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getVitaminD() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getNiacin() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getMagnesium() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getTotalCarbohydrate() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getVitaminK() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getPolyunsaturatedFat() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getSaturatedFat() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getSodium() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getFolate() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getMonounsaturatedFat() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getPantothenicAcid() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getMealName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getIron() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getVitaminA() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getFolicAcid() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Mass getSugar() {
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
        BIOTIN_TOTAL = null;
        CAFFEINE_TOTAL = null;
        CALCIUM_TOTAL = null;
        CHLORIDE_TOTAL = null;
        CHOLESTEROL_TOTAL = null;
        CHROMIUM_TOTAL = null;
        COPPER_TOTAL = null;
        DIETARY_FIBER_TOTAL = null;
        ENERGY_FROM_FAT_TOTAL = null;
        ENERGY_TOTAL = null;
        FOLATE_TOTAL = null;
        FOLIC_ACID_TOTAL = null;
        IODINE_TOTAL = null;
        IRON_TOTAL = null;
        MAGNESIUM_TOTAL = null;
        MANGANESE_TOTAL = null;
        MOLYBDENUM_TOTAL = null;
        MONOUNSATURATED_FAT_TOTAL = null;
        NIACIN_TOTAL = null;
        PANTOTHENIC_ACID_TOTAL = null;
        PHOSPHORUS_TOTAL = null;
        POLYUNSATURATED_FAT_TOTAL = null;
        POTASSIUM_TOTAL = null;
        PROTEIN_TOTAL = null;
        RIBOFLAVIN_TOTAL = null;
        SATURATED_FAT_TOTAL = null;
        SELENIUM_TOTAL = null;
        SODIUM_TOTAL = null;
        SUGAR_TOTAL = null;
        THIAMIN_TOTAL = null;
        TOTAL_CARBOHYDRATE_TOTAL = null;
        TOTAL_FAT_TOTAL = null;
        TRANS_FAT_TOTAL = null;
        UNSATURATED_FAT_TOTAL = null;
        VITAMIN_A_TOTAL = null;
        VITAMIN_B12_TOTAL = null;
        VITAMIN_B6_TOTAL = null;
        VITAMIN_C_TOTAL = null;
        VITAMIN_D_TOTAL = null;
        VITAMIN_E_TOTAL = null;
        VITAMIN_K_TOTAL = null;
        ZINC_TOTAL = null;
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
        public Builder setUnsaturatedFat(@Nullable final Mass unsaturatedFat) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPotassium(@Nullable final Mass potassium) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setThiamin(@Nullable final Mass thiamin) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMealType(final int mealType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTransFat(@Nullable final Mass transFat) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setManganese(@Nullable final Mass manganese) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEnergyFromFat(@Nullable final Energy energyFromFat) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCaffeine(@Nullable final Mass caffeine) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDietaryFiber(@Nullable final Mass dietaryFiber) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSelenium(@Nullable final Mass selenium) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVitaminB6(@Nullable final Mass vitaminB6) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setProtein(@Nullable final Mass protein) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setChloride(@Nullable final Mass chloride) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCholesterol(@Nullable final Mass cholesterol) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCopper(@Nullable final Mass copper) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIodine(@Nullable final Mass iodine) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVitaminB12(@Nullable final Mass vitaminB12) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setZinc(@Nullable final Mass zinc) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRiboflavin(@Nullable final Mass riboflavin) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEnergy(@Nullable final Energy energy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMolybdenum(@Nullable final Mass molybdenum) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPhosphorus(@Nullable final Mass phosphorus) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setChromium(@Nullable final Mass chromium) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTotalFat(@Nullable final Mass totalFat) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCalcium(@Nullable final Mass calcium) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVitaminC(@Nullable final Mass vitaminC) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVitaminE(@Nullable final Mass vitaminE) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBiotin(@Nullable final Mass biotin) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVitaminD(@Nullable final Mass vitaminD) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNiacin(@Nullable final Mass niacin) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMagnesium(@Nullable final Mass magnesium) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTotalCarbohydrate(@Nullable final Mass totalCarbohydrate) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVitaminK(@Nullable final Mass vitaminK) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPolyunsaturatedFat(@Nullable final Mass polyunsaturatedFat) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSaturatedFat(@Nullable final Mass saturatedFat) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSodium(@Nullable final Mass sodium) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFolate(@Nullable final Mass folate) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMonounsaturatedFat(@Nullable final Mass monounsaturatedFat) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPantothenicAcid(@Nullable final Mass pantothenicAcid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMealName(@NonNull final String mealName) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIron(@Nullable final Mass iron) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVitaminA(@Nullable final Mass vitaminA) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFolicAcid(@Nullable final Mass folicAcid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSugar(@Nullable final Mass sugar) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public NutritionRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
