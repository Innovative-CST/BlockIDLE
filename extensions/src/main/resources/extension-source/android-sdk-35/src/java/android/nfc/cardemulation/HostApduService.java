package android.nfc.cardemulation;

import android.os.Bundle;
import java.util.List;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class HostApduService extends Service
{
    public static final int DEACTIVATION_DESELECTED = 1;
    public static final int DEACTIVATION_LINK_LOSS = 0;
    public static final String SERVICE_INTERFACE = "android.nfc.cardemulation.action.HOST_APDU_SERVICE";
    public static final String SERVICE_META_DATA = "android.nfc.cardemulation.host_apdu_service";
    
    public HostApduService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public final void sendResponseApdu(final byte[] responseApdu) {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifyUnhandled() {
        throw new RuntimeException("Stub!");
    }
    
    public void processPollingFrames(@NonNull final List<PollingFrame> frame) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract byte[] processCommandApdu(final byte[] p0, final Bundle p1);
    
    public abstract void onDeactivated(final int p0);
}
