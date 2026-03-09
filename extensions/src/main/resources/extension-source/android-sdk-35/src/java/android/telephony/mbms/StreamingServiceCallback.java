package android.telephony.mbms;

public class StreamingServiceCallback
{
    public static final int SIGNAL_STRENGTH_UNAVAILABLE = -1;
    
    public StreamingServiceCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public void onError(final int errorCode, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    public void onStreamStateUpdated(final int state, final int reason) {
        throw new RuntimeException("Stub!");
    }
    
    public void onMediaDescriptionUpdated() {
        throw new RuntimeException("Stub!");
    }
    
    public void onBroadcastSignalStrengthUpdated(final int signalStrength) {
        throw new RuntimeException("Stub!");
    }
    
    public void onStreamMethodUpdated(final int methodType) {
        throw new RuntimeException("Stub!");
    }
}
