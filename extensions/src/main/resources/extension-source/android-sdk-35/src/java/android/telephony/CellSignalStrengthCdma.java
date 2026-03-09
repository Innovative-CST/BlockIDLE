package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public final class CellSignalStrengthCdma extends CellSignalStrength implements Parcelable
{
    @NonNull
    public static final Creator<CellSignalStrengthCdma> CREATOR;
    
    CellSignalStrengthCdma() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getLevel() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getAsuLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCdmaLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEvdoLevel() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getDbm() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCdmaDbm() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCdmaEcio() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEvdoDbm() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEvdoEcio() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEvdoSnr() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
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
