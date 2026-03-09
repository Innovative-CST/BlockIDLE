package android.net.wifi;

import android.os.Parcel;
import android.os.Parcelable;

public final class WifiAvailableChannel implements Parcelable
{
    @NonNull
    public static final Creator<WifiAvailableChannel> CREATOR;
    public static final int OP_MODE_SAP = 2;
    public static final int OP_MODE_STA = 1;
    public static final int OP_MODE_TDLS = 32;
    public static final int OP_MODE_WIFI_AWARE = 16;
    public static final int OP_MODE_WIFI_DIRECT_CLI = 4;
    public static final int OP_MODE_WIFI_DIRECT_GO = 8;
    
    public WifiAvailableChannel(final int freq, final int opModes) {
        throw new RuntimeException("Stub!");
    }
    
    public int getFrequencyMhz() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOperationalModes() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
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
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
