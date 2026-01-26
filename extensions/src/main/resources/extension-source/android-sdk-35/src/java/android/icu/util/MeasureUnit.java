package android.icu.util;

import java.util.Set;
import java.util.List;
import java.io.Serializable;

public class MeasureUnit implements Serializable
{
    public static final MeasureUnit ACRE;
    public static final MeasureUnit ACRE_FOOT;
    public static final MeasureUnit AMPERE;
    public static final MeasureUnit ARC_MINUTE;
    public static final MeasureUnit ARC_SECOND;
    public static final MeasureUnit ASTRONOMICAL_UNIT;
    public static final MeasureUnit ATMOSPHERE;
    public static final MeasureUnit BIT;
    public static final MeasureUnit BUSHEL;
    public static final MeasureUnit BYTE;
    public static final MeasureUnit CALORIE;
    public static final MeasureUnit CANDELA;
    public static final MeasureUnit CARAT;
    public static final MeasureUnit CELSIUS;
    public static final MeasureUnit CENTILITER;
    public static final MeasureUnit CENTIMETER;
    public static final MeasureUnit CENTURY;
    public static final MeasureUnit CUBIC_CENTIMETER;
    public static final MeasureUnit CUBIC_FOOT;
    public static final MeasureUnit CUBIC_INCH;
    public static final MeasureUnit CUBIC_KILOMETER;
    public static final MeasureUnit CUBIC_METER;
    public static final MeasureUnit CUBIC_MILE;
    public static final MeasureUnit CUBIC_YARD;
    public static final MeasureUnit CUP;
    public static final MeasureUnit CUP_METRIC;
    public static final TimeUnit DAY;
    public static final MeasureUnit DECADE;
    public static final MeasureUnit DECILITER;
    public static final MeasureUnit DECIMETER;
    public static final MeasureUnit DEGREE;
    public static final MeasureUnit DOT;
    public static final MeasureUnit DOT_PER_CENTIMETER;
    public static final MeasureUnit DOT_PER_INCH;
    public static final MeasureUnit EM;
    public static final MeasureUnit FAHRENHEIT;
    public static final MeasureUnit FATHOM;
    public static final MeasureUnit FLUID_OUNCE;
    public static final MeasureUnit FOODCALORIE;
    public static final MeasureUnit FOOT;
    public static final MeasureUnit FURLONG;
    public static final MeasureUnit GALLON;
    public static final MeasureUnit GALLON_IMPERIAL;
    public static final MeasureUnit GENERIC_TEMPERATURE;
    public static final MeasureUnit GIGABIT;
    public static final MeasureUnit GIGABYTE;
    public static final MeasureUnit GIGAHERTZ;
    public static final MeasureUnit GIGAWATT;
    public static final MeasureUnit GRAM;
    public static final MeasureUnit G_FORCE;
    public static final MeasureUnit HECTARE;
    public static final MeasureUnit HECTOLITER;
    public static final MeasureUnit HECTOPASCAL;
    public static final MeasureUnit HERTZ;
    public static final MeasureUnit HORSEPOWER;
    public static final TimeUnit HOUR;
    public static final MeasureUnit INCH;
    public static final MeasureUnit INCH_HG;
    public static final MeasureUnit ITEM;
    public static final MeasureUnit JOULE;
    public static final MeasureUnit KARAT;
    public static final MeasureUnit KELVIN;
    public static final MeasureUnit KILOBIT;
    public static final MeasureUnit KILOBYTE;
    public static final MeasureUnit KILOCALORIE;
    public static final MeasureUnit KILOGRAM;
    public static final MeasureUnit KILOHERTZ;
    public static final MeasureUnit KILOJOULE;
    public static final MeasureUnit KILOMETER;
    public static final MeasureUnit KILOMETER_PER_HOUR;
    public static final MeasureUnit KILOWATT;
    public static final MeasureUnit KILOWATT_HOUR;
    public static final MeasureUnit KILOWATT_HOUR_PER_100_KILOMETER;
    public static final MeasureUnit KNOT;
    public static final MeasureUnit LIGHT_YEAR;
    public static final MeasureUnit LITER;
    public static final MeasureUnit LITER_PER_100KILOMETERS;
    public static final MeasureUnit LITER_PER_KILOMETER;
    public static final MeasureUnit LUMEN;
    public static final MeasureUnit LUX;
    public static final MeasureUnit MEGABIT;
    public static final MeasureUnit MEGABYTE;
    public static final MeasureUnit MEGAHERTZ;
    public static final MeasureUnit MEGALITER;
    public static final MeasureUnit MEGAPIXEL;
    public static final MeasureUnit MEGAWATT;
    public static final MeasureUnit METER;
    public static final MeasureUnit METER_PER_SECOND;
    public static final MeasureUnit METER_PER_SECOND_SQUARED;
    public static final MeasureUnit METRIC_TON;
    public static final MeasureUnit MICROGRAM;
    public static final MeasureUnit MICROMETER;
    public static final MeasureUnit MICROSECOND;
    public static final MeasureUnit MILE;
    public static final MeasureUnit MILE_PER_GALLON;
    public static final MeasureUnit MILE_PER_GALLON_IMPERIAL;
    public static final MeasureUnit MILE_PER_HOUR;
    public static final MeasureUnit MILE_SCANDINAVIAN;
    public static final MeasureUnit MILLIAMPERE;
    public static final MeasureUnit MILLIBAR;
    public static final MeasureUnit MILLIGRAM;
    public static final MeasureUnit MILLIGRAM_OFGLUCOSE_PER_DECILITER;
    public static final MeasureUnit MILLIGRAM_PER_DECILITER;
    public static final MeasureUnit MILLILITER;
    public static final MeasureUnit MILLIMETER;
    public static final MeasureUnit MILLIMETER_OF_MERCURY;
    public static final MeasureUnit MILLIMOLE_PER_LITER;
    public static final MeasureUnit MILLISECOND;
    public static final MeasureUnit MILLIWATT;
    public static final TimeUnit MINUTE;
    public static final TimeUnit MONTH;
    public static final MeasureUnit NANOMETER;
    public static final MeasureUnit NANOSECOND;
    public static final MeasureUnit NAUTICAL_MILE;
    public static final MeasureUnit OHM;
    public static final MeasureUnit OUNCE;
    public static final MeasureUnit OUNCE_TROY;
    public static final MeasureUnit PARSEC;
    public static final MeasureUnit PART_PER_MILLION;
    public static final MeasureUnit PERCENT;
    public static final MeasureUnit PERMILLE;
    public static final MeasureUnit PETABYTE;
    public static final MeasureUnit PICOMETER;
    public static final MeasureUnit PINT;
    public static final MeasureUnit PINT_METRIC;
    public static final MeasureUnit PIXEL;
    public static final MeasureUnit PIXEL_PER_CENTIMETER;
    public static final MeasureUnit PIXEL_PER_INCH;
    public static final MeasureUnit POINT;
    public static final MeasureUnit POUND;
    public static final MeasureUnit POUND_PER_SQUARE_INCH;
    public static final MeasureUnit QUART;
    public static final MeasureUnit QUARTER;
    public static final MeasureUnit RADIAN;
    public static final MeasureUnit REVOLUTION_ANGLE;
    public static final TimeUnit SECOND;
    public static final MeasureUnit SQUARE_CENTIMETER;
    public static final MeasureUnit SQUARE_FOOT;
    public static final MeasureUnit SQUARE_INCH;
    public static final MeasureUnit SQUARE_KILOMETER;
    public static final MeasureUnit SQUARE_METER;
    public static final MeasureUnit SQUARE_MILE;
    public static final MeasureUnit SQUARE_YARD;
    public static final MeasureUnit STONE;
    public static final MeasureUnit TABLESPOON;
    public static final MeasureUnit TEASPOON;
    public static final MeasureUnit TERABIT;
    public static final MeasureUnit TERABYTE;
    public static final MeasureUnit TON;
    public static final MeasureUnit TONNE;
    public static final MeasureUnit VOLT;
    public static final MeasureUnit WATT;
    public static final TimeUnit WEEK;
    public static final MeasureUnit YARD;
    public static final TimeUnit YEAR;
    
