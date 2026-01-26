package android.net.vcn;

public abstract class VcnUnderlyingNetworkTemplate
{
    public static final int MATCH_ANY = 0;
    public static final int MATCH_FORBIDDEN = 2;
    public static final int MATCH_REQUIRED = 1;
    
    VcnUnderlyingNetworkTemplate() {
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
    
    public int getMetered() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinEntryUpstreamBandwidthKbps() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinExitUpstreamBandwidthKbps() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinEntryDownstreamBandwidthKbps() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinExitDownstreamBandwidthKbps() {
        throw new RuntimeException("Stub!");
    }
}
