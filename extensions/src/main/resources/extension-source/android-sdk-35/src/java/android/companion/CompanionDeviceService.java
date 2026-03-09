package android.companion;

import android.os.IBinder;
import android.content.Intent;
import java.io.OutputStream;
import java.io.InputStream;
import android.app.Service;

public abstract class CompanionDeviceService extends Service
{
    public static final String SERVICE_INTERFACE = "android.companion.CompanionDeviceService";
    
    public CompanionDeviceService() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onDeviceAppeared(@NonNull final String address) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onDeviceDisappeared(@NonNull final String address) {
        throw new RuntimeException("Stub!");
    }
    
    public final void attachSystemDataTransport(final int associationId, @NonNull final InputStream in, @NonNull final OutputStream out) throws DeviceNotAssociatedException {
        throw new RuntimeException("Stub!");
    }
    
    public final void detachSystemDataTransport(final int associationId) throws DeviceNotAssociatedException {
        throw new RuntimeException("Stub!");
    }
    
    public void onDeviceAppeared(@NonNull final AssociationInfo associationInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public void onDeviceDisappeared(@NonNull final AssociationInfo associationInfo) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public final IBinder onBind(@NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
