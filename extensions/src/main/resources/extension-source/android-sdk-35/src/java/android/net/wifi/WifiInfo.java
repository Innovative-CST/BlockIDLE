package android.net.wifi;

import android.os.Parcel;
import android.net.NetworkInfo;
import java.util.List;
import android.net.MacAddress;
import android.os.Parcelable;
import android.net.TransportInfo;

public class WifiInfo implements TransportInfo, Parcelable
{
    public static final String FREQUENCY_UNITS = "MHz";
    public static final String LINK_SPEED_UNITS = "Mbps";
    public static final int LINK_SPEED_UNKNOWN = -1;
    public static final int SECURITY_TYPE_DPP = 13;
    public static final int SECURITY_TYPE_EAP = 3;
    public static final int SECURITY_TYPE_EAP_WPA3_ENTERPRISE = 9;
    public static final int SECURITY_TYPE_EAP_WPA3_ENTERPRISE_192_BIT = 5;
    public static final int SECURITY_TYPE_OPEN = 0;
    public static final int SECURITY_TYPE_OSEN = 10;
    public static final int SECURITY_TYPE_OWE = 6;
    public static final int SECURITY_TYPE_PASSPOINT_R1_R2 = 11;
    public static final int SECURITY_TYPE_PASSPOINT_R3 = 12;
    public static final int SECURITY_TYPE_PSK = 2;
    public static final int SECURITY_TYPE_SAE = 4;
    public static final int SECURITY_TYPE_UNKNOWN = -1;
    public static final int SECURITY_TYPE_WAPI_CERT = 8;
    public static final int SECURITY_TYPE_WAPI_PSK = 7;
    public static final int SECURITY_TYPE_WEP = 1;
    
    WifiInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSSID() {
        throw new RuntimeException("Stub!");
    }
    
    public String getBSSID() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MacAddress getApMldMacAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public int getApMloLinkId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<MloLink> getAffiliatedMloLinks() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<MloLink> getAssociatedMloLinks() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRssi() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWifiStandard() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLinkSpeed() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTxLinkSpeedMbps() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxSupportedTxLinkSpeedMbps() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRxLinkSpeedMbps() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxSupportedRxLinkSpeedMbps() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFrequency() {
        throw new RuntimeException("Stub!");
    }
    
    public String getMacAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRestricted() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPasspointFqdn() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPasspointProviderFriendlyName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSubscriptionId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNetworkId() {
        throw new RuntimeException("Stub!");
    }
    
    public SupplicantState getSupplicantState() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getIpAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getHiddenSSID() {
        throw new RuntimeException("Stub!");
    }
    
    public static NetworkInfo.DetailedState getDetailedStateOf(final SupplicantState suppState) {
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
    
    @Nullable
    public String getPasspointUniqueId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<ScanResult.InformationElement> getInformationElements() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object that) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public WifiInfo makeCopy(final long redactions) {
        throw new RuntimeException("Stub!");
    }
    
    public long getApplicableRedactions() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCurrentSecurityType() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSsid(@NonNull final byte[] ssid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBssid(@NonNull final String bssid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRssi(final int rssi) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNetworkId(final int networkId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSubscriptionId(final int subId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCurrentSecurityType(final int securityType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public WifiInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
