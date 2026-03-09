package android.net.ipsec.ike;

import java.net.Inet6Address;

public class IkeIpv6AddrIdentification extends IkeIdentification
{
    @NonNull
    public final Inet6Address ipv6Address;
    
    public IkeIpv6AddrIdentification(@NonNull final Inet6Address address) {
        this.ipv6Address = null;
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
