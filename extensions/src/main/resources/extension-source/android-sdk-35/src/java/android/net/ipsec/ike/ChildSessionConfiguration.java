package android.net.ipsec.ike;

import java.util.List;

public final class ChildSessionConfiguration
{
    ChildSessionConfiguration() {
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
    
    public static final class Builder
    {
        public Builder(@NonNull final List<IkeTrafficSelector> inTs, @NonNull final List<IkeTrafficSelector> outTs) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ChildSessionConfiguration build() {
            throw new RuntimeException("Stub!");
        }
    }
}
