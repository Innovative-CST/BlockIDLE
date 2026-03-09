package android.telephony.mbms;

import android.net.Uri;

public class StreamingService implements AutoCloseable
{
    public static final int BROADCAST_METHOD = 1;
    public static final int REASON_BY_USER_REQUEST = 1;
    public static final int REASON_END_OF_SESSION = 2;
    public static final int REASON_FREQUENCY_CONFLICT = 3;
    public static final int REASON_LEFT_MBMS_BROADCAST_AREA = 6;
    public static final int REASON_NONE = 0;
    public static final int REASON_NOT_CONNECTED_TO_HOMECARRIER_LTE = 5;
    public static final int REASON_OUT_OF_MEMORY = 4;
    public static final int STATE_STALLED = 3;
    public static final int STATE_STARTED = 2;
    public static final int STATE_STOPPED = 1;
    public static final int UNICAST_METHOD = 2;
    
    StreamingService() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getPlaybackUri() {
        throw new RuntimeException("Stub!");
    }
    
    public StreamingServiceInfo getInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
}
