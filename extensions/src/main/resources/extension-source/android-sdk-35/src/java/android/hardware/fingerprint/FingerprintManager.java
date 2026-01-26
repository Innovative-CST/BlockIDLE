package android.hardware.fingerprint;

import javax.crypto.Mac;
import javax.crypto.Cipher;
import java.security.Signature;
import android.os.Handler;
import android.os.CancellationSignal;

@Deprecated
public class FingerprintManager
{
    public static final int FINGERPRINT_ACQUIRED_GOOD = 0;
    public static final int FINGERPRINT_ACQUIRED_IMAGER_DIRTY = 3;
    public static final int FINGERPRINT_ACQUIRED_INSUFFICIENT = 2;
    public static final int FINGERPRINT_ACQUIRED_PARTIAL = 1;
    public static final int FINGERPRINT_ACQUIRED_TOO_FAST = 5;
    public static final int FINGERPRINT_ACQUIRED_TOO_SLOW = 4;
    public static final int FINGERPRINT_ERROR_CANCELED = 5;
    public static final int FINGERPRINT_ERROR_HW_NOT_PRESENT = 12;
    public static final int FINGERPRINT_ERROR_HW_UNAVAILABLE = 1;
    public static final int FINGERPRINT_ERROR_LOCKOUT = 7;
    public static final int FINGERPRINT_ERROR_LOCKOUT_PERMANENT = 9;
    public static final int FINGERPRINT_ERROR_NO_FINGERPRINTS = 11;
    public static final int FINGERPRINT_ERROR_NO_SPACE = 4;
    public static final int FINGERPRINT_ERROR_TIMEOUT = 3;
    public static final int FINGERPRINT_ERROR_UNABLE_TO_PROCESS = 2;
    public static final int FINGERPRINT_ERROR_USER_CANCELED = 10;
    public static final int FINGERPRINT_ERROR_VENDOR = 8;
    
    FingerprintManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void authenticate(@Nullable final CryptoObject crypto, @Nullable final CancellationSignal cancel, final int flags, @NonNull final AuthenticationCallback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean hasEnrolledFingerprints() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isHardwareDetected() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract static class AuthenticationCallback
    {
        @Deprecated
        public AuthenticationCallback() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onAuthenticationError(final int errorCode, final CharSequence errString) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onAuthenticationHelp(final int helpCode, final CharSequence helpString) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onAuthenticationSucceeded(final AuthenticationResult result) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onAuthenticationFailed() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class AuthenticationResult
    {
        AuthenticationResult() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public CryptoObject getCryptoObject() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static final class CryptoObject
    {
        @Deprecated
        public CryptoObject(@NonNull final Signature signature) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public CryptoObject(@NonNull final Cipher cipher) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public CryptoObject(@NonNull final Mac mac) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Signature getSignature() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Cipher getCipher() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Mac getMac() {
            throw new RuntimeException("Stub!");
        }
    }
}
