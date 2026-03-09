package android.hardware.display;

import android.os.Parcel;
import android.os.Parcelable;

public final class HdrConversionMode implements Parcelable
{
    @NonNull
    public static final Creator<HdrConversionMode> CREATOR;
    public static final int HDR_CONVERSION_FORCE = 3;
    public static final int HDR_CONVERSION_PASSTHROUGH = 1;
    public static final int HDR_CONVERSION_SYSTEM = 2;
    public static final int HDR_CONVERSION_UNSUPPORTED = 0;
    
    public HdrConversionMode(final int conversionMode, final int preferredHdrOutputType) {
        throw new RuntimeException("Stub!");
    }
    
    public HdrConversionMode(final int conversionMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getConversionMode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPreferredHdrOutputType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
