package android.net.wifi;

public abstract class EasyConnectStatusCallback
{
    public static final int EASY_CONNECT_EVENT_FAILURE_AUTHENTICATION = -2;
    public static final int EASY_CONNECT_EVENT_FAILURE_BUSY = -5;
    public static final int EASY_CONNECT_EVENT_FAILURE_CANNOT_FIND_NETWORK = -10;
    public static final int EASY_CONNECT_EVENT_FAILURE_CONFIGURATION = -4;
    public static final int EASY_CONNECT_EVENT_FAILURE_ENROLLEE_AUTHENTICATION = -11;
    public static final int EASY_CONNECT_EVENT_FAILURE_ENROLLEE_FAILED_TO_SCAN_NETWORK_CHANNEL = -14;
    public static final int EASY_CONNECT_EVENT_FAILURE_ENROLLEE_REJECTED_CONFIGURATION = -12;
    public static final int EASY_CONNECT_EVENT_FAILURE_GENERIC = -7;
    public static final int EASY_CONNECT_EVENT_FAILURE_INVALID_NETWORK = -9;
    public static final int EASY_CONNECT_EVENT_FAILURE_INVALID_URI = -1;
    public static final int EASY_CONNECT_EVENT_FAILURE_NOT_COMPATIBLE = -3;
    public static final int EASY_CONNECT_EVENT_FAILURE_NOT_SUPPORTED = -8;
    public static final int EASY_CONNECT_EVENT_FAILURE_TIMEOUT = -6;
    public static final int EASY_CONNECT_EVENT_FAILURE_URI_GENERATION = -13;
    
    EasyConnectStatusCallback() {
        throw new RuntimeException("Stub!");
    }
}
