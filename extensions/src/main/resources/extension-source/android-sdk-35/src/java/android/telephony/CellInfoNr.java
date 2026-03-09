package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public final class CellInfoNr extends CellInfo
{
    @NonNull
    public static final Parcelable.Creator<CellInfoNr> CREATOR;
    
    CellInfoNr() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public CellIdentity getCellIdentity() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public CellSignalStrength getCellSignalStrength() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object other) {
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
    
    static {
        CREATOR = null;
    }
}
