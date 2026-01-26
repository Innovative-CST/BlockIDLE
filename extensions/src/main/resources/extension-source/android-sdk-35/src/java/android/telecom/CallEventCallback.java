package android.telecom;

import android.os.Bundle;
import java.util.List;

public interface CallEventCallback
{
    void onCallEndpointChanged(@NonNull final CallEndpoint p0);
    
    void onAvailableCallEndpointsChanged(@NonNull final List<CallEndpoint> p0);
    
    void onMuteStateChanged(final boolean p0);
    
    default void onVideoStateChanged(final int videoState) {
        throw new RuntimeException("Stub!");
    }
    
    void onCallStreamingFailed(final int p0);
    
    void onEvent(@NonNull final String p0, @NonNull final Bundle p1);
}
