package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public final class CellInfoWcdma extends CellInfo implements Parcelable
{
    @NonNull
    public static final Creator<CellInfoWcdma> CREATOR;
    
    CellInfoWcdma() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CellIdentityWcdma getCellIdentity() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CellSignalStrengthWcdma getCellSignalStrength() {
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
    public int describeContents() {
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
