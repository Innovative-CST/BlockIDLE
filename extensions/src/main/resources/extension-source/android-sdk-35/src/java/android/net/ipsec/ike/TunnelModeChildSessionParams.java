package android.net.ipsec.ike;

import java.net.Inet6Address;
import java.net.Inet4Address;
import java.util.List;

public final class TunnelModeChildSessionParams extends ChildSessionParams
{
    TunnelModeChildSessionParams() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<TunnelModeChildConfigRequest> getConfigurationRequests() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final TunnelModeChildSessionParams childParams) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addChildSaProposal(@NonNull final ChildSaProposal proposal) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addInboundTrafficSelectors(@NonNull final IkeTrafficSelector trafficSelector) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addOutboundTrafficSelectors(@NonNull final IkeTrafficSelector trafficSelector) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLifetimeSeconds(final int hardLifetimeSeconds, final int softLifetimeSeconds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addInternalAddressRequest(final int addressFamily) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addInternalAddressRequest(@NonNull final Inet4Address address) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addInternalAddressRequest(@NonNull final Inet6Address address, final int prefixLen) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addInternalDnsServerRequest(final int addressFamily) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addInternalDhcpServerRequest(final int addressFamily) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TunnelModeChildSessionParams build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface TunnelModeChildConfigRequest
    {
    }
    
    public interface ConfigRequestIpv6DnsServer extends TunnelModeChildConfigRequest
    {
    }
    
    public interface ConfigRequestIpv6Address extends TunnelModeChildConfigRequest
    {
        @Nullable
        Inet6Address getAddress();
        
        int getPrefixLength();
    }
    
    public interface ConfigRequestIpv4Netmask extends TunnelModeChildConfigRequest
    {
    }
    
    public interface ConfigRequestIpv4DnsServer extends TunnelModeChildConfigRequest
    {
    }
    
    public interface ConfigRequestIpv4DhcpServer extends TunnelModeChildConfigRequest
    {
    }
    
    public interface ConfigRequestIpv4Address extends TunnelModeChildConfigRequest
    {
        @Nullable
        Inet4Address getAddress();
    }
}
