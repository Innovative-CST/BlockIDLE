package android.net.wifi;

import android.net.MacAddress;
import android.os.PatternMatcher;
import android.os.Parcel;
import android.os.Parcelable;
import android.net.NetworkSpecifier;

public final class WifiNetworkSpecifier extends NetworkSpecifier implements Parcelable
{
    @NonNull
    public static final Creator<WifiNetworkSpecifier> CREATOR;
    
    WifiNetworkSpecifier() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBand() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getPreferredChannelFrequenciesMhz() {
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
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canBeSatisfiedBy(final NetworkSpecifier other) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public NetworkSpecifier redact() {
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
        public Builder setSsidPattern(@NonNull final PatternMatcher ssidPattern) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSsid(@NonNull final String ssid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBssidPattern(@NonNull final MacAddress baseAddress, @NonNull final MacAddress mask) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBssid(@NonNull final MacAddress bssid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIsEnhancedOpen(final boolean isEnhancedOpen) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWpa2Passphrase(@NonNull final String passphrase) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWpa3Passphrase(@NonNull final String passphrase) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWpa2EnterpriseConfig(@NonNull final WifiEnterpriseConfig enterpriseConfig) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setWpa3EnterpriseConfig(@NonNull final WifiEnterpriseConfig enterpriseConfig) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWpa3EnterpriseStandardModeConfig(@NonNull final WifiEnterpriseConfig enterpriseConfig) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWpa3Enterprise192BitModeConfig(@NonNull final WifiEnterpriseConfig enterpriseConfig) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIsHiddenSsid(final boolean isHiddenSsid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBand(final int band) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPreferredChannelsFrequenciesMhz(@NonNull final int[] channelFreqs) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public WifiNetworkSpecifier build() {
            throw new RuntimeException("Stub!");
        }
    }
}
