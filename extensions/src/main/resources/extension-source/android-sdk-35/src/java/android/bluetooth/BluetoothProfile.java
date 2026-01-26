package android.bluetooth;

import java.util.List;

public interface BluetoothProfile
{
    public static final int A2DP = 2;
    public static final int CSIP_SET_COORDINATOR = 25;
    public static final String EXTRA_PREVIOUS_STATE = "android.bluetooth.profile.extra.PREVIOUS_STATE";
    public static final String EXTRA_STATE = "android.bluetooth.profile.extra.STATE";
    public static final int GATT = 7;
    public static final int GATT_SERVER = 8;
    public static final int HAP_CLIENT = 28;
    public static final int HEADSET = 1;
    @Deprecated
    public static final int HEALTH = 3;
    public static final int HEARING_AID = 21;
    public static final int HID_DEVICE = 19;
    public static final int LE_AUDIO = 22;
    public static final int SAP = 10;
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_DISCONNECTING = 3;
    
    List<BluetoothDevice> getConnectedDevices();
    
    List<BluetoothDevice> getDevicesMatchingConnectionStates(final int[] p0);
    
    int getConnectionState(final BluetoothDevice p0);
    
    public interface ServiceListener
    {
        void onServiceConnected(final int p0, final BluetoothProfile p1);
        
        void onServiceDisconnected(final int p0);
    }
}
