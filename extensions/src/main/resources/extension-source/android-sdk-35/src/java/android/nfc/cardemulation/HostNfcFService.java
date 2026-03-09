package android.nfc.cardemulation;

import android.os.Bundle;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class HostNfcFService extends Service
{
    public static final int DEACTIVATION_LINK_LOSS = 0;
    public static final String SERVICE_INTERFACE = "android.nfc.cardemulation.action.HOST_NFCF_SERVICE";
    public static final String SERVICE_META_DATA = "android.nfc.cardemulation.host_nfcf_service";
    
    public HostNfcFService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public final void sendResponsePacket(final byte[] responsePacket) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract byte[] processNfcFPacket(final byte[] p0, final Bundle p1);
    
    public abstract void onDeactivated(final int p0);
}
