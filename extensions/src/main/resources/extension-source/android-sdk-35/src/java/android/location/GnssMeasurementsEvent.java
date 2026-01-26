package android.location;

import android.os.Parcel;
import java.util.Collection;
import android.os.Parcelable;

public final class GnssMeasurementsEvent implements Parcelable
{
    @NonNull
    public static final Creator<GnssMeasurementsEvent> CREATOR;
    
    GnssMeasurementsEvent() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public GnssClock getClock() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Collection<GnssMeasurement> getMeasurements() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Collection<GnssAutomaticGainControl> getGnssAutomaticGainControls() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFullTracking() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasIsFullTracking() {
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
        
        public Builder(@NonNull final GnssMeasurementsEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setClock(@NonNull final GnssClock clock) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMeasurements(@NonNull final Collection<GnssMeasurement> measurements) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setGnssAutomaticGainControls(@NonNull final Collection<GnssAutomaticGainControl> agcs) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIsFullTracking(final boolean isFullTracking) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearIsFullTracking() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public GnssMeasurementsEvent build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class Callback
    {
        @Deprecated
        public static final int STATUS_LOCATION_DISABLED = 2;
        @Deprecated
        public static final int STATUS_NOT_ALLOWED = 3;
        @Deprecated
        public static final int STATUS_NOT_SUPPORTED = 0;
        @Deprecated
        public static final int STATUS_READY = 1;
        
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onGnssMeasurementsReceived(final GnssMeasurementsEvent eventArgs) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onStatusChanged(final int status) {
            throw new RuntimeException("Stub!");
        }
    }
}
