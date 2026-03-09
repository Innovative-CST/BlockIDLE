package android.security.keystore;

import java.security.InvalidKeyException;

public class UserNotAuthenticatedException extends InvalidKeyException
{
    public UserNotAuthenticatedException() {
        throw new RuntimeException("Stub!");
    }
    
    public UserNotAuthenticatedException(final String message) {
        throw new RuntimeException("Stub!");
    }
    
    public UserNotAuthenticatedException(final String message, final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
}
