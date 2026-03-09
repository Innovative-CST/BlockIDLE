package android.bluetooth;

import java.util.List;

public final class BluetoothCsipSetCoordinator implements BluetoothProfile, AutoCloseable
{
    public static final String ACTION_CSIS_CONNECTION_STATE_CHANGED = "android.bluetooth.action.CSIS_CONNECTION_STATE_CHANGED";
    
    BluetoothCsipSetCoordinator() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
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
    public int getConnectionState(@Nullable final BluetoothDevice device) {
        throw new RuntimeException("Stub!");
    }
}
