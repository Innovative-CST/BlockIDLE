package android.bluetooth;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

public final class BluetoothCodecStatus implements Parcelable
{
    @NonNull
    public static final Creator<BluetoothCodecStatus> CREATOR;
    public static final String EXTRA_CODEC_STATUS = "android.bluetooth.extra.CODEC_STATUS";
    
    BluetoothCodecStatus() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCodecConfigSelectable(@Nullable final BluetoothCodecConfig codecConfig) {
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
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BluetoothCodecConfig getCodecConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<BluetoothCodecConfig> getCodecsLocalCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<BluetoothCodecConfig> getCodecsSelectableCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCodecConfig(@NonNull final BluetoothCodecConfig codecConfig) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCodecsLocalCapabilities(@NonNull final List<BluetoothCodecConfig> codecsLocalCapabilities) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCodecsSelectableCapabilities(@NonNull final List<BluetoothCodecConfig> codecsSelectableCapabilities) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BluetoothCodecStatus build() {
            throw new RuntimeException("Stub!");
        }
    }
}
