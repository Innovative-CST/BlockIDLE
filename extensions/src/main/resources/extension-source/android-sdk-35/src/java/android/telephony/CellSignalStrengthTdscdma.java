package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public final class CellSignalStrengthTdscdma extends CellSignalStrength implements Parcelable
{
    @NonNull
    public static final Creator<CellSignalStrengthTdscdma> CREATOR;
    
    CellSignalStrengthTdscdma() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getLevel() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getDbm() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRscp() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getAsuLevel() {
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
