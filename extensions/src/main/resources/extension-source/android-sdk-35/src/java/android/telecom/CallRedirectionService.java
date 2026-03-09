package android.telecom;

import android.os.IBinder;
import android.content.Intent;
import android.net.Uri;
import android.app.Service;

public abstract class CallRedirectionService extends Service
{
    public static final String SERVICE_INTERFACE = "android.telecom.CallRedirectionService";
    
    public CallRedirectionService() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onPlaceCall(@NonNull final Uri p0, @NonNull final PhoneAccountHandle p1, final boolean p2);
    
    public void onRedirectionTimeout() {
        throw new RuntimeException("Stub!");
    }
    
    public final void placeCallUnmodified() {
        throw new RuntimeException("Stub!");
    }
    
    public final void redirectCall(@NonNull final Uri gatewayUri, @NonNull final PhoneAccountHandle targetPhoneAccount, final boolean confirmFirst) {
        throw new RuntimeException("Stub!");
    }
    
    public final void cancelCall() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public final IBinder onBind(@NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean onUnbind(@NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
