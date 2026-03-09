package android.bluetooth;

import android.content.Context;
import java.io.IOException;
import java.util.UUID;
import java.util.Set;
import java.time.Duration;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.BluetoothLeAdvertiser;

public final class BluetoothAdapter
{
    public static final String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED";
    public static final String ACTION_DISCOVERY_FINISHED = "android.bluetooth.adapter.action.DISCOVERY_FINISHED";
    public static final String ACTION_DISCOVERY_STARTED = "android.bluetooth.adapter.action.DISCOVERY_STARTED";
    public static final String ACTION_LOCAL_NAME_CHANGED = "android.bluetooth.adapter.action.LOCAL_NAME_CHANGED";
    public static final String ACTION_REQUEST_DISCOVERABLE = "android.bluetooth.adapter.action.REQUEST_DISCOVERABLE";
    public static final String ACTION_REQUEST_ENABLE = "android.bluetooth.adapter.action.REQUEST_ENABLE";
    public static final String ACTION_SCAN_MODE_CHANGED = "android.bluetooth.adapter.action.SCAN_MODE_CHANGED";
    public static final String ACTION_STATE_CHANGED = "android.bluetooth.adapter.action.STATE_CHANGED";
    public static final int ERROR = Integer.MIN_VALUE;
    public static final String EXTRA_CONNECTION_STATE = "android.bluetooth.adapter.extra.CONNECTION_STATE";
    public static final String EXTRA_DISCOVERABLE_DURATION = "android.bluetooth.adapter.extra.DISCOVERABLE_DURATION";
    public static final String EXTRA_LOCAL_NAME = "android.bluetooth.adapter.extra.LOCAL_NAME";
    public static final String EXTRA_PREVIOUS_CONNECTION_STATE = "android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE";
    public static final String EXTRA_PREVIOUS_SCAN_MODE = "android.bluetooth.adapter.extra.PREVIOUS_SCAN_MODE";
    public static final String EXTRA_PREVIOUS_STATE = "android.bluetooth.adapter.extra.PREVIOUS_STATE";
    public static final String EXTRA_SCAN_MODE = "android.bluetooth.adapter.extra.SCAN_MODE";
    public static final String EXTRA_STATE = "android.bluetooth.adapter.extra.STATE";
    public static final int SCAN_MODE_CONNECTABLE = 21;
    public static final int SCAN_MODE_CONNECTABLE_DISCOVERABLE = 23;
    public static final int SCAN_MODE_NONE = 20;
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_DISCONNECTING = 3;
    public static final int STATE_OFF = 10;
    public static final int STATE_ON = 12;
    public static final int STATE_TURNING_OFF = 13;
    public static final int STATE_TURNING_ON = 11;
    
    BluetoothAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static synchronized BluetoothAdapter getDefaultAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothDevice getRemoteDevice(final String address) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public BluetoothDevice getRemoteLeDevice(@NonNull final String address, final int addressType) {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothDevice getRemoteDevice(final byte[] address) {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothLeAdvertiser getBluetoothLeAdvertiser() {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothLeScanner getBluetoothLeScanner() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public int getState() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean enable() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean disable() {
        throw new RuntimeException("Stub!");
    }
    
    public String getAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setName(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public int getScanMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Duration getDiscoverableTimeout() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean startDiscovery() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean cancelDiscovery() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDiscovering() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMultipleAdvertisementSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOffloadedFilteringSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOffloadedScanBatchingSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLe2MPhySupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLeCodedPhySupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLeExtendedAdvertisingSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLePeriodicAdvertisingSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public int isLeAudioSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public int isLeAudioBroadcastSourceSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public int isLeAudioBroadcastAssistantSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLeMaximumAdvertisingDataLength() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxConnectedAudioDevices() {
        throw new RuntimeException("Stub!");
    }
    
    public Set<BluetoothDevice> getBondedDevices() {
        throw new RuntimeException("Stub!");
    }
    
    public int getProfileConnectionState(final int profile) {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothServerSocket listenUsingRfcommWithServiceRecord(final String name, final UUID uuid) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord(final String name, final UUID uuid) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getProfileProxy(final Context context, final BluetoothProfile.ServiceListener listener, final int profile) {
        throw new RuntimeException("Stub!");
    }
    
    public void closeProfileProxy(final int unusedProfile, final BluetoothProfile proxy) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean checkBluetoothAddress(final String address) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean startLeScan(final LeScanCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean startLeScan(final UUID[] serviceUuids, final LeScanCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void stopLeScan(final LeScanCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public BluetoothServerSocket listenUsingL2capChannel() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public BluetoothServerSocket listenUsingInsecureL2capChannel() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public interface LeScanCallback
    {
        void onLeScan(final BluetoothDevice p0, final int p1, final byte[] p2);
    }
}
