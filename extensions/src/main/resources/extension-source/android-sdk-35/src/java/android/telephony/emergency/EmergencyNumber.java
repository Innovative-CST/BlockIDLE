package android.telephony.emergency;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

public final class EmergencyNumber implements Parcelable, Comparable<EmergencyNumber>
{
    @NonNull
    public static final Creator<EmergencyNumber> CREATOR;
    public static final int EMERGENCY_CALL_ROUTING_EMERGENCY = 1;
    public static final int EMERGENCY_CALL_ROUTING_NORMAL = 2;
    public static final int EMERGENCY_CALL_ROUTING_UNKNOWN = 0;
    public static final int EMERGENCY_NUMBER_SOURCE_DATABASE = 16;
    public static final int EMERGENCY_NUMBER_SOURCE_DEFAULT = 8;
    public static final int EMERGENCY_NUMBER_SOURCE_MODEM_CONFIG = 4;
    public static final int EMERGENCY_NUMBER_SOURCE_NETWORK_SIGNALING = 1;
    public static final int EMERGENCY_NUMBER_SOURCE_SIM = 2;
    public static final int EMERGENCY_SERVICE_CATEGORY_AIEC = 64;
    public static final int EMERGENCY_SERVICE_CATEGORY_AMBULANCE = 2;
    public static final int EMERGENCY_SERVICE_CATEGORY_FIRE_BRIGADE = 4;
    public static final int EMERGENCY_SERVICE_CATEGORY_MARINE_GUARD = 8;
    public static final int EMERGENCY_SERVICE_CATEGORY_MIEC = 32;
    public static final int EMERGENCY_SERVICE_CATEGORY_MOUNTAIN_RESCUE = 16;
    public static final int EMERGENCY_SERVICE_CATEGORY_POLICE = 1;
    public static final int EMERGENCY_SERVICE_CATEGORY_UNSPECIFIED = 0;
    
    EmergencyNumber() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getNumber() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getCountryIso() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getMnc() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Integer> getEmergencyServiceCategories() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getEmergencyUrns() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInEmergencyServiceCategories(final int categories) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Integer> getEmergencyNumberSources() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFromSources(final int sources) {
        throw new RuntimeException("Stub!");
    }
    
    public int getEmergencyCallRouting() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
    public int compareTo(@NonNull final EmergencyNumber emergencyNumber) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
