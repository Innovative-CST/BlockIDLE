package android.security.keystore;

import java.security.ProviderException;

public class BackendBusyException extends ProviderException
{
    public BackendBusyException(final long backOffHintMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public BackendBusyException(final long backOffHintMillis, @NonNull final String message) {
        throw new RuntimeException("Stub!");
    }
    
    public BackendBusyException(final long backOffHintMillis, @NonNull final String message, @NonNull final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
    
    public long getBackOffHintMillis() {
        throw new RuntimeException("Stub!");
    }
}
