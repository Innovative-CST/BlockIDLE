package android.net.wifi;

import android.os.ParcelUuid;
import android.net.wifi.hotspot2.PasspointConfiguration;
import android.net.MacAddress;
import android.os.Parcel;
import android.os.Parcelable;

public final class WifiNetworkSuggestion implements Parcelable
{
    @NonNull
    public static final Creator<WifiNetworkSuggestion> CREATOR;
    public static final int RANDOMIZATION_NON_PERSISTENT = 1;
    public static final int RANDOMIZATION_PERSISTENT = 0;
    
    WifiNetworkSuggestion() {
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
    
    @Nullable
    public MacAddress getBssid() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCredentialSharedWithUser() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAppInteractionRequired() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnhancedOpen() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isHiddenSsid() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInitialAutojoinEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMetered() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUserInteractionRequired() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PasspointConfiguration getPasspointConfig() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriority() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getSsid() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public WifiSsid getWifiSsid() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUntrusted() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRestricted() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCarrierMerged() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public WifiEnterpriseConfig getEnterpriseConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPassphrase() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriorityGroup() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSubscriptionId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMacRandomizationSetting() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ParcelUuid getSubscriptionGroup() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWifi7Enabled() {
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
        public Builder setSsid(@NonNull final String ssid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWifiSsid(@NonNull final WifiSsid wifiSsid) {
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
        public Builder setPasspointConfig(@NonNull final PasspointConfiguration passpointConfig) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSubscriptionId(final int subscriptionId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSubscriptionGroup(@NonNull final ParcelUuid groupUuid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPriorityGroup(final int priorityGroup) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWapiPassphrase(@NonNull final String passphrase) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWapiEnterpriseConfig(@NonNull final WifiEnterpriseConfig enterpriseConfig) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIsHiddenSsid(final boolean isHiddenSsid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMacRandomizationSetting(final int macRandomizationSetting) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIsAppInteractionRequired(final boolean isAppInteractionRequired) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIsUserInteractionRequired(final boolean isUserInteractionRequired) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPriority(final int priority) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIsMetered(final boolean isMetered) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCredentialSharedWithUser(final boolean isShared) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIsInitialAutojoinEnabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUntrusted(final boolean isUntrusted) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRestricted(final boolean isRestricted) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWifi7Enabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCarrierMerged(final boolean isCarrierMerged) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIsWpa3SaeH2eOnlyModeEnabled(final boolean enable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public WifiNetworkSuggestion build() {
            throw new RuntimeException("Stub!");
        }
    }
}
