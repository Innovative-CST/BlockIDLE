package android.app;

import android.os.IBinder;
import android.content.Intent;

@Deprecated
public abstract class IntentService extends Service
{
    @Deprecated
    public IntentService(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setIntentRedelivery(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onCreate() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onStart(@Nullable final Intent intent, final int startId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int onStartCommand(@RecentlyNullable final Intent intent, final int flags, final int startId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected abstract void onHandleIntent(@Nullable final Intent p0);
}