    MeasureUnit() {
        throw new RuntimeException("Stub!");
    }
    
    public static MeasureUnit forIdentifier(final String identifier) {
        throw new RuntimeException("Stub!");
    }
    
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSubtype() {
        throw new RuntimeException("Stub!");
    }
    
    public String getIdentifier() {
        throw new RuntimeException("Stub!");
    }
    
    public Complexity getComplexity() {
        throw new RuntimeException("Stub!");
    }
    
    public MeasureUnit withPrefix(final MeasurePrefix prefix) {
        throw new RuntimeException("Stub!");
    }
    
    public MeasurePrefix getPrefix() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDimensionality() {
        throw new RuntimeException("Stub!");
    }
    
    public MeasureUnit withDimensionality(final int dimensionality) {
        throw new RuntimeException("Stub!");
    }
    
    public MeasureUnit reciprocal() {
        throw new RuntimeException("Stub!");
    }
    
    public MeasureUnit product(final MeasureUnit other) {
        throw new RuntimeException("Stub!");
    }
    
    public List<MeasureUnit> splitToSingleUnits() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object rhs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static Set<String> getAvailableTypes() {
        throw new RuntimeException("Stub!");
    }
    
    public static Set<MeasureUnit> getAvailable(final String type) {
        throw new RuntimeException("Stub!");
    }
    
