package android.telecom;

import android.os.Parcel;
import java.util.Collection;
import android.bluetooth.BluetoothDevice;
import android.os.Parcelable;

public final class CallAudioState implements Parcelable
{
    @NonNull
    public static final Creator<CallAudioState> CREATOR;
    public static final int ROUTE_BLUETOOTH = 2;
    public static final int ROUTE_EARPIECE = 1;
    public static final int ROUTE_SPEAKER = 8;
    public static final int ROUTE_STREAMING = 16;
    public static final int ROUTE_WIRED_HEADSET = 4;
    public static final int ROUTE_WIRED_OR_EARPIECE = 5;
    
    public CallAudioState(final boolean muted, final int route, final int supportedRouteMask) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMuted() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRoute() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSupportedRouteMask() {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothDevice getActiveBluetoothDevice() {
        throw new RuntimeException("Stub!");
    }
    
    public Collection<BluetoothDevice> getSupportedBluetoothDevices() {
        throw new RuntimeException("Stub!");
    }
    
    public static String audioRouteToString(final int route) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel destination, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
