package android.adservices.customaudience;

import android.os.Parcel;
import android.adservices.common.AdSelectionSignals;
import java.time.Instant;
import android.os.Parcelable;

public final class PartialCustomAudience implements Parcelable
{
    @NonNull
    public static final Creator<PartialCustomAudience> CREATOR;
    
    PartialCustomAudience() {
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
    
    @Nullable
    public AdSelectionSignals getUserBiddingSignals() {
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
    
    @Override
    public String toString() {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String name) {
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
        public PartialCustomAudience build() {
            throw new RuntimeException("Stub!");
        }
    }
}
