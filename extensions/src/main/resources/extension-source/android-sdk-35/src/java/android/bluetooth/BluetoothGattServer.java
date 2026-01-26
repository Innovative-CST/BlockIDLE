package android.bluetooth;

import java.util.UUID;
import java.util.List;

public final class BluetoothGattServer implements BluetoothProfile
{
    BluetoothGattServer() {
        throw new RuntimeException("Stub!");
    }
    
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean connect(final BluetoothDevice device, final boolean autoConnect) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancelConnection(final BluetoothDevice device) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPreferredPhy(final BluetoothDevice device, final int txPhy, final int rxPhy, final int phyOptions) {
        throw new RuntimeException("Stub!");
    }
    
    public void readPhy(final BluetoothDevice device) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean sendResponse(final BluetoothDevice device, final int requestId, final int status, final int offset, final byte[] value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean notifyCharacteristicChanged(final BluetoothDevice device, final BluetoothGattCharacteristic characteristic, final boolean confirm) {
        throw new RuntimeException("Stub!");
    }
    
    public int notifyCharacteristicChanged(@NonNull final BluetoothDevice device, @NonNull final BluetoothGattCharacteristic characteristic, final boolean confirm, @NonNull final byte[] value) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean addService(final BluetoothGattService service) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeService(final BluetoothGattService service) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearServices() {
        throw new RuntimeException("Stub!");
    }
    
    public List<BluetoothGattService> getServices() {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothGattService getService(final UUID uuid) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getConnectionState(final BluetoothDevice device) {
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
}
