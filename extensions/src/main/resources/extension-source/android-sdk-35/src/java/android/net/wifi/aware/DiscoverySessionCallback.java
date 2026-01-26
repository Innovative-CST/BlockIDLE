package android.net.wifi.aware;

import java.util.List;

public class DiscoverySessionCallback
{
    public DiscoverySessionCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public void onPublishStarted(@NonNull final PublishDiscoverySession session) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSubscribeStarted(@NonNull final SubscribeDiscoverySession session) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSessionConfigUpdated() {
        throw new RuntimeException("Stub!");
    }
    
    public void onSessionConfigFailed() {
        throw new RuntimeException("Stub!");
    }
    
    public void onSessionTerminated() {
        throw new RuntimeException("Stub!");
    }
    
    public void onServiceDiscovered(final PeerHandle peerHandle, final byte[] serviceSpecificInfo, final List<byte[]> matchFilter) {
        throw new RuntimeException("Stub!");
    }
    
    public void onServiceDiscovered(@NonNull final ServiceDiscoveryInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    public void onServiceDiscoveredWithinRange(final PeerHandle peerHandle, final byte[] serviceSpecificInfo, final List<byte[]> matchFilter, final int distanceMm) {
        throw new RuntimeException("Stub!");
    }
    
    public void onServiceDiscoveredWithinRange(@NonNull final ServiceDiscoveryInfo info, final int distanceMm) {
        throw new RuntimeException("Stub!");
    }
    
    public void onMessageSendSucceeded(final int messageId) {
        throw new RuntimeException("Stub!");
    }
    
    public void onMessageSendFailed(final int messageId) {
        throw new RuntimeException("Stub!");
    }
    
    public void onMessageReceived(final PeerHandle peerHandle, final byte[] message) {
        throw new RuntimeException("Stub!");
    }
    
    public void onServiceLost(@NonNull final PeerHandle peerHandle, final int reason) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPairingSetupRequestReceived(@NonNull final PeerHandle peerHandle, final int requestId) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPairingSetupSucceeded(@NonNull final PeerHandle peerHandle, @NonNull final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPairingSetupFailed(@NonNull final PeerHandle peerHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPairingVerificationSucceed(@NonNull final PeerHandle peerHandle, @NonNull final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPairingVerificationFailed(@NonNull final PeerHandle peerHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public void onBootstrappingSucceeded(@NonNull final PeerHandle peerHandle, final int method) {
        throw new RuntimeException("Stub!");
    }
    
    public void onBootstrappingFailed(@NonNull final PeerHandle peerHandle) {
        throw new RuntimeException("Stub!");
    }
}
