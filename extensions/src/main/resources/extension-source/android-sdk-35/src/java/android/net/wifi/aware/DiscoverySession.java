package android.net.wifi.aware;

import android.net.NetworkSpecifier;

public class DiscoverySession implements AutoCloseable
{
    DiscoverySession() {
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
    
    public void sendMessage(@NonNull final PeerHandle peerHandle, final int messageId, @Nullable final byte[] message) {
        throw new RuntimeException("Stub!");
    }
    
    public void initiatePairingRequest(@NonNull final PeerHandle peerHandle, @NonNull final String peerDeviceAlias, final int cipherSuite, @Nullable final String password) {
        throw new RuntimeException("Stub!");
    }
    
    public void acceptPairingRequest(final int requestId, @NonNull final PeerHandle peerHandle, @NonNull final String peerDeviceAlias, final int cipherSuite, @Nullable final String password) {
        throw new RuntimeException("Stub!");
    }
    
    public void rejectPairingRequest(final int requestId, @NonNull final PeerHandle peerHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public void initiateBootstrappingRequest(@NonNull final PeerHandle peerHandle, final int method) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public NetworkSpecifier createNetworkSpecifierOpen(@NonNull final PeerHandle peerHandle) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public NetworkSpecifier createNetworkSpecifierPassphrase(@NonNull final PeerHandle peerHandle, @NonNull final String passphrase) {
        throw new RuntimeException("Stub!");
    }
}
