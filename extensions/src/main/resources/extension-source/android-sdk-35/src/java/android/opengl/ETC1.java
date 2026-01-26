package android.opengl;

import java.nio.Buffer;

public class ETC1
{
    public static final int DECODED_BLOCK_SIZE = 48;
    public static final int ENCODED_BLOCK_SIZE = 8;
    public static final int ETC1_RGB8_OES = 36196;
    public static final int ETC_PKM_HEADER_SIZE = 16;
    
    public ETC1() {
        throw new RuntimeException("Stub!");
    }
    
    public static native void encodeBlock(final Buffer p0, final int p1, final Buffer p2);
    
    public static native void decodeBlock(final Buffer p0, final Buffer p1);
    
    public static native int getEncodedDataSize(final int p0, final int p1);
    
    public static native void encodeImage(final Buffer p0, final int p1, final int p2, final int p3, final int p4, final Buffer p5);
    
    public static native void decodeImage(final Buffer p0, final Buffer p1, final int p2, final int p3, final int p4, final int p5);
    
    public static native void formatHeader(final Buffer p0, final int p1, final int p2);
    
    public static native boolean isValid(final Buffer p0);
    
    public static native int getWidth(final Buffer p0);
    
    public static native int getHeight(final Buffer p0);
}
