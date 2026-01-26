package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public final class TelephonyDisplayInfo implements Parcelable
{
    @NonNull
    public static final Creator<TelephonyDisplayInfo> CREATOR;
    public static final int OVERRIDE_NETWORK_TYPE_LTE_ADVANCED_PRO = 2;
    public static final int OVERRIDE_NETWORK_TYPE_LTE_CA = 1;
    public static final int OVERRIDE_NETWORK_TYPE_NONE = 0;
    public static final int OVERRIDE_NETWORK_TYPE_NR_ADVANCED = 5;
    public static final int OVERRIDE_NETWORK_TYPE_NR_NSA = 3;
    @Deprecated
    public static final int OVERRIDE_NETWORK_TYPE_NR_NSA_MMWAVE = 4;
    
    TelephonyDisplayInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNetworkType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOverrideNetworkType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRoaming() {
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
    
    @Override
    public boolean equals(final Object o) {
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
    
    static {
        CREATOR = null;
    }
}
