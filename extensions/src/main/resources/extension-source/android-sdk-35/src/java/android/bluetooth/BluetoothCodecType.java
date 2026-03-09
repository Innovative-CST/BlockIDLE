package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public final class BluetoothCodecType implements Parcelable
{
    public static final long CODEC_ID_AAC = 2L;
    public static final long CODEC_ID_APTX = 16797695L;
    public static final long CODEC_ID_APTX_HD = 604035071L;
    public static final long CODEC_ID_LDAC = -1442763265L;
    public static final long CODEC_ID_OPUS = 16834815L;
    public static final long CODEC_ID_SBC = 0L;
    @NonNull
    public static final Creator<BluetoothCodecType> CREATOR;
    
    BluetoothCodecType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMandatoryCodec() {
        throw new RuntimeException("Stub!");
    }
    
    public long getCodecId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getCodecName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
