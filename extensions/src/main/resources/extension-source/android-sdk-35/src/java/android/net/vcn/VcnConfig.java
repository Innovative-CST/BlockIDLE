package android.net.vcn;

import android.content.Context;
import android.os.Parcel;
import java.util.Set;
import android.os.Parcelable;

public final class VcnConfig implements Parcelable
{
    @NonNull
    public static final Creator<VcnConfig> CREATOR;
    
    VcnConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<VcnGatewayConnectionConfig> getGatewayConnectionConfigs() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Integer> getRestrictedUnderlyingNetworkTransports() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addGatewayConnectionConfig(@NonNull final VcnGatewayConnectionConfig gatewayConnectionConfig) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRestrictedUnderlyingNetworkTransports(@NonNull final Set<Integer> transports) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public VcnConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
