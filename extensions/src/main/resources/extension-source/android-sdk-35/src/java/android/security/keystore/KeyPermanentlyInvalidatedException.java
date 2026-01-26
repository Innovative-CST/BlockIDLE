package android.security.keystore;

import java.security.InvalidKeyException;

public class KeyPermanentlyInvalidatedException extends InvalidKeyException
{
    public KeyPermanentlyInvalidatedException() {
        throw new RuntimeException("Stub!");
    }
    
    public KeyPermanentlyInvalidatedException(final String message) {
        throw new RuntimeException("Stub!");
    }
    
    public KeyPermanentlyInvalidatedException(final String message, final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
}
