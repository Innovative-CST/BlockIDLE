package android.location;

import android.os.Parcel;
import android.os.Parcelable;

public final class GnssAutomaticGainControl implements Parcelable
{
    @NonNull
    public static final Creator<GnssAutomaticGainControl> CREATOR;
    
    GnssAutomaticGainControl() {
        throw new RuntimeException("Stub!");
    }
    
    public double getLevelDb() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConstellationType() {
        throw new RuntimeException("Stub!");
    }
    
    public long getCarrierFrequencyHz() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel parcel, final int flag) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final GnssAutomaticGainControl agc) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLevelDb(final double levelDb) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setConstellationType(final int constellationType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCarrierFrequencyHz(final long carrierFrequencyHz) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public GnssAutomaticGainControl build() {
            throw new RuntimeException("Stub!");
        }
    }
}
