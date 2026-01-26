package android.graphics;

import android.os.Parcel;
import java.io.OutputStream;
import android.util.DisplayMetrics;
import android.hardware.HardwareBuffer;
import java.nio.Buffer;
import android.os.Parcelable;

public final class Bitmap implements Parcelable
{
    @NonNull
    public static final Creator<Bitmap> CREATOR;
    public static final int DENSITY_NONE = 0;
    
    Bitmap() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDensity() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDensity(final int density) {
        throw new RuntimeException("Stub!");
    }
    
    public void reconfigure(final int width, final int height, @NonNull final Config config) {
        throw new RuntimeException("Stub!");
    }
    
    public void setWidth(final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public void setHeight(final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public void setConfig(@NonNull final Config config) {
        throw new RuntimeException("Stub!");
    }
    
    public void recycle() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRecycled() {
        throw new RuntimeException("Stub!");
    }
    
    public int getGenerationId() {
        throw new RuntimeException("Stub!");
    }
    
    public void copyPixelsToBuffer(@NonNull final Buffer dst) {
        throw new RuntimeException("Stub!");
    }
    
    public void copyPixelsFromBuffer(@NonNull final Buffer src) {
        throw new RuntimeException("Stub!");
    }
    
    public Bitmap copy(@NonNull final Config config, final boolean isMutable) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bitmap asShared() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static Bitmap wrapHardwareBuffer(@NonNull final HardwareBuffer hardwareBuffer, @Nullable final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createScaledBitmap(@NonNull final Bitmap src, final int dstWidth, final int dstHeight, final boolean filter) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createBitmap(@NonNull final Bitmap src) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createBitmap(@NonNull final Bitmap source, final int x, final int y, final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createBitmap(@NonNull final Bitmap source, final int x, final int y, final int width, final int height, @Nullable final Matrix m, final boolean filter) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createBitmap(final int width, final int height, @NonNull final Config config) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createBitmap(@Nullable final DisplayMetrics display, final int width, final int height, @NonNull final Config config) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createBitmap(final int width, final int height, @NonNull final Config config, final boolean hasAlpha) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createBitmap(final int width, final int height, @NonNull final Config config, final boolean hasAlpha, @NonNull final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createBitmap(@Nullable final DisplayMetrics display, final int width, final int height, @NonNull final Config config, final boolean hasAlpha) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createBitmap(@Nullable final DisplayMetrics display, final int width, final int height, @NonNull final Config config, final boolean hasAlpha, @NonNull final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createBitmap(@NonNull final int[] colors, final int offset, final int stride, final int width, final int height, @NonNull final Config config) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createBitmap(@NonNull final DisplayMetrics display, @NonNull final int[] colors, final int offset, final int stride, final int width, final int height, @NonNull final Config config) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createBitmap(@NonNull final int[] colors, final int width, final int height, final Config config) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createBitmap(@Nullable final DisplayMetrics display, @NonNull final int[] colors, final int width, final int height, @NonNull final Config config) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createBitmap(@NonNull final Picture source) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Bitmap createBitmap(@NonNull final Picture source, final int width, final int height, @NonNull final Config config) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getNinePatchChunk() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean compress(@NonNull final CompressFormat format, final int quality, @NonNull final OutputStream stream) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMutable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPremultiplied() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPremultiplied(final boolean premultiplied) {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public int getScaledWidth(@NonNull final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public int getScaledHeight(@NonNull final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public int getScaledWidth(@NonNull final DisplayMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public int getScaledHeight(@NonNull final DisplayMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public int getScaledWidth(final int targetDensity) {
        throw new RuntimeException("Stub!");
    }
    
    public int getScaledHeight(final int targetDensity) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRowBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getByteCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAllocationByteCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Config getConfig() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHasAlpha(final boolean hasAlpha) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMipMap() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHasMipMap(final boolean hasMipMap) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorSpace getColorSpace() {
        throw new RuntimeException("Stub!");
    }
    
    public void setColorSpace(@NonNull final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasGainmap() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Gainmap getGainmap() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGainmap(@Nullable final Gainmap gainmap) {
        throw new RuntimeException("Stub!");
    }
    
    public void eraseColor(final int c) {
        throw new RuntimeException("Stub!");
    }
    
    public void eraseColor(final long color) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPixel(final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Color getColor(final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    public void getPixels(@NonNull final int[] pixels, final int offset, final int stride, final int x, final int y, final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPixel(final int x, final int y, final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPixels(@NonNull final int[] pixels, final int offset, final int stride, final int x, final int y, final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel p, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bitmap extractAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bitmap extractAlpha(@Nullable final Paint paint, final int[] offsetXY) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean sameAs(@Nullable final Bitmap other) {
        throw new RuntimeException("Stub!");
    }
    
    public void prepareToDraw() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public HardwareBuffer getHardwareBuffer() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public enum CompressFormat
    {
        JPEG, 
        PNG, 
        @Deprecated
        WEBP, 
        WEBP_LOSSY, 
        WEBP_LOSSLESS;
    }
    
    public enum Config
    {
        ALPHA_8, 
        RGB_565, 
        @Deprecated
        ARGB_4444, 
        ARGB_8888, 
        RGBA_F16, 
        HARDWARE, 
        RGBA_1010102;
    }
}
