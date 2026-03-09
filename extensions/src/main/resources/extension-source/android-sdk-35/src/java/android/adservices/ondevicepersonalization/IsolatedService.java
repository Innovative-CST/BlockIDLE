package android.adservices.ondevicepersonalization;

import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class IsolatedService extends Service
{
    public IsolatedService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onCreate() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public IBinder onBind(@NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract IsolatedWorker onRequest(@NonNull final RequestToken p0);
    
    @NonNull
    public final KeyValueStore getRemoteData(@NonNull final RequestToken requestToken) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final MutableKeyValueStore getLocalData(@NonNull final RequestToken requestToken) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final LogReader getLogReader(@NonNull final RequestToken requestToken) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final EventUrlProvider getEventUrlProvider(@NonNull final RequestToken requestToken) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final UserData getUserData(@NonNull final RequestToken requestToken) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final FederatedComputeScheduler getFederatedComputeScheduler(@NonNull final RequestToken requestToken) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final ModelManager getModelManager(@NonNull final RequestToken requestToken) {
        throw new RuntimeException("Stub!");
    }
}
