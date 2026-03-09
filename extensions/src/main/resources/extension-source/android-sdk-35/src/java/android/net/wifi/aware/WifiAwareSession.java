package android.net.wifi.aware;

import android.net.NetworkSpecifier;
import android.os.Handler;

public class WifiAwareSession implements AutoCloseable
{
    WifiAwareSession() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public void publish(@NonNull final PublishConfig publishConfig, @NonNull final DiscoverySessionCallback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void subscribe(@NonNull final SubscribeConfig subscribeConfig, @NonNull final DiscoverySessionCallback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public NetworkSpecifier createNetworkSpecifierOpen(final int role, @NonNull final byte[] peer) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public NetworkSpecifier createNetworkSpecifierPassphrase(final int role, @NonNull final byte[] peer, @NonNull final String passphrase) {
        throw new RuntimeException("Stub!");
    }
}
