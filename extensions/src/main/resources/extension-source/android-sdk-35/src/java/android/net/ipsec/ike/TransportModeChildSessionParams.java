package android.net.ipsec.ike;

public final class TransportModeChildSessionParams extends ChildSessionParams
{
    TransportModeChildSessionParams() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final TransportModeChildSessionParams childParams) {
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
        public TransportModeChildSessionParams build() {
            throw new RuntimeException("Stub!");
        }
    }
}
