package android.bluetooth;

import java.util.UUID;
import java.util.List;

public final class BluetoothGatt implements BluetoothProfile
{
    public static final int CONNECTION_PRIORITY_BALANCED = 0;
    public static final int CONNECTION_PRIORITY_DCK = 3;
    public static final int CONNECTION_PRIORITY_HIGH = 1;
    public static final int CONNECTION_PRIORITY_LOW_POWER = 2;
    public static final int GATT_CONNECTION_CONGESTED = 143;
    public static final int GATT_CONNECTION_TIMEOUT = 147;
    public static final int GATT_FAILURE = 257;
    public static final int GATT_INSUFFICIENT_AUTHENTICATION = 5;
    public static final int GATT_INSUFFICIENT_AUTHORIZATION = 8;
    public static final int GATT_INSUFFICIENT_ENCRYPTION = 15;
    public static final int GATT_INVALID_ATTRIBUTE_LENGTH = 13;
    public static final int GATT_INVALID_OFFSET = 7;
    public static final int GATT_READ_NOT_PERMITTED = 2;
    public static final int GATT_REQUEST_NOT_SUPPORTED = 6;
    public static final int GATT_SUCCESS = 0;
    public static final int GATT_WRITE_NOT_PERMITTED = 3;
    
    BluetoothGatt() {
        throw new RuntimeException("Stub!");
    }
    
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public void disconnect() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean connect() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPreferredPhy(final int txPhy, final int rxPhy, final int phyOptions) {
        throw new RuntimeException("Stub!");
    }
    
    public void readPhy() {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothDevice getDevice() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean discoverServices() {
        throw new RuntimeException("Stub!");
    }
    
    public List<BluetoothGattService> getServices() {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothGattService getService(final UUID uuid) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean readCharacteristic(final BluetoothGattCharacteristic characteristic) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean writeCharacteristic(final BluetoothGattCharacteristic characteristic) {
        throw new RuntimeException("Stub!");
    }
    
    public int writeCharacteristic(@NonNull final BluetoothGattCharacteristic characteristic, @NonNull final byte[] value, final int writeType) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean readDescriptor(final BluetoothGattDescriptor descriptor) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean writeDescriptor(final BluetoothGattDescriptor descriptor) {
        throw new RuntimeException("Stub!");
    }
    
    public int writeDescriptor(@NonNull final BluetoothGattDescriptor descriptor, @NonNull final byte[] value) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean beginReliableWrite() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean executeReliableWrite() {
        throw new RuntimeException("Stub!");
    }
    
    public void abortReliableWrite() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void abortReliableWrite(final BluetoothDevice mDevice) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setCharacteristicNotification(final BluetoothGattCharacteristic characteristic, final boolean enable) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean readRemoteRssi() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean requestMtu(final int mtu) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean requestConnectionPriority(final int connectionPriority) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int getConnectionState(final BluetoothDevice device) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public List<BluetoothDevice> getConnectedDevices() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public List<BluetoothDevice> getDevicesMatchingConnectionStates(final int[] states) {
        throw new RuntimeException("Stub!");
    }
}
