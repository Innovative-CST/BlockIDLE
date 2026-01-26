package android.telephony.mbms;

public interface GroupCallCallback
{
    public static final int SIGNAL_STRENGTH_UNAVAILABLE = -1;
    
    default void onError(final int errorCode, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    default void onGroupCallStateChanged(final int state, final int reason) {
        throw new RuntimeException("Stub!");
    }
    
    default void onBroadcastSignalStrengthUpdated(final int signalStrength) {
        throw new RuntimeException("Stub!");
    }
}
