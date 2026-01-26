package android.telephony;

import android.telecom.PhoneAccountHandle;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class VisualVoicemailService extends Service
{
    public static final String SERVICE_INTERFACE = "android.telephony.VisualVoicemailService";
    
    public VisualVoicemailService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onCellServiceConnected(final VisualVoicemailTask p0, final PhoneAccountHandle p1);
    
    public abstract void onSmsReceived(final VisualVoicemailTask p0, final VisualVoicemailSms p1);
    
    public abstract void onSimRemoved(final VisualVoicemailTask p0, final PhoneAccountHandle p1);
    
    public abstract void onStopped(final VisualVoicemailTask p0);
    
    public static class VisualVoicemailTask
    {
        VisualVoicemailTask() {
            throw new RuntimeException("Stub!");
        }
        
        public final void finish() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object obj) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
    }
}
