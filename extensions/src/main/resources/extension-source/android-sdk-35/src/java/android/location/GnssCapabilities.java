package android.location;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class GnssCapabilities implements Parcelable
{
    public static final int CAPABILITY_SUPPORTED = 1;
    public static final int CAPABILITY_UNKNOWN = 0;
    public static final int CAPABILITY_UNSUPPORTED = 2;
    @NonNull
    public static final Creator<GnssCapabilities> CREATOR;
    
    GnssCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasScheduling() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMsb() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMsa() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSingleShotFix() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasOnDemandTime() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasGeofencing() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMeasurements() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasNavigationMessages() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasLowPowerMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSatelliteBlocklist() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSatellitePvt() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMeasurementCorrections() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean hasGnssAntennaInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasAntennaInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMeasurementCorrelationVectors() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMeasurementCorrectionsForDriving() {
        throw new RuntimeException("Stub!");
    }
    
    public int hasAccumulatedDeltaRange() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMeasurementCorrectionsLosSats() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMeasurementCorrectionsExcessPathLength() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMeasurementCorrectionsReflectingPlane() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasPowerTotal() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasPowerSinglebandTracking() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasPowerMultibandTracking() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasPowerSinglebandAcquisition() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasPowerMultibandAcquisition() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasPowerOtherModes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<GnssSignalType> getGnssSignalTypes() {
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
    
    @Override
    public String toString() {
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
        
        public Builder(@NonNull final GnssCapabilities capabilities) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasScheduling(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasMsb(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasMsa(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasSingleShotFix(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasOnDemandTime(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasGeofencing(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasMeasurements(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasNavigationMessages(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasLowPowerMode(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasSatelliteBlocklist(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasSatellitePvt(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasMeasurementCorrections(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasAntennaInfo(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasMeasurementCorrelationVectors(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasMeasurementCorrectionsForDriving(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasAccumulatedDeltaRange(final int capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasMeasurementCorrectionsLosSats(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasMeasurementCorrectionsExcessPathLength(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasMeasurementCorrectionsReflectingPlane(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasPowerTotal(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasPowerSinglebandTracking(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasPowerMultibandTracking(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasPowerSinglebandAcquisition(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasPowerMultibandAcquisition(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasPowerOtherModes(final boolean capable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setGnssSignalTypes(@NonNull final List<GnssSignalType> gnssSignalTypes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public GnssCapabilities build() {
            throw new RuntimeException("Stub!");
        }
    }
}
