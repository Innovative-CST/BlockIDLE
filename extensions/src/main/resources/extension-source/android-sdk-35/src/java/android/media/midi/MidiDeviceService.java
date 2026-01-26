package android.media.midi;

import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class MidiDeviceService extends Service
{
    public static final String SERVICE_INTERFACE = "android.media.midi.MidiDeviceService";
    
    public MidiDeviceService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onCreate() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract MidiReceiver[] onGetInputPortReceivers();
    
    public final MidiReceiver[] getOutputPortReceivers() {
        throw new RuntimeException("Stub!");
    }
    
    public final MidiDeviceInfo getDeviceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public void onDeviceStatusChanged(final MidiDeviceStatus status) {
        throw new RuntimeException("Stub!");
    }
    
    public void onClose() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
