package android.net.wifi.rtt;

import android.net.Uri;
import android.util.SparseArray;
import android.location.Address;
import android.net.MacAddress;
import java.util.List;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

public final class ResponderLocation implements Parcelable
{
    public static final int ALTITUDE_FLOORS = 2;
    public static final int ALTITUDE_METERS = 1;
    public static final int ALTITUDE_UNDEFINED = 0;
    @NonNull
    public static final Creator<ResponderLocation> CREATOR;
    public static final int DATUM_NAD83_MLLW = 3;
    public static final int DATUM_NAD83_NAV88 = 2;
    public static final int DATUM_UNDEFINED = 0;
    public static final int DATUM_WGS84 = 1;
    public static final int LCI_VERSION_1 = 1;
    public static final int LOCATION_FIXED = 0;
    public static final int LOCATION_MOVEMENT_UNKNOWN = 2;
    public static final int LOCATION_RESERVED = 3;
    public static final int LOCATION_VARIABLE = 1;
    
    ResponderLocation() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
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
    
    public boolean isLciSubelementValid() {
        throw new RuntimeException("Stub!");
    }
    
    public double getLatitudeUncertainty() {
        throw new RuntimeException("Stub!");
    }
    
    public double getLatitude() {
        throw new RuntimeException("Stub!");
    }
    
    public double getLongitudeUncertainty() {
        throw new RuntimeException("Stub!");
    }
    
    public double getLongitude() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAltitudeType() {
        throw new RuntimeException("Stub!");
    }
    
    public double getAltitudeUncertainty() {
        throw new RuntimeException("Stub!");
    }
    
    public double getAltitude() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDatum() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getRegisteredLocationAgreementIndication() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLciVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Location toLocation() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isZaxisSubelementValid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getExpectedToMove() {
        throw new RuntimeException("Stub!");
    }
    
    public double getFloorNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public double getHeightAboveFloorMeters() {
        throw new RuntimeException("Stub!");
    }
    
    public double getHeightAboveFloorUncertaintyMeters() {
        throw new RuntimeException("Stub!");
    }
    
    public List<MacAddress> getColocatedBssids() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Address toCivicLocationAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SparseArray<String> toCivicLocationSparseArray() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getMapImageMimeType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getMapImageUri() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