    public static synchronized Set<MeasureUnit> getAvailable() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        ACRE = null;
        ACRE_FOOT = null;
        AMPERE = null;
        ARC_MINUTE = null;
        ARC_SECOND = null;
        ASTRONOMICAL_UNIT = null;
        ATMOSPHERE = null;
        BIT = null;
        BUSHEL = null;
        BYTE = null;
        CALORIE = null;
        CANDELA = null;
        CARAT = null;
        CELSIUS = null;
        CENTILITER = null;
        CENTIMETER = null;
        CENTURY = null;
        CUBIC_CENTIMETER = null;
        CUBIC_FOOT = null;
        CUBIC_INCH = null;
        CUBIC_KILOMETER = null;
        CUBIC_METER = null;
        CUBIC_MILE = null;
        CUBIC_YARD = null;
        CUP = null;
        CUP_METRIC = null;
        DAY = null;
        DECADE = null;
        DECILITER = null;
        DECIMETER = null;
        DEGREE = null;
        DOT = null;
        DOT_PER_CENTIMETER = null;
        DOT_PER_INCH = null;
        EM = null;
        FAHRENHEIT = null;
        FATHOM = null;
        FLUID_OUNCE = null;
        FOODCALORIE = null;
        FOOT = null;
        FURLONG = null;
        GALLON = null;
        GALLON_IMPERIAL = null;
        GENERIC_TEMPERATURE = null;
        GIGABIT = null;
        GIGABYTE = null;
        GIGAHERTZ = null;
        GIGAWATT = null;
        GRAM = null;
        G_FORCE = null;
        HECTARE = null;
        HECTOLITER = null;
        HECTOPASCAL = null;
        HERTZ = null;
        HORSEPOWER = null;
        HOUR = null;
        INCH = null;
        INCH_HG = null;
        ITEM = null;
        JOULE = null;
        KARAT = null;
        KELVIN = null;
        KILOBIT = null;
        KILOBYTE = null;
        KILOCALORIE = null;
        KILOGRAM = null;
        KILOHERTZ = null;
        KILOJOULE = null;
        KILOMETER = null;
        KILOMETER_PER_HOUR = null;
        KILOWATT = null;
        KILOWATT_HOUR = null;
        KILOWATT_HOUR_PER_100_KILOMETER = null;
        KNOT = null;
        LIGHT_YEAR = null;
        LITER = null;
        LITER_PER_100KILOMETERS = null;
        LITER_PER_KILOMETER = null;
        LUMEN = null;
        LUX = null;
        MEGABIT = null;
        MEGABYTE = null;
        MEGAHERTZ = null;
        MEGALITER = null;
        MEGAPIXEL = null;
        MEGAWATT = null;
        METER = null;
        METER_PER_SECOND = null;
        METER_PER_SECOND_SQUARED = null;
        METRIC_TON = null;
        MICROGRAM = null;
        MICROMETER = null;
        MICROSECOND = null;
        MILE = null;
        MILE_PER_GALLON = null;
        MILE_PER_GALLON_IMPERIAL = null;
        MILE_PER_HOUR = null;
        MILE_SCANDINAVIAN = null;
        MILLIAMPERE = null;
        MILLIBAR = null;
        MILLIGRAM = null;
        MILLIGRAM_OFGLUCOSE_PER_DECILITER = null;
        MILLIGRAM_PER_DECILITER = null;
        MILLILITER = null;
        MILLIMETER = null;
        MILLIMETER_OF_MERCURY = null;
        MILLIMOLE_PER_LITER = null;
        MILLISECOND = null;
        MILLIWATT = null;
        MINUTE = null;
        MONTH = null;
        NANOMETER = null;
        NANOSECOND = null;
        NAUTICAL_MILE = null;
        OHM = null;
        OUNCE = null;
        OUNCE_TROY = null;
        PARSEC = null;
        PART_PER_MILLION = null;
        PERCENT = null;
        PERMILLE = null;
        PETABYTE = null;
        PICOMETER = null;
        PINT = null;
        PINT_METRIC = null;
        PIXEL = null;
        PIXEL_PER_CENTIMETER = null;
        PIXEL_PER_INCH = null;
        POINT = null;
        POUND = null;
        POUND_PER_SQUARE_INCH = null;
        QUART = null;
        QUARTER = null;
        RADIAN = null;
        REVOLUTION_ANGLE = null;
        SECOND = null;
        SQUARE_CENTIMETER = null;
        SQUARE_FOOT = null;
        SQUARE_INCH = null;
        SQUARE_KILOMETER = null;
        SQUARE_METER = null;
        SQUARE_MILE = null;
        SQUARE_YARD = null;
        STONE = null;
        TABLESPOON = null;
        TEASPOON = null;
        TERABIT = null;
        TERABYTE = null;
        TON = null;
        TONNE = null;
        VOLT = null;
        WATT = null;
        WEEK = null;
        YARD = null;
        YEAR = null;
    }
    
    public enum Complexity
    {
        SINGLE, 
        COMPOUND, 
        MIXED;
    }
    
    public enum MeasurePrefix
    {
        YOTTA, 
        ZETTA, 
        EXA, 
        PETA, 
        TERA, 
        GIGA, 
        MEGA, 
        KILO, 
        HECTO, 
        DEKA, 
        ONE, 
        DECI, 
        CENTI, 
        MILLI, 
        MICRO, 
        NANO, 
        PICO, 
        FEMTO, 
        ATTO, 
        ZEPTO, 
        YOCTO, 
        KIBI, 
        MEBI, 
        GIBI, 
        TEBI, 
        PEBI, 
        EXBI, 
        ZEBI, 
        YOBI;
        
        public int getBase() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPower() {
            throw new RuntimeException("Stub!");
        }
    }
}
