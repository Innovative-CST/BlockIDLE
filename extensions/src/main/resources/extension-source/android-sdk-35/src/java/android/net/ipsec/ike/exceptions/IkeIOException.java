package android.net.ipsec.ike.exceptions;

import java.io.IOException;

public final class IkeIOException extends IkeNonProtocolException
{
    public IkeIOException(@NonNull final IOException cause) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public IOException getCause() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized Throwable initCause(final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
}
