package android.location;

import android.os.Parcel;
import android.os.Parcelable;

public final class GnssClock implements Parcelable
{
    @NonNull
    public static final Creator<GnssClock> CREATOR;
    
    GnssClock() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasLeapSecond() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLeapSecond() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTimeNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasTimeUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public double getTimeUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasFullBiasNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public long getFullBiasNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasBiasNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public double getBiasNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasBiasUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public double getBiasUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasDriftNanosPerSecond() {
        throw new RuntimeException("Stub!");
    }
    
    public double getDriftNanosPerSecond() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasDriftUncertaintyNanosPerSecond() {
        throw new RuntimeException("Stub!");
    }
    
    public double getDriftUncertaintyNanosPerSecond() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasElapsedRealtimeNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public long getElapsedRealtimeNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasElapsedRealtimeUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public double getElapsedRealtimeUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasReferenceConstellationTypeForIsb() {
        throw new RuntimeException("Stub!");
    }
    
    public int getReferenceConstellationTypeForIsb() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasReferenceCarrierFrequencyHzForIsb() {
        throw new RuntimeException("Stub!");
    }
    
    public double getReferenceCarrierFrequencyHzForIsb() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasReferenceCodeTypeForIsb() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getReferenceCodeTypeForIsb() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHardwareClockDiscontinuityCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
