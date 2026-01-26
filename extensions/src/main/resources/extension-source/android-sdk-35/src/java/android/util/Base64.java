package android.util;

public class Base64
{
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;
    
    Base64() {
        throw new RuntimeException("Stub!");
    }
    
    public static byte[] decode(final String str, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static byte[] decode(final byte[] input, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static byte[] decode(final byte[] input, final int offset, final int len, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static String encodeToString(final byte[] input, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static String encodeToString(final byte[] input, final int offset, final int len, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static byte[] encode(final byte[] input, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static byte[] encode(final byte[] input, final int offset, final int len, final int flags) {
        throw new RuntimeException("Stub!");
    }
}
