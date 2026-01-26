package android.adservices.customaudience;

import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;

public class AddCustomAudienceOverrideRequest
{
    public AddCustomAudienceOverrideRequest(@NonNull final AdTechIdentifier buyer, @NonNull final String name, @NonNull final String biddingLogicJs, @NonNull final AdSelectionSignals trustedBiddingSignals) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AdTechIdentifier getBuyer() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getBiddingLogicJs() {
        throw new RuntimeException("Stub!");
    }
    
    public long getBiddingLogicJsVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AdSelectionSignals getTrustedBiddingSignals() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBuyer(@NonNull final AdTechIdentifier buyer) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setName(@NonNull final String name) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTrustedBiddingSignals(@NonNull final AdSelectionSignals trustedBiddingSignals) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBiddingLogicJs(@NonNull final String biddingLogicJs) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBiddingLogicJsVersion(final long biddingLogicJsVersion) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AddCustomAudienceOverrideRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
