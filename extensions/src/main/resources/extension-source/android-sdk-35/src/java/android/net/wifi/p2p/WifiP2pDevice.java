package android.net.wifi.p2p;

import android.os.Parcel;
import java.net.InetAddress;
import android.net.wifi.ScanResult;
import java.util.List;
import android.os.Parcelable;

public class WifiP2pDevice implements Parcelable
{
    public static final int AVAILABLE = 3;
    public static final int CONNECTED = 0;
    @NonNull
    public static final Creator<WifiP2pDevice> CREATOR;
    public static final int FAILED = 2;
    public static final int INVITED = 1;
    public static final int UNAVAILABLE = 4;
    public String deviceAddress;
    public String deviceName;
    public String primaryDeviceType;
    public String secondaryDeviceType;
    public int status;
    
    public WifiP2pDevice() {
        this.deviceAddress = "";
        this.deviceName = "";
        this.status = 4;
        throw new RuntimeException("Stub!");
    }
    
    public WifiP2pDevice(final WifiP2pDevice source) {
        this.deviceAddress = "";
        this.deviceName = "";
        this.status = 4;
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public WifiP2pWfdInfo getWfdInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean wpsPbcSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean wpsKeypadSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean wpsDisplaySupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isServiceDiscoveryCapable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isGroupOwner() {
        throw new RuntimeException("Stub!");
    }
    
    public void update(@NonNull final WifiP2pDevice device) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ScanResult.InformationElement> getVendorElements() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InetAddress getIpAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
