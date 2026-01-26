package android.net.sip;

@Deprecated
public class SipErrorCode
{
    @Deprecated
    public static final int CLIENT_ERROR = -4;
    @Deprecated
    public static final int CROSS_DOMAIN_AUTHENTICATION = -11;
    @Deprecated
    public static final int DATA_CONNECTION_LOST = -10;
    @Deprecated
    public static final int INVALID_CREDENTIALS = -8;
    @Deprecated
    public static final int INVALID_REMOTE_URI = -6;
    @Deprecated
    public static final int IN_PROGRESS = -9;
    @Deprecated
    public static final int NO_ERROR = 0;
    @Deprecated
    public static final int PEER_NOT_REACHABLE = -7;
    @Deprecated
    public static final int SERVER_ERROR = -2;
    @Deprecated
    public static final int SERVER_UNREACHABLE = -12;
    @Deprecated
    public static final int SOCKET_ERROR = -1;
    @Deprecated
    public static final int TIME_OUT = -5;
    @Deprecated
    public static final int TRANSACTION_TERMINTED = -3;
    
    SipErrorCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static String toString(final int errorCode) {
        throw new RuntimeException("Stub!");
    }
}
