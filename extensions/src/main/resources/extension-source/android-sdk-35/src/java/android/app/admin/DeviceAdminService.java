package android.app.admin;

import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public class DeviceAdminService extends Service
{
    public DeviceAdminService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
