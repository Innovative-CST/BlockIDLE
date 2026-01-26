package android.bluetooth;

import android.os.ParcelFileDescriptor;

@Deprecated
public abstract class BluetoothHealthCallback
{
    @Deprecated
    public BluetoothHealthCallback() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onHealthAppConfigurationStatusChange(final BluetoothHealthAppConfiguration config, final int status) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onHealthChannelStateChange(final BluetoothHealthAppConfiguration config, final BluetoothDevice device, final int prevState, final int newState, final ParcelFileDescriptor fd, final int channelId) {
        throw new RuntimeException("Stub!");
    }
}
