package android.companion;

import java.nio.ByteOrder;
import android.bluetooth.le.ScanFilter;
import java.util.regex.Pattern;
import android.os.Parcel;
import android.os.Parcelable;
import android.bluetooth.le.ScanResult;

public final class BluetoothLeDeviceFilter implements DeviceFilter<ScanResult>
{
    @NonNull
    public static final Parcelable.Creator<BluetoothLeDeviceFilter> CREATOR;
    
    BluetoothLeDeviceFilter() {
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
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getRenamePrefixLengthLimit() {
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
        public Builder setScanFilter(@Nullable final ScanFilter scanFilter) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRawDataFilter(@NonNull final byte[] rawDataFilter, @Nullable final byte[] rawDataFilterMask) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRenameFromBytes(@NonNull final String prefix, @NonNull final String suffix, final int bytesFrom, final int bytesLength, final ByteOrder byteOrder) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRenameFromName(@NonNull final String prefix, @NonNull final String suffix, final int nameFrom, final int nameLength) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BluetoothLeDeviceFilter build() {
            throw new RuntimeException("Stub!");
        }
    }
}
