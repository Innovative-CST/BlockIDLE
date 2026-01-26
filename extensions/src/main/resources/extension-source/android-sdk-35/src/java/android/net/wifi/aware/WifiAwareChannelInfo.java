package android.net.wifi.aware;

import android.os.Parcel;
import android.os.Parcelable;

public final class WifiAwareChannelInfo implements Parcelable
{
    @NonNull
    public static final Creator<WifiAwareChannelInfo> CREATOR;
    
    WifiAwareChannelInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getChannelFrequencyMhz() {
        throw new RuntimeException("Stub!");
    }
    
    public int getChannelBandwidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSpatialStreamCount() {
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
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
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
