package android.util;

public class TypedValue
{
    public static final int COMPLEX_MANTISSA_MASK = 16777215;
    public static final int COMPLEX_MANTISSA_SHIFT = 8;
    public static final int COMPLEX_RADIX_0p23 = 3;
    public static final int COMPLEX_RADIX_16p7 = 1;
    public static final int COMPLEX_RADIX_23p0 = 0;
    public static final int COMPLEX_RADIX_8p15 = 2;
    public static final int COMPLEX_RADIX_MASK = 3;
    public static final int COMPLEX_RADIX_SHIFT = 4;
    public static final int COMPLEX_UNIT_DIP = 1;
    public static final int COMPLEX_UNIT_FRACTION = 0;
    public static final int COMPLEX_UNIT_FRACTION_PARENT = 1;
    public static final int COMPLEX_UNIT_IN = 4;
    public static final int COMPLEX_UNIT_MASK = 15;
    public static final int COMPLEX_UNIT_MM = 5;
    public static final int COMPLEX_UNIT_PT = 3;
    public static final int COMPLEX_UNIT_PX = 0;
    public static final int COMPLEX_UNIT_SHIFT = 0;
    public static final int COMPLEX_UNIT_SP = 2;
    public static final int DATA_NULL_EMPTY = 1;
    public static final int DATA_NULL_UNDEFINED = 0;
    public static final int DENSITY_DEFAULT = 0;
    public static final int DENSITY_NONE = 65535;
    public static final int TYPE_ATTRIBUTE = 2;
    public static final int TYPE_DIMENSION = 5;
    public static final int TYPE_FIRST_COLOR_INT = 28;
    public static final int TYPE_FIRST_INT = 16;
    public static final int TYPE_FLOAT = 4;
    public static final int TYPE_FRACTION = 6;
    public static final int TYPE_INT_BOOLEAN = 18;
    public static final int TYPE_INT_COLOR_ARGB4 = 30;
    public static final int TYPE_INT_COLOR_ARGB8 = 28;
    public static final int TYPE_INT_COLOR_RGB4 = 31;
    public static final int TYPE_INT_COLOR_RGB8 = 29;
    public static final int TYPE_INT_DEC = 16;
    public static final int TYPE_INT_HEX = 17;
    public static final int TYPE_LAST_COLOR_INT = 31;
    public static final int TYPE_LAST_INT = 31;
    public static final int TYPE_NULL = 0;
    public static final int TYPE_REFERENCE = 1;
    public static final int TYPE_STRING = 3;
    public int assetCookie;
    public int changingConfigurations;
    public int data;
    public int density;
    public int resourceId;
    public int sourceResourceId;
    public CharSequence string;
    public int type;
    
    public TypedValue() {
        this.changingConfigurations = -1;
        throw new RuntimeException("Stub!");
    }
    
    public final float getFloat() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isColorType() {
        throw new RuntimeException("Stub!");
    }
    
    public static float complexToFloat(final int complex) {
        throw new RuntimeException("Stub!");
    }
    
    public static float complexToDimension(final int data, final DisplayMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public static int complexToDimensionPixelOffset(final int data, final DisplayMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public static int complexToDimensionPixelSize(final int data, final DisplayMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public int getComplexUnit() {
        throw new RuntimeException("Stub!");
    }
    
    public static float applyDimension(final int unit, final float value, final DisplayMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public static float deriveDimension(final int unitToConvertTo, final float pixelValue, @NonNull final DisplayMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public static float convertPixelsToDimension(final int unitToConvertTo, final float pixelValue, @NonNull final DisplayMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public static float convertDimensionToPixels(final int unitToConvertFrom, final float value, @NonNull final DisplayMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public float getDimension(final DisplayMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public static float complexToFraction(final int data, final float base, final float pbase) {
        throw new RuntimeException("Stub!");
    }
    
    public float getFraction(final float base, final float pbase) {
        throw new RuntimeException("Stub!");
    }
    
    public final CharSequence coerceToString() {
        throw new RuntimeException("Stub!");
    }
    
    public static final String coerceToString(final int type, final int data) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTo(final TypedValue other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
