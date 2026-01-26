package android.bluetooth;

import android.content.Context;
import java.util.List;

public final class BluetoothManager
{
    BluetoothManager() {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothAdapter getAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConnectionState(final BluetoothDevice device, final int profile) {
        throw new RuntimeException("Stub!");
    }
    
    public List<BluetoothDevice> getConnectedDevices(final int profile) {
        throw new RuntimeException("Stub!");
    }
    
    public List<BluetoothDevice> getDevicesMatchingConnectionStates(final int profile, final int[] states) {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothGattServer openGattServer(final Context context, final BluetoothGattServerCallback callback) {
        throw new RuntimeException("Stub!");
    }
}
