package android.telephony;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class NetworkRegistrationInfo implements Parcelable
{
    @NonNull
    public static final Creator<NetworkRegistrationInfo> CREATOR;
    public static final int DOMAIN_CS = 1;
    public static final int DOMAIN_CS_PS = 3;
    public static final int DOMAIN_PS = 2;
    public static final int DOMAIN_UNKNOWN = 0;
    public static final int NR_STATE_CONNECTED = 3;
    public static final int NR_STATE_NONE = 0;
    public static final int NR_STATE_NOT_RESTRICTED = 2;
    public static final int NR_STATE_RESTRICTED = 1;
    public static final int SERVICE_TYPE_DATA = 2;
    public static final int SERVICE_TYPE_EMERGENCY = 5;
    public static final int SERVICE_TYPE_MMS = 6;
    public static final int SERVICE_TYPE_SMS = 3;
    public static final int SERVICE_TYPE_UNKNOWN = 0;
    public static final int SERVICE_TYPE_VIDEO = 4;
    public static final int SERVICE_TYPE_VOICE = 1;
    
    NetworkRegistrationInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTransportType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDomain() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isRegistered() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNetworkRegistered() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isSearching() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNetworkSearching() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getRegisteredPlmn() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isRoaming() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNetworkRoaming() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Integer> getAvailableServices() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAccessNetworkTechnology() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRejectCause() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CellIdentity getCellIdentity() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNonTerrestrialNetwork() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
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
