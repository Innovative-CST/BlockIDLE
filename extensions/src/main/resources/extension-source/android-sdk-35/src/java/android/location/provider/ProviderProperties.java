package android.location.provider;

import android.os.Parcel;
import android.os.Parcelable;

public final class ProviderProperties implements Parcelable
{
    public static final int ACCURACY_COARSE = 2;
    public static final int ACCURACY_FINE = 1;
    @NonNull
    public static final Creator<ProviderProperties> CREATOR;
    public static final int POWER_USAGE_HIGH = 3;
    public static final int POWER_USAGE_LOW = 1;
    public static final int POWER_USAGE_MEDIUM = 2;
    
    ProviderProperties() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasNetworkRequirement() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSatelliteRequirement() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasCellRequirement() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMonetaryCost() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasAltitudeSupport() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSpeedSupport() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasBearingSupport() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPowerUsage() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAccuracy() {
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
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final ProviderProperties providerProperties) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasNetworkRequirement(final boolean requiresNetwork) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasSatelliteRequirement(final boolean requiresSatellite) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasCellRequirement(final boolean requiresCell) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasMonetaryCost(final boolean monetaryCost) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasAltitudeSupport(final boolean supportsAltitude) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasSpeedSupport(final boolean supportsSpeed) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasBearingSupport(final boolean supportsBearing) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPowerUsage(final int powerUsage) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAccuracy(final int accuracy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ProviderProperties build() {
            throw new RuntimeException("Stub!");
        }
    }
}
