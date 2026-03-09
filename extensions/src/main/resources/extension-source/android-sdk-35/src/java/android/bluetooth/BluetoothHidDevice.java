package android.bluetooth;

import java.util.concurrent.Executor;
import java.util.List;

public final class BluetoothHidDevice implements BluetoothProfile
{
    public static final String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.hiddevice.profile.action.CONNECTION_STATE_CHANGED";
    public static final byte ERROR_RSP_INVALID_PARAM = 4;
    public static final byte ERROR_RSP_INVALID_RPT_ID = 2;
    public static final byte ERROR_RSP_NOT_READY = 1;
    public static final byte ERROR_RSP_SUCCESS = 0;
    public static final byte ERROR_RSP_UNKNOWN = 14;
    public static final byte ERROR_RSP_UNSUPPORTED_REQ = 3;
    public static final byte PROTOCOL_BOOT_MODE = 0;
    public static final byte PROTOCOL_REPORT_MODE = 1;
    public static final byte REPORT_TYPE_FEATURE = 3;
    public static final byte REPORT_TYPE_INPUT = 1;
    public static final byte REPORT_TYPE_OUTPUT = 2;
    public static final byte SUBCLASS1_COMBO = -64;
    public static final byte SUBCLASS1_KEYBOARD = 64;
    public static final byte SUBCLASS1_MOUSE = Byte.MIN_VALUE;
    public static final byte SUBCLASS1_NONE = 0;
    public static final byte SUBCLASS2_CARD_READER = 6;
    public static final byte SUBCLASS2_DIGITIZER_TABLET = 5;
    public static final byte SUBCLASS2_GAMEPAD = 2;
    public static final byte SUBCLASS2_JOYSTICK = 1;
    public static final byte SUBCLASS2_REMOTE_CONTROL = 3;
    public static final byte SUBCLASS2_SENSING_DEVICE = 4;
    public static final byte SUBCLASS2_UNCATEGORIZED = 0;
    
    BluetoothHidDevice() {
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
    
    public boolean registerApp(final BluetoothHidDeviceAppSdpSettings sdp, final BluetoothHidDeviceAppQosSettings inQos, final BluetoothHidDeviceAppQosSettings outQos, final Executor executor, final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean unregisterApp() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean sendReport(final BluetoothDevice device, final int id, final byte[] data) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean replyReport(final BluetoothDevice device, final byte type, final byte id, final byte[] data) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean reportError(final BluetoothDevice device, final byte error) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean connect(final BluetoothDevice device) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean disconnect(final BluetoothDevice device) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class Callback
    {
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onAppStatusChanged(final BluetoothDevice pluggedDevice, final boolean registered) {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnectionStateChanged(final BluetoothDevice device, final int state) {
            throw new RuntimeException("Stub!");
        }
        
        public void onGetReport(final BluetoothDevice device, final byte type, final byte id, final int bufferSize) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSetReport(final BluetoothDevice device, final byte type, final byte id, final byte[] data) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSetProtocol(final BluetoothDevice device, final byte protocol) {
            throw new RuntimeException("Stub!");
        }
        
        public void onInterruptData(final BluetoothDevice device, final byte reportId, final byte[] data) {
            throw new RuntimeException("Stub!");
        }
        
        public void onVirtualCableUnplug(final BluetoothDevice device) {
            throw new RuntimeException("Stub!");
        }
    }
}
