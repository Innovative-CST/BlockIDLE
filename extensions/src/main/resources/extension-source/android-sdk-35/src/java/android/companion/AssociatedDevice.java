package android.companion;

import android.os.Parcel;
import android.bluetooth.le.ScanResult;
import android.bluetooth.BluetoothDevice;
import android.os.Parcelable;

public final class AssociatedDevice implements Parcelable
{
    @NonNull
    public static final Creator<AssociatedDevice> CREATOR;
    
    AssociatedDevice() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BluetoothDevice getBluetoothDevice() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ScanResult getBleDevice() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public android.net.wifi.ScanResult getWifiDevice() {
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
    
    @Override
    public String toString() {
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
    
    static {
        CREATOR = null;
    }
}
