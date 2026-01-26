package android.text;

@Deprecated
public class AndroidCharacter
{
    @Deprecated
    public static final int EAST_ASIAN_WIDTH_AMBIGUOUS = 1;
    @Deprecated
    public static final int EAST_ASIAN_WIDTH_FULL_WIDTH = 3;
    @Deprecated
    public static final int EAST_ASIAN_WIDTH_HALF_WIDTH = 2;
    @Deprecated
    public static final int EAST_ASIAN_WIDTH_NARROW = 4;
    @Deprecated
    public static final int EAST_ASIAN_WIDTH_NEUTRAL = 0;
    @Deprecated
    public static final int EAST_ASIAN_WIDTH_WIDE = 5;
    
    @Deprecated
    public AndroidCharacter() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static native void getDirectionalities(final char[] p0, final byte[] p1, final int p2);
    
    @Deprecated
    public static native int getEastAsianWidth(final char p0);
    
    @Deprecated
    public static native void getEastAsianWidths(final char[] p0, final int p1, final int p2, final byte[] p3);
    
    @Deprecated
    public static native boolean mirror(final char[] p0, final int p1, final int p2);
    
    @Deprecated
    public static native char getMirror(final char p0);
}
