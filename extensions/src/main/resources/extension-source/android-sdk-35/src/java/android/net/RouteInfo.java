package android.net;

import android.os.Parcel;
import java.net.InetAddress;
import android.os.Parcelable;

public final class RouteInfo implements Parcelable
{
    @NonNull
    public static final Creator<RouteInfo> CREATOR;
    public static final int RTN_THROW = 9;
    public static final int RTN_UNICAST = 1;
    public static final int RTN_UNREACHABLE = 7;
    
    RouteInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public IpPrefix getDestination() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InetAddress getGateway() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getInterface() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDefaultRoute() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasGateway() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean matches(final InetAddress destination) {
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
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
