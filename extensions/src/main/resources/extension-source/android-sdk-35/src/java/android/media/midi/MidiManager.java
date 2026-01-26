package android.media.midi;

import android.bluetooth.BluetoothDevice;
import java.util.Set;
import java.util.concurrent.Executor;
import android.os.Handler;

public final class MidiManager
{
    public static final int TRANSPORT_MIDI_BYTE_STREAM = 1;
    public static final int TRANSPORT_UNIVERSAL_MIDI_PACKETS = 2;
    
    MidiManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void registerDeviceCallback(final DeviceCallback callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerDeviceCallback(final int transport, @NonNull final Executor executor, @NonNull final DeviceCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterDeviceCallback(final DeviceCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public MidiDeviceInfo[] getDevices() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<MidiDeviceInfo> getDevicesForTransport(final int transport) {
        throw new RuntimeException("Stub!");
    }
    
    public void openDevice(final MidiDeviceInfo deviceInfo, final OnDeviceOpenedListener listener, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void openBluetoothDevice(final BluetoothDevice bluetoothDevice, final OnDeviceOpenedListener listener, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public static class DeviceCallback
    {
        public DeviceCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onDeviceAdded(final MidiDeviceInfo device) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDeviceRemoved(final MidiDeviceInfo device) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDeviceStatusChanged(final MidiDeviceStatus status) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnDeviceOpenedListener
    {
        void onDeviceOpened(final MidiDevice p0);
    }
}
