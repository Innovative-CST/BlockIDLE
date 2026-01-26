package android.net;

import android.os.Parcel;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Collection;
import java.util.List;
import android.os.Parcelable;

public final class LinkProperties implements Parcelable
{
    @NonNull
    public static final Creator<LinkProperties> CREATOR;
    
    public LinkProperties() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInterfaceName(@Nullable final String iface) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getInterfaceName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<LinkAddress> getLinkAddresses() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLinkAddresses(@NonNull final Collection<LinkAddress> addresses) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDnsServers(@NonNull final Collection<InetAddress> dnsServers) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<InetAddress> getDnsServers() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPrivateDnsActive() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDhcpServerAddress(@Nullable final Inet4Address serverAddress) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Inet4Address getDhcpServerAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPrivateDnsServerName() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDomains(@Nullable final String domains) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDomains() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMtu(final int mtu) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMtu() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean addRoute(@NonNull final RouteInfo route) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<RouteInfo> getRoutes() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHttpProxy(@Nullable final ProxyInfo proxy) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ProxyInfo getHttpProxy() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public IpPrefix getNat64Prefix() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNat64Prefix(@Nullable final IpPrefix prefix) {
        throw new RuntimeException("Stub!");
    }
    
    public void clear() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWakeOnLanSupported() {
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
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
