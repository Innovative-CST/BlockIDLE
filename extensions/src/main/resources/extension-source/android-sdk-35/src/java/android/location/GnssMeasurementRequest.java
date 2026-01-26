package android.location;

import android.os.Parcel;
import android.os.Parcelable;

public final class GnssMeasurementRequest implements Parcelable
{
    @NonNull
    public static final Creator<GnssMeasurementRequest> CREATOR;
    public static final int PASSIVE_INTERVAL = Integer.MAX_VALUE;
    
    GnssMeasurementRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFullTracking() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIntervalMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel parcel, final int flags) {
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
    
    @Override
    public int describeContents() {
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
        
        public Builder(@NonNull final GnssMeasurementRequest request) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFullTracking(final boolean value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIntervalMillis(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public GnssMeasurementRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
