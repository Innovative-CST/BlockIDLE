package android.app.admin;

import android.os.Parcel;
import android.net.wifi.WifiSsid;
import java.util.Set;
import android.os.Parcelable;

public final class WifiSsidPolicy implements Parcelable
{
    @NonNull
    public static final Creator<WifiSsidPolicy> CREATOR;
    public static final int WIFI_SSID_POLICY_TYPE_ALLOWLIST = 0;
    public static final int WIFI_SSID_POLICY_TYPE_DENYLIST = 1;
    
    public WifiSsidPolicy(final int policyType, @NonNull final Set<WifiSsid> ssids) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<WifiSsid> getSsids() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPolicyType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object thatObject) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
