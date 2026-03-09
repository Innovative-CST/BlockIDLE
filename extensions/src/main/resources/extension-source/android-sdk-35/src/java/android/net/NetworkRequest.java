package android.net;

import java.util.Set;
import android.os.Parcel;
import android.os.Parcelable;

public class NetworkRequest implements Parcelable
{
    @NonNull
    public static final Creator<NetworkRequest> CREATOR;
    
    NetworkRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasCapability(final int capability) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canBeSatisfiedBy(@Nullable final NetworkCapabilities nc) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasTransport(final int transportType) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public NetworkSpecifier getNetworkSpecifier() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getTransportTypes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Integer> getSubscriptionIds() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final NetworkRequest request) {
            throw new RuntimeException("Stub!");
        }
        
        public NetworkRequest build() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addCapability(final int capability) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder removeCapability(final int capability) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearCapabilities() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addTransportType(final int transportType) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder removeTransportType(final int transportType) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setNetworkSpecifier(final String networkSpecifier) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setNetworkSpecifier(final NetworkSpecifier networkSpecifier) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSubscriptionIds(@NonNull final Set<Integer> subIds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIncludeOtherUidNetworks(final boolean include) {
            throw new RuntimeException("Stub!");
        }
    }
}
