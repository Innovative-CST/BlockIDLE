package android.net.wifi.p2p;

import android.os.Parcel;
import android.os.Parcelable;

public final class WifiP2pDiscoveryConfig implements Parcelable
{
    @NonNull
    public static final Creator<WifiP2pDiscoveryConfig> CREATOR;
    
    WifiP2pDiscoveryConfig() {
        throw new RuntimeException("Stub!");
    }
    
    public int getScanType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFrequencyMhz() {
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
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(final int scanType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFrequencyMhz(final int frequencyMhz) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public WifiP2pDiscoveryConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
