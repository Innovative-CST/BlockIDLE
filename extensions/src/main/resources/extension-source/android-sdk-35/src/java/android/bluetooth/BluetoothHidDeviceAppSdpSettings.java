package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public final class BluetoothHidDeviceAppSdpSettings implements Parcelable
{
    @NonNull
    public static final Creator<BluetoothHidDeviceAppSdpSettings> CREATOR;
    
    public BluetoothHidDeviceAppSdpSettings(final String name, final String description, final String provider, final byte subclass, final byte[] descriptors) {
        throw new RuntimeException("Stub!");
    }
    
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public String getProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public byte getSubclass() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getDescriptors() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
