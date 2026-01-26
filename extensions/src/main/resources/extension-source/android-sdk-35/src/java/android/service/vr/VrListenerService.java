package android.service.vr;

import android.content.Context;
import android.content.ComponentName;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class VrListenerService extends Service
{
    public static final String SERVICE_INTERFACE = "android.service.vr.VrListenerService";
    
    public VrListenerService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onCurrentVrActivityChanged(final ComponentName component) {
        throw new RuntimeException("Stub!");
    }
    
    public static final boolean isVrModePackageEnabled(@NonNull final Context context, @NonNull final ComponentName requestedComponent) {
        throw new RuntimeException("Stub!");
    }
}
