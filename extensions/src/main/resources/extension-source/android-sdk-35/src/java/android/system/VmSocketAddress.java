package android.system;

import java.net.SocketAddress;

public final class VmSocketAddress extends SocketAddress
{
    public VmSocketAddress(final int svmPort, final int svmCid) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSvmPort() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSvmCid() {
        throw new RuntimeException("Stub!");
    }
}
