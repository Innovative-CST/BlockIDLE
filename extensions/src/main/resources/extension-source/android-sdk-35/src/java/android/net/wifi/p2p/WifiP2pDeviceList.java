package android.net.wifi.p2p;

import android.os.Parcel;
import java.util.Collection;
import android.os.Parcelable;

public class WifiP2pDeviceList implements Parcelable
{
    @NonNull
    public static final Creator<WifiP2pDeviceList> CREATOR;
    
    public WifiP2pDeviceList() {
        throw new RuntimeException("Stub!");
    }
    
    public WifiP2pDeviceList(final WifiP2pDeviceList source) {
        throw new RuntimeException("Stub!");
    }
    
    public WifiP2pDevice get(final String deviceAddress) {
        throw new RuntimeException("Stub!");
    }
    
    public Collection<WifiP2pDevice> getDeviceList() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
