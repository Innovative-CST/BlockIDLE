package android.bluetooth;

import java.util.List;

public final class BluetoothHearingAid implements BluetoothProfile
{
    public static final String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.hearingaid.profile.action.CONNECTION_STATE_CHANGED";
    
    BluetoothHearingAid() {
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
}
