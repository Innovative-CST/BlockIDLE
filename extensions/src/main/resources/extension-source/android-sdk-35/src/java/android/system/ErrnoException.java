package android.system;

import java.net.SocketException;
import java.io.IOException;

public final class ErrnoException extends Exception
{
    public final int errno;
    
    public ErrnoException(final String functionName, final int errno) {
        this.errno = 0;
        throw new RuntimeException("Stub!");
    }
    
    public ErrnoException(final String functionName, final int errno, final Throwable cause) {
        this.errno = 0;
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getMessage() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public IOException rethrowAsIOException() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SocketException rethrowAsSocketException() throws SocketException {
        throw new RuntimeException("Stub!");
    }
}
