package android.adservices.customaudience;

import android.adservices.common.AdServicesOutcomeReceiver;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import android.content.Context;

public class CustomAudienceManager
{
    CustomAudienceManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static CustomAudienceManager get(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public TestCustomAudienceManager getTestCustomAudienceManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void joinCustomAudience(@NonNull final JoinCustomAudienceRequest joinCustomAudienceRequest, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void fetchAndJoinCustomAudience(@NonNull final FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void leaveCustomAudience(@NonNull final LeaveCustomAudienceRequest leaveCustomAudienceRequest, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void scheduleCustomAudienceUpdate(@NonNull final ScheduleCustomAudienceUpdateRequest request, @NonNull final Executor executor, @NonNull final AdServicesOutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
}
