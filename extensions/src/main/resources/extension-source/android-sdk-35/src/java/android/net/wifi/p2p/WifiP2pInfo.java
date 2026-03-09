package android.net.wifi.p2p;

import android.os.Parcel;
import java.net.InetAddress;
import android.os.Parcelable;

public class WifiP2pInfo implements Parcelable
{
    @NonNull
    public static final Creator<WifiP2pInfo> CREATOR;
    public boolean groupFormed;
    public InetAddress groupOwnerAddress;
    public boolean isGroupOwner;
    
    public WifiP2pInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public WifiP2pInfo(final WifiP2pInfo source) {
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
