package android.service.carrier;

import android.os.IBinder;
import android.content.Intent;
import android.os.PersistableBundle;
import android.app.Service;

public abstract class CarrierService extends Service
{
    public static final String CARRIER_SERVICE_INTERFACE = "android.service.carrier.CarrierService";
    
    public CarrierService() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract PersistableBundle onLoadConfig(final CarrierIdentifier p0);
    
    @Nullable
    public PersistableBundle onLoadConfig(final int subscriptionId, @Nullable final CarrierIdentifier id) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void notifyCarrierNetworkChange(final boolean active) {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifyCarrierNetworkChange(final int subscriptionId, final boolean active) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
