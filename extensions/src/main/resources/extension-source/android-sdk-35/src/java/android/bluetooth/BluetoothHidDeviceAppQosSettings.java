package android.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public final class BluetoothHidDeviceAppQosSettings implements Parcelable
{
    @NonNull
    public static final Creator<BluetoothHidDeviceAppQosSettings> CREATOR;
    public static final int MAX = -1;
    public static final int SERVICE_BEST_EFFORT = 1;
    public static final int SERVICE_GUARANTEED = 2;
    public static final int SERVICE_NO_TRAFFIC = 0;
    
    public BluetoothHidDeviceAppQosSettings(final int serviceType, final int tokenRate, final int tokenBucketSize, final int peakBandwidth, final int latency, final int delayVariation) {
        throw new RuntimeException("Stub!");
    }
    
    public int getServiceType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTokenRate() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTokenBucketSize() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPeakBandwidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLatency() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDelayVariation() {
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
