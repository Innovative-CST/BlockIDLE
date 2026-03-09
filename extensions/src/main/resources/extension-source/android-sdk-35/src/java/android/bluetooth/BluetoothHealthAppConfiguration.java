package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class BluetoothHealthAppConfiguration implements Parcelable
{
    @Deprecated
    @NonNull
    public static final Creator<BluetoothHealthAppConfiguration> CREATOR;
    
    BluetoothHealthAppConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getDataType() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getRole() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
