package android.telephony.ims;

public final class ImsException extends Exception
{
    public static final int CODE_ERROR_INVALID_SUBSCRIPTION = 3;
    public static final int CODE_ERROR_SERVICE_UNAVAILABLE = 1;
    public static final int CODE_ERROR_UNSPECIFIED = 0;
    public static final int CODE_ERROR_UNSUPPORTED_OPERATION = 2;
    
    ImsException() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCode() {
        throw new RuntimeException("Stub!");
    }
}
