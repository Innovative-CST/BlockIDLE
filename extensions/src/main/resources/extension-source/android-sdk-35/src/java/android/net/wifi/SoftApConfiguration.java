package android.net.wifi;

import android.net.MacAddress;
import android.os.Parcel;
import android.os.Parcelable;

public final class SoftApConfiguration implements Parcelable
{
    @NonNull
    public static final Creator<SoftApConfiguration> CREATOR;
    public static final int SECURITY_TYPE_OPEN = 0;
    public static final int SECURITY_TYPE_WPA2_PSK = 1;
    public static final int SECURITY_TYPE_WPA3_OWE = 5;
    public static final int SECURITY_TYPE_WPA3_OWE_TRANSITION = 4;
    public static final int SECURITY_TYPE_WPA3_SAE = 3;
    public static final int SECURITY_TYPE_WPA3_SAE_TRANSITION = 2;
    
    SoftApConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object otherObj) {
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
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public String getSsid() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public WifiSsid getWifiSsid() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MacAddress getBssid() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPassphrase() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isHiddenSsid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSecurityType() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
