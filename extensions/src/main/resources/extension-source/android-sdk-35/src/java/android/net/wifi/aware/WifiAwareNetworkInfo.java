package android.net.wifi.aware;

import android.os.Parcel;
import java.util.List;
import java.net.Inet6Address;
import android.os.Parcelable;
import android.net.TransportInfo;

public final class WifiAwareNetworkInfo implements TransportInfo, Parcelable
{
    @NonNull
    public static final Creator<WifiAwareNetworkInfo> CREATOR;
    
    WifiAwareNetworkInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Inet6Address getPeerIpv6Addr() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPort() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTransportProtocol() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<WifiAwareChannelInfo> getChannelInfoList() {
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
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
