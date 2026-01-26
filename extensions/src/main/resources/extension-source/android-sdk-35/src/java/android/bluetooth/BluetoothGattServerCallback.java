package android.bluetooth;

public abstract class BluetoothGattServerCallback
{
    public BluetoothGattServerCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public void onConnectionStateChange(final BluetoothDevice device, final int status, final int newState) {
        throw new RuntimeException("Stub!");
    }
    
    public void onServiceAdded(final int status, final BluetoothGattService service) {
        throw new RuntimeException("Stub!");
    }
    
    public void onCharacteristicReadRequest(final BluetoothDevice device, final int requestId, final int offset, final BluetoothGattCharacteristic characteristic) {
        throw new RuntimeException("Stub!");
    }
    
    public void onCharacteristicWriteRequest(final BluetoothDevice device, final int requestId, final BluetoothGattCharacteristic characteristic, final boolean preparedWrite, final boolean responseNeeded, final int offset, final byte[] value) {
        throw new RuntimeException("Stub!");
    }
    
    public void onDescriptorReadRequest(final BluetoothDevice device, final int requestId, final int offset, final BluetoothGattDescriptor descriptor) {
        throw new RuntimeException("Stub!");
    }
    
    public void onDescriptorWriteRequest(final BluetoothDevice device, final int requestId, final BluetoothGattDescriptor descriptor, final boolean preparedWrite, final boolean responseNeeded, final int offset, final byte[] value) {
        throw new RuntimeException("Stub!");
    }
    
    public void onExecuteWrite(final BluetoothDevice device, final int requestId, final boolean execute) {
        throw new RuntimeException("Stub!");
    }
    
    public void onNotificationSent(final BluetoothDevice device, final int status) {
        throw new RuntimeException("Stub!");
    }
    
    public void onMtuChanged(final BluetoothDevice device, final int mtu) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPhyUpdate(final BluetoothDevice device, final int txPhy, final int rxPhy, final int status) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPhyRead(final BluetoothDevice device, final int txPhy, final int rxPhy, final int status) {
        throw new RuntimeException("Stub!");
    }
}
