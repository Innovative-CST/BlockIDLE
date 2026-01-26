package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public final class CellSignalStrengthLte extends CellSignalStrength implements Parcelable
{
    @NonNull
    public static final Creator<CellSignalStrengthLte> CREATOR;
    
    CellSignalStrengthLte() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRsrq() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRssi() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRssnr() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRsrp() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCqiTableIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCqi() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getDbm() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getAsuLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTimingAdvance() {
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
