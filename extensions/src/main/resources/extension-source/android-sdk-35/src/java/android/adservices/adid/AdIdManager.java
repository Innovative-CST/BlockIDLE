package android.adservices.adid;

import android.adservices.common.AdServicesOutcomeReceiver;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import android.content.Context;

public class AdIdManager
{
    AdIdManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static AdIdManager get(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public void getAdId(@NonNull final Executor executor, @NonNull final OutcomeReceiver<AdId, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public void getAdId(@NonNull final Executor executor, @NonNull final AdServicesOutcomeReceiver<AdId, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
}
