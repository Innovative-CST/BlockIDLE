package android.graphics;

import java.io.OutputStream;

public class YuvImage
{
    public YuvImage(final byte[] yuv, final int format, final int width, final int height, final int[] strides) {
        throw new RuntimeException("Stub!");
    }
    
    public YuvImage(@NonNull final byte[] yuv, final int format, final int width, final int height, @Nullable final int[] strides, @NonNull final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean compressToJpeg(final Rect rectangle, final int quality, final OutputStream stream) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean compressToJpegR(@NonNull final YuvImage sdr, final int quality, @NonNull final OutputStream stream) {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getYuvData() {
        throw new RuntimeException("Stub!");
    }
    
    public int getYuvFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public int[] getStrides() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ColorSpace getColorSpace() {
        throw new RuntimeException("Stub!");
    }
}
