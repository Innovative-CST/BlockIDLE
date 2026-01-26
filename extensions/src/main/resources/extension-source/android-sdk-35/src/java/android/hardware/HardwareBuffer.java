package android.hardware;

import android.os.Parcel;
import android.os.Parcelable;

public final class HardwareBuffer implements Parcelable, AutoCloseable
{
    public static final int BLOB = 33;
    @NonNull
    public static final Creator<HardwareBuffer> CREATOR;
    public static final int DS_24UI8 = 50;
    public static final int DS_FP32UI8 = 52;
    public static final int D_16 = 48;
    public static final int D_24 = 49;
    public static final int D_FP32 = 51;
    public static final int RGBA_10101010 = 59;
    public static final int RGBA_1010102 = 43;
    public static final int RGBA_8888 = 1;
    public static final int RGBA_FP16 = 22;
    public static final int RGBX_8888 = 2;
    public static final int RGB_565 = 4;
    public static final int RGB_888 = 3;
    public static final int RG_1616 = 58;
    public static final int R_16 = 57;
    public static final int R_8 = 56;
    public static final int S_UI8 = 53;
    public static final long USAGE_COMPOSER_OVERLAY = 2048L;
    public static final long USAGE_CPU_READ_OFTEN = 3L;
    public static final long USAGE_CPU_READ_RARELY = 2L;
    public static final long USAGE_CPU_WRITE_OFTEN = 48L;
    public static final long USAGE_CPU_WRITE_RARELY = 32L;
    public static final long USAGE_FRONT_BUFFER = 4294967296L;
    public static final long USAGE_GPU_COLOR_OUTPUT = 512L;
    public static final long USAGE_GPU_CUBE_MAP = 33554432L;
    public static final long USAGE_GPU_DATA_BUFFER = 16777216L;
    public static final long USAGE_GPU_MIPMAP_COMPLETE = 67108864L;
    public static final long USAGE_GPU_SAMPLED_IMAGE = 256L;
    public static final long USAGE_PROTECTED_CONTENT = 16384L;
    public static final long USAGE_SENSOR_DIRECT_DATA = 8388608L;
    public static final long USAGE_VIDEO_ENCODE = 65536L;
    public static final int YCBCR_420_888 = 35;
    public static final int YCBCR_P010 = 54;
    
    HardwareBuffer() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static HardwareBuffer create(final int width, final int height, final int format, final int layers, final long usage) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isSupported(final int width, final int height, final int format, final int layers, final long usage) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayers() {
        throw new RuntimeException("Stub!");
    }
    
    public long getUsage() {
        throw new RuntimeException("Stub!");
    }
    
    public long getId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isClosed() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
