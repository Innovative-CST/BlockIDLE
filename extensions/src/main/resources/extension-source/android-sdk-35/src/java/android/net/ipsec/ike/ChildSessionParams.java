package android.net.ipsec.ike;

import java.util.List;

public abstract class ChildSessionParams
{
    ChildSessionParams() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<IkeTrafficSelector> getInboundTrafficSelectors() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<IkeTrafficSelector> getOutboundTrafficSelectors() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ChildSaProposal> getChildSaProposals() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHardLifetimeSeconds() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSoftLifetimeSeconds() {
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
}
