package android.location;

import android.os.Parcel;
import android.os.Parcelable;

public final class LocationRequest implements Parcelable
{
    @NonNull
    public static final Creator<LocationRequest> CREATOR;
    public static final long PASSIVE_INTERVAL = Long.MAX_VALUE;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_LOW_POWER = 104;
    
    LocationRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public int getQuality() {
        throw new RuntimeException("Stub!");
    }
    
    public long getIntervalMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getDurationMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxUpdates() {
        throw new RuntimeException("Stub!");
    }
    
    public long getMinUpdateIntervalMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public float getMinUpdateDistanceMeters() {
        throw new RuntimeException("Stub!");
    }
    
    public long getMaxUpdateDelayMillis() {
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
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(final long intervalMillis) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final LocationRequest locationRequest) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIntervalMillis(final long intervalMillis) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setQuality(final int quality) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDurationMillis(final long durationMillis) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMaxUpdates(final int maxUpdates) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinUpdateIntervalMillis(final long minUpdateIntervalMillis) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearMinUpdateIntervalMillis() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinUpdateDistanceMeters(final float minUpdateDistanceMeters) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMaxUpdateDelayMillis(final long maxUpdateDelayMillis) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public LocationRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
