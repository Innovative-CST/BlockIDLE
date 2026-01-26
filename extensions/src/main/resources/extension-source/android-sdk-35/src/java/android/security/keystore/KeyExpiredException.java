package android.security.keystore;

import java.security.InvalidKeyException;

public class KeyExpiredException extends InvalidKeyException
{
    public KeyExpiredException() {
        throw new RuntimeException("Stub!");
    }
    
    public KeyExpiredException(final String message) {
        throw new RuntimeException("Stub!");
    }
    
    public KeyExpiredException(final String message, final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
}
