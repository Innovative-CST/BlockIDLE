package android.net;

import java.io.IOException;
import java.net.InetAddress;
import android.content.Context;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

public final class IpSecTransform implements AutoCloseable
{
    IpSecTransform() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
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
    
    public void requestIpSecTransformState(@NonNull final Executor executor, @NonNull final OutcomeReceiver<IpSecTransformState, RuntimeException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static class Builder
    {
        public Builder(@NonNull final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEncryption(@NonNull final IpSecAlgorithm algo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAuthentication(@NonNull final IpSecAlgorithm algo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAuthenticatedEncryption(@NonNull final IpSecAlgorithm algo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIpv4Encapsulation(@NonNull final IpSecManager.UdpEncapsulationSocket localSocket, final int remotePort) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public IpSecTransform buildTransportModeTransform(@NonNull final InetAddress sourceAddress, @NonNull final IpSecManager.SecurityParameterIndex spi) throws IOException, IpSecManager.ResourceUnavailableException, IpSecManager.SpiUnavailableException {
            throw new RuntimeException("Stub!");
        }
    }
}
