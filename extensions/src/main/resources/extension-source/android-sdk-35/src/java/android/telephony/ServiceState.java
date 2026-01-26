package android.telephony;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

public class ServiceState implements Parcelable
{
    @NonNull
    public static final Creator<ServiceState> CREATOR;
    public static final int DUPLEX_MODE_FDD = 1;
    public static final int DUPLEX_MODE_TDD = 2;
    public static final int DUPLEX_MODE_UNKNOWN = 0;
    public static final int STATE_EMERGENCY_ONLY = 2;
    public static final int STATE_IN_SERVICE = 0;
    public static final int STATE_OUT_OF_SERVICE = 1;
    public static final int STATE_POWER_OFF = 3;
    public static final int UNKNOWN_ID = -1;
    
    public ServiceState() {
        throw new RuntimeException("Stub!");
    }
    
    public ServiceState(final ServiceState s) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ServiceState(final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    protected void copyFrom(final ServiceState s) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    public int getState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDuplexMode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getChannelNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public int[] getCellBandwidths() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getRoaming() {
        throw new RuntimeException("Stub!");
    }
    
    public String getOperatorAlphaLong() {
        throw new RuntimeException("Stub!");
    }
    
    public String getOperatorAlphaShort() {
        throw new RuntimeException("Stub!");
    }
    
    public String getOperatorNumeric() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getIsManualSelection() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStateOutOfService() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStateOff() {
        throw new RuntimeException("Stub!");
    }
    
    public void setState(final int state) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRoaming(final boolean roaming) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOperatorName(final String longName, final String shortName, final String numeric) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIsManualSelection(final boolean isManual) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCdmaNetworkId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCdmaSystemId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<NetworkRegistrationInfo> getNetworkRegistrationInfoList() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSearching() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUsingNonTerrestrialNetwork() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
