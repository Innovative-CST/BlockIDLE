package android.bluetooth;

import java.util.List;

public final class BluetoothLeAudio implements BluetoothProfile, AutoCloseable
{
    public static final String ACTION_LE_AUDIO_CONNECTION_STATE_CHANGED = "android.bluetooth.action.LE_AUDIO_CONNECTION_STATE_CHANGED";
    public static final int GROUP_ID_INVALID = -1;
    
    BluetoothLeAudio() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BluetoothDevice getConnectedGroupLeadDevice(final int groupId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public List<BluetoothDevice> getConnectedDevices() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public List<BluetoothDevice> getDevicesMatchingConnectionStates(@NonNull final int[] states) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getConnectionState(@NonNull final BluetoothDevice device) {
        throw new RuntimeException("Stub!");
    }
    
    public int getGroupId(@NonNull final BluetoothDevice device) {
        throw new RuntimeException("Stub!");
    }
}
