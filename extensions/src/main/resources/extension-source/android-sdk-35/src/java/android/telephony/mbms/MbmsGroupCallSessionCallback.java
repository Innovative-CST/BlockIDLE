package android.telephony.mbms;

import java.util.List;

public interface MbmsGroupCallSessionCallback
{
    default void onError(final int errorCode, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    default void onAvailableSaisUpdated(@NonNull final List<Integer> currentSais, @NonNull final List<List<Integer>> availableSais) {
        throw new RuntimeException("Stub!");
    }
    
    default void onServiceInterfaceAvailable(@NonNull final String interfaceName, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    default void onMiddlewareReady() {
        throw new RuntimeException("Stub!");
    }
}
