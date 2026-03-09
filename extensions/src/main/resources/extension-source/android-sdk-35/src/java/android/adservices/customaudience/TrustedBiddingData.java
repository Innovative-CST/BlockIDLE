package android.adservices.customaudience;

import java.util.List;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class TrustedBiddingData implements Parcelable
{
    @NonNull
    public static final Creator<TrustedBiddingData> CREATOR;
    
    TrustedBiddingData() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getTrustedBiddingUri() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getTrustedBiddingKeys() {
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
        public Builder setTrustedBiddingUri(@NonNull final Uri trustedBiddingUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTrustedBiddingKeys(@NonNull final List<String> trustedBiddingKeys) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TrustedBiddingData build() {
            throw new RuntimeException("Stub!");
        }
    }
}
