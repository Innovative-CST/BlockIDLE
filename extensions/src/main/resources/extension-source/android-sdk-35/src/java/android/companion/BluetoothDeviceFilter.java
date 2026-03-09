package android.companion;

import android.os.ParcelUuid;
import java.util.regex.Pattern;
import android.os.Parcel;
import android.os.Parcelable;
import android.bluetooth.BluetoothDevice;

public final class BluetoothDeviceFilter implements DeviceFilter<BluetoothDevice>
{
    @NonNull
    public static final Parcelable.Creator<BluetoothDeviceFilter> CREATOR;
    
    BluetoothDeviceFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
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
    
    @Override
    public int describeContents() {
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
        
        public Builder setNamePattern(@Nullable final Pattern regex) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAddress(@Nullable final String address) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addServiceUuid(@Nullable final ParcelUuid serviceUuid, @Nullable final ParcelUuid serviceUuidMask) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BluetoothDeviceFilter build() {
            throw new RuntimeException("Stub!");
        }
    }
}
