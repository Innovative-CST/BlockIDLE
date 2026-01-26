package android.net.wifi.aware;

import java.util.List;

public final class ServiceDiscoveryInfo
{
    ServiceDiscoveryInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PeerHandle getPeerHandle() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<byte[]> getMatchFilters() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getServiceSpecificInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getScid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPeerCipherSuite() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPairedAlias() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AwarePairingConfig getPairingConfig() {
        throw new RuntimeException("Stub!");
    }
}
