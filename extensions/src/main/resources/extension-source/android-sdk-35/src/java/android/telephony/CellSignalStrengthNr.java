package android.telephony;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class CellSignalStrengthNr extends CellSignalStrength implements Parcelable
{
    @NonNull
    public static final Creator<CellSignalStrengthNr> CREATOR;
    
    CellSignalStrengthNr() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSsRsrp() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSsRsrq() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSsSinr() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCsiRsrp() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCsiRsrq() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCsiSinr() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCsiCqiTableIndex() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Integer> getCsiCqiReport() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTimingAdvanceMicros() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
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
    
    @Override
    public int getDbm() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
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
