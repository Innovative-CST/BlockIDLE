package android.adservices.adselection;

import java.util.Map;
import android.adservices.common.AdSelectionSignals;
import java.util.List;
import android.net.Uri;
import android.adservices.common.AdTechIdentifier;
import android.os.Parcel;
import android.os.Parcelable;

public final class AdSelectionConfig implements Parcelable
{
    @NonNull
    public static final Creator<AdSelectionConfig> CREATOR;
    
    AdSelectionConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
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
    
    @NonNull
    public AdTechIdentifier getSeller() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getDecisionLogicUri() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AdTechIdentifier> getCustomAudienceBuyers() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AdSelectionSignals getAdSelectionSignals() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AdSelectionSignals getSellerSignals() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<AdTechIdentifier, AdSelectionSignals> getPerBuyerSignals() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<AdTechIdentifier, SignedContextualAds> getPerBuyerSignedContextualAds() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getTrustedScoringSignalsUri() {
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
        public Builder setSeller(@NonNull final AdTechIdentifier seller) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDecisionLogicUri(@NonNull final Uri decisionLogicUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCustomAudienceBuyers(@NonNull final List<AdTechIdentifier> customAudienceBuyers) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAdSelectionSignals(@NonNull final AdSelectionSignals adSelectionSignals) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSellerSignals(@NonNull final AdSelectionSignals sellerSignals) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPerBuyerSignals(@NonNull final Map<AdTechIdentifier, AdSelectionSignals> perBuyerSignals) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPerBuyerSignedContextualAds(@NonNull final Map<AdTechIdentifier, SignedContextualAds> buyerSignedContextualAds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTrustedScoringSignalsUri(@NonNull final Uri trustedScoringSignalsUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AdSelectionConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
