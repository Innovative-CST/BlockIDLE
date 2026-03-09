package android.adservices.ondevicepersonalization;

public class OnDevicePersonalizationException extends Exception
{
    public static final int ERROR_ISOLATED_SERVICE_FAILED = 1;
    public static final int ERROR_PERSONALIZATION_DISABLED = 2;
    
    OnDevicePersonalizationException() {
        throw new RuntimeException("Stub!");
    }
    
    public int getErrorCode() {
        throw new RuntimeException("Stub!");
    }
}
