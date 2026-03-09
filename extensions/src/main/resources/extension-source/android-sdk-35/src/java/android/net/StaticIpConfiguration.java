package android.net;

import android.os.Parcel;
import java.util.List;
import java.net.InetAddress;
import android.os.Parcelable;

public final class StaticIpConfiguration implements Parcelable
{
    @NonNull
    public static final Creator<StaticIpConfiguration> CREATOR;
    
    StaticIpConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LinkAddress getIpAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InetAddress getGateway() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<InetAddress> getDnsServers() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDomains() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
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
        public Builder setIpAddress(@NonNull final LinkAddress ipAddress) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setGateway(@Nullable final InetAddress gateway) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDnsServers(@NonNull final Iterable<InetAddress> dnsServers) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDomains(@Nullable final String newDomains) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StaticIpConfiguration build() {
            throw new RuntimeException("Stub!");
        }
    }
}
