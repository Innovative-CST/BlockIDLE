package android.bluetooth;

import java.util.Collection;
import java.util.List;

public final class BluetoothA2dp implements BluetoothProfile
{
    public static final String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED";
    public static final String ACTION_PLAYING_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED";
    public static final int STATE_NOT_PLAYING = 11;
    public static final int STATE_PLAYING = 10;
    
    BluetoothA2dp() {
        throw new RuntimeException("Stub!");
    }
    
    public void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public List<BluetoothDevice> getConnectedDevices() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public List<BluetoothDevice> getDevicesMatchingConnectionStates(final int[] states) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getConnectionState(final BluetoothDevice device) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isA2dpPlaying(final BluetoothDevice device) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Collection<BluetoothCodecType> getSupportedCodecTypes() {
        throw new RuntimeException("Stub!");
    }
}
