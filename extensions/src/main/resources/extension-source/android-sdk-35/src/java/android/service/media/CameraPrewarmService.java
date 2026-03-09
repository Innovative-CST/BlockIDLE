package android.service.media;

import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class CameraPrewarmService extends Service
{
    public CameraPrewarmService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onUnbind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onPrewarm();
    
    public abstract void onCooldown(final boolean p0);
}
