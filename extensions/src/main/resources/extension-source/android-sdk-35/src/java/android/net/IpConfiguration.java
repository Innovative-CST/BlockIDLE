package android.net;

import android.os.Parcel;
import android.os.Parcelable;

public final class IpConfiguration implements Parcelable
{
    @NonNull
    public static final Creator<IpConfiguration> CREATOR;
    
    IpConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public StaticIpConfiguration getStaticIpConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ProxyInfo getHttpProxy() {
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
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStaticIpConfiguration(@Nullable final StaticIpConfiguration config) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHttpProxy(@Nullable final ProxyInfo proxyInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public IpConfiguration build() {
            throw new RuntimeException("Stub!");
        }
    }
}
