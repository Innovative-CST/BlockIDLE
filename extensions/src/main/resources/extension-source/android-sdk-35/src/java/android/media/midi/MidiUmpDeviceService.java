package android.media.midi;

import android.os.IBinder;
import android.content.Intent;
import java.util.List;
import android.app.Service;

public abstract class MidiUmpDeviceService extends Service
{
    public static final String SERVICE_INTERFACE = "android.media.midi.MidiUmpDeviceService";
    
    public MidiUmpDeviceService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onCreate() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract List<MidiReceiver> onGetInputPortReceivers();
    
    @NonNull
    public final List<MidiReceiver> getOutputPortReceivers() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final MidiDeviceInfo getDeviceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public void onDeviceStatusChanged(@NonNull final MidiDeviceStatus status) {
        throw new RuntimeException("Stub!");
    }
    
    public void onClose() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public IBinder onBind(@NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
