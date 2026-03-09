package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public final class SignalThresholdInfo implements Parcelable
{
    @NonNull
    public static final Creator<SignalThresholdInfo> CREATOR;
    public static final int SIGNAL_MEASUREMENT_TYPE_ECNO = 9;
    public static final int SIGNAL_MEASUREMENT_TYPE_RSCP = 2;
    public static final int SIGNAL_MEASUREMENT_TYPE_RSRP = 3;
    public static final int SIGNAL_MEASUREMENT_TYPE_RSRQ = 4;
    public static final int SIGNAL_MEASUREMENT_TYPE_RSSI = 1;
    public static final int SIGNAL_MEASUREMENT_TYPE_RSSNR = 5;
    public static final int SIGNAL_MEASUREMENT_TYPE_SSRSRP = 6;
    public static final int SIGNAL_MEASUREMENT_TYPE_SSRSRQ = 7;
    public static final int SIGNAL_MEASUREMENT_TYPE_SSSINR = 8;
    public static final int SIGNAL_MEASUREMENT_TYPE_UNKNOWN = 0;
    
    SignalThresholdInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRadioAccessNetworkType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSignalMeasurementType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHysteresisDb() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getThresholds() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMinimumNumberOfThresholdsAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaximumNumberOfThresholdsAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel out, final int flags) {
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
        
        @NonNull
        public Builder setRadioAccessNetworkType(final int ran) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSignalMeasurementType(final int signalMeasurementType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHysteresisDb(final int hysteresisDb) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setThresholds(@NonNull final int[] thresholds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SignalThresholdInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
