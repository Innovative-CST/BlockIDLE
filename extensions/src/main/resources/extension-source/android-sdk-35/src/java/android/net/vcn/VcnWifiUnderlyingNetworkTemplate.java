package android.net.vcn;

import java.util.Set;

public final class VcnWifiUnderlyingNetworkTemplate extends VcnUnderlyingNetworkTemplate
{
    VcnWifiUnderlyingNetworkTemplate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getSsids() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMetered(final int matchCriteria) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSsids(@NonNull final Set<String> ssids) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinUpstreamBandwidthKbps(final int minEntryUpstreamBandwidthKbps, final int minExitUpstreamBandwidthKbps) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinDownstreamBandwidthKbps(final int minEntryDownstreamBandwidthKbps, final int minExitDownstreamBandwidthKbps) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public VcnWifiUnderlyingNetworkTemplate build() {
            throw new RuntimeException("Stub!");
        }
    }
}
