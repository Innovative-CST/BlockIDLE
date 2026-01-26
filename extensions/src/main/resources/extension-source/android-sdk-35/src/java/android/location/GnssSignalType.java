package android.location;

import android.os.Parcel;
import android.os.Parcelable;

public final class GnssSignalType implements Parcelable
{
    @NonNull
    public static final Creator<GnssSignalType> CREATOR;
    
    GnssSignalType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static GnssSignalType create(final int constellationType, final double carrierFrequencyHz, @NonNull final String codeType) {
        throw new RuntimeException("Stub!");
    }
    
    public int getConstellationType() {
        throw new RuntimeException("Stub!");
    }
    
    public double getCarrierFrequencyHz() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getCodeType() {
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
    public boolean equals(@Nullable final Object obj) {
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
}
