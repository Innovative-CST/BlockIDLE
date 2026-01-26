package android.telephony.ims;

public abstract class ImsStateCallback
{
    public static final int REASON_IMS_SERVICE_DISCONNECTED = 3;
    public static final int REASON_IMS_SERVICE_NOT_READY = 6;
    public static final int REASON_NO_IMS_SERVICE_CONFIGURED = 4;
    public static final int REASON_SUBSCRIPTION_INACTIVE = 5;
    public static final int REASON_UNKNOWN_PERMANENT_ERROR = 2;
    public static final int REASON_UNKNOWN_TEMPORARY_ERROR = 1;
    
    public ImsStateCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onUnavailable(final int p0);
    
    public abstract void onAvailable();
    
    public abstract void onError();
}
