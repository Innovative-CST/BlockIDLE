package android.security;

public class KeyStoreException extends Exception
{
    public static final int ERROR_ATTESTATION_CHALLENGE_TOO_LARGE = 9;
    public static final int ERROR_ATTESTATION_KEYS_UNAVAILABLE = 16;
    public static final int ERROR_ID_ATTESTATION_FAILURE = 8;
    public static final int ERROR_INCORRECT_USAGE = 13;
    public static final int ERROR_INTERNAL_SYSTEM_ERROR = 4;
    public static final int ERROR_KEYMINT_FAILURE = 10;
    public static final int ERROR_KEYSTORE_FAILURE = 11;
    public static final int ERROR_KEYSTORE_UNINITIALIZED = 3;
    public static final int ERROR_KEY_CORRUPTED = 7;
    public static final int ERROR_KEY_DOES_NOT_EXIST = 6;
    public static final int ERROR_KEY_NOT_TEMPORALLY_VALID = 14;
    public static final int ERROR_KEY_OPERATION_EXPIRED = 15;
    public static final int ERROR_OTHER = 1;
    public static final int ERROR_PERMISSION_DENIED = 5;
    public static final int ERROR_UNIMPLEMENTED = 12;
    public static final int ERROR_USER_AUTHENTICATION_REQUIRED = 2;
    public static final int RETRY_AFTER_NEXT_REBOOT = 4;
    public static final int RETRY_NEVER = 1;
    public static final int RETRY_WHEN_CONNECTIVITY_AVAILABLE = 3;
    public static final int RETRY_WITH_EXPONENTIAL_BACKOFF = 2;
    
    KeyStoreException() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNumericErrorCode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTransientFailure() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean requiresUserAuthentication() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSystemError() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRetryPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
