package android.adservices.adselection;

import java.util.List;
import android.net.Uri;
import android.adservices.common.AdTechIdentifier;
import android.os.Parcel;
import android.os.Parcelable;

public final class SignedContextualAds implements Parcelable
{
    @NonNull
    public static final Creator<SignedContextualAds> CREATOR;
    
    SignedContextualAds() {
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
    public AdTechIdentifier getBuyer() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getDecisionLogicUri() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AdWithBid> getAdsWithBid() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getSignature() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
        
        public Builder(@NonNull final SignedContextualAds signedContextualAds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBuyer(@NonNull final AdTechIdentifier buyer) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDecisionLogicUri(@NonNull final Uri decisionLogicUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAdsWithBid(@NonNull final List<AdWithBid> adsWithBid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSignature(@NonNull final byte[] signature) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SignedContextualAds build() {
            throw new RuntimeException("Stub!");
        }
    }
}
