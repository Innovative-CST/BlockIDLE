package android.telephony.mbms;

import java.util.List;

public class MbmsStreamingSessionCallback
{
    public MbmsStreamingSessionCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public void onError(final int errorCode, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    public void onStreamingServicesUpdated(final List<StreamingServiceInfo> services) {
        throw new RuntimeException("Stub!");
    }
    
    public void onMiddlewareReady() {
        throw new RuntimeException("Stub!");
    }
}
