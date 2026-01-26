package android.net.ipsec.ike;

import java.net.Inet4Address;

public final class IkeIpv4AddrIdentification extends IkeIdentification
{
    @NonNull
    public final Inet4Address ipv4Address;
    
    public IkeIpv4AddrIdentification(@NonNull final Inet4Address address) {
        this.ipv4Address = null;
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
}
