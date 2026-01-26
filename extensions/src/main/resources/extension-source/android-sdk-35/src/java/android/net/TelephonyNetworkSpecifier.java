package android.net;

import android.os.Parcel;
import android.os.Parcelable;

public final class TelephonyNetworkSpecifier extends NetworkSpecifier implements Parcelable
{
    @NonNull
    public static final Creator<TelephonyNetworkSpecifier> CREATOR;
    
    TelephonyNetworkSpecifier() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSubscriptionId() {
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
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
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
        
        @NonNull
        public Builder setSubscriptionId(final int subId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TelephonyNetworkSpecifier build() {
            throw new RuntimeException("Stub!");
        }
    }
}
