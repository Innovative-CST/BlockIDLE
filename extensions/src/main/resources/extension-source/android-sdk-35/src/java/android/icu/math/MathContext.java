package android.icu.math;

import java.io.Serializable;

public final class MathContext implements Serializable
{
    public static final MathContext DEFAULT;
    public static final int ENGINEERING = 2;
    public static final int PLAIN = 0;
    public static final int ROUND_CEILING = 2;
    public static final int ROUND_DOWN = 1;
    public static final int ROUND_FLOOR = 3;
    public static final int ROUND_HALF_DOWN = 5;
    public static final int ROUND_HALF_EVEN = 6;
    public static final int ROUND_HALF_UP = 4;
    public static final int ROUND_UNNECESSARY = 7;
    public static final int ROUND_UP = 0;
    public static final int SCIENTIFIC = 1;
    
    public MathContext(final int setdigits) {
        throw new RuntimeException("Stub!");
    }
    
    public MathContext(final int setdigits, final int setform) {
        throw new RuntimeException("Stub!");
    }
    
    public MathContext(final int setdigits, final int setform, final boolean setlostdigits) {
        throw new RuntimeException("Stub!");
    }
    
    public MathContext(final int setdigits, final int setform, final boolean setlostdigits, final int setroundingmode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDigits() {
        throw new RuntimeException("Stub!");
    }
    
    public int getForm() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getLostDigits() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRoundingMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        DEFAULT = null;
    }
}
