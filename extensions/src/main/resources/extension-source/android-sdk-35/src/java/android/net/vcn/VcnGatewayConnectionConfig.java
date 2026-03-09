package android.net.vcn;

import android.net.ipsec.ike.IkeTunnelConnectionParams;
import java.util.List;

public final class VcnGatewayConnectionConfig
{
    public static final int VCN_GATEWAY_OPTION_ENABLE_DATA_STALL_RECOVERY_WITH_MOBILITY = 0;
    
    VcnGatewayConnectionConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getGatewayConnectionName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getExposedCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<VcnUnderlyingNetworkTemplate> getVcnUnderlyingNetworkPriorities() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public long[] getRetryIntervalsMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxMtu() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinUdpPort4500NatTimeoutSeconds() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSafeModeEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasGatewayOption(final int option) {
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
    
    public static final class Builder
    {
        public Builder(@NonNull final String gatewayConnectionName, @NonNull final IkeTunnelConnectionParams tunnelConnectionParams) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addExposedCapability(final int exposedCapability) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder removeExposedCapability(final int exposedCapability) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVcnUnderlyingNetworkPriorities(@NonNull final List<VcnUnderlyingNetworkTemplate> underlyingNetworkTemplates) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRetryIntervalsMillis(@NonNull final long[] retryIntervalsMs) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMaxMtu(final int maxMtu) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinUdpPort4500NatTimeoutSeconds(final int minUdpPort4500NatTimeoutSeconds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addGatewayOption(final int option) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder removeGatewayOption(final int option) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSafeModeEnabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public VcnGatewayConnectionConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
