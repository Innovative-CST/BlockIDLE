package android.location;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

public final class GnssAntennaInfo implements Parcelable
{
    @NonNull
    public static final Creator<GnssAntennaInfo> CREATOR;
    
    GnssAntennaInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public double getCarrierFrequencyMHz() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PhaseCenterOffset getPhaseCenterOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SphericalCorrections getPhaseCenterVariationCorrections() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SphericalCorrections getSignalGainCorrections() {
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
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class Builder
    {
        @Deprecated
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(final double carrierFrequencyMHz, @NonNull final PhaseCenterOffset phaseCenterOffset) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final GnssAntennaInfo antennaInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCarrierFrequencyMHz(final double carrierFrequencyMHz) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPhaseCenterOffset(@NonNull final PhaseCenterOffset phaseCenterOffset) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPhaseCenterVariationCorrections(@Nullable final SphericalCorrections phaseCenterVariationCorrections) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSignalGainCorrections(@Nullable final SphericalCorrections signalGainCorrections) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public GnssAntennaInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class PhaseCenterOffset implements Parcelable
    {
        @NonNull
        public static final Creator<PhaseCenterOffset> CREATOR;
        
        public PhaseCenterOffset(final double offsetXMm, final double offsetXUncertaintyMm, final double offsetYMm, final double offsetYUncertaintyMm, final double offsetZMm, final double offsetZUncertaintyMm) {
            throw new RuntimeException("Stub!");
        }
        
        public double getXOffsetMm() {
            throw new RuntimeException("Stub!");
        }
        
        public double getXOffsetUncertaintyMm() {
            throw new RuntimeException("Stub!");
        }
        
        public double getYOffsetMm() {
            throw new RuntimeException("Stub!");
        }
        
        public double getYOffsetUncertaintyMm() {
            throw new RuntimeException("Stub!");
        }
        
        public double getZOffsetMm() {
            throw new RuntimeException("Stub!");
        }
        
        public double getZOffsetUncertaintyMm() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(@NonNull final Parcel dest, final int flags) {
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
        
        static {
            CREATOR = null;
        }
    }
    
    public static final class SphericalCorrections implements Parcelable
    {
        @NonNull
        public static final Creator<SphericalCorrections> CREATOR;
        
        public SphericalCorrections(@NonNull final double[][] corrections, @NonNull final double[][] correctionUncertainties) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public double[][] getCorrectionsArray() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public double[][] getCorrectionUncertaintiesArray() {
            throw new RuntimeException("Stub!");
        }
        
        public double getDeltaTheta() {
            throw new RuntimeException("Stub!");
        }
        
        public double getDeltaPhi() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(@NonNull final Parcel dest, final int flags) {
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
        
        static {
            CREATOR = null;
        }
    }
    
    public interface Listener
    {
        void onGnssAntennaInfoReceived(@NonNull final List<GnssAntennaInfo> p0);
    }
}
