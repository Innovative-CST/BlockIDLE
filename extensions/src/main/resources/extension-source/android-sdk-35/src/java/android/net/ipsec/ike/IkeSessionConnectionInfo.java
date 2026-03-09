package android.net.ipsec.ike;

import android.net.Network;
import java.net.InetAddress;

public final class IkeSessionConnectionInfo
{
    public IkeSessionConnectionInfo(@NonNull final InetAddress localAddress, @NonNull final InetAddress remoteAddress, @NonNull final Network network) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public InetAddress getLocalAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public InetAddress getRemoteAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Network getNetwork() {
        throw new RuntimeException("Stub!");
    }
}
