package android.net.nsd;

import android.os.Parcel;
import android.net.Network;
import android.os.Parcelable;

public final class DiscoveryRequest implements Parcelable
{
    @NonNull
    public static final Creator<DiscoveryRequest> CREATOR;
    
    DiscoveryRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getServiceType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getSubtype() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Network getNetwork() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
        public Builder(@NonNull final String serviceType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSubtype(@Nullable final String subtype) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNetwork(@Nullable final Network network) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public DiscoveryRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
