package android.net.wifi.p2p;

import android.net.MacAddress;
import android.os.Parcel;
import android.net.wifi.WpsInfo;
import android.os.Parcelable;

public class WifiP2pConfig implements Parcelable
{
    @NonNull
    public static final Creator<WifiP2pConfig> CREATOR;
    public static final int GROUP_CLIENT_IP_PROVISIONING_MODE_IPV4_DHCP = 0;
    public static final int GROUP_CLIENT_IP_PROVISIONING_MODE_IPV6_LINK_LOCAL = 1;
    public static final int GROUP_OWNER_BAND_2GHZ = 1;
    public static final int GROUP_OWNER_BAND_5GHZ = 2;
    public static final int GROUP_OWNER_BAND_AUTO = 0;
    public static final int GROUP_OWNER_INTENT_AUTO = -1;
    public static final int GROUP_OWNER_INTENT_MAX = 15;
    public static final int GROUP_OWNER_INTENT_MIN = 0;
    public String deviceAddress;
    public int groupOwnerIntent;
    public WpsInfo wps;
    
    public WifiP2pConfig() {
        this.deviceAddress = "";
        this.groupOwnerIntent = -1;
        throw new RuntimeException("Stub!");
    }
    
    public WifiP2pConfig(final WifiP2pConfig source) {
        this.deviceAddress = "";
        this.groupOwnerIntent = -1;
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getNetworkName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPassphrase() {
        throw new RuntimeException("Stub!");
    }
    
    public int getGroupOwnerBand() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNetworkId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getGroupClientIpProvisioningMode() {
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
    public void writeToParcel(final Parcel dest, final int flags) {
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
        public Builder setDeviceAddress(@Nullable final MacAddress deviceAddress) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNetworkName(@NonNull final String networkName) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPassphrase(@NonNull final String passphrase) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setGroupOperatingBand(final int band) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setGroupOperatingFrequency(final int frequency) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder enablePersistentMode(final boolean persistent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setGroupClientIpProvisioningMode(final int groupClientIpProvisioningMode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public WifiP2pConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
