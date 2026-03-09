package android.net.ipsec.ike;

import java.net.InetAddress;

public final class IkeTrafficSelector
{
    public final int endPort;
    @NonNull
    public final InetAddress endingAddress;
    public final int startPort;
    @NonNull
    public final InetAddress startingAddress;
    
    public IkeTrafficSelector(final int startPort, final int endPort, @NonNull final InetAddress startingAddress, @NonNull final InetAddress endingAddress) {
        this.endPort = 0;
        this.endingAddress = null;
        this.startPort = 0;
        this.startingAddress = null;
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
