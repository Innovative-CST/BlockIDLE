package android.net.wifi.p2p;

import android.os.Parcel;
import java.util.Collection;
import android.os.Parcelable;

public class WifiP2pGroup implements Parcelable
{
    @NonNull
    public static final Creator<WifiP2pGroup> CREATOR;
    public static final int NETWORK_ID_PERSISTENT = -2;
    public static final int NETWORK_ID_TEMPORARY = -1;
    
    public WifiP2pGroup() {
        throw new RuntimeException("Stub!");
    }
    
    public WifiP2pGroup(final WifiP2pGroup source) {
        throw new RuntimeException("Stub!");
    }
    
    public String getNetworkName() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isGroupOwner() {
        throw new RuntimeException("Stub!");
    }
    
    public WifiP2pDevice getOwner() {
        throw new RuntimeException("Stub!");
    }
    
    public Collection<WifiP2pDevice> getClientList() {
        throw new RuntimeException("Stub!");
    }
    
    public String getPassphrase() {
        throw new RuntimeException("Stub!");
    }
    
    public String getInterface() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNetworkId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFrequency() {
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
