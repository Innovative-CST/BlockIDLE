package android.net.ssl;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;

public class SSLSockets
{
    SSLSockets() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isSupportedSocket(@NonNull final SSLSocket socket) {
        throw new RuntimeException("Stub!");
    }
    
    public static void setUseSessionTickets(@NonNull final SSLSocket socket, final boolean useSessionTickets) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static byte[] exportKeyingMaterial(@NonNull final SSLSocket socket, @NonNull final String label, @Nullable final byte[] context, final int length) throws SSLException {
        throw new RuntimeException("Stub!");
    }
}
