package android.media.metrics;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class NetworkEvent extends Event implements Parcelable
{
    @NonNull
    public static final Creator<NetworkEvent> CREATOR;
    public static final int NETWORK_TYPE_2G = 4;
    public static final int NETWORK_TYPE_3G = 5;
    public static final int NETWORK_TYPE_4G = 6;
    public static final int NETWORK_TYPE_5G_NSA = 7;
    public static final int NETWORK_TYPE_5G_SA = 8;
    public static final int NETWORK_TYPE_ETHERNET = 3;
    public static final int NETWORK_TYPE_OFFLINE = 9;
    public static final int NETWORK_TYPE_OTHER = 1;
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    public static final int NETWORK_TYPE_WIFI = 2;
    
    NetworkEvent() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNetworkType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getTimeSinceCreatedMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public Bundle getMetricsBundle() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNetworkType(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTimeSinceCreatedMillis(final long value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMetricsBundle(@NonNull final Bundle metricsBundle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public NetworkEvent build() {
            throw new RuntimeException("Stub!");
        }
    }
}
