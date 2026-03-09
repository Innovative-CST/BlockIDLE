package android.hardware.biometrics;

import android.security.identity.PresentationSession;
import android.security.identity.IdentityCredential;
import javax.crypto.Mac;
import javax.crypto.Cipher;
import java.security.Signature;
import android.content.DialogInterface;
import android.content.Context;
import java.util.concurrent.Executor;
import android.os.CancellationSignal;
import android.graphics.Bitmap;

public class BiometricPrompt
{
    public static final int AUTHENTICATION_RESULT_TYPE_BIOMETRIC = 2;
    public static final int AUTHENTICATION_RESULT_TYPE_DEVICE_CREDENTIAL = 1;
    public static final int BIOMETRIC_ACQUIRED_GOOD = 0;
    public static final int BIOMETRIC_ACQUIRED_IMAGER_DIRTY = 3;
    public static final int BIOMETRIC_ACQUIRED_INSUFFICIENT = 2;
    public static final int BIOMETRIC_ACQUIRED_PARTIAL = 1;
    public static final int BIOMETRIC_ACQUIRED_TOO_FAST = 5;
    public static final int BIOMETRIC_ACQUIRED_TOO_SLOW = 4;
    public static final int BIOMETRIC_ERROR_CANCELED = 5;
    public static final int BIOMETRIC_ERROR_HW_NOT_PRESENT = 12;
    public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = 1;
    public static final int BIOMETRIC_ERROR_LOCKOUT = 7;
    public static final int BIOMETRIC_ERROR_LOCKOUT_PERMANENT = 9;
    public static final int BIOMETRIC_ERROR_NO_BIOMETRICS = 11;
    public static final int BIOMETRIC_ERROR_NO_DEVICE_CREDENTIAL = 14;
    public static final int BIOMETRIC_ERROR_NO_SPACE = 4;
    public static final int BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final int BIOMETRIC_ERROR_TIMEOUT = 3;
    public static final int BIOMETRIC_ERROR_UNABLE_TO_PROCESS = 2;
    public static final int BIOMETRIC_ERROR_USER_CANCELED = 10;
    public static final int BIOMETRIC_ERROR_VENDOR = 8;
    public static final long BIOMETRIC_NO_AUTHENTICATION = -1L;
    
    BiometricPrompt() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLogoRes() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getLogoBitmap() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getLogoDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getTitle() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getSubtitle() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PromptContentView getContentView() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getNegativeButtonText() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isConfirmationRequired() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public int getAllowedAuthenticators() {
        throw new RuntimeException("Stub!");
    }
    
    public void authenticate(@NonNull final CryptoObject crypto, @NonNull final CancellationSignal cancel, @NonNull final Executor executor, @NonNull final AuthenticationCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void authenticate(@NonNull final CancellationSignal cancel, @NonNull final Executor executor, @NonNull final AuthenticationCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class AuthenticationCallback
    {
        public AuthenticationCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onAuthenticationError(final int errorCode, final CharSequence errString) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAuthenticationHelp(final int helpCode, final CharSequence helpString) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAuthenticationSucceeded(final AuthenticationResult result) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAuthenticationFailed() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class AuthenticationResult
    {
        AuthenticationResult() {
            throw new RuntimeException("Stub!");
        }
        
        public CryptoObject getCryptoObject() {
            throw new RuntimeException("Stub!");
        }
        
        public int getAuthenticationType() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class Builder
    {
        public Builder(final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLogoRes(final int logoRes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLogoBitmap(@NonNull final Bitmap logoBitmap) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLogoDescription(@NonNull final String logoDescription) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTitle(@NonNull final CharSequence title) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSubtitle(@NonNull final CharSequence subtitle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDescription(@NonNull final CharSequence description) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setContentView(@NonNull final PromptContentView view) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNegativeButton(@NonNull final CharSequence text, @NonNull final Executor executor, @NonNull final DialogInterface.OnClickListener listener) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setConfirmationRequired(final boolean requireConfirmation) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setDeviceCredentialAllowed(final boolean allowed) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAllowedAuthenticators(final int authenticators) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public BiometricPrompt build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class CryptoObject
    {
        public CryptoObject(@NonNull final Signature signature) {
            throw new RuntimeException("Stub!");
        }
        
        public CryptoObject(@NonNull final Cipher cipher) {
            throw new RuntimeException("Stub!");
        }
        
        public CryptoObject(@NonNull final Mac mac) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public CryptoObject(@NonNull final IdentityCredential credential) {
            throw new RuntimeException("Stub!");
        }
        
        public CryptoObject(@NonNull final PresentationSession session) {
            throw new RuntimeException("Stub!");
        }
        
        public CryptoObject(final long operationHandle) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Signature getSignature() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Cipher getCipher() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Mac getMac() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Nullable
        public IdentityCredential getIdentityCredential() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public PresentationSession getPresentationSession() {
            throw new RuntimeException("Stub!");
        }
        
        public long getOperationHandle() {
            throw new RuntimeException("Stub!");
        }
    }
}
