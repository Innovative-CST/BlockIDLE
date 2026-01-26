package android.net.wifi.aware;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

public final class SubscribeConfig implements Parcelable
{
    @NonNull
    public static final Creator<SubscribeConfig> CREATOR;
    public static final int SUBSCRIBE_TYPE_ACTIVE = 1;
    public static final int SUBSCRIBE_TYPE_PASSIVE = 0;
    
    SubscribeConfig() {
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
    public void writeToParcel(final Parcel dest, final int flags) {
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
    
    public boolean isInstantCommunicationModeEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInstantCommunicationBand() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AwarePairingConfig getPairingConfig() {
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
        
        public Builder setServiceName(@NonNull final String serviceName) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setServiceSpecificInfo(@Nullable final byte[] serviceSpecificInfo) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setMatchFilter(@Nullable final List<byte[]> matchFilter) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setSubscribeType(final int subscribeType) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setTtlSec(final int ttlSec) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setTerminateNotificationEnabled(final boolean enable) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setMinDistanceMm(final int minDistanceMm) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setMaxDistanceMm(final int maxDistanceMm) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInstantCommunicationModeEnabled(final boolean enabled, final int band) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPairingConfig(@Nullable final AwarePairingConfig config) {
            throw new RuntimeException("Stub!");
        }
        
        public SubscribeConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
