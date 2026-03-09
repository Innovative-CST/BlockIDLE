package android.hardware.biometrics;

public class BiometricManager
{
    public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = 1;
    public static final int BIOMETRIC_ERROR_NONE_ENROLLED = 11;
    public static final int BIOMETRIC_ERROR_NO_HARDWARE = 12;
    public static final int BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final long BIOMETRIC_NO_AUTHENTICATION = -1L;
    public static final int BIOMETRIC_SUCCESS = 0;
    
    BiometricManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int canAuthenticate() {
        throw new RuntimeException("Stub!");
    }
    
    public int canAuthenticate(final int authenticators) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Strings getStrings(final int authenticators) {
        throw new RuntimeException("Stub!");
    }
    
    public long getLastAuthenticationTime(final int authenticators) {
        throw new RuntimeException("Stub!");
    }
    
    public static class Strings
    {
        Strings() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public CharSequence getButtonLabel() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public CharSequence getPromptMessage() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public CharSequence getSettingName() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface Authenticators
    {
        public static final int BIOMETRIC_STRONG = 15;
        public static final int BIOMETRIC_WEAK = 255;
        public static final int DEVICE_CREDENTIAL = 32768;
    }
}
