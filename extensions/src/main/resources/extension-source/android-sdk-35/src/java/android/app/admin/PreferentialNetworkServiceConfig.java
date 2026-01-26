package android.app.admin;

import android.os.Parcel;
import android.os.Parcelable;

public final class PreferentialNetworkServiceConfig implements Parcelable
{
    @NonNull
    public static final Creator<PreferentialNetworkServiceConfig> CREATOR;
    public static final int PREFERENTIAL_NETWORK_ID_1 = 1;
    public static final int PREFERENTIAL_NETWORK_ID_2 = 2;
    public static final int PREFERENTIAL_NETWORK_ID_3 = 3;
    public static final int PREFERENTIAL_NETWORK_ID_4 = 4;
    public static final int PREFERENTIAL_NETWORK_ID_5 = 5;
    
    PreferentialNetworkServiceConfig() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFallbackToDefaultConnectionAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldBlockNonMatchingNetworks() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getIncludedUids() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getExcludedUids() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNetworkId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
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
        public Builder setEnabled(final boolean isEnabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFallbackToDefaultConnectionAllowed(final boolean allowFallbackToDefaultConnection) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setShouldBlockNonMatchingNetworks(final boolean blockNonMatchingNetworks) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIncludedUids(@NonNull final int[] uids) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExcludedUids(@NonNull final int[] uids) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PreferentialNetworkServiceConfig build() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNetworkId(final int preferenceId) {
            throw new RuntimeException("Stub!");
        }
    }
}
