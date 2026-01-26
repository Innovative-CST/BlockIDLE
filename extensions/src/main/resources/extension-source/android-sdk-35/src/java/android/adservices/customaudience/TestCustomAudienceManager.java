package android.adservices.customaudience;

import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

public class TestCustomAudienceManager
{
    TestCustomAudienceManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void overrideCustomAudienceRemoteInfo(@NonNull final AddCustomAudienceOverrideRequest request, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeCustomAudienceRemoteInfoOverride(@NonNull final RemoveCustomAudienceOverrideRequest request, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void resetAllCustomAudienceOverrides(@NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
}
