package android.net.ssl;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLEngine;

public class SSLEngines
{
    SSLEngines() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isSupportedEngine(@NonNull final SSLEngine engine) {
        throw new RuntimeException("Stub!");
    }
    
    public static void setUseSessionTickets(@NonNull final SSLEngine engine, final boolean useSessionTickets) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static byte[] exportKeyingMaterial(@NonNull final SSLEngine engine, @NonNull final String label, @Nullable final byte[] context, final int length) throws SSLException {
        throw new RuntimeException("Stub!");
    }
}
