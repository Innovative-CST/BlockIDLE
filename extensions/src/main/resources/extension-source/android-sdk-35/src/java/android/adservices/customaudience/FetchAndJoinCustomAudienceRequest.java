package android.adservices.customaudience;

import android.adservices.common.AdSelectionSignals;
import java.time.Instant;
import android.net.Uri;

public final class FetchAndJoinCustomAudienceRequest
{
    FetchAndJoinCustomAudienceRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getFetchUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Instant getActivationTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Instant getExpirationTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AdSelectionSignals getUserBiddingSignals() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Uri fetchUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFetchUri(@NonNull final Uri fetchUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setName(@Nullable final String name) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setActivationTime(@Nullable final Instant activationTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExpirationTime(@Nullable final Instant expirationTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUserBiddingSignals(@Nullable final AdSelectionSignals userBiddingSignals) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public FetchAndJoinCustomAudienceRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
