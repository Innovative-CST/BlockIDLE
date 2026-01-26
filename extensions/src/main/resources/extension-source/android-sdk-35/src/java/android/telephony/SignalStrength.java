package android.telephony;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public class SignalStrength implements Parcelable
{
    @NonNull
    public static final Creator<SignalStrength> CREATOR;
    public static final int INVALID = Integer.MAX_VALUE;
    
    public SignalStrength(@NonNull final SignalStrength s) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<CellSignalStrength> getCellSignalStrengths() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public <T extends CellSignalStrength> List<T> getCellSignalStrengths(@NonNull final Class<T> clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public long getTimestampMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getGsmSignalStrength() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getGsmBitErrorRate() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getCdmaDbm() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getCdmaEcio() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getEvdoDbm() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getEvdoEcio() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getEvdoSnr() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLevel() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isGsm() {
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
    
    static {
        CREATOR = null;
    }
}
