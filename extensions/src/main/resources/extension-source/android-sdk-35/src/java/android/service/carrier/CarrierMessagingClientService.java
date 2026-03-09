package android.service.carrier;

import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public class CarrierMessagingClientService extends Service
{
    public CarrierMessagingClientService() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public final IBinder onBind(@Nullable final Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
