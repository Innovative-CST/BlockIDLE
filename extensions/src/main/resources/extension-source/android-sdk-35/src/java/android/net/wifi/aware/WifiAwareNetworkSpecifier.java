package android.net.wifi.aware;

import android.os.Parcel;
import android.os.Parcelable;
import android.net.NetworkSpecifier;

public final class WifiAwareNetworkSpecifier extends NetworkSpecifier implements Parcelable
{
    @NonNull
    public static final Creator<WifiAwareNetworkSpecifier> CREATOR;
    
    WifiAwareNetworkSpecifier() {
        throw new RuntimeException("Stub!");
    }
    
    public int getChannelFrequencyMhz() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isChannelRequired() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public WifiAwareDataPathSecurityConfig getWifiAwareDataPathSecurityConfig() {
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
    
    public boolean canBeSatisfiedBy(final NetworkSpecifier other) {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final DiscoverySession discoverySession, @NonNull final PeerHandle peerHandle) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final PublishDiscoverySession publishDiscoverySession) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPskPassphrase(@NonNull final String pskPassphrase) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPmk(@NonNull final byte[] pmk) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPort(final int port) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTransportProtocol(final int transportProtocol) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setChannelFrequencyMhz(final int channelInMhz, final boolean required) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDataPathSecurityConfig(@NonNull final WifiAwareDataPathSecurityConfig securityConfig) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public WifiAwareNetworkSpecifier build() {
            throw new RuntimeException("Stub!");
        }
    }
}
