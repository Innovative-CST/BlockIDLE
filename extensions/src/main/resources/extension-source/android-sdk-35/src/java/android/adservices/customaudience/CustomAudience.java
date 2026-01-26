package android.adservices.customaudience;

import android.adservices.common.AdData;
import java.util.List;
import android.adservices.common.AdSelectionSignals;
import android.net.Uri;
import java.time.Instant;
import android.adservices.common.AdTechIdentifier;
import android.os.Parcel;
import android.os.Parcelable;

public final class CustomAudience implements Parcelable
{
    @NonNull
    public static final Creator<CustomAudience> CREATOR;
    public static final int FLAG_AUCTION_SERVER_REQUEST_OMIT_ADS = 1;
    
    CustomAudience() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
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
    
    @Nullable
    public Instant getActivationTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Instant getExpirationTime() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getDailyUpdateUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AdSelectionSignals getUserBiddingSignals() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public TrustedBiddingData getTrustedBiddingData() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getBiddingLogicUri() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AdData> getAds() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAuctionServerRequestFlags() {
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
    
    static {
        CREATOR = null;
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
        public Builder setActivationTime(@Nullable final Instant activationTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExpirationTime(@Nullable final Instant expirationTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDailyUpdateUri(@NonNull final Uri dailyUpdateUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUserBiddingSignals(@Nullable final AdSelectionSignals userBiddingSignals) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTrustedBiddingData(@Nullable final TrustedBiddingData trustedBiddingData) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBiddingLogicUri(@NonNull final Uri biddingLogicUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAds(@Nullable final List<AdData> ads) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAuctionServerRequestFlags(final int auctionServerRequestFlags) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CustomAudience build() {
            throw new RuntimeException("Stub!");
        }
    }
}
