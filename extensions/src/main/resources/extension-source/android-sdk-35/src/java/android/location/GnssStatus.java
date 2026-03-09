package android.location;

import android.os.Parcel;
import android.os.Parcelable;

public final class GnssStatus implements Parcelable
{
    public static final int CONSTELLATION_BEIDOU = 5;
    public static final int CONSTELLATION_GALILEO = 6;
    public static final int CONSTELLATION_GLONASS = 3;
    public static final int CONSTELLATION_GPS = 1;
    public static final int CONSTELLATION_IRNSS = 7;
    public static final int CONSTELLATION_QZSS = 4;
    public static final int CONSTELLATION_SBAS = 2;
    public static final int CONSTELLATION_UNKNOWN = 0;
    @NonNull
    public static final Creator<GnssStatus> CREATOR;
    
    GnssStatus() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSatelliteCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConstellationType(final int satelliteIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSvid(final int satelliteIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getCn0DbHz(final int satelliteIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getElevationDegrees(final int satelliteIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getAzimuthDegrees(final int satelliteIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasEphemerisData(final int satelliteIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasAlmanacData(final int satelliteIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean usedInFix(final int satelliteIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasCarrierFrequencyHz(final int satelliteIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getCarrierFrequencyHz(final int satelliteIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasBasebandCn0DbHz(final int satelliteIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getBasebandCn0DbHz(final int satelliteIndex) {
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
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addSatellite(final int constellationType, final int svid, final float cn0DbHz, final float elevation, final float azimuth, final boolean hasEphemeris, final boolean hasAlmanac, final boolean usedInFix, final boolean hasCarrierFrequency, final float carrierFrequency, final boolean hasBasebandCn0DbHz, final float basebandCn0DbHz) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearSatellites() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public GnssStatus build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class Callback
    {
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onStarted() {
            throw new RuntimeException("Stub!");
        }
        
        public void onStopped() {
            throw new RuntimeException("Stub!");
        }
        
        public void onFirstFix(final int ttffMillis) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSatelliteStatusChanged(@NonNull final GnssStatus status) {
            throw new RuntimeException("Stub!");
        }
    }
}
